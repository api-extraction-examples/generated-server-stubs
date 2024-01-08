package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetContextKeysForPrincipalPolicy&lt;/a&gt; or &lt;a&gt;GetContextKeysForCustomPolicy&lt;/a&gt; request. 
 */

@Schema(name = "GetContextKeysForPolicyResponse", description = "Contains the response to a successful <a>GetContextKeysForPrincipalPolicy</a> or <a>GetContextKeysForCustomPolicy</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetContextKeysForPolicyResponse {

  private List contextKeyNames;

  public GetContextKeysForPolicyResponse contextKeyNames(List contextKeyNames) {
    this.contextKeyNames = contextKeyNames;
    return this;
  }

  /**
   * Get contextKeyNames
   * @return contextKeyNames
  */
  @Valid 
  @Schema(name = "ContextKeyNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContextKeyNames")
  public List getContextKeyNames() {
    return contextKeyNames;
  }

  public void setContextKeyNames(List contextKeyNames) {
    this.contextKeyNames = contextKeyNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContextKeysForPolicyResponse getContextKeysForPolicyResponse = (GetContextKeysForPolicyResponse) o;
    return Objects.equals(this.contextKeyNames, getContextKeysForPolicyResponse.contextKeyNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextKeyNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContextKeysForPolicyResponse {\n");
    sb.append("    contextKeyNames: ").append(toIndentedString(contextKeyNames)).append("\n");
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

