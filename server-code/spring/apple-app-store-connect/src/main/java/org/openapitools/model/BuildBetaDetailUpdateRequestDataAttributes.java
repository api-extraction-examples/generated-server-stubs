package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildBetaDetailUpdateRequestDataAttributes
 */

@JsonTypeName("BuildBetaDetailUpdateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BuildBetaDetailUpdateRequestDataAttributes {

  private Boolean autoNotifyEnabled;

  public BuildBetaDetailUpdateRequestDataAttributes autoNotifyEnabled(Boolean autoNotifyEnabled) {
    this.autoNotifyEnabled = autoNotifyEnabled;
    return this;
  }

  /**
   * Get autoNotifyEnabled
   * @return autoNotifyEnabled
  */
  
  @Schema(name = "autoNotifyEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoNotifyEnabled")
  public Boolean getAutoNotifyEnabled() {
    return autoNotifyEnabled;
  }

  public void setAutoNotifyEnabled(Boolean autoNotifyEnabled) {
    this.autoNotifyEnabled = autoNotifyEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildBetaDetailUpdateRequestDataAttributes buildBetaDetailUpdateRequestDataAttributes = (BuildBetaDetailUpdateRequestDataAttributes) o;
    return Objects.equals(this.autoNotifyEnabled, buildBetaDetailUpdateRequestDataAttributes.autoNotifyEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoNotifyEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildBetaDetailUpdateRequestDataAttributes {\n");
    sb.append("    autoNotifyEnabled: ").append(toIndentedString(autoNotifyEnabled)).append("\n");
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

