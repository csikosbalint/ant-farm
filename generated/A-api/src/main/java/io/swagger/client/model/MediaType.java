package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-13T13:42:23.533+01:00")
public class MediaType {

    private Charset charSet = null;
    private Boolean concrete = null;
    private Map<String, String> parameters = new HashMap<String, String>();
    private Double qualityValue = null;
    private String subtype = null;
    private String type = null;
    private Boolean wildcardSubtype = null;
    private Boolean wildcardType = null;


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("charSet")
    public Charset getCharSet() {
        return charSet;
    }

    public void setCharSet(Charset charSet) {
        this.charSet = charSet;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("concrete")
    public Boolean getConcrete() {
        return concrete;
    }

    public void setConcrete(Boolean concrete) {
        this.concrete = concrete;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("parameters")
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("qualityValue")
    public Double getQualityValue() {
        return qualityValue;
    }

    public void setQualityValue(Double qualityValue) {
        this.qualityValue = qualityValue;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("subtype")
    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("wildcardSubtype")
    public Boolean getWildcardSubtype() {
        return wildcardSubtype;
    }

    public void setWildcardSubtype(Boolean wildcardSubtype) {
        this.wildcardSubtype = wildcardSubtype;
    }


    /**
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("wildcardType")
    public Boolean getWildcardType() {
        return wildcardType;
    }

    public void setWildcardType(Boolean wildcardType) {
        this.wildcardType = wildcardType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MediaType mediaType = (MediaType) o;
        return Objects.equals(charSet, mediaType.charSet) &&
                Objects.equals(concrete, mediaType.concrete) &&
                Objects.equals(parameters, mediaType.parameters) &&
                Objects.equals(qualityValue, mediaType.qualityValue) &&
                Objects.equals(subtype, mediaType.subtype) &&
                Objects.equals(type, mediaType.type) &&
                Objects.equals(wildcardSubtype, mediaType.wildcardSubtype) &&
                Objects.equals(wildcardType, mediaType.wildcardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(charSet, concrete, parameters, qualityValue, subtype, type, wildcardSubtype, wildcardType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MediaType {\n");

        sb.append("    charSet: ").append(toIndentedString(charSet)).append("\n");
        sb.append("    concrete: ").append(toIndentedString(concrete)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    qualityValue: ").append(toIndentedString(qualityValue)).append("\n");
        sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    wildcardSubtype: ").append(toIndentedString(wildcardSubtype)).append("\n");
        sb.append("    wildcardType: ").append(toIndentedString(wildcardType)).append("\n");
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

