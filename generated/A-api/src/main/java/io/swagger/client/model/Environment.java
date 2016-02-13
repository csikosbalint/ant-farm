package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-13T13:42:23.533+01:00")
public class Environment {

    private List<String> activeProfiles = new ArrayList<String>();
    private List<String> defaultProfiles = new ArrayList<String>();


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("activeProfiles")
    public List<String> getActiveProfiles() {
        return activeProfiles;
    }

    public void setActiveProfiles(List<String> activeProfiles) {
        this.activeProfiles = activeProfiles;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("defaultProfiles")
    public List<String> getDefaultProfiles() {
        return defaultProfiles;
    }

    public void setDefaultProfiles(List<String> defaultProfiles) {
        this.defaultProfiles = defaultProfiles;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Environment environment = (Environment) o;
        return Objects.equals(activeProfiles, environment.activeProfiles) &&
                Objects.equals(defaultProfiles, environment.defaultProfiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeProfiles, defaultProfiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Environment {\n");

        sb.append("    activeProfiles: ").append(toIndentedString(activeProfiles)).append("\n");
        sb.append("    defaultProfiles: ").append(toIndentedString(defaultProfiles)).append("\n");
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

