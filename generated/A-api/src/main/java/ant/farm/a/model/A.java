package ant.farm.a.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-13T13:42:23.533+01:00")
public class A {

    private Docket api = null;
    private ApplicationContext applicationContext = null;


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("api")
    public Docket getApi() {
        return api;
    }

    public void setApi(Docket api) {
        this.api = api;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("applicationContext")
    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        A A = (A) o;
        return Objects.equals(api, A.api) &&
                Objects.equals(applicationContext, A.applicationContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(api, applicationContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class A {\n");

        sb.append("    api: ").append(toIndentedString(api)).append("\n");
        sb.append("    applicationContext: ").append(toIndentedString(applicationContext)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

