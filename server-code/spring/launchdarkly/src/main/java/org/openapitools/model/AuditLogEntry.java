package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AuditLogEntryTarget;
import org.openapitools.model.Links;
import org.openapitools.model.Member;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AuditLogEntry
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class AuditLogEntry {

  private String id;

  private Links links;

  private String comment;

  private Long date;

  private String description;

  private String kind;

  private Member member;

  private String name;

  private String shortDescription;

  private AuditLogEntryTarget target;

  private String title;

  private String titleVerb;

  public AuditLogEntry id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique resource id.
   * @return id
  */
  
  @Schema(name = "_id", example = "5a580a01b4ff89217bdf9dc1", description = "The unique resource id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogEntry links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public AuditLogEntry comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  
  @Schema(name = "comment", example = "This is a comment string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public AuditLogEntry date(Long date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  
  @Schema(name = "date", example = "1472243938774", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public AuditLogEntry description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", example = "Changed the name from Test to Testing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AuditLogEntry kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
  
  @Schema(name = "kind", example = "environment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public AuditLogEntry member(Member member) {
    this.member = member;
    return this;
  }

  /**
   * Get member
   * @return member
  */
  @Valid 
  @Schema(name = "member", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("member")
  public Member getMember() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public AuditLogEntry name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "Testing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuditLogEntry shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Get shortDescription
   * @return shortDescription
  */
  
  @Schema(name = "shortDescription", example = "\"\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shortDescription")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public AuditLogEntry target(AuditLogEntryTarget target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  */
  @Valid 
  @Schema(name = "target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target")
  public AuditLogEntryTarget getTarget() {
    return target;
  }

  public void setTarget(AuditLogEntryTarget target) {
    this.target = target;
  }

  public AuditLogEntry title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", example = "[Reese Applebaum](mailto:refapp@launchdarkly.com) changed the name of [Testing](https://app.launchdarkly.com/settings#/projects)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AuditLogEntry titleVerb(String titleVerb) {
    this.titleVerb = titleVerb;
    return this;
  }

  /**
   * Get titleVerb
   * @return titleVerb
  */
  
  @Schema(name = "titleVerb", example = "changed the name of", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("titleVerb")
  public String getTitleVerb() {
    return titleVerb;
  }

  public void setTitleVerb(String titleVerb) {
    this.titleVerb = titleVerb;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogEntry auditLogEntry = (AuditLogEntry) o;
    return Objects.equals(this.id, auditLogEntry.id) &&
        Objects.equals(this.links, auditLogEntry.links) &&
        Objects.equals(this.comment, auditLogEntry.comment) &&
        Objects.equals(this.date, auditLogEntry.date) &&
        Objects.equals(this.description, auditLogEntry.description) &&
        Objects.equals(this.kind, auditLogEntry.kind) &&
        Objects.equals(this.member, auditLogEntry.member) &&
        Objects.equals(this.name, auditLogEntry.name) &&
        Objects.equals(this.shortDescription, auditLogEntry.shortDescription) &&
        Objects.equals(this.target, auditLogEntry.target) &&
        Objects.equals(this.title, auditLogEntry.title) &&
        Objects.equals(this.titleVerb, auditLogEntry.titleVerb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, comment, date, description, kind, member, name, shortDescription, target, title, titleVerb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleVerb: ").append(toIndentedString(titleVerb)).append("\n");
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

