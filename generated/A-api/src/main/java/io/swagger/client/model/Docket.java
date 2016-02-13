package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-13T13:42:23.533+01:00")
public class Docket {

    private DocumentationType documentationType = null;
    private Boolean enabled = null;
    private String groupName = null;


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("documentationType")
    public DocumentationType getDocumentationType() {
        return documentationType;
    }

    public void setDocumentationType(DocumentationType documentationType) {
        this.documentationType = documentationType;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("groupName")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Docket docket = (Docket) o;
        return Objects.equals(documentationType, docket.documentationType) &&
                Objects.equals(enabled, docket.enabled) &&
                Objects.equals(groupName, docket.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentationType, enabled, groupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Docket {\n");

        sb.append("    documentationType: ").append(toIndentedString(documentationType)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

