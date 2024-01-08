package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GeneralCommandType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeneralCommand
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class GeneralCommand {

  @Valid
  private JsonNullable<Map<String, String>> arguments = JsonNullable.<Map<String, String>>undefined();

  private UUID controllingUserId;

  private GeneralCommandType name;

  public GeneralCommand arguments(Map<String, String> arguments) {
    this.arguments = JsonNullable.of(arguments);
    return this;
  }

  public GeneralCommand putArgumentsItem(String key, String argumentsItem) {
    if (this.arguments == null || !this.arguments.isPresent()) {
      this.arguments = JsonNullable.of(new HashMap<>());
    }
    this.arguments.get().put(key, argumentsItem);
    return this;
  }

  /**
   * Get arguments
   * @return arguments
  */
  
  @Schema(name = "Arguments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Arguments")
  public JsonNullable<Map<String, String>> getArguments() {
    return arguments;
  }

  public void setArguments(JsonNullable<Map<String, String>> arguments) {
    this.arguments = arguments;
  }

  public GeneralCommand controllingUserId(UUID controllingUserId) {
    this.controllingUserId = controllingUserId;
    return this;
  }

  /**
   * Get controllingUserId
   * @return controllingUserId
  */
  @Valid 
  @Schema(name = "ControllingUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ControllingUserId")
  public UUID getControllingUserId() {
    return controllingUserId;
  }

  public void setControllingUserId(UUID controllingUserId) {
    this.controllingUserId = controllingUserId;
  }

  public GeneralCommand name(GeneralCommandType name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Valid 
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public GeneralCommandType getName() {
    return name;
  }

  public void setName(GeneralCommandType name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralCommand generalCommand = (GeneralCommand) o;
    return equalsNullable(this.arguments, generalCommand.arguments) &&
        Objects.equals(this.controllingUserId, generalCommand.controllingUserId) &&
        Objects.equals(this.name, generalCommand.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(arguments), controllingUserId, name);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralCommand {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    controllingUserId: ").append(toIndentedString(controllingUserId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

