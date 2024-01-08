package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.
 */

@Schema(name = "IssueContextVariable", description = "An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueContextVariable implements CustomContextVariable {

  private Long id;

  private String key;

  private String type;

  public IssueContextVariable() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueContextVariable(String type) {
    this.type = type;
  }

  public IssueContextVariable id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The issue ID.
   * @return id
  */
  
  @Schema(name = "id", description = "The issue ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public IssueContextVariable key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The issue key.
   * @return key
  */
  
  @Schema(name = "key", description = "The issue key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public IssueContextVariable type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of custom context variable.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Type of custom context variable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    IssueContextVariable issueContextVariable = (IssueContextVariable) o;
    return Objects.equals(this.id, issueContextVariable.id) &&
        Objects.equals(this.key, issueContextVariable.key) &&
        Objects.equals(this.type, issueContextVariable.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueContextVariable {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

