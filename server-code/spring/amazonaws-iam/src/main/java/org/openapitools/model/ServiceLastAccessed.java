package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains details about the most recent attempt to access the service.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;GetServiceLastAccessedDetails&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "ServiceLastAccessed", description = "<p>Contains details about the most recent attempt to access the service.</p> <p>This data type is used as a response element in the <a>GetServiceLastAccessedDetails</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ServiceLastAccessed {

  private String serviceName;

  private OffsetDateTime lastAuthenticated;

  private String serviceNamespace;

  private String lastAuthenticatedEntity;

  private String lastAuthenticatedRegion;

  private Integer totalAuthenticatedEntities;

  private List trackedActionsLastAccessed;

  public ServiceLastAccessed() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceLastAccessed(String serviceName, String serviceNamespace) {
    this.serviceName = serviceName;
    this.serviceNamespace = serviceNamespace;
  }

  public ServiceLastAccessed serviceName(String serviceName) {
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

  public ServiceLastAccessed lastAuthenticated(OffsetDateTime lastAuthenticated) {
    this.lastAuthenticated = lastAuthenticated;
    return this;
  }

  /**
   * Get lastAuthenticated
   * @return lastAuthenticated
  */
  @Valid 
  @Schema(name = "LastAuthenticated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastAuthenticated")
  public OffsetDateTime getLastAuthenticated() {
    return lastAuthenticated;
  }

  public void setLastAuthenticated(OffsetDateTime lastAuthenticated) {
    this.lastAuthenticated = lastAuthenticated;
  }

  public ServiceLastAccessed serviceNamespace(String serviceNamespace) {
    this.serviceNamespace = serviceNamespace;
    return this;
  }

  /**
   * Get serviceNamespace
   * @return serviceNamespace
  */
  @NotNull 
  @Schema(name = "ServiceNamespace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServiceNamespace")
  public String getServiceNamespace() {
    return serviceNamespace;
  }

  public void setServiceNamespace(String serviceNamespace) {
    this.serviceNamespace = serviceNamespace;
  }

  public ServiceLastAccessed lastAuthenticatedEntity(String lastAuthenticatedEntity) {
    this.lastAuthenticatedEntity = lastAuthenticatedEntity;
    return this;
  }

  /**
   * Get lastAuthenticatedEntity
   * @return lastAuthenticatedEntity
  */
  
  @Schema(name = "LastAuthenticatedEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastAuthenticatedEntity")
  public String getLastAuthenticatedEntity() {
    return lastAuthenticatedEntity;
  }

  public void setLastAuthenticatedEntity(String lastAuthenticatedEntity) {
    this.lastAuthenticatedEntity = lastAuthenticatedEntity;
  }

  public ServiceLastAccessed lastAuthenticatedRegion(String lastAuthenticatedRegion) {
    this.lastAuthenticatedRegion = lastAuthenticatedRegion;
    return this;
  }

  /**
   * Get lastAuthenticatedRegion
   * @return lastAuthenticatedRegion
  */
  
  @Schema(name = "LastAuthenticatedRegion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastAuthenticatedRegion")
  public String getLastAuthenticatedRegion() {
    return lastAuthenticatedRegion;
  }

  public void setLastAuthenticatedRegion(String lastAuthenticatedRegion) {
    this.lastAuthenticatedRegion = lastAuthenticatedRegion;
  }

  public ServiceLastAccessed totalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
    this.totalAuthenticatedEntities = totalAuthenticatedEntities;
    return this;
  }

  /**
   * Get totalAuthenticatedEntities
   * @return totalAuthenticatedEntities
  */
  
  @Schema(name = "TotalAuthenticatedEntities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalAuthenticatedEntities")
  public Integer getTotalAuthenticatedEntities() {
    return totalAuthenticatedEntities;
  }

  public void setTotalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
    this.totalAuthenticatedEntities = totalAuthenticatedEntities;
  }

  public ServiceLastAccessed trackedActionsLastAccessed(List trackedActionsLastAccessed) {
    this.trackedActionsLastAccessed = trackedActionsLastAccessed;
    return this;
  }

  /**
   * Get trackedActionsLastAccessed
   * @return trackedActionsLastAccessed
  */
  @Valid 
  @Schema(name = "TrackedActionsLastAccessed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TrackedActionsLastAccessed")
  public List getTrackedActionsLastAccessed() {
    return trackedActionsLastAccessed;
  }

  public void setTrackedActionsLastAccessed(List trackedActionsLastAccessed) {
    this.trackedActionsLastAccessed = trackedActionsLastAccessed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLastAccessed serviceLastAccessed = (ServiceLastAccessed) o;
    return Objects.equals(this.serviceName, serviceLastAccessed.serviceName) &&
        Objects.equals(this.lastAuthenticated, serviceLastAccessed.lastAuthenticated) &&
        Objects.equals(this.serviceNamespace, serviceLastAccessed.serviceNamespace) &&
        Objects.equals(this.lastAuthenticatedEntity, serviceLastAccessed.lastAuthenticatedEntity) &&
        Objects.equals(this.lastAuthenticatedRegion, serviceLastAccessed.lastAuthenticatedRegion) &&
        Objects.equals(this.totalAuthenticatedEntities, serviceLastAccessed.totalAuthenticatedEntities) &&
        Objects.equals(this.trackedActionsLastAccessed, serviceLastAccessed.trackedActionsLastAccessed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, lastAuthenticated, serviceNamespace, lastAuthenticatedEntity, lastAuthenticatedRegion, totalAuthenticatedEntities, trackedActionsLastAccessed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLastAccessed {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    lastAuthenticated: ").append(toIndentedString(lastAuthenticated)).append("\n");
    sb.append("    serviceNamespace: ").append(toIndentedString(serviceNamespace)).append("\n");
    sb.append("    lastAuthenticatedEntity: ").append(toIndentedString(lastAuthenticatedEntity)).append("\n");
    sb.append("    lastAuthenticatedRegion: ").append(toIndentedString(lastAuthenticatedRegion)).append("\n");
    sb.append("    totalAuthenticatedEntities: ").append(toIndentedString(totalAuthenticatedEntities)).append("\n");
    sb.append("    trackedActionsLastAccessed: ").append(toIndentedString(trackedActionsLastAccessed)).append("\n");
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

