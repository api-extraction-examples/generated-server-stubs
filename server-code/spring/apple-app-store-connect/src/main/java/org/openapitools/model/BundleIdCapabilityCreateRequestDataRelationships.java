package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BundleIdCapabilityCreateRequestDataRelationshipsBundleId;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BundleIdCapabilityCreateRequestDataRelationships
 */

@JsonTypeName("BundleIdCapabilityCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BundleIdCapabilityCreateRequestDataRelationships {

  private BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId;

  public BundleIdCapabilityCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BundleIdCapabilityCreateRequestDataRelationships(BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId) {
    this.bundleId = bundleId;
  }

  public BundleIdCapabilityCreateRequestDataRelationships bundleId(BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Get bundleId
   * @return bundleId
  */
  @NotNull @Valid 
  @Schema(name = "bundleId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bundleId")
  public BundleIdCapabilityCreateRequestDataRelationshipsBundleId getBundleId() {
    return bundleId;
  }

  public void setBundleId(BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId) {
    this.bundleId = bundleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleIdCapabilityCreateRequestDataRelationships bundleIdCapabilityCreateRequestDataRelationships = (BundleIdCapabilityCreateRequestDataRelationships) o;
    return Objects.equals(this.bundleId, bundleIdCapabilityCreateRequestDataRelationships.bundleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleIdCapabilityCreateRequestDataRelationships {\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
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

