package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.PhasedReleaseState;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreVersionPhasedReleaseCreateRequestDataAttributes
 */

@JsonTypeName("AppStoreVersionPhasedReleaseCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreVersionPhasedReleaseCreateRequestDataAttributes {

  private PhasedReleaseState phasedReleaseState;

  public AppStoreVersionPhasedReleaseCreateRequestDataAttributes phasedReleaseState(PhasedReleaseState phasedReleaseState) {
    this.phasedReleaseState = phasedReleaseState;
    return this;
  }

  /**
   * Get phasedReleaseState
   * @return phasedReleaseState
  */
  @Valid 
  @Schema(name = "phasedReleaseState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phasedReleaseState")
  public PhasedReleaseState getPhasedReleaseState() {
    return phasedReleaseState;
  }

  public void setPhasedReleaseState(PhasedReleaseState phasedReleaseState) {
    this.phasedReleaseState = phasedReleaseState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreVersionPhasedReleaseCreateRequestDataAttributes appStoreVersionPhasedReleaseCreateRequestDataAttributes = (AppStoreVersionPhasedReleaseCreateRequestDataAttributes) o;
    return Objects.equals(this.phasedReleaseState, appStoreVersionPhasedReleaseCreateRequestDataAttributes.phasedReleaseState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phasedReleaseState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionPhasedReleaseCreateRequestDataAttributes {\n");
    sb.append("    phasedReleaseState: ").append(toIndentedString(phasedReleaseState)).append("\n");
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

