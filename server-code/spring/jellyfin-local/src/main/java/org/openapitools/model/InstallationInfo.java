package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.UUID;
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
 * Class InstallationInfo.
 */

@Schema(name = "InstallationInfo", description = "Class InstallationInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class InstallationInfo {

  private JsonNullable<String> changelog = JsonNullable.<String>undefined();

  private JsonNullable<String> checksum = JsonNullable.<String>undefined();

  private UUID guid;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> sourceUrl = JsonNullable.<String>undefined();

  private Version version;

  public InstallationInfo changelog(String changelog) {
    this.changelog = JsonNullable.of(changelog);
    return this;
  }

  /**
   * Gets or sets the changelog for this version.
   * @return changelog
  */
  
  @Schema(name = "Changelog", description = "Gets or sets the changelog for this version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Changelog")
  public JsonNullable<String> getChangelog() {
    return changelog;
  }

  public void setChangelog(JsonNullable<String> changelog) {
    this.changelog = changelog;
  }

  public InstallationInfo checksum(String checksum) {
    this.checksum = JsonNullable.of(checksum);
    return this;
  }

  /**
   * Gets or sets a checksum for the binary.
   * @return checksum
  */
  
  @Schema(name = "Checksum", description = "Gets or sets a checksum for the binary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Checksum")
  public JsonNullable<String> getChecksum() {
    return checksum;
  }

  public void setChecksum(JsonNullable<String> checksum) {
    this.checksum = checksum;
  }

  public InstallationInfo guid(UUID guid) {
    this.guid = guid;
    return this;
  }

  /**
   * Gets or sets the Id.
   * @return guid
  */
  @Valid 
  @Schema(name = "Guid", description = "Gets or sets the Id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Guid")
  public UUID getGuid() {
    return guid;
  }

  public void setGuid(UUID guid) {
    this.guid = guid;
  }

  public InstallationInfo name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public InstallationInfo sourceUrl(String sourceUrl) {
    this.sourceUrl = JsonNullable.of(sourceUrl);
    return this;
  }

  /**
   * Gets or sets the source URL.
   * @return sourceUrl
  */
  
  @Schema(name = "SourceUrl", description = "Gets or sets the source URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SourceUrl")
  public JsonNullable<String> getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(JsonNullable<String> sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public InstallationInfo version(Version version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @Valid 
  @Schema(name = "Version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Version")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
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
    InstallationInfo installationInfo = (InstallationInfo) o;
    return equalsNullable(this.changelog, installationInfo.changelog) &&
        equalsNullable(this.checksum, installationInfo.checksum) &&
        Objects.equals(this.guid, installationInfo.guid) &&
        equalsNullable(this.name, installationInfo.name) &&
        equalsNullable(this.sourceUrl, installationInfo.sourceUrl) &&
        Objects.equals(this.version, installationInfo.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(changelog), hashCodeNullable(checksum), guid, hashCodeNullable(name), hashCodeNullable(sourceUrl), version);
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
    sb.append("class InstallationInfo {\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
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

