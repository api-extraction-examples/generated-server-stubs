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
 * BetaGroupCreateRequestDataAttributes
 */

@JsonTypeName("BetaGroupCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaGroupCreateRequestDataAttributes {

  private Boolean feedbackEnabled;

  private String name;

  private Boolean publicLinkEnabled;

  private Integer publicLinkLimit;

  private Boolean publicLinkLimitEnabled;

  public BetaGroupCreateRequestDataAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BetaGroupCreateRequestDataAttributes(String name) {
    this.name = name;
  }

  public BetaGroupCreateRequestDataAttributes feedbackEnabled(Boolean feedbackEnabled) {
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

  public BetaGroupCreateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BetaGroupCreateRequestDataAttributes publicLinkEnabled(Boolean publicLinkEnabled) {
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

  public BetaGroupCreateRequestDataAttributes publicLinkLimit(Integer publicLinkLimit) {
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

  public BetaGroupCreateRequestDataAttributes publicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {
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
    BetaGroupCreateRequestDataAttributes betaGroupCreateRequestDataAttributes = (BetaGroupCreateRequestDataAttributes) o;
    return Objects.equals(this.feedbackEnabled, betaGroupCreateRequestDataAttributes.feedbackEnabled) &&
        Objects.equals(this.name, betaGroupCreateRequestDataAttributes.name) &&
        Objects.equals(this.publicLinkEnabled, betaGroupCreateRequestDataAttributes.publicLinkEnabled) &&
        Objects.equals(this.publicLinkLimit, betaGroupCreateRequestDataAttributes.publicLinkLimit) &&
        Objects.equals(this.publicLinkLimitEnabled, betaGroupCreateRequestDataAttributes.publicLinkLimitEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackEnabled, name, publicLinkEnabled, publicLinkLimit, publicLinkLimitEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaGroupCreateRequestDataAttributes {\n");
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

