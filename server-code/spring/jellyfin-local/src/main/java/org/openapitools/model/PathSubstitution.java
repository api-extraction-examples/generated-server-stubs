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
 * Defines the MediaBrowser.Model.Configuration.PathSubstitution.
 */

@Schema(name = "PathSubstitution", description = "Defines the MediaBrowser.Model.Configuration.PathSubstitution.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PathSubstitution {

  private JsonNullable<String> from = JsonNullable.<String>undefined();

  private JsonNullable<String> to = JsonNullable.<String>undefined();

  public PathSubstitution from(String from) {
    this.from = JsonNullable.of(from);
    return this;
  }

  /**
   * Gets or sets the value to substitute.
   * @return from
  */
  
  @Schema(name = "From", description = "Gets or sets the value to substitute.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("From")
  public JsonNullable<String> getFrom() {
    return from;
  }

  public void setFrom(JsonNullable<String> from) {
    this.from = from;
  }

  public PathSubstitution to(String to) {
    this.to = JsonNullable.of(to);
    return this;
  }

  /**
   * Gets or sets the value to substitution with.
   * @return to
  */
  
  @Schema(name = "To", description = "Gets or sets the value to substitution with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("To")
  public JsonNullable<String> getTo() {
    return to;
  }

  public void setTo(JsonNullable<String> to) {
    this.to = to;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathSubstitution pathSubstitution = (PathSubstitution) o;
    return equalsNullable(this.from, pathSubstitution.from) &&
        equalsNullable(this.to, pathSubstitution.to);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(from), hashCodeNullable(to));
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
    sb.append("class PathSubstitution {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

