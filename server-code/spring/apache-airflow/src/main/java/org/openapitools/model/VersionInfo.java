package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Version information.
 */

@Schema(name = "VersionInfo", description = "Version information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class VersionInfo {

  private JsonNullable<String> gitVersion = JsonNullable.<String>undefined();

  private String version;

  public VersionInfo gitVersion(String gitVersion) {
    this.gitVersion = JsonNullable.of(gitVersion);
    return this;
  }

  /**
   * The git version (including git commit hash)
   * @return gitVersion
  */
  
  @Schema(name = "git_version", description = "The git version (including git commit hash)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("git_version")
  public JsonNullable<String> getGitVersion() {
    return gitVersion;
  }

  public void setGitVersion(JsonNullable<String> gitVersion) {
    this.gitVersion = gitVersion;
  }

  public VersionInfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of Airflow
   * @return version
  */
  
  @Schema(name = "version", description = "The version of Airflow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
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
    return equalsNullable(this.gitVersion, versionInfo.gitVersion) &&
        Objects.equals(this.version, versionInfo.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(gitVersion), version);
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
    sb.append("    gitVersion: ").append(toIndentedString(gitVersion)).append("\n");
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

