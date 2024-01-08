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
 * MoveFieldBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class MoveFieldBean {

  private URI after;

  /**
   * The named position to which the screen tab field should be moved. Required if `after` isn't provided.
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

  public MoveFieldBean after(URI after) {
    this.after = after;
    return this;
  }

  /**
   * The ID of the screen tab field after which to place the moved screen tab field. Required if `position` isn't provided.
   * @return after
  */
  @Valid 
  @Schema(name = "after", description = "The ID of the screen tab field after which to place the moved screen tab field. Required if `position` isn't provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("after")
  public URI getAfter() {
    return after;
  }

  public void setAfter(URI after) {
    this.after = after;
  }

  public MoveFieldBean position(PositionEnum position) {
    this.position = position;
    return this;
  }

  /**
   * The named position to which the screen tab field should be moved. Required if `after` isn't provided.
   * @return position
  */
  
  @Schema(name = "position", description = "The named position to which the screen tab field should be moved. Required if `after` isn't provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    MoveFieldBean moveFieldBean = (MoveFieldBean) o;
    return Objects.equals(this.after, moveFieldBean.after) &&
        Objects.equals(this.position, moveFieldBean.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveFieldBean {\n");
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

