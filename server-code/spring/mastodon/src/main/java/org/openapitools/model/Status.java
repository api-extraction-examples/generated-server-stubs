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
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.Attachment;
import org.openapitools.model.Card;
import org.openapitools.model.Emoji;
import org.openapitools.model.Mention;
import org.openapitools.model.Poll;
import org.openapitools.model.Tag;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a status posted by an account.
 */

@Schema(name = "Status", description = "Represents a status posted by an account.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Status implements ApiV1StatusesPost200Response {

  private Account account;

  private Application application;

  private Boolean bookmarked;

  private Card card;

  private String content;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @Valid
  private List<@Valid Emoji> emojis;

  private Boolean favourited;

  private Integer favouritesCount;

  private String id;

  private String inReplyToAccountId;

  private String inReplyToId;

  private String language;

  @Valid
  private List<@Valid Attachment> mediaAttachments;

  @Valid
  private List<@Valid Mention> mentions;

  private Boolean muted;

  private Boolean pinned;

  private Poll poll;

  private Status reblog;

  private Boolean reblogged;

  private Integer reblogsCount;

  private Integer repliesCount;

  private Boolean sensitive;

  private String spoilerText;

  @Valid
  private List<@Valid Tag> tags;

  private String text;

  private String uri;

  private String url;

  /**
   * Visibility of this status.
   */
  public enum VisibilityEnum {
    PUBLIC("public"),
    
    UNLISTED("unlisted"),
    
    PRIVATE("private"),
    
    DIRECT("direct");

    private String value;

    VisibilityEnum(String value) {
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
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VisibilityEnum visibility;

  public Status account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Status application(Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
  */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Status bookmarked(Boolean bookmarked) {
    this.bookmarked = bookmarked;
    return this;
  }

  /**
   * Have you bookmarked this status?
   * @return bookmarked
  */
  
  @Schema(name = "bookmarked", description = "Have you bookmarked this status?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookmarked")
  public Boolean getBookmarked() {
    return bookmarked;
  }

  public void setBookmarked(Boolean bookmarked) {
    this.bookmarked = bookmarked;
  }

  public Status card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  */
  @Valid 
  @Schema(name = "card", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("card")
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public Status content(String content) {
    this.content = content;
    return this;
  }

  /**
   * HTML-encoded status content.
   * @return content
  */
  
  @Schema(name = "content", description = "HTML-encoded status content.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Status createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when this status was created.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", description = "The date when this status was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Status emojis(List<@Valid Emoji> emojis) {
    this.emojis = emojis;
    return this;
  }

  public Status addEmojisItem(Emoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

  /**
   * Custom emoji to be used when rendering status content.
   * @return emojis
  */
  @Valid 
  @Schema(name = "emojis", description = "Custom emoji to be used when rendering status content.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emojis")
  public List<@Valid Emoji> getEmojis() {
    return emojis;
  }

  public void setEmojis(List<@Valid Emoji> emojis) {
    this.emojis = emojis;
  }

  public Status favourited(Boolean favourited) {
    this.favourited = favourited;
    return this;
  }

  /**
   * Have you favourited this status?
   * @return favourited
  */
  
  @Schema(name = "favourited", description = "Have you favourited this status?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favourited")
  public Boolean getFavourited() {
    return favourited;
  }

  public void setFavourited(Boolean favourited) {
    this.favourited = favourited;
  }

  public Status favouritesCount(Integer favouritesCount) {
    this.favouritesCount = favouritesCount;
    return this;
  }

  /**
   * How many favourites this status has received.
   * @return favouritesCount
  */
  
  @Schema(name = "favourites_count", description = "How many favourites this status has received.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favourites_count")
  public Integer getFavouritesCount() {
    return favouritesCount;
  }

  public void setFavouritesCount(Integer favouritesCount) {
    this.favouritesCount = favouritesCount;
  }

  public Status id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the status in the database. Cast from an integer but not guaranteed to be a number.
   * @return id
  */
  
  @Schema(name = "id", description = "ID of the status in the database. Cast from an integer but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Status inReplyToAccountId(String inReplyToAccountId) {
    this.inReplyToAccountId = inReplyToAccountId;
    return this;
  }

  /**
   * ID of the account being replied to.
   * @return inReplyToAccountId
  */
  
  @Schema(name = "in_reply_to_account_id", description = "ID of the account being replied to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("in_reply_to_account_id")
  public String getInReplyToAccountId() {
    return inReplyToAccountId;
  }

  public void setInReplyToAccountId(String inReplyToAccountId) {
    this.inReplyToAccountId = inReplyToAccountId;
  }

  public Status inReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
    return this;
  }

  /**
   * ID of the status being replied. Cast from an integer but not guaranteed to be a number.
   * @return inReplyToId
  */
  
  @Schema(name = "in_reply_to_id", description = "ID of the status being replied. Cast from an integer but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("in_reply_to_id")
  public String getInReplyToId() {
    return inReplyToId;
  }

  public void setInReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
  }

  public Status language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Primary language of this status. ISO 639 Part 1 two-letter language code.
   * @return language
  */
  
  @Schema(name = "language", description = "Primary language of this status. ISO 639 Part 1 two-letter language code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Status mediaAttachments(List<@Valid Attachment> mediaAttachments) {
    this.mediaAttachments = mediaAttachments;
    return this;
  }

  public Status addMediaAttachmentsItem(Attachment mediaAttachmentsItem) {
    if (this.mediaAttachments == null) {
      this.mediaAttachments = new ArrayList<>();
    }
    this.mediaAttachments.add(mediaAttachmentsItem);
    return this;
  }

  /**
   * Media that is attached to this status.
   * @return mediaAttachments
  */
  @Valid 
  @Schema(name = "media_attachments", description = "Media that is attached to this status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_attachments")
  public List<@Valid Attachment> getMediaAttachments() {
    return mediaAttachments;
  }

  public void setMediaAttachments(List<@Valid Attachment> mediaAttachments) {
    this.mediaAttachments = mediaAttachments;
  }

  public Status mentions(List<@Valid Mention> mentions) {
    this.mentions = mentions;
    return this;
  }

  public Status addMentionsItem(Mention mentionsItem) {
    if (this.mentions == null) {
      this.mentions = new ArrayList<>();
    }
    this.mentions.add(mentionsItem);
    return this;
  }

  /**
   * Mentions of users within the status content.
   * @return mentions
  */
  @Valid 
  @Schema(name = "mentions", description = "Mentions of users within the status content.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mentions")
  public List<@Valid Mention> getMentions() {
    return mentions;
  }

  public void setMentions(List<@Valid Mention> mentions) {
    this.mentions = mentions;
  }

  public Status muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

  /**
   * Have you muted notifications for this status's conversation?
   * @return muted
  */
  
  @Schema(name = "muted", description = "Have you muted notifications for this status's conversation?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("muted")
  public Boolean getMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  public Status pinned(Boolean pinned) {
    this.pinned = pinned;
    return this;
  }

  /**
   * Have you pinned this status? Only appears if the status is pinnable.
   * @return pinned
  */
  
  @Schema(name = "pinned", description = "Have you pinned this status? Only appears if the status is pinnable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pinned")
  public Boolean getPinned() {
    return pinned;
  }

  public void setPinned(Boolean pinned) {
    this.pinned = pinned;
  }

  public Status poll(Poll poll) {
    this.poll = poll;
    return this;
  }

  /**
   * Get poll
   * @return poll
  */
  @Valid 
  @Schema(name = "poll", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poll")
  public Poll getPoll() {
    return poll;
  }

  public void setPoll(Poll poll) {
    this.poll = poll;
  }

  public Status reblog(Status reblog) {
    this.reblog = reblog;
    return this;
  }

  /**
   * Get reblog
   * @return reblog
  */
  @Valid 
  @Schema(name = "reblog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reblog")
  public Status getReblog() {
    return reblog;
  }

  public void setReblog(Status reblog) {
    this.reblog = reblog;
  }

  public Status reblogged(Boolean reblogged) {
    this.reblogged = reblogged;
    return this;
  }

  /**
   * Have you boosted this status?
   * @return reblogged
  */
  
  @Schema(name = "reblogged", description = "Have you boosted this status?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reblogged")
  public Boolean getReblogged() {
    return reblogged;
  }

  public void setReblogged(Boolean reblogged) {
    this.reblogged = reblogged;
  }

  public Status reblogsCount(Integer reblogsCount) {
    this.reblogsCount = reblogsCount;
    return this;
  }

  /**
   * How many boosts this status has received.
   * @return reblogsCount
  */
  
  @Schema(name = "reblogs_count", description = "How many boosts this status has received.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reblogs_count")
  public Integer getReblogsCount() {
    return reblogsCount;
  }

  public void setReblogsCount(Integer reblogsCount) {
    this.reblogsCount = reblogsCount;
  }

  public Status repliesCount(Integer repliesCount) {
    this.repliesCount = repliesCount;
    return this;
  }

  /**
   * How many replies this status has received.
   * @return repliesCount
  */
  
  @Schema(name = "replies_count", description = "How many replies this status has received.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replies_count")
  public Integer getRepliesCount() {
    return repliesCount;
  }

  public void setRepliesCount(Integer repliesCount) {
    this.repliesCount = repliesCount;
  }

  public Status sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * Is this status marked as sensitive content?
   * @return sensitive
  */
  
  @Schema(name = "sensitive", description = "Is this status marked as sensitive content?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sensitive")
  public Boolean getSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public Status spoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
    return this;
  }

  /**
   * Subject or summary line, below which status content is collapsed until expanded.
   * @return spoilerText
  */
  
  @Schema(name = "spoiler_text", description = "Subject or summary line, below which status content is collapsed until expanded.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spoiler_text")
  public String getSpoilerText() {
    return spoilerText;
  }

  public void setSpoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
  }

  public Status tags(List<@Valid Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Status addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Hashtags used within the status content.
   * @return tags
  */
  @Valid 
  @Schema(name = "tags", description = "Hashtags used within the status content.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<@Valid Tag> getTags() {
    return tags;
  }

  public void setTags(List<@Valid Tag> tags) {
    this.tags = tags;
  }

  public Status text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Plain-text source of a status. Returned instead of `content` when status is deleted, so the user may redraft from the source text without the client having to reverse-engineer the original text from the HTML content.
   * @return text
  */
  
  @Schema(name = "text", description = "Plain-text source of a status. Returned instead of `content` when status is deleted, so the user may redraft from the source text without the client having to reverse-engineer the original text from the HTML content.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Status uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * URI of the status used for federation.
   * @return uri
  */
  
  @Schema(name = "uri", description = "URI of the status used for federation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Status url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A link to the status's HTML representation.
   * @return url
  */
  
  @Schema(name = "url", description = "A link to the status's HTML representation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Status visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of this status.
   * @return visibility
  */
  
  @Schema(name = "visibility", description = "Visibility of this status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.account, status.account) &&
        Objects.equals(this.application, status.application) &&
        Objects.equals(this.bookmarked, status.bookmarked) &&
        Objects.equals(this.card, status.card) &&
        Objects.equals(this.content, status.content) &&
        Objects.equals(this.createdAt, status.createdAt) &&
        Objects.equals(this.emojis, status.emojis) &&
        Objects.equals(this.favourited, status.favourited) &&
        Objects.equals(this.favouritesCount, status.favouritesCount) &&
        Objects.equals(this.id, status.id) &&
        Objects.equals(this.inReplyToAccountId, status.inReplyToAccountId) &&
        Objects.equals(this.inReplyToId, status.inReplyToId) &&
        Objects.equals(this.language, status.language) &&
        Objects.equals(this.mediaAttachments, status.mediaAttachments) &&
        Objects.equals(this.mentions, status.mentions) &&
        Objects.equals(this.muted, status.muted) &&
        Objects.equals(this.pinned, status.pinned) &&
        Objects.equals(this.poll, status.poll) &&
        Objects.equals(this.reblog, status.reblog) &&
        Objects.equals(this.reblogged, status.reblogged) &&
        Objects.equals(this.reblogsCount, status.reblogsCount) &&
        Objects.equals(this.repliesCount, status.repliesCount) &&
        Objects.equals(this.sensitive, status.sensitive) &&
        Objects.equals(this.spoilerText, status.spoilerText) &&
        Objects.equals(this.tags, status.tags) &&
        Objects.equals(this.text, status.text) &&
        Objects.equals(this.uri, status.uri) &&
        Objects.equals(this.url, status.url) &&
        Objects.equals(this.visibility, status.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, application, bookmarked, card, content, createdAt, emojis, favourited, favouritesCount, id, inReplyToAccountId, inReplyToId, language, mediaAttachments, mentions, muted, pinned, poll, reblog, reblogged, reblogsCount, repliesCount, sensitive, spoilerText, tags, text, uri, url, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    bookmarked: ").append(toIndentedString(bookmarked)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    favourited: ").append(toIndentedString(favourited)).append("\n");
    sb.append("    favouritesCount: ").append(toIndentedString(favouritesCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inReplyToAccountId: ").append(toIndentedString(inReplyToAccountId)).append("\n");
    sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mediaAttachments: ").append(toIndentedString(mediaAttachments)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    poll: ").append(toIndentedString(poll)).append("\n");
    sb.append("    reblog: ").append(toIndentedString(reblog)).append("\n");
    sb.append("    reblogged: ").append(toIndentedString(reblogged)).append("\n");
    sb.append("    reblogsCount: ").append(toIndentedString(reblogsCount)).append("\n");
    sb.append("    repliesCount: ").append(toIndentedString(repliesCount)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    spoilerText: ").append(toIndentedString(spoilerText)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

