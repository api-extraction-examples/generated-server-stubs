package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CreateAccessKeyResponseAccessKey;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;CreateAccessKey&lt;/a&gt; request. 
 */

@Schema(name = "CreateAccessKeyResponse", description = "Contains the response to a successful <a>CreateAccessKey</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateAccessKeyResponse {

  private CreateAccessKeyResponseAccessKey accessKey;

  public CreateAccessKeyResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateAccessKeyResponse(CreateAccessKeyResponseAccessKey accessKey) {
    this.accessKey = accessKey;
  }

  public CreateAccessKeyResponse accessKey(CreateAccessKeyResponseAccessKey accessKey) {
    this.accessKey = accessKey;
    return this;
  }

  /**
   * Get accessKey
   * @return accessKey
  */
  @NotNull @Valid 
  @Schema(name = "AccessKey", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AccessKey")
  public CreateAccessKeyResponseAccessKey getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(CreateAccessKeyResponseAccessKey accessKey) {
    this.accessKey = accessKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccessKeyResponse createAccessKeyResponse = (CreateAccessKeyResponse) o;
    return Objects.equals(this.accessKey, createAccessKeyResponse.accessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccessKeyResponse {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
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

