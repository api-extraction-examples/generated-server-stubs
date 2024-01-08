package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Links;
import org.openapitools.model.UserTargetingExpirationResourceIdForFlag;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserTargetingExpirationForSegment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class UserTargetingExpirationForSegment {

  private String id;

  private Links links;

  private UserTargetingExpirationResourceIdForFlag resourceId;

  private Integer version;

  private Long expirationDate;

  private String targetType;

  private String userKey;

  public UserTargetingExpirationForSegment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserTargetingExpirationForSegment links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public UserTargetingExpirationForSegment resourceId(UserTargetingExpirationResourceIdForFlag resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
  */
  @Valid 
  @Schema(name = "_resourceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_resourceId")
  public UserTargetingExpirationResourceIdForFlag getResourceId() {
    return resourceId;
  }

  public void setResourceId(UserTargetingExpirationResourceIdForFlag resourceId) {
    this.resourceId = resourceId;
  }

  public UserTargetingExpirationForSegment version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "_version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public UserTargetingExpirationForSegment expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Unix epoch time in milliseconds specifying the expiration date
   * @return expirationDate
  */
  
  @Schema(name = "expirationDate", example = "1735689600000", description = "Unix epoch time in milliseconds specifying the expiration date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public Long getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  public UserTargetingExpirationForSegment targetType(String targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * either the included or excluded variation that the user is targeted on a segment
   * @return targetType
  */
  
  @Schema(name = "targetType", description = "either the included or excluded variation that the user is targeted on a segment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetType")
  public String getTargetType() {
    return targetType;
  }

  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }

  public UserTargetingExpirationForSegment userKey(String userKey) {
    this.userKey = userKey;
    return this;
  }

  /**
   * Unique identifier for the user
   * @return userKey
  */
  
  @Schema(name = "userKey", description = "Unique identifier for the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userKey")
  public String getUserKey() {
    return userKey;
  }

  public void setUserKey(String userKey) {
    this.userKey = userKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTargetingExpirationForSegment userTargetingExpirationForSegment = (UserTargetingExpirationForSegment) o;
    return Objects.equals(this.id, userTargetingExpirationForSegment.id) &&
        Objects.equals(this.links, userTargetingExpirationForSegment.links) &&
        Objects.equals(this.resourceId, userTargetingExpirationForSegment.resourceId) &&
        Objects.equals(this.version, userTargetingExpirationForSegment.version) &&
        Objects.equals(this.expirationDate, userTargetingExpirationForSegment.expirationDate) &&
        Objects.equals(this.targetType, userTargetingExpirationForSegment.targetType) &&
        Objects.equals(this.userKey, userTargetingExpirationForSegment.userKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, resourceId, version, expirationDate, targetType, userKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTargetingExpirationForSegment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    userKey: ").append(toIndentedString(userKey)).append("\n");
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

