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
 * StreamUsageMetadata
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class StreamUsageMetadata {

  private String sdk;

  private String source;

  private String version;

  public StreamUsageMetadata sdk(String sdk) {
    this.sdk = sdk;
    return this;
  }

  /**
   * The language of the sdk
   * @return sdk
  */
  
  @Schema(name = "sdk", example = "ruby", description = "The language of the sdk", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sdk")
  public String getSdk() {
    return sdk;
  }

  public void setSdk(String sdk) {
    this.sdk = sdk;
  }

  public StreamUsageMetadata source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  
  @Schema(name = "source", example = "server", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public StreamUsageMetadata version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the SDK
   * @return version
  */
  
  @Schema(name = "version", example = "5.4.3", description = "The version of the SDK", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamUsageMetadata streamUsageMetadata = (StreamUsageMetadata) o;
    return Objects.equals(this.sdk, streamUsageMetadata.sdk) &&
        Objects.equals(this.source, streamUsageMetadata.source) &&
        Objects.equals(this.version, streamUsageMetadata.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdk, source, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamUsageMetadata {\n");
    sb.append("    sdk: ").append(toIndentedString(sdk)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

