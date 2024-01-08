package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppPreview;
import org.openapitools.model.AppPreviewSet;
import org.openapitools.model.PagedDocumentLinks;
import org.openapitools.model.PagingInformation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPreviewSetsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreviewSetsResponse {

  @Valid
  private List<@Valid AppPreviewSet> data = new ArrayList<>();

  @Valid
  private List<@Valid AppPreview> included;

  private PagedDocumentLinks links;

  private PagingInformation meta;

  public AppPreviewSetsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppPreviewSetsResponse(List<@Valid AppPreviewSet> data, PagedDocumentLinks links) {
    this.data = data;
    this.links = links;
  }

  public AppPreviewSetsResponse data(List<@Valid AppPreviewSet> data) {
    this.data = data;
    return this;
  }

  public AppPreviewSetsResponse addDataItem(AppPreviewSet dataItem) {
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
  public List<@Valid AppPreviewSet> getData() {
    return data;
  }

  public void setData(List<@Valid AppPreviewSet> data) {
    this.data = data;
  }

  public AppPreviewSetsResponse included(List<@Valid AppPreview> included) {
    this.included = included;
    return this;
  }

  public AppPreviewSetsResponse addIncludedItem(AppPreview includedItem) {
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
  public List<@Valid AppPreview> getIncluded() {
    return included;
  }

  public void setIncluded(List<@Valid AppPreview> included) {
    this.included = included;
  }

  public AppPreviewSetsResponse links(PagedDocumentLinks links) {
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

  public AppPreviewSetsResponse meta(PagingInformation meta) {
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
    AppPreviewSetsResponse appPreviewSetsResponse = (AppPreviewSetsResponse) o;
    return Objects.equals(this.data, appPreviewSetsResponse.data) &&
        Objects.equals(this.included, appPreviewSetsResponse.included) &&
        Objects.equals(this.links, appPreviewSetsResponse.links) &&
        Objects.equals(this.meta, appPreviewSetsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreviewSetsResponse {\n");
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

