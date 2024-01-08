package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaGroupAttributes
 */

@JsonTypeName("BetaGroup_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaGroupAttributes {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private Boolean feedbackEnabled;

  private Boolean isInternalGroup;

  private String name;

  private String publicLink;

  private Boolean publicLinkEnabled;

  private String publicLinkId;

  private Integer publicLinkLimit;

  private Boolean publicLinkLimitEnabled;

  public BetaGroupAttributes createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public BetaGroupAttributes feedbackEnabled(Boolean feedbackEnabled) {
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

  public BetaGroupAttributes isInternalGroup(Boolean isInternalGroup) {
    this.isInternalGroup = isInternalGroup;
    return this;
  }

  /**
   * Get isInternalGroup
   * @return isInternalGroup
  */
  
  @Schema(name = "isInternalGroup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isInternalGroup")
  public Boolean getIsInternalGroup() {
    return isInternalGroup;
  }

  public void setIsInternalGroup(Boolean isInternalGroup) {
    this.isInternalGroup = isInternalGroup;
  }

  public BetaGroupAttributes name(String name) {
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

  public BetaGroupAttributes publicLink(String publicLink) {
    this.publicLink = publicLink;
    return this;
  }

  /**
   * Get publicLink
   * @return publicLink
  */
  
  @Schema(name = "publicLink", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicLink")
  public String getPublicLink() {
    return publicLink;
  }

  public void setPublicLink(String publicLink) {
    this.publicLink = publicLink;
  }

  public BetaGroupAttributes publicLinkEnabled(Boolean publicLinkEnabled) {
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

  public BetaGroupAttributes publicLinkId(String publicLinkId) {
    this.publicLinkId = publicLinkId;
    return this;
  }

  /**
   * Get publicLinkId
   * @return publicLinkId
  */
  
  @Schema(name = "publicLinkId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicLinkId")
  public String getPublicLinkId() {
    return publicLinkId;
  }

  public void setPublicLinkId(String publicLinkId) {
    this.publicLinkId = publicLinkId;
  }

  public BetaGroupAttributes publicLinkLimit(Integer publicLinkLimit) {
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

  public BetaGroupAttributes publicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {
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
    BetaGroupAttributes betaGroupAttributes = (BetaGroupAttributes) o;
    return Objects.equals(this.createdDate, betaGroupAttributes.createdDate) &&
        Objects.equals(this.feedbackEnabled, betaGroupAttributes.feedbackEnabled) &&
        Objects.equals(this.isInternalGroup, betaGroupAttributes.isInternalGroup) &&
        Objects.equals(this.name, betaGroupAttributes.name) &&
        Objects.equals(this.publicLink, betaGroupAttributes.publicLink) &&
        Objects.equals(this.publicLinkEnabled, betaGroupAttributes.publicLinkEnabled) &&
        Objects.equals(this.publicLinkId, betaGroupAttributes.publicLinkId) &&
        Objects.equals(this.publicLinkLimit, betaGroupAttributes.publicLinkLimit) &&
        Objects.equals(this.publicLinkLimitEnabled, betaGroupAttributes.publicLinkLimitEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, feedbackEnabled, isInternalGroup, name, publicLink, publicLinkEnabled, publicLinkId, publicLinkLimit, publicLinkLimitEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaGroupAttributes {\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    feedbackEnabled: ").append(toIndentedString(feedbackEnabled)).append("\n");
    sb.append("    isInternalGroup: ").append(toIndentedString(isInternalGroup)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicLink: ").append(toIndentedString(publicLink)).append("\n");
    sb.append("    publicLinkEnabled: ").append(toIndentedString(publicLinkEnabled)).append("\n");
    sb.append("    publicLinkId: ").append(toIndentedString(publicLinkId)).append("\n");
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

