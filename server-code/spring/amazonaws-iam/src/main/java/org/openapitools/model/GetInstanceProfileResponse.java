package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GetInstanceProfileResponseInstanceProfile;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetInstanceProfile&lt;/a&gt; request. 
 */

@Schema(name = "GetInstanceProfileResponse", description = "Contains the response to a successful <a>GetInstanceProfile</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetInstanceProfileResponse {

  private GetInstanceProfileResponseInstanceProfile instanceProfile;

  public GetInstanceProfileResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetInstanceProfileResponse(GetInstanceProfileResponseInstanceProfile instanceProfile) {
    this.instanceProfile = instanceProfile;
  }

  public GetInstanceProfileResponse instanceProfile(GetInstanceProfileResponseInstanceProfile instanceProfile) {
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
  public GetInstanceProfileResponseInstanceProfile getInstanceProfile() {
    return instanceProfile;
  }

  public void setInstanceProfile(GetInstanceProfileResponseInstanceProfile instanceProfile) {
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
    GetInstanceProfileResponse getInstanceProfileResponse = (GetInstanceProfileResponse) o;
    return Objects.equals(this.instanceProfile, getInstanceProfileResponse.instanceProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInstanceProfileResponse {\n");
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

