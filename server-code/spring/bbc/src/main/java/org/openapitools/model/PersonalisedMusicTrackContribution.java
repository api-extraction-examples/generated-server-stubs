package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PersonalisedMusicTrackImage;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedMusicTrackContribution
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedMusicTrackContribution {

  private String id;

  @Valid
  private List<@Valid PersonalisedMusicTrackImage> images = new ArrayList<>();

  private String name;

  private String role;

  public PersonalisedMusicTrackContribution() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedMusicTrackContribution(String id, List<@Valid PersonalisedMusicTrackImage> images, String name, String role) {
    this.id = id;
    this.images = images;
    this.name = name;
    this.role = role;
  }

  public PersonalisedMusicTrackContribution id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PersonalisedMusicTrackContribution images(List<@Valid PersonalisedMusicTrackImage> images) {
    this.images = images;
    return this;
  }

  public PersonalisedMusicTrackContribution addImagesItem(PersonalisedMusicTrackImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @NotNull @Valid 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("images")
  public List<@Valid PersonalisedMusicTrackImage> getImages() {
    return images;
  }

  public void setImages(List<@Valid PersonalisedMusicTrackImage> images) {
    this.images = images;
  }

  public PersonalisedMusicTrackContribution name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonalisedMusicTrackContribution role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @NotNull 
  @Schema(name = "role", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalisedMusicTrackContribution personalisedMusicTrackContribution = (PersonalisedMusicTrackContribution) o;
    return Objects.equals(this.id, personalisedMusicTrackContribution.id) &&
        Objects.equals(this.images, personalisedMusicTrackContribution.images) &&
        Objects.equals(this.name, personalisedMusicTrackContribution.name) &&
        Objects.equals(this.role, personalisedMusicTrackContribution.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, images, name, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedMusicTrackContribution {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

