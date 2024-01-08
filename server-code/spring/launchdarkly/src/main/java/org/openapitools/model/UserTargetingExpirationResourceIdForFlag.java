package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserTargetingExpirationResourceIdForFlag
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class UserTargetingExpirationResourceIdForFlag {

  private String environmentKey;

  private String flagKey;

  private String key;

  private String kind;

  private String projectKey;

  public UserTargetingExpirationResourceIdForFlag environmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
    return this;
  }

  /**
   * Get environmentKey
   * @return environmentKey
  */
  
  @Schema(name = "environmentKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environmentKey")
  public String getEnvironmentKey() {
    return environmentKey;
  }

  public void setEnvironmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
  }

  public UserTargetingExpirationResourceIdForFlag flagKey(String flagKey) {
    this.flagKey = flagKey;
    return this;
  }

  /**
   * Get flagKey
   * @return flagKey
  */
  
  @Schema(name = "flagKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagKey")
  public String getFlagKey() {
    return flagKey;
  }

  public void setFlagKey(String flagKey) {
    this.flagKey = flagKey;
  }

  public UserTargetingExpirationResourceIdForFlag key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UserTargetingExpirationResourceIdForFlag kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
  
  @Schema(name = "kind", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public UserTargetingExpirationResourceIdForFlag projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

  /**
   * Get projectKey
   * @return projectKey
  */
  
  @Schema(name = "projectKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectKey")
  public String getProjectKey() {
    return projectKey;
  }

  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTargetingExpirationResourceIdForFlag userTargetingExpirationResourceIdForFlag = (UserTargetingExpirationResourceIdForFlag) o;
    return Objects.equals(this.environmentKey, userTargetingExpirationResourceIdForFlag.environmentKey) &&
        Objects.equals(this.flagKey, userTargetingExpirationResourceIdForFlag.flagKey) &&
        Objects.equals(this.key, userTargetingExpirationResourceIdForFlag.key) &&
        Objects.equals(this.kind, userTargetingExpirationResourceIdForFlag.kind) &&
        Objects.equals(this.projectKey, userTargetingExpirationResourceIdForFlag.projectKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentKey, flagKey, key, kind, projectKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTargetingExpirationResourceIdForFlag {\n");
    sb.append("    environmentKey: ").append(toIndentedString(environmentKey)).append("\n");
    sb.append("    flagKey: ").append(toIndentedString(flagKey)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
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

