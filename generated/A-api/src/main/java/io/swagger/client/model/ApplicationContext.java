package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-13T13:42:23.533+01:00")
public class ApplicationContext {

    private String applicationName = null;
    private AutowireCapableBeanFactory autowireCapableBeanFactory = null;
    private Integer beanDefinitionCount = null;
    private List<String> beanDefinitionNames = new ArrayList<String>();
    private ClassLoader classLoader = null;
    private String displayName = null;
    private Environment environment = null;
    private String id = null;
    private BeanFactory parentBeanFactory = null;
    private Long startupDate = null;


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("applicationName")
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("autowireCapableBeanFactory")
    public AutowireCapableBeanFactory getAutowireCapableBeanFactory() {
        return autowireCapableBeanFactory;
    }

    public void setAutowireCapableBeanFactory(AutowireCapableBeanFactory autowireCapableBeanFactory) {
        this.autowireCapableBeanFactory = autowireCapableBeanFactory;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("beanDefinitionCount")
    public Integer getBeanDefinitionCount() {
        return beanDefinitionCount;
    }

    public void setBeanDefinitionCount(Integer beanDefinitionCount) {
        this.beanDefinitionCount = beanDefinitionCount;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("beanDefinitionNames")
    public List<String> getBeanDefinitionNames() {
        return beanDefinitionNames;
    }

    public void setBeanDefinitionNames(List<String> beanDefinitionNames) {
        this.beanDefinitionNames = beanDefinitionNames;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("classLoader")
    public ClassLoader getClassLoader() {
        return classLoader;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("environment")
    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("parentBeanFactory")
    public BeanFactory getParentBeanFactory() {
        return parentBeanFactory;
    }

    public void setParentBeanFactory(BeanFactory parentBeanFactory) {
        this.parentBeanFactory = parentBeanFactory;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("startupDate")
    public Long getStartupDate() {
        return startupDate;
    }

    public void setStartupDate(Long startupDate) {
        this.startupDate = startupDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationContext applicationContext = (ApplicationContext) o;
        return Objects.equals(applicationName, applicationContext.applicationName) &&
                Objects.equals(autowireCapableBeanFactory, applicationContext.autowireCapableBeanFactory) &&
                Objects.equals(beanDefinitionCount, applicationContext.beanDefinitionCount) &&
                Objects.equals(beanDefinitionNames, applicationContext.beanDefinitionNames) &&
                Objects.equals(classLoader, applicationContext.classLoader) &&
                Objects.equals(displayName, applicationContext.displayName) &&
                Objects.equals(environment, applicationContext.environment) &&
                Objects.equals(id, applicationContext.id) &&
                Objects.equals(parentBeanFactory, applicationContext.parentBeanFactory) &&
                Objects.equals(startupDate, applicationContext.startupDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationName, autowireCapableBeanFactory, beanDefinitionCount, beanDefinitionNames, classLoader, displayName, environment, id, parentBeanFactory, startupDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationContext {\n");

        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    autowireCapableBeanFactory: ").append(toIndentedString(autowireCapableBeanFactory)).append("\n");
        sb.append("    beanDefinitionCount: ").append(toIndentedString(beanDefinitionCount)).append("\n");
        sb.append("    beanDefinitionNames: ").append(toIndentedString(beanDefinitionNames)).append("\n");
        sb.append("    classLoader: ").append(toIndentedString(classLoader)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentBeanFactory: ").append(toIndentedString(parentBeanFactory)).append("\n");
        sb.append("    startupDate: ").append(toIndentedString(startupDate)).append("\n");
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

