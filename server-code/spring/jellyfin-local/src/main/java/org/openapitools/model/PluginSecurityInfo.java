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
 * Plugin security info.
 */

@Schema(name = "PluginSecurityInfo", description = "Plugin security info.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PluginSecurityInfo {

  private Boolean isMbSupporter;

  private JsonNullable<String> supporterKey = JsonNullable.<String>undefined();

  public PluginSecurityInfo isMbSupporter(Boolean isMbSupporter) {
    this.isMbSupporter = isMbSupporter;
    return this;
  }

  /**
   * Gets or sets a value indicating whether is mb supporter.
   * @return isMbSupporter
  */
  
  @Schema(name = "IsMbSupporter", description = "Gets or sets a value indicating whether is mb supporter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsMbSupporter")
  public Boolean getIsMbSupporter() {
    return isMbSupporter;
  }

  public void setIsMbSupporter(Boolean isMbSupporter) {
    this.isMbSupporter = isMbSupporter;
  }

  public PluginSecurityInfo supporterKey(String supporterKey) {
    this.supporterKey = JsonNullable.of(supporterKey);
    return this;
  }

  /**
   * Gets or sets the supporter key.
   * @return supporterKey
  */
  
  @Schema(name = "SupporterKey", description = "Gets or sets the supporter key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupporterKey")
  public JsonNullable<String> getSupporterKey() {
    return supporterKey;
  }

  public void setSupporterKey(JsonNullable<String> supporterKey) {
    this.supporterKey = supporterKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginSecurityInfo pluginSecurityInfo = (PluginSecurityInfo) o;
    return Objects.equals(this.isMbSupporter, pluginSecurityInfo.isMbSupporter) &&
        equalsNullable(this.supporterKey, pluginSecurityInfo.supporterKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMbSupporter, hashCodeNullable(supporterKey));
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
    sb.append("class PluginSecurityInfo {\n");
    sb.append("    isMbSupporter: ").append(toIndentedString(isMbSupporter)).append("\n");
    sb.append("    supporterKey: ").append(toIndentedString(supporterKey)).append("\n");
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

