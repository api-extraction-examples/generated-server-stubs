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
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An ordered list of custom field option IDs and information on where to move them.
 */

@Schema(name = "OrderOfCustomFieldOptions", description = "An ordered list of custom field option IDs and information on where to move them.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class OrderOfCustomFieldOptions {

  private String after;

  @Valid
  private List<String> customFieldOptionIds = new ArrayList<>();

  /**
   * The position the custom field options should be moved to. Required if `after` isn't provided.
   */
  public enum PositionEnum {
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

  public OrderOfCustomFieldOptions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderOfCustomFieldOptions(List<String> customFieldOptionIds) {
    this.customFieldOptionIds = customFieldOptionIds;
  }

  public OrderOfCustomFieldOptions after(String after) {
    this.after = after;
    return this;
  }

  /**
   * The ID of the custom field option or cascading option to place the moved options after. Required if `position` isn't provided.
   * @return after
  */
  
  @Schema(name = "after", description = "The ID of the custom field option or cascading option to place the moved options after. Required if `position` isn't provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("after")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public OrderOfCustomFieldOptions customFieldOptionIds(List<String> customFieldOptionIds) {
    this.customFieldOptionIds = customFieldOptionIds;
    return this;
  }

  public OrderOfCustomFieldOptions addCustomFieldOptionIdsItem(String customFieldOptionIdsItem) {
    if (this.customFieldOptionIds == null) {
      this.customFieldOptionIds = new ArrayList<>();
    }
    this.customFieldOptionIds.add(customFieldOptionIdsItem);
    return this;
  }

  /**
   * A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.
   * @return customFieldOptionIds
  */
  @NotNull 
  @Schema(name = "customFieldOptionIds", description = "A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customFieldOptionIds")
  public List<String> getCustomFieldOptionIds() {
    return customFieldOptionIds;
  }

  public void setCustomFieldOptionIds(List<String> customFieldOptionIds) {
    this.customFieldOptionIds = customFieldOptionIds;
  }

  public OrderOfCustomFieldOptions position(PositionEnum position) {
    this.position = position;
    return this;
  }

  /**
   * The position the custom field options should be moved to. Required if `after` isn't provided.
   * @return position
  */
  
  @Schema(name = "position", description = "The position the custom field options should be moved to. Required if `after` isn't provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OrderOfCustomFieldOptions orderOfCustomFieldOptions = (OrderOfCustomFieldOptions) o;
    return Objects.equals(this.after, orderOfCustomFieldOptions.after) &&
        Objects.equals(this.customFieldOptionIds, orderOfCustomFieldOptions.customFieldOptionIds) &&
        Objects.equals(this.position, orderOfCustomFieldOptions.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, customFieldOptionIds, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderOfCustomFieldOptions {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    customFieldOptionIds: ").append(toIndentedString(customFieldOptionIds)).append("\n");
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

