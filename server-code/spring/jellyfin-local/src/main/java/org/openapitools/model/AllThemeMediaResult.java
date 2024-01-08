package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ThemeMediaResult;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AllThemeMediaResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class AllThemeMediaResult {

  private ThemeMediaResult soundtrackSongsResult;

  private ThemeMediaResult themeSongsResult;

  private ThemeMediaResult themeVideosResult;

  public AllThemeMediaResult soundtrackSongsResult(ThemeMediaResult soundtrackSongsResult) {
    this.soundtrackSongsResult = soundtrackSongsResult;
    return this;
  }

  /**
   * Get soundtrackSongsResult
   * @return soundtrackSongsResult
  */
  @Valid 
  @Schema(name = "SoundtrackSongsResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SoundtrackSongsResult")
  public ThemeMediaResult getSoundtrackSongsResult() {
    return soundtrackSongsResult;
  }

  public void setSoundtrackSongsResult(ThemeMediaResult soundtrackSongsResult) {
    this.soundtrackSongsResult = soundtrackSongsResult;
  }

  public AllThemeMediaResult themeSongsResult(ThemeMediaResult themeSongsResult) {
    this.themeSongsResult = themeSongsResult;
    return this;
  }

  /**
   * Get themeSongsResult
   * @return themeSongsResult
  */
  @Valid 
  @Schema(name = "ThemeSongsResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ThemeSongsResult")
  public ThemeMediaResult getThemeSongsResult() {
    return themeSongsResult;
  }

  public void setThemeSongsResult(ThemeMediaResult themeSongsResult) {
    this.themeSongsResult = themeSongsResult;
  }

  public AllThemeMediaResult themeVideosResult(ThemeMediaResult themeVideosResult) {
    this.themeVideosResult = themeVideosResult;
    return this;
  }

  /**
   * Get themeVideosResult
   * @return themeVideosResult
  */
  @Valid 
  @Schema(name = "ThemeVideosResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ThemeVideosResult")
  public ThemeMediaResult getThemeVideosResult() {
    return themeVideosResult;
  }

  public void setThemeVideosResult(ThemeMediaResult themeVideosResult) {
    this.themeVideosResult = themeVideosResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllThemeMediaResult allThemeMediaResult = (AllThemeMediaResult) o;
    return Objects.equals(this.soundtrackSongsResult, allThemeMediaResult.soundtrackSongsResult) &&
        Objects.equals(this.themeSongsResult, allThemeMediaResult.themeSongsResult) &&
        Objects.equals(this.themeVideosResult, allThemeMediaResult.themeVideosResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soundtrackSongsResult, themeSongsResult, themeVideosResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllThemeMediaResult {\n");
    sb.append("    soundtrackSongsResult: ").append(toIndentedString(soundtrackSongsResult)).append("\n");
    sb.append("    themeSongsResult: ").append(toIndentedString(themeSongsResult)).append("\n");
    sb.append("    themeVideosResult: ").append(toIndentedString(themeVideosResult)).append("\n");
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

