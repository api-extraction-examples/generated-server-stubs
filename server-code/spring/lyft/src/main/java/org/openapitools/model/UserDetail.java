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
 * UserDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class UserDetail {

  private String firstName;

  private String imageUrl;

  private String rating;

  public UserDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserDetail(String firstName, String imageUrl, String rating) {
    this.firstName = firstName;
    this.imageUrl = imageUrl;
    this.rating = rating;
  }

  public UserDetail firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The passenger's first name
   * @return firstName
  */
  @NotNull 
  @Schema(name = "first_name", description = "The passenger's first name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserDetail imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * The passenger's profile image
   * @return imageUrl
  */
  @NotNull 
  @Schema(name = "image_url", description = "The passenger's profile image", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public UserDetail rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * The passenger's rating
   * @return rating
  */
  @NotNull 
  @Schema(name = "rating", description = "The passenger's rating", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rating")
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetail userDetail = (UserDetail) o;
    return Objects.equals(this.firstName, userDetail.firstName) &&
        Objects.equals(this.imageUrl, userDetail.imageUrl) &&
        Objects.equals(this.rating, userDetail.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, imageUrl, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetail {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

