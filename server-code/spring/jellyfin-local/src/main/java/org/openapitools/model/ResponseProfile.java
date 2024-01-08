package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DlnaProfileType;
import org.openapitools.model.ProfileCondition;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResponseProfile
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ResponseProfile {

  private JsonNullable<String> audioCodec = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid ProfileCondition>> conditions = JsonNullable.<List<@Valid ProfileCondition>>undefined();

  private JsonNullable<String> container = JsonNullable.<String>undefined();

  private JsonNullable<String> mimeType = JsonNullable.<String>undefined();

  private JsonNullable<String> orgPn = JsonNullable.<String>undefined();

  private DlnaProfileType type;

  private JsonNullable<String> videoCodec = JsonNullable.<String>undefined();

  public ResponseProfile audioCodec(String audioCodec) {
    this.audioCodec = JsonNullable.of(audioCodec);
    return this;
  }

  /**
   * Get audioCodec
   * @return audioCodec
  */
  
  @Schema(name = "AudioCodec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AudioCodec")
  public JsonNullable<String> getAudioCodec() {
    return audioCodec;
  }

  public void setAudioCodec(JsonNullable<String> audioCodec) {
    this.audioCodec = audioCodec;
  }

  public ResponseProfile conditions(List<@Valid ProfileCondition> conditions) {
    this.conditions = JsonNullable.of(conditions);
    return this;
  }

  public ResponseProfile addConditionsItem(ProfileCondition conditionsItem) {
    if (this.conditions == null || !this.conditions.isPresent()) {
      this.conditions = JsonNullable.of(new ArrayList<>());
    }
    this.conditions.get().add(conditionsItem);
    return this;
  }

  /**
   * Get conditions
   * @return conditions
  */
  @Valid 
  @Schema(name = "Conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Conditions")
  public JsonNullable<List<@Valid ProfileCondition>> getConditions() {
    return conditions;
  }

  public void setConditions(JsonNullable<List<@Valid ProfileCondition>> conditions) {
    this.conditions = conditions;
  }

  public ResponseProfile container(String container) {
    this.container = JsonNullable.of(container);
    return this;
  }

  /**
   * Get container
   * @return container
  */
  
  @Schema(name = "Container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Container")
  public JsonNullable<String> getContainer() {
    return container;
  }

  public void setContainer(JsonNullable<String> container) {
    this.container = container;
  }

  public ResponseProfile mimeType(String mimeType) {
    this.mimeType = JsonNullable.of(mimeType);
    return this;
  }

  /**
   * Get mimeType
   * @return mimeType
  */
  
  @Schema(name = "MimeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MimeType")
  public JsonNullable<String> getMimeType() {
    return mimeType;
  }

  public void setMimeType(JsonNullable<String> mimeType) {
    this.mimeType = mimeType;
  }

  public ResponseProfile orgPn(String orgPn) {
    this.orgPn = JsonNullable.of(orgPn);
    return this;
  }

  /**
   * Get orgPn
   * @return orgPn
  */
  
  @Schema(name = "OrgPn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrgPn")
  public JsonNullable<String> getOrgPn() {
    return orgPn;
  }

  public void setOrgPn(JsonNullable<String> orgPn) {
    this.orgPn = orgPn;
  }

  public ResponseProfile type(DlnaProfileType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public DlnaProfileType getType() {
    return type;
  }

  public void setType(DlnaProfileType type) {
    this.type = type;
  }

  public ResponseProfile videoCodec(String videoCodec) {
    this.videoCodec = JsonNullable.of(videoCodec);
    return this;
  }

  /**
   * Get videoCodec
   * @return videoCodec
  */
  
  @Schema(name = "VideoCodec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VideoCodec")
  public JsonNullable<String> getVideoCodec() {
    return videoCodec;
  }

  public void setVideoCodec(JsonNullable<String> videoCodec) {
    this.videoCodec = videoCodec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseProfile responseProfile = (ResponseProfile) o;
    return equalsNullable(this.audioCodec, responseProfile.audioCodec) &&
        equalsNullable(this.conditions, responseProfile.conditions) &&
        equalsNullable(this.container, responseProfile.container) &&
        equalsNullable(this.mimeType, responseProfile.mimeType) &&
        equalsNullable(this.orgPn, responseProfile.orgPn) &&
        Objects.equals(this.type, responseProfile.type) &&
        equalsNullable(this.videoCodec, responseProfile.videoCodec);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(audioCodec), hashCodeNullable(conditions), hashCodeNullable(container), hashCodeNullable(mimeType), hashCodeNullable(orgPn), type, hashCodeNullable(videoCodec));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseProfile {\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    orgPn: ").append(toIndentedString(orgPn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
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

