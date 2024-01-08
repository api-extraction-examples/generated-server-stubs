package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UploadOperationHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UploadOperation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class UploadOperation {

  private Integer length;

  private String method;

  private Integer offset;

  @Valid
  private List<@Valid UploadOperationHeader> requestHeaders;

  private String url;

  public UploadOperation length(Integer length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
  */
  
  @Schema(name = "length", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("length")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public UploadOperation method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  
  @Schema(name = "method", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public UploadOperation offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  
  @Schema(name = "offset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public UploadOperation requestHeaders(List<@Valid UploadOperationHeader> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public UploadOperation addRequestHeadersItem(UploadOperationHeader requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new ArrayList<>();
    }
    this.requestHeaders.add(requestHeadersItem);
    return this;
  }

  /**
   * Get requestHeaders
   * @return requestHeaders
  */
  @Valid 
  @Schema(name = "requestHeaders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestHeaders")
  public List<@Valid UploadOperationHeader> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(List<@Valid UploadOperationHeader> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public UploadOperation url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
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
    UploadOperation uploadOperation = (UploadOperation) o;
    return Objects.equals(this.length, uploadOperation.length) &&
        Objects.equals(this.method, uploadOperation.method) &&
        Objects.equals(this.offset, uploadOperation.offset) &&
        Objects.equals(this.requestHeaders, uploadOperation.requestHeaders) &&
        Objects.equals(this.url, uploadOperation.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, method, offset, requestHeaders, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadOperation {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
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

