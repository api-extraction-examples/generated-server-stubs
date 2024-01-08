package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppInfoLocalizationUpdateRequestDataAttributes
 */

@JsonTypeName("AppInfoLocalizationUpdateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppInfoLocalizationUpdateRequestDataAttributes {

  private String name;

  private String privacyPolicyText;

  private String privacyPolicyUrl;

  private String subtitle;

  public AppInfoLocalizationUpdateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppInfoLocalizationUpdateRequestDataAttributes privacyPolicyText(String privacyPolicyText) {
    this.privacyPolicyText = privacyPolicyText;
    return this;
  }

  /**
   * Get privacyPolicyText
   * @return privacyPolicyText
  */
  
  @Schema(name = "privacyPolicyText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privacyPolicyText")
  public String getPrivacyPolicyText() {
    return privacyPolicyText;
  }

  public void setPrivacyPolicyText(String privacyPolicyText) {
    this.privacyPolicyText = privacyPolicyText;
  }

  public AppInfoLocalizationUpdateRequestDataAttributes privacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

  /**
   * Get privacyPolicyUrl
   * @return privacyPolicyUrl
  */
  
  @Schema(name = "privacyPolicyUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privacyPolicyUrl")
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }

  public AppInfoLocalizationUpdateRequestDataAttributes subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * Get subtitle
   * @return subtitle
  */
  
  @Schema(name = "subtitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppInfoLocalizationUpdateRequestDataAttributes appInfoLocalizationUpdateRequestDataAttributes = (AppInfoLocalizationUpdateRequestDataAttributes) o;
    return Objects.equals(this.name, appInfoLocalizationUpdateRequestDataAttributes.name) &&
        Objects.equals(this.privacyPolicyText, appInfoLocalizationUpdateRequestDataAttributes.privacyPolicyText) &&
        Objects.equals(this.privacyPolicyUrl, appInfoLocalizationUpdateRequestDataAttributes.privacyPolicyUrl) &&
        Objects.equals(this.subtitle, appInfoLocalizationUpdateRequestDataAttributes.subtitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, privacyPolicyText, privacyPolicyUrl, subtitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoLocalizationUpdateRequestDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyPolicyText: ").append(toIndentedString(privacyPolicyText)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
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

