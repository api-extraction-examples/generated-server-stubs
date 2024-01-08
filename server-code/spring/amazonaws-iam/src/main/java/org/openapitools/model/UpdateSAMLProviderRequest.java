package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateSAMLProviderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateSAMLProviderRequest {

  private String saMLMetadataDocument;

  private String saMLProviderArn;

  public UpdateSAMLProviderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateSAMLProviderRequest(String saMLMetadataDocument, String saMLProviderArn) {
    this.saMLMetadataDocument = saMLMetadataDocument;
    this.saMLProviderArn = saMLProviderArn;
  }

  public UpdateSAMLProviderRequest saMLMetadataDocument(String saMLMetadataDocument) {
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

  public UpdateSAMLProviderRequest saMLProviderArn(String saMLProviderArn) {
    this.saMLProviderArn = saMLProviderArn;
    return this;
  }

  /**
   * Get saMLProviderArn
   * @return saMLProviderArn
  */
  @NotNull 
  @Schema(name = "SAMLProviderArn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SAMLProviderArn")
  public String getSaMLProviderArn() {
    return saMLProviderArn;
  }

  public void setSaMLProviderArn(String saMLProviderArn) {
    this.saMLProviderArn = saMLProviderArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSAMLProviderRequest updateSAMLProviderRequest = (UpdateSAMLProviderRequest) o;
    return Objects.equals(this.saMLMetadataDocument, updateSAMLProviderRequest.saMLMetadataDocument) &&
        Objects.equals(this.saMLProviderArn, updateSAMLProviderRequest.saMLProviderArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saMLMetadataDocument, saMLProviderArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSAMLProviderRequest {\n");
    sb.append("    saMLMetadataDocument: ").append(toIndentedString(saMLMetadataDocument)).append("\n");
    sb.append("    saMLProviderArn: ").append(toIndentedString(saMLProviderArn)).append("\n");
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

