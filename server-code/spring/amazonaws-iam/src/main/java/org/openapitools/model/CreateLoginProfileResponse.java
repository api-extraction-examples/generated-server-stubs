package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CreateLoginProfileResponseLoginProfile;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;CreateLoginProfile&lt;/a&gt; request. 
 */

@Schema(name = "CreateLoginProfileResponse", description = "Contains the response to a successful <a>CreateLoginProfile</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateLoginProfileResponse {

  private CreateLoginProfileResponseLoginProfile loginProfile;

  public CreateLoginProfileResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateLoginProfileResponse(CreateLoginProfileResponseLoginProfile loginProfile) {
    this.loginProfile = loginProfile;
  }

  public CreateLoginProfileResponse loginProfile(CreateLoginProfileResponseLoginProfile loginProfile) {
    this.loginProfile = loginProfile;
    return this;
  }

  /**
   * Get loginProfile
   * @return loginProfile
  */
  @NotNull @Valid 
  @Schema(name = "LoginProfile", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LoginProfile")
  public CreateLoginProfileResponseLoginProfile getLoginProfile() {
    return loginProfile;
  }

  public void setLoginProfile(CreateLoginProfileResponseLoginProfile loginProfile) {
    this.loginProfile = loginProfile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLoginProfileResponse createLoginProfileResponse = (CreateLoginProfileResponse) o;
    return Objects.equals(this.loginProfile, createLoginProfileResponse.loginProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLoginProfileResponse {\n");
    sb.append("    loginProfile: ").append(toIndentedString(loginProfile)).append("\n");
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

