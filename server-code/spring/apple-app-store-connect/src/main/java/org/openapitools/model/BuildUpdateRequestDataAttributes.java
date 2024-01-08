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
 * BuildUpdateRequestDataAttributes
 */

@JsonTypeName("BuildUpdateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BuildUpdateRequestDataAttributes {

  private Boolean expired;

  private Boolean usesNonExemptEncryption;

  public BuildUpdateRequestDataAttributes expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

  /**
   * Get expired
   * @return expired
  */
  
  @Schema(name = "expired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expired")
  public Boolean getExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public BuildUpdateRequestDataAttributes usesNonExemptEncryption(Boolean usesNonExemptEncryption) {
    this.usesNonExemptEncryption = usesNonExemptEncryption;
    return this;
  }

  /**
   * Get usesNonExemptEncryption
   * @return usesNonExemptEncryption
  */
  
  @Schema(name = "usesNonExemptEncryption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usesNonExemptEncryption")
  public Boolean getUsesNonExemptEncryption() {
    return usesNonExemptEncryption;
  }

  public void setUsesNonExemptEncryption(Boolean usesNonExemptEncryption) {
    this.usesNonExemptEncryption = usesNonExemptEncryption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildUpdateRequestDataAttributes buildUpdateRequestDataAttributes = (BuildUpdateRequestDataAttributes) o;
    return Objects.equals(this.expired, buildUpdateRequestDataAttributes.expired) &&
        Objects.equals(this.usesNonExemptEncryption, buildUpdateRequestDataAttributes.usesNonExemptEncryption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expired, usesNonExemptEncryption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildUpdateRequestDataAttributes {\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    usesNonExemptEncryption: ").append(toIndentedString(usesNonExemptEncryption)).append("\n");
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

