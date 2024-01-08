package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppEncryptionDeclarationRelationshipsAppData;
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
 * BetaTesterAppsLinkagesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaTesterAppsLinkagesResponse {

  @Valid
  private List<@Valid AppEncryptionDeclarationRelationshipsAppData> data = new ArrayList<>();

  private PagedDocumentLinks links;

  private PagingInformation meta;

  public BetaTesterAppsLinkagesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BetaTesterAppsLinkagesResponse(List<@Valid AppEncryptionDeclarationRelationshipsAppData> data, PagedDocumentLinks links) {
    this.data = data;
    this.links = links;
  }

  public BetaTesterAppsLinkagesResponse data(List<@Valid AppEncryptionDeclarationRelationshipsAppData> data) {
    this.data = data;
    return this;
  }

  public BetaTesterAppsLinkagesResponse addDataItem(AppEncryptionDeclarationRelationshipsAppData dataItem) {
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
  public List<@Valid AppEncryptionDeclarationRelationshipsAppData> getData() {
    return data;
  }

  public void setData(List<@Valid AppEncryptionDeclarationRelationshipsAppData> data) {
    this.data = data;
  }

  public BetaTesterAppsLinkagesResponse links(PagedDocumentLinks links) {
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

  public BetaTesterAppsLinkagesResponse meta(PagingInformation meta) {
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
    BetaTesterAppsLinkagesResponse betaTesterAppsLinkagesResponse = (BetaTesterAppsLinkagesResponse) o;
    return Objects.equals(this.data, betaTesterAppsLinkagesResponse.data) &&
        Objects.equals(this.links, betaTesterAppsLinkagesResponse.links) &&
        Objects.equals(this.meta, betaTesterAppsLinkagesResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaTesterAppsLinkagesResponse {\n");
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

