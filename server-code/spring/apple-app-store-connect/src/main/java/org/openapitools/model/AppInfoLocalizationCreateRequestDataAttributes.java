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
 * AppInfoLocalizationCreateRequestDataAttributes
 */

@JsonTypeName("AppInfoLocalizationCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppInfoLocalizationCreateRequestDataAttributes {

  private String locale;

  private String name;

  private String privacyPolicyText;

  private String privacyPolicyUrl;

  private String subtitle;

  public AppInfoLocalizationCreateRequestDataAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppInfoLocalizationCreateRequestDataAttributes(String locale) {
    this.locale = locale;
  }

  public AppInfoLocalizationCreateRequestDataAttributes locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  */
  @NotNull 
  @Schema(name = "locale", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public AppInfoLocalizationCreateRequestDataAttributes name(String name) {
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

  public AppInfoLocalizationCreateRequestDataAttributes privacyPolicyText(String privacyPolicyText) {
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

  public AppInfoLocalizationCreateRequestDataAttributes privacyPolicyUrl(String privacyPolicyUrl) {
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

  public AppInfoLocalizationCreateRequestDataAttributes subtitle(String subtitle) {
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
    AppInfoLocalizationCreateRequestDataAttributes appInfoLocalizationCreateRequestDataAttributes = (AppInfoLocalizationCreateRequestDataAttributes) o;
    return Objects.equals(this.locale, appInfoLocalizationCreateRequestDataAttributes.locale) &&
        Objects.equals(this.name, appInfoLocalizationCreateRequestDataAttributes.name) &&
        Objects.equals(this.privacyPolicyText, appInfoLocalizationCreateRequestDataAttributes.privacyPolicyText) &&
        Objects.equals(this.privacyPolicyUrl, appInfoLocalizationCreateRequestDataAttributes.privacyPolicyUrl) &&
        Objects.equals(this.subtitle, appInfoLocalizationCreateRequestDataAttributes.subtitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, name, privacyPolicyText, privacyPolicyUrl, subtitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoLocalizationCreateRequestDataAttributes {\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

