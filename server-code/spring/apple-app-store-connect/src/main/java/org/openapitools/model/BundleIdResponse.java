package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BundleId;
import org.openapitools.model.BundleIdResponseIncludedInner;
import org.openapitools.model.DocumentLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BundleIdResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BundleIdResponse {

  private BundleId data;

  @Valid
  private List<@Valid BundleIdResponseIncludedInner> included;

  private DocumentLinks links;

  public BundleIdResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BundleIdResponse(BundleId data, DocumentLinks links) {
    this.data = data;
    this.links = links;
  }

  public BundleIdResponse data(BundleId data) {
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
  public BundleId getData() {
    return data;
  }

  public void setData(BundleId data) {
    this.data = data;
  }

  public BundleIdResponse included(List<@Valid BundleIdResponseIncludedInner> included) {
    this.included = included;
    return this;
  }

  public BundleIdResponse addIncludedItem(BundleIdResponseIncludedInner includedItem) {
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
  public List<@Valid BundleIdResponseIncludedInner> getIncluded() {
    return included;
  }

  public void setIncluded(List<@Valid BundleIdResponseIncludedInner> included) {
    this.included = included;
  }

  public BundleIdResponse links(DocumentLinks links) {
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
    BundleIdResponse bundleIdResponse = (BundleIdResponse) o;
    return Objects.equals(this.data, bundleIdResponse.data) &&
        Objects.equals(this.included, bundleIdResponse.included) &&
        Objects.equals(this.links, bundleIdResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleIdResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

