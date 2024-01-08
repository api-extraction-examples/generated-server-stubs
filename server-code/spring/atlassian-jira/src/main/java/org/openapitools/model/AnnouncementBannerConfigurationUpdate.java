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
 * Configuration of the announcement banner.
 */

@Schema(name = "AnnouncementBannerConfigurationUpdate", description = "Configuration of the announcement banner.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AnnouncementBannerConfigurationUpdate {

  private Boolean isDismissible;

  private Boolean isEnabled;

  private String message;

  private String visibility;

  public AnnouncementBannerConfigurationUpdate isDismissible(Boolean isDismissible) {
    this.isDismissible = isDismissible;
    return this;
  }

  /**
   * Flag indicating if the announcement banner can be dismissed by the user.
   * @return isDismissible
  */
  
  @Schema(name = "isDismissible", description = "Flag indicating if the announcement banner can be dismissed by the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDismissible")
  public Boolean getIsDismissible() {
    return isDismissible;
  }

  public void setIsDismissible(Boolean isDismissible) {
    this.isDismissible = isDismissible;
  }

  public AnnouncementBannerConfigurationUpdate isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Flag indicating if the announcement banner is enabled or not.
   * @return isEnabled
  */
  
  @Schema(name = "isEnabled", description = "Flag indicating if the announcement banner is enabled or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isEnabled")
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public AnnouncementBannerConfigurationUpdate message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The text on the announcement banner.
   * @return message
  */
  
  @Schema(name = "message", description = "The text on the announcement banner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AnnouncementBannerConfigurationUpdate visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of the announcement banner. Can be public or private.
   * @return visibility
  */
  
  @Schema(name = "visibility", description = "Visibility of the announcement banner. Can be public or private.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnouncementBannerConfigurationUpdate announcementBannerConfigurationUpdate = (AnnouncementBannerConfigurationUpdate) o;
    return Objects.equals(this.isDismissible, announcementBannerConfigurationUpdate.isDismissible) &&
        Objects.equals(this.isEnabled, announcementBannerConfigurationUpdate.isEnabled) &&
        Objects.equals(this.message, announcementBannerConfigurationUpdate.message) &&
        Objects.equals(this.visibility, announcementBannerConfigurationUpdate.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDismissible, isEnabled, message, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnouncementBannerConfigurationUpdate {\n");
    sb.append("    isDismissible: ").append(toIndentedString(isDismissible)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

