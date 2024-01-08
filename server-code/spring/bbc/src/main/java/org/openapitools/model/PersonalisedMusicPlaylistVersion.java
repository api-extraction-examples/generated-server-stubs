package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedMusicPlaylistVersion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedMusicPlaylistVersion {

  private String duration;

  private String expiresAt;

  private String id;

  private String startsAt;

  @Valid
  private List<String> warnings = new ArrayList<>();

  public PersonalisedMusicPlaylistVersion() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedMusicPlaylistVersion(List<String> warnings) {
    this.warnings = warnings;
  }

  public PersonalisedMusicPlaylistVersion duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  */
  
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public PersonalisedMusicPlaylistVersion expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   * @return expiresAt
  */
  
  @Schema(name = "expires_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_at")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public PersonalisedMusicPlaylistVersion id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PersonalisedMusicPlaylistVersion startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * Get startsAt
   * @return startsAt
  */
  
  @Schema(name = "starts_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("starts_at")
  public String getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }

  public PersonalisedMusicPlaylistVersion warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public PersonalisedMusicPlaylistVersion addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Get warnings
   * @return warnings
  */
  @NotNull 
  @Schema(name = "warnings", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warnings")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalisedMusicPlaylistVersion personalisedMusicPlaylistVersion = (PersonalisedMusicPlaylistVersion) o;
    return Objects.equals(this.duration, personalisedMusicPlaylistVersion.duration) &&
        Objects.equals(this.expiresAt, personalisedMusicPlaylistVersion.expiresAt) &&
        Objects.equals(this.id, personalisedMusicPlaylistVersion.id) &&
        Objects.equals(this.startsAt, personalisedMusicPlaylistVersion.startsAt) &&
        Objects.equals(this.warnings, personalisedMusicPlaylistVersion.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, expiresAt, id, startsAt, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedMusicPlaylistVersion {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

