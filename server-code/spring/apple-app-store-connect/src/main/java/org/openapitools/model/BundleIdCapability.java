package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BundleIdCapabilityAttributes;
import org.openapitools.model.ResourceLinks;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BundleIdCapability
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BundleIdCapability implements BundleIdResponseIncludedInner {

  private BundleIdCapabilityAttributes attributes;

  private String id;

  private ResourceLinks links;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    BUNDLEIDCAPABILITIES("bundleIdCapabilities");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public BundleIdCapability() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BundleIdCapability(String id, ResourceLinks links, TypeEnum type) {
    this.id = id;
    this.links = links;
    this.type = type;
  }

  public BundleIdCapability attributes(BundleIdCapabilityAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public BundleIdCapabilityAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(BundleIdCapabilityAttributes attributes) {
    this.attributes = attributes;
  }

  public BundleIdCapability id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BundleIdCapability links(ResourceLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @NotNull @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("links")
  public ResourceLinks getLinks() {
    return links;
  }

  public void setLinks(ResourceLinks links) {
    this.links = links;
  }

  public BundleIdCapability type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    BundleIdCapability bundleIdCapability = (BundleIdCapability) o;
    return Objects.equals(this.attributes, bundleIdCapability.attributes) &&
        Objects.equals(this.id, bundleIdCapability.id) &&
        Objects.equals(this.links, bundleIdCapability.links) &&
        Objects.equals(this.type, bundleIdCapability.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, links, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleIdCapability {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

