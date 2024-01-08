package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VersionMoveBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class VersionMoveBean {

  private URI after;

  /**
   * An absolute position in which to place the moved version. Cannot be used with `after`.
   */
  public enum PositionEnum {
    EARLIER("Earlier"),
    
    LATER("Later"),
    
    FIRST("First"),
    
    LAST("Last");

    private String value;

    PositionEnum(String value) {
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
    public static PositionEnum fromValue(String value) {
      for (PositionEnum b : PositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PositionEnum position;

  public VersionMoveBean after(URI after) {
    this.after = after;
    return this;
  }

  /**
   * The URL (self link) of the version after which to place the moved version. Cannot be used with `position`.
   * @return after
  */
  @Valid 
  @Schema(name = "after", description = "The URL (self link) of the version after which to place the moved version. Cannot be used with `position`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("after")
  public URI getAfter() {
    return after;
  }

  public void setAfter(URI after) {
    this.after = after;
  }

  public VersionMoveBean position(PositionEnum position) {
    this.position = position;
    return this;
  }

  /**
   * An absolute position in which to place the moved version. Cannot be used with `after`.
   * @return position
  */
  
  @Schema(name = "position", description = "An absolute position in which to place the moved version. Cannot be used with `after`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionMoveBean versionMoveBean = (VersionMoveBean) o;
    return Objects.equals(this.after, versionMoveBean.after) &&
        Objects.equals(this.position, versionMoveBean.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionMoveBean {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

