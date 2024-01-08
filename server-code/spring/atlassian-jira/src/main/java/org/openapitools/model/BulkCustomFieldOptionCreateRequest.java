package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CustomFieldOptionCreate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the options to create for a custom field.
 */

@Schema(name = "BulkCustomFieldOptionCreateRequest", description = "Details of the options to create for a custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class BulkCustomFieldOptionCreateRequest {

  @Valid
  private List<@Valid CustomFieldOptionCreate> options;

  public BulkCustomFieldOptionCreateRequest options(List<@Valid CustomFieldOptionCreate> options) {
    this.options = options;
    return this;
  }

  public BulkCustomFieldOptionCreateRequest addOptionsItem(CustomFieldOptionCreate optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Details of options to create.
   * @return options
  */
  @Valid 
  @Schema(name = "options", description = "Details of options to create.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public List<@Valid CustomFieldOptionCreate> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid CustomFieldOptionCreate> options) {
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
    BulkCustomFieldOptionCreateRequest bulkCustomFieldOptionCreateRequest = (BulkCustomFieldOptionCreateRequest) o;
    return Objects.equals(this.options, bulkCustomFieldOptionCreateRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCustomFieldOptionCreateRequest {\n");
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

