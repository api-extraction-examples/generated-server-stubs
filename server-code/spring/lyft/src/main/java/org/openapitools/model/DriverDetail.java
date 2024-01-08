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
 * DriverDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class DriverDetail {

  private String firstName;

  private String imageUrl;

  private String phoneNumber;

  private String rating;

  private String userId;

  public DriverDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DriverDetail(String firstName, String imageUrl, String phoneNumber, String rating, String userId) {
    this.firstName = firstName;
    this.imageUrl = imageUrl;
    this.phoneNumber = phoneNumber;
    this.rating = rating;
    this.userId = userId;
  }

  public DriverDetail firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The driver's first name
   * @return firstName
  */
  @NotNull 
  @Schema(name = "first_name", description = "The driver's first name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public DriverDetail imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * The driver's image url
   * @return imageUrl
  */
  @NotNull 
  @Schema(name = "image_url", description = "The driver's image url", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public DriverDetail phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The driver's contact phone number. Must be E.164 formatted. 
   * @return phoneNumber
  */
  @NotNull 
  @Schema(name = "phone_number", description = "The driver's contact phone number. Must be E.164 formatted. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phone_number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public DriverDetail rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * The driver's rating based in 0-5 scale
   * @return rating
  */
  @NotNull 
  @Schema(name = "rating", description = "The driver's rating based in 0-5 scale", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rating")
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public DriverDetail userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The driver's id
   * @return userId
  */
  @NotNull 
  @Schema(name = "user_id", description = "The driver's id", requiredMode = Schema.RequiredMode.REQUIRED)
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
    DriverDetail driverDetail = (DriverDetail) o;
    return Objects.equals(this.firstName, driverDetail.firstName) &&
        Objects.equals(this.imageUrl, driverDetail.imageUrl) &&
        Objects.equals(this.phoneNumber, driverDetail.phoneNumber) &&
        Objects.equals(this.rating, driverDetail.rating) &&
        Objects.equals(this.userId, driverDetail.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, imageUrl, phoneNumber, rating, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverDetail {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

