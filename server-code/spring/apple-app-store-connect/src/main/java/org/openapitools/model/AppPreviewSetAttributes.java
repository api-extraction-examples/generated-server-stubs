package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.PreviewType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPreviewSetAttributes
 */

@JsonTypeName("AppPreviewSet_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreviewSetAttributes {

  private PreviewType previewType;

  public AppPreviewSetAttributes previewType(PreviewType previewType) {
    this.previewType = previewType;
    return this;
  }

  /**
   * Get previewType
   * @return previewType
  */
  @Valid 
  @Schema(name = "previewType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previewType")
  public PreviewType getPreviewType() {
    return previewType;
  }

  public void setPreviewType(PreviewType previewType) {
    this.previewType = previewType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPreviewSetAttributes appPreviewSetAttributes = (AppPreviewSetAttributes) o;
    return Objects.equals(this.previewType, appPreviewSetAttributes.previewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previewType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreviewSetAttributes {\n");
    sb.append("    previewType: ").append(toIndentedString(previewType)).append("\n");
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

