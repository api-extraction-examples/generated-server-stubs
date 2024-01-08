package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PersonalisedMusicData;
import org.openapitools.model.PersonalisedMusicMetaData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedMusicActivity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedMusicActivity {

  private String action;

  private String activity;

  private String addedAt;

  @Valid
  private List<@Valid PersonalisedMusicData> data = new ArrayList<>();

  private String domain;

  private String id;

  private PersonalisedMusicMetaData metaData;

  private String type;

  private String urn;

  public PersonalisedMusicActivity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedMusicActivity(String action, String activity, String addedAt, List<@Valid PersonalisedMusicData> data, String domain, String id, PersonalisedMusicMetaData metaData, String type, String urn) {
    this.action = action;
    this.activity = activity;
    this.addedAt = addedAt;
    this.data = data;
    this.domain = domain;
    this.id = id;
    this.metaData = metaData;
    this.type = type;
    this.urn = urn;
  }

  public PersonalisedMusicActivity action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */
  @NotNull 
  @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public PersonalisedMusicActivity activity(String activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Get activity
   * @return activity
  */
  @NotNull 
  @Schema(name = "activity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("activity")
  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  public PersonalisedMusicActivity addedAt(String addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  /**
   * Get addedAt
   * @return addedAt
  */
  @NotNull 
  @Schema(name = "added_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("added_at")
  public String getAddedAt() {
    return addedAt;
  }

  public void setAddedAt(String addedAt) {
    this.addedAt = addedAt;
  }

  public PersonalisedMusicActivity data(List<@Valid PersonalisedMusicData> data) {
    this.data = data;
    return this;
  }

  public PersonalisedMusicActivity addDataItem(PersonalisedMusicData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public List<@Valid PersonalisedMusicData> getData() {
    return data;
  }

  public void setData(List<@Valid PersonalisedMusicData> data) {
    this.data = data;
  }

  public PersonalisedMusicActivity domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
  */
  @NotNull 
  @Schema(name = "domain", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public PersonalisedMusicActivity id(String id) {
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

  public PersonalisedMusicActivity metaData(PersonalisedMusicMetaData metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Get metaData
   * @return metaData
  */
  @NotNull @Valid 
  @Schema(name = "meta_data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("meta_data")
  public PersonalisedMusicMetaData getMetaData() {
    return metaData;
  }

  public void setMetaData(PersonalisedMusicMetaData metaData) {
    this.metaData = metaData;
  }

  public PersonalisedMusicActivity type(String type) {
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

  public PersonalisedMusicActivity urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Get urn
   * @return urn
  */
  @NotNull 
  @Schema(name = "urn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("urn")
  public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalisedMusicActivity personalisedMusicActivity = (PersonalisedMusicActivity) o;
    return Objects.equals(this.action, personalisedMusicActivity.action) &&
        Objects.equals(this.activity, personalisedMusicActivity.activity) &&
        Objects.equals(this.addedAt, personalisedMusicActivity.addedAt) &&
        Objects.equals(this.data, personalisedMusicActivity.data) &&
        Objects.equals(this.domain, personalisedMusicActivity.domain) &&
        Objects.equals(this.id, personalisedMusicActivity.id) &&
        Objects.equals(this.metaData, personalisedMusicActivity.metaData) &&
        Objects.equals(this.type, personalisedMusicActivity.type) &&
        Objects.equals(this.urn, personalisedMusicActivity.urn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, activity, addedAt, data, domain, id, metaData, type, urn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedMusicActivity {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
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

