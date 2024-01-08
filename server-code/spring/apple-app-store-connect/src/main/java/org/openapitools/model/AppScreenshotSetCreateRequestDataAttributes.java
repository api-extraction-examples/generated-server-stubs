package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ScreenshotDisplayType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppScreenshotSetCreateRequestDataAttributes
 */

@JsonTypeName("AppScreenshotSetCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppScreenshotSetCreateRequestDataAttributes {

  private ScreenshotDisplayType screenshotDisplayType;

  public AppScreenshotSetCreateRequestDataAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppScreenshotSetCreateRequestDataAttributes(ScreenshotDisplayType screenshotDisplayType) {
    this.screenshotDisplayType = screenshotDisplayType;
  }

  public AppScreenshotSetCreateRequestDataAttributes screenshotDisplayType(ScreenshotDisplayType screenshotDisplayType) {
    this.screenshotDisplayType = screenshotDisplayType;
    return this;
  }

  /**
   * Get screenshotDisplayType
   * @return screenshotDisplayType
  */
  @NotNull @Valid 
  @Schema(name = "screenshotDisplayType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("screenshotDisplayType")
  public ScreenshotDisplayType getScreenshotDisplayType() {
    return screenshotDisplayType;
  }

  public void setScreenshotDisplayType(ScreenshotDisplayType screenshotDisplayType) {
    this.screenshotDisplayType = screenshotDisplayType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppScreenshotSetCreateRequestDataAttributes appScreenshotSetCreateRequestDataAttributes = (AppScreenshotSetCreateRequestDataAttributes) o;
    return Objects.equals(this.screenshotDisplayType, appScreenshotSetCreateRequestDataAttributes.screenshotDisplayType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(screenshotDisplayType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppScreenshotSetCreateRequestDataAttributes {\n");
    sb.append("    screenshotDisplayType: ").append(toIndentedString(screenshotDisplayType)).append("\n");
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

