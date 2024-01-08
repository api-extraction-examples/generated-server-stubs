package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.StreamUsageSeries;
import org.openapitools.model.UsageLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Usage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Usage {

  private UsageLinks links;

  @Valid
  private List<@Valid StreamUsageSeries> series;

  public Usage links(UsageLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public UsageLinks getLinks() {
    return links;
  }

  public void setLinks(UsageLinks links) {
    this.links = links;
  }

  public Usage series(List<@Valid StreamUsageSeries> series) {
    this.series = series;
    return this;
  }

  public Usage addSeriesItem(StreamUsageSeries seriesItem) {
    if (this.series == null) {
      this.series = new ArrayList<>();
    }
    this.series.add(seriesItem);
    return this;
  }

  /**
   * Get series
   * @return series
  */
  @Valid 
  @Schema(name = "series", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("series")
  public List<@Valid StreamUsageSeries> getSeries() {
    return series;
  }

  public void setSeries(List<@Valid StreamUsageSeries> series) {
    this.series = series;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usage usage = (Usage) o;
    return Objects.equals(this.links, usage.links) &&
        Objects.equals(this.series, usage.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usage {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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

