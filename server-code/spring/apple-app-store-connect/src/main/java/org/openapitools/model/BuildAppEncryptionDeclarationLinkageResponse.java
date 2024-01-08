package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.BuildRelationshipsAppEncryptionDeclarationData;
import org.openapitools.model.DocumentLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildAppEncryptionDeclarationLinkageResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BuildAppEncryptionDeclarationLinkageResponse {

  private BuildRelationshipsAppEncryptionDeclarationData data;

  private DocumentLinks links;

  public BuildAppEncryptionDeclarationLinkageResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BuildAppEncryptionDeclarationLinkageResponse(BuildRelationshipsAppEncryptionDeclarationData data, DocumentLinks links) {
    this.data = data;
    this.links = links;
  }

  public BuildAppEncryptionDeclarationLinkageResponse data(BuildRelationshipsAppEncryptionDeclarationData data) {
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
  public BuildRelationshipsAppEncryptionDeclarationData getData() {
    return data;
  }

  public void setData(BuildRelationshipsAppEncryptionDeclarationData data) {
    this.data = data;
  }

  public BuildAppEncryptionDeclarationLinkageResponse links(DocumentLinks links) {
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
    BuildAppEncryptionDeclarationLinkageResponse buildAppEncryptionDeclarationLinkageResponse = (BuildAppEncryptionDeclarationLinkageResponse) o;
    return Objects.equals(this.data, buildAppEncryptionDeclarationLinkageResponse.data) &&
        Objects.equals(this.links, buildAppEncryptionDeclarationLinkageResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildAppEncryptionDeclarationLinkageResponse {\n");
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

