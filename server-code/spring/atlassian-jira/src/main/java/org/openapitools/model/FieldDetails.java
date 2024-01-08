package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.JsonTypeBean;
import org.openapitools.model.Scope;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a field.
 */

@Schema(name = "FieldDetails", description = "Details about a field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldDetails {

  @Valid
  private Set<String> clauseNames;

  private Boolean custom;

  private String id;

  private String key;

  private String name;

  private Boolean navigable;

  private Boolean orderable;

  private JsonTypeBean schema;

  private Scope scope;

  private Boolean searchable;

  public FieldDetails clauseNames(Set<String> clauseNames) {
    this.clauseNames = clauseNames;
    return this;
  }

  public FieldDetails addClauseNamesItem(String clauseNamesItem) {
    if (this.clauseNames == null) {
      this.clauseNames = new LinkedHashSet<>();
    }
    this.clauseNames.add(clauseNamesItem);
    return this;
  }

  /**
   * The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).
   * @return clauseNames
  */
  
  @Schema(name = "clauseNames", description = "The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clauseNames")
  public Set<String> getClauseNames() {
    return clauseNames;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setClauseNames(Set<String> clauseNames) {
    this.clauseNames = clauseNames;
  }

  public FieldDetails custom(Boolean custom) {
    this.custom = custom;
    return this;
  }

  /**
   * Whether the field is a custom field.
   * @return custom
  */
  
  @Schema(name = "custom", description = "Whether the field is a custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom")
  public Boolean getCustom() {
    return custom;
  }

  public void setCustom(Boolean custom) {
    this.custom = custom;
  }

  public FieldDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the field.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FieldDetails key(String key) {
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

  public FieldDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the field.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FieldDetails navigable(Boolean navigable) {
    this.navigable = navigable;
    return this;
  }

  /**
   * Whether the field can be used as a column on the issue navigator.
   * @return navigable
  */
  
  @Schema(name = "navigable", description = "Whether the field can be used as a column on the issue navigator.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("navigable")
  public Boolean getNavigable() {
    return navigable;
  }

  public void setNavigable(Boolean navigable) {
    this.navigable = navigable;
  }

  public FieldDetails orderable(Boolean orderable) {
    this.orderable = orderable;
    return this;
  }

  /**
   * Whether the content of the field can be used to order lists.
   * @return orderable
  */
  
  @Schema(name = "orderable", description = "Whether the content of the field can be used to order lists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderable")
  public Boolean getOrderable() {
    return orderable;
  }

  public void setOrderable(Boolean orderable) {
    this.orderable = orderable;
  }

  public FieldDetails schema(JsonTypeBean schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
  */
  @Valid 
  @Schema(name = "schema", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schema")
  public JsonTypeBean getSchema() {
    return schema;
  }

  public void setSchema(JsonTypeBean schema) {
    this.schema = schema;
  }

  public FieldDetails scope(Scope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @Valid 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public Scope getScope() {
    return scope;
  }

  public void setScope(Scope scope) {
    this.scope = scope;
  }

  public FieldDetails searchable(Boolean searchable) {
    this.searchable = searchable;
    return this;
  }

  /**
   * Whether the content of the field can be searched.
   * @return searchable
  */
  
  @Schema(name = "searchable", description = "Whether the content of the field can be searched.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchable")
  public Boolean getSearchable() {
    return searchable;
  }

  public void setSearchable(Boolean searchable) {
    this.searchable = searchable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldDetails fieldDetails = (FieldDetails) o;
    return Objects.equals(this.clauseNames, fieldDetails.clauseNames) &&
        Objects.equals(this.custom, fieldDetails.custom) &&
        Objects.equals(this.id, fieldDetails.id) &&
        Objects.equals(this.key, fieldDetails.key) &&
        Objects.equals(this.name, fieldDetails.name) &&
        Objects.equals(this.navigable, fieldDetails.navigable) &&
        Objects.equals(this.orderable, fieldDetails.orderable) &&
        Objects.equals(this.schema, fieldDetails.schema) &&
        Objects.equals(this.scope, fieldDetails.scope) &&
        Objects.equals(this.searchable, fieldDetails.searchable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clauseNames, custom, id, key, name, navigable, orderable, schema, scope, searchable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldDetails {\n");
    sb.append("    clauseNames: ").append(toIndentedString(clauseNames)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    navigable: ").append(toIndentedString(navigable)).append("\n");
    sb.append("    orderable: ").append(toIndentedString(orderable)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
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

