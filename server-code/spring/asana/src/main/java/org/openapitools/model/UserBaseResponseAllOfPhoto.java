package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A map of the user’s profile photo in various sizes, or null if no photo is set. Sizes provided are 21, 27, 36, 60, 128, and 1024. All images are in PNG format, except for 1024 (which is in JPEG format).
 */

@Schema(name = "UserBaseResponse_allOf_photo", description = "A map of the user’s profile photo in various sizes, or null if no photo is set. Sizes provided are 21, 27, 36, 60, 128, and 1024. All images are in PNG format, except for 1024 (which is in JPEG format).")
@JsonTypeName("UserBaseResponse_allOf_photo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class UserBaseResponseAllOfPhoto {

  private URI image1024x1024;

  private URI image128x128;

  private URI image21x21;

  private URI image27x27;

  private URI image36x36;

  private URI image60x60;

  public UserBaseResponseAllOfPhoto image1024x1024(URI image1024x1024) {
    this.image1024x1024 = image1024x1024;
    return this;
  }

  /**
   * Get image1024x1024
   * @return image1024x1024
  */
  @Valid 
  @Schema(name = "image_1024x1024", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_1024x1024")
  public URI getImage1024x1024() {
    return image1024x1024;
  }

  public void setImage1024x1024(URI image1024x1024) {
    this.image1024x1024 = image1024x1024;
  }

  public UserBaseResponseAllOfPhoto image128x128(URI image128x128) {
    this.image128x128 = image128x128;
    return this;
  }

  /**
   * Get image128x128
   * @return image128x128
  */
  @Valid 
  @Schema(name = "image_128x128", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_128x128")
  public URI getImage128x128() {
    return image128x128;
  }

  public void setImage128x128(URI image128x128) {
    this.image128x128 = image128x128;
  }

  public UserBaseResponseAllOfPhoto image21x21(URI image21x21) {
    this.image21x21 = image21x21;
    return this;
  }

  /**
   * Get image21x21
   * @return image21x21
  */
  @Valid 
  @Schema(name = "image_21x21", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_21x21")
  public URI getImage21x21() {
    return image21x21;
  }

  public void setImage21x21(URI image21x21) {
    this.image21x21 = image21x21;
  }

  public UserBaseResponseAllOfPhoto image27x27(URI image27x27) {
    this.image27x27 = image27x27;
    return this;
  }

  /**
   * Get image27x27
   * @return image27x27
  */
  @Valid 
  @Schema(name = "image_27x27", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_27x27")
  public URI getImage27x27() {
    return image27x27;
  }

  public void setImage27x27(URI image27x27) {
    this.image27x27 = image27x27;
  }

  public UserBaseResponseAllOfPhoto image36x36(URI image36x36) {
    this.image36x36 = image36x36;
    return this;
  }

  /**
   * Get image36x36
   * @return image36x36
  */
  @Valid 
  @Schema(name = "image_36x36", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_36x36")
  public URI getImage36x36() {
    return image36x36;
  }

  public void setImage36x36(URI image36x36) {
    this.image36x36 = image36x36;
  }

  public UserBaseResponseAllOfPhoto image60x60(URI image60x60) {
    this.image60x60 = image60x60;
    return this;
  }

  /**
   * Get image60x60
   * @return image60x60
  */
  @Valid 
  @Schema(name = "image_60x60", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_60x60")
  public URI getImage60x60() {
    return image60x60;
  }

  public void setImage60x60(URI image60x60) {
    this.image60x60 = image60x60;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBaseResponseAllOfPhoto userBaseResponseAllOfPhoto = (UserBaseResponseAllOfPhoto) o;
    return Objects.equals(this.image1024x1024, userBaseResponseAllOfPhoto.image1024x1024) &&
        Objects.equals(this.image128x128, userBaseResponseAllOfPhoto.image128x128) &&
        Objects.equals(this.image21x21, userBaseResponseAllOfPhoto.image21x21) &&
        Objects.equals(this.image27x27, userBaseResponseAllOfPhoto.image27x27) &&
        Objects.equals(this.image36x36, userBaseResponseAllOfPhoto.image36x36) &&
        Objects.equals(this.image60x60, userBaseResponseAllOfPhoto.image60x60);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image1024x1024, image128x128, image21x21, image27x27, image36x36, image60x60);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBaseResponseAllOfPhoto {\n");
    sb.append("    image1024x1024: ").append(toIndentedString(image1024x1024)).append("\n");
    sb.append("    image128x128: ").append(toIndentedString(image128x128)).append("\n");
    sb.append("    image21x21: ").append(toIndentedString(image21x21)).append("\n");
    sb.append("    image27x27: ").append(toIndentedString(image27x27)).append("\n");
    sb.append("    image36x36: ").append(toIndentedString(image36x36)).append("\n");
    sb.append("    image60x60: ").append(toIndentedString(image60x60)).append("\n");
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

