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
 * The date the refreshed webhooks expire.
 */

@Schema(name = "WebhooksExpirationDate", description = "The date the refreshed webhooks expire.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WebhooksExpirationDate {

  private Long expirationDate;

  public WebhooksExpirationDate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhooksExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  public WebhooksExpirationDate expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * The expiration date of all the refreshed webhooks.
   * @return expirationDate
  */
  
  @Schema(name = "expirationDate", accessMode = Schema.AccessMode.READ_ONLY, description = "The expiration date of all the refreshed webhooks.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expirationDate")
  public Long getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksExpirationDate webhooksExpirationDate = (WebhooksExpirationDate) o;
    return Objects.equals(this.expirationDate, webhooksExpirationDate.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksExpirationDate {\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

