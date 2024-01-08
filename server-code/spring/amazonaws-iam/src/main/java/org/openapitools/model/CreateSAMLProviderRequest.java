package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateSAMLProviderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateSAMLProviderRequest {

  private String saMLMetadataDocument;

  private String name;

  private List tags;

  public CreateSAMLProviderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateSAMLProviderRequest(String saMLMetadataDocument, String name) {
    this.saMLMetadataDocument = saMLMetadataDocument;
    this.name = name;
  }

  public CreateSAMLProviderRequest saMLMetadataDocument(String saMLMetadataDocument) {
    this.saMLMetadataDocument = saMLMetadataDocument;
    return this;
  }

  /**
   * Get saMLMetadataDocument
   * @return saMLMetadataDocument
  */
  @NotNull 
  @Schema(name = "SAMLMetadataDocument", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SAMLMetadataDocument")
  public String getSaMLMetadataDocument() {
    return saMLMetadataDocument;
  }

  public void setSaMLMetadataDocument(String saMLMetadataDocument) {
    this.saMLMetadataDocument = saMLMetadataDocument;
  }

  public CreateSAMLProviderRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateSAMLProviderRequest tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @Valid 
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tags")
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSAMLProviderRequest createSAMLProviderRequest = (CreateSAMLProviderRequest) o;
    return Objects.equals(this.saMLMetadataDocument, createSAMLProviderRequest.saMLMetadataDocument) &&
        Objects.equals(this.name, createSAMLProviderRequest.name) &&
        Objects.equals(this.tags, createSAMLProviderRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saMLMetadataDocument, name, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSAMLProviderRequest {\n");
    sb.append("    saMLMetadataDocument: ").append(toIndentedString(saMLMetadataDocument)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

