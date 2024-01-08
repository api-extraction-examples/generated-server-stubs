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
 * Represents a profile field as a name-value pair with optional verification.
 */

@Schema(name = "Field", description = "Represents a profile field as a name-value pair with optional verification.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Field {

  private String name;

  private String value;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime verifiedAt;

  public Field name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The key of a given field's key-value pair.
   * @return name
  */
  
  @Schema(name = "name", description = "The key of a given field's key-value pair.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Field value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value associated with the `name` key.
   * @return value
  */
  
  @Schema(name = "value", description = "The value associated with the `name` key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Field verifiedAt(OffsetDateTime verifiedAt) {
    this.verifiedAt = verifiedAt;
    return this;
  }

  /**
   * Timestamp of when the server verified a URL value for a rel=\"me” link. If `value` is a verified URL. Otherwise, null
   * @return verifiedAt
  */
  @Valid 
  @Schema(name = "verified_at", description = "Timestamp of when the server verified a URL value for a rel=\"me” link. If `value` is a verified URL. Otherwise, null", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verified_at")
  public OffsetDateTime getVerifiedAt() {
    return verifiedAt;
  }

  public void setVerifiedAt(OffsetDateTime verifiedAt) {
    this.verifiedAt = verifiedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.name, field.name) &&
        Objects.equals(this.value, field.value) &&
        Objects.equals(this.verifiedAt, field.verifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, verifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
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

