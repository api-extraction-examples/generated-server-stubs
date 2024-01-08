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
 * Promoter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class Promoter {

  private JsonNullable<String> organisationName = JsonNullable.<String>undefined();

  private JsonNullable<String> organisationUrl = JsonNullable.<String>undefined();

  public Promoter organisationName(String organisationName) {
    this.organisationName = JsonNullable.of(organisationName);
    return this;
  }

  /**
   * Get organisationName
   * @return organisationName
  */
  
  @Schema(name = "organisationName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organisationName")
  public JsonNullable<String> getOrganisationName() {
    return organisationName;
  }

  public void setOrganisationName(JsonNullable<String> organisationName) {
    this.organisationName = organisationName;
  }

  public Promoter organisationUrl(String organisationUrl) {
    this.organisationUrl = JsonNullable.of(organisationUrl);
    return this;
  }

  /**
   * Get organisationUrl
   * @return organisationUrl
  */
  
  @Schema(name = "organisationUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organisationUrl")
  public JsonNullable<String> getOrganisationUrl() {
    return organisationUrl;
  }

  public void setOrganisationUrl(JsonNullable<String> organisationUrl) {
    this.organisationUrl = organisationUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Promoter promoter = (Promoter) o;
    return equalsNullable(this.organisationName, promoter.organisationName) &&
        equalsNullable(this.organisationUrl, promoter.organisationUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(organisationName), hashCodeNullable(organisationUrl));
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
    sb.append("class Promoter {\n");
    sb.append("    organisationName: ").append(toIndentedString(organisationName)).append("\n");
    sb.append("    organisationUrl: ").append(toIndentedString(organisationUrl)).append("\n");
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

