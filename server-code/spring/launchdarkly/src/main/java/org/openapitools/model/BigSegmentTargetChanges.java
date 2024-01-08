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
 * BigSegmentTargetChanges
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class BigSegmentTargetChanges {

  @Valid
  private List<String> add;

  @Valid
  private List<String> remove;

  public BigSegmentTargetChanges add(List<String> add) {
    this.add = add;
    return this;
  }

  public BigSegmentTargetChanges addAddItem(String addItem) {
    if (this.add == null) {
      this.add = new ArrayList<>();
    }
    this.add.add(addItem);
    return this;
  }

  /**
   * Users to add to this list of targets
   * @return add
  */
  
  @Schema(name = "add", example = "[user@launchdarkly.com]", description = "Users to add to this list of targets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("add")
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(List<String> add) {
    this.add = add;
  }

  public BigSegmentTargetChanges remove(List<String> remove) {
    this.remove = remove;
    return this;
  }

  public BigSegmentTargetChanges addRemoveItem(String removeItem) {
    if (this.remove == null) {
      this.remove = new ArrayList<>();
    }
    this.remove.add(removeItem);
    return this;
  }

  /**
   * Users to remove from this list of targets
   * @return remove
  */
  
  @Schema(name = "remove", example = "[]", description = "Users to remove from this list of targets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remove")
  public List<String> getRemove() {
    return remove;
  }

  public void setRemove(List<String> remove) {
    this.remove = remove;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigSegmentTargetChanges bigSegmentTargetChanges = (BigSegmentTargetChanges) o;
    return Objects.equals(this.add, bigSegmentTargetChanges.add) &&
        Objects.equals(this.remove, bigSegmentTargetChanges.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigSegmentTargetChanges {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
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

