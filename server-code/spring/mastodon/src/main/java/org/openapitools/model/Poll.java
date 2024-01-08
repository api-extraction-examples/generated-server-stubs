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
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a poll attached to a status.
 */

@Schema(name = "Poll", description = "Represents a poll attached to a status.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Poll {

  @Valid
  private List<@Valid Emoji> emojis;

  private Boolean expired;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiresAt;

  private String id;

  private Boolean multiple;

  @Valid
  private List<Object> options;

  @Valid
  private List<Integer> ownVotes;

  private Boolean voted;

  private Integer votersCount;

  private Integer votesCount;

  public Poll emojis(List<@Valid Emoji> emojis) {
    this.emojis = emojis;
    return this;
  }

  public Poll addEmojisItem(Emoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

  /**
   * Custom emoji to be used for rendering poll options.
   * @return emojis
  */
  @Valid 
  @Schema(name = "emojis", description = "Custom emoji to be used for rendering poll options.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emojis")
  public List<@Valid Emoji> getEmojis() {
    return emojis;
  }

  public void setEmojis(List<@Valid Emoji> emojis) {
    this.emojis = emojis;
  }

  public Poll expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

  /**
   * Is the poll currently expired?
   * @return expired
  */
  
  @Schema(name = "expired", description = "Is the poll currently expired?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expired")
  public Boolean getExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public Poll expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * When the poll ends. ISO 8601 Datetime, or null if the poll does not end.
   * @return expiresAt
  */
  @Valid 
  @Schema(name = "expires_at", description = "When the poll ends. ISO 8601 Datetime, or null if the poll does not end.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_at")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Poll id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the poll in the database. Cast from an integer, but not guaranteed to be a number.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the poll in the database. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Poll multiple(Boolean multiple) {
    this.multiple = multiple;
    return this;
  }

  /**
   * Does the poll allow multiple-choice answers?
   * @return multiple
  */
  
  @Schema(name = "multiple", description = "Does the poll allow multiple-choice answers?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("multiple")
  public Boolean getMultiple() {
    return multiple;
  }

  public void setMultiple(Boolean multiple) {
    this.multiple = multiple;
  }

  public Poll options(List<Object> options) {
    this.options = options;
    return this;
  }

  public Poll addOptionsItem(Object optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Possible answers for the poll.
   * @return options
  */
  
  @Schema(name = "options", description = "Possible answers for the poll.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public List<Object> getOptions() {
    return options;
  }

  public void setOptions(List<Object> options) {
    this.options = options;
  }

  public Poll ownVotes(List<Integer> ownVotes) {
    this.ownVotes = ownVotes;
    return this;
  }

  public Poll addOwnVotesItem(Integer ownVotesItem) {
    if (this.ownVotes == null) {
      this.ownVotes = new ArrayList<>();
    }
    this.ownVotes.add(ownVotesItem);
    return this;
  }

  /**
   * When called with a user token, which options has the authorized user chosen? Contains an array of index values for `options`. Array of Number, or null if no current user
   * @return ownVotes
  */
  
  @Schema(name = "own_votes", description = "When called with a user token, which options has the authorized user chosen? Contains an array of index values for `options`. Array of Number, or null if no current user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("own_votes")
  public List<Integer> getOwnVotes() {
    return ownVotes;
  }

  public void setOwnVotes(List<Integer> ownVotes) {
    this.ownVotes = ownVotes;
  }

  public Poll voted(Boolean voted) {
    this.voted = voted;
    return this;
  }

  /**
   * When called with a user token, has the authorized user voted? Boolean, or null if no current user
   * @return voted
  */
  
  @Schema(name = "voted", description = "When called with a user token, has the authorized user voted? Boolean, or null if no current user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voted")
  public Boolean getVoted() {
    return voted;
  }

  public void setVoted(Boolean voted) {
    this.voted = voted;
  }

  public Poll votersCount(Integer votersCount) {
    this.votersCount = votersCount;
    return this;
  }

  /**
   * How many unique accounts have voted on a multiple-choice poll. Number, or null if `multiple` is false.
   * @return votersCount
  */
  
  @Schema(name = "voters_count", description = "How many unique accounts have voted on a multiple-choice poll. Number, or null if `multiple` is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voters_count")
  public Integer getVotersCount() {
    return votersCount;
  }

  public void setVotersCount(Integer votersCount) {
    this.votersCount = votersCount;
  }

  public Poll votesCount(Integer votesCount) {
    this.votesCount = votesCount;
    return this;
  }

  /**
   * How many votes have been received.
   * @return votesCount
  */
  
  @Schema(name = "votes_count", description = "How many votes have been received.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("votes_count")
  public Integer getVotesCount() {
    return votesCount;
  }

  public void setVotesCount(Integer votesCount) {
    this.votesCount = votesCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Poll poll = (Poll) o;
    return Objects.equals(this.emojis, poll.emojis) &&
        Objects.equals(this.expired, poll.expired) &&
        Objects.equals(this.expiresAt, poll.expiresAt) &&
        Objects.equals(this.id, poll.id) &&
        Objects.equals(this.multiple, poll.multiple) &&
        Objects.equals(this.options, poll.options) &&
        Objects.equals(this.ownVotes, poll.ownVotes) &&
        Objects.equals(this.voted, poll.voted) &&
        Objects.equals(this.votersCount, poll.votersCount) &&
        Objects.equals(this.votesCount, poll.votesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojis, expired, expiresAt, id, multiple, options, ownVotes, voted, votersCount, votesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Poll {\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    ownVotes: ").append(toIndentedString(ownVotes)).append("\n");
    sb.append("    voted: ").append(toIndentedString(voted)).append("\n");
    sb.append("    votersCount: ").append(toIndentedString(votersCount)).append("\n");
    sb.append("    votesCount: ").append(toIndentedString(votesCount)).append("\n");
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

