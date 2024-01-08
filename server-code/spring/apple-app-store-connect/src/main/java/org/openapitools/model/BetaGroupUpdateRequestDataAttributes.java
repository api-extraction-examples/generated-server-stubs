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
 * BetaGroupUpdateRequestDataAttributes
 */

@JsonTypeName("BetaGroupUpdateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaGroupUpdateRequestDataAttributes {

  private Boolean feedbackEnabled;

  private String name;

  private Boolean publicLinkEnabled;

  private Integer publicLinkLimit;

  private Boolean publicLinkLimitEnabled;

  public BetaGroupUpdateRequestDataAttributes feedbackEnabled(Boolean feedbackEnabled) {
    this.feedbackEnabled = feedbackEnabled;
    return this;
  }

  /**
   * Get feedbackEnabled
   * @return feedbackEnabled
  */
  
  @Schema(name = "feedbackEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feedbackEnabled")
  public Boolean getFeedbackEnabled() {
    return feedbackEnabled;
  }

  public void setFeedbackEnabled(Boolean feedbackEnabled) {
    this.feedbackEnabled = feedbackEnabled;
  }

  public BetaGroupUpdateRequestDataAttributes name(String name) {
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

  public BetaGroupUpdateRequestDataAttributes publicLinkEnabled(Boolean publicLinkEnabled) {
    this.publicLinkEnabled = publicLinkEnabled;
    return this;
  }

  /**
   * Get publicLinkEnabled
   * @return publicLinkEnabled
  */
  
  @Schema(name = "publicLinkEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicLinkEnabled")
  public Boolean getPublicLinkEnabled() {
    return publicLinkEnabled;
  }

  public void setPublicLinkEnabled(Boolean publicLinkEnabled) {
    this.publicLinkEnabled = publicLinkEnabled;
  }

  public BetaGroupUpdateRequestDataAttributes publicLinkLimit(Integer publicLinkLimit) {
    this.publicLinkLimit = publicLinkLimit;
    return this;
  }

  /**
   * Get publicLinkLimit
   * @return publicLinkLimit
  */
  
  @Schema(name = "publicLinkLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicLinkLimit")
  public Integer getPublicLinkLimit() {
    return publicLinkLimit;
  }

  public void setPublicLinkLimit(Integer publicLinkLimit) {
    this.publicLinkLimit = publicLinkLimit;
  }

  public BetaGroupUpdateRequestDataAttributes publicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {
    this.publicLinkLimitEnabled = publicLinkLimitEnabled;
    return this;
  }

  /**
   * Get publicLinkLimitEnabled
   * @return publicLinkLimitEnabled
  */
  
  @Schema(name = "publicLinkLimitEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicLinkLimitEnabled")
  public Boolean getPublicLinkLimitEnabled() {
    return publicLinkLimitEnabled;
  }

  public void setPublicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {
    this.publicLinkLimitEnabled = publicLinkLimitEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaGroupUpdateRequestDataAttributes betaGroupUpdateRequestDataAttributes = (BetaGroupUpdateRequestDataAttributes) o;
    return Objects.equals(this.feedbackEnabled, betaGroupUpdateRequestDataAttributes.feedbackEnabled) &&
        Objects.equals(this.name, betaGroupUpdateRequestDataAttributes.name) &&
        Objects.equals(this.publicLinkEnabled, betaGroupUpdateRequestDataAttributes.publicLinkEnabled) &&
        Objects.equals(this.publicLinkLimit, betaGroupUpdateRequestDataAttributes.publicLinkLimit) &&
        Objects.equals(this.publicLinkLimitEnabled, betaGroupUpdateRequestDataAttributes.publicLinkLimitEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackEnabled, name, publicLinkEnabled, publicLinkLimit, publicLinkLimitEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaGroupUpdateRequestDataAttributes {\n");
    sb.append("    feedbackEnabled: ").append(toIndentedString(feedbackEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicLinkEnabled: ").append(toIndentedString(publicLinkEnabled)).append("\n");
    sb.append("    publicLinkLimit: ").append(toIndentedString(publicLinkLimit)).append("\n");
    sb.append("    publicLinkLimitEnabled: ").append(toIndentedString(publicLinkLimitEnabled)).append("\n");
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

