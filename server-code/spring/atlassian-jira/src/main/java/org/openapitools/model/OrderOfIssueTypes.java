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
 * An ordered list of issue type IDs and information about where to move them.
 */

@Schema(name = "OrderOfIssueTypes", description = "An ordered list of issue type IDs and information about where to move them.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class OrderOfIssueTypes {

  private String after;

  @Valid
  private List<String> issueTypeIds = new ArrayList<>();

  /**
   * The position the issue types should be moved to. Required if `after` isn't provided.
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

  public OrderOfIssueTypes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderOfIssueTypes(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }

  public OrderOfIssueTypes after(String after) {
    this.after = after;
    return this;
  }

  /**
   * The ID of the issue type to place the moved issue types after. Required if `position` isn't provided.
   * @return after
  */
  
  @Schema(name = "after", description = "The ID of the issue type to place the moved issue types after. Required if `position` isn't provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("after")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public OrderOfIssueTypes issueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public OrderOfIssueTypes addIssueTypeIdsItem(String issueTypeIdsItem) {
    if (this.issueTypeIds == null) {
      this.issueTypeIds = new ArrayList<>();
    }
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

  /**
   * A list of the issue type IDs to move. The order of the issue type IDs in the list is the order they are given after the move.
   * @return issueTypeIds
  */
  @NotNull 
  @Schema(name = "issueTypeIds", description = "A list of the issue type IDs to move. The order of the issue type IDs in the list is the order they are given after the move.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeIds")
  public List<String> getIssueTypeIds() {
    return issueTypeIds;
  }

  public void setIssueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }

  public OrderOfIssueTypes position(PositionEnum position) {
    this.position = position;
    return this;
  }

  /**
   * The position the issue types should be moved to. Required if `after` isn't provided.
   * @return position
  */
  
  @Schema(name = "position", description = "The position the issue types should be moved to. Required if `after` isn't provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OrderOfIssueTypes orderOfIssueTypes = (OrderOfIssueTypes) o;
    return Objects.equals(this.after, orderOfIssueTypes.after) &&
        Objects.equals(this.issueTypeIds, orderOfIssueTypes.issueTypeIds) &&
        Objects.equals(this.position, orderOfIssueTypes.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, issueTypeIds, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderOfIssueTypes {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
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

