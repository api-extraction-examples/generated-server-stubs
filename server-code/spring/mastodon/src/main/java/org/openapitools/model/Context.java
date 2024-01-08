package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Status;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents the tree around a given status. Used for reconstructing threads of statuses.
 */

@Schema(name = "Context", description = "Represents the tree around a given status. Used for reconstructing threads of statuses.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Context {

  @Valid
  private List<@Valid Status> ancestors = new ArrayList<>();

  @Valid
  private List<@Valid Status> descendants = new ArrayList<>();

  public Context() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Context(List<@Valid Status> ancestors, List<@Valid Status> descendants) {
    this.ancestors = ancestors;
    this.descendants = descendants;
  }

  public Context ancestors(List<@Valid Status> ancestors) {
    this.ancestors = ancestors;
    return this;
  }

  public Context addAncestorsItem(Status ancestorsItem) {
    if (this.ancestors == null) {
      this.ancestors = new ArrayList<>();
    }
    this.ancestors.add(ancestorsItem);
    return this;
  }

  /**
   * Parents in the thread.
   * @return ancestors
  */
  @NotNull @Valid 
  @Schema(name = "ancestors", description = "Parents in the thread.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ancestors")
  public List<@Valid Status> getAncestors() {
    return ancestors;
  }

  public void setAncestors(List<@Valid Status> ancestors) {
    this.ancestors = ancestors;
  }

  public Context descendants(List<@Valid Status> descendants) {
    this.descendants = descendants;
    return this;
  }

  public Context addDescendantsItem(Status descendantsItem) {
    if (this.descendants == null) {
      this.descendants = new ArrayList<>();
    }
    this.descendants.add(descendantsItem);
    return this;
  }

  /**
   * Children in the thread.
   * @return descendants
  */
  @NotNull @Valid 
  @Schema(name = "descendants", description = "Children in the thread.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descendants")
  public List<@Valid Status> getDescendants() {
    return descendants;
  }

  public void setDescendants(List<@Valid Status> descendants) {
    this.descendants = descendants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context context = (Context) o;
    return Objects.equals(this.ancestors, context.ancestors) &&
        Objects.equals(this.descendants, context.descendants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestors, descendants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    sb.append("    ancestors: ").append(toIndentedString(ancestors)).append("\n");
    sb.append("    descendants: ").append(toIndentedString(descendants)).append("\n");
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

