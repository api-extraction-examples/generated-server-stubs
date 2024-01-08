package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MusicTrackArtist
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MusicTrackArtist {

  private String gid;

  private String imagePid;

  private String name;

  private String role;

  private String sortName;

  public MusicTrackArtist() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MusicTrackArtist(String gid, String imagePid, String name, String role, String sortName) {
    this.gid = gid;
    this.imagePid = imagePid;
    this.name = name;
    this.role = role;
    this.sortName = sortName;
  }

  public MusicTrackArtist gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Get gid
   * @return gid
  */
  @NotNull 
  @Schema(name = "gid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public MusicTrackArtist imagePid(String imagePid) {
    this.imagePid = imagePid;
    return this;
  }

  /**
   * Get imagePid
   * @return imagePid
  */
  @NotNull 
  @Schema(name = "imagePid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("imagePid")
  public String getImagePid() {
    return imagePid;
  }

  public void setImagePid(String imagePid) {
    this.imagePid = imagePid;
  }

  public MusicTrackArtist name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MusicTrackArtist role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @NotNull 
  @Schema(name = "role", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public MusicTrackArtist sortName(String sortName) {
    this.sortName = sortName;
    return this;
  }

  /**
   * Get sortName
   * @return sortName
  */
  @NotNull 
  @Schema(name = "sortName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sortName")
  public String getSortName() {
    return sortName;
  }

  public void setSortName(String sortName) {
    this.sortName = sortName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MusicTrackArtist musicTrackArtist = (MusicTrackArtist) o;
    return Objects.equals(this.gid, musicTrackArtist.gid) &&
        Objects.equals(this.imagePid, musicTrackArtist.imagePid) &&
        Objects.equals(this.name, musicTrackArtist.name) &&
        Objects.equals(this.role, musicTrackArtist.role) &&
        Objects.equals(this.sortName, musicTrackArtist.sortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, imagePid, name, role, sortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicTrackArtist {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    imagePid: ").append(toIndentedString(imagePid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
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

