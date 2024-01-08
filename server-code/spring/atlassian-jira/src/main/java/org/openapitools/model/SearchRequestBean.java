package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * SearchRequestBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SearchRequestBean {

  @Valid
  private List<String> expand;

  @Valid
  private List<String> fields;

  private Boolean fieldsByKeys;

  private String jql;

  private Integer maxResults = 50;

  @Valid
  private List<String> properties;

  private Integer startAt;

  /**
   * Determines how to validate the JQL query and treat the validation results. Supported values:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  The default is `strict`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
   */
  public enum ValidateQueryEnum {
    STRICT("strict"),
    
    WARN("warn"),
    
    NONE("none"),
    
    TRUE("true"),
    
    FALSE("false");

    private String value;

    ValidateQueryEnum(String value) {
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
    public static ValidateQueryEnum fromValue(String value) {
      for (ValidateQueryEnum b : ValidateQueryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ValidateQueryEnum validateQuery;

  public SearchRequestBean expand(List<String> expand) {
    this.expand = expand;
    return this;
  }

  public SearchRequestBean addExpandItem(String expandItem) {
    if (this.expand == null) {
      this.expand = new ArrayList<>();
    }
    this.expand.add(expandItem);
    return this;
  }

  /**
   * Use [expand](em>#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where `expand` is specified, `expand` is defined as a list of values. The expand options are:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `operations` Returns all possible operations for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.
   * @return expand
  */
  
  @Schema(name = "expand", description = "Use [expand](em>#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where `expand` is specified, `expand` is defined as a list of values. The expand options are:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `operations` Returns all possible operations for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public List<String> getExpand() {
    return expand;
  }

  public void setExpand(List<String> expand) {
    this.expand = expand;
  }

  public SearchRequestBean fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public SearchRequestBean addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  The default is `*navigable`.  Examples:   *  `summary,comment` Returns the summary and comments fields only.  *  `-description` Returns all navigable (default) fields except description.  *  `*all,-comment` Returns all fields except comments.  Multiple `fields` parameters can be included in a request.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields.
   * @return fields
  */
  
  @Schema(name = "fields", description = "A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  The default is `*navigable`.  Examples:   *  `summary,comment` Returns the summary and comments fields only.  *  `-description` Returns all navigable (default) fields except description.  *  `*all,-comment` Returns all fields except comments.  Multiple `fields` parameters can be included in a request.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public SearchRequestBean fieldsByKeys(Boolean fieldsByKeys) {
    this.fieldsByKeys = fieldsByKeys;
    return this;
  }

  /**
   * Reference fields by their key (rather than ID). The default is `false`.
   * @return fieldsByKeys
  */
  
  @Schema(name = "fieldsByKeys", description = "Reference fields by their key (rather than ID). The default is `false`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldsByKeys")
  public Boolean getFieldsByKeys() {
    return fieldsByKeys;
  }

  public void setFieldsByKeys(Boolean fieldsByKeys) {
    this.fieldsByKeys = fieldsByKeys;
  }

  public SearchRequestBean jql(String jql) {
    this.jql = jql;
    return this;
  }

  /**
   * A [JQL](https://confluence.atlassian.com/x/egORLQ) expression.
   * @return jql
  */
  
  @Schema(name = "jql", description = "A [JQL](https://confluence.atlassian.com/x/egORLQ) expression.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jql")
  public String getJql() {
    return jql;
  }

  public void setJql(String jql) {
    this.jql = jql;
  }

  public SearchRequestBean maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The maximum number of items to return per page.
   * @return maxResults
  */
  
  @Schema(name = "maxResults", description = "The maximum number of items to return per page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxResults")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public SearchRequestBean properties(List<String> properties) {
    this.properties = properties;
    return this;
  }

  public SearchRequestBean addPropertiesItem(String propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list.
   * @return properties
  */
  
  @Schema(name = "properties", description = "A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public List<String> getProperties() {
    return properties;
  }

  public void setProperties(List<String> properties) {
    this.properties = properties;
  }

  public SearchRequestBean startAt(Integer startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * The index of the first item to return in the page of results (page offset). The base index is `0`.
   * @return startAt
  */
  
  @Schema(name = "startAt", description = "The index of the first item to return in the page of results (page offset). The base index is `0`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startAt")
  public Integer getStartAt() {
    return startAt;
  }

  public void setStartAt(Integer startAt) {
    this.startAt = startAt;
  }

  public SearchRequestBean validateQuery(ValidateQueryEnum validateQuery) {
    this.validateQuery = validateQuery;
    return this;
  }

  /**
   * Determines how to validate the JQL query and treat the validation results. Supported values:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  The default is `strict`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
   * @return validateQuery
  */
  
  @Schema(name = "validateQuery", description = "Determines how to validate the JQL query and treat the validation results. Supported values:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  The default is `strict`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validateQuery")
  public ValidateQueryEnum getValidateQuery() {
    return validateQuery;
  }

  public void setValidateQuery(ValidateQueryEnum validateQuery) {
    this.validateQuery = validateQuery;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequestBean searchRequestBean = (SearchRequestBean) o;
    return Objects.equals(this.expand, searchRequestBean.expand) &&
        Objects.equals(this.fields, searchRequestBean.fields) &&
        Objects.equals(this.fieldsByKeys, searchRequestBean.fieldsByKeys) &&
        Objects.equals(this.jql, searchRequestBean.jql) &&
        Objects.equals(this.maxResults, searchRequestBean.maxResults) &&
        Objects.equals(this.properties, searchRequestBean.properties) &&
        Objects.equals(this.startAt, searchRequestBean.startAt) &&
        Objects.equals(this.validateQuery, searchRequestBean.validateQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, fields, fieldsByKeys, jql, maxResults, properties, startAt, validateQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequestBean {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    fieldsByKeys: ").append(toIndentedString(fieldsByKeys)).append("\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    validateQuery: ").append(toIndentedString(validateQuery)).append("\n");
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

