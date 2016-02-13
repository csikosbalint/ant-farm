package ant.farm;

import ant.farm.b.module.MB;
import ant.farm.b.module.impl.MBImpl;
import ant.farm.x.module.MX;
import ant.farm.x.module.impl.MXImpl;
import com.fasterxml.classmate.TypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;

import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.schema.AlternateTypeRules.newRule;

@SpringBootApplication
@EnableSwagger2
@ComponentScan
public class B {
    public static final String ROOT = "/";
    @Autowired
    public ApplicationContext applicationContext;
    @Autowired
    private TypeResolver typeResolver;

    public static void main(String[] args) {
        SpringApplication.run(B.class);
    }

    @Bean
    public Docket getApi() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any()).paths(input -> !input.contains("error")).build().pathMapping(ROOT)
                .directModelSubstitute(LocalDate.class, String.class).genericModelSubstitutes(ResponseEntity.class)
                .alternateTypeRules(newRule(typeResolver.resolve(DeferredResult.class, typeResolver.resolve(ResponseEntity.class, WildcardType.class)), typeResolver.resolve(WildcardType.class)))
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET, newArrayList(new ResponseMessageBuilder().code(500).message("500 message").responseModel(new ModelRef("Error")).build()));
    }

    @Bean
    public MB mb() {
        return new MBImpl();
    }

    @Bean
    public MX mx() {
        return new MXImpl();
    }
}
