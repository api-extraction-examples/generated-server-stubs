package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseItemPersonImageBlurHashes;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This is used by the api to get information about a Person within a BaseItem.
 */

@Schema(name = "BaseItemPerson", description = "This is used by the api to get information about a Person within a BaseItem.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class BaseItemPerson {

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private JsonNullable<BaseItemPersonImageBlurHashes> imageBlurHashes = JsonNullable.<BaseItemPersonImageBlurHashes>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> primaryImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> role = JsonNullable.<String>undefined();

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public BaseItemPerson id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Gets or sets the identifier.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public BaseItemPerson imageBlurHashes(BaseItemPersonImageBlurHashes imageBlurHashes) {
    this.imageBlurHashes = JsonNullable.of(imageBlurHashes);
    return this;
  }

  /**
   * Get imageBlurHashes
   * @return imageBlurHashes
  */
  @Valid 
  @Schema(name = "ImageBlurHashes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageBlurHashes")
  public JsonNullable<BaseItemPersonImageBlurHashes> getImageBlurHashes() {
    return imageBlurHashes;
  }

  public void setImageBlurHashes(JsonNullable<BaseItemPersonImageBlurHashes> imageBlurHashes) {
    this.imageBlurHashes = imageBlurHashes;
  }

  public BaseItemPerson name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public BaseItemPerson primaryImageTag(String primaryImageTag) {
    this.primaryImageTag = JsonNullable.of(primaryImageTag);
    return this;
  }

  /**
   * Gets or sets the primary image tag.
   * @return primaryImageTag
  */
  
  @Schema(name = "PrimaryImageTag", description = "Gets or sets the primary image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrimaryImageTag")
  public JsonNullable<String> getPrimaryImageTag() {
    return primaryImageTag;
  }

  public void setPrimaryImageTag(JsonNullable<String> primaryImageTag) {
    this.primaryImageTag = primaryImageTag;
  }

  public BaseItemPerson role(String role) {
    this.role = JsonNullable.of(role);
    return this;
  }

  /**
   * Gets or sets the role.
   * @return role
  */
  
  @Schema(name = "Role", description = "Gets or sets the role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Role")
  public JsonNullable<String> getRole() {
    return role;
  }

  public void setRole(JsonNullable<String> role) {
    this.role = role;
  }

  public BaseItemPerson type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Gets or sets the type.
   * @return type
  */
  
  @Schema(name = "Type", description = "Gets or sets the type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseItemPerson baseItemPerson = (BaseItemPerson) o;
    return equalsNullable(this.id, baseItemPerson.id) &&
        equalsNullable(this.imageBlurHashes, baseItemPerson.imageBlurHashes) &&
        equalsNullable(this.name, baseItemPerson.name) &&
        equalsNullable(this.primaryImageTag, baseItemPerson.primaryImageTag) &&
        equalsNullable(this.role, baseItemPerson.role) &&
        equalsNullable(this.type, baseItemPerson.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(imageBlurHashes), hashCodeNullable(name), hashCodeNullable(primaryImageTag), hashCodeNullable(role), hashCodeNullable(type));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseItemPerson {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageBlurHashes: ").append(toIndentedString(imageBlurHashes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryImageTag: ").append(toIndentedString(primaryImageTag)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

