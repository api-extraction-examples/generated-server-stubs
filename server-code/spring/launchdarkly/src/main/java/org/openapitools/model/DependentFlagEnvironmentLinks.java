package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Link;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DependentFlagEnvironmentLinks
 */

@JsonTypeName("DependentFlagEnvironment__links")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class DependentFlagEnvironmentLinks {

  private Link flagLink;

  private Link self;

  public DependentFlagEnvironmentLinks flagLink(Link flagLink) {
    this.flagLink = flagLink;
    return this;
  }

  /**
   * Get flagLink
   * @return flagLink
  */
  @Valid 
  @Schema(name = "flagLink", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagLink")
  public Link getFlagLink() {
    return flagLink;
  }

  public void setFlagLink(Link flagLink) {
    this.flagLink = flagLink;
  }

  public DependentFlagEnvironmentLinks self(Link self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  @Valid 
  @Schema(name = "self", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public Link getSelf() {
    return self;
  }

  public void setSelf(Link self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependentFlagEnvironmentLinks dependentFlagEnvironmentLinks = (DependentFlagEnvironmentLinks) o;
    return Objects.equals(this.flagLink, dependentFlagEnvironmentLinks.flagLink) &&
        Objects.equals(this.self, dependentFlagEnvironmentLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagLink, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependentFlagEnvironmentLinks {\n");
    sb.append("    flagLink: ").append(toIndentedString(flagLink)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

