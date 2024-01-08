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
 * GetAccessKeyLastUsedResponseAccessKeyLastUsed
 */

@JsonTypeName("GetAccessKeyLastUsedResponse_AccessKeyLastUsed")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetAccessKeyLastUsedResponseAccessKeyLastUsed {

  private OffsetDateTime lastUsedDate;

  private String serviceName;

  private String region;

  public GetAccessKeyLastUsedResponseAccessKeyLastUsed() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetAccessKeyLastUsedResponseAccessKeyLastUsed(OffsetDateTime lastUsedDate, String serviceName, String region) {
    this.lastUsedDate = lastUsedDate;
    this.serviceName = serviceName;
    this.region = region;
  }

  public GetAccessKeyLastUsedResponseAccessKeyLastUsed lastUsedDate(OffsetDateTime lastUsedDate) {
    this.lastUsedDate = lastUsedDate;
    return this;
  }

  /**
   * Get lastUsedDate
   * @return lastUsedDate
  */
  @NotNull @Valid 
  @Schema(name = "LastUsedDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LastUsedDate")
  public OffsetDateTime getLastUsedDate() {
    return lastUsedDate;
  }

  public void setLastUsedDate(OffsetDateTime lastUsedDate) {
    this.lastUsedDate = lastUsedDate;
  }

  public GetAccessKeyLastUsedResponseAccessKeyLastUsed serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
  @NotNull 
  @Schema(name = "ServiceName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServiceName")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public GetAccessKeyLastUsedResponseAccessKeyLastUsed region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
  @NotNull 
  @Schema(name = "Region", requiredMode = Schema.RequiredMode.REQUIRED)
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
    GetAccessKeyLastUsedResponseAccessKeyLastUsed getAccessKeyLastUsedResponseAccessKeyLastUsed = (GetAccessKeyLastUsedResponseAccessKeyLastUsed) o;
    return Objects.equals(this.lastUsedDate, getAccessKeyLastUsedResponseAccessKeyLastUsed.lastUsedDate) &&
        Objects.equals(this.serviceName, getAccessKeyLastUsedResponseAccessKeyLastUsed.serviceName) &&
        Objects.equals(this.region, getAccessKeyLastUsedResponseAccessKeyLastUsed.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUsedDate, serviceName, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccessKeyLastUsedResponseAccessKeyLastUsed {\n");
    sb.append("    lastUsedDate: ").append(toIndentedString(lastUsedDate)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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

