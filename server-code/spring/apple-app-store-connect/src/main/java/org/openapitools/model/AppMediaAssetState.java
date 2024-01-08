package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppMediaStateError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppMediaAssetState
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppMediaAssetState {

  @Valid
  private List<@Valid AppMediaStateError> errors;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    AWAITING_UPLOAD("AWAITING_UPLOAD"),
    
    UPLOAD_COMPLETE("UPLOAD_COMPLETE"),
    
    COMPLETE("COMPLETE"),
    
    FAILED("FAILED");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  @Valid
  private List<@Valid AppMediaStateError> warnings;

  public AppMediaAssetState errors(List<@Valid AppMediaStateError> errors) {
    this.errors = errors;
    return this;
  }

  public AppMediaAssetState addErrorsItem(AppMediaStateError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid AppMediaStateError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid AppMediaStateError> errors) {
    this.errors = errors;
  }

  public AppMediaAssetState state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public AppMediaAssetState warnings(List<@Valid AppMediaStateError> warnings) {
    this.warnings = warnings;
    return this;
  }

  public AppMediaAssetState addWarningsItem(AppMediaStateError warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Get warnings
   * @return warnings
  */
  @Valid 
  @Schema(name = "warnings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warnings")
  public List<@Valid AppMediaStateError> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<@Valid AppMediaStateError> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppMediaAssetState appMediaAssetState = (AppMediaAssetState) o;
    return Objects.equals(this.errors, appMediaAssetState.errors) &&
        Objects.equals(this.state, appMediaAssetState.state) &&
        Objects.equals(this.warnings, appMediaAssetState.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, state, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppMediaAssetState {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

