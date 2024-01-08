package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BetaGroup;
import org.openapitools.model.BetaGroupResponseIncludedInner;
import org.openapitools.model.DocumentLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaGroupResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaGroupResponse {

  private BetaGroup data;

  @Valid
  private List<@Valid BetaGroupResponseIncludedInner> included;

  private DocumentLinks links;

  public BetaGroupResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BetaGroupResponse(BetaGroup data, DocumentLinks links) {
    this.data = data;
    this.links = links;
  }

  public BetaGroupResponse data(BetaGroup data) {
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
  public BetaGroup getData() {
    return data;
  }

  public void setData(BetaGroup data) {
    this.data = data;
  }

  public BetaGroupResponse included(List<@Valid BetaGroupResponseIncludedInner> included) {
    this.included = included;
    return this;
  }

  public BetaGroupResponse addIncludedItem(BetaGroupResponseIncludedInner includedItem) {
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
  public List<@Valid BetaGroupResponseIncludedInner> getIncluded() {
    return included;
  }

  public void setIncluded(List<@Valid BetaGroupResponseIncludedInner> included) {
    this.included = included;
  }

  public BetaGroupResponse links(DocumentLinks links) {
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
    BetaGroupResponse betaGroupResponse = (BetaGroupResponse) o;
    return Objects.equals(this.data, betaGroupResponse.data) &&
        Objects.equals(this.included, betaGroupResponse.included) &&
        Objects.equals(this.links, betaGroupResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaGroupResponse {\n");
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

