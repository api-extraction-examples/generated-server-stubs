package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.NetworkTitles;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NetworkSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class NetworkSummary {

  private Boolean active;

  private String group;

  private String id;

  private String key;

  private NetworkTitles titles;

  private String type;

  public NetworkSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NetworkSummary(Boolean active, String group, String id, String key, NetworkTitles titles, String type) {
    this.active = active;
    this.group = group;
    this.id = id;
    this.key = key;
    this.titles = titles;
    this.type = type;
  }

  public NetworkSummary active(Boolean active) {
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

  public NetworkSummary group(String group) {
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

  public NetworkSummary id(String id) {
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

  public NetworkSummary key(String key) {
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

  public NetworkSummary titles(NetworkTitles titles) {
    this.titles = titles;
    return this;
  }

  /**
   * Get titles
   * @return titles
  */
  @NotNull @Valid 
  @Schema(name = "titles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("titles")
  public NetworkTitles getTitles() {
    return titles;
  }

  public void setTitles(NetworkTitles titles) {
    this.titles = titles;
  }

  public NetworkSummary type(String type) {
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
    NetworkSummary networkSummary = (NetworkSummary) o;
    return Objects.equals(this.active, networkSummary.active) &&
        Objects.equals(this.group, networkSummary.group) &&
        Objects.equals(this.id, networkSummary.id) &&
        Objects.equals(this.key, networkSummary.key) &&
        Objects.equals(this.titles, networkSummary.titles) &&
        Objects.equals(this.type, networkSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, group, id, key, titles, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkSummary {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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

