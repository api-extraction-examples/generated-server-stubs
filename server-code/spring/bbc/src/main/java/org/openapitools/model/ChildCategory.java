package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChildCategory
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class ChildCategory {

  private String categoryType;

  @Valid
  private List<@Valid ChildCategory> childCategories = new ArrayList<>();

  private Integer depth;

  private String id;

  private String pipId;

  private String title;

  private String type;

  private String urlKey;

  public ChildCategory() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChildCategory(String categoryType, List<@Valid ChildCategory> childCategories, Integer depth, String id, String pipId, String title, String type, String urlKey) {
    this.categoryType = categoryType;
    this.childCategories = childCategories;
    this.depth = depth;
    this.id = id;
    this.pipId = pipId;
    this.title = title;
    this.type = type;
    this.urlKey = urlKey;
  }

  public ChildCategory categoryType(String categoryType) {
    this.categoryType = categoryType;
    return this;
  }

  /**
   * Get categoryType
   * @return categoryType
  */
  @NotNull 
  @Schema(name = "category_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category_type")
  public String getCategoryType() {
    return categoryType;
  }

  public void setCategoryType(String categoryType) {
    this.categoryType = categoryType;
  }

  public ChildCategory childCategories(List<@Valid ChildCategory> childCategories) {
    this.childCategories = childCategories;
    return this;
  }

  public ChildCategory addChildCategoriesItem(ChildCategory childCategoriesItem) {
    if (this.childCategories == null) {
      this.childCategories = new ArrayList<>();
    }
    this.childCategories.add(childCategoriesItem);
    return this;
  }

  /**
   * Get childCategories
   * @return childCategories
  */
  @NotNull @Valid 
  @Schema(name = "child_categories", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("child_categories")
  public List<@Valid ChildCategory> getChildCategories() {
    return childCategories;
  }

  public void setChildCategories(List<@Valid ChildCategory> childCategories) {
    this.childCategories = childCategories;
  }

  public ChildCategory depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * Get depth
   * @return depth
  */
  @NotNull 
  @Schema(name = "depth", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("depth")
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public ChildCategory id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChildCategory pipId(String pipId) {
    this.pipId = pipId;
    return this;
  }

  /**
   * Get pipId
   * @return pipId
  */
  @NotNull 
  @Schema(name = "pip_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pip_id")
  public String getPipId() {
    return pipId;
  }

  public void setPipId(String pipId) {
    this.pipId = pipId;
  }

  public ChildCategory title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ChildCategory type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ChildCategory urlKey(String urlKey) {
    this.urlKey = urlKey;
    return this;
  }

  /**
   * Get urlKey
   * @return urlKey
  */
  @NotNull 
  @Schema(name = "url_key", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url_key")
  public String getUrlKey() {
    return urlKey;
  }

  public void setUrlKey(String urlKey) {
    this.urlKey = urlKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildCategory childCategory = (ChildCategory) o;
    return Objects.equals(this.categoryType, childCategory.categoryType) &&
        Objects.equals(this.childCategories, childCategory.childCategories) &&
        Objects.equals(this.depth, childCategory.depth) &&
        Objects.equals(this.id, childCategory.id) &&
        Objects.equals(this.pipId, childCategory.pipId) &&
        Objects.equals(this.title, childCategory.title) &&
        Objects.equals(this.type, childCategory.type) &&
        Objects.equals(this.urlKey, childCategory.urlKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryType, childCategories, depth, id, pipId, title, type, urlKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildCategory {\n");
    sb.append("    categoryType: ").append(toIndentedString(categoryType)).append("\n");
    sb.append("    childCategories: ").append(toIndentedString(childCategories)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pipId: ").append(toIndentedString(pipId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    urlKey: ").append(toIndentedString(urlKey)).append("\n");
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

