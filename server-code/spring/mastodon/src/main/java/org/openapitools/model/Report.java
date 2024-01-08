package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Reports filed against users and/or statuses, to be taken action on by moderators.
 */

@Schema(name = "Report", description = "Reports filed against users and/or statuses, to be taken action on by moderators.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Report {

  private Boolean actionTaken;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime actionTakenAt;

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    OTHER("other"),
    
    SPAM("spam"),
    
    VIOLATION("violation");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CategoryEnum category;

  private String comment;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private Boolean forwarded;

  private String id;

  @Valid
  private List<Integer> ruleIds;

  @Valid
  private List<Integer> statusIds;

  private Account targetAccount;

  public Report actionTaken(Boolean actionTaken) {
    this.actionTaken = actionTaken;
    return this;
  }

  /**
   * Get actionTaken
   * @return actionTaken
  */
  
  @Schema(name = "action_taken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action_taken")
  public Boolean getActionTaken() {
    return actionTaken;
  }

  public void setActionTaken(Boolean actionTaken) {
    this.actionTaken = actionTaken;
  }

  public Report actionTakenAt(OffsetDateTime actionTakenAt) {
    this.actionTakenAt = actionTakenAt;
    return this;
  }

  /**
   * Get actionTakenAt
   * @return actionTakenAt
  */
  @Valid 
  @Schema(name = "action_taken_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action_taken_at")
  public OffsetDateTime getActionTakenAt() {
    return actionTakenAt;
  }

  public void setActionTakenAt(OffsetDateTime actionTakenAt) {
    this.actionTakenAt = actionTakenAt;
  }

  public Report category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Report comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Report createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Report forwarded(Boolean forwarded) {
    this.forwarded = forwarded;
    return this;
  }

  /**
   * Get forwarded
   * @return forwarded
  */
  
  @Schema(name = "forwarded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forwarded")
  public Boolean getForwarded() {
    return forwarded;
  }

  public void setForwarded(Boolean forwarded) {
    this.forwarded = forwarded;
  }

  public Report id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Report ruleIds(List<Integer> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }

  public Report addRuleIdsItem(Integer ruleIdsItem) {
    if (this.ruleIds == null) {
      this.ruleIds = new ArrayList<>();
    }
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

  /**
   * Get ruleIds
   * @return ruleIds
  */
  
  @Schema(name = "rule_ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rule_ids")
  public List<Integer> getRuleIds() {
    return ruleIds;
  }

  public void setRuleIds(List<Integer> ruleIds) {
    this.ruleIds = ruleIds;
  }

  public Report statusIds(List<Integer> statusIds) {
    this.statusIds = statusIds;
    return this;
  }

  public Report addStatusIdsItem(Integer statusIdsItem) {
    if (this.statusIds == null) {
      this.statusIds = new ArrayList<>();
    }
    this.statusIds.add(statusIdsItem);
    return this;
  }

  /**
   * Get statusIds
   * @return statusIds
  */
  
  @Schema(name = "status_ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status_ids")
  public List<Integer> getStatusIds() {
    return statusIds;
  }

  public void setStatusIds(List<Integer> statusIds) {
    this.statusIds = statusIds;
  }

  public Report targetAccount(Account targetAccount) {
    this.targetAccount = targetAccount;
    return this;
  }

  /**
   * Get targetAccount
   * @return targetAccount
  */
  @Valid 
  @Schema(name = "target_account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target_account")
  public Account getTargetAccount() {
    return targetAccount;
  }

  public void setTargetAccount(Account targetAccount) {
    this.targetAccount = targetAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.actionTaken, report.actionTaken) &&
        Objects.equals(this.actionTakenAt, report.actionTakenAt) &&
        Objects.equals(this.category, report.category) &&
        Objects.equals(this.comment, report.comment) &&
        Objects.equals(this.createdAt, report.createdAt) &&
        Objects.equals(this.forwarded, report.forwarded) &&
        Objects.equals(this.id, report.id) &&
        Objects.equals(this.ruleIds, report.ruleIds) &&
        Objects.equals(this.statusIds, report.statusIds) &&
        Objects.equals(this.targetAccount, report.targetAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTaken, actionTakenAt, category, comment, createdAt, forwarded, id, ruleIds, statusIds, targetAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    sb.append("    actionTaken: ").append(toIndentedString(actionTaken)).append("\n");
    sb.append("    actionTakenAt: ").append(toIndentedString(actionTakenAt)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    forwarded: ").append(toIndentedString(forwarded)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
    sb.append("    statusIds: ").append(toIndentedString(statusIds)).append("\n");
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
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

