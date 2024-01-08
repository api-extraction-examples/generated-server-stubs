package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;An object that contains details about when a principal in the reported Organizations entity last attempted to access an Amazon Web Services service. A principal can be an IAM user, an IAM role, or the Amazon Web Services account root user within the reported Organizations entity.&lt;/p&gt; &lt;p&gt;This data type is a response element in the &lt;a&gt;GetOrganizationsAccessReport&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "AccessDetail", description = "<p>An object that contains details about when a principal in the reported Organizations entity last attempted to access an Amazon Web Services service. A principal can be an IAM user, an IAM role, or the Amazon Web Services account root user within the reported Organizations entity.</p> <p>This data type is a response element in the <a>GetOrganizationsAccessReport</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class AccessDetail {

  private String serviceName;

  private String serviceNamespace;

  private String region;

  private String entityPath;

  private OffsetDateTime lastAuthenticatedTime;

  private Integer totalAuthenticatedEntities;

  public AccessDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccessDetail(String serviceName, String serviceNamespace) {
    this.serviceName = serviceName;
    this.serviceNamespace = serviceNamespace;
  }

  public AccessDetail serviceName(String serviceName) {
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

  public AccessDetail serviceNamespace(String serviceNamespace) {
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

  public AccessDetail region(String region) {
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

  public AccessDetail entityPath(String entityPath) {
    this.entityPath = entityPath;
    return this;
  }

  /**
   * Get entityPath
   * @return entityPath
  */
  
  @Schema(name = "EntityPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EntityPath")
  public String getEntityPath() {
    return entityPath;
  }

  public void setEntityPath(String entityPath) {
    this.entityPath = entityPath;
  }

  public AccessDetail lastAuthenticatedTime(OffsetDateTime lastAuthenticatedTime) {
    this.lastAuthenticatedTime = lastAuthenticatedTime;
    return this;
  }

  /**
   * Get lastAuthenticatedTime
   * @return lastAuthenticatedTime
  */
  @Valid 
  @Schema(name = "LastAuthenticatedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastAuthenticatedTime")
  public OffsetDateTime getLastAuthenticatedTime() {
    return lastAuthenticatedTime;
  }

  public void setLastAuthenticatedTime(OffsetDateTime lastAuthenticatedTime) {
    this.lastAuthenticatedTime = lastAuthenticatedTime;
  }

  public AccessDetail totalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessDetail accessDetail = (AccessDetail) o;
    return Objects.equals(this.serviceName, accessDetail.serviceName) &&
        Objects.equals(this.serviceNamespace, accessDetail.serviceNamespace) &&
        Objects.equals(this.region, accessDetail.region) &&
        Objects.equals(this.entityPath, accessDetail.entityPath) &&
        Objects.equals(this.lastAuthenticatedTime, accessDetail.lastAuthenticatedTime) &&
        Objects.equals(this.totalAuthenticatedEntities, accessDetail.totalAuthenticatedEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, serviceNamespace, region, entityPath, lastAuthenticatedTime, totalAuthenticatedEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessDetail {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceNamespace: ").append(toIndentedString(serviceNamespace)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    entityPath: ").append(toIndentedString(entityPath)).append("\n");
    sb.append("    lastAuthenticatedTime: ").append(toIndentedString(lastAuthenticatedTime)).append("\n");
    sb.append("    totalAuthenticatedEntities: ").append(toIndentedString(totalAuthenticatedEntities)).append("\n");
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

