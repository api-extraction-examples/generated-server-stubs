package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ExternalBetaState;
import org.openapitools.model.InternalBetaState;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildBetaDetailAttributes
 */

@JsonTypeName("BuildBetaDetail_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BuildBetaDetailAttributes {

  private Boolean autoNotifyEnabled;

  private ExternalBetaState externalBuildState;

  private InternalBetaState internalBuildState;

  public BuildBetaDetailAttributes autoNotifyEnabled(Boolean autoNotifyEnabled) {
    this.autoNotifyEnabled = autoNotifyEnabled;
    return this;
  }

  /**
   * Get autoNotifyEnabled
   * @return autoNotifyEnabled
  */
  
  @Schema(name = "autoNotifyEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoNotifyEnabled")
  public Boolean getAutoNotifyEnabled() {
    return autoNotifyEnabled;
  }

  public void setAutoNotifyEnabled(Boolean autoNotifyEnabled) {
    this.autoNotifyEnabled = autoNotifyEnabled;
  }

  public BuildBetaDetailAttributes externalBuildState(ExternalBetaState externalBuildState) {
    this.externalBuildState = externalBuildState;
    return this;
  }

  /**
   * Get externalBuildState
   * @return externalBuildState
  */
  @Valid 
  @Schema(name = "externalBuildState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalBuildState")
  public ExternalBetaState getExternalBuildState() {
    return externalBuildState;
  }

  public void setExternalBuildState(ExternalBetaState externalBuildState) {
    this.externalBuildState = externalBuildState;
  }

  public BuildBetaDetailAttributes internalBuildState(InternalBetaState internalBuildState) {
    this.internalBuildState = internalBuildState;
    return this;
  }

  /**
   * Get internalBuildState
   * @return internalBuildState
  */
  @Valid 
  @Schema(name = "internalBuildState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internalBuildState")
  public InternalBetaState getInternalBuildState() {
    return internalBuildState;
  }

  public void setInternalBuildState(InternalBetaState internalBuildState) {
    this.internalBuildState = internalBuildState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildBetaDetailAttributes buildBetaDetailAttributes = (BuildBetaDetailAttributes) o;
    return Objects.equals(this.autoNotifyEnabled, buildBetaDetailAttributes.autoNotifyEnabled) &&
        Objects.equals(this.externalBuildState, buildBetaDetailAttributes.externalBuildState) &&
        Objects.equals(this.internalBuildState, buildBetaDetailAttributes.internalBuildState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoNotifyEnabled, externalBuildState, internalBuildState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildBetaDetailAttributes {\n");
    sb.append("    autoNotifyEnabled: ").append(toIndentedString(autoNotifyEnabled)).append("\n");
    sb.append("    externalBuildState: ").append(toIndentedString(externalBuildState)).append("\n");
    sb.append("    internalBuildState: ").append(toIndentedString(internalBuildState)).append("\n");
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

