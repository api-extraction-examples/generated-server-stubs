package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * LatestpostsTopicSlugGet200Response
 */

@JsonTypeName("_latestposts__topic_slug__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class LatestpostsTopicSlugGet200Response {

  @Valid
  private List<String> latestposts;

  public LatestpostsTopicSlugGet200Response latestposts(List<String> latestposts) {
    this.latestposts = latestposts;
    return this;
  }

  public LatestpostsTopicSlugGet200Response addLatestpostsItem(String latestpostsItem) {
    if (this.latestposts == null) {
      this.latestposts = new ArrayList<>();
    }
    this.latestposts.add(latestpostsItem);
    return this;
  }

  /**
   * Get latestposts
   * @return latestposts
  */
  
  @Schema(name = "latestposts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestposts")
  public List<String> getLatestposts() {
    return latestposts;
  }

  public void setLatestposts(List<String> latestposts) {
    this.latestposts = latestposts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LatestpostsTopicSlugGet200Response latestpostsTopicSlugGet200Response = (LatestpostsTopicSlugGet200Response) o;
    return Objects.equals(this.latestposts, latestpostsTopicSlugGet200Response.latestposts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestposts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatestpostsTopicSlugGet200Response {\n");
    sb.append("    latestposts: ").append(toIndentedString(latestposts)).append("\n");
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

