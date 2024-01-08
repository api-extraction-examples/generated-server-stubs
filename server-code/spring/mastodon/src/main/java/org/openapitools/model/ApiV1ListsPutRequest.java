package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1ListsPutRequest
 */

@JsonTypeName("_api_v1_lists_put_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1ListsPutRequest {

  /**
   * Enumerable oneOf followed list none. Defaults to list.
   */
  public enum RepliesPolicyEnum {
    FOLLOWED("followed"),
    
    LIST("list"),
    
    NONE("none");

    private String value;

    RepliesPolicyEnum(String value) {
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
    public static RepliesPolicyEnum fromValue(String value) {
      for (RepliesPolicyEnum b : RepliesPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RepliesPolicyEnum repliesPolicy = RepliesPolicyEnum.LIST;

  private String title;

  public ApiV1ListsPutRequest repliesPolicy(RepliesPolicyEnum repliesPolicy) {
    this.repliesPolicy = repliesPolicy;
    return this;
  }

  /**
   * Enumerable oneOf followed list none. Defaults to list.
   * @return repliesPolicy
  */
  
  @Schema(name = "replies_policy", description = "Enumerable oneOf followed list none. Defaults to list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replies_policy")
  public RepliesPolicyEnum getRepliesPolicy() {
    return repliesPolicy;
  }

  public void setRepliesPolicy(RepliesPolicyEnum repliesPolicy) {
    this.repliesPolicy = repliesPolicy;
  }

  public ApiV1ListsPutRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the list to be created.
   * @return title
  */
  
  @Schema(name = "title", description = "The title of the list to be created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1ListsPutRequest apiV1ListsPutRequest = (ApiV1ListsPutRequest) o;
    return Objects.equals(this.repliesPolicy, apiV1ListsPutRequest.repliesPolicy) &&
        Objects.equals(this.title, apiV1ListsPutRequest.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repliesPolicy, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1ListsPutRequest {\n");
    sb.append("    repliesPolicy: ").append(toIndentedString(repliesPolicy)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

