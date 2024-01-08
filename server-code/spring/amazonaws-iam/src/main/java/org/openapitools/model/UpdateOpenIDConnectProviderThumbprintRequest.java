package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateOpenIDConnectProviderThumbprintRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateOpenIDConnectProviderThumbprintRequest {

  private String openIDConnectProviderArn;

  private List thumbprintList;

  public UpdateOpenIDConnectProviderThumbprintRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOpenIDConnectProviderThumbprintRequest(String openIDConnectProviderArn, List thumbprintList) {
    this.openIDConnectProviderArn = openIDConnectProviderArn;
    this.thumbprintList = thumbprintList;
  }

  public UpdateOpenIDConnectProviderThumbprintRequest openIDConnectProviderArn(String openIDConnectProviderArn) {
    this.openIDConnectProviderArn = openIDConnectProviderArn;
    return this;
  }

  /**
   * Get openIDConnectProviderArn
   * @return openIDConnectProviderArn
  */
  @NotNull 
  @Schema(name = "OpenIDConnectProviderArn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("OpenIDConnectProviderArn")
  public String getOpenIDConnectProviderArn() {
    return openIDConnectProviderArn;
  }

  public void setOpenIDConnectProviderArn(String openIDConnectProviderArn) {
    this.openIDConnectProviderArn = openIDConnectProviderArn;
  }

  public UpdateOpenIDConnectProviderThumbprintRequest thumbprintList(List thumbprintList) {
    this.thumbprintList = thumbprintList;
    return this;
  }

  /**
   * Get thumbprintList
   * @return thumbprintList
  */
  @NotNull @Valid 
  @Schema(name = "ThumbprintList", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ThumbprintList")
  public List getThumbprintList() {
    return thumbprintList;
  }

  public void setThumbprintList(List thumbprintList) {
    this.thumbprintList = thumbprintList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOpenIDConnectProviderThumbprintRequest updateOpenIDConnectProviderThumbprintRequest = (UpdateOpenIDConnectProviderThumbprintRequest) o;
    return Objects.equals(this.openIDConnectProviderArn, updateOpenIDConnectProviderThumbprintRequest.openIDConnectProviderArn) &&
        Objects.equals(this.thumbprintList, updateOpenIDConnectProviderThumbprintRequest.thumbprintList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openIDConnectProviderArn, thumbprintList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOpenIDConnectProviderThumbprintRequest {\n");
    sb.append("    openIDConnectProviderArn: ").append(toIndentedString(openIDConnectProviderArn)).append("\n");
    sb.append("    thumbprintList: ").append(toIndentedString(thumbprintList)).append("\n");
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

