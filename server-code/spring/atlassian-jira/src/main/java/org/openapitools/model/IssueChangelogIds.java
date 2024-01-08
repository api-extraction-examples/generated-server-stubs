package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of changelog IDs.
 */

@Schema(name = "IssueChangelogIds", description = "A list of changelog IDs.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueChangelogIds {

  @Valid
  private Set<Long> changelogIds = new LinkedHashSet<>();

  public IssueChangelogIds() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueChangelogIds(Set<Long> changelogIds) {
    this.changelogIds = changelogIds;
  }

  public IssueChangelogIds changelogIds(Set<Long> changelogIds) {
    this.changelogIds = changelogIds;
    return this;
  }

  public IssueChangelogIds addChangelogIdsItem(Long changelogIdsItem) {
    if (this.changelogIds == null) {
      this.changelogIds = new LinkedHashSet<>();
    }
    this.changelogIds.add(changelogIdsItem);
    return this;
  }

  /**
   * The list of changelog IDs.
   * @return changelogIds
  */
  @NotNull 
  @Schema(name = "changelogIds", description = "The list of changelog IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("changelogIds")
  public Set<Long> getChangelogIds() {
    return changelogIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setChangelogIds(Set<Long> changelogIds) {
    this.changelogIds = changelogIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueChangelogIds issueChangelogIds = (IssueChangelogIds) o;
    return Objects.equals(this.changelogIds, issueChangelogIds.changelogIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changelogIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueChangelogIds {\n");
    sb.append("    changelogIds: ").append(toIndentedString(changelogIds)).append("\n");
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

