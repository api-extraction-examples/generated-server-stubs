package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AppPrice;
import org.openapitools.model.DocumentLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPriceResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPriceResponse {

  private AppPrice data;

  private DocumentLinks links;

  public AppPriceResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppPriceResponse(AppPrice data, DocumentLinks links) {
    this.data = data;
    this.links = links;
  }

  public AppPriceResponse data(AppPrice data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public AppPrice getData() {
    return data;
  }

  public void setData(AppPrice data) {
    this.data = data;
  }

  public AppPriceResponse links(DocumentLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @NotNull @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("links")
  public DocumentLinks getLinks() {
    return links;
  }

  public void setLinks(DocumentLinks links) {
    this.links = links;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPriceResponse appPriceResponse = (AppPriceResponse) o;
    return Objects.equals(this.data, appPriceResponse.data) &&
        Objects.equals(this.links, appPriceResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPriceResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

