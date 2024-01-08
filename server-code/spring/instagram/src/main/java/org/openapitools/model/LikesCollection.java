package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UserShortInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LikesCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class LikesCollection {

  private Integer count;

  @Valid
  private List<@Valid UserShortInfo> data;

  public LikesCollection count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Nember of likes available, data does not necessary contain all comments
   * @return count
  */
  
  @Schema(name = "count", description = "Nember of likes available, data does not necessary contain all comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public LikesCollection data(List<@Valid UserShortInfo> data) {
    this.data = data;
    return this;
  }

  public LikesCollection addDataItem(UserShortInfo dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Collection of users who liked; **warning:** deprecated for Apps [created on or after Nov 17, 2015](http://instagram.com/developer/changelog/)
   * @return data
  */
  @Valid 
  @Schema(name = "data", description = "Collection of users who liked; **warning:** deprecated for Apps [created on or after Nov 17, 2015](http://instagram.com/developer/changelog/)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid UserShortInfo> getData() {
    return data;
  }

  public void setData(List<@Valid UserShortInfo> data) {
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
    LikesCollection likesCollection = (LikesCollection) o;
    return Objects.equals(this.count, likesCollection.count) &&
        Objects.equals(this.data, likesCollection.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LikesCollection {\n");
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

