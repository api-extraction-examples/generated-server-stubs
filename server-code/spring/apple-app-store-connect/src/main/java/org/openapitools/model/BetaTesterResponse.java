package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BetaTester;
import org.openapitools.model.BetaTesterResponseIncludedInner;
import org.openapitools.model.DocumentLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaTesterResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaTesterResponse {

  private BetaTester data;

  @Valid
  private List<@Valid BetaTesterResponseIncludedInner> included;

  private DocumentLinks links;

  public BetaTesterResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BetaTesterResponse(BetaTester data, DocumentLinks links) {
    this.data = data;
    this.links = links;
  }

  public BetaTesterResponse data(BetaTester data) {
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
  public BetaTester getData() {
    return data;
  }

  public void setData(BetaTester data) {
    this.data = data;
  }

  public BetaTesterResponse included(List<@Valid BetaTesterResponseIncludedInner> included) {
    this.included = included;
    return this;
  }

  public BetaTesterResponse addIncludedItem(BetaTesterResponseIncludedInner includedItem) {
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
  public List<@Valid BetaTesterResponseIncludedInner> getIncluded() {
    return included;
  }

  public void setIncluded(List<@Valid BetaTesterResponseIncludedInner> included) {
    this.included = included;
  }

  public BetaTesterResponse links(DocumentLinks links) {
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
    BetaTesterResponse betaTesterResponse = (BetaTesterResponse) o;
    return Objects.equals(this.data, betaTesterResponse.data) &&
        Objects.equals(this.included, betaTesterResponse.included) &&
        Objects.equals(this.links, betaTesterResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaTesterResponse {\n");
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

