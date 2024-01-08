package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CreateInstanceProfileResponseInstanceProfile;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;CreateInstanceProfile&lt;/a&gt; request. 
 */

@Schema(name = "CreateInstanceProfileResponse", description = "Contains the response to a successful <a>CreateInstanceProfile</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateInstanceProfileResponse {

  private CreateInstanceProfileResponseInstanceProfile instanceProfile;

  public CreateInstanceProfileResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateInstanceProfileResponse(CreateInstanceProfileResponseInstanceProfile instanceProfile) {
    this.instanceProfile = instanceProfile;
  }

  public CreateInstanceProfileResponse instanceProfile(CreateInstanceProfileResponseInstanceProfile instanceProfile) {
    this.instanceProfile = instanceProfile;
    return this;
  }

  /**
   * Get instanceProfile
   * @return instanceProfile
  */
  @NotNull @Valid 
  @Schema(name = "InstanceProfile", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("InstanceProfile")
  public CreateInstanceProfileResponseInstanceProfile getInstanceProfile() {
    return instanceProfile;
  }

  public void setInstanceProfile(CreateInstanceProfileResponseInstanceProfile instanceProfile) {
    this.instanceProfile = instanceProfile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstanceProfileResponse createInstanceProfileResponse = (CreateInstanceProfileResponse) o;
    return Objects.equals(this.instanceProfile, createInstanceProfileResponse.instanceProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstanceProfileResponse {\n");
    sb.append("    instanceProfile: ").append(toIndentedString(instanceProfile)).append("\n");
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

