package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Field;
import org.openapitools.model.FullItemAllOfSections;
import org.openapitools.model.ItemUrlsInner;
import org.openapitools.model.ItemVault;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FullItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:26.239496-04:00[America/Lower_Princes]")
public class FullItem {

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    LOGIN("LOGIN"),
    
    PASSWORD("PASSWORD"),
    
    API_CREDENTIAL("API_CREDENTIAL"),
    
    SERVER("SERVER"),
    
    DATABASE("DATABASE"),
    
    CREDIT_CARD("CREDIT_CARD"),
    
    MEMBERSHIP("MEMBERSHIP"),
    
    PASSPORT("PASSPORT"),
    
    SOFTWARE_LICENSE("SOFTWARE_LICENSE"),
    
    OUTDOOR_LICENSE("OUTDOOR_LICENSE"),
    
    SECURE_NOTE("SECURE_NOTE"),
    
    WIRELESS_ROUTER("WIRELESS_ROUTER"),
    
    BANK_ACCOUNT("BANK_ACCOUNT"),
    
    DRIVER_LICENSE("DRIVER_LICENSE"),
    
    IDENTITY("IDENTITY"),
    
    REWARD_PROGRAM("REWARD_PROGRAM"),
    
    DOCUMENT("DOCUMENT"),
    
    EMAIL_ACCOUNT("EMAIL_ACCOUNT"),
    
    SOCIAL_SECURITY_NUMBER("SOCIAL_SECURITY_NUMBER"),
    
    MEDICAL_RECORD("MEDICAL_RECORD"),
    
    SSH_KEY("SSH_KEY"),
    
    CUSTOM("CUSTOM");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CategoryEnum category;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private Boolean favorite = false;

  private String id;

  private String lastEditedBy;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    ARCHIVED("ARCHIVED"),
    
    DELETED("DELETED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  @Valid
  private List<String> tags;

  private String title;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  @Valid
  private List<@Valid ItemUrlsInner> urls;

  private ItemVault vault;

  private Integer version;

  @Valid
  private List<@Valid Field> fields;

  @Valid
  private List<@Valid File> files;

  @Valid
  private List<@Valid FullItemAllOfSections> sections;

  public FullItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FullItem(CategoryEnum category, ItemVault vault) {
    this.category = category;
    this.vault = vault;
  }

  public FullItem category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @NotNull 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public FullItem createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "createdAt", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FullItem favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

  /**
   * Get favorite
   * @return favorite
  */
  
  @Schema(name = "favorite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favorite")
  public Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public FullItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Pattern(regexp = "^[\\da-z]{26}$") 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FullItem lastEditedBy(String lastEditedBy) {
    this.lastEditedBy = lastEditedBy;
    return this;
  }

  /**
   * Get lastEditedBy
   * @return lastEditedBy
  */
  
  @Schema(name = "lastEditedBy", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastEditedBy")
  public String getLastEditedBy() {
    return lastEditedBy;
  }

  public void setLastEditedBy(String lastEditedBy) {
    this.lastEditedBy = lastEditedBy;
  }

  public FullItem state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public FullItem tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FullItem addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public FullItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FullItem updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updatedAt", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public FullItem urls(List<@Valid ItemUrlsInner> urls) {
    this.urls = urls;
    return this;
  }

  public FullItem addUrlsItem(ItemUrlsInner urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }
    this.urls.add(urlsItem);
    return this;
  }

  /**
   * Get urls
   * @return urls
  */
  @Valid 
  @Schema(name = "urls", example = "[{href=https://example.com, primary=true}, {href=https://example.org}]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("urls")
  public List<@Valid ItemUrlsInner> getUrls() {
    return urls;
  }

  public void setUrls(List<@Valid ItemUrlsInner> urls) {
    this.urls = urls;
  }

  public FullItem vault(ItemVault vault) {
    this.vault = vault;
    return this;
  }

  /**
   * Get vault
   * @return vault
  */
  @NotNull @Valid 
  @Schema(name = "vault", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vault")
  public ItemVault getVault() {
    return vault;
  }

  public void setVault(ItemVault vault) {
    this.vault = vault;
  }

  public FullItem version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public FullItem fields(List<@Valid Field> fields) {
    this.fields = fields;
    return this;
  }

  public FullItem addFieldsItem(Field fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
  */
  @Valid 
  @Schema(name = "fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public List<@Valid Field> getFields() {
    return fields;
  }

  public void setFields(List<@Valid Field> fields) {
    this.fields = fields;
  }

  public FullItem files(List<@Valid File> files) {
    this.files = files;
    return this;
  }

  public FullItem addFilesItem(File filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
  */
  @Valid 
  @Schema(name = "files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("files")
  public List<@Valid File> getFiles() {
    return files;
  }

  public void setFiles(List<@Valid File> files) {
    this.files = files;
  }

  public FullItem sections(List<@Valid FullItemAllOfSections> sections) {
    this.sections = sections;
    return this;
  }

  public FullItem addSectionsItem(FullItemAllOfSections sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

  /**
   * Get sections
   * @return sections
  */
  @Valid 
  @Schema(name = "sections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sections")
  public List<@Valid FullItemAllOfSections> getSections() {
    return sections;
  }

  public void setSections(List<@Valid FullItemAllOfSections> sections) {
    this.sections = sections;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullItem fullItem = (FullItem) o;
    return Objects.equals(this.category, fullItem.category) &&
        Objects.equals(this.createdAt, fullItem.createdAt) &&
        Objects.equals(this.favorite, fullItem.favorite) &&
        Objects.equals(this.id, fullItem.id) &&
        Objects.equals(this.lastEditedBy, fullItem.lastEditedBy) &&
        Objects.equals(this.state, fullItem.state) &&
        Objects.equals(this.tags, fullItem.tags) &&
        Objects.equals(this.title, fullItem.title) &&
        Objects.equals(this.updatedAt, fullItem.updatedAt) &&
        Objects.equals(this.urls, fullItem.urls) &&
        Objects.equals(this.vault, fullItem.vault) &&
        Objects.equals(this.version, fullItem.version) &&
        Objects.equals(this.fields, fullItem.fields) &&
        Objects.equals(this.files, fullItem.files) &&
        Objects.equals(this.sections, fullItem.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, createdAt, favorite, id, lastEditedBy, state, tags, title, updatedAt, urls, vault, version, fields, files, sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullItem {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastEditedBy: ").append(toIndentedString(lastEditedBy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

