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
 * Contains the response to a successful &lt;a&gt;CreateOpenIDConnectProvider&lt;/a&gt; request. 
 */

@Schema(name = "CreateOpenIDConnectProviderResponse", description = "Contains the response to a successful <a>CreateOpenIDConnectProvider</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateOpenIDConnectProviderResponse {

  private String openIDConnectProviderArn;

  private List tags;

  public CreateOpenIDConnectProviderResponse openIDConnectProviderArn(String openIDConnectProviderArn) {
    this.openIDConnectProviderArn = openIDConnectProviderArn;
    return this;
  }

  /**
   * Get openIDConnectProviderArn
   * @return openIDConnectProviderArn
  */
  
  @Schema(name = "OpenIDConnectProviderArn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OpenIDConnectProviderArn")
  public String getOpenIDConnectProviderArn() {
    return openIDConnectProviderArn;
  }

  public void setOpenIDConnectProviderArn(String openIDConnectProviderArn) {
    this.openIDConnectProviderArn = openIDConnectProviderArn;
  }

  public CreateOpenIDConnectProviderResponse tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @Valid 
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tags")
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOpenIDConnectProviderResponse createOpenIDConnectProviderResponse = (CreateOpenIDConnectProviderResponse) o;
    return Objects.equals(this.openIDConnectProviderArn, createOpenIDConnectProviderResponse.openIDConnectProviderArn) &&
        Objects.equals(this.tags, createOpenIDConnectProviderResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openIDConnectProviderArn, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOpenIDConnectProviderResponse {\n");
    sb.append("    openIDConnectProviderArn: ").append(toIndentedString(openIDConnectProviderArn)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

