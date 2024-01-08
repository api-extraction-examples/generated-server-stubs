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
 * StreamUsageSeries
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class StreamUsageSeries {

  private Long _0;

  private Long time;

  public StreamUsageSeries _0(Long _0) {
    this._0 = _0;
    return this;
  }

  /**
   * A key corresponding to a time series data point.
   * @return _0
  */
  
  @Schema(name = "0", example = "0", description = "A key corresponding to a time series data point.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("0")
  public Long get0() {
    return _0;
  }

  public void set0(Long _0) {
    this._0 = _0;
  }

  public StreamUsageSeries time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the creation time of this flag.
   * @return time
  */
  
  @Schema(name = "time", example = "1551740400000", description = "A unix epoch time in milliseconds specifying the creation time of this flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamUsageSeries streamUsageSeries = (StreamUsageSeries) o;
    return Objects.equals(this._0, streamUsageSeries._0) &&
        Objects.equals(this.time, streamUsageSeries.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_0, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamUsageSeries {\n");
    sb.append("    _0: ").append(toIndentedString(_0)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

