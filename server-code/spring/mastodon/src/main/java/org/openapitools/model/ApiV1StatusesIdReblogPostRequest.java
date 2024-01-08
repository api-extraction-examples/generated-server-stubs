package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1StatusesIdReblogPostRequest
 */

@JsonTypeName("_api_v1_statuses__id__reblog_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1StatusesIdReblogPostRequest {

  private String visibility;

  public ApiV1StatusesIdReblogPostRequest visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * any visibility except limited or direct (i.e. public, unlisted, private). Defaults to public. Currently unused in UI.
   * @return visibility
  */
  
  @Schema(name = "visibility", description = "any visibility except limited or direct (i.e. public, unlisted, private). Defaults to public. Currently unused in UI.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1StatusesIdReblogPostRequest apiV1StatusesIdReblogPostRequest = (ApiV1StatusesIdReblogPostRequest) o;
    return Objects.equals(this.visibility, apiV1StatusesIdReblogPostRequest.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1StatusesIdReblogPostRequest {\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

