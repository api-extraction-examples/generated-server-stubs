package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IssueUpdateDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * IssuesUpdateBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssuesUpdateBean {

  @Valid
  private List<@Valid IssueUpdateDetails> issueUpdates;

  public IssuesUpdateBean issueUpdates(List<@Valid IssueUpdateDetails> issueUpdates) {
    this.issueUpdates = issueUpdates;
    return this;
  }

  public IssuesUpdateBean addIssueUpdatesItem(IssueUpdateDetails issueUpdatesItem) {
    if (this.issueUpdates == null) {
      this.issueUpdates = new ArrayList<>();
    }
    this.issueUpdates.add(issueUpdatesItem);
    return this;
  }

  /**
   * Get issueUpdates
   * @return issueUpdates
  */
  @Valid 
  @Schema(name = "issueUpdates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueUpdates")
  public List<@Valid IssueUpdateDetails> getIssueUpdates() {
    return issueUpdates;
  }

  public void setIssueUpdates(List<@Valid IssueUpdateDetails> issueUpdates) {
    this.issueUpdates = issueUpdates;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public IssuesUpdateBean putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesUpdateBean issuesUpdateBean = (IssuesUpdateBean) o;
    return Objects.equals(this.issueUpdates, issuesUpdateBean.issueUpdates) &&
    Objects.equals(this.additionalProperties, issuesUpdateBean.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueUpdates, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesUpdateBean {\n");
    sb.append("    issueUpdates: ").append(toIndentedString(issueUpdates)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
