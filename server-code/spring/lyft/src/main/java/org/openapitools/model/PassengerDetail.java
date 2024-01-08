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
 * PassengerDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class PassengerDetail {

  private String firstName;

  private String imageUrl;

  private String rating;

  private String lastName;

  private String userId;

  public PassengerDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PassengerDetail(String firstName, String imageUrl, String rating) {
    this.firstName = firstName;
    this.imageUrl = imageUrl;
    this.rating = rating;
  }

  public PassengerDetail firstName(String firstName) {
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

  public PassengerDetail imageUrl(String imageUrl) {
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

  public PassengerDetail rating(String rating) {
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

  public PassengerDetail lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The passenger's last name
   * @return lastName
  */
  
  @Schema(name = "last_name", description = "The passenger's last name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PassengerDetail userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The passenger's lyft user id
   * @return userId
  */
  
  @Schema(name = "user_id", description = "The passenger's lyft user id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassengerDetail passengerDetail = (PassengerDetail) o;
    return Objects.equals(this.firstName, passengerDetail.firstName) &&
        Objects.equals(this.imageUrl, passengerDetail.imageUrl) &&
        Objects.equals(this.rating, passengerDetail.rating) &&
        Objects.equals(this.lastName, passengerDetail.lastName) &&
        Objects.equals(this.userId, passengerDetail.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, imageUrl, rating, lastName, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassengerDetail {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

