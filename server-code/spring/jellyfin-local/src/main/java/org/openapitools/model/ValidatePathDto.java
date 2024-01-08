package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Validate path object.
 */

@Schema(name = "ValidatePathDto", description = "Validate path object.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ValidatePathDto {

  private JsonNullable<Boolean> isFile = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> path = JsonNullable.<String>undefined();

  private Boolean validateWritable;

  public ValidatePathDto isFile(Boolean isFile) {
    this.isFile = JsonNullable.of(isFile);
    return this;
  }

  /**
   * Gets or sets is path file.
   * @return isFile
  */
  
  @Schema(name = "IsFile", description = "Gets or sets is path file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsFile")
  public JsonNullable<Boolean> getIsFile() {
    return isFile;
  }

  public void setIsFile(JsonNullable<Boolean> isFile) {
    this.isFile = isFile;
  }

  public ValidatePathDto path(String path) {
    this.path = JsonNullable.of(path);
    return this;
  }

  /**
   * Gets or sets the path.
   * @return path
  */
  
  @Schema(name = "Path", description = "Gets or sets the path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public JsonNullable<String> getPath() {
    return path;
  }

  public void setPath(JsonNullable<String> path) {
    this.path = path;
  }

  public ValidatePathDto validateWritable(Boolean validateWritable) {
    this.validateWritable = validateWritable;
    return this;
  }

  /**
   * Gets or sets a value indicating whether validate if path is writable.
   * @return validateWritable
  */
  
  @Schema(name = "ValidateWritable", description = "Gets or sets a value indicating whether validate if path is writable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ValidateWritable")
  public Boolean getValidateWritable() {
    return validateWritable;
  }

  public void setValidateWritable(Boolean validateWritable) {
    this.validateWritable = validateWritable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatePathDto validatePathDto = (ValidatePathDto) o;
    return equalsNullable(this.isFile, validatePathDto.isFile) &&
        equalsNullable(this.path, validatePathDto.path) &&
        Objects.equals(this.validateWritable, validatePathDto.validateWritable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(isFile), hashCodeNullable(path), validateWritable);
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
    sb.append("class ValidatePathDto {\n");
    sb.append("    isFile: ").append(toIndentedString(isFile)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    validateWritable: ").append(toIndentedString(validateWritable)).append("\n");
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

