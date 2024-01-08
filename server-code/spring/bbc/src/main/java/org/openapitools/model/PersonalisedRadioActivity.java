package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.MetaData;
import org.openapitools.model.ProgrammeSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedRadioActivity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedRadioActivity {

  private String action;

  private String activity;

  private String addedAt;

  private ProgrammeSummary data;

  private String domain;

  private String id;

  private MetaData metadata;

  private String type;

  private String uasType;

  private String urn;

  public PersonalisedRadioActivity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedRadioActivity(String action, String activity, String addedAt, ProgrammeSummary data, String domain, String id, MetaData metadata, String type, String uasType, String urn) {
    this.action = action;
    this.activity = activity;
    this.addedAt = addedAt;
    this.data = data;
    this.domain = domain;
    this.id = id;
    this.metadata = metadata;
    this.type = type;
    this.uasType = uasType;
    this.urn = urn;
  }

  public PersonalisedRadioActivity action(String action) {
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

  public PersonalisedRadioActivity activity(String activity) {
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

  public PersonalisedRadioActivity addedAt(String addedAt) {
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

  public PersonalisedRadioActivity data(ProgrammeSummary data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public ProgrammeSummary getData() {
    return data;
  }

  public void setData(ProgrammeSummary data) {
    this.data = data;
  }

  public PersonalisedRadioActivity domain(String domain) {
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

  public PersonalisedRadioActivity id(String id) {
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

  public PersonalisedRadioActivity metadata(MetaData metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @NotNull @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("metadata")
  public MetaData getMetadata() {
    return metadata;
  }

  public void setMetadata(MetaData metadata) {
    this.metadata = metadata;
  }

  public PersonalisedRadioActivity type(String type) {
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

  public PersonalisedRadioActivity uasType(String uasType) {
    this.uasType = uasType;
    return this;
  }

  /**
   * Get uasType
   * @return uasType
  */
  @NotNull 
  @Schema(name = "uas_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uas_type")
  public String getUasType() {
    return uasType;
  }

  public void setUasType(String uasType) {
    this.uasType = uasType;
  }

  public PersonalisedRadioActivity urn(String urn) {
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
    PersonalisedRadioActivity personalisedRadioActivity = (PersonalisedRadioActivity) o;
    return Objects.equals(this.action, personalisedRadioActivity.action) &&
        Objects.equals(this.activity, personalisedRadioActivity.activity) &&
        Objects.equals(this.addedAt, personalisedRadioActivity.addedAt) &&
        Objects.equals(this.data, personalisedRadioActivity.data) &&
        Objects.equals(this.domain, personalisedRadioActivity.domain) &&
        Objects.equals(this.id, personalisedRadioActivity.id) &&
        Objects.equals(this.metadata, personalisedRadioActivity.metadata) &&
        Objects.equals(this.type, personalisedRadioActivity.type) &&
        Objects.equals(this.uasType, personalisedRadioActivity.uasType) &&
        Objects.equals(this.urn, personalisedRadioActivity.urn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, activity, addedAt, data, domain, id, metadata, type, uasType, urn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedRadioActivity {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uasType: ").append(toIndentedString(uasType)).append("\n");
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

