package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DnsRecord;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DnsZone
 */

@JsonTypeName("dnsZone")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class DnsZone {

  private String accountId;

  private String accountName;

  private String accountSlug;

  private String createdAt;

  private Boolean dedicated;

  @Valid
  private List<String> dnsServers;

  private String domain;

  @Valid
  private List<String> errors;

  private String id;

  private Boolean ipv6Enabled;

  private String name;

  @Valid
  private List<@Valid DnsRecord> records;

  private String siteId;

  @Valid
  private List<String> supportedRecordTypes;

  private String updatedAt;

  private String userId;

  public DnsZone accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  */
  
  @Schema(name = "account_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account_id")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DnsZone accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
  */
  
  @Schema(name = "account_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account_name")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public DnsZone accountSlug(String accountSlug) {
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

  public DnsZone createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DnsZone dedicated(Boolean dedicated) {
    this.dedicated = dedicated;
    return this;
  }

  /**
   * Get dedicated
   * @return dedicated
  */
  
  @Schema(name = "dedicated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dedicated")
  public Boolean getDedicated() {
    return dedicated;
  }

  public void setDedicated(Boolean dedicated) {
    this.dedicated = dedicated;
  }

  public DnsZone dnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
    return this;
  }

  public DnsZone addDnsServersItem(String dnsServersItem) {
    if (this.dnsServers == null) {
      this.dnsServers = new ArrayList<>();
    }
    this.dnsServers.add(dnsServersItem);
    return this;
  }

  /**
   * Get dnsServers
   * @return dnsServers
  */
  
  @Schema(name = "dns_servers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dns_servers")
  public List<String> getDnsServers() {
    return dnsServers;
  }

  public void setDnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
  }

  public DnsZone domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
  */
  
  @Schema(name = "domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DnsZone errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public DnsZone addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public DnsZone id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DnsZone ipv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }

  /**
   * Get ipv6Enabled
   * @return ipv6Enabled
  */
  
  @Schema(name = "ipv6_enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ipv6_enabled")
  public Boolean getIpv6Enabled() {
    return ipv6Enabled;
  }

  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }

  public DnsZone name(String name) {
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

  public DnsZone records(List<@Valid DnsRecord> records) {
    this.records = records;
    return this;
  }

  public DnsZone addRecordsItem(DnsRecord recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

  /**
   * Get records
   * @return records
  */
  @Valid 
  @Schema(name = "records", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("records")
  public List<@Valid DnsRecord> getRecords() {
    return records;
  }

  public void setRecords(List<@Valid DnsRecord> records) {
    this.records = records;
  }

  public DnsZone siteId(String siteId) {
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

  public DnsZone supportedRecordTypes(List<String> supportedRecordTypes) {
    this.supportedRecordTypes = supportedRecordTypes;
    return this;
  }

  public DnsZone addSupportedRecordTypesItem(String supportedRecordTypesItem) {
    if (this.supportedRecordTypes == null) {
      this.supportedRecordTypes = new ArrayList<>();
    }
    this.supportedRecordTypes.add(supportedRecordTypesItem);
    return this;
  }

  /**
   * Get supportedRecordTypes
   * @return supportedRecordTypes
  */
  
  @Schema(name = "supported_record_types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supported_record_types")
  public List<String> getSupportedRecordTypes() {
    return supportedRecordTypes;
  }

  public void setSupportedRecordTypes(List<String> supportedRecordTypes) {
    this.supportedRecordTypes = supportedRecordTypes;
  }

  public DnsZone updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  
  @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public DnsZone userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "user_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsZone dnsZone = (DnsZone) o;
    return Objects.equals(this.accountId, dnsZone.accountId) &&
        Objects.equals(this.accountName, dnsZone.accountName) &&
        Objects.equals(this.accountSlug, dnsZone.accountSlug) &&
        Objects.equals(this.createdAt, dnsZone.createdAt) &&
        Objects.equals(this.dedicated, dnsZone.dedicated) &&
        Objects.equals(this.dnsServers, dnsZone.dnsServers) &&
        Objects.equals(this.domain, dnsZone.domain) &&
        Objects.equals(this.errors, dnsZone.errors) &&
        Objects.equals(this.id, dnsZone.id) &&
        Objects.equals(this.ipv6Enabled, dnsZone.ipv6Enabled) &&
        Objects.equals(this.name, dnsZone.name) &&
        Objects.equals(this.records, dnsZone.records) &&
        Objects.equals(this.siteId, dnsZone.siteId) &&
        Objects.equals(this.supportedRecordTypes, dnsZone.supportedRecordTypes) &&
        Objects.equals(this.updatedAt, dnsZone.updatedAt) &&
        Objects.equals(this.userId, dnsZone.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountSlug, createdAt, dedicated, dnsServers, domain, errors, id, ipv6Enabled, name, records, siteId, supportedRecordTypes, updatedAt, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsZone {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountSlug: ").append(toIndentedString(accountSlug)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dedicated: ").append(toIndentedString(dedicated)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    supportedRecordTypes: ").append(toIndentedString(supportedRecordTypes)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

