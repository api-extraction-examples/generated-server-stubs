package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RoleDetailRoleLastUsed
 */

@JsonTypeName("RoleDetail_RoleLastUsed")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class RoleDetailRoleLastUsed {

  private OffsetDateTime lastUsedDate;

  private String region;

  public RoleDetailRoleLastUsed lastUsedDate(OffsetDateTime lastUsedDate) {
    this.lastUsedDate = lastUsedDate;
    return this;
  }

  /**
   * Get lastUsedDate
   * @return lastUsedDate
  */
  @Valid 
  @Schema(name = "LastUsedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastUsedDate")
  public OffsetDateTime getLastUsedDate() {
    return lastUsedDate;
  }

  public void setLastUsedDate(OffsetDateTime lastUsedDate) {
    this.lastUsedDate = lastUsedDate;
  }

  public RoleDetailRoleLastUsed region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
  
  @Schema(name = "Region", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleDetailRoleLastUsed roleDetailRoleLastUsed = (RoleDetailRoleLastUsed) o;
    return Objects.equals(this.lastUsedDate, roleDetailRoleLastUsed.lastUsedDate) &&
        Objects.equals(this.region, roleDetailRoleLastUsed.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUsedDate, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleDetailRoleLastUsed {\n");
    sb.append("    lastUsedDate: ").append(toIndentedString(lastUsedDate)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

