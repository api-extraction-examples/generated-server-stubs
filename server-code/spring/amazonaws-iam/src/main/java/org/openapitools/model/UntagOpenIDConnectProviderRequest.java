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
 * UntagOpenIDConnectProviderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UntagOpenIDConnectProviderRequest {

  private String openIDConnectProviderArn;

  private List tagKeys;

  public UntagOpenIDConnectProviderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UntagOpenIDConnectProviderRequest(String openIDConnectProviderArn, List tagKeys) {
    this.openIDConnectProviderArn = openIDConnectProviderArn;
    this.tagKeys = tagKeys;
  }

  public UntagOpenIDConnectProviderRequest openIDConnectProviderArn(String openIDConnectProviderArn) {
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

  public UntagOpenIDConnectProviderRequest tagKeys(List tagKeys) {
    this.tagKeys = tagKeys;
    return this;
  }

  /**
   * Get tagKeys
   * @return tagKeys
  */
  @NotNull @Valid 
  @Schema(name = "TagKeys", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TagKeys")
  public List getTagKeys() {
    return tagKeys;
  }

  public void setTagKeys(List tagKeys) {
    this.tagKeys = tagKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UntagOpenIDConnectProviderRequest untagOpenIDConnectProviderRequest = (UntagOpenIDConnectProviderRequest) o;
    return Objects.equals(this.openIDConnectProviderArn, untagOpenIDConnectProviderRequest.openIDConnectProviderArn) &&
        Objects.equals(this.tagKeys, untagOpenIDConnectProviderRequest.tagKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openIDConnectProviderArn, tagKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UntagOpenIDConnectProviderRequest {\n");
    sb.append("    openIDConnectProviderArn: ").append(toIndentedString(openIDConnectProviderArn)).append("\n");
    sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
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

