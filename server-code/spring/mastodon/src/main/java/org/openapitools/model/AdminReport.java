package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Status;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Admin-level information about a filed report.
 */

@Schema(name = "AdminReport", description = "Admin-level information about a filed report.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class AdminReport {

  private Account account;

  private String actionTaken;

  private Account assignedAccount;

  private String comment;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String id;

  @Valid
  private List<@Valid Status> statuses;

  private Account targetAccount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public AdminReport account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public AdminReport actionTaken(String actionTaken) {
    this.actionTaken = actionTaken;
    return this;
  }

  /**
   * The action taken to resolve this report. Enumerable oneOf.
   * @return actionTaken
  */
  
  @Schema(name = "action_taken", description = "The action taken to resolve this report. Enumerable oneOf.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action_taken")
  public String getActionTaken() {
    return actionTaken;
  }

  public void setActionTaken(String actionTaken) {
    this.actionTaken = actionTaken;
  }

  public AdminReport assignedAccount(Account assignedAccount) {
    this.assignedAccount = assignedAccount;
    return this;
  }

  /**
   * Get assignedAccount
   * @return assignedAccount
  */
  @Valid 
  @Schema(name = "assigned_account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigned_account")
  public Account getAssignedAccount() {
    return assignedAccount;
  }

  public void setAssignedAccount(Account assignedAccount) {
    this.assignedAccount = assignedAccount;
  }

  public AdminReport comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * An optional reason for reporting.
   * @return comment
  */
  
  @Schema(name = "comment", description = "An optional reason for reporting.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public AdminReport createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time the report was filed.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", description = "The time the report was filed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AdminReport id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the report in the database. Cast from an integer, but not guaranteed to be a number.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the report in the database. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdminReport statuses(List<@Valid Status> statuses) {
    this.statuses = statuses;
    return this;
  }

  public AdminReport addStatusesItem(Status statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Statuses attached to the report, for context.
   * @return statuses
  */
  @Valid 
  @Schema(name = "statuses", description = "Statuses attached to the report, for context.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public List<@Valid Status> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid Status> statuses) {
    this.statuses = statuses;
  }

  public AdminReport targetAccount(Account targetAccount) {
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

  public AdminReport updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The time of last action on this report.
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updated_at", description = "The time of last action on this report.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminReport adminReport = (AdminReport) o;
    return Objects.equals(this.account, adminReport.account) &&
        Objects.equals(this.actionTaken, adminReport.actionTaken) &&
        Objects.equals(this.assignedAccount, adminReport.assignedAccount) &&
        Objects.equals(this.comment, adminReport.comment) &&
        Objects.equals(this.createdAt, adminReport.createdAt) &&
        Objects.equals(this.id, adminReport.id) &&
        Objects.equals(this.statuses, adminReport.statuses) &&
        Objects.equals(this.targetAccount, adminReport.targetAccount) &&
        Objects.equals(this.updatedAt, adminReport.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, actionTaken, assignedAccount, comment, createdAt, id, statuses, targetAccount, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminReport {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    actionTaken: ").append(toIndentedString(actionTaken)).append("\n");
    sb.append("    assignedAccount: ").append(toIndentedString(assignedAccount)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

