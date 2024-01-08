package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Links;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Destination
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Destination {

  private String id;

  private Links links;

  private Object config;

  /**
   * Destination type (\"google-pubsub\", \"kinesis\", \"mparticle\", or \"segment\")
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

  private Integer version;

  public Destination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique destination ID.
   * @return id
  */
  
  @Schema(name = "_id", example = "37ed9aad-de0a-4665-932e-41c35587aeea", description = "Unique destination ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Destination links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public Destination config(Object config) {
    this.config = config;
    return this;
  }

  /**
   * destination-specific configuration.
   * @return config
  */
  
  @Schema(name = "config", example = "{\"project\":\"cool-project\",\"topic\":\"test\"}", description = "destination-specific configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("config")
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public Destination kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Destination type (\"google-pubsub\", \"kinesis\", \"mparticle\", or \"segment\")
   * @return kind
  */
  
  @Schema(name = "kind", example = "google-pubsub", description = "Destination type (\"google-pubsub\", \"kinesis\", \"mparticle\", or \"segment\")", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public Destination name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The destination name
   * @return name
  */
  
  @Schema(name = "name", example = "Example Google Pub/Sub Destination", description = "The destination name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Destination true(Boolean true) {
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

  public Destination version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
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
    Destination destination = (Destination) o;
    return Objects.equals(this.id, destination.id) &&
        Objects.equals(this.links, destination.links) &&
        Objects.equals(this.config, destination.config) &&
        Objects.equals(this.kind, destination.kind) &&
        Objects.equals(this.name, destination.name) &&
        Objects.equals(this.true, destination.true) &&
        Objects.equals(this.version, destination.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, config, kind, name, true, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Destination {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    true: ").append(toIndentedString(true)).append("\n");
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

