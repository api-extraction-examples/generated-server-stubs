package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CategorySummary;
import org.openapitools.model.Contact;
import org.openapitools.model.DateRange;
import org.openapitools.model.Service;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Network
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class Network {

  private Boolean active;

  @Valid
  private List<@Valid Contact> contacts = new ArrayList<>();

  @Valid
  private List<@Valid DateRange> dateRanges = new ArrayList<>();

  private String group;

  private String id;

  private Boolean international;

  private String key;

  private Boolean preset;

  @Valid
  private List<@Valid CategorySummary> promotedCategorySummaries;

  @Valid
  private List<@Valid Service> services = new ArrayList<>();

  private String shortTitle;

  private Integer sort;

  private String title;

  private String type;

  public Network() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Network(Boolean active, List<@Valid Contact> contacts, List<@Valid DateRange> dateRanges, String group, String id, Boolean international, String key, Boolean preset, List<@Valid Service> services, String shortTitle, Integer sort, String title, String type) {
    this.active = active;
    this.contacts = contacts;
    this.dateRanges = dateRanges;
    this.group = group;
    this.id = id;
    this.international = international;
    this.key = key;
    this.preset = preset;
    this.services = services;
    this.shortTitle = shortTitle;
    this.sort = sort;
    this.title = title;
    this.type = type;
  }

  public Network active(Boolean active) {
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

  public Network contacts(List<@Valid Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Network addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Get contacts
   * @return contacts
  */
  @NotNull @Valid 
  @Schema(name = "contacts", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contacts")
  public List<@Valid Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<@Valid Contact> contacts) {
    this.contacts = contacts;
  }

  public Network dateRanges(List<@Valid DateRange> dateRanges) {
    this.dateRanges = dateRanges;
    return this;
  }

  public Network addDateRangesItem(DateRange dateRangesItem) {
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

  public Network group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
  @NotNull 
  @Schema(name = "group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public Network id(String id) {
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

  public Network international(Boolean international) {
    this.international = international;
    return this;
  }

  /**
   * Get international
   * @return international
  */
  @NotNull 
  @Schema(name = "international", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("international")
  public Boolean getInternational() {
    return international;
  }

  public void setInternational(Boolean international) {
    this.international = international;
  }

  public Network key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  @NotNull 
  @Schema(name = "key", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Network preset(Boolean preset) {
    this.preset = preset;
    return this;
  }

  /**
   * Get preset
   * @return preset
  */
  @NotNull 
  @Schema(name = "preset", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("preset")
  public Boolean getPreset() {
    return preset;
  }

  public void setPreset(Boolean preset) {
    this.preset = preset;
  }

  public Network promotedCategorySummaries(List<@Valid CategorySummary> promotedCategorySummaries) {
    this.promotedCategorySummaries = promotedCategorySummaries;
    return this;
  }

  public Network addPromotedCategorySummariesItem(CategorySummary promotedCategorySummariesItem) {
    if (this.promotedCategorySummaries == null) {
      this.promotedCategorySummaries = new ArrayList<>();
    }
    this.promotedCategorySummaries.add(promotedCategorySummariesItem);
    return this;
  }

  /**
   * Get promotedCategorySummaries
   * @return promotedCategorySummaries
  */
  @Valid 
  @Schema(name = "promoted_category_summaries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promoted_category_summaries")
  public List<@Valid CategorySummary> getPromotedCategorySummaries() {
    return promotedCategorySummaries;
  }

  public void setPromotedCategorySummaries(List<@Valid CategorySummary> promotedCategorySummaries) {
    this.promotedCategorySummaries = promotedCategorySummaries;
  }

  public Network services(List<@Valid Service> services) {
    this.services = services;
    return this;
  }

  public Network addServicesItem(Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Get services
   * @return services
  */
  @NotNull @Valid 
  @Schema(name = "services", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("services")
  public List<@Valid Service> getServices() {
    return services;
  }

  public void setServices(List<@Valid Service> services) {
    this.services = services;
  }

  public Network shortTitle(String shortTitle) {
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

  public Network sort(Integer sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  @NotNull 
  @Schema(name = "sort", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sort")
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public Network title(String title) {
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

  public Network type(String type) {
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
    Network network = (Network) o;
    return Objects.equals(this.active, network.active) &&
        Objects.equals(this.contacts, network.contacts) &&
        Objects.equals(this.dateRanges, network.dateRanges) &&
        Objects.equals(this.group, network.group) &&
        Objects.equals(this.id, network.id) &&
        Objects.equals(this.international, network.international) &&
        Objects.equals(this.key, network.key) &&
        Objects.equals(this.preset, network.preset) &&
        Objects.equals(this.promotedCategorySummaries, network.promotedCategorySummaries) &&
        Objects.equals(this.services, network.services) &&
        Objects.equals(this.shortTitle, network.shortTitle) &&
        Objects.equals(this.sort, network.sort) &&
        Objects.equals(this.title, network.title) &&
        Objects.equals(this.type, network.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, contacts, dateRanges, group, id, international, key, preset, promotedCategorySummaries, services, shortTitle, sort, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    dateRanges: ").append(toIndentedString(dateRanges)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    international: ").append(toIndentedString(international)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
    sb.append("    promotedCategorySummaries: ").append(toIndentedString(promotedCategorySummaries)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    shortTitle: ").append(toIndentedString(shortTitle)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

