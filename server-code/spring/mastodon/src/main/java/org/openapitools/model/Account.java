package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Emoji;
import org.openapitools.model.Field;
import org.openapitools.model.Source;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a user of Mastodon and their associated profile.
 */

@Schema(name = "Account", description = "Represents a user of Mastodon and their associated profile.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Account {

  private String acct;

  private String avatar;

  private String avatarStatic;

  private Boolean bot;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private Boolean discoverable;

  private String displayName;

  @Valid
  private List<@Valid Emoji> emojis;

  @Valid
  private List<@Valid Field> fields;

  private Integer followersCount;

  private Integer followingCount;

  private String header;

  private String headerStatic;

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastStatusAt;

  private Boolean locked;

  private Account moved;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime muteExpiresAt;

  private String note;

  private Source source;

  private Integer statusesCount;

  private Boolean suspended;

  private String url;

  private String username;

  public Account acct(String acct) {
    this.acct = acct;
    return this;
  }

  /**
   * The Webfinger account URI. Equal to `username` for local users, or `username@domain` for
   * @return acct
  */
  
  @Schema(name = "acct", description = "The Webfinger account URI. Equal to `username` for local users, or `username@domain` for", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acct")
  public String getAcct() {
    return acct;
  }

  public void setAcct(String acct) {
    this.acct = acct;
  }

  public Account avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * An image icon that is shown next to statuses and in the profile. The format is URL.
   * @return avatar
  */
  
  @Schema(name = "avatar", description = "An image icon that is shown next to statuses and in the profile. The format is URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatar")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Account avatarStatic(String avatarStatic) {
    this.avatarStatic = avatarStatic;
    return this;
  }

  /**
   * A static version of the avatar. Equal to `avatar` if its value is a static image; different if `avatar` is an animated GIF. The format is URL.
   * @return avatarStatic
  */
  
  @Schema(name = "avatar_static", description = "A static version of the avatar. Equal to `avatar` if its value is a static image; different if `avatar` is an animated GIF. The format is URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatar_static")
  public String getAvatarStatic() {
    return avatarStatic;
  }

  public void setAvatarStatic(String avatarStatic) {
    this.avatarStatic = avatarStatic;
  }

  public Account bot(Boolean bot) {
    this.bot = bot;
    return this;
  }

  /**
   * A presentational flag. Indicates that the account may perform automated actions, may not be monitored, or identifies as a robot.
   * @return bot
  */
  
  @Schema(name = "bot", description = "A presentational flag. Indicates that the account may perform automated actions, may not be monitored, or identifies as a robot.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bot")
  public Boolean getBot() {
    return bot;
  }

  public void setBot(Boolean bot) {
    this.bot = bot;
  }

  public Account createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the account was created.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", description = "When the account was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Account discoverable(Boolean discoverable) {
    this.discoverable = discoverable;
    return this;
  }

  /**
   * Whether the account has opted into discovery features such as the profile directory.
   * @return discoverable
  */
  
  @Schema(name = "discoverable", description = "Whether the account has opted into discovery features such as the profile directory.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discoverable")
  public Boolean getDiscoverable() {
    return discoverable;
  }

  public void setDiscoverable(Boolean discoverable) {
    this.discoverable = discoverable;
  }

  public Account displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The profile's display name.
   * @return displayName
  */
  
  @Schema(name = "display_name", description = "The profile's display name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Account emojis(List<@Valid Emoji> emojis) {
    this.emojis = emojis;
    return this;
  }

  public Account addEmojisItem(Emoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

  /**
   * Custom emoji entities to be used when rendering the profile. If none, an empty array will be returned.
   * @return emojis
  */
  @Valid 
  @Schema(name = "emojis", description = "Custom emoji entities to be used when rendering the profile. If none, an empty array will be returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emojis")
  public List<@Valid Emoji> getEmojis() {
    return emojis;
  }

  public void setEmojis(List<@Valid Emoji> emojis) {
    this.emojis = emojis;
  }

  public Account fields(List<@Valid Field> fields) {
    this.fields = fields;
    return this;
  }

  public Account addFieldsItem(Field fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Additional metadata attached to a profile as name-value pairs.
   * @return fields
  */
  @Valid 
  @Schema(name = "fields", description = "Additional metadata attached to a profile as name-value pairs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public List<@Valid Field> getFields() {
    return fields;
  }

  public void setFields(List<@Valid Field> fields) {
    this.fields = fields;
  }

  public Account followersCount(Integer followersCount) {
    this.followersCount = followersCount;
    return this;
  }

  /**
   * The reported followers of this profile.
   * @return followersCount
  */
  
  @Schema(name = "followers_count", description = "The reported followers of this profile.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followers_count")
  public Integer getFollowersCount() {
    return followersCount;
  }

  public void setFollowersCount(Integer followersCount) {
    this.followersCount = followersCount;
  }

  public Account followingCount(Integer followingCount) {
    this.followingCount = followingCount;
    return this;
  }

  /**
   * The reported follows of this profile.
   * @return followingCount
  */
  
  @Schema(name = "following_count", description = "The reported follows of this profile.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("following_count")
  public Integer getFollowingCount() {
    return followingCount;
  }

  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }

  public Account header(String header) {
    this.header = header;
    return this;
  }

  /**
   * An image banner that is shown above the profile and in profile cards. The format is URL.
   * @return header
  */
  
  @Schema(name = "header", description = "An image banner that is shown above the profile and in profile cards. The format is URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public Account headerStatic(String headerStatic) {
    this.headerStatic = headerStatic;
    return this;
  }

  /**
   * A static version of the header. Equal to `header` if its value is a static image; different if `header` is an animated GIF. The format is URL.
   * @return headerStatic
  */
  
  @Schema(name = "header_static", description = "A static version of the header. Equal to `header` if its value is a static image; different if `header` is an animated GIF. The format is URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header_static")
  public String getHeaderStatic() {
    return headerStatic;
  }

  public void setHeaderStatic(String headerStatic) {
    this.headerStatic = headerStatic;
  }

  public Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The account id `header`.
   * @return id
  */
  
  @Schema(name = "id", description = "The account id `header`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account lastStatusAt(OffsetDateTime lastStatusAt) {
    this.lastStatusAt = lastStatusAt;
    return this;
  }

  /**
   * When the most recent status was posted.
   * @return lastStatusAt
  */
  @Valid 
  @Schema(name = "last_status_at", description = "When the most recent status was posted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_status_at")
  public OffsetDateTime getLastStatusAt() {
    return lastStatusAt;
  }

  public void setLastStatusAt(OffsetDateTime lastStatusAt) {
    this.lastStatusAt = lastStatusAt;
  }

  public Account locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Whether the account manually approves follow requests.
   * @return locked
  */
  
  @Schema(name = "locked", description = "Whether the account manually approves follow requests.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public Account moved(Account moved) {
    this.moved = moved;
    return this;
  }

  /**
   * Get moved
   * @return moved
  */
  @Valid 
  @Schema(name = "moved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moved")
  public Account getMoved() {
    return moved;
  }

  public void setMoved(Account moved) {
    this.moved = moved;
  }

  public Account muteExpiresAt(OffsetDateTime muteExpiresAt) {
    this.muteExpiresAt = muteExpiresAt;
    return this;
  }

  /**
   * When a timed mute will expire, if applicable. ISO 8601 Datetime.
   * @return muteExpiresAt
  */
  @Valid 
  @Schema(name = "mute_expires_at", description = "When a timed mute will expire, if applicable. ISO 8601 Datetime.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mute_expires_at")
  public OffsetDateTime getMuteExpiresAt() {
    return muteExpiresAt;
  }

  public void setMuteExpiresAt(OffsetDateTime muteExpiresAt) {
    this.muteExpiresAt = muteExpiresAt;
  }

  public Account note(String note) {
    this.note = note;
    return this;
  }

  /**
   * The profile's bio / description.
   * @return note
  */
  
  @Schema(name = "note", description = "The profile's bio / description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Account source(Source source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @Valid 
  @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  public Account statusesCount(Integer statusesCount) {
    this.statusesCount = statusesCount;
    return this;
  }

  /**
   * How many statuses are attached to this account.
   * @return statusesCount
  */
  
  @Schema(name = "statuses_count", description = "How many statuses are attached to this account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses_count")
  public Integer getStatusesCount() {
    return statusesCount;
  }

  public void setStatusesCount(Integer statusesCount) {
    this.statusesCount = statusesCount;
  }

  public Account suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * An extra entity returned when an account is suspended.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "An extra entity returned when an account is suspended.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public Account url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The location of the user's profile page. (HTTPS URL)
   * @return url
  */
  
  @Schema(name = "url", description = "The location of the user's profile page. (HTTPS URL)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Account username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username of the account, not including domain.
   * @return username
  */
  
  @Schema(name = "username", description = "The username of the account, not including domain.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.acct, account.acct) &&
        Objects.equals(this.avatar, account.avatar) &&
        Objects.equals(this.avatarStatic, account.avatarStatic) &&
        Objects.equals(this.bot, account.bot) &&
        Objects.equals(this.createdAt, account.createdAt) &&
        Objects.equals(this.discoverable, account.discoverable) &&
        Objects.equals(this.displayName, account.displayName) &&
        Objects.equals(this.emojis, account.emojis) &&
        Objects.equals(this.fields, account.fields) &&
        Objects.equals(this.followersCount, account.followersCount) &&
        Objects.equals(this.followingCount, account.followingCount) &&
        Objects.equals(this.header, account.header) &&
        Objects.equals(this.headerStatic, account.headerStatic) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.lastStatusAt, account.lastStatusAt) &&
        Objects.equals(this.locked, account.locked) &&
        Objects.equals(this.moved, account.moved) &&
        Objects.equals(this.muteExpiresAt, account.muteExpiresAt) &&
        Objects.equals(this.note, account.note) &&
        Objects.equals(this.source, account.source) &&
        Objects.equals(this.statusesCount, account.statusesCount) &&
        Objects.equals(this.suspended, account.suspended) &&
        Objects.equals(this.url, account.url) &&
        Objects.equals(this.username, account.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acct, avatar, avatarStatic, bot, createdAt, discoverable, displayName, emojis, fields, followersCount, followingCount, header, headerStatic, id, lastStatusAt, locked, moved, muteExpiresAt, note, source, statusesCount, suspended, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    acct: ").append(toIndentedString(acct)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    avatarStatic: ").append(toIndentedString(avatarStatic)).append("\n");
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    discoverable: ").append(toIndentedString(discoverable)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    headerStatic: ").append(toIndentedString(headerStatic)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastStatusAt: ").append(toIndentedString(lastStatusAt)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    moved: ").append(toIndentedString(moved)).append("\n");
    sb.append("    muteExpiresAt: ").append(toIndentedString(muteExpiresAt)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    statusesCount: ").append(toIndentedString(statusesCount)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

