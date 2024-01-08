package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Change the order of issue resolutions.
 */

@Schema(name = "ReorderIssueResolutionsRequest", description = "Change the order of issue resolutions.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ReorderIssueResolutionsRequest {

  private String after;

  @Valid
  private List<String> ids = new ArrayList<>();

  private String position;

  public ReorderIssueResolutionsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReorderIssueResolutionsRequest(List<String> ids) {
    this.ids = ids;
  }

  public ReorderIssueResolutionsRequest after(String after) {
    this.after = after;
    return this;
  }

  /**
   * The ID of the resolution. Required if `position` isn't provided.
   * @return after
  */
  
  @Schema(name = "after", description = "The ID of the resolution. Required if `position` isn't provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("after")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public ReorderIssueResolutionsRequest ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public ReorderIssueResolutionsRequest addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * The list of resolution IDs to be reordered. Cannot contain duplicates nor after ID.
   * @return ids
  */
  @NotNull 
  @Schema(name = "ids", description = "The list of resolution IDs to be reordered. Cannot contain duplicates nor after ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ids")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public ReorderIssueResolutionsRequest position(String position) {
    this.position = position;
    return this;
  }

  /**
   * The position for issue resolutions to be moved to. Required if `after` isn't provided.
   * @return position
  */
  
  @Schema(name = "position", description = "The position for issue resolutions to be moved to. Required if `after` isn't provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReorderIssueResolutionsRequest reorderIssueResolutionsRequest = (ReorderIssueResolutionsRequest) o;
    return Objects.equals(this.after, reorderIssueResolutionsRequest.after) &&
        Objects.equals(this.ids, reorderIssueResolutionsRequest.ids) &&
        Objects.equals(this.position, reorderIssueResolutionsRequest.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, ids, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReorderIssueResolutionsRequest {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

