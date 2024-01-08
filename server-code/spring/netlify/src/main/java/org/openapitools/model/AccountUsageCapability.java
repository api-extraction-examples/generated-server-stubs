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
 * AccountUsageCapability
 */

@JsonTypeName("accountUsageCapability")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class AccountUsageCapability {

  private Integer included;

  private Integer used;

  public AccountUsageCapability included(Integer included) {
    this.included = included;
    return this;
  }

  /**
   * Get included
   * @return included
  */
  
  @Schema(name = "included", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("included")
  public Integer getIncluded() {
    return included;
  }

  public void setIncluded(Integer included) {
    this.included = included;
  }

  public AccountUsageCapability used(Integer used) {
    this.used = used;
    return this;
  }

  /**
   * Get used
   * @return used
  */
  
  @Schema(name = "used", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("used")
  public Integer getUsed() {
    return used;
  }

  public void setUsed(Integer used) {
    this.used = used;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUsageCapability accountUsageCapability = (AccountUsageCapability) o;
    return Objects.equals(this.included, accountUsageCapability.included) &&
        Objects.equals(this.used, accountUsageCapability.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(included, used);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUsageCapability {\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

