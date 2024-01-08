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
 * TunerChannelMapping
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class TunerChannelMapping {

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> providerChannelId = JsonNullable.<String>undefined();

  private JsonNullable<String> providerChannelName = JsonNullable.<String>undefined();

  public TunerChannelMapping id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "Id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public TunerChannelMapping name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public TunerChannelMapping providerChannelId(String providerChannelId) {
    this.providerChannelId = JsonNullable.of(providerChannelId);
    return this;
  }

  /**
   * Get providerChannelId
   * @return providerChannelId
  */
  
  @Schema(name = "ProviderChannelId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProviderChannelId")
  public JsonNullable<String> getProviderChannelId() {
    return providerChannelId;
  }

  public void setProviderChannelId(JsonNullable<String> providerChannelId) {
    this.providerChannelId = providerChannelId;
  }

  public TunerChannelMapping providerChannelName(String providerChannelName) {
    this.providerChannelName = JsonNullable.of(providerChannelName);
    return this;
  }

  /**
   * Get providerChannelName
   * @return providerChannelName
  */
  
  @Schema(name = "ProviderChannelName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProviderChannelName")
  public JsonNullable<String> getProviderChannelName() {
    return providerChannelName;
  }

  public void setProviderChannelName(JsonNullable<String> providerChannelName) {
    this.providerChannelName = providerChannelName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TunerChannelMapping tunerChannelMapping = (TunerChannelMapping) o;
    return equalsNullable(this.id, tunerChannelMapping.id) &&
        equalsNullable(this.name, tunerChannelMapping.name) &&
        equalsNullable(this.providerChannelId, tunerChannelMapping.providerChannelId) &&
        equalsNullable(this.providerChannelName, tunerChannelMapping.providerChannelName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(name), hashCodeNullable(providerChannelId), hashCodeNullable(providerChannelName));
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
    sb.append("class TunerChannelMapping {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerChannelId: ").append(toIndentedString(providerChannelId)).append("\n");
    sb.append("    providerChannelName: ").append(toIndentedString(providerChannelName)).append("\n");
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

