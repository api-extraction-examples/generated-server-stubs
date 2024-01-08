package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UserDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The details of watchers on an issue.
 */

@Schema(name = "Watchers", description = "The details of watchers on an issue.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Watchers {

  private Boolean isWatching;

  private String self;

  private Integer watchCount;

  @Valid
  private List<@Valid UserDetails> watchers;

  public Watchers isWatching(Boolean isWatching) {
    this.isWatching = isWatching;
    return this;
  }

  /**
   * Whether the calling user is watching this issue.
   * @return isWatching
  */
  
  @Schema(name = "isWatching", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the calling user is watching this issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isWatching")
  public Boolean getIsWatching() {
    return isWatching;
  }

  public void setIsWatching(Boolean isWatching) {
    this.isWatching = isWatching;
  }

  public Watchers self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of these issue watcher details.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of these issue watcher details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public Watchers watchCount(Integer watchCount) {
    this.watchCount = watchCount;
    return this;
  }

  /**
   * The number of users watching this issue.
   * @return watchCount
  */
  
  @Schema(name = "watchCount", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of users watching this issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("watchCount")
  public Integer getWatchCount() {
    return watchCount;
  }

  public void setWatchCount(Integer watchCount) {
    this.watchCount = watchCount;
  }

  public Watchers watchers(List<@Valid UserDetails> watchers) {
    this.watchers = watchers;
    return this;
  }

  public Watchers addWatchersItem(UserDetails watchersItem) {
    if (this.watchers == null) {
      this.watchers = new ArrayList<>();
    }
    this.watchers.add(watchersItem);
    return this;
  }

  /**
   * Details of the users watching this issue.
   * @return watchers
  */
  @Valid 
  @Schema(name = "watchers", accessMode = Schema.AccessMode.READ_ONLY, description = "Details of the users watching this issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("watchers")
  public List<@Valid UserDetails> getWatchers() {
    return watchers;
  }

  public void setWatchers(List<@Valid UserDetails> watchers) {
    this.watchers = watchers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Watchers watchers = (Watchers) o;
    return Objects.equals(this.isWatching, watchers.isWatching) &&
        Objects.equals(this.self, watchers.self) &&
        Objects.equals(this.watchCount, watchers.watchCount) &&
        Objects.equals(this.watchers, watchers.watchers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isWatching, self, watchCount, watchers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Watchers {\n");
    sb.append("    isWatching: ").append(toIndentedString(isWatching)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    watchCount: ").append(toIndentedString(watchCount)).append("\n");
    sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
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

