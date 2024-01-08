package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PublicationPublicationIdArticlesGet200Response
 */

@JsonTypeName("_publication__publication_id__articles_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class PublicationPublicationIdArticlesGet200Response {

  @Valid
  private List<String> publicationArticles;

  public PublicationPublicationIdArticlesGet200Response publicationArticles(List<String> publicationArticles) {
    this.publicationArticles = publicationArticles;
    return this;
  }

  public PublicationPublicationIdArticlesGet200Response addPublicationArticlesItem(String publicationArticlesItem) {
    if (this.publicationArticles == null) {
      this.publicationArticles = new ArrayList<>();
    }
    this.publicationArticles.add(publicationArticlesItem);
    return this;
  }

  /**
   * Get publicationArticles
   * @return publicationArticles
  */
  
  @Schema(name = "publication_articles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publication_articles")
  public List<String> getPublicationArticles() {
    return publicationArticles;
  }

  public void setPublicationArticles(List<String> publicationArticles) {
    this.publicationArticles = publicationArticles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationPublicationIdArticlesGet200Response publicationPublicationIdArticlesGet200Response = (PublicationPublicationIdArticlesGet200Response) o;
    return Objects.equals(this.publicationArticles, publicationPublicationIdArticlesGet200Response.publicationArticles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationArticles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationPublicationIdArticlesGet200Response {\n");
    sb.append("    publicationArticles: ").append(toIndentedString(publicationArticles)).append("\n");
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

