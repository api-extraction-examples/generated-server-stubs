package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.History;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a hashtag used within the content of a status.
 */

@Schema(name = "Tag", description = "Represents a hashtag used within the content of a status.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Tag {

  @Valid
  private List<@Valid History> history;

  private String name;

  private String url;

  public Tag() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Tag(String name, String url) {
    this.name = name;
    this.url = url;
  }

  public Tag history(List<@Valid History> history) {
    this.history = history;
    return this;
  }

  public Tag addHistoryItem(History historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * Usage statistics for given days.
   * @return history
  */
  @Valid 
  @Schema(name = "history", description = "Usage statistics for given days.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("history")
  public List<@Valid History> getHistory() {
    return history;
  }

  public void setHistory(List<@Valid History> history) {
    this.history = history;
  }

  public Tag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The value of the hashtag after the `#` sign.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The value of the hashtag after the `#` sign.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A link to the hashtag on the instance.
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "A link to the hashtag on the instance.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.history, tag.history) &&
        Objects.equals(this.name, tag.name) &&
        Objects.equals(this.url, tag.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

