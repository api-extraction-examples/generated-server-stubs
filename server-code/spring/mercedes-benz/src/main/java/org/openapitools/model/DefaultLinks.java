package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Link;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * default links
 */

@Schema(name = "DefaultLinks", description = "default links")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class DefaultLinks {

  private Link next;

  private Link previous;

  private Link self;

  public DefaultLinks next(Link next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  */
  @Valid 
  @Schema(name = "next", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next")
  public Link getNext() {
    return next;
  }

  public void setNext(Link next) {
    this.next = next;
  }

  public DefaultLinks previous(Link previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
  */
  @Valid 
  @Schema(name = "previous", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previous")
  public Link getPrevious() {
    return previous;
  }

  public void setPrevious(Link previous) {
    this.previous = previous;
  }

  public DefaultLinks self(Link self) {
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
    DefaultLinks defaultLinks = (DefaultLinks) o;
    return Objects.equals(this.next, defaultLinks.next) &&
        Objects.equals(this.previous, defaultLinks.previous) &&
        Objects.equals(this.self, defaultLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, previous, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultLinks {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

