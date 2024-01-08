package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChangeDetails;
import org.openapitools.model.ChangelogAuthor;
import org.openapitools.model.ChangelogHistoryMetadata;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A log of changes made to issue fields. Changelogs related to workflow associations are currently being deprecated.
 */

@Schema(name = "Changelog", description = "A log of changes made to issue fields. Changelogs related to workflow associations are currently being deprecated.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Changelog {

  private ChangelogAuthor author;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  private ChangelogHistoryMetadata historyMetadata;

  private String id;

  @Valid
  private List<@Valid ChangeDetails> items;

  public Changelog author(ChangelogAuthor author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public ChangelogAuthor getAuthor() {
    return author;
  }

  public void setAuthor(ChangelogAuthor author) {
    this.author = author;
  }

  public Changelog created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The date on which the change took place.
   * @return created
  */
  @Valid 
  @Schema(name = "created", accessMode = Schema.AccessMode.READ_ONLY, description = "The date on which the change took place.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Changelog historyMetadata(ChangelogHistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
    return this;
  }

  /**
   * Get historyMetadata
   * @return historyMetadata
  */
  @Valid 
  @Schema(name = "historyMetadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historyMetadata")
  public ChangelogHistoryMetadata getHistoryMetadata() {
    return historyMetadata;
  }

  public void setHistoryMetadata(ChangelogHistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
  }

  public Changelog id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the changelog.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the changelog.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Changelog items(List<@Valid ChangeDetails> items) {
    this.items = items;
    return this;
  }

  public Changelog addItemsItem(ChangeDetails itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * The list of items changed.
   * @return items
  */
  @Valid 
  @Schema(name = "items", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of items changed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid ChangeDetails> getItems() {
    return items;
  }

  public void setItems(List<@Valid ChangeDetails> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Changelog changelog = (Changelog) o;
    return Objects.equals(this.author, changelog.author) &&
        Objects.equals(this.created, changelog.created) &&
        Objects.equals(this.historyMetadata, changelog.historyMetadata) &&
        Objects.equals(this.id, changelog.id) &&
        Objects.equals(this.items, changelog.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, created, historyMetadata, id, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Changelog {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    historyMetadata: ").append(toIndentedString(historyMetadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

