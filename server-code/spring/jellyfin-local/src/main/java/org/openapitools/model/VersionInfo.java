package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Version;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Defines the MediaBrowser.Model.Updates.VersionInfo class.
 */

@Schema(name = "VersionInfo", description = "Defines the MediaBrowser.Model.Updates.VersionInfo class.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class VersionInfo {

  private Version versionNumber;

  private JsonNullable<String> changelog = JsonNullable.<String>undefined();

  private JsonNullable<String> checksum = JsonNullable.<String>undefined();

  private JsonNullable<String> repositoryName = JsonNullable.<String>undefined();

  private JsonNullable<String> repositoryUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> sourceUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> targetAbi = JsonNullable.<String>undefined();

  private JsonNullable<String> timestamp = JsonNullable.<String>undefined();

  private JsonNullable<String> version = JsonNullable.<String>undefined();

  public VersionInfo versionNumber(Version versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * Get versionNumber
   * @return versionNumber
  */
  @Valid 
  @Schema(name = "VersionNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VersionNumber")
  public Version getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Version versionNumber) {
    this.versionNumber = versionNumber;
  }

  public VersionInfo changelog(String changelog) {
    this.changelog = JsonNullable.of(changelog);
    return this;
  }

  /**
   * Gets or sets the changelog for this version.
   * @return changelog
  */
  
  @Schema(name = "changelog", description = "Gets or sets the changelog for this version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changelog")
  public JsonNullable<String> getChangelog() {
    return changelog;
  }

  public void setChangelog(JsonNullable<String> changelog) {
    this.changelog = changelog;
  }

  public VersionInfo checksum(String checksum) {
    this.checksum = JsonNullable.of(checksum);
    return this;
  }

  /**
   * Gets or sets a checksum for the binary.
   * @return checksum
  */
  
  @Schema(name = "checksum", description = "Gets or sets a checksum for the binary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("checksum")
  public JsonNullable<String> getChecksum() {
    return checksum;
  }

  public void setChecksum(JsonNullable<String> checksum) {
    this.checksum = checksum;
  }

  public VersionInfo repositoryName(String repositoryName) {
    this.repositoryName = JsonNullable.of(repositoryName);
    return this;
  }

  /**
   * Gets or sets the repository name.
   * @return repositoryName
  */
  
  @Schema(name = "repositoryName", description = "Gets or sets the repository name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repositoryName")
  public JsonNullable<String> getRepositoryName() {
    return repositoryName;
  }

  public void setRepositoryName(JsonNullable<String> repositoryName) {
    this.repositoryName = repositoryName;
  }

  public VersionInfo repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = JsonNullable.of(repositoryUrl);
    return this;
  }

  /**
   * Gets or sets the repository url.
   * @return repositoryUrl
  */
  
  @Schema(name = "repositoryUrl", description = "Gets or sets the repository url.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repositoryUrl")
  public JsonNullable<String> getRepositoryUrl() {
    return repositoryUrl;
  }

  public void setRepositoryUrl(JsonNullable<String> repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }

  public VersionInfo sourceUrl(String sourceUrl) {
    this.sourceUrl = JsonNullable.of(sourceUrl);
    return this;
  }

  /**
   * Gets or sets the source URL.
   * @return sourceUrl
  */
  
  @Schema(name = "sourceUrl", description = "Gets or sets the source URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceUrl")
  public JsonNullable<String> getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(JsonNullable<String> sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public VersionInfo targetAbi(String targetAbi) {
    this.targetAbi = JsonNullable.of(targetAbi);
    return this;
  }

  /**
   * Gets or sets the ABI that this version was built against.
   * @return targetAbi
  */
  
  @Schema(name = "targetAbi", description = "Gets or sets the ABI that this version was built against.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetAbi")
  public JsonNullable<String> getTargetAbi() {
    return targetAbi;
  }

  public void setTargetAbi(JsonNullable<String> targetAbi) {
    this.targetAbi = targetAbi;
  }

  public VersionInfo timestamp(String timestamp) {
    this.timestamp = JsonNullable.of(timestamp);
    return this;
  }

  /**
   * Gets or sets a timestamp of when the binary was built.
   * @return timestamp
  */
  
  @Schema(name = "timestamp", description = "Gets or sets a timestamp of when the binary was built.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public JsonNullable<String> getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(JsonNullable<String> timestamp) {
    this.timestamp = timestamp;
  }

  public VersionInfo version(String version) {
    this.version = JsonNullable.of(version);
    return this;
  }

  /**
   * Gets or sets the version.
   * @return version
  */
  
  @Schema(name = "version", description = "Gets or sets the version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public JsonNullable<String> getVersion() {
    return version;
  }

  public void setVersion(JsonNullable<String> version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionInfo versionInfo = (VersionInfo) o;
    return Objects.equals(this.versionNumber, versionInfo.versionNumber) &&
        equalsNullable(this.changelog, versionInfo.changelog) &&
        equalsNullable(this.checksum, versionInfo.checksum) &&
        equalsNullable(this.repositoryName, versionInfo.repositoryName) &&
        equalsNullable(this.repositoryUrl, versionInfo.repositoryUrl) &&
        equalsNullable(this.sourceUrl, versionInfo.sourceUrl) &&
        equalsNullable(this.targetAbi, versionInfo.targetAbi) &&
        equalsNullable(this.timestamp, versionInfo.timestamp) &&
        equalsNullable(this.version, versionInfo.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, hashCodeNullable(changelog), hashCodeNullable(checksum), hashCodeNullable(repositoryName), hashCodeNullable(repositoryUrl), hashCodeNullable(sourceUrl), hashCodeNullable(targetAbi), hashCodeNullable(timestamp), hashCodeNullable(version));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionInfo {\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    targetAbi: ").append(toIndentedString(targetAbi)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

