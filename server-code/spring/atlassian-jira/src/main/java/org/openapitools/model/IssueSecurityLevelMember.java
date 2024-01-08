package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PermissionHolder;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Issue security level member.
 */

@Schema(name = "IssueSecurityLevelMember", description = "Issue security level member.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueSecurityLevelMember {

  private PermissionHolder holder;

  private Long id;

  private Long issueSecurityLevelId;

  public IssueSecurityLevelMember() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueSecurityLevelMember(PermissionHolder holder, Long id, Long issueSecurityLevelId) {
    this.holder = holder;
    this.id = id;
    this.issueSecurityLevelId = issueSecurityLevelId;
  }

  public IssueSecurityLevelMember holder(PermissionHolder holder) {
    this.holder = holder;
    return this;
  }

  /**
   * Get holder
   * @return holder
  */
  @NotNull @Valid 
  @Schema(name = "holder", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("holder")
  public PermissionHolder getHolder() {
    return holder;
  }

  public void setHolder(PermissionHolder holder) {
    this.holder = holder;
  }

  public IssueSecurityLevelMember id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue security level member.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the issue security level member.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public IssueSecurityLevelMember issueSecurityLevelId(Long issueSecurityLevelId) {
    this.issueSecurityLevelId = issueSecurityLevelId;
    return this;
  }

  /**
   * The ID of the issue security level.
   * @return issueSecurityLevelId
  */
  @NotNull 
  @Schema(name = "issueSecurityLevelId", description = "The ID of the issue security level.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueSecurityLevelId")
  public Long getIssueSecurityLevelId() {
    return issueSecurityLevelId;
  }

  public void setIssueSecurityLevelId(Long issueSecurityLevelId) {
    this.issueSecurityLevelId = issueSecurityLevelId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSecurityLevelMember issueSecurityLevelMember = (IssueSecurityLevelMember) o;
    return Objects.equals(this.holder, issueSecurityLevelMember.holder) &&
        Objects.equals(this.id, issueSecurityLevelMember.id) &&
        Objects.equals(this.issueSecurityLevelId, issueSecurityLevelMember.issueSecurityLevelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holder, id, issueSecurityLevelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSecurityLevelMember {\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueSecurityLevelId: ").append(toIndentedString(issueSecurityLevelId)).append("\n");
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

