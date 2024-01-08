package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppCategoryRelationshipsParent;
import org.openapitools.model.AppCategoryRelationshipsSubcategories;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppCategoryRelationships
 */

@JsonTypeName("AppCategory_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppCategoryRelationships {

  private AppCategoryRelationshipsParent parent;

  private AppCategoryRelationshipsSubcategories subcategories;

  public AppCategoryRelationships parent(AppCategoryRelationshipsParent parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public AppCategoryRelationshipsParent getParent() {
    return parent;
  }

  public void setParent(AppCategoryRelationshipsParent parent) {
    this.parent = parent;
  }

  public AppCategoryRelationships subcategories(AppCategoryRelationshipsSubcategories subcategories) {
    this.subcategories = subcategories;
    return this;
  }

  /**
   * Get subcategories
   * @return subcategories
  */
  @Valid 
  @Schema(name = "subcategories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subcategories")
  public AppCategoryRelationshipsSubcategories getSubcategories() {
    return subcategories;
  }

  public void setSubcategories(AppCategoryRelationshipsSubcategories subcategories) {
    this.subcategories = subcategories;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppCategoryRelationships appCategoryRelationships = (AppCategoryRelationships) o;
    return Objects.equals(this.parent, appCategoryRelationships.parent) &&
        Objects.equals(this.subcategories, appCategoryRelationships.subcategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, subcategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCategoryRelationships {\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
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

