package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DateRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Service
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class Service {

  private Boolean active;

  private String coverage;

  @Valid
  private List<@Valid DateRange> dateRanges = new ArrayList<>();

  private Boolean _default;

  private String defaultLanguage;

  private String id;

  private String region;

  private String shortTitle;

  private String title;

  private String type;

  public Service() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Service(Boolean active, String coverage, List<@Valid DateRange> dateRanges, Boolean _default, String defaultLanguage, String id, String region, String shortTitle, String title, String type) {
    this.active = active;
    this.coverage = coverage;
    this.dateRanges = dateRanges;
    this._default = _default;
    this.defaultLanguage = defaultLanguage;
    this.id = id;
    this.region = region;
    this.shortTitle = shortTitle;
    this.title = title;
    this.type = type;
  }

  public Service active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  @NotNull 
  @Schema(name = "active", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Service coverage(String coverage) {
    this.coverage = coverage;
    return this;
  }

  /**
   * Get coverage
   * @return coverage
  */
  @NotNull 
  @Schema(name = "coverage", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("coverage")
  public String getCoverage() {
    return coverage;
  }

  public void setCoverage(String coverage) {
    this.coverage = coverage;
  }

  public Service dateRanges(List<@Valid DateRange> dateRanges) {
    this.dateRanges = dateRanges;
    return this;
  }

  public Service addDateRangesItem(DateRange dateRangesItem) {
    if (this.dateRanges == null) {
      this.dateRanges = new ArrayList<>();
    }
    this.dateRanges.add(dateRangesItem);
    return this;
  }

  /**
   * Get dateRanges
   * @return dateRanges
  */
  @NotNull @Valid 
  @Schema(name = "date_ranges", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date_ranges")
  public List<@Valid DateRange> getDateRanges() {
    return dateRanges;
  }

  public void setDateRanges(List<@Valid DateRange> dateRanges) {
    this.dateRanges = dateRanges;
  }

  public Service _default(Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
  */
  @NotNull 
  @Schema(name = "default", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public Service defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  /**
   * Get defaultLanguage
   * @return defaultLanguage
  */
  @NotNull 
  @Schema(name = "default_language", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default_language")
  public String getDefaultLanguage() {
    return defaultLanguage;
  }

  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  public Service id(String id) {
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

  public Service region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
  @NotNull 
  @Schema(name = "region", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Service shortTitle(String shortTitle) {
    this.shortTitle = shortTitle;
    return this;
  }

  /**
   * Get shortTitle
   * @return shortTitle
  */
  @NotNull 
  @Schema(name = "short_title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("short_title")
  public String getShortTitle() {
    return shortTitle;
  }

  public void setShortTitle(String shortTitle) {
    this.shortTitle = shortTitle;
  }

  public Service title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Service type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.active, service.active) &&
        Objects.equals(this.coverage, service.coverage) &&
        Objects.equals(this.dateRanges, service.dateRanges) &&
        Objects.equals(this._default, service._default) &&
        Objects.equals(this.defaultLanguage, service.defaultLanguage) &&
        Objects.equals(this.id, service.id) &&
        Objects.equals(this.region, service.region) &&
        Objects.equals(this.shortTitle, service.shortTitle) &&
        Objects.equals(this.title, service.title) &&
        Objects.equals(this.type, service.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, coverage, dateRanges, _default, defaultLanguage, id, region, shortTitle, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    dateRanges: ").append(toIndentedString(dateRanges)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    shortTitle: ").append(toIndentedString(shortTitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

