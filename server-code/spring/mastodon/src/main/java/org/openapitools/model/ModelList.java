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
 * Represents a list of some users that the authenticated user follows.
 */

@Schema(name = "List", description = "Represents a list of some users that the authenticated user follows.")
@JsonTypeName("List")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ModelList {

  private String id;

  /**
   * The user-defined title of the list.
   */
  public enum RepliesPolicyEnum {
    FOLLOWED("followed"),
    
    LIST("list"),
    
    NONE("none");

    private String value;

    RepliesPolicyEnum(String value) {
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
    public static RepliesPolicyEnum fromValue(String value) {
      for (RepliesPolicyEnum b : RepliesPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RepliesPolicyEnum repliesPolicy;

  private String title;

  public ModelList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ModelList(String id, RepliesPolicyEnum repliesPolicy, String title) {
    this.id = id;
    this.repliesPolicy = repliesPolicy;
    this.title = title;
  }

  public ModelList id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The internal database ID of the list. Cast from an integer, but not guaranteed to be a number.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The internal database ID of the list. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ModelList repliesPolicy(RepliesPolicyEnum repliesPolicy) {
    this.repliesPolicy = repliesPolicy;
    return this;
  }

  /**
   * The user-defined title of the list.
   * @return repliesPolicy
  */
  @NotNull 
  @Schema(name = "replies_policy", description = "The user-defined title of the list.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("replies_policy")
  public RepliesPolicyEnum getRepliesPolicy() {
    return repliesPolicy;
  }

  public void setRepliesPolicy(RepliesPolicyEnum repliesPolicy) {
    this.repliesPolicy = repliesPolicy;
  }

  public ModelList title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The user-defined title of the list.
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "The user-defined title of the list.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelList _list = (ModelList) o;
    return Objects.equals(this.id, _list.id) &&
        Objects.equals(this.repliesPolicy, _list.repliesPolicy) &&
        Objects.equals(this.title, _list.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, repliesPolicy, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelList {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repliesPolicy: ").append(toIndentedString(repliesPolicy)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

