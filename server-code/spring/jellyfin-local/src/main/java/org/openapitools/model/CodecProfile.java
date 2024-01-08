package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CodecType;
import org.openapitools.model.ProfileCondition;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CodecProfile
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class CodecProfile {

  @Valid
  private JsonNullable<List<@Valid ProfileCondition>> applyConditions = JsonNullable.<List<@Valid ProfileCondition>>undefined();

  private JsonNullable<String> codec = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid ProfileCondition>> conditions = JsonNullable.<List<@Valid ProfileCondition>>undefined();

  private JsonNullable<String> container = JsonNullable.<String>undefined();

  private CodecType type;

  public CodecProfile applyConditions(List<@Valid ProfileCondition> applyConditions) {
    this.applyConditions = JsonNullable.of(applyConditions);
    return this;
  }

  public CodecProfile addApplyConditionsItem(ProfileCondition applyConditionsItem) {
    if (this.applyConditions == null || !this.applyConditions.isPresent()) {
      this.applyConditions = JsonNullable.of(new ArrayList<>());
    }
    this.applyConditions.get().add(applyConditionsItem);
    return this;
  }

  /**
   * Get applyConditions
   * @return applyConditions
  */
  @Valid 
  @Schema(name = "ApplyConditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ApplyConditions")
  public JsonNullable<List<@Valid ProfileCondition>> getApplyConditions() {
    return applyConditions;
  }

  public void setApplyConditions(JsonNullable<List<@Valid ProfileCondition>> applyConditions) {
    this.applyConditions = applyConditions;
  }

  public CodecProfile codec(String codec) {
    this.codec = JsonNullable.of(codec);
    return this;
  }

  /**
   * Get codec
   * @return codec
  */
  
  @Schema(name = "Codec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Codec")
  public JsonNullable<String> getCodec() {
    return codec;
  }

  public void setCodec(JsonNullable<String> codec) {
    this.codec = codec;
  }

  public CodecProfile conditions(List<@Valid ProfileCondition> conditions) {
    this.conditions = JsonNullable.of(conditions);
    return this;
  }

  public CodecProfile addConditionsItem(ProfileCondition conditionsItem) {
    if (this.conditions == null || !this.conditions.isPresent()) {
      this.conditions = JsonNullable.of(new ArrayList<>());
    }
    this.conditions.get().add(conditionsItem);
    return this;
  }

  /**
   * Get conditions
   * @return conditions
  */
  @Valid 
  @Schema(name = "Conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Conditions")
  public JsonNullable<List<@Valid ProfileCondition>> getConditions() {
    return conditions;
  }

  public void setConditions(JsonNullable<List<@Valid ProfileCondition>> conditions) {
    this.conditions = conditions;
  }

  public CodecProfile container(String container) {
    this.container = JsonNullable.of(container);
    return this;
  }

  /**
   * Get container
   * @return container
  */
  
  @Schema(name = "Container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Container")
  public JsonNullable<String> getContainer() {
    return container;
  }

  public void setContainer(JsonNullable<String> container) {
    this.container = container;
  }

  public CodecProfile type(CodecType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public CodecType getType() {
    return type;
  }

  public void setType(CodecType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodecProfile codecProfile = (CodecProfile) o;
    return equalsNullable(this.applyConditions, codecProfile.applyConditions) &&
        equalsNullable(this.codec, codecProfile.codec) &&
        equalsNullable(this.conditions, codecProfile.conditions) &&
        equalsNullable(this.container, codecProfile.container) &&
        Objects.equals(this.type, codecProfile.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(applyConditions), hashCodeNullable(codec), hashCodeNullable(conditions), hashCodeNullable(container), type);
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
    sb.append("class CodecProfile {\n");
    sb.append("    applyConditions: ").append(toIndentedString(applyConditions)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

