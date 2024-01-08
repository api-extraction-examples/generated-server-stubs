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
 * MusicPopularityArtist
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MusicPopularityArtist {

  private String gid;

  private String id;

  private String imagePid;

  private String name;

  private Integer score;

  private String sortName;

  public MusicPopularityArtist() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MusicPopularityArtist(String gid, String id, String imagePid, String name, Integer score, String sortName) {
    this.gid = gid;
    this.id = id;
    this.imagePid = imagePid;
    this.name = name;
    this.score = score;
    this.sortName = sortName;
  }

  public MusicPopularityArtist gid(String gid) {
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

  public MusicPopularityArtist id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MusicPopularityArtist imagePid(String imagePid) {
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

  public MusicPopularityArtist name(String name) {
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

  public MusicPopularityArtist score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  */
  @NotNull 
  @Schema(name = "score", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public MusicPopularityArtist sortName(String sortName) {
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
    MusicPopularityArtist musicPopularityArtist = (MusicPopularityArtist) o;
    return Objects.equals(this.gid, musicPopularityArtist.gid) &&
        Objects.equals(this.id, musicPopularityArtist.id) &&
        Objects.equals(this.imagePid, musicPopularityArtist.imagePid) &&
        Objects.equals(this.name, musicPopularityArtist.name) &&
        Objects.equals(this.score, musicPopularityArtist.score) &&
        Objects.equals(this.sortName, musicPopularityArtist.sortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, id, imagePid, name, score, sortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicPopularityArtist {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imagePid: ").append(toIndentedString(imagePid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

