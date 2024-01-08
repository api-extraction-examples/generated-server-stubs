package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;An object that contains details about how a service-linked role is used, if that information is returned by the service.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;GetServiceLinkedRoleDeletionStatus&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "RoleUsageType", description = "<p>An object that contains details about how a service-linked role is used, if that information is returned by the service.</p> <p>This data type is used as a response element in the <a>GetServiceLinkedRoleDeletionStatus</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class RoleUsageType {

  private String region;

  private List resources;

  public RoleUsageType region(String region) {
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

  public RoleUsageType resources(List resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
  */
  @Valid 
  @Schema(name = "Resources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Resources")
  public List getResources() {
    return resources;
  }

  public void setResources(List resources) {
    this.resources = resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleUsageType roleUsageType = (RoleUsageType) o;
    return Objects.equals(this.region, roleUsageType.region) &&
        Objects.equals(this.resources, roleUsageType.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleUsageType {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

