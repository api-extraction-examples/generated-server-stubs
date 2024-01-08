package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CommentEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CommentsCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class CommentsCollection {

  private Integer count;

  @Valid
  private List<@Valid CommentEntry> data;

  public CommentsCollection count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Nember of comments available, data does not necessary contain all comments
   * @return count
  */
  
  @Schema(name = "count", description = "Nember of comments available, data does not necessary contain all comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CommentsCollection data(List<@Valid CommentEntry> data) {
    this.data = data;
    return this;
  }

  public CommentsCollection addDataItem(CommentEntry dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Collection of comment entries; **warning:** deprecated for Apps [created on or after Nov 17, 2015](http://instagram.com/developer/changelog/)
   * @return data
  */
  @Valid 
  @Schema(name = "data", description = "Collection of comment entries; **warning:** deprecated for Apps [created on or after Nov 17, 2015](http://instagram.com/developer/changelog/)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid CommentEntry> getData() {
    return data;
  }

  public void setData(List<@Valid CommentEntry> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentsCollection commentsCollection = (CommentsCollection) o;
    return Objects.equals(this.count, commentsCollection.count) &&
        Objects.equals(this.data, commentsCollection.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentsCollection {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

