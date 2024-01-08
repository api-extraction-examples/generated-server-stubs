package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChangedWorklog;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * List of changed worklogs.
 */

@Schema(name = "ChangedWorklogs", description = "List of changed worklogs.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ChangedWorklogs {

  private Boolean lastPage;

  private URI nextPage;

  private URI self;

  private Long since;

  private Long until;

  @Valid
  private List<@Valid ChangedWorklog> values;

  public ChangedWorklogs lastPage(Boolean lastPage) {
    this.lastPage = lastPage;
    return this;
  }

  /**
   * Get lastPage
   * @return lastPage
  */
  
  @Schema(name = "lastPage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastPage")
  public Boolean getLastPage() {
    return lastPage;
  }

  public void setLastPage(Boolean lastPage) {
    this.lastPage = lastPage;
  }

  public ChangedWorklogs nextPage(URI nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * The URL of the next list of changed worklogs.
   * @return nextPage
  */
  @Valid 
  @Schema(name = "nextPage", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the next list of changed worklogs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextPage")
  public URI getNextPage() {
    return nextPage;
  }

  public void setNextPage(URI nextPage) {
    this.nextPage = nextPage;
  }

  public ChangedWorklogs self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of this changed worklogs list.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of this changed worklogs list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public ChangedWorklogs since(Long since) {
    this.since = since;
    return this;
  }

  /**
   * The datetime of the first worklog item in the list.
   * @return since
  */
  
  @Schema(name = "since", accessMode = Schema.AccessMode.READ_ONLY, description = "The datetime of the first worklog item in the list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("since")
  public Long getSince() {
    return since;
  }

  public void setSince(Long since) {
    this.since = since;
  }

  public ChangedWorklogs until(Long until) {
    this.until = until;
    return this;
  }

  /**
   * The datetime of the last worklog item in the list.
   * @return until
  */
  
  @Schema(name = "until", accessMode = Schema.AccessMode.READ_ONLY, description = "The datetime of the last worklog item in the list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("until")
  public Long getUntil() {
    return until;
  }

  public void setUntil(Long until) {
    this.until = until;
  }

  public ChangedWorklogs values(List<@Valid ChangedWorklog> values) {
    this.values = values;
    return this;
  }

  public ChangedWorklogs addValuesItem(ChangedWorklog valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Changed worklog list.
   * @return values
  */
  @Valid 
  @Schema(name = "values", accessMode = Schema.AccessMode.READ_ONLY, description = "Changed worklog list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<@Valid ChangedWorklog> getValues() {
    return values;
  }

  public void setValues(List<@Valid ChangedWorklog> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangedWorklogs changedWorklogs = (ChangedWorklogs) o;
    return Objects.equals(this.lastPage, changedWorklogs.lastPage) &&
        Objects.equals(this.nextPage, changedWorklogs.nextPage) &&
        Objects.equals(this.self, changedWorklogs.self) &&
        Objects.equals(this.since, changedWorklogs.since) &&
        Objects.equals(this.until, changedWorklogs.until) &&
        Objects.equals(this.values, changedWorklogs.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastPage, nextPage, self, since, until, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangedWorklogs {\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

