package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PagedDocumentLinks;
import org.openapitools.model.PagingInformation;
import org.openapitools.model.Profile;
import org.openapitools.model.ProfileResponseIncludedInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProfilesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class ProfilesResponse {

  @Valid
  private List<@Valid Profile> data = new ArrayList<>();

  @Valid
  private List<@Valid ProfileResponseIncludedInner> included;

  private PagedDocumentLinks links;

  private PagingInformation meta;

  public ProfilesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfilesResponse(List<@Valid Profile> data, PagedDocumentLinks links) {
    this.data = data;
    this.links = links;
  }

  public ProfilesResponse data(List<@Valid Profile> data) {
    this.data = data;
    return this;
  }

  public ProfilesResponse addDataItem(Profile dataItem) {
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
  public List<@Valid Profile> getData() {
    return data;
  }

  public void setData(List<@Valid Profile> data) {
    this.data = data;
  }

  public ProfilesResponse included(List<@Valid ProfileResponseIncludedInner> included) {
    this.included = included;
    return this;
  }

  public ProfilesResponse addIncludedItem(ProfileResponseIncludedInner includedItem) {
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
  public List<@Valid ProfileResponseIncludedInner> getIncluded() {
    return included;
  }

  public void setIncluded(List<@Valid ProfileResponseIncludedInner> included) {
    this.included = included;
  }

  public ProfilesResponse links(PagedDocumentLinks links) {
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

  public ProfilesResponse meta(PagingInformation meta) {
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
    ProfilesResponse profilesResponse = (ProfilesResponse) o;
    return Objects.equals(this.data, profilesResponse.data) &&
        Objects.equals(this.included, profilesResponse.included) &&
        Objects.equals(this.links, profilesResponse.links) &&
        Objects.equals(this.meta, profilesResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfilesResponse {\n");
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

