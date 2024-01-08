package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Announcement banner configuration.
 */

@Schema(name = "AnnouncementBannerConfiguration", description = "Announcement banner configuration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AnnouncementBannerConfiguration {

  private String hashId;

  private Boolean isDismissible;

  private Boolean isEnabled;

  private String message;

  /**
   * Visibility of the announcement banner.
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE");

    private String value;

    VisibilityEnum(String value) {
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
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VisibilityEnum visibility;

  public AnnouncementBannerConfiguration hashId(String hashId) {
    this.hashId = hashId;
    return this;
  }

  /**
   * Hash of the banner data. The client detects updates by comparing hash IDs.
   * @return hashId
  */
  
  @Schema(name = "hashId", accessMode = Schema.AccessMode.READ_ONLY, description = "Hash of the banner data. The client detects updates by comparing hash IDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hashId")
  public String getHashId() {
    return hashId;
  }

  public void setHashId(String hashId) {
    this.hashId = hashId;
  }

  public AnnouncementBannerConfiguration isDismissible(Boolean isDismissible) {
    this.isDismissible = isDismissible;
    return this;
  }

  /**
   * Flag indicating if the announcement banner can be dismissed by the user.
   * @return isDismissible
  */
  
  @Schema(name = "isDismissible", accessMode = Schema.AccessMode.READ_ONLY, description = "Flag indicating if the announcement banner can be dismissed by the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDismissible")
  public Boolean getIsDismissible() {
    return isDismissible;
  }

  public void setIsDismissible(Boolean isDismissible) {
    this.isDismissible = isDismissible;
  }

  public AnnouncementBannerConfiguration isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Flag indicating if the announcement banner is enabled or not.
   * @return isEnabled
  */
  
  @Schema(name = "isEnabled", accessMode = Schema.AccessMode.READ_ONLY, description = "Flag indicating if the announcement banner is enabled or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isEnabled")
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public AnnouncementBannerConfiguration message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The text on the announcement banner.
   * @return message
  */
  
  @Schema(name = "message", accessMode = Schema.AccessMode.READ_ONLY, description = "The text on the announcement banner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AnnouncementBannerConfiguration visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of the announcement banner.
   * @return visibility
  */
  
  @Schema(name = "visibility", accessMode = Schema.AccessMode.READ_ONLY, description = "Visibility of the announcement banner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
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
    AnnouncementBannerConfiguration announcementBannerConfiguration = (AnnouncementBannerConfiguration) o;
    return Objects.equals(this.hashId, announcementBannerConfiguration.hashId) &&
        Objects.equals(this.isDismissible, announcementBannerConfiguration.isDismissible) &&
        Objects.equals(this.isEnabled, announcementBannerConfiguration.isEnabled) &&
        Objects.equals(this.message, announcementBannerConfiguration.message) &&
        Objects.equals(this.visibility, announcementBannerConfiguration.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashId, isDismissible, isEnabled, message, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnouncementBannerConfiguration {\n");
    sb.append("    hashId: ").append(toIndentedString(hashId)).append("\n");
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

