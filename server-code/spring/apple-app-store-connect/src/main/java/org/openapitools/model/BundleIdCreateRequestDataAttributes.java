package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BundleIdPlatform;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BundleIdCreateRequestDataAttributes
 */

@JsonTypeName("BundleIdCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BundleIdCreateRequestDataAttributes {

  private String identifier;

  private String name;

  private BundleIdPlatform platform;

  private String seedId;

  public BundleIdCreateRequestDataAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BundleIdCreateRequestDataAttributes(String identifier, String name, BundleIdPlatform platform) {
    this.identifier = identifier;
    this.name = name;
    this.platform = platform;
  }

  public BundleIdCreateRequestDataAttributes identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
  */
  @NotNull 
  @Schema(name = "identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public BundleIdCreateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BundleIdCreateRequestDataAttributes platform(BundleIdPlatform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @NotNull @Valid 
  @Schema(name = "platform", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("platform")
  public BundleIdPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(BundleIdPlatform platform) {
    this.platform = platform;
  }

  public BundleIdCreateRequestDataAttributes seedId(String seedId) {
    this.seedId = seedId;
    return this;
  }

  /**
   * Get seedId
   * @return seedId
  */
  
  @Schema(name = "seedId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seedId")
  public String getSeedId() {
    return seedId;
  }

  public void setSeedId(String seedId) {
    this.seedId = seedId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleIdCreateRequestDataAttributes bundleIdCreateRequestDataAttributes = (BundleIdCreateRequestDataAttributes) o;
    return Objects.equals(this.identifier, bundleIdCreateRequestDataAttributes.identifier) &&
        Objects.equals(this.name, bundleIdCreateRequestDataAttributes.name) &&
        Objects.equals(this.platform, bundleIdCreateRequestDataAttributes.platform) &&
        Objects.equals(this.seedId, bundleIdCreateRequestDataAttributes.seedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, platform, seedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleIdCreateRequestDataAttributes {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    seedId: ").append(toIndentedString(seedId)).append("\n");
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

