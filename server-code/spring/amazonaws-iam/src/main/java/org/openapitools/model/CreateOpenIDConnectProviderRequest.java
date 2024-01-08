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
 * CreateOpenIDConnectProviderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateOpenIDConnectProviderRequest {

  private String url;

  private List clientIDList;

  private List thumbprintList;

  private List tags;

  public CreateOpenIDConnectProviderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateOpenIDConnectProviderRequest(String url, List thumbprintList) {
    this.url = url;
    this.thumbprintList = thumbprintList;
  }

  public CreateOpenIDConnectProviderRequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @NotNull 
  @Schema(name = "Url", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CreateOpenIDConnectProviderRequest clientIDList(List clientIDList) {
    this.clientIDList = clientIDList;
    return this;
  }

  /**
   * Get clientIDList
   * @return clientIDList
  */
  @Valid 
  @Schema(name = "ClientIDList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClientIDList")
  public List getClientIDList() {
    return clientIDList;
  }

  public void setClientIDList(List clientIDList) {
    this.clientIDList = clientIDList;
  }

  public CreateOpenIDConnectProviderRequest thumbprintList(List thumbprintList) {
    this.thumbprintList = thumbprintList;
    return this;
  }

  /**
   * Get thumbprintList
   * @return thumbprintList
  */
  @NotNull @Valid 
  @Schema(name = "ThumbprintList", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ThumbprintList")
  public List getThumbprintList() {
    return thumbprintList;
  }

  public void setThumbprintList(List thumbprintList) {
    this.thumbprintList = thumbprintList;
  }

  public CreateOpenIDConnectProviderRequest tags(List tags) {
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
    CreateOpenIDConnectProviderRequest createOpenIDConnectProviderRequest = (CreateOpenIDConnectProviderRequest) o;
    return Objects.equals(this.url, createOpenIDConnectProviderRequest.url) &&
        Objects.equals(this.clientIDList, createOpenIDConnectProviderRequest.clientIDList) &&
        Objects.equals(this.thumbprintList, createOpenIDConnectProviderRequest.thumbprintList) &&
        Objects.equals(this.tags, createOpenIDConnectProviderRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, clientIDList, thumbprintList, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOpenIDConnectProviderRequest {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    clientIDList: ").append(toIndentedString(clientIDList)).append("\n");
    sb.append("    thumbprintList: ").append(toIndentedString(thumbprintList)).append("\n");
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

