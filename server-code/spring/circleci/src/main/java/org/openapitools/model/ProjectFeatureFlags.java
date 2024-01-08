package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectFeatureFlags
 */

@JsonTypeName("Project_feature_flags")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class ProjectFeatureFlags {

  private Boolean buildForkPrs;

  private JsonNullable<Boolean> fleet = JsonNullable.<Boolean>undefined();

  private Boolean junit;

  private Boolean oss;

  private Boolean osx;

  private Boolean setGithubStatus;

  private Boolean trustyBeta;

  public ProjectFeatureFlags buildForkPrs(Boolean buildForkPrs) {
    this.buildForkPrs = buildForkPrs;
    return this;
  }

  /**
   * Get buildForkPrs
   * @return buildForkPrs
  */
  
  @Schema(name = "build-fork-prs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build-fork-prs")
  public Boolean getBuildForkPrs() {
    return buildForkPrs;
  }

  public void setBuildForkPrs(Boolean buildForkPrs) {
    this.buildForkPrs = buildForkPrs;
  }

  public ProjectFeatureFlags fleet(Boolean fleet) {
    this.fleet = JsonNullable.of(fleet);
    return this;
  }

  /**
   * Get fleet
   * @return fleet
  */
  
  @Schema(name = "fleet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fleet")
  public JsonNullable<Boolean> getFleet() {
    return fleet;
  }

  public void setFleet(JsonNullable<Boolean> fleet) {
    this.fleet = fleet;
  }

  public ProjectFeatureFlags junit(Boolean junit) {
    this.junit = junit;
    return this;
  }

  /**
   * Get junit
   * @return junit
  */
  
  @Schema(name = "junit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("junit")
  public Boolean getJunit() {
    return junit;
  }

  public void setJunit(Boolean junit) {
    this.junit = junit;
  }

  public ProjectFeatureFlags oss(Boolean oss) {
    this.oss = oss;
    return this;
  }

  /**
   * Get oss
   * @return oss
  */
  
  @Schema(name = "oss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oss")
  public Boolean getOss() {
    return oss;
  }

  public void setOss(Boolean oss) {
    this.oss = oss;
  }

  public ProjectFeatureFlags osx(Boolean osx) {
    this.osx = osx;
    return this;
  }

  /**
   * Get osx
   * @return osx
  */
  
  @Schema(name = "osx", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("osx")
  public Boolean getOsx() {
    return osx;
  }

  public void setOsx(Boolean osx) {
    this.osx = osx;
  }

  public ProjectFeatureFlags setGithubStatus(Boolean setGithubStatus) {
    this.setGithubStatus = setGithubStatus;
    return this;
  }

  /**
   * Get setGithubStatus
   * @return setGithubStatus
  */
  
  @Schema(name = "set-github-status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("set-github-status")
  public Boolean getSetGithubStatus() {
    return setGithubStatus;
  }

  public void setSetGithubStatus(Boolean setGithubStatus) {
    this.setGithubStatus = setGithubStatus;
  }

  public ProjectFeatureFlags trustyBeta(Boolean trustyBeta) {
    this.trustyBeta = trustyBeta;
    return this;
  }

  /**
   * Get trustyBeta
   * @return trustyBeta
  */
  
  @Schema(name = "trusty-beta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trusty-beta")
  public Boolean getTrustyBeta() {
    return trustyBeta;
  }

  public void setTrustyBeta(Boolean trustyBeta) {
    this.trustyBeta = trustyBeta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectFeatureFlags projectFeatureFlags = (ProjectFeatureFlags) o;
    return Objects.equals(this.buildForkPrs, projectFeatureFlags.buildForkPrs) &&
        equalsNullable(this.fleet, projectFeatureFlags.fleet) &&
        Objects.equals(this.junit, projectFeatureFlags.junit) &&
        Objects.equals(this.oss, projectFeatureFlags.oss) &&
        Objects.equals(this.osx, projectFeatureFlags.osx) &&
        Objects.equals(this.setGithubStatus, projectFeatureFlags.setGithubStatus) &&
        Objects.equals(this.trustyBeta, projectFeatureFlags.trustyBeta);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildForkPrs, hashCodeNullable(fleet), junit, oss, osx, setGithubStatus, trustyBeta);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectFeatureFlags {\n");
    sb.append("    buildForkPrs: ").append(toIndentedString(buildForkPrs)).append("\n");
    sb.append("    fleet: ").append(toIndentedString(fleet)).append("\n");
    sb.append("    junit: ").append(toIndentedString(junit)).append("\n");
    sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
    sb.append("    osx: ").append(toIndentedString(osx)).append("\n");
    sb.append("    setGithubStatus: ").append(toIndentedString(setGithubStatus)).append("\n");
    sb.append("    trustyBeta: ").append(toIndentedString(trustyBeta)).append("\n");
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

