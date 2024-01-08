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
 * PublicationPublicationIdNewsletterGet200Response
 */

@JsonTypeName("_publication__publication_id__newsletter_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class PublicationPublicationIdNewsletterGet200Response {

  private String creatorId;

  private String description;

  private String id;

  private String image;

  private String name;

  private String slug;

  private Integer subscribers;

  public PublicationPublicationIdNewsletterGet200Response creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  /**
   * Get creatorId
   * @return creatorId
  */
  
  @Schema(name = "creator_id", example = "aea8a19ea239", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creator_id")
  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public PublicationPublicationIdNewsletterGet200Response description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", example = "We have moved our newsletter. Subscribe → https://ws.towardsai.net/subscribe", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PublicationPublicationIdNewsletterGet200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "d710a73cd042", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PublicationPublicationIdNewsletterGet200Response image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  */
  
  @Schema(name = "image", example = "https://miro.medium.com/1*j2OVd7j2o2FHeE7T8TzpXw.png", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public PublicationPublicationIdNewsletterGet200Response name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "This AI newsletter is all you need", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PublicationPublicationIdNewsletterGet200Response slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
  */
  
  @Schema(name = "slug", example = "this-ai-newsletter-is-all-you-need", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public PublicationPublicationIdNewsletterGet200Response subscribers(Integer subscribers) {
    this.subscribers = subscribers;
    return this;
  }

  /**
   * Get subscribers
   * @return subscribers
  */
  
  @Schema(name = "subscribers", example = "6752", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscribers")
  public Integer getSubscribers() {
    return subscribers;
  }

  public void setSubscribers(Integer subscribers) {
    this.subscribers = subscribers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationPublicationIdNewsletterGet200Response publicationPublicationIdNewsletterGet200Response = (PublicationPublicationIdNewsletterGet200Response) o;
    return Objects.equals(this.creatorId, publicationPublicationIdNewsletterGet200Response.creatorId) &&
        Objects.equals(this.description, publicationPublicationIdNewsletterGet200Response.description) &&
        Objects.equals(this.id, publicationPublicationIdNewsletterGet200Response.id) &&
        Objects.equals(this.image, publicationPublicationIdNewsletterGet200Response.image) &&
        Objects.equals(this.name, publicationPublicationIdNewsletterGet200Response.name) &&
        Objects.equals(this.slug, publicationPublicationIdNewsletterGet200Response.slug) &&
        Objects.equals(this.subscribers, publicationPublicationIdNewsletterGet200Response.subscribers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorId, description, id, image, name, slug, subscribers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationPublicationIdNewsletterGet200Response {\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    subscribers: ").append(toIndentedString(subscribers)).append("\n");
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

