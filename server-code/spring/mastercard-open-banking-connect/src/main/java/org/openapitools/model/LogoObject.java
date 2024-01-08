package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.LogoFileType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Logo metadata and image content
 */

@Schema(name = "LogoObject", description = "Logo metadata and image content")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class LogoObject {

  private String binaryContent;

  private LogoFileType fileType;

  private String logoUrl;

  public LogoObject binaryContent(String binaryContent) {
    this.binaryContent = binaryContent;
    return this;
  }

  /**
   * This field is deprecated, use logoUrl instead
   * @return binaryContent
  */
  
  @Schema(name = "binaryContent", description = "This field is deprecated, use logoUrl instead", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("binaryContent")
  public String getBinaryContent() {
    return binaryContent;
  }

  public void setBinaryContent(String binaryContent) {
    this.binaryContent = binaryContent;
  }

  public LogoObject fileType(LogoFileType fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * Get fileType
   * @return fileType
  */
  @Valid 
  @Schema(name = "fileType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileType")
  public LogoFileType getFileType() {
    return fileType;
  }

  public void setFileType(LogoFileType fileType) {
    this.fileType = fileType;
  }

  public LogoObject logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  /**
   * URL to a logo file
   * @return logoUrl
  */
  
  @Schema(name = "logoUrl", example = "https://openbanking.mastercard.eu/live/imgs/16f0f635-9d94-4976-b49b-584ca231c232.svg", description = "URL to a logo file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logoUrl")
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogoObject logoObject = (LogoObject) o;
    return Objects.equals(this.binaryContent, logoObject.binaryContent) &&
        Objects.equals(this.fileType, logoObject.fileType) &&
        Objects.equals(this.logoUrl, logoObject.logoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryContent, fileType, logoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogoObject {\n");
    sb.append("    binaryContent: ").append(toIndentedString(binaryContent)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
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

