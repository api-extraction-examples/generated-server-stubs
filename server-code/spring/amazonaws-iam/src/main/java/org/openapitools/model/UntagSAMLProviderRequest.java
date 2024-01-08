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
 * UntagSAMLProviderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UntagSAMLProviderRequest {

  private String saMLProviderArn;

  private List tagKeys;

  public UntagSAMLProviderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UntagSAMLProviderRequest(String saMLProviderArn, List tagKeys) {
    this.saMLProviderArn = saMLProviderArn;
    this.tagKeys = tagKeys;
  }

  public UntagSAMLProviderRequest saMLProviderArn(String saMLProviderArn) {
    this.saMLProviderArn = saMLProviderArn;
    return this;
  }

  /**
   * Get saMLProviderArn
   * @return saMLProviderArn
  */
  @NotNull 
  @Schema(name = "SAMLProviderArn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SAMLProviderArn")
  public String getSaMLProviderArn() {
    return saMLProviderArn;
  }

  public void setSaMLProviderArn(String saMLProviderArn) {
    this.saMLProviderArn = saMLProviderArn;
  }

  public UntagSAMLProviderRequest tagKeys(List tagKeys) {
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
    UntagSAMLProviderRequest untagSAMLProviderRequest = (UntagSAMLProviderRequest) o;
    return Objects.equals(this.saMLProviderArn, untagSAMLProviderRequest.saMLProviderArn) &&
        Objects.equals(this.tagKeys, untagSAMLProviderRequest.tagKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saMLProviderArn, tagKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UntagSAMLProviderRequest {\n");
    sb.append("    saMLProviderArn: ").append(toIndentedString(saMLProviderArn)).append("\n");
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

