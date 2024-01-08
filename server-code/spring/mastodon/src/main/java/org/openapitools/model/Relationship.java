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
 * Represents the relationship between accounts, such as following / blocking / muting / etc.
 */

@Schema(name = "Relationship", description = "Represents the relationship between accounts, such as following / blocking / muting / etc.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Relationship {

  private Boolean blockedBy;

  private Boolean blocking;

  private Boolean domainBlocking;

  private Boolean endorsed;

  private Boolean followedBy;

  private Boolean following;

  private String id;

  private Boolean muting;

  private Boolean mutingNotifications;

  private String note;

  private Boolean notifying;

  private Boolean requested;

  private Boolean showingReblogs;

  public Relationship() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Relationship(Boolean blockedBy, Boolean blocking, Boolean domainBlocking, Boolean endorsed, Boolean followedBy, Boolean following, String id, Boolean muting, Boolean mutingNotifications, String note, Boolean notifying, Boolean requested, Boolean showingReblogs) {
    this.blockedBy = blockedBy;
    this.blocking = blocking;
    this.domainBlocking = domainBlocking;
    this.endorsed = endorsed;
    this.followedBy = followedBy;
    this.following = following;
    this.id = id;
    this.muting = muting;
    this.mutingNotifications = mutingNotifications;
    this.note = note;
    this.notifying = notifying;
    this.requested = requested;
    this.showingReblogs = showingReblogs;
  }

  public Relationship blockedBy(Boolean blockedBy) {
    this.blockedBy = blockedBy;
    return this;
  }

  /**
   * Is this user blocking you?
   * @return blockedBy
  */
  @NotNull 
  @Schema(name = "blocked_by", description = "Is this user blocking you?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("blocked_by")
  public Boolean getBlockedBy() {
    return blockedBy;
  }

  public void setBlockedBy(Boolean blockedBy) {
    this.blockedBy = blockedBy;
  }

  public Relationship blocking(Boolean blocking) {
    this.blocking = blocking;
    return this;
  }

  /**
   * Are you blocking this user?
   * @return blocking
  */
  @NotNull 
  @Schema(name = "blocking", description = "Are you blocking this user?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("blocking")
  public Boolean getBlocking() {
    return blocking;
  }

  public void setBlocking(Boolean blocking) {
    this.blocking = blocking;
  }

  public Relationship domainBlocking(Boolean domainBlocking) {
    this.domainBlocking = domainBlocking;
    return this;
  }

  /**
   * Are you blocking this user's domain?
   * @return domainBlocking
  */
  @NotNull 
  @Schema(name = "domain_blocking", description = "Are you blocking this user's domain?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("domain_blocking")
  public Boolean getDomainBlocking() {
    return domainBlocking;
  }

  public void setDomainBlocking(Boolean domainBlocking) {
    this.domainBlocking = domainBlocking;
  }

  public Relationship endorsed(Boolean endorsed) {
    this.endorsed = endorsed;
    return this;
  }

  /**
   * Are you featuring this user on your profile?
   * @return endorsed
  */
  @NotNull 
  @Schema(name = "endorsed", description = "Are you featuring this user on your profile?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endorsed")
  public Boolean getEndorsed() {
    return endorsed;
  }

  public void setEndorsed(Boolean endorsed) {
    this.endorsed = endorsed;
  }

  public Relationship followedBy(Boolean followedBy) {
    this.followedBy = followedBy;
    return this;
  }

  /**
   * Are you followed by this user?
   * @return followedBy
  */
  @NotNull 
  @Schema(name = "followed_by", description = "Are you followed by this user?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("followed_by")
  public Boolean getFollowedBy() {
    return followedBy;
  }

  public void setFollowedBy(Boolean followedBy) {
    this.followedBy = followedBy;
  }

  public Relationship following(Boolean following) {
    this.following = following;
    return this;
  }

  /**
   * Are you following this user?
   * @return following
  */
  @NotNull 
  @Schema(name = "following", description = "Are you following this user?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("following")
  public Boolean getFollowing() {
    return following;
  }

  public void setFollowing(Boolean following) {
    this.following = following;
  }

  public Relationship id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The account id. Cast from an integer, but not guaranteed to be a number.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The account id. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Relationship muting(Boolean muting) {
    this.muting = muting;
    return this;
  }

  /**
   * Are you muting this user?
   * @return muting
  */
  @NotNull 
  @Schema(name = "muting", description = "Are you muting this user?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("muting")
  public Boolean getMuting() {
    return muting;
  }

  public void setMuting(Boolean muting) {
    this.muting = muting;
  }

  public Relationship mutingNotifications(Boolean mutingNotifications) {
    this.mutingNotifications = mutingNotifications;
    return this;
  }

  /**
   * Are you muting notifications from this user?
   * @return mutingNotifications
  */
  @NotNull 
  @Schema(name = "muting_notifications", description = "Are you muting notifications from this user?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("muting_notifications")
  public Boolean getMutingNotifications() {
    return mutingNotifications;
  }

  public void setMutingNotifications(Boolean mutingNotifications) {
    this.mutingNotifications = mutingNotifications;
  }

  public Relationship note(String note) {
    this.note = note;
    return this;
  }

  /**
   * This user's profile bio
   * @return note
  */
  @NotNull 
  @Schema(name = "note", description = "This user's profile bio", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Relationship notifying(Boolean notifying) {
    this.notifying = notifying;
    return this;
  }

  /**
   * Have you enabled notifications for this user?
   * @return notifying
  */
  @NotNull 
  @Schema(name = "notifying", description = "Have you enabled notifications for this user?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notifying")
  public Boolean getNotifying() {
    return notifying;
  }

  public void setNotifying(Boolean notifying) {
    this.notifying = notifying;
  }

  public Relationship requested(Boolean requested) {
    this.requested = requested;
    return this;
  }

  /**
   * Do you have a pending follow request for this user?
   * @return requested
  */
  @NotNull 
  @Schema(name = "requested", description = "Do you have a pending follow request for this user?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requested")
  public Boolean getRequested() {
    return requested;
  }

  public void setRequested(Boolean requested) {
    this.requested = requested;
  }

  public Relationship showingReblogs(Boolean showingReblogs) {
    this.showingReblogs = showingReblogs;
    return this;
  }

  /**
   * Are you receiving this user's boosts in your home timeline?
   * @return showingReblogs
  */
  @NotNull 
  @Schema(name = "showing_reblogs", description = "Are you receiving this user's boosts in your home timeline?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("showing_reblogs")
  public Boolean getShowingReblogs() {
    return showingReblogs;
  }

  public void setShowingReblogs(Boolean showingReblogs) {
    this.showingReblogs = showingReblogs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Relationship relationship = (Relationship) o;
    return Objects.equals(this.blockedBy, relationship.blockedBy) &&
        Objects.equals(this.blocking, relationship.blocking) &&
        Objects.equals(this.domainBlocking, relationship.domainBlocking) &&
        Objects.equals(this.endorsed, relationship.endorsed) &&
        Objects.equals(this.followedBy, relationship.followedBy) &&
        Objects.equals(this.following, relationship.following) &&
        Objects.equals(this.id, relationship.id) &&
        Objects.equals(this.muting, relationship.muting) &&
        Objects.equals(this.mutingNotifications, relationship.mutingNotifications) &&
        Objects.equals(this.note, relationship.note) &&
        Objects.equals(this.notifying, relationship.notifying) &&
        Objects.equals(this.requested, relationship.requested) &&
        Objects.equals(this.showingReblogs, relationship.showingReblogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockedBy, blocking, domainBlocking, endorsed, followedBy, following, id, muting, mutingNotifications, note, notifying, requested, showingReblogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationship {\n");
    sb.append("    blockedBy: ").append(toIndentedString(blockedBy)).append("\n");
    sb.append("    blocking: ").append(toIndentedString(blocking)).append("\n");
    sb.append("    domainBlocking: ").append(toIndentedString(domainBlocking)).append("\n");
    sb.append("    endorsed: ").append(toIndentedString(endorsed)).append("\n");
    sb.append("    followedBy: ").append(toIndentedString(followedBy)).append("\n");
    sb.append("    following: ").append(toIndentedString(following)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    muting: ").append(toIndentedString(muting)).append("\n");
    sb.append("    mutingNotifications: ").append(toIndentedString(mutingNotifications)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    notifying: ").append(toIndentedString(notifying)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    showingReblogs: ").append(toIndentedString(showingReblogs)).append("\n");
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

