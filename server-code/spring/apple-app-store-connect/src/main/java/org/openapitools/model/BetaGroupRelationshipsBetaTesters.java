package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppBetaTestersLinkagesRequestDataInner;
import org.openapitools.model.AppRelationshipsAppInfosLinks;
import org.openapitools.model.PagingInformation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaGroupRelationshipsBetaTesters
 */

@JsonTypeName("BetaGroup_relationships_betaTesters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaGroupRelationshipsBetaTesters {

  @Valid
  private List<@Valid AppBetaTestersLinkagesRequestDataInner> data;

  private AppRelationshipsAppInfosLinks links;

  private PagingInformation meta;

  public BetaGroupRelationshipsBetaTesters data(List<@Valid AppBetaTestersLinkagesRequestDataInner> data) {
    this.data = data;
    return this;
  }

  public BetaGroupRelationshipsBetaTesters addDataItem(AppBetaTestersLinkagesRequestDataInner dataItem) {
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
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid AppBetaTestersLinkagesRequestDataInner> getData() {
    return data;
  }

  public void setData(List<@Valid AppBetaTestersLinkagesRequestDataInner> data) {
    this.data = data;
  }

  public BetaGroupRelationshipsBetaTesters links(AppRelationshipsAppInfosLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public AppRelationshipsAppInfosLinks getLinks() {
    return links;
  }

  public void setLinks(AppRelationshipsAppInfosLinks links) {
    this.links = links;
  }

  public BetaGroupRelationshipsBetaTesters meta(PagingInformation meta) {
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
    BetaGroupRelationshipsBetaTesters betaGroupRelationshipsBetaTesters = (BetaGroupRelationshipsBetaTesters) o;
    return Objects.equals(this.data, betaGroupRelationshipsBetaTesters.data) &&
        Objects.equals(this.links, betaGroupRelationshipsBetaTesters.links) &&
        Objects.equals(this.meta, betaGroupRelationshipsBetaTesters.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaGroupRelationshipsBetaTesters {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

