package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppPricePoint;
import org.openapitools.model.PagedDocumentLinks;
import org.openapitools.model.PagingInformation;
import org.openapitools.model.Territory;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPricePointsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPricePointsResponse {

  @Valid
  private List<@Valid AppPricePoint> data = new ArrayList<>();

  @Valid
  private List<@Valid Territory> included;

  private PagedDocumentLinks links;

  private PagingInformation meta;

  public AppPricePointsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppPricePointsResponse(List<@Valid AppPricePoint> data, PagedDocumentLinks links) {
    this.data = data;
    this.links = links;
  }

  public AppPricePointsResponse data(List<@Valid AppPricePoint> data) {
    this.data = data;
    return this;
  }

  public AppPricePointsResponse addDataItem(AppPricePoint dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public List<@Valid AppPricePoint> getData() {
    return data;
  }

  public void setData(List<@Valid AppPricePoint> data) {
    this.data = data;
  }

  public AppPricePointsResponse included(List<@Valid Territory> included) {
    this.included = included;
    return this;
  }

  public AppPricePointsResponse addIncludedItem(Territory includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

  /**
   * Get included
   * @return included
  */
  @Valid 
  @Schema(name = "included", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("included")
  public List<@Valid Territory> getIncluded() {
    return included;
  }

  public void setIncluded(List<@Valid Territory> included) {
    this.included = included;
  }

  public AppPricePointsResponse links(PagedDocumentLinks links) {
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
  public PagedDocumentLinks getLinks() {
    return links;
  }

  public void setLinks(PagedDocumentLinks links) {
    this.links = links;
  }

  public AppPricePointsResponse meta(PagingInformation meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @Valid 
  @Schema(name = "meta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meta")
  public PagingInformation getMeta() {
    return meta;
  }

  public void setMeta(PagingInformation meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPricePointsResponse appPricePointsResponse = (AppPricePointsResponse) o;
    return Objects.equals(this.data, appPricePointsResponse.data) &&
        Objects.equals(this.included, appPricePointsResponse.included) &&
        Objects.equals(this.links, appPricePointsResponse.links) &&
        Objects.equals(this.meta, appPricePointsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPricePointsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

