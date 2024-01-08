package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BundleIdCapabilityCreateRequestDataRelationshipsBundleId;
import org.openapitools.model.ProfileCreateRequestDataRelationshipsCertificates;
import org.openapitools.model.ProfileCreateRequestDataRelationshipsDevices;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProfileCreateRequestDataRelationships
 */

@JsonTypeName("ProfileCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class ProfileCreateRequestDataRelationships {

  private BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId;

  private ProfileCreateRequestDataRelationshipsCertificates certificates;

  private ProfileCreateRequestDataRelationshipsDevices devices;

  public ProfileCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileCreateRequestDataRelationships(BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId, ProfileCreateRequestDataRelationshipsCertificates certificates) {
    this.bundleId = bundleId;
    this.certificates = certificates;
  }

  public ProfileCreateRequestDataRelationships bundleId(BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId) {
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

  public ProfileCreateRequestDataRelationships certificates(ProfileCreateRequestDataRelationshipsCertificates certificates) {
    this.certificates = certificates;
    return this;
  }

  /**
   * Get certificates
   * @return certificates
  */
  @NotNull @Valid 
  @Schema(name = "certificates", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("certificates")
  public ProfileCreateRequestDataRelationshipsCertificates getCertificates() {
    return certificates;
  }

  public void setCertificates(ProfileCreateRequestDataRelationshipsCertificates certificates) {
    this.certificates = certificates;
  }

  public ProfileCreateRequestDataRelationships devices(ProfileCreateRequestDataRelationshipsDevices devices) {
    this.devices = devices;
    return this;
  }

  /**
   * Get devices
   * @return devices
  */
  @Valid 
  @Schema(name = "devices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("devices")
  public ProfileCreateRequestDataRelationshipsDevices getDevices() {
    return devices;
  }

  public void setDevices(ProfileCreateRequestDataRelationshipsDevices devices) {
    this.devices = devices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileCreateRequestDataRelationships profileCreateRequestDataRelationships = (ProfileCreateRequestDataRelationships) o;
    return Objects.equals(this.bundleId, profileCreateRequestDataRelationships.bundleId) &&
        Objects.equals(this.certificates, profileCreateRequestDataRelationships.certificates) &&
        Objects.equals(this.devices, profileCreateRequestDataRelationships.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId, certificates, devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileCreateRequestDataRelationships {\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

