package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AppScreenshotCreateRequestDataAttributes;
import org.openapitools.model.AppStoreReviewAttachmentCreateRequestDataRelationships;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreReviewAttachmentCreateRequestData
 */

@JsonTypeName("AppStoreReviewAttachmentCreateRequest_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreReviewAttachmentCreateRequestData {

  private AppScreenshotCreateRequestDataAttributes attributes;

  private AppStoreReviewAttachmentCreateRequestDataRelationships relationships;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    APPSTOREREVIEWATTACHMENTS("appStoreReviewAttachments");

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

  public AppStoreReviewAttachmentCreateRequestData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppStoreReviewAttachmentCreateRequestData(AppScreenshotCreateRequestDataAttributes attributes, AppStoreReviewAttachmentCreateRequestDataRelationships relationships, TypeEnum type) {
    this.attributes = attributes;
    this.relationships = relationships;
    this.type = type;
  }

  public AppStoreReviewAttachmentCreateRequestData attributes(AppScreenshotCreateRequestDataAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @NotNull @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attributes")
  public AppScreenshotCreateRequestDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(AppScreenshotCreateRequestDataAttributes attributes) {
    this.attributes = attributes;
  }

  public AppStoreReviewAttachmentCreateRequestData relationships(AppStoreReviewAttachmentCreateRequestDataRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
  */
  @NotNull @Valid 
  @Schema(name = "relationships", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relationships")
  public AppStoreReviewAttachmentCreateRequestDataRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(AppStoreReviewAttachmentCreateRequestDataRelationships relationships) {
    this.relationships = relationships;
  }

  public AppStoreReviewAttachmentCreateRequestData type(TypeEnum type) {
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
    AppStoreReviewAttachmentCreateRequestData appStoreReviewAttachmentCreateRequestData = (AppStoreReviewAttachmentCreateRequestData) o;
    return Objects.equals(this.attributes, appStoreReviewAttachmentCreateRequestData.attributes) &&
        Objects.equals(this.relationships, appStoreReviewAttachmentCreateRequestData.relationships) &&
        Objects.equals(this.type, appStoreReviewAttachmentCreateRequestData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreReviewAttachmentCreateRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

