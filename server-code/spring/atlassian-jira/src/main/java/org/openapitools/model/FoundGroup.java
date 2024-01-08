package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GroupLabel;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A group found in a search.
 */

@Schema(name = "FoundGroup", description = "A group found in a search.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FoundGroup {

  private String groupId;

  private String html;

  @Valid
  private List<@Valid GroupLabel> labels;

  private String name;

  public FoundGroup groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
   * @return groupId
  */
  
  @Schema(name = "groupId", description = "The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public FoundGroup html(String html) {
    this.html = html;
    return this;
  }

  /**
   * The group name with the matched query string highlighted with the HTML bold tag.
   * @return html
  */
  
  @Schema(name = "html", description = "The group name with the matched query string highlighted with the HTML bold tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public FoundGroup labels(List<@Valid GroupLabel> labels) {
    this.labels = labels;
    return this;
  }

  public FoundGroup addLabelsItem(GroupLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  @Valid 
  @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public List<@Valid GroupLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<@Valid GroupLabel> labels) {
    this.labels = labels;
  }

  public FoundGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the group. The name of a group is mutable, to reliably identify a group use ``groupId`.`
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the group. The name of a group is mutable, to reliably identify a group use ``groupId`.`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoundGroup foundGroup = (FoundGroup) o;
    return Objects.equals(this.groupId, foundGroup.groupId) &&
        Objects.equals(this.html, foundGroup.html) &&
        Objects.equals(this.labels, foundGroup.labels) &&
        Objects.equals(this.name, foundGroup.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, html, labels, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoundGroup {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

