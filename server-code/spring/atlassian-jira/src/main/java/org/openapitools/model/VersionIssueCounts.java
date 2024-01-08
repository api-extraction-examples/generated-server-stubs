package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VersionUsageInCustomField;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Various counts of issues within a version.
 */

@Schema(name = "VersionIssueCounts", description = "Various counts of issues within a version.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class VersionIssueCounts {

  @Valid
  private List<@Valid VersionUsageInCustomField> customFieldUsage;

  private Long issueCountWithCustomFieldsShowingVersion;

  private Long issuesAffectedCount;

  private Long issuesFixedCount;

  private URI self;

  public VersionIssueCounts customFieldUsage(List<@Valid VersionUsageInCustomField> customFieldUsage) {
    this.customFieldUsage = customFieldUsage;
    return this;
  }

  public VersionIssueCounts addCustomFieldUsageItem(VersionUsageInCustomField customFieldUsageItem) {
    if (this.customFieldUsage == null) {
      this.customFieldUsage = new ArrayList<>();
    }
    this.customFieldUsage.add(customFieldUsageItem);
    return this;
  }

  /**
   * List of custom fields using the version.
   * @return customFieldUsage
  */
  @Valid 
  @Schema(name = "customFieldUsage", accessMode = Schema.AccessMode.READ_ONLY, description = "List of custom fields using the version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customFieldUsage")
  public List<@Valid VersionUsageInCustomField> getCustomFieldUsage() {
    return customFieldUsage;
  }

  public void setCustomFieldUsage(List<@Valid VersionUsageInCustomField> customFieldUsage) {
    this.customFieldUsage = customFieldUsage;
  }

  public VersionIssueCounts issueCountWithCustomFieldsShowingVersion(Long issueCountWithCustomFieldsShowingVersion) {
    this.issueCountWithCustomFieldsShowingVersion = issueCountWithCustomFieldsShowingVersion;
    return this;
  }

  /**
   * Count of issues where a version custom field is set to the version.
   * @return issueCountWithCustomFieldsShowingVersion
  */
  
  @Schema(name = "issueCountWithCustomFieldsShowingVersion", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues where a version custom field is set to the version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueCountWithCustomFieldsShowingVersion")
  public Long getIssueCountWithCustomFieldsShowingVersion() {
    return issueCountWithCustomFieldsShowingVersion;
  }

  public void setIssueCountWithCustomFieldsShowingVersion(Long issueCountWithCustomFieldsShowingVersion) {
    this.issueCountWithCustomFieldsShowingVersion = issueCountWithCustomFieldsShowingVersion;
  }

  public VersionIssueCounts issuesAffectedCount(Long issuesAffectedCount) {
    this.issuesAffectedCount = issuesAffectedCount;
    return this;
  }

  /**
   * Count of issues where the `affectedVersion` is set to the version.
   * @return issuesAffectedCount
  */
  
  @Schema(name = "issuesAffectedCount", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues where the `affectedVersion` is set to the version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuesAffectedCount")
  public Long getIssuesAffectedCount() {
    return issuesAffectedCount;
  }

  public void setIssuesAffectedCount(Long issuesAffectedCount) {
    this.issuesAffectedCount = issuesAffectedCount;
  }

  public VersionIssueCounts issuesFixedCount(Long issuesFixedCount) {
    this.issuesFixedCount = issuesFixedCount;
    return this;
  }

  /**
   * Count of issues where the `fixVersion` is set to the version.
   * @return issuesFixedCount
  */
  
  @Schema(name = "issuesFixedCount", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues where the `fixVersion` is set to the version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuesFixedCount")
  public Long getIssuesFixedCount() {
    return issuesFixedCount;
  }

  public void setIssuesFixedCount(Long issuesFixedCount) {
    this.issuesFixedCount = issuesFixedCount;
  }

  public VersionIssueCounts self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of these count details.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of these count details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionIssueCounts versionIssueCounts = (VersionIssueCounts) o;
    return Objects.equals(this.customFieldUsage, versionIssueCounts.customFieldUsage) &&
        Objects.equals(this.issueCountWithCustomFieldsShowingVersion, versionIssueCounts.issueCountWithCustomFieldsShowingVersion) &&
        Objects.equals(this.issuesAffectedCount, versionIssueCounts.issuesAffectedCount) &&
        Objects.equals(this.issuesFixedCount, versionIssueCounts.issuesFixedCount) &&
        Objects.equals(this.self, versionIssueCounts.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldUsage, issueCountWithCustomFieldsShowingVersion, issuesAffectedCount, issuesFixedCount, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionIssueCounts {\n");
    sb.append("    customFieldUsage: ").append(toIndentedString(customFieldUsage)).append("\n");
    sb.append("    issueCountWithCustomFieldsShowingVersion: ").append(toIndentedString(issueCountWithCustomFieldsShowingVersion)).append("\n");
    sb.append("    issuesAffectedCount: ").append(toIndentedString(issuesAffectedCount)).append("\n");
    sb.append("    issuesFixedCount: ").append(toIndentedString(issuesFixedCount)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

