package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreVersionLocalizationCreateRequestDataAttributes
 */

@JsonTypeName("AppStoreVersionLocalizationCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreVersionLocalizationCreateRequestDataAttributes {

  private String description;

  private String keywords;

  private String locale;

  private URI marketingUrl;

  private String promotionalText;

  private URI supportUrl;

  private String whatsNew;

  public AppStoreVersionLocalizationCreateRequestDataAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppStoreVersionLocalizationCreateRequestDataAttributes(String locale) {
    this.locale = locale;
  }

  public AppStoreVersionLocalizationCreateRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AppStoreVersionLocalizationCreateRequestDataAttributes keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Get keywords
   * @return keywords
  */
  
  @Schema(name = "keywords", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keywords")
  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public AppStoreVersionLocalizationCreateRequestDataAttributes locale(String locale) {
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

  public AppStoreVersionLocalizationCreateRequestDataAttributes marketingUrl(URI marketingUrl) {
    this.marketingUrl = marketingUrl;
    return this;
  }

  /**
   * Get marketingUrl
   * @return marketingUrl
  */
  @Valid 
  @Schema(name = "marketingUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketingUrl")
  public URI getMarketingUrl() {
    return marketingUrl;
  }

  public void setMarketingUrl(URI marketingUrl) {
    this.marketingUrl = marketingUrl;
  }

  public AppStoreVersionLocalizationCreateRequestDataAttributes promotionalText(String promotionalText) {
    this.promotionalText = promotionalText;
    return this;
  }

  /**
   * Get promotionalText
   * @return promotionalText
  */
  
  @Schema(name = "promotionalText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotionalText")
  public String getPromotionalText() {
    return promotionalText;
  }

  public void setPromotionalText(String promotionalText) {
    this.promotionalText = promotionalText;
  }

  public AppStoreVersionLocalizationCreateRequestDataAttributes supportUrl(URI supportUrl) {
    this.supportUrl = supportUrl;
    return this;
  }

  /**
   * Get supportUrl
   * @return supportUrl
  */
  @Valid 
  @Schema(name = "supportUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportUrl")
  public URI getSupportUrl() {
    return supportUrl;
  }

  public void setSupportUrl(URI supportUrl) {
    this.supportUrl = supportUrl;
  }

  public AppStoreVersionLocalizationCreateRequestDataAttributes whatsNew(String whatsNew) {
    this.whatsNew = whatsNew;
    return this;
  }

  /**
   * Get whatsNew
   * @return whatsNew
  */
  
  @Schema(name = "whatsNew", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("whatsNew")
  public String getWhatsNew() {
    return whatsNew;
  }

  public void setWhatsNew(String whatsNew) {
    this.whatsNew = whatsNew;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreVersionLocalizationCreateRequestDataAttributes appStoreVersionLocalizationCreateRequestDataAttributes = (AppStoreVersionLocalizationCreateRequestDataAttributes) o;
    return Objects.equals(this.description, appStoreVersionLocalizationCreateRequestDataAttributes.description) &&
        Objects.equals(this.keywords, appStoreVersionLocalizationCreateRequestDataAttributes.keywords) &&
        Objects.equals(this.locale, appStoreVersionLocalizationCreateRequestDataAttributes.locale) &&
        Objects.equals(this.marketingUrl, appStoreVersionLocalizationCreateRequestDataAttributes.marketingUrl) &&
        Objects.equals(this.promotionalText, appStoreVersionLocalizationCreateRequestDataAttributes.promotionalText) &&
        Objects.equals(this.supportUrl, appStoreVersionLocalizationCreateRequestDataAttributes.supportUrl) &&
        Objects.equals(this.whatsNew, appStoreVersionLocalizationCreateRequestDataAttributes.whatsNew);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, keywords, locale, marketingUrl, promotionalText, supportUrl, whatsNew);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionLocalizationCreateRequestDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    marketingUrl: ").append(toIndentedString(marketingUrl)).append("\n");
    sb.append("    promotionalText: ").append(toIndentedString(promotionalText)).append("\n");
    sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
    sb.append("    whatsNew: ").append(toIndentedString(whatsNew)).append("\n");
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

