package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MultipleCustomFieldValuesUpdate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * List of updates for a custom fields.
 */

@Schema(name = "MultipleCustomFieldValuesUpdateDetails", description = "List of updates for a custom fields.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class MultipleCustomFieldValuesUpdateDetails {

  @Valid
  private List<@Valid MultipleCustomFieldValuesUpdate> updates;

  public MultipleCustomFieldValuesUpdateDetails updates(List<@Valid MultipleCustomFieldValuesUpdate> updates) {
    this.updates = updates;
    return this;
  }

  public MultipleCustomFieldValuesUpdateDetails addUpdatesItem(MultipleCustomFieldValuesUpdate updatesItem) {
    if (this.updates == null) {
      this.updates = new ArrayList<>();
    }
    this.updates.add(updatesItem);
    return this;
  }

  /**
   * Get updates
   * @return updates
  */
  @Valid 
  @Schema(name = "updates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updates")
  public List<@Valid MultipleCustomFieldValuesUpdate> getUpdates() {
    return updates;
  }

  public void setUpdates(List<@Valid MultipleCustomFieldValuesUpdate> updates) {
    this.updates = updates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails = (MultipleCustomFieldValuesUpdateDetails) o;
    return Objects.equals(this.updates, multipleCustomFieldValuesUpdateDetails.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleCustomFieldValuesUpdateDetails {\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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

