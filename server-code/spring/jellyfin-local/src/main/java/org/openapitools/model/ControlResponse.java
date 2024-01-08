package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
 * ControlResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ControlResponse {

  @Valid
  private JsonNullable<Map<String, String>> headers = JsonNullable.<Map<String, String>>undefined();

  private Boolean isSuccessful;

  private JsonNullable<String> xml = JsonNullable.<String>undefined();

  public ControlResponse headers(Map<String, String> headers) {
    this.headers = JsonNullable.of(headers);
    return this;
  }

  public ControlResponse putHeadersItem(String key, String headersItem) {
    if (this.headers == null || !this.headers.isPresent()) {
      this.headers = JsonNullable.of(new HashMap<>());
    }
    this.headers.get().put(key, headersItem);
    return this;
  }

  /**
   * Get headers
   * @return headers
  */
  
  @Schema(name = "Headers", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Headers")
  public JsonNullable<Map<String, String>> getHeaders() {
    return headers;
  }

  public void setHeaders(JsonNullable<Map<String, String>> headers) {
    this.headers = headers;
  }

  public ControlResponse isSuccessful(Boolean isSuccessful) {
    this.isSuccessful = isSuccessful;
    return this;
  }

  /**
   * Get isSuccessful
   * @return isSuccessful
  */
  
  @Schema(name = "IsSuccessful", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsSuccessful")
  public Boolean getIsSuccessful() {
    return isSuccessful;
  }

  public void setIsSuccessful(Boolean isSuccessful) {
    this.isSuccessful = isSuccessful;
  }

  public ControlResponse xml(String xml) {
    this.xml = JsonNullable.of(xml);
    return this;
  }

  /**
   * Get xml
   * @return xml
  */
  
  @Schema(name = "Xml", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Xml")
  public JsonNullable<String> getXml() {
    return xml;
  }

  public void setXml(JsonNullable<String> xml) {
    this.xml = xml;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlResponse controlResponse = (ControlResponse) o;
    return equalsNullable(this.headers, controlResponse.headers) &&
        Objects.equals(this.isSuccessful, controlResponse.isSuccessful) &&
        equalsNullable(this.xml, controlResponse.xml);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(headers), isSuccessful, hashCodeNullable(xml));
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
    sb.append("class ControlResponse {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    isSuccessful: ").append(toIndentedString(isSuccessful)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
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

