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
 * BetaAppLocalizationUpdateRequestDataAttributes
 */

@JsonTypeName("BetaAppLocalizationUpdateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaAppLocalizationUpdateRequestDataAttributes {

  private String description;

  private String feedbackEmail;

  private String marketingUrl;

  private String privacyPolicyUrl;

  private String tvOsPrivacyPolicy;

  public BetaAppLocalizationUpdateRequestDataAttributes description(String description) {
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

  public BetaAppLocalizationUpdateRequestDataAttributes feedbackEmail(String feedbackEmail) {
    this.feedbackEmail = feedbackEmail;
    return this;
  }

  /**
   * Get feedbackEmail
   * @return feedbackEmail
  */
  
  @Schema(name = "feedbackEmail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feedbackEmail")
  public String getFeedbackEmail() {
    return feedbackEmail;
  }

  public void setFeedbackEmail(String feedbackEmail) {
    this.feedbackEmail = feedbackEmail;
  }

  public BetaAppLocalizationUpdateRequestDataAttributes marketingUrl(String marketingUrl) {
    this.marketingUrl = marketingUrl;
    return this;
  }

  /**
   * Get marketingUrl
   * @return marketingUrl
  */
  
  @Schema(name = "marketingUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketingUrl")
  public String getMarketingUrl() {
    return marketingUrl;
  }

  public void setMarketingUrl(String marketingUrl) {
    this.marketingUrl = marketingUrl;
  }

  public BetaAppLocalizationUpdateRequestDataAttributes privacyPolicyUrl(String privacyPolicyUrl) {
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

  public BetaAppLocalizationUpdateRequestDataAttributes tvOsPrivacyPolicy(String tvOsPrivacyPolicy) {
    this.tvOsPrivacyPolicy = tvOsPrivacyPolicy;
    return this;
  }

  /**
   * Get tvOsPrivacyPolicy
   * @return tvOsPrivacyPolicy
  */
  
  @Schema(name = "tvOsPrivacyPolicy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tvOsPrivacyPolicy")
  public String getTvOsPrivacyPolicy() {
    return tvOsPrivacyPolicy;
  }

  public void setTvOsPrivacyPolicy(String tvOsPrivacyPolicy) {
    this.tvOsPrivacyPolicy = tvOsPrivacyPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaAppLocalizationUpdateRequestDataAttributes betaAppLocalizationUpdateRequestDataAttributes = (BetaAppLocalizationUpdateRequestDataAttributes) o;
    return Objects.equals(this.description, betaAppLocalizationUpdateRequestDataAttributes.description) &&
        Objects.equals(this.feedbackEmail, betaAppLocalizationUpdateRequestDataAttributes.feedbackEmail) &&
        Objects.equals(this.marketingUrl, betaAppLocalizationUpdateRequestDataAttributes.marketingUrl) &&
        Objects.equals(this.privacyPolicyUrl, betaAppLocalizationUpdateRequestDataAttributes.privacyPolicyUrl) &&
        Objects.equals(this.tvOsPrivacyPolicy, betaAppLocalizationUpdateRequestDataAttributes.tvOsPrivacyPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, feedbackEmail, marketingUrl, privacyPolicyUrl, tvOsPrivacyPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaAppLocalizationUpdateRequestDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feedbackEmail: ").append(toIndentedString(feedbackEmail)).append("\n");
    sb.append("    marketingUrl: ").append(toIndentedString(marketingUrl)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    tvOsPrivacyPolicy: ").append(toIndentedString(tvOsPrivacyPolicy)).append("\n");
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

