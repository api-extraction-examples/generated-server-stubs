package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AppStoreAgeRating;
import org.openapitools.model.AppStoreVersionState;
import org.openapitools.model.BrazilAgeRating;
import org.openapitools.model.KidsAgeBand;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppInfoAttributes
 */

@JsonTypeName("AppInfo_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppInfoAttributes {

  private AppStoreAgeRating appStoreAgeRating;

  private AppStoreVersionState appStoreState;

  private BrazilAgeRating brazilAgeRating;

  private KidsAgeBand kidsAgeBand;

  public AppInfoAttributes appStoreAgeRating(AppStoreAgeRating appStoreAgeRating) {
    this.appStoreAgeRating = appStoreAgeRating;
    return this;
  }

  /**
   * Get appStoreAgeRating
   * @return appStoreAgeRating
  */
  @Valid 
  @Schema(name = "appStoreAgeRating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appStoreAgeRating")
  public AppStoreAgeRating getAppStoreAgeRating() {
    return appStoreAgeRating;
  }

  public void setAppStoreAgeRating(AppStoreAgeRating appStoreAgeRating) {
    this.appStoreAgeRating = appStoreAgeRating;
  }

  public AppInfoAttributes appStoreState(AppStoreVersionState appStoreState) {
    this.appStoreState = appStoreState;
    return this;
  }

  /**
   * Get appStoreState
   * @return appStoreState
  */
  @Valid 
  @Schema(name = "appStoreState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appStoreState")
  public AppStoreVersionState getAppStoreState() {
    return appStoreState;
  }

  public void setAppStoreState(AppStoreVersionState appStoreState) {
    this.appStoreState = appStoreState;
  }

  public AppInfoAttributes brazilAgeRating(BrazilAgeRating brazilAgeRating) {
    this.brazilAgeRating = brazilAgeRating;
    return this;
  }

  /**
   * Get brazilAgeRating
   * @return brazilAgeRating
  */
  @Valid 
  @Schema(name = "brazilAgeRating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brazilAgeRating")
  public BrazilAgeRating getBrazilAgeRating() {
    return brazilAgeRating;
  }

  public void setBrazilAgeRating(BrazilAgeRating brazilAgeRating) {
    this.brazilAgeRating = brazilAgeRating;
  }

  public AppInfoAttributes kidsAgeBand(KidsAgeBand kidsAgeBand) {
    this.kidsAgeBand = kidsAgeBand;
    return this;
  }

  /**
   * Get kidsAgeBand
   * @return kidsAgeBand
  */
  @Valid 
  @Schema(name = "kidsAgeBand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kidsAgeBand")
  public KidsAgeBand getKidsAgeBand() {
    return kidsAgeBand;
  }

  public void setKidsAgeBand(KidsAgeBand kidsAgeBand) {
    this.kidsAgeBand = kidsAgeBand;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppInfoAttributes appInfoAttributes = (AppInfoAttributes) o;
    return Objects.equals(this.appStoreAgeRating, appInfoAttributes.appStoreAgeRating) &&
        Objects.equals(this.appStoreState, appInfoAttributes.appStoreState) &&
        Objects.equals(this.brazilAgeRating, appInfoAttributes.brazilAgeRating) &&
        Objects.equals(this.kidsAgeBand, appInfoAttributes.kidsAgeBand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreAgeRating, appStoreState, brazilAgeRating, kidsAgeBand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoAttributes {\n");
    sb.append("    appStoreAgeRating: ").append(toIndentedString(appStoreAgeRating)).append("\n");
    sb.append("    appStoreState: ").append(toIndentedString(appStoreState)).append("\n");
    sb.append("    brazilAgeRating: ").append(toIndentedString(brazilAgeRating)).append("\n");
    sb.append("    kidsAgeBand: ").append(toIndentedString(kidsAgeBand)).append("\n");
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

