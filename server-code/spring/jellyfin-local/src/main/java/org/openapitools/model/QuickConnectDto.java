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
 * The quick connect request body.
 */

@Schema(name = "QuickConnectDto", description = "The quick connect request body.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class QuickConnectDto {

  private String token;

  public QuickConnectDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuickConnectDto(String token) {
    this.token = token;
  }

  public QuickConnectDto token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Gets or sets the quick connect token.
   * @return token
  */
  @NotNull 
  @Schema(name = "Token", description = "Gets or sets the quick connect token.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickConnectDto quickConnectDto = (QuickConnectDto) o;
    return Objects.equals(this.token, quickConnectDto.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickConnectDto {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

