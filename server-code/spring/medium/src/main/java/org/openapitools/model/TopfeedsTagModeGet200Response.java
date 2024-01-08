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
 * TopfeedsTagModeGet200Response
 */

@JsonTypeName("_topfeeds__tag___mode__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class TopfeedsTagModeGet200Response {

  @Valid
  private List<String> topfeeds;

  public TopfeedsTagModeGet200Response topfeeds(List<String> topfeeds) {
    this.topfeeds = topfeeds;
    return this;
  }

  public TopfeedsTagModeGet200Response addTopfeedsItem(String topfeedsItem) {
    if (this.topfeeds == null) {
      this.topfeeds = new ArrayList<>();
    }
    this.topfeeds.add(topfeedsItem);
    return this;
  }

  /**
   * Get topfeeds
   * @return topfeeds
  */
  
  @Schema(name = "topfeeds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topfeeds")
  public List<String> getTopfeeds() {
    return topfeeds;
  }

  public void setTopfeeds(List<String> topfeeds) {
    this.topfeeds = topfeeds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopfeedsTagModeGet200Response topfeedsTagModeGet200Response = (TopfeedsTagModeGet200Response) o;
    return Objects.equals(this.topfeeds, topfeedsTagModeGet200Response.topfeeds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topfeeds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopfeedsTagModeGet200Response {\n");
    sb.append("    topfeeds: ").append(toIndentedString(topfeeds)).append("\n");
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

