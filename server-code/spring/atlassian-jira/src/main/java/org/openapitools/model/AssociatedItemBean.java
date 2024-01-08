package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of an item associated with the changed record.
 */

@Schema(name = "AssociatedItemBean", description = "Details of an item associated with the changed record.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AssociatedItemBean {

  private String id;

  private String name;

  private String parentId;

  private String parentName;

  private String typeName;

  public AssociatedItemBean id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the associated record.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the associated record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssociatedItemBean name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the associated record.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the associated record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssociatedItemBean parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The ID of the associated parent record.
   * @return parentId
  */
  
  @Schema(name = "parentId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the associated parent record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentId")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public AssociatedItemBean parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

  /**
   * The name of the associated parent record.
   * @return parentName
  */
  
  @Schema(name = "parentName", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the associated parent record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentName")
  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public AssociatedItemBean typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * The type of the associated record.
   * @return typeName
  */
  
  @Schema(name = "typeName", accessMode = Schema.AccessMode.READ_ONLY, description = "The type of the associated record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("typeName")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatedItemBean associatedItemBean = (AssociatedItemBean) o;
    return Objects.equals(this.id, associatedItemBean.id) &&
        Objects.equals(this.name, associatedItemBean.name) &&
        Objects.equals(this.parentId, associatedItemBean.parentId) &&
        Objects.equals(this.parentName, associatedItemBean.parentName) &&
        Objects.equals(this.typeName, associatedItemBean.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parentId, parentName, typeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedItemBean {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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

