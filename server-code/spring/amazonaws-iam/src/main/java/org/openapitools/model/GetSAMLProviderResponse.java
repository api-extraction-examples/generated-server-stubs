package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetSAMLProvider&lt;/a&gt; request. 
 */

@Schema(name = "GetSAMLProviderResponse", description = "Contains the response to a successful <a>GetSAMLProvider</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetSAMLProviderResponse {

  private String saMLMetadataDocument;

  private OffsetDateTime createDate;

  private OffsetDateTime validUntil;

  private List tags;

  public GetSAMLProviderResponse saMLMetadataDocument(String saMLMetadataDocument) {
    this.saMLMetadataDocument = saMLMetadataDocument;
    return this;
  }

  /**
   * Get saMLMetadataDocument
   * @return saMLMetadataDocument
  */
  
  @Schema(name = "SAMLMetadataDocument", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SAMLMetadataDocument")
  public String getSaMLMetadataDocument() {
    return saMLMetadataDocument;
  }

  public void setSaMLMetadataDocument(String saMLMetadataDocument) {
    this.saMLMetadataDocument = saMLMetadataDocument;
  }

  public GetSAMLProviderResponse createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @Valid 
  @Schema(name = "CreateDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreateDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public GetSAMLProviderResponse validUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  /**
   * Get validUntil
   * @return validUntil
  */
  @Valid 
  @Schema(name = "ValidUntil", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ValidUntil")
  public OffsetDateTime getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }

  public GetSAMLProviderResponse tags(List tags) {
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
    GetSAMLProviderResponse getSAMLProviderResponse = (GetSAMLProviderResponse) o;
    return Objects.equals(this.saMLMetadataDocument, getSAMLProviderResponse.saMLMetadataDocument) &&
        Objects.equals(this.createDate, getSAMLProviderResponse.createDate) &&
        Objects.equals(this.validUntil, getSAMLProviderResponse.validUntil) &&
        Objects.equals(this.tags, getSAMLProviderResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saMLMetadataDocument, createDate, validUntil, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSAMLProviderResponse {\n");
    sb.append("    saMLMetadataDocument: ").append(toIndentedString(saMLMetadataDocument)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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

