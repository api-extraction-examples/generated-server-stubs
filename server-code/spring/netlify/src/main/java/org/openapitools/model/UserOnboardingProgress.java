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
 * UserOnboardingProgress
 */

@JsonTypeName("user_onboarding_progress")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class UserOnboardingProgress {

  private String slides;

  public UserOnboardingProgress slides(String slides) {
    this.slides = slides;
    return this;
  }

  /**
   * Get slides
   * @return slides
  */
  
  @Schema(name = "slides", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slides")
  public String getSlides() {
    return slides;
  }

  public void setSlides(String slides) {
    this.slides = slides;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOnboardingProgress userOnboardingProgress = (UserOnboardingProgress) o;
    return Objects.equals(this.slides, userOnboardingProgress.slides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOnboardingProgress {\n");
    sb.append("    slides: ").append(toIndentedString(slides)).append("\n");
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

