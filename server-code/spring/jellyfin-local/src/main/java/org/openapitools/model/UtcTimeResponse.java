package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class UtcTimeResponse.
 */

@Schema(name = "UtcTimeResponse", description = "Class UtcTimeResponse.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class UtcTimeResponse {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestReceptionTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime responseTransmissionTime;

  public UtcTimeResponse requestReceptionTime(OffsetDateTime requestReceptionTime) {
    this.requestReceptionTime = requestReceptionTime;
    return this;
  }

  /**
   * Gets the UTC time when request has been received.
   * @return requestReceptionTime
  */
  @Valid 
  @Schema(name = "RequestReceptionTime", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the UTC time when request has been received.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequestReceptionTime")
  public OffsetDateTime getRequestReceptionTime() {
    return requestReceptionTime;
  }

  public void setRequestReceptionTime(OffsetDateTime requestReceptionTime) {
    this.requestReceptionTime = requestReceptionTime;
  }

  public UtcTimeResponse responseTransmissionTime(OffsetDateTime responseTransmissionTime) {
    this.responseTransmissionTime = responseTransmissionTime;
    return this;
  }

  /**
   * Gets the UTC time when response has been sent.
   * @return responseTransmissionTime
  */
  @Valid 
  @Schema(name = "ResponseTransmissionTime", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the UTC time when response has been sent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResponseTransmissionTime")
  public OffsetDateTime getResponseTransmissionTime() {
    return responseTransmissionTime;
  }

  public void setResponseTransmissionTime(OffsetDateTime responseTransmissionTime) {
    this.responseTransmissionTime = responseTransmissionTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtcTimeResponse utcTimeResponse = (UtcTimeResponse) o;
    return Objects.equals(this.requestReceptionTime, utcTimeResponse.requestReceptionTime) &&
        Objects.equals(this.responseTransmissionTime, utcTimeResponse.responseTransmissionTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestReceptionTime, responseTransmissionTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtcTimeResponse {\n");
    sb.append("    requestReceptionTime: ").append(toIndentedString(requestReceptionTime)).append("\n");
    sb.append("    responseTransmissionTime: ").append(toIndentedString(responseTransmissionTime)).append("\n");
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

