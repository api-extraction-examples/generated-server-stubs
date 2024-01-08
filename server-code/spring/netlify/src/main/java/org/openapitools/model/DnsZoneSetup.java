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
 * DnsZoneSetup
 */

@JsonTypeName("dnsZoneSetup")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class DnsZoneSetup {

  private String accountSlug;

  private String name;

  private String siteId;

  public DnsZoneSetup accountSlug(String accountSlug) {
    this.accountSlug = accountSlug;
    return this;
  }

  /**
   * Get accountSlug
   * @return accountSlug
  */
  
  @Schema(name = "account_slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account_slug")
  public String getAccountSlug() {
    return accountSlug;
  }

  public void setAccountSlug(String accountSlug) {
    this.accountSlug = accountSlug;
  }

  public DnsZoneSetup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DnsZoneSetup siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId
   * @return siteId
  */
  
  @Schema(name = "site_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("site_id")
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsZoneSetup dnsZoneSetup = (DnsZoneSetup) o;
    return Objects.equals(this.accountSlug, dnsZoneSetup.accountSlug) &&
        Objects.equals(this.name, dnsZoneSetup.name) &&
        Objects.equals(this.siteId, dnsZoneSetup.siteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSlug, name, siteId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsZoneSetup {\n");
    sb.append("    accountSlug: ").append(toIndentedString(accountSlug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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

