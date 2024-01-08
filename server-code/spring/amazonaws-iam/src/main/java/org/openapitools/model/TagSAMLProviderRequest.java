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
 * TagSAMLProviderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class TagSAMLProviderRequest {

  private String saMLProviderArn;

  private List tags;

  public TagSAMLProviderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TagSAMLProviderRequest(String saMLProviderArn, List tags) {
    this.saMLProviderArn = saMLProviderArn;
    this.tags = tags;
  }

  public TagSAMLProviderRequest saMLProviderArn(String saMLProviderArn) {
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

  public TagSAMLProviderRequest tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @NotNull @Valid 
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Tags")
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagSAMLProviderRequest tagSAMLProviderRequest = (TagSAMLProviderRequest) o;
    return Objects.equals(this.saMLProviderArn, tagSAMLProviderRequest.saMLProviderArn) &&
        Objects.equals(this.tags, tagSAMLProviderRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saMLProviderArn, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagSAMLProviderRequest {\n");
    sb.append("    saMLProviderArn: ").append(toIndentedString(saMLProviderArn)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

