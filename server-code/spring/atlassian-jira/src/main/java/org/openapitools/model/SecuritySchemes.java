package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SecurityScheme;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * List of security schemes.
 */

@Schema(name = "SecuritySchemes", description = "List of security schemes.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SecuritySchemes {

  @Valid
  private List<@Valid SecurityScheme> issueSecuritySchemes;

  public SecuritySchemes issueSecuritySchemes(List<@Valid SecurityScheme> issueSecuritySchemes) {
    this.issueSecuritySchemes = issueSecuritySchemes;
    return this;
  }

  public SecuritySchemes addIssueSecuritySchemesItem(SecurityScheme issueSecuritySchemesItem) {
    if (this.issueSecuritySchemes == null) {
      this.issueSecuritySchemes = new ArrayList<>();
    }
    this.issueSecuritySchemes.add(issueSecuritySchemesItem);
    return this;
  }

  /**
   * List of security schemes.
   * @return issueSecuritySchemes
  */
  @Valid 
  @Schema(name = "issueSecuritySchemes", accessMode = Schema.AccessMode.READ_ONLY, description = "List of security schemes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueSecuritySchemes")
  public List<@Valid SecurityScheme> getIssueSecuritySchemes() {
    return issueSecuritySchemes;
  }

  public void setIssueSecuritySchemes(List<@Valid SecurityScheme> issueSecuritySchemes) {
    this.issueSecuritySchemes = issueSecuritySchemes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySchemes securitySchemes = (SecuritySchemes) o;
    return Objects.equals(this.issueSecuritySchemes, securitySchemes.issueSecuritySchemes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueSecuritySchemes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySchemes {\n");
    sb.append("    issueSecuritySchemes: ").append(toIndentedString(issueSecuritySchemes)).append("\n");
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

