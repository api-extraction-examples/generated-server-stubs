package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BoxScorePlayersPpaInner;
import org.openapitools.model.BoxScorePlayersUsageInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BoxScorePlayers
 */

@JsonTypeName("BoxScore_players")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class BoxScorePlayers {

  @Valid
  private List<@Valid BoxScorePlayersPpaInner> ppa;

  @Valid
  private List<@Valid BoxScorePlayersUsageInner> usage;

  public BoxScorePlayers ppa(List<@Valid BoxScorePlayersPpaInner> ppa) {
    this.ppa = ppa;
    return this;
  }

  public BoxScorePlayers addPpaItem(BoxScorePlayersPpaInner ppaItem) {
    if (this.ppa == null) {
      this.ppa = new ArrayList<>();
    }
    this.ppa.add(ppaItem);
    return this;
  }

  /**
   * Get ppa
   * @return ppa
  */
  @Valid 
  @Schema(name = "ppa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ppa")
  public List<@Valid BoxScorePlayersPpaInner> getPpa() {
    return ppa;
  }

  public void setPpa(List<@Valid BoxScorePlayersPpaInner> ppa) {
    this.ppa = ppa;
  }

  public BoxScorePlayers usage(List<@Valid BoxScorePlayersUsageInner> usage) {
    this.usage = usage;
    return this;
  }

  public BoxScorePlayers addUsageItem(BoxScorePlayersUsageInner usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    return this;
  }

  /**
   * Get usage
   * @return usage
  */
  @Valid 
  @Schema(name = "usage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usage")
  public List<@Valid BoxScorePlayersUsageInner> getUsage() {
    return usage;
  }

  public void setUsage(List<@Valid BoxScorePlayersUsageInner> usage) {
    this.usage = usage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxScorePlayers boxScorePlayers = (BoxScorePlayers) o;
    return Objects.equals(this.ppa, boxScorePlayers.ppa) &&
        Objects.equals(this.usage, boxScorePlayers.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ppa, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxScorePlayers {\n");
    sb.append("    ppa: ").append(toIndentedString(ppa)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

