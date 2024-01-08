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
 * Error
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class Error {

  private String help;

  private String message;

  private String phrase;

  public Error help(String help) {
    this.help = help;
    return this;
  }

  /**
   * Additional information directing developers to resources on how to address and fix the problem, if available.
   * @return help
  */
  
  @Schema(name = "help", accessMode = Schema.AccessMode.READ_ONLY, example = "For more information on API status codes and how to handle them, read the docs on errors: https://asana.github.io/developer-docs/#errors'", description = "Additional information directing developers to resources on how to address and fix the problem, if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("help")
  public String getHelp() {
    return help;
  }

  public void setHelp(String help) {
    this.help = help;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message providing more detail about the error that occurred, if available.
   * @return message
  */
  
  @Schema(name = "message", accessMode = Schema.AccessMode.READ_ONLY, example = "project: Missing input", description = "Message providing more detail about the error that occurred, if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error phrase(String phrase) {
    this.phrase = phrase;
    return this;
  }

  /**
   * *500 errors only*. A unique error phrase which can be used when contacting developer support to help identify the exact occurrence of the problem in Asana’s logs.
   * @return phrase
  */
  
  @Schema(name = "phrase", accessMode = Schema.AccessMode.READ_ONLY, example = "6 sad squid snuggle softly", description = "*500 errors only*. A unique error phrase which can be used when contacting developer support to help identify the exact occurrence of the problem in Asana’s logs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phrase")
  public String getPhrase() {
    return phrase;
  }

  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.help, error.help) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.phrase, error.phrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(help, message, phrase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
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

