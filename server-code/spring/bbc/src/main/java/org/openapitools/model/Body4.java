package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Body4
 */

@JsonTypeName("Body_4")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class Body4 {

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    STARTED("started"),
    
    ENDED("ended"),
    
    PAUSED("paused"),
    
    HEARTBEAT("heartbeat");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ActionEnum action;

  private Integer elapsedTime;

  private String pid;

  /**
   * Gets or Sets resourceType
   */
  public enum ResourceTypeEnum {
    EPISODE("episode"),
    
    CLIP("clip");

    private String value;

    ResourceTypeEnum(String value) {
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
    public static ResourceTypeEnum fromValue(String value) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ResourceTypeEnum resourceType;

  private String versionPid;

  public Body4() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Body4(ActionEnum action, Integer elapsedTime, String pid, ResourceTypeEnum resourceType, String versionPid) {
    this.action = action;
    this.elapsedTime = elapsedTime;
    this.pid = pid;
    this.resourceType = resourceType;
    this.versionPid = versionPid;
  }

  public Body4 action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */
  @NotNull 
  @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public Body4 elapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

  /**
   * Get elapsedTime
   * @return elapsedTime
  */
  @NotNull 
  @Schema(name = "elapsed_time", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elapsed_time")
  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public Body4 pid(String pid) {
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

  public Body4 resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
  */
  @NotNull 
  @Schema(name = "resource_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resource_type")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  public Body4 versionPid(String versionPid) {
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
    Body4 body4 = (Body4) o;
    return Objects.equals(this.action, body4.action) &&
        Objects.equals(this.elapsedTime, body4.elapsedTime) &&
        Objects.equals(this.pid, body4.pid) &&
        Objects.equals(this.resourceType, body4.resourceType) &&
        Objects.equals(this.versionPid, body4.versionPid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, elapsedTime, pid, resourceType, versionPid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body4 {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

