package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This object is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it defines and reports on the type of link between the issues. Find a list of issue link types with [Get issue link types](#api-rest-api-3-issueLinkType-get).  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it defines and reports on issue link types.
 */

@Schema(name = "IssueLinkType", description = "This object is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it defines and reports on the type of link between the issues. Find a list of issue link types with [Get issue link types](#api-rest-api-3-issueLinkType-get).  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it defines and reports on issue link types.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueLinkType {

  private String id;

  private String inward;

  private String name;

  private String outward;

  private URI self;

  public IssueLinkType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue link type and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is the type of issue link. Required on create when `name` isn't provided. Otherwise, read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is read only.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the issue link type and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is the type of issue link. Required on create when `name` isn't provided. Otherwise, read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is read only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IssueLinkType inward(String inward) {
    this.inward = inward;
    return this;
  }

  /**
   * The description of the issue link type inward link and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
   * @return inward
  */
  
  @Schema(name = "inward", description = "The description of the issue link type inward link and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inward")
  public String getInward() {
    return inward;
  }

  public void setInward(String inward) {
    this.inward = inward;
  }

  public IssueLinkType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue link type and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is the type of issue link. Required on create when `id` isn't provided. Otherwise, read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the issue link type and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is the type of issue link. Required on create when `id` isn't provided. Otherwise, read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IssueLinkType outward(String outward) {
    this.outward = outward;
    return this;
  }

  /**
   * The description of the issue link type outward link and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
   * @return outward
  */
  
  @Schema(name = "outward", description = "The description of the issue link type outward link and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outward")
  public String getOutward() {
    return outward;
  }

  public void setOutward(String outward) {
    this.outward = outward;
  }

  public IssueLinkType self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the issue link type. Read only.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the issue link type. Read only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLinkType issueLinkType = (IssueLinkType) o;
    return Objects.equals(this.id, issueLinkType.id) &&
        Objects.equals(this.inward, issueLinkType.inward) &&
        Objects.equals(this.name, issueLinkType.name) &&
        Objects.equals(this.outward, issueLinkType.outward) &&
        Objects.equals(this.self, issueLinkType.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inward, name, outward, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLinkType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inward: ").append(toIndentedString(inward)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outward: ").append(toIndentedString(outward)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

