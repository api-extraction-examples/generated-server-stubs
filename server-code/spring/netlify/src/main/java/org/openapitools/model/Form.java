package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Form
 */

@JsonTypeName("form")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class Form {

  private String createdAt;

  @Valid
  private List<Object> fields;

  private String id;

  private String name;

  @Valid
  private List<String> paths;

  private String siteId;

  private Integer submissionCount;

  public Form createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Form fields(List<Object> fields) {
    this.fields = fields;
    return this;
  }

  public Form addFieldsItem(Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
  */
  
  @Schema(name = "fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public List<Object> getFields() {
    return fields;
  }

  public void setFields(List<Object> fields) {
    this.fields = fields;
  }

  public Form id(String id) {
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

  public Form name(String name) {
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

  public Form paths(List<String> paths) {
    this.paths = paths;
    return this;
  }

  public Form addPathsItem(String pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<>();
    }
    this.paths.add(pathsItem);
    return this;
  }

  /**
   * Get paths
   * @return paths
  */
  
  @Schema(name = "paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paths")
  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }

  public Form siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId
   * @return siteId
  */
  
  @Schema(name = "site_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("site_id")
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public Form submissionCount(Integer submissionCount) {
    this.submissionCount = submissionCount;
    return this;
  }

  /**
   * Get submissionCount
   * @return submissionCount
  */
  
  @Schema(name = "submission_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("submission_count")
  public Integer getSubmissionCount() {
    return submissionCount;
  }

  public void setSubmissionCount(Integer submissionCount) {
    this.submissionCount = submissionCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form form = (Form) o;
    return Objects.equals(this.createdAt, form.createdAt) &&
        Objects.equals(this.fields, form.fields) &&
        Objects.equals(this.id, form.id) &&
        Objects.equals(this.name, form.name) &&
        Objects.equals(this.paths, form.paths) &&
        Objects.equals(this.siteId, form.siteId) &&
        Objects.equals(this.submissionCount, form.submissionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, fields, id, name, paths, siteId, submissionCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    submissionCount: ").append(toIndentedString(submissionCount)).append("\n");
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

