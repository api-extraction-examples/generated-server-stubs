package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CustomFieldCompact;
import org.openapitools.model.EnumOption;
import org.openapitools.model.Like;
import org.openapitools.model.Preview;
import org.openapitools.model.ProjectCompact;
import org.openapitools.model.SectionCompact;
import org.openapitools.model.StoryCompact;
import org.openapitools.model.StoryResponseAllOfNewDateValue;
import org.openapitools.model.StoryResponseAllOfOldDateValue;
import org.openapitools.model.StoryResponseAllOfTarget;
import org.openapitools.model.StoryResponseDates;
import org.openapitools.model.TagCompact;
import org.openapitools.model.TaskCompact;
import org.openapitools.model.UserCompact;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StoryResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class StoryResponse {

  private String gid;

  private String resourceType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String htmlText;

  private Boolean isPinned;

  private String resourceSubtype;

  /**
   * The name of the sticker in this story. `null` if there is no sticker.
   */
  public enum StickerNameEnum {
    GREEN_CHECKMARK("green_checkmark"),
    
    PEOPLE_DANCING("people_dancing"),
    
    DANCING_UNICORN("dancing_unicorn"),
    
    HEART("heart"),
    
    PARTY_POPPER("party_popper"),
    
    PEOPLE_WAVING_FLAGS("people_waving_flags"),
    
    SPLASHING_NARWHAL("splashing_narwhal"),
    
    TROPHY("trophy"),
    
    YETI_RIDING_UNICORN("yeti_riding_unicorn"),
    
    CELEBRATING_PEOPLE("celebrating_people"),
    
    DETERMINED_CLIMBERS("determined_climbers"),
    
    PHOENIX_SPREADING_LOVE("phoenix_spreading_love");

    private String value;

    StickerNameEnum(String value) {
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
    public static StickerNameEnum fromValue(String value) {
      for (StickerNameEnum b : StickerNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StickerNameEnum stickerName;

  private String text;

  private UserCompact assignee;

  private UserCompact createdBy;

  private CustomFieldCompact customField;

  private TaskCompact dependency;

  private TaskCompact duplicateOf;

  private TaskCompact duplicatedFrom;

  private UserCompact follower;

  private Boolean hearted;

  @Valid
  private List<@Valid Like> hearts;

  private Boolean isEditable;

  private Boolean isEdited;

  private Boolean liked;

  @Valid
  private List<@Valid Like> likes;

  private String newApprovalStatus;

  private StoryResponseAllOfNewDateValue newDateValue;

  private StoryResponseDates newDates;

  private EnumOption newEnumValue;

  @Valid
  private List<@Valid EnumOption> newMultiEnumValues;

  private String newName;

  private Integer newNumberValue;

  @Valid
  private List<@Valid UserCompact> newPeopleValue;

  private String newResourceSubtype;

  private SectionCompact newSection;

  private String newTextValue;

  private Integer numHearts;

  private Integer numLikes;

  private String oldApprovalStatus;

  private StoryResponseAllOfOldDateValue oldDateValue;

  private StoryResponseDates oldDates;

  private EnumOption oldEnumValue;

  @Valid
  private List<@Valid EnumOption> oldMultiEnumValues;

  private String oldName;

  private Integer oldNumberValue;

  @Valid
  private List<@Valid UserCompact> oldPeopleValue;

  private String oldResourceSubtype;

  private SectionCompact oldSection;

  private String oldTextValue;

  @Valid
  private List<@Valid Preview> previews;

  private ProjectCompact project;

  /**
   * The component of the Asana product the user used to trigger the story.
   */
  public enum SourceEnum {
    WEB("web"),
    
    EMAIL("email"),
    
    MOBILE("mobile"),
    
    API("api"),
    
    UNKNOWN("unknown");

    private String value;

    SourceEnum(String value) {
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
    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SourceEnum source;

  private StoryCompact story;

  private TagCompact tag;

  private StoryResponseAllOfTarget target;

  private TaskCompact task;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    COMMENT("comment"),
    
    SYSTEM("system");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public StoryResponse gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public StoryResponse resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public StoryResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this resource was created.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this resource was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public StoryResponse htmlText(String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). HTML formatted text for a comment. This will not include the name of the creator.
   * @return htmlText
  */
  
  @Schema(name = "html_text", example = "<body>This is a comment.</body>", description = "[Opt In](/docs/input-output-options). HTML formatted text for a comment. This will not include the name of the creator.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_text")
  public String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(String htmlText) {
    this.htmlText = htmlText;
  }

  public StoryResponse isPinned(Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  /**
   * *Conditional*. Whether the story should be pinned on the resource.
   * @return isPinned
  */
  
  @Schema(name = "is_pinned", example = "false", description = "*Conditional*. Whether the story should be pinned on the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_pinned")
  public Boolean getIsPinned() {
    return isPinned;
  }

  public void setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
  }

  public StoryResponse resourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
  */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "comment_added", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public StoryResponse stickerName(StickerNameEnum stickerName) {
    this.stickerName = stickerName;
    return this;
  }

  /**
   * The name of the sticker in this story. `null` if there is no sticker.
   * @return stickerName
  */
  
  @Schema(name = "sticker_name", example = "dancing_unicorn", description = "The name of the sticker in this story. `null` if there is no sticker.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sticker_name")
  public StickerNameEnum getStickerName() {
    return stickerName;
  }

  public void setStickerName(StickerNameEnum stickerName) {
    this.stickerName = stickerName;
  }

  public StoryResponse text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The plain text of the comment to add. Cannot be used with html_text.
   * @return text
  */
  
  @Schema(name = "text", example = "This is a comment.", description = "The plain text of the comment to add. Cannot be used with html_text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public StoryResponse assignee(UserCompact assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   * @return assignee
  */
  @Valid 
  @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee")
  public UserCompact getAssignee() {
    return assignee;
  }

  public void setAssignee(UserCompact assignee) {
    this.assignee = assignee;
  }

  public StoryResponse createdBy(UserCompact createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  @Valid 
  @Schema(name = "created_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public UserCompact getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserCompact createdBy) {
    this.createdBy = createdBy;
  }

  public StoryResponse customField(CustomFieldCompact customField) {
    this.customField = customField;
    return this;
  }

  /**
   * Get customField
   * @return customField
  */
  @Valid 
  @Schema(name = "custom_field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_field")
  public CustomFieldCompact getCustomField() {
    return customField;
  }

  public void setCustomField(CustomFieldCompact customField) {
    this.customField = customField;
  }

  public StoryResponse dependency(TaskCompact dependency) {
    this.dependency = dependency;
    return this;
  }

  /**
   * Get dependency
   * @return dependency
  */
  @Valid 
  @Schema(name = "dependency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependency")
  public TaskCompact getDependency() {
    return dependency;
  }

  public void setDependency(TaskCompact dependency) {
    this.dependency = dependency;
  }

  public StoryResponse duplicateOf(TaskCompact duplicateOf) {
    this.duplicateOf = duplicateOf;
    return this;
  }

  /**
   * Get duplicateOf
   * @return duplicateOf
  */
  @Valid 
  @Schema(name = "duplicate_of", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duplicate_of")
  public TaskCompact getDuplicateOf() {
    return duplicateOf;
  }

  public void setDuplicateOf(TaskCompact duplicateOf) {
    this.duplicateOf = duplicateOf;
  }

  public StoryResponse duplicatedFrom(TaskCompact duplicatedFrom) {
    this.duplicatedFrom = duplicatedFrom;
    return this;
  }

  /**
   * Get duplicatedFrom
   * @return duplicatedFrom
  */
  @Valid 
  @Schema(name = "duplicated_from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duplicated_from")
  public TaskCompact getDuplicatedFrom() {
    return duplicatedFrom;
  }

  public void setDuplicatedFrom(TaskCompact duplicatedFrom) {
    this.duplicatedFrom = duplicatedFrom;
  }

  public StoryResponse follower(UserCompact follower) {
    this.follower = follower;
    return this;
  }

  /**
   * Get follower
   * @return follower
  */
  @Valid 
  @Schema(name = "follower", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("follower")
  public UserCompact getFollower() {
    return follower;
  }

  public void setFollower(UserCompact follower) {
    this.follower = follower;
  }

  public StoryResponse hearted(Boolean hearted) {
    this.hearted = hearted;
    return this;
  }

  /**
   * *Deprecated - please use likes instead* *Conditional*. True if the story is hearted by the authorized user, false if not.
   * @return hearted
  */
  
  @Schema(name = "hearted", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "*Deprecated - please use likes instead* *Conditional*. True if the story is hearted by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearted")
  public Boolean getHearted() {
    return hearted;
  }

  public void setHearted(Boolean hearted) {
    this.hearted = hearted;
  }

  public StoryResponse hearts(List<@Valid Like> hearts) {
    this.hearts = hearts;
    return this;
  }

  public StoryResponse addHeartsItem(Like heartsItem) {
    if (this.hearts == null) {
      this.hearts = new ArrayList<>();
    }
    this.hearts.add(heartsItem);
    return this;
  }

  /**
   * *Deprecated - please use likes instead*  *Conditional*. Array of likes for users who have hearted this story.
   * @return hearts
  */
  @Valid 
  @Schema(name = "hearts", accessMode = Schema.AccessMode.READ_ONLY, description = "*Deprecated - please use likes instead*  *Conditional*. Array of likes for users who have hearted this story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearts")
  public List<@Valid Like> getHearts() {
    return hearts;
  }

  public void setHearts(List<@Valid Like> hearts) {
    this.hearts = hearts;
  }

  public StoryResponse isEditable(Boolean isEditable) {
    this.isEditable = isEditable;
    return this;
  }

  /**
   * *Conditional*. Whether the text of the story can be edited after creation.
   * @return isEditable
  */
  
  @Schema(name = "is_editable", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "*Conditional*. Whether the text of the story can be edited after creation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_editable")
  public Boolean getIsEditable() {
    return isEditable;
  }

  public void setIsEditable(Boolean isEditable) {
    this.isEditable = isEditable;
  }

  public StoryResponse isEdited(Boolean isEdited) {
    this.isEdited = isEdited;
    return this;
  }

  /**
   * *Conditional*. Whether the text of the story has been edited after creation.
   * @return isEdited
  */
  
  @Schema(name = "is_edited", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "*Conditional*. Whether the text of the story has been edited after creation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_edited")
  public Boolean getIsEdited() {
    return isEdited;
  }

  public void setIsEdited(Boolean isEdited) {
    this.isEdited = isEdited;
  }

  public StoryResponse liked(Boolean liked) {
    this.liked = liked;
    return this;
  }

  /**
   * *Conditional*. True if the story is liked by the authorized user, false if not.
   * @return liked
  */
  
  @Schema(name = "liked", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "*Conditional*. True if the story is liked by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liked")
  public Boolean getLiked() {
    return liked;
  }

  public void setLiked(Boolean liked) {
    this.liked = liked;
  }

  public StoryResponse likes(List<@Valid Like> likes) {
    this.likes = likes;
    return this;
  }

  public StoryResponse addLikesItem(Like likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

  /**
   * *Conditional*. Array of likes for users who have liked this story.
   * @return likes
  */
  @Valid 
  @Schema(name = "likes", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. Array of likes for users who have liked this story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
  public List<@Valid Like> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid Like> likes) {
    this.likes = likes;
  }

  public StoryResponse newApprovalStatus(String newApprovalStatus) {
    this.newApprovalStatus = newApprovalStatus;
    return this;
  }

  /**
   * *Conditional*. The new value of approval status.
   * @return newApprovalStatus
  */
  
  @Schema(name = "new_approval_status", accessMode = Schema.AccessMode.READ_ONLY, example = "approved", description = "*Conditional*. The new value of approval status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_approval_status")
  public String getNewApprovalStatus() {
    return newApprovalStatus;
  }

  public void setNewApprovalStatus(String newApprovalStatus) {
    this.newApprovalStatus = newApprovalStatus;
  }

  public StoryResponse newDateValue(StoryResponseAllOfNewDateValue newDateValue) {
    this.newDateValue = newDateValue;
    return this;
  }

  /**
   * Get newDateValue
   * @return newDateValue
  */
  @Valid 
  @Schema(name = "new_date_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_date_value")
  public StoryResponseAllOfNewDateValue getNewDateValue() {
    return newDateValue;
  }

  public void setNewDateValue(StoryResponseAllOfNewDateValue newDateValue) {
    this.newDateValue = newDateValue;
  }

  public StoryResponse newDates(StoryResponseDates newDates) {
    this.newDates = newDates;
    return this;
  }

  /**
   * Get newDates
   * @return newDates
  */
  @Valid 
  @Schema(name = "new_dates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_dates")
  public StoryResponseDates getNewDates() {
    return newDates;
  }

  public void setNewDates(StoryResponseDates newDates) {
    this.newDates = newDates;
  }

  public StoryResponse newEnumValue(EnumOption newEnumValue) {
    this.newEnumValue = newEnumValue;
    return this;
  }

  /**
   * Get newEnumValue
   * @return newEnumValue
  */
  @Valid 
  @Schema(name = "new_enum_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_enum_value")
  public EnumOption getNewEnumValue() {
    return newEnumValue;
  }

  public void setNewEnumValue(EnumOption newEnumValue) {
    this.newEnumValue = newEnumValue;
  }

  public StoryResponse newMultiEnumValues(List<@Valid EnumOption> newMultiEnumValues) {
    this.newMultiEnumValues = newMultiEnumValues;
    return this;
  }

  public StoryResponse addNewMultiEnumValuesItem(EnumOption newMultiEnumValuesItem) {
    if (this.newMultiEnumValues == null) {
      this.newMultiEnumValues = new ArrayList<>();
    }
    this.newMultiEnumValues.add(newMultiEnumValuesItem);
    return this;
  }

  /**
   * *Conditional*. The new value of a multi-enum custom field story.
   * @return newMultiEnumValues
  */
  @Valid 
  @Schema(name = "new_multi_enum_values", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. The new value of a multi-enum custom field story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_multi_enum_values")
  public List<@Valid EnumOption> getNewMultiEnumValues() {
    return newMultiEnumValues;
  }

  public void setNewMultiEnumValues(List<@Valid EnumOption> newMultiEnumValues) {
    this.newMultiEnumValues = newMultiEnumValues;
  }

  public StoryResponse newName(String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * *Conditional*
   * @return newName
  */
  
  @Schema(name = "new_name", accessMode = Schema.AccessMode.READ_ONLY, example = "This is the New Name", description = "*Conditional*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_name")
  public String getNewName() {
    return newName;
  }

  public void setNewName(String newName) {
    this.newName = newName;
  }

  public StoryResponse newNumberValue(Integer newNumberValue) {
    this.newNumberValue = newNumberValue;
    return this;
  }

  /**
   * *Conditional*
   * @return newNumberValue
  */
  
  @Schema(name = "new_number_value", accessMode = Schema.AccessMode.READ_ONLY, example = "2", description = "*Conditional*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_number_value")
  public Integer getNewNumberValue() {
    return newNumberValue;
  }

  public void setNewNumberValue(Integer newNumberValue) {
    this.newNumberValue = newNumberValue;
  }

  public StoryResponse newPeopleValue(List<@Valid UserCompact> newPeopleValue) {
    this.newPeopleValue = newPeopleValue;
    return this;
  }

  public StoryResponse addNewPeopleValueItem(UserCompact newPeopleValueItem) {
    if (this.newPeopleValue == null) {
      this.newPeopleValue = new ArrayList<>();
    }
    this.newPeopleValue.add(newPeopleValueItem);
    return this;
  }

  /**
   * *Conditional*. The new value of a people custom field story.
   * @return newPeopleValue
  */
  @Valid 
  @Schema(name = "new_people_value", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. The new value of a people custom field story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_people_value")
  public List<@Valid UserCompact> getNewPeopleValue() {
    return newPeopleValue;
  }

  public void setNewPeopleValue(List<@Valid UserCompact> newPeopleValue) {
    this.newPeopleValue = newPeopleValue;
  }

  public StoryResponse newResourceSubtype(String newResourceSubtype) {
    this.newResourceSubtype = newResourceSubtype;
    return this;
  }

  /**
   * *Conditional*
   * @return newResourceSubtype
  */
  
  @Schema(name = "new_resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "milestone", description = "*Conditional*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_resource_subtype")
  public String getNewResourceSubtype() {
    return newResourceSubtype;
  }

  public void setNewResourceSubtype(String newResourceSubtype) {
    this.newResourceSubtype = newResourceSubtype;
  }

  public StoryResponse newSection(SectionCompact newSection) {
    this.newSection = newSection;
    return this;
  }

  /**
   * Get newSection
   * @return newSection
  */
  @Valid 
  @Schema(name = "new_section", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_section")
  public SectionCompact getNewSection() {
    return newSection;
  }

  public void setNewSection(SectionCompact newSection) {
    this.newSection = newSection;
  }

  public StoryResponse newTextValue(String newTextValue) {
    this.newTextValue = newTextValue;
    return this;
  }

  /**
   * *Conditional*
   * @return newTextValue
  */
  
  @Schema(name = "new_text_value", accessMode = Schema.AccessMode.READ_ONLY, example = "This is the New Text", description = "*Conditional*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_text_value")
  public String getNewTextValue() {
    return newTextValue;
  }

  public void setNewTextValue(String newTextValue) {
    this.newTextValue = newTextValue;
  }

  public StoryResponse numHearts(Integer numHearts) {
    this.numHearts = numHearts;
    return this;
  }

  /**
   * *Deprecated - please use likes instead*  *Conditional*. The number of users who have hearted this story.
   * @return numHearts
  */
  
  @Schema(name = "num_hearts", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "*Deprecated - please use likes instead*  *Conditional*. The number of users who have hearted this story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_hearts")
  public Integer getNumHearts() {
    return numHearts;
  }

  public void setNumHearts(Integer numHearts) {
    this.numHearts = numHearts;
  }

  public StoryResponse numLikes(Integer numLikes) {
    this.numLikes = numLikes;
    return this;
  }

  /**
   * *Conditional*. The number of users who have liked this story.
   * @return numLikes
  */
  
  @Schema(name = "num_likes", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "*Conditional*. The number of users who have liked this story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_likes")
  public Integer getNumLikes() {
    return numLikes;
  }

  public void setNumLikes(Integer numLikes) {
    this.numLikes = numLikes;
  }

  public StoryResponse oldApprovalStatus(String oldApprovalStatus) {
    this.oldApprovalStatus = oldApprovalStatus;
    return this;
  }

  /**
   * *Conditional*. The old value of approval status.
   * @return oldApprovalStatus
  */
  
  @Schema(name = "old_approval_status", accessMode = Schema.AccessMode.READ_ONLY, example = "pending", description = "*Conditional*. The old value of approval status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_approval_status")
  public String getOldApprovalStatus() {
    return oldApprovalStatus;
  }

  public void setOldApprovalStatus(String oldApprovalStatus) {
    this.oldApprovalStatus = oldApprovalStatus;
  }

  public StoryResponse oldDateValue(StoryResponseAllOfOldDateValue oldDateValue) {
    this.oldDateValue = oldDateValue;
    return this;
  }

  /**
   * Get oldDateValue
   * @return oldDateValue
  */
  @Valid 
  @Schema(name = "old_date_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_date_value")
  public StoryResponseAllOfOldDateValue getOldDateValue() {
    return oldDateValue;
  }

  public void setOldDateValue(StoryResponseAllOfOldDateValue oldDateValue) {
    this.oldDateValue = oldDateValue;
  }

  public StoryResponse oldDates(StoryResponseDates oldDates) {
    this.oldDates = oldDates;
    return this;
  }

  /**
   * Get oldDates
   * @return oldDates
  */
  @Valid 
  @Schema(name = "old_dates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_dates")
  public StoryResponseDates getOldDates() {
    return oldDates;
  }

  public void setOldDates(StoryResponseDates oldDates) {
    this.oldDates = oldDates;
  }

  public StoryResponse oldEnumValue(EnumOption oldEnumValue) {
    this.oldEnumValue = oldEnumValue;
    return this;
  }

  /**
   * Get oldEnumValue
   * @return oldEnumValue
  */
  @Valid 
  @Schema(name = "old_enum_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_enum_value")
  public EnumOption getOldEnumValue() {
    return oldEnumValue;
  }

  public void setOldEnumValue(EnumOption oldEnumValue) {
    this.oldEnumValue = oldEnumValue;
  }

  public StoryResponse oldMultiEnumValues(List<@Valid EnumOption> oldMultiEnumValues) {
    this.oldMultiEnumValues = oldMultiEnumValues;
    return this;
  }

  public StoryResponse addOldMultiEnumValuesItem(EnumOption oldMultiEnumValuesItem) {
    if (this.oldMultiEnumValues == null) {
      this.oldMultiEnumValues = new ArrayList<>();
    }
    this.oldMultiEnumValues.add(oldMultiEnumValuesItem);
    return this;
  }

  /**
   * *Conditional*. The old value of a multi-enum custom field story.
   * @return oldMultiEnumValues
  */
  @Valid 
  @Schema(name = "old_multi_enum_values", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. The old value of a multi-enum custom field story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_multi_enum_values")
  public List<@Valid EnumOption> getOldMultiEnumValues() {
    return oldMultiEnumValues;
  }

  public void setOldMultiEnumValues(List<@Valid EnumOption> oldMultiEnumValues) {
    this.oldMultiEnumValues = oldMultiEnumValues;
  }

  public StoryResponse oldName(String oldName) {
    this.oldName = oldName;
    return this;
  }

  /**
   * *Conditional*'
   * @return oldName
  */
  
  @Schema(name = "old_name", example = "This was the Old Name", description = "*Conditional*'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_name")
  public String getOldName() {
    return oldName;
  }

  public void setOldName(String oldName) {
    this.oldName = oldName;
  }

  public StoryResponse oldNumberValue(Integer oldNumberValue) {
    this.oldNumberValue = oldNumberValue;
    return this;
  }

  /**
   * *Conditional*
   * @return oldNumberValue
  */
  
  @Schema(name = "old_number_value", accessMode = Schema.AccessMode.READ_ONLY, example = "1", description = "*Conditional*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_number_value")
  public Integer getOldNumberValue() {
    return oldNumberValue;
  }

  public void setOldNumberValue(Integer oldNumberValue) {
    this.oldNumberValue = oldNumberValue;
  }

  public StoryResponse oldPeopleValue(List<@Valid UserCompact> oldPeopleValue) {
    this.oldPeopleValue = oldPeopleValue;
    return this;
  }

  public StoryResponse addOldPeopleValueItem(UserCompact oldPeopleValueItem) {
    if (this.oldPeopleValue == null) {
      this.oldPeopleValue = new ArrayList<>();
    }
    this.oldPeopleValue.add(oldPeopleValueItem);
    return this;
  }

  /**
   * *Conditional*. The old value of a people custom field story.
   * @return oldPeopleValue
  */
  @Valid 
  @Schema(name = "old_people_value", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. The old value of a people custom field story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_people_value")
  public List<@Valid UserCompact> getOldPeopleValue() {
    return oldPeopleValue;
  }

  public void setOldPeopleValue(List<@Valid UserCompact> oldPeopleValue) {
    this.oldPeopleValue = oldPeopleValue;
  }

  public StoryResponse oldResourceSubtype(String oldResourceSubtype) {
    this.oldResourceSubtype = oldResourceSubtype;
    return this;
  }

  /**
   * *Conditional*
   * @return oldResourceSubtype
  */
  
  @Schema(name = "old_resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "default_task", description = "*Conditional*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_resource_subtype")
  public String getOldResourceSubtype() {
    return oldResourceSubtype;
  }

  public void setOldResourceSubtype(String oldResourceSubtype) {
    this.oldResourceSubtype = oldResourceSubtype;
  }

  public StoryResponse oldSection(SectionCompact oldSection) {
    this.oldSection = oldSection;
    return this;
  }

  /**
   * Get oldSection
   * @return oldSection
  */
  @Valid 
  @Schema(name = "old_section", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_section")
  public SectionCompact getOldSection() {
    return oldSection;
  }

  public void setOldSection(SectionCompact oldSection) {
    this.oldSection = oldSection;
  }

  public StoryResponse oldTextValue(String oldTextValue) {
    this.oldTextValue = oldTextValue;
    return this;
  }

  /**
   * *Conditional*
   * @return oldTextValue
  */
  
  @Schema(name = "old_text_value", accessMode = Schema.AccessMode.READ_ONLY, example = "This was the Old Text", description = "*Conditional*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_text_value")
  public String getOldTextValue() {
    return oldTextValue;
  }

  public void setOldTextValue(String oldTextValue) {
    this.oldTextValue = oldTextValue;
  }

  public StoryResponse previews(List<@Valid Preview> previews) {
    this.previews = previews;
    return this;
  }

  public StoryResponse addPreviewsItem(Preview previewsItem) {
    if (this.previews == null) {
      this.previews = new ArrayList<>();
    }
    this.previews.add(previewsItem);
    return this;
  }

  /**
   * *Conditional*. A collection of previews to be displayed in the story.  *Note: This property only exists for comment stories.*
   * @return previews
  */
  @Valid 
  @Schema(name = "previews", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. A collection of previews to be displayed in the story.  *Note: This property only exists for comment stories.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previews")
  public List<@Valid Preview> getPreviews() {
    return previews;
  }

  public void setPreviews(List<@Valid Preview> previews) {
    this.previews = previews;
  }

  public StoryResponse project(ProjectCompact project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public ProjectCompact getProject() {
    return project;
  }

  public void setProject(ProjectCompact project) {
    this.project = project;
  }

  public StoryResponse source(SourceEnum source) {
    this.source = source;
    return this;
  }

  /**
   * The component of the Asana product the user used to trigger the story.
   * @return source
  */
  
  @Schema(name = "source", accessMode = Schema.AccessMode.READ_ONLY, example = "web", description = "The component of the Asana product the user used to trigger the story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public StoryResponse story(StoryCompact story) {
    this.story = story;
    return this;
  }

  /**
   * Get story
   * @return story
  */
  @Valid 
  @Schema(name = "story", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("story")
  public StoryCompact getStory() {
    return story;
  }

  public void setStory(StoryCompact story) {
    this.story = story;
  }

  public StoryResponse tag(TagCompact tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
  */
  @Valid 
  @Schema(name = "tag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag")
  public TagCompact getTag() {
    return tag;
  }

  public void setTag(TagCompact tag) {
    this.tag = tag;
  }

  public StoryResponse target(StoryResponseAllOfTarget target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  */
  @Valid 
  @Schema(name = "target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target")
  public StoryResponseAllOfTarget getTarget() {
    return target;
  }

  public void setTarget(StoryResponseAllOfTarget target) {
    this.target = target;
  }

  public StoryResponse task(TaskCompact task) {
    this.task = task;
    return this;
  }

  /**
   * Get task
   * @return task
  */
  @Valid 
  @Schema(name = "task", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task")
  public TaskCompact getTask() {
    return task;
  }

  public void setTask(TaskCompact task) {
    this.task = task;
  }

  public StoryResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, example = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    StoryResponse storyResponse = (StoryResponse) o;
    return Objects.equals(this.gid, storyResponse.gid) &&
        Objects.equals(this.resourceType, storyResponse.resourceType) &&
        Objects.equals(this.createdAt, storyResponse.createdAt) &&
        Objects.equals(this.htmlText, storyResponse.htmlText) &&
        Objects.equals(this.isPinned, storyResponse.isPinned) &&
        Objects.equals(this.resourceSubtype, storyResponse.resourceSubtype) &&
        Objects.equals(this.stickerName, storyResponse.stickerName) &&
        Objects.equals(this.text, storyResponse.text) &&
        Objects.equals(this.assignee, storyResponse.assignee) &&
        Objects.equals(this.createdBy, storyResponse.createdBy) &&
        Objects.equals(this.customField, storyResponse.customField) &&
        Objects.equals(this.dependency, storyResponse.dependency) &&
        Objects.equals(this.duplicateOf, storyResponse.duplicateOf) &&
        Objects.equals(this.duplicatedFrom, storyResponse.duplicatedFrom) &&
        Objects.equals(this.follower, storyResponse.follower) &&
        Objects.equals(this.hearted, storyResponse.hearted) &&
        Objects.equals(this.hearts, storyResponse.hearts) &&
        Objects.equals(this.isEditable, storyResponse.isEditable) &&
        Objects.equals(this.isEdited, storyResponse.isEdited) &&
        Objects.equals(this.liked, storyResponse.liked) &&
        Objects.equals(this.likes, storyResponse.likes) &&
        Objects.equals(this.newApprovalStatus, storyResponse.newApprovalStatus) &&
        Objects.equals(this.newDateValue, storyResponse.newDateValue) &&
        Objects.equals(this.newDates, storyResponse.newDates) &&
        Objects.equals(this.newEnumValue, storyResponse.newEnumValue) &&
        Objects.equals(this.newMultiEnumValues, storyResponse.newMultiEnumValues) &&
        Objects.equals(this.newName, storyResponse.newName) &&
        Objects.equals(this.newNumberValue, storyResponse.newNumberValue) &&
        Objects.equals(this.newPeopleValue, storyResponse.newPeopleValue) &&
        Objects.equals(this.newResourceSubtype, storyResponse.newResourceSubtype) &&
        Objects.equals(this.newSection, storyResponse.newSection) &&
        Objects.equals(this.newTextValue, storyResponse.newTextValue) &&
        Objects.equals(this.numHearts, storyResponse.numHearts) &&
        Objects.equals(this.numLikes, storyResponse.numLikes) &&
        Objects.equals(this.oldApprovalStatus, storyResponse.oldApprovalStatus) &&
        Objects.equals(this.oldDateValue, storyResponse.oldDateValue) &&
        Objects.equals(this.oldDates, storyResponse.oldDates) &&
        Objects.equals(this.oldEnumValue, storyResponse.oldEnumValue) &&
        Objects.equals(this.oldMultiEnumValues, storyResponse.oldMultiEnumValues) &&
        Objects.equals(this.oldName, storyResponse.oldName) &&
        Objects.equals(this.oldNumberValue, storyResponse.oldNumberValue) &&
        Objects.equals(this.oldPeopleValue, storyResponse.oldPeopleValue) &&
        Objects.equals(this.oldResourceSubtype, storyResponse.oldResourceSubtype) &&
        Objects.equals(this.oldSection, storyResponse.oldSection) &&
        Objects.equals(this.oldTextValue, storyResponse.oldTextValue) &&
        Objects.equals(this.previews, storyResponse.previews) &&
        Objects.equals(this.project, storyResponse.project) &&
        Objects.equals(this.source, storyResponse.source) &&
        Objects.equals(this.story, storyResponse.story) &&
        Objects.equals(this.tag, storyResponse.tag) &&
        Objects.equals(this.target, storyResponse.target) &&
        Objects.equals(this.task, storyResponse.task) &&
        Objects.equals(this.type, storyResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, createdAt, htmlText, isPinned, resourceSubtype, stickerName, text, assignee, createdBy, customField, dependency, duplicateOf, duplicatedFrom, follower, hearted, hearts, isEditable, isEdited, liked, likes, newApprovalStatus, newDateValue, newDates, newEnumValue, newMultiEnumValues, newName, newNumberValue, newPeopleValue, newResourceSubtype, newSection, newTextValue, numHearts, numLikes, oldApprovalStatus, oldDateValue, oldDates, oldEnumValue, oldMultiEnumValues, oldName, oldNumberValue, oldPeopleValue, oldResourceSubtype, oldSection, oldTextValue, previews, project, source, story, tag, target, task, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    stickerName: ").append(toIndentedString(stickerName)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    dependency: ").append(toIndentedString(dependency)).append("\n");
    sb.append("    duplicateOf: ").append(toIndentedString(duplicateOf)).append("\n");
    sb.append("    duplicatedFrom: ").append(toIndentedString(duplicatedFrom)).append("\n");
    sb.append("    follower: ").append(toIndentedString(follower)).append("\n");
    sb.append("    hearted: ").append(toIndentedString(hearted)).append("\n");
    sb.append("    hearts: ").append(toIndentedString(hearts)).append("\n");
    sb.append("    isEditable: ").append(toIndentedString(isEditable)).append("\n");
    sb.append("    isEdited: ").append(toIndentedString(isEdited)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    newApprovalStatus: ").append(toIndentedString(newApprovalStatus)).append("\n");
    sb.append("    newDateValue: ").append(toIndentedString(newDateValue)).append("\n");
    sb.append("    newDates: ").append(toIndentedString(newDates)).append("\n");
    sb.append("    newEnumValue: ").append(toIndentedString(newEnumValue)).append("\n");
    sb.append("    newMultiEnumValues: ").append(toIndentedString(newMultiEnumValues)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    newNumberValue: ").append(toIndentedString(newNumberValue)).append("\n");
    sb.append("    newPeopleValue: ").append(toIndentedString(newPeopleValue)).append("\n");
    sb.append("    newResourceSubtype: ").append(toIndentedString(newResourceSubtype)).append("\n");
    sb.append("    newSection: ").append(toIndentedString(newSection)).append("\n");
    sb.append("    newTextValue: ").append(toIndentedString(newTextValue)).append("\n");
    sb.append("    numHearts: ").append(toIndentedString(numHearts)).append("\n");
    sb.append("    numLikes: ").append(toIndentedString(numLikes)).append("\n");
    sb.append("    oldApprovalStatus: ").append(toIndentedString(oldApprovalStatus)).append("\n");
    sb.append("    oldDateValue: ").append(toIndentedString(oldDateValue)).append("\n");
    sb.append("    oldDates: ").append(toIndentedString(oldDates)).append("\n");
    sb.append("    oldEnumValue: ").append(toIndentedString(oldEnumValue)).append("\n");
    sb.append("    oldMultiEnumValues: ").append(toIndentedString(oldMultiEnumValues)).append("\n");
    sb.append("    oldName: ").append(toIndentedString(oldName)).append("\n");
    sb.append("    oldNumberValue: ").append(toIndentedString(oldNumberValue)).append("\n");
    sb.append("    oldPeopleValue: ").append(toIndentedString(oldPeopleValue)).append("\n");
    sb.append("    oldResourceSubtype: ").append(toIndentedString(oldResourceSubtype)).append("\n");
    sb.append("    oldSection: ").append(toIndentedString(oldSection)).append("\n");
    sb.append("    oldTextValue: ").append(toIndentedString(oldTextValue)).append("\n");
    sb.append("    previews: ").append(toIndentedString(previews)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    story: ").append(toIndentedString(story)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
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

