package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppEncryptionDeclarationRelationshipsApp;
import org.openapitools.model.BundleIdRelationshipsBundleIdCapabilities;
import org.openapitools.model.BundleIdRelationshipsProfiles;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BundleIdRelationships
 */

@JsonTypeName("BundleId_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BundleIdRelationships {

  private AppEncryptionDeclarationRelationshipsApp app;

  private BundleIdRelationshipsBundleIdCapabilities bundleIdCapabilities;

  private BundleIdRelationshipsProfiles profiles;

  public BundleIdRelationships app(AppEncryptionDeclarationRelationshipsApp app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
  */
  @Valid 
  @Schema(name = "app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app")
  public AppEncryptionDeclarationRelationshipsApp getApp() {
    return app;
  }

  public void setApp(AppEncryptionDeclarationRelationshipsApp app) {
    this.app = app;
  }

  public BundleIdRelationships bundleIdCapabilities(BundleIdRelationshipsBundleIdCapabilities bundleIdCapabilities) {
    this.bundleIdCapabilities = bundleIdCapabilities;
    return this;
  }

  /**
   * Get bundleIdCapabilities
   * @return bundleIdCapabilities
  */
  @Valid 
  @Schema(name = "bundleIdCapabilities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bundleIdCapabilities")
  public BundleIdRelationshipsBundleIdCapabilities getBundleIdCapabilities() {
    return bundleIdCapabilities;
  }

  public void setBundleIdCapabilities(BundleIdRelationshipsBundleIdCapabilities bundleIdCapabilities) {
    this.bundleIdCapabilities = bundleIdCapabilities;
  }

  public BundleIdRelationships profiles(BundleIdRelationshipsProfiles profiles) {
    this.profiles = profiles;
    return this;
  }

  /**
   * Get profiles
   * @return profiles
  */
  @Valid 
  @Schema(name = "profiles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profiles")
  public BundleIdRelationshipsProfiles getProfiles() {
    return profiles;
  }

  public void setProfiles(BundleIdRelationshipsProfiles profiles) {
    this.profiles = profiles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleIdRelationships bundleIdRelationships = (BundleIdRelationships) o;
    return Objects.equals(this.app, bundleIdRelationships.app) &&
        Objects.equals(this.bundleIdCapabilities, bundleIdRelationships.bundleIdCapabilities) &&
        Objects.equals(this.profiles, bundleIdRelationships.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, bundleIdCapabilities, profiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleIdRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    bundleIdCapabilities: ").append(toIndentedString(bundleIdCapabilities)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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

