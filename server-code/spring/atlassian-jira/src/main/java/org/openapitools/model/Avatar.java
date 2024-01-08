package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Details of an avatar.
 */

@Schema(name = "Avatar", description = "Details of an avatar.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Avatar {

  private String fileName;

  private String id;

  private Boolean isDeletable;

  private Boolean isSelected;

  private Boolean isSystemAvatar;

  private String owner;

  @Valid
  private Map<String, URI> urls = new HashMap<>();

  public Avatar() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Avatar(String id) {
    this.id = id;
  }

  public Avatar fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The file name of the avatar icon. Returned for system avatars.
   * @return fileName
  */
  
  @Schema(name = "fileName", accessMode = Schema.AccessMode.READ_ONLY, description = "The file name of the avatar icon. Returned for system avatars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Avatar id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the avatar.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the avatar.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Avatar isDeletable(Boolean isDeletable) {
    this.isDeletable = isDeletable;
    return this;
  }

  /**
   * Whether the avatar can be deleted.
   * @return isDeletable
  */
  
  @Schema(name = "isDeletable", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the avatar can be deleted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDeletable")
  public Boolean getIsDeletable() {
    return isDeletable;
  }

  public void setIsDeletable(Boolean isDeletable) {
    this.isDeletable = isDeletable;
  }

  public Avatar isSelected(Boolean isSelected) {
    this.isSelected = isSelected;
    return this;
  }

  /**
   * Whether the avatar is used in Jira. For example, shown as a project's avatar.
   * @return isSelected
  */
  
  @Schema(name = "isSelected", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the avatar is used in Jira. For example, shown as a project's avatar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSelected")
  public Boolean getIsSelected() {
    return isSelected;
  }

  public void setIsSelected(Boolean isSelected) {
    this.isSelected = isSelected;
  }

  public Avatar isSystemAvatar(Boolean isSystemAvatar) {
    this.isSystemAvatar = isSystemAvatar;
    return this;
  }

  /**
   * Whether the avatar is a system avatar.
   * @return isSystemAvatar
  */
  
  @Schema(name = "isSystemAvatar", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the avatar is a system avatar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSystemAvatar")
  public Boolean getIsSystemAvatar() {
    return isSystemAvatar;
  }

  public void setIsSystemAvatar(Boolean isSystemAvatar) {
    this.isSystemAvatar = isSystemAvatar;
  }

  public Avatar owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.
   * @return owner
  */
  
  @Schema(name = "owner", accessMode = Schema.AccessMode.READ_ONLY, description = "The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Avatar urls(Map<String, URI> urls) {
    this.urls = urls;
    return this;
  }

  public Avatar putUrlsItem(String key, URI urlsItem) {
    if (this.urls == null) {
      this.urls = new HashMap<>();
    }
    this.urls.put(key, urlsItem);
    return this;
  }

  /**
   * The list of avatar icon URLs.
   * @return urls
  */
  @Valid 
  @Schema(name = "urls", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of avatar icon URLs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("urls")
  public Map<String, URI> getUrls() {
    return urls;
  }

  public void setUrls(Map<String, URI> urls) {
    this.urls = urls;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public Avatar putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Avatar avatar = (Avatar) o;
    return Objects.equals(this.fileName, avatar.fileName) &&
        Objects.equals(this.id, avatar.id) &&
        Objects.equals(this.isDeletable, avatar.isDeletable) &&
        Objects.equals(this.isSelected, avatar.isSelected) &&
        Objects.equals(this.isSystemAvatar, avatar.isSystemAvatar) &&
        Objects.equals(this.owner, avatar.owner) &&
        Objects.equals(this.urls, avatar.urls) &&
    Objects.equals(this.additionalProperties, avatar.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, id, isDeletable, isSelected, isSystemAvatar, owner, urls, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Avatar {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeletable: ").append(toIndentedString(isDeletable)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    isSystemAvatar: ").append(toIndentedString(isSystemAvatar)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

