package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CustomFieldValueUpdate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of updates for a custom field.
 */

@Schema(name = "CustomFieldValueUpdateDetails", description = "Details of updates for a custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldValueUpdateDetails {

  @Valid
  private List<@Valid CustomFieldValueUpdate> updates;

  public CustomFieldValueUpdateDetails updates(List<@Valid CustomFieldValueUpdate> updates) {
    this.updates = updates;
    return this;
  }

  public CustomFieldValueUpdateDetails addUpdatesItem(CustomFieldValueUpdate updatesItem) {
    if (this.updates == null) {
      this.updates = new ArrayList<>();
    }
    this.updates.add(updatesItem);
    return this;
  }

  /**
   * The list of custom field update details.
   * @return updates
  */
  @Valid 
  @Schema(name = "updates", description = "The list of custom field update details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updates")
  public List<@Valid CustomFieldValueUpdate> getUpdates() {
    return updates;
  }

  public void setUpdates(List<@Valid CustomFieldValueUpdate> updates) {
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
    CustomFieldValueUpdateDetails customFieldValueUpdateDetails = (CustomFieldValueUpdateDetails) o;
    return Objects.equals(this.updates, customFieldValueUpdateDetails.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldValueUpdateDetails {\n");
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

