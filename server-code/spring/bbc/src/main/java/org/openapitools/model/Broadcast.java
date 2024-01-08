package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ProgrammeSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Broadcast
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class Broadcast {

  private Integer duration;

  private String end;

  private Boolean isAudioDescribed;

  private Boolean isBlanked;

  private Boolean isCritical;

  private Boolean isLive;

  private Boolean isRepeat;

  private Boolean isWebcast;

  private String pid;

  private ProgrammeSummary programme;

  private String serviceId;

  private String start;

  private String type;

  private String versionPid;

  public Broadcast() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Broadcast(Integer duration, String end, Boolean isAudioDescribed, Boolean isBlanked, Boolean isCritical, Boolean isLive, Boolean isRepeat, Boolean isWebcast, String pid, String serviceId, String start, String type, String versionPid) {
    this.duration = duration;
    this.end = end;
    this.isAudioDescribed = isAudioDescribed;
    this.isBlanked = isBlanked;
    this.isCritical = isCritical;
    this.isLive = isLive;
    this.isRepeat = isRepeat;
    this.isWebcast = isWebcast;
    this.pid = pid;
    this.serviceId = serviceId;
    this.start = start;
    this.type = type;
    this.versionPid = versionPid;
  }

  public Broadcast duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  */
  @NotNull 
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Broadcast end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @NotNull 
  @Schema(name = "end", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public Broadcast isAudioDescribed(Boolean isAudioDescribed) {
    this.isAudioDescribed = isAudioDescribed;
    return this;
  }

  /**
   * Get isAudioDescribed
   * @return isAudioDescribed
  */
  @NotNull 
  @Schema(name = "is_audio_described", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_audio_described")
  public Boolean getIsAudioDescribed() {
    return isAudioDescribed;
  }

  public void setIsAudioDescribed(Boolean isAudioDescribed) {
    this.isAudioDescribed = isAudioDescribed;
  }

  public Broadcast isBlanked(Boolean isBlanked) {
    this.isBlanked = isBlanked;
    return this;
  }

  /**
   * Get isBlanked
   * @return isBlanked
  */
  @NotNull 
  @Schema(name = "is_blanked", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_blanked")
  public Boolean getIsBlanked() {
    return isBlanked;
  }

  public void setIsBlanked(Boolean isBlanked) {
    this.isBlanked = isBlanked;
  }

  public Broadcast isCritical(Boolean isCritical) {
    this.isCritical = isCritical;
    return this;
  }

  /**
   * Get isCritical
   * @return isCritical
  */
  @NotNull 
  @Schema(name = "is_critical", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_critical")
  public Boolean getIsCritical() {
    return isCritical;
  }

  public void setIsCritical(Boolean isCritical) {
    this.isCritical = isCritical;
  }

  public Broadcast isLive(Boolean isLive) {
    this.isLive = isLive;
    return this;
  }

  /**
   * Get isLive
   * @return isLive
  */
  @NotNull 
  @Schema(name = "is_live", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_live")
  public Boolean getIsLive() {
    return isLive;
  }

  public void setIsLive(Boolean isLive) {
    this.isLive = isLive;
  }

  public Broadcast isRepeat(Boolean isRepeat) {
    this.isRepeat = isRepeat;
    return this;
  }

  /**
   * Get isRepeat
   * @return isRepeat
  */
  @NotNull 
  @Schema(name = "is_repeat", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_repeat")
  public Boolean getIsRepeat() {
    return isRepeat;
  }

  public void setIsRepeat(Boolean isRepeat) {
    this.isRepeat = isRepeat;
  }

  public Broadcast isWebcast(Boolean isWebcast) {
    this.isWebcast = isWebcast;
    return this;
  }

  /**
   * Get isWebcast
   * @return isWebcast
  */
  @NotNull 
  @Schema(name = "is_webcast", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_webcast")
  public Boolean getIsWebcast() {
    return isWebcast;
  }

  public void setIsWebcast(Boolean isWebcast) {
    this.isWebcast = isWebcast;
  }

  public Broadcast pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
  */
  @NotNull 
  @Schema(name = "pid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public Broadcast programme(ProgrammeSummary programme) {
    this.programme = programme;
    return this;
  }

  /**
   * Get programme
   * @return programme
  */
  @Valid 
  @Schema(name = "programme", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("programme")
  public ProgrammeSummary getProgramme() {
    return programme;
  }

  public void setProgramme(ProgrammeSummary programme) {
    this.programme = programme;
  }

  public Broadcast serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  */
  @NotNull 
  @Schema(name = "service_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("service_id")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public Broadcast start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  */
  @NotNull 
  @Schema(name = "start", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public Broadcast type(String type) {
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
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Broadcast versionPid(String versionPid) {
    this.versionPid = versionPid;
    return this;
  }

  /**
   * Get versionPid
   * @return versionPid
  */
  @NotNull 
  @Schema(name = "version_pid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_pid")
  public String getVersionPid() {
    return versionPid;
  }

  public void setVersionPid(String versionPid) {
    this.versionPid = versionPid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Broadcast broadcast = (Broadcast) o;
    return Objects.equals(this.duration, broadcast.duration) &&
        Objects.equals(this.end, broadcast.end) &&
        Objects.equals(this.isAudioDescribed, broadcast.isAudioDescribed) &&
        Objects.equals(this.isBlanked, broadcast.isBlanked) &&
        Objects.equals(this.isCritical, broadcast.isCritical) &&
        Objects.equals(this.isLive, broadcast.isLive) &&
        Objects.equals(this.isRepeat, broadcast.isRepeat) &&
        Objects.equals(this.isWebcast, broadcast.isWebcast) &&
        Objects.equals(this.pid, broadcast.pid) &&
        Objects.equals(this.programme, broadcast.programme) &&
        Objects.equals(this.serviceId, broadcast.serviceId) &&
        Objects.equals(this.start, broadcast.start) &&
        Objects.equals(this.type, broadcast.type) &&
        Objects.equals(this.versionPid, broadcast.versionPid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, end, isAudioDescribed, isBlanked, isCritical, isLive, isRepeat, isWebcast, pid, programme, serviceId, start, type, versionPid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Broadcast {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    isAudioDescribed: ").append(toIndentedString(isAudioDescribed)).append("\n");
    sb.append("    isBlanked: ").append(toIndentedString(isBlanked)).append("\n");
    sb.append("    isCritical: ").append(toIndentedString(isCritical)).append("\n");
    sb.append("    isLive: ").append(toIndentedString(isLive)).append("\n");
    sb.append("    isRepeat: ").append(toIndentedString(isRepeat)).append("\n");
    sb.append("    isWebcast: ").append(toIndentedString(isWebcast)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    programme: ").append(toIndentedString(programme)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    versionPid: ").append(toIndentedString(versionPid)).append("\n");
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

