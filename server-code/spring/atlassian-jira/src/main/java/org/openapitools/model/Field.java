package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.FieldLastUsed;
import org.openapitools.model.JsonTypeBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a field.
 */

@Schema(name = "Field", description = "Details of a field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Field {

  private Long contextsCount;

  private String description;

  private String id;

  private Boolean isLocked;

  private Boolean isUnscreenable;

  private String key;

  private FieldLastUsed lastUsed;

  private String name;

  private Long projectsCount;

  private JsonTypeBean schema;

  private Long screensCount;

  private String searcherKey;

  public Field() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Field(String id, String name, JsonTypeBean schema) {
    this.id = id;
    this.name = name;
    this.schema = schema;
  }

  public Field contextsCount(Long contextsCount) {
    this.contextsCount = contextsCount;
    return this;
  }

  /**
   * Number of contexts where the field is used.
   * @return contextsCount
  */
  
  @Schema(name = "contextsCount", description = "Number of contexts where the field is used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contextsCount")
  public Long getContextsCount() {
    return contextsCount;
  }

  public void setContextsCount(Long contextsCount) {
    this.contextsCount = contextsCount;
  }

  public Field description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the field.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Field id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the field.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Field isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

  /**
   * Whether the field is locked.
   * @return isLocked
  */
  
  @Schema(name = "isLocked", description = "Whether the field is locked.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLocked")
  public Boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public Field isUnscreenable(Boolean isUnscreenable) {
    this.isUnscreenable = isUnscreenable;
    return this;
  }

  /**
   * Whether the field is shown on screen or not.
   * @return isUnscreenable
  */
  
  @Schema(name = "isUnscreenable", description = "Whether the field is shown on screen or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isUnscreenable")
  public Boolean getIsUnscreenable() {
    return isUnscreenable;
  }

  public void setIsUnscreenable(Boolean isUnscreenable) {
    this.isUnscreenable = isUnscreenable;
  }

  public Field key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the field.
   * @return key
  */
  
  @Schema(name = "key", description = "The key of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Field lastUsed(FieldLastUsed lastUsed) {
    this.lastUsed = lastUsed;
    return this;
  }

  /**
   * Get lastUsed
   * @return lastUsed
  */
  @Valid 
  @Schema(name = "lastUsed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUsed")
  public FieldLastUsed getLastUsed() {
    return lastUsed;
  }

  public void setLastUsed(FieldLastUsed lastUsed) {
    this.lastUsed = lastUsed;
  }

  public Field name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the field.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Field projectsCount(Long projectsCount) {
    this.projectsCount = projectsCount;
    return this;
  }

  /**
   * Number of projects where the field is used.
   * @return projectsCount
  */
  
  @Schema(name = "projectsCount", description = "Number of projects where the field is used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectsCount")
  public Long getProjectsCount() {
    return projectsCount;
  }

  public void setProjectsCount(Long projectsCount) {
    this.projectsCount = projectsCount;
  }

  public Field schema(JsonTypeBean schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
  */
  @NotNull @Valid 
  @Schema(name = "schema", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schema")
  public JsonTypeBean getSchema() {
    return schema;
  }

  public void setSchema(JsonTypeBean schema) {
    this.schema = schema;
  }

  public Field screensCount(Long screensCount) {
    this.screensCount = screensCount;
    return this;
  }

  /**
   * Number of screens where the field is used.
   * @return screensCount
  */
  
  @Schema(name = "screensCount", description = "Number of screens where the field is used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("screensCount")
  public Long getScreensCount() {
    return screensCount;
  }

  public void setScreensCount(Long screensCount) {
    this.screensCount = screensCount;
  }

  public Field searcherKey(String searcherKey) {
    this.searcherKey = searcherKey;
    return this;
  }

  /**
   * The searcher key of the field. Returned for custom fields.
   * @return searcherKey
  */
  
  @Schema(name = "searcherKey", description = "The searcher key of the field. Returned for custom fields.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searcherKey")
  public String getSearcherKey() {
    return searcherKey;
  }

  public void setSearcherKey(String searcherKey) {
    this.searcherKey = searcherKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.contextsCount, field.contextsCount) &&
        Objects.equals(this.description, field.description) &&
        Objects.equals(this.id, field.id) &&
        Objects.equals(this.isLocked, field.isLocked) &&
        Objects.equals(this.isUnscreenable, field.isUnscreenable) &&
        Objects.equals(this.key, field.key) &&
        Objects.equals(this.lastUsed, field.lastUsed) &&
        Objects.equals(this.name, field.name) &&
        Objects.equals(this.projectsCount, field.projectsCount) &&
        Objects.equals(this.schema, field.schema) &&
        Objects.equals(this.screensCount, field.screensCount) &&
        Objects.equals(this.searcherKey, field.searcherKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextsCount, description, id, isLocked, isUnscreenable, key, lastUsed, name, projectsCount, schema, screensCount, searcherKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    sb.append("    contextsCount: ").append(toIndentedString(contextsCount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    isUnscreenable: ").append(toIndentedString(isUnscreenable)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectsCount: ").append(toIndentedString(projectsCount)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    screensCount: ").append(toIndentedString(screensCount)).append("\n");
    sb.append("    searcherKey: ").append(toIndentedString(searcherKey)).append("\n");
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

