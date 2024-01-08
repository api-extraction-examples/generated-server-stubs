package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppInfoUpdateRequestDataRelationshipsPrimaryCategory;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppInfoUpdateRequestDataRelationships
 */

@JsonTypeName("AppInfoUpdateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppInfoUpdateRequestDataRelationships {

  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory primaryCategory;

  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryOne;

  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryTwo;

  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondaryCategory;

  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryOne;

  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryTwo;

  public AppInfoUpdateRequestDataRelationships primaryCategory(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primaryCategory) {
    this.primaryCategory = primaryCategory;
    return this;
  }

  /**
   * Get primaryCategory
   * @return primaryCategory
  */
  @Valid 
  @Schema(name = "primaryCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primaryCategory")
  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getPrimaryCategory() {
    return primaryCategory;
  }

  public void setPrimaryCategory(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primaryCategory) {
    this.primaryCategory = primaryCategory;
  }

  public AppInfoUpdateRequestDataRelationships primarySubcategoryOne(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryOne) {
    this.primarySubcategoryOne = primarySubcategoryOne;
    return this;
  }

  /**
   * Get primarySubcategoryOne
   * @return primarySubcategoryOne
  */
  @Valid 
  @Schema(name = "primarySubcategoryOne", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primarySubcategoryOne")
  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getPrimarySubcategoryOne() {
    return primarySubcategoryOne;
  }

  public void setPrimarySubcategoryOne(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryOne) {
    this.primarySubcategoryOne = primarySubcategoryOne;
  }

  public AppInfoUpdateRequestDataRelationships primarySubcategoryTwo(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryTwo) {
    this.primarySubcategoryTwo = primarySubcategoryTwo;
    return this;
  }

  /**
   * Get primarySubcategoryTwo
   * @return primarySubcategoryTwo
  */
  @Valid 
  @Schema(name = "primarySubcategoryTwo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primarySubcategoryTwo")
  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getPrimarySubcategoryTwo() {
    return primarySubcategoryTwo;
  }

  public void setPrimarySubcategoryTwo(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryTwo) {
    this.primarySubcategoryTwo = primarySubcategoryTwo;
  }

  public AppInfoUpdateRequestDataRelationships secondaryCategory(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondaryCategory) {
    this.secondaryCategory = secondaryCategory;
    return this;
  }

  /**
   * Get secondaryCategory
   * @return secondaryCategory
  */
  @Valid 
  @Schema(name = "secondaryCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondaryCategory")
  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getSecondaryCategory() {
    return secondaryCategory;
  }

  public void setSecondaryCategory(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondaryCategory) {
    this.secondaryCategory = secondaryCategory;
  }

  public AppInfoUpdateRequestDataRelationships secondarySubcategoryOne(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryOne) {
    this.secondarySubcategoryOne = secondarySubcategoryOne;
    return this;
  }

  /**
   * Get secondarySubcategoryOne
   * @return secondarySubcategoryOne
  */
  @Valid 
  @Schema(name = "secondarySubcategoryOne", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondarySubcategoryOne")
  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getSecondarySubcategoryOne() {
    return secondarySubcategoryOne;
  }

  public void setSecondarySubcategoryOne(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryOne) {
    this.secondarySubcategoryOne = secondarySubcategoryOne;
  }

  public AppInfoUpdateRequestDataRelationships secondarySubcategoryTwo(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryTwo) {
    this.secondarySubcategoryTwo = secondarySubcategoryTwo;
    return this;
  }

  /**
   * Get secondarySubcategoryTwo
   * @return secondarySubcategoryTwo
  */
  @Valid 
  @Schema(name = "secondarySubcategoryTwo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondarySubcategoryTwo")
  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getSecondarySubcategoryTwo() {
    return secondarySubcategoryTwo;
  }

  public void setSecondarySubcategoryTwo(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryTwo) {
    this.secondarySubcategoryTwo = secondarySubcategoryTwo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppInfoUpdateRequestDataRelationships appInfoUpdateRequestDataRelationships = (AppInfoUpdateRequestDataRelationships) o;
    return Objects.equals(this.primaryCategory, appInfoUpdateRequestDataRelationships.primaryCategory) &&
        Objects.equals(this.primarySubcategoryOne, appInfoUpdateRequestDataRelationships.primarySubcategoryOne) &&
        Objects.equals(this.primarySubcategoryTwo, appInfoUpdateRequestDataRelationships.primarySubcategoryTwo) &&
        Objects.equals(this.secondaryCategory, appInfoUpdateRequestDataRelationships.secondaryCategory) &&
        Objects.equals(this.secondarySubcategoryOne, appInfoUpdateRequestDataRelationships.secondarySubcategoryOne) &&
        Objects.equals(this.secondarySubcategoryTwo, appInfoUpdateRequestDataRelationships.secondarySubcategoryTwo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryCategory, primarySubcategoryOne, primarySubcategoryTwo, secondaryCategory, secondarySubcategoryOne, secondarySubcategoryTwo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoUpdateRequestDataRelationships {\n");
    sb.append("    primaryCategory: ").append(toIndentedString(primaryCategory)).append("\n");
    sb.append("    primarySubcategoryOne: ").append(toIndentedString(primarySubcategoryOne)).append("\n");
    sb.append("    primarySubcategoryTwo: ").append(toIndentedString(primarySubcategoryTwo)).append("\n");
    sb.append("    secondaryCategory: ").append(toIndentedString(secondaryCategory)).append("\n");
    sb.append("    secondarySubcategoryOne: ").append(toIndentedString(secondarySubcategoryOne)).append("\n");
    sb.append("    secondarySubcategoryTwo: ").append(toIndentedString(secondarySubcategoryTwo)).append("\n");
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

