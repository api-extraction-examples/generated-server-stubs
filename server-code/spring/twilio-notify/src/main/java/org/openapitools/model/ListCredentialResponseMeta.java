package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListCredentialResponseMeta
 */

@JsonTypeName("ListCredentialResponse_meta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:49.917798-04:00[America/Lower_Princes]")
public class ListCredentialResponseMeta {

  private URI firstPageUrl;

  private String key;

  private JsonNullable<URI> nextPageUrl = JsonNullable.<URI>undefined();

  private Integer page;

  private Integer pageSize;

  private JsonNullable<URI> previousPageUrl = JsonNullable.<URI>undefined();

  private URI url;

  public ListCredentialResponseMeta firstPageUrl(URI firstPageUrl) {
    this.firstPageUrl = firstPageUrl;
    return this;
  }

  /**
   * Get firstPageUrl
   * @return firstPageUrl
  */
  @Valid 
  @Schema(name = "first_page_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_page_url")
  public URI getFirstPageUrl() {
    return firstPageUrl;
  }

  public void setFirstPageUrl(URI firstPageUrl) {
    this.firstPageUrl = firstPageUrl;
  }

  public ListCredentialResponseMeta key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ListCredentialResponseMeta nextPageUrl(URI nextPageUrl) {
    this.nextPageUrl = JsonNullable.of(nextPageUrl);
    return this;
  }

  /**
   * Get nextPageUrl
   * @return nextPageUrl
  */
  @Valid 
  @Schema(name = "next_page_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_page_url")
  public JsonNullable<URI> getNextPageUrl() {
    return nextPageUrl;
  }

  public void setNextPageUrl(JsonNullable<URI> nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }

  public ListCredentialResponseMeta page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
  
  @Schema(name = "page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ListCredentialResponseMeta pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  */
  
  @Schema(name = "page_size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page_size")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ListCredentialResponseMeta previousPageUrl(URI previousPageUrl) {
    this.previousPageUrl = JsonNullable.of(previousPageUrl);
    return this;
  }

  /**
   * Get previousPageUrl
   * @return previousPageUrl
  */
  @Valid 
  @Schema(name = "previous_page_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previous_page_url")
  public JsonNullable<URI> getPreviousPageUrl() {
    return previousPageUrl;
  }

  public void setPreviousPageUrl(JsonNullable<URI> previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
  }

  public ListCredentialResponseMeta url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @Valid 
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCredentialResponseMeta listCredentialResponseMeta = (ListCredentialResponseMeta) o;
    return Objects.equals(this.firstPageUrl, listCredentialResponseMeta.firstPageUrl) &&
        Objects.equals(this.key, listCredentialResponseMeta.key) &&
        equalsNullable(this.nextPageUrl, listCredentialResponseMeta.nextPageUrl) &&
        Objects.equals(this.page, listCredentialResponseMeta.page) &&
        Objects.equals(this.pageSize, listCredentialResponseMeta.pageSize) &&
        equalsNullable(this.previousPageUrl, listCredentialResponseMeta.previousPageUrl) &&
        Objects.equals(this.url, listCredentialResponseMeta.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstPageUrl, key, hashCodeNullable(nextPageUrl), page, pageSize, hashCodeNullable(previousPageUrl), url);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCredentialResponseMeta {\n");
    sb.append("    firstPageUrl: ").append(toIndentedString(firstPageUrl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    nextPageUrl: ").append(toIndentedString(nextPageUrl)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    previousPageUrl: ").append(toIndentedString(previousPageUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

