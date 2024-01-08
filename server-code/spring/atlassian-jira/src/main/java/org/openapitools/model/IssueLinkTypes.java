package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IssueLinkType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of issue link type beans.
 */

@Schema(name = "IssueLinkTypes", description = "A list of issue link type beans.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueLinkTypes {

  @Valid
  private List<@Valid IssueLinkType> issueLinkTypes;

  public IssueLinkTypes issueLinkTypes(List<@Valid IssueLinkType> issueLinkTypes) {
    this.issueLinkTypes = issueLinkTypes;
    return this;
  }

  public IssueLinkTypes addIssueLinkTypesItem(IssueLinkType issueLinkTypesItem) {
    if (this.issueLinkTypes == null) {
      this.issueLinkTypes = new ArrayList<>();
    }
    this.issueLinkTypes.add(issueLinkTypesItem);
    return this;
  }

  /**
   * The issue link type bean.
   * @return issueLinkTypes
  */
  @Valid 
  @Schema(name = "issueLinkTypes", accessMode = Schema.AccessMode.READ_ONLY, description = "The issue link type bean.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueLinkTypes")
  public List<@Valid IssueLinkType> getIssueLinkTypes() {
    return issueLinkTypes;
  }

  public void setIssueLinkTypes(List<@Valid IssueLinkType> issueLinkTypes) {
    this.issueLinkTypes = issueLinkTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLinkTypes issueLinkTypes = (IssueLinkTypes) o;
    return Objects.equals(this.issueLinkTypes, issueLinkTypes.issueLinkTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueLinkTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLinkTypes {\n");
    sb.append("    issueLinkTypes: ").append(toIndentedString(issueLinkTypes)).append("\n");
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

