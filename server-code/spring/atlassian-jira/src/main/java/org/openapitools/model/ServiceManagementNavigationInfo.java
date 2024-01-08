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
 * ServiceManagementNavigationInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ServiceManagementNavigationInfo {

  private String queueCategory;

  private Long queueId;

  private String queueName;

  public ServiceManagementNavigationInfo queueCategory(String queueCategory) {
    this.queueCategory = queueCategory;
    return this;
  }

  /**
   * Get queueCategory
   * @return queueCategory
  */
  
  @Schema(name = "queueCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueCategory")
  public String getQueueCategory() {
    return queueCategory;
  }

  public void setQueueCategory(String queueCategory) {
    this.queueCategory = queueCategory;
  }

  public ServiceManagementNavigationInfo queueId(Long queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * Get queueId
   * @return queueId
  */
  
  @Schema(name = "queueId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueId")
  public Long getQueueId() {
    return queueId;
  }

  public void setQueueId(Long queueId) {
    this.queueId = queueId;
  }

  public ServiceManagementNavigationInfo queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  /**
   * Get queueName
   * @return queueName
  */
  
  @Schema(name = "queueName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueName")
  public String getQueueName() {
    return queueName;
  }

  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceManagementNavigationInfo serviceManagementNavigationInfo = (ServiceManagementNavigationInfo) o;
    return Objects.equals(this.queueCategory, serviceManagementNavigationInfo.queueCategory) &&
        Objects.equals(this.queueId, serviceManagementNavigationInfo.queueId) &&
        Objects.equals(this.queueName, serviceManagementNavigationInfo.queueName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueCategory, queueId, queueName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceManagementNavigationInfo {\n");
    sb.append("    queueCategory: ").append(toIndentedString(queueCategory)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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

