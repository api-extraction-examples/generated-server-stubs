package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Comment;
import org.openapitools.model.IssueLinkType;
import org.openapitools.model.LinkedIssue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LinkIssueRequestJsonBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class LinkIssueRequestJsonBean {

  private Comment comment;

  private LinkedIssue inwardIssue;

  private LinkedIssue outwardIssue;

  private IssueLinkType type;

  public LinkIssueRequestJsonBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LinkIssueRequestJsonBean(LinkedIssue inwardIssue, LinkedIssue outwardIssue, IssueLinkType type) {
    this.inwardIssue = inwardIssue;
    this.outwardIssue = outwardIssue;
    this.type = type;
  }

  public LinkIssueRequestJsonBean comment(Comment comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  @Valid 
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public Comment getComment() {
    return comment;
  }

  public void setComment(Comment comment) {
    this.comment = comment;
  }

  public LinkIssueRequestJsonBean inwardIssue(LinkedIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
    return this;
  }

  /**
   * Get inwardIssue
   * @return inwardIssue
  */
  @NotNull @Valid 
  @Schema(name = "inwardIssue", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("inwardIssue")
  public LinkedIssue getInwardIssue() {
    return inwardIssue;
  }

  public void setInwardIssue(LinkedIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
  }

  public LinkIssueRequestJsonBean outwardIssue(LinkedIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
    return this;
  }

  /**
   * Get outwardIssue
   * @return outwardIssue
  */
  @NotNull @Valid 
  @Schema(name = "outwardIssue", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("outwardIssue")
  public LinkedIssue getOutwardIssue() {
    return outwardIssue;
  }

  public void setOutwardIssue(LinkedIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
  }

  public LinkIssueRequestJsonBean type(IssueLinkType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public IssueLinkType getType() {
    return type;
  }

  public void setType(IssueLinkType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkIssueRequestJsonBean linkIssueRequestJsonBean = (LinkIssueRequestJsonBean) o;
    return Objects.equals(this.comment, linkIssueRequestJsonBean.comment) &&
        Objects.equals(this.inwardIssue, linkIssueRequestJsonBean.inwardIssue) &&
        Objects.equals(this.outwardIssue, linkIssueRequestJsonBean.outwardIssue) &&
        Objects.equals(this.type, linkIssueRequestJsonBean.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, inwardIssue, outwardIssue, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkIssueRequestJsonBean {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    inwardIssue: ").append(toIndentedString(inwardIssue)).append("\n");
    sb.append("    outwardIssue: ").append(toIndentedString(outwardIssue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

