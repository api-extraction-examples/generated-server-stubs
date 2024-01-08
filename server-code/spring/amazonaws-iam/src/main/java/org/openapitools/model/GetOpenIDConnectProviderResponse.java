package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetOpenIDConnectProvider&lt;/a&gt; request. 
 */

@Schema(name = "GetOpenIDConnectProviderResponse", description = "Contains the response to a successful <a>GetOpenIDConnectProvider</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetOpenIDConnectProviderResponse {

  private String url;

  private List clientIDList;

  private List thumbprintList;

  private OffsetDateTime createDate;

  private List tags;

  public GetOpenIDConnectProviderResponse url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "Url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GetOpenIDConnectProviderResponse clientIDList(List clientIDList) {
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

  public GetOpenIDConnectProviderResponse thumbprintList(List thumbprintList) {
    this.thumbprintList = thumbprintList;
    return this;
  }

  /**
   * Get thumbprintList
   * @return thumbprintList
  */
  @Valid 
  @Schema(name = "ThumbprintList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ThumbprintList")
  public List getThumbprintList() {
    return thumbprintList;
  }

  public void setThumbprintList(List thumbprintList) {
    this.thumbprintList = thumbprintList;
  }

  public GetOpenIDConnectProviderResponse createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @Valid 
  @Schema(name = "CreateDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreateDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public GetOpenIDConnectProviderResponse tags(List tags) {
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
    GetOpenIDConnectProviderResponse getOpenIDConnectProviderResponse = (GetOpenIDConnectProviderResponse) o;
    return Objects.equals(this.url, getOpenIDConnectProviderResponse.url) &&
        Objects.equals(this.clientIDList, getOpenIDConnectProviderResponse.clientIDList) &&
        Objects.equals(this.thumbprintList, getOpenIDConnectProviderResponse.thumbprintList) &&
        Objects.equals(this.createDate, getOpenIDConnectProviderResponse.createDate) &&
        Objects.equals(this.tags, getOpenIDConnectProviderResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, clientIDList, thumbprintList, createDate, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOpenIDConnectProviderResponse {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    clientIDList: ").append(toIndentedString(clientIDList)).append("\n");
    sb.append("    thumbprintList: ").append(toIndentedString(thumbprintList)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

