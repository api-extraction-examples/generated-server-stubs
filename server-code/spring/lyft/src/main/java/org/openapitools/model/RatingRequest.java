package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.TipParams;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Rating and optional feedback and tip
 */

@Schema(name = "RatingRequest", description = "Rating and optional feedback and tip")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class RatingRequest {

  private String feedback;

  private Integer rating;

  private TipParams tip;

  public RatingRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RatingRequest(Integer rating) {
    this.rating = rating;
  }

  public RatingRequest feedback(String feedback) {
    this.feedback = feedback;
    return this;
  }

  /**
   * The passenger's written feedback about this ride
   * @return feedback
  */
  
  @Schema(name = "feedback", description = "The passenger's written feedback about this ride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feedback")
  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }

  public RatingRequest rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * The passenger's rating of this ride from 1 to 5
   * minimum: 1
   * maximum: 5
   * @return rating
  */
  @NotNull @Min(1) @Max(5) 
  @Schema(name = "rating", description = "The passenger's rating of this ride from 1 to 5", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public RatingRequest tip(TipParams tip) {
    this.tip = tip;
    return this;
  }

  /**
   * Get tip
   * @return tip
  */
  @Valid 
  @Schema(name = "tip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tip")
  public TipParams getTip() {
    return tip;
  }

  public void setTip(TipParams tip) {
    this.tip = tip;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingRequest ratingRequest = (RatingRequest) o;
    return Objects.equals(this.feedback, ratingRequest.feedback) &&
        Objects.equals(this.rating, ratingRequest.rating) &&
        Objects.equals(this.tip, ratingRequest.tip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedback, rating, tip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingRequest {\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    tip: ").append(toIndentedString(tip)).append("\n");
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

