package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CustomFieldOptionUpdate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the options to update for a custom field.
 */

@Schema(name = "BulkCustomFieldOptionUpdateRequest", description = "Details of the options to update for a custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class BulkCustomFieldOptionUpdateRequest {

  @Valid
  private List<@Valid CustomFieldOptionUpdate> options;

  public BulkCustomFieldOptionUpdateRequest options(List<@Valid CustomFieldOptionUpdate> options) {
    this.options = options;
    return this;
  }

  public BulkCustomFieldOptionUpdateRequest addOptionsItem(CustomFieldOptionUpdate optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Details of the options to update.
   * @return options
  */
  @Valid 
  @Schema(name = "options", description = "Details of the options to update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public List<@Valid CustomFieldOptionUpdate> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid CustomFieldOptionUpdate> options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkCustomFieldOptionUpdateRequest bulkCustomFieldOptionUpdateRequest = (BulkCustomFieldOptionUpdateRequest) o;
    return Objects.equals(this.options, bulkCustomFieldOptionUpdateRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCustomFieldOptionUpdateRequest {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

