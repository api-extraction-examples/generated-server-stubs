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
 * DnsRecord
 */

@JsonTypeName("dnsRecord")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class DnsRecord {

  private String dnsZoneId;

  private Integer flag;

  private String hostname;

  private String id;

  private Boolean managed;

  private Long priority;

  private String siteId;

  private String tag;

  private Long ttl;

  private String type;

  private String value;

  public DnsRecord dnsZoneId(String dnsZoneId) {
    this.dnsZoneId = dnsZoneId;
    return this;
  }

  /**
   * Get dnsZoneId
   * @return dnsZoneId
  */
  
  @Schema(name = "dns_zone_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dns_zone_id")
  public String getDnsZoneId() {
    return dnsZoneId;
  }

  public void setDnsZoneId(String dnsZoneId) {
    this.dnsZoneId = dnsZoneId;
  }

  public DnsRecord flag(Integer flag) {
    this.flag = flag;
    return this;
  }

  /**
   * Get flag
   * @return flag
  */
  
  @Schema(name = "flag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flag")
  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public DnsRecord hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Get hostname
   * @return hostname
  */
  
  @Schema(name = "hostname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public DnsRecord id(String id) {
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

  public DnsRecord managed(Boolean managed) {
    this.managed = managed;
    return this;
  }

  /**
   * Get managed
   * @return managed
  */
  
  @Schema(name = "managed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("managed")
  public Boolean getManaged() {
    return managed;
  }

  public void setManaged(Boolean managed) {
    this.managed = managed;
  }

  public DnsRecord priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
  
  @Schema(name = "priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public DnsRecord siteId(String siteId) {
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

  public DnsRecord tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
  */
  
  @Schema(name = "tag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public DnsRecord ttl(Long ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Get ttl
   * @return ttl
  */
  
  @Schema(name = "ttl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ttl")
  public Long getTtl() {
    return ttl;
  }

  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }

  public DnsRecord type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DnsRecord value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRecord dnsRecord = (DnsRecord) o;
    return Objects.equals(this.dnsZoneId, dnsRecord.dnsZoneId) &&
        Objects.equals(this.flag, dnsRecord.flag) &&
        Objects.equals(this.hostname, dnsRecord.hostname) &&
        Objects.equals(this.id, dnsRecord.id) &&
        Objects.equals(this.managed, dnsRecord.managed) &&
        Objects.equals(this.priority, dnsRecord.priority) &&
        Objects.equals(this.siteId, dnsRecord.siteId) &&
        Objects.equals(this.tag, dnsRecord.tag) &&
        Objects.equals(this.ttl, dnsRecord.ttl) &&
        Objects.equals(this.type, dnsRecord.type) &&
        Objects.equals(this.value, dnsRecord.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsZoneId, flag, hostname, id, managed, priority, siteId, tag, ttl, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRecord {\n");
    sb.append("    dnsZoneId: ").append(toIndentedString(dnsZoneId)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

