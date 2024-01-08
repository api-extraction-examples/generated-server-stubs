package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.JsonNode;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An issue ID with entity property values. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.
 */

@Schema(name = "IssueEntityPropertiesForMultiUpdate", description = "An issue ID with entity property values. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueEntityPropertiesForMultiUpdate {

  private Long issueID;

  @Valid
  private Map<String, JsonNode> properties = new HashMap<>();

  public IssueEntityPropertiesForMultiUpdate issueID(Long issueID) {
    this.issueID = issueID;
    return this;
  }

  /**
   * The ID of the issue.
   * @return issueID
  */
  
  @Schema(name = "issueID", description = "The ID of the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueID")
  public Long getIssueID() {
    return issueID;
  }

  public void setIssueID(Long issueID) {
    this.issueID = issueID;
  }

  public IssueEntityPropertiesForMultiUpdate properties(Map<String, JsonNode> properties) {
    this.properties = properties;
    return this;
  }

  public IssueEntityPropertiesForMultiUpdate putPropertiesItem(String key, JsonNode propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Entity properties to set on the issue. The maximum length of an issue property value is 32768 characters.
   * @return properties
  */
  @Valid @Size(min = 1, max = 10) 
  @Schema(name = "properties", description = "Entity properties to set on the issue. The maximum length of an issue property value is 32768 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, JsonNode> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, JsonNode> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueEntityPropertiesForMultiUpdate issueEntityPropertiesForMultiUpdate = (IssueEntityPropertiesForMultiUpdate) o;
    return Objects.equals(this.issueID, issueEntityPropertiesForMultiUpdate.issueID) &&
        Objects.equals(this.properties, issueEntityPropertiesForMultiUpdate.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueID, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueEntityPropertiesForMultiUpdate {\n");
    sb.append("    issueID: ").append(toIndentedString(issueID)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

