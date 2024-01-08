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
 * PersonalisedMusicVersion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedMusicVersion {

  private Boolean classical;

  private String duration;

  private Boolean radio;

  private String vpid;

  public PersonalisedMusicVersion classical(Boolean classical) {
    this.classical = classical;
    return this;
  }

  /**
   * Get classical
   * @return classical
  */
  
  @Schema(name = "classical", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classical")
  public Boolean getClassical() {
    return classical;
  }

  public void setClassical(Boolean classical) {
    this.classical = classical;
  }

  public PersonalisedMusicVersion duration(String duration) {
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

  public PersonalisedMusicVersion radio(Boolean radio) {
    this.radio = radio;
    return this;
  }

  /**
   * Get radio
   * @return radio
  */
  
  @Schema(name = "radio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("radio")
  public Boolean getRadio() {
    return radio;
  }

  public void setRadio(Boolean radio) {
    this.radio = radio;
  }

  public PersonalisedMusicVersion vpid(String vpid) {
    this.vpid = vpid;
    return this;
  }

  /**
   * Get vpid
   * @return vpid
  */
  
  @Schema(name = "vpid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vpid")
  public String getVpid() {
    return vpid;
  }

  public void setVpid(String vpid) {
    this.vpid = vpid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalisedMusicVersion personalisedMusicVersion = (PersonalisedMusicVersion) o;
    return Objects.equals(this.classical, personalisedMusicVersion.classical) &&
        Objects.equals(this.duration, personalisedMusicVersion.duration) &&
        Objects.equals(this.radio, personalisedMusicVersion.radio) &&
        Objects.equals(this.vpid, personalisedMusicVersion.vpid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classical, duration, radio, vpid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedMusicVersion {\n");
    sb.append("    classical: ").append(toIndentedString(classical)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    radio: ").append(toIndentedString(radio)).append("\n");
    sb.append("    vpid: ").append(toIndentedString(vpid)).append("\n");
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

