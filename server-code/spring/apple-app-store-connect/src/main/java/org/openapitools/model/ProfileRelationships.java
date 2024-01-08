package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ProfileRelationshipsBundleId;
import org.openapitools.model.ProfileRelationshipsCertificates;
import org.openapitools.model.ProfileRelationshipsDevices;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProfileRelationships
 */

@JsonTypeName("Profile_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class ProfileRelationships {

  private ProfileRelationshipsBundleId bundleId;

  private ProfileRelationshipsCertificates certificates;

  private ProfileRelationshipsDevices devices;

  public ProfileRelationships bundleId(ProfileRelationshipsBundleId bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Get bundleId
   * @return bundleId
  */
  @Valid 
  @Schema(name = "bundleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bundleId")
  public ProfileRelationshipsBundleId getBundleId() {
    return bundleId;
  }

  public void setBundleId(ProfileRelationshipsBundleId bundleId) {
    this.bundleId = bundleId;
  }

  public ProfileRelationships certificates(ProfileRelationshipsCertificates certificates) {
    this.certificates = certificates;
    return this;
  }

  /**
   * Get certificates
   * @return certificates
  */
  @Valid 
  @Schema(name = "certificates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificates")
  public ProfileRelationshipsCertificates getCertificates() {
    return certificates;
  }

  public void setCertificates(ProfileRelationshipsCertificates certificates) {
    this.certificates = certificates;
  }

  public ProfileRelationships devices(ProfileRelationshipsDevices devices) {
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
  public ProfileRelationshipsDevices getDevices() {
    return devices;
  }

  public void setDevices(ProfileRelationshipsDevices devices) {
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
    ProfileRelationships profileRelationships = (ProfileRelationships) o;
    return Objects.equals(this.bundleId, profileRelationships.bundleId) &&
        Objects.equals(this.certificates, profileRelationships.certificates) &&
        Objects.equals(this.devices, profileRelationships.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId, certificates, devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileRelationships {\n");
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

