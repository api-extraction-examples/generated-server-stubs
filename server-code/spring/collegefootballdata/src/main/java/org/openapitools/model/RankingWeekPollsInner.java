package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RankingWeekPollsInnerRanksInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RankingWeekPollsInner
 */

@JsonTypeName("RankingWeek_polls_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class RankingWeekPollsInner {

  private String poll;

  @Valid
  private List<@Valid RankingWeekPollsInnerRanksInner> ranks;

  public RankingWeekPollsInner poll(String poll) {
    this.poll = poll;
    return this;
  }

  /**
   * Get poll
   * @return poll
  */
  
  @Schema(name = "poll", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poll")
  public String getPoll() {
    return poll;
  }

  public void setPoll(String poll) {
    this.poll = poll;
  }

  public RankingWeekPollsInner ranks(List<@Valid RankingWeekPollsInnerRanksInner> ranks) {
    this.ranks = ranks;
    return this;
  }

  public RankingWeekPollsInner addRanksItem(RankingWeekPollsInnerRanksInner ranksItem) {
    if (this.ranks == null) {
      this.ranks = new ArrayList<>();
    }
    this.ranks.add(ranksItem);
    return this;
  }

  /**
   * Get ranks
   * @return ranks
  */
  @Valid 
  @Schema(name = "ranks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ranks")
  public List<@Valid RankingWeekPollsInnerRanksInner> getRanks() {
    return ranks;
  }

  public void setRanks(List<@Valid RankingWeekPollsInnerRanksInner> ranks) {
    this.ranks = ranks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankingWeekPollsInner rankingWeekPollsInner = (RankingWeekPollsInner) o;
    return Objects.equals(this.poll, rankingWeekPollsInner.poll) &&
        Objects.equals(this.ranks, rankingWeekPollsInner.ranks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poll, ranks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankingWeekPollsInner {\n");
    sb.append("    poll: ").append(toIndentedString(poll)).append("\n");
    sb.append("    ranks: ").append(toIndentedString(ranks)).append("\n");
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

