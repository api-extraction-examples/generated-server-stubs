package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostDestinationRequest
 */

@JsonTypeName("postDestination_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostDestinationRequest {

  private Object config;

  /**
   * The data export destination type. Available choices are kinesis, google-pubsub, mparticle, or segment.
   */
  public enum KindEnum {
    GOOGLE_PUBSUB("google-pubsub"),
    
    KINESIS("kinesis"),
    
    MPARTICLE("mparticle"),
    
    SEGMENT("segment");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private KindEnum kind;

  private String name;

  private Boolean true;

  public PostDestinationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostDestinationRequest(Object config, KindEnum kind, String name) {
    this.config = config;
    this.kind = kind;
    this.name = name;
  }

  public PostDestinationRequest config(Object config) {
    this.config = config;
    return this;
  }

  /**
   * destination-specific configuration.
   * @return config
  */
  @NotNull 
  @Schema(name = "config", example = "{\"project\":\"cool-project\",\"topic\":\"test\"}", description = "destination-specific configuration.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("config")
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public PostDestinationRequest kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The data export destination type. Available choices are kinesis, google-pubsub, mparticle, or segment.
   * @return kind
  */
  @NotNull 
  @Schema(name = "kind", example = "google-pubsub", description = "The data export destination type. Available choices are kinesis, google-pubsub, mparticle, or segment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("kind")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public PostDestinationRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-readable name for your data export destination.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Example Google Pub/Sub Destination", description = "A human-readable name for your data export destination.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostDestinationRequest true(Boolean true) {
    this.true = true;
    return this;
  }

  /**
   * Whether the data export destination is on or not.
   * @return true
  */
  
  @Schema(name = "true", example = "true", description = "Whether the data export destination is on or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("true")
  public Boolean getTrue() {
    return true;
  }

  public void setTrue(Boolean true) {
    this.true = true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostDestinationRequest postDestinationRequest = (PostDestinationRequest) o;
    return Objects.equals(this.config, postDestinationRequest.config) &&
        Objects.equals(this.kind, postDestinationRequest.kind) &&
        Objects.equals(this.name, postDestinationRequest.name) &&
        Objects.equals(this.true, postDestinationRequest.true);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, kind, name, true);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDestinationRequest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    true: ").append(toIndentedString(true)).append("\n");
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

