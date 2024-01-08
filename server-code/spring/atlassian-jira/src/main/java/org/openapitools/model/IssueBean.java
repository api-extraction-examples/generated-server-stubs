package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.IncludedFields;
import org.openapitools.model.IssueBeanChangelog;
import org.openapitools.model.IssueBeanEditmeta;
import org.openapitools.model.IssueBeanOperations;
import org.openapitools.model.IssueTransition;
import org.openapitools.model.JsonTypeBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about an issue.
 */

@Schema(name = "IssueBean", description = "Details about an issue.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueBean {

  private IssueBeanChangelog changelog;

  private IssueBeanEditmeta editmeta;

  private String expand;

  @Valid
  private Map<String, Object> fields = new HashMap<>();

  private IncludedFields fieldsToInclude;

  private String id;

  private String key;

  @Valid
  private Map<String, String> names = new HashMap<>();

  private IssueBeanOperations operations;

  @Valid
  private Map<String, Object> properties = new HashMap<>();

  @Valid
  private Map<String, Object> renderedFields = new HashMap<>();

  @Valid
  private Map<String, JsonTypeBean> schema = new HashMap<>();

  private URI self;

  @Valid
  private List<@Valid IssueTransition> transitions;

  @Valid
  private Map<String, Map<String, Object>> versionedRepresentations = new HashMap<>();

  public IssueBean changelog(IssueBeanChangelog changelog) {
    this.changelog = changelog;
    return this;
  }

  /**
   * Get changelog
   * @return changelog
  */
  @Valid 
  @Schema(name = "changelog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changelog")
  public IssueBeanChangelog getChangelog() {
    return changelog;
  }

  public void setChangelog(IssueBeanChangelog changelog) {
    this.changelog = changelog;
  }

  public IssueBean editmeta(IssueBeanEditmeta editmeta) {
    this.editmeta = editmeta;
    return this;
  }

  /**
   * Get editmeta
   * @return editmeta
  */
  @Valid 
  @Schema(name = "editmeta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("editmeta")
  public IssueBeanEditmeta getEditmeta() {
    return editmeta;
  }

  public void setEditmeta(IssueBeanEditmeta editmeta) {
    this.editmeta = editmeta;
  }

  public IssueBean expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional issue details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "Expand options that include additional issue details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public IssueBean fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public IssueBean putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
  */
  
  @Schema(name = "fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }

  public IssueBean fieldsToInclude(IncludedFields fieldsToInclude) {
    this.fieldsToInclude = fieldsToInclude;
    return this;
  }

  /**
   * Get fieldsToInclude
   * @return fieldsToInclude
  */
  @Valid 
  @Schema(name = "fieldsToInclude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldsToInclude")
  public IncludedFields getFieldsToInclude() {
    return fieldsToInclude;
  }

  public void setFieldsToInclude(IncludedFields fieldsToInclude) {
    this.fieldsToInclude = fieldsToInclude;
  }

  public IssueBean id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IssueBean key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the issue.
   * @return key
  */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public IssueBean names(Map<String, String> names) {
    this.names = names;
    return this;
  }

  public IssueBean putNamesItem(String key, String namesItem) {
    if (this.names == null) {
      this.names = new HashMap<>();
    }
    this.names.put(key, namesItem);
    return this;
  }

  /**
   * The ID and name of each field present on the issue.
   * @return names
  */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID and name of each field present on the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("names")
  public Map<String, String> getNames() {
    return names;
  }

  public void setNames(Map<String, String> names) {
    this.names = names;
  }

  public IssueBean operations(IssueBeanOperations operations) {
    this.operations = operations;
    return this;
  }

  /**
   * Get operations
   * @return operations
  */
  @Valid 
  @Schema(name = "operations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operations")
  public IssueBeanOperations getOperations() {
    return operations;
  }

  public void setOperations(IssueBeanOperations operations) {
    this.operations = operations;
  }

  public IssueBean properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public IssueBean putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Details of the issue properties identified in the request.
   * @return properties
  */
  
  @Schema(name = "properties", accessMode = Schema.AccessMode.READ_ONLY, description = "Details of the issue properties identified in the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public IssueBean renderedFields(Map<String, Object> renderedFields) {
    this.renderedFields = renderedFields;
    return this;
  }

  public IssueBean putRenderedFieldsItem(String key, Object renderedFieldsItem) {
    if (this.renderedFields == null) {
      this.renderedFields = new HashMap<>();
    }
    this.renderedFields.put(key, renderedFieldsItem);
    return this;
  }

  /**
   * The rendered value of each field present on the issue.
   * @return renderedFields
  */
  
  @Schema(name = "renderedFields", accessMode = Schema.AccessMode.READ_ONLY, description = "The rendered value of each field present on the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("renderedFields")
  public Map<String, Object> getRenderedFields() {
    return renderedFields;
  }

  public void setRenderedFields(Map<String, Object> renderedFields) {
    this.renderedFields = renderedFields;
  }

  public IssueBean schema(Map<String, JsonTypeBean> schema) {
    this.schema = schema;
    return this;
  }

  public IssueBean putSchemaItem(String key, JsonTypeBean schemaItem) {
    if (this.schema == null) {
      this.schema = new HashMap<>();
    }
    this.schema.put(key, schemaItem);
    return this;
  }

  /**
   * The schema describing each field present on the issue.
   * @return schema
  */
  @Valid 
  @Schema(name = "schema", accessMode = Schema.AccessMode.READ_ONLY, description = "The schema describing each field present on the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schema")
  public Map<String, JsonTypeBean> getSchema() {
    return schema;
  }

  public void setSchema(Map<String, JsonTypeBean> schema) {
    this.schema = schema;
  }

  public IssueBean self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the issue details.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the issue details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public IssueBean transitions(List<@Valid IssueTransition> transitions) {
    this.transitions = transitions;
    return this;
  }

  public IssueBean addTransitionsItem(IssueTransition transitionsItem) {
    if (this.transitions == null) {
      this.transitions = new ArrayList<>();
    }
    this.transitions.add(transitionsItem);
    return this;
  }

  /**
   * The transitions that can be performed on the issue.
   * @return transitions
  */
  @Valid 
  @Schema(name = "transitions", accessMode = Schema.AccessMode.READ_ONLY, description = "The transitions that can be performed on the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transitions")
  public List<@Valid IssueTransition> getTransitions() {
    return transitions;
  }

  public void setTransitions(List<@Valid IssueTransition> transitions) {
    this.transitions = transitions;
  }

  public IssueBean versionedRepresentations(Map<String, Map<String, Object>> versionedRepresentations) {
    this.versionedRepresentations = versionedRepresentations;
    return this;
  }

  public IssueBean putVersionedRepresentationsItem(String key, Map<String, Object> versionedRepresentationsItem) {
    if (this.versionedRepresentations == null) {
      this.versionedRepresentations = new HashMap<>();
    }
    this.versionedRepresentations.put(key, versionedRepresentationsItem);
    return this;
  }

  /**
   * The versions of each field on the issue.
   * @return versionedRepresentations
  */
  @Valid 
  @Schema(name = "versionedRepresentations", accessMode = Schema.AccessMode.READ_ONLY, description = "The versions of each field on the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionedRepresentations")
  public Map<String, Map<String, Object>> getVersionedRepresentations() {
    return versionedRepresentations;
  }

  public void setVersionedRepresentations(Map<String, Map<String, Object>> versionedRepresentations) {
    this.versionedRepresentations = versionedRepresentations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueBean issueBean = (IssueBean) o;
    return Objects.equals(this.changelog, issueBean.changelog) &&
        Objects.equals(this.editmeta, issueBean.editmeta) &&
        Objects.equals(this.expand, issueBean.expand) &&
        Objects.equals(this.fields, issueBean.fields) &&
        Objects.equals(this.fieldsToInclude, issueBean.fieldsToInclude) &&
        Objects.equals(this.id, issueBean.id) &&
        Objects.equals(this.key, issueBean.key) &&
        Objects.equals(this.names, issueBean.names) &&
        Objects.equals(this.operations, issueBean.operations) &&
        Objects.equals(this.properties, issueBean.properties) &&
        Objects.equals(this.renderedFields, issueBean.renderedFields) &&
        Objects.equals(this.schema, issueBean.schema) &&
        Objects.equals(this.self, issueBean.self) &&
        Objects.equals(this.transitions, issueBean.transitions) &&
        Objects.equals(this.versionedRepresentations, issueBean.versionedRepresentations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changelog, editmeta, expand, fields, fieldsToInclude, id, key, names, operations, properties, renderedFields, schema, self, transitions, versionedRepresentations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueBean {\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
    sb.append("    editmeta: ").append(toIndentedString(editmeta)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    fieldsToInclude: ").append(toIndentedString(fieldsToInclude)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    renderedFields: ").append(toIndentedString(renderedFields)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
    sb.append("    versionedRepresentations: ").append(toIndentedString(versionedRepresentations)).append("\n");
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

