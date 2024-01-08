package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LinkGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Details of the operations that can be performed on the issue.
 */

@Schema(name = "Operations", description = "Details of the operations that can be performed on the issue.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Operations {

  @Valid
  private List<@Valid LinkGroup> linkGroups;

  public Operations linkGroups(List<@Valid LinkGroup> linkGroups) {
    this.linkGroups = linkGroups;
    return this;
  }

  public Operations addLinkGroupsItem(LinkGroup linkGroupsItem) {
    if (this.linkGroups == null) {
      this.linkGroups = new ArrayList<>();
    }
    this.linkGroups.add(linkGroupsItem);
    return this;
  }

  /**
   * Details of the link groups defining issue operations.
   * @return linkGroups
  */
  @Valid 
  @Schema(name = "linkGroups", accessMode = Schema.AccessMode.READ_ONLY, description = "Details of the link groups defining issue operations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkGroups")
  public List<@Valid LinkGroup> getLinkGroups() {
    return linkGroups;
  }

  public void setLinkGroups(List<@Valid LinkGroup> linkGroups) {
    this.linkGroups = linkGroups;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public Operations putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operations operations = (Operations) o;
    return Objects.equals(this.linkGroups, operations.linkGroups) &&
    Objects.equals(this.additionalProperties, operations.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkGroups, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operations {\n");
    sb.append("    linkGroups: ").append(toIndentedString(linkGroups)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

