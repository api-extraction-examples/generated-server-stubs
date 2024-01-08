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
 * Class PingRequestDto.
 */

@Schema(name = "PingRequestDto", description = "Class PingRequestDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PingRequestDto {

  private Long ping;

  public PingRequestDto ping(Long ping) {
    this.ping = ping;
    return this;
  }

  /**
   * Gets or sets the ping time.
   * @return ping
  */
  
  @Schema(name = "Ping", description = "Gets or sets the ping time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Ping")
  public Long getPing() {
    return ping;
  }

  public void setPing(Long ping) {
    this.ping = ping;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PingRequestDto pingRequestDto = (PingRequestDto) o;
    return Objects.equals(this.ping, pingRequestDto.ping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PingRequestDto {\n");
    sb.append("    ping: ").append(toIndentedString(ping)).append("\n");
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

