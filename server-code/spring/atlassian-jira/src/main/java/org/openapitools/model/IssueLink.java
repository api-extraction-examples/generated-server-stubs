package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
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
 * Details of a link between issues.
 */

@Schema(name = "IssueLink", description = "Details of a link between issues.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueLink {

  private String id;

  private LinkedIssue inwardIssue;

  private LinkedIssue outwardIssue;

  private URI self;

  private IssueLinkType type;

  public IssueLink() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueLink(LinkedIssue inwardIssue, LinkedIssue outwardIssue, IssueLinkType type) {
    this.inwardIssue = inwardIssue;
    this.outwardIssue = outwardIssue;
    this.type = type;
  }

  public IssueLink id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue link.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IssueLink inwardIssue(LinkedIssue inwardIssue) {
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

  public IssueLink outwardIssue(LinkedIssue outwardIssue) {
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

  public IssueLink self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the issue link.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the issue link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public IssueLink type(IssueLinkType type) {
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
    IssueLink issueLink = (IssueLink) o;
    return Objects.equals(this.id, issueLink.id) &&
        Objects.equals(this.inwardIssue, issueLink.inwardIssue) &&
        Objects.equals(this.outwardIssue, issueLink.outwardIssue) &&
        Objects.equals(this.self, issueLink.self) &&
        Objects.equals(this.type, issueLink.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inwardIssue, outwardIssue, self, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLink {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inwardIssue: ").append(toIndentedString(inwardIssue)).append("\n");
    sb.append("    outwardIssue: ").append(toIndentedString(outwardIssue)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

