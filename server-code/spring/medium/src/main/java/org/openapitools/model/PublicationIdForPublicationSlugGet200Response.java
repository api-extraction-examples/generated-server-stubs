package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PublicationIdForPublicationSlugGet200Response
 */

@JsonTypeName("_publication_id_for__publication_slug__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class PublicationIdForPublicationSlugGet200Response {

  private String publicationId;

  private String publicationSlug;

  public PublicationIdForPublicationSlugGet200Response publicationId(String publicationId) {
    this.publicationId = publicationId;
    return this;
  }

  /**
   * Unique hash id of the publication.
   * @return publicationId
  */
  
  @Schema(name = "publication_id", example = "29038077e4c6", description = "Unique hash id of the publication.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publication_id")
  public String getPublicationId() {
    return publicationId;
  }

  public void setPublicationId(String publicationId) {
    this.publicationId = publicationId;
  }

  public PublicationIdForPublicationSlugGet200Response publicationSlug(String publicationSlug) {
    this.publicationSlug = publicationSlug;
    return this;
  }

  /**
   * Same publication slug that you passed in the path parameters.
   * @return publicationSlug
  */
  
  @Schema(name = "publication_slug", example = "codex", description = "Same publication slug that you passed in the path parameters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publication_slug")
  public String getPublicationSlug() {
    return publicationSlug;
  }

  public void setPublicationSlug(String publicationSlug) {
    this.publicationSlug = publicationSlug;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationIdForPublicationSlugGet200Response publicationIdForPublicationSlugGet200Response = (PublicationIdForPublicationSlugGet200Response) o;
    return Objects.equals(this.publicationId, publicationIdForPublicationSlugGet200Response.publicationId) &&
        Objects.equals(this.publicationSlug, publicationIdForPublicationSlugGet200Response.publicationSlug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationId, publicationSlug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationIdForPublicationSlugGet200Response {\n");
    sb.append("    publicationId: ").append(toIndentedString(publicationId)).append("\n");
    sb.append("    publicationSlug: ").append(toIndentedString(publicationSlug)).append("\n");
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

