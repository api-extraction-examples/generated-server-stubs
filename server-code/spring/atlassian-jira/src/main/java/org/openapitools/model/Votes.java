package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.User;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The details of votes on an issue.
 */

@Schema(name = "Votes", description = "The details of votes on an issue.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Votes {

  private Boolean hasVoted;

  private URI self;

  @Valid
  private List<@Valid User> voters;

  private Long votes;

  public Votes hasVoted(Boolean hasVoted) {
    this.hasVoted = hasVoted;
    return this;
  }

  /**
   * Whether the user making this request has voted on the issue.
   * @return hasVoted
  */
  
  @Schema(name = "hasVoted", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the user making this request has voted on the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasVoted")
  public Boolean getHasVoted() {
    return hasVoted;
  }

  public void setHasVoted(Boolean hasVoted) {
    this.hasVoted = hasVoted;
  }

  public Votes self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of these issue vote details.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of these issue vote details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public Votes voters(List<@Valid User> voters) {
    this.voters = voters;
    return this;
  }

  public Votes addVotersItem(User votersItem) {
    if (this.voters == null) {
      this.voters = new ArrayList<>();
    }
    this.voters.add(votersItem);
    return this;
  }

  /**
   * List of the users who have voted on this issue. An empty list is returned when the calling user doesn't have the *View voters and watchers* project permission.
   * @return voters
  */
  @Valid 
  @Schema(name = "voters", accessMode = Schema.AccessMode.READ_ONLY, description = "List of the users who have voted on this issue. An empty list is returned when the calling user doesn't have the *View voters and watchers* project permission.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voters")
  public List<@Valid User> getVoters() {
    return voters;
  }

  public void setVoters(List<@Valid User> voters) {
    this.voters = voters;
  }

  public Votes votes(Long votes) {
    this.votes = votes;
    return this;
  }

  /**
   * The number of votes on the issue.
   * @return votes
  */
  
  @Schema(name = "votes", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of votes on the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("votes")
  public Long getVotes() {
    return votes;
  }

  public void setVotes(Long votes) {
    this.votes = votes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Votes votes = (Votes) o;
    return Objects.equals(this.hasVoted, votes.hasVoted) &&
        Objects.equals(this.self, votes.self) &&
        Objects.equals(this.voters, votes.voters) &&
        Objects.equals(this.votes, votes.votes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasVoted, self, voters, votes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Votes {\n");
    sb.append("    hasVoted: ").append(toIndentedString(hasVoted)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    voters: ").append(toIndentedString(voters)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
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

