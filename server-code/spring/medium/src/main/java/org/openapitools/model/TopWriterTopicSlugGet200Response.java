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
 * TopWriterTopicSlugGet200Response
 */

@JsonTypeName("_top_writer__topic_slug__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class TopWriterTopicSlugGet200Response {

  @Valid
  private List<String> topWriters;

  public TopWriterTopicSlugGet200Response topWriters(List<String> topWriters) {
    this.topWriters = topWriters;
    return this;
  }

  public TopWriterTopicSlugGet200Response addTopWritersItem(String topWritersItem) {
    if (this.topWriters == null) {
      this.topWriters = new ArrayList<>();
    }
    this.topWriters.add(topWritersItem);
    return this;
  }

  /**
   * Get topWriters
   * @return topWriters
  */
  
  @Schema(name = "top_writers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("top_writers")
  public List<String> getTopWriters() {
    return topWriters;
  }

  public void setTopWriters(List<String> topWriters) {
    this.topWriters = topWriters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopWriterTopicSlugGet200Response topWriterTopicSlugGet200Response = (TopWriterTopicSlugGet200Response) o;
    return Objects.equals(this.topWriters, topWriterTopicSlugGet200Response.topWriters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topWriters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopWriterTopicSlugGet200Response {\n");
    sb.append("    topWriters: ").append(toIndentedString(topWriters)).append("\n");
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

