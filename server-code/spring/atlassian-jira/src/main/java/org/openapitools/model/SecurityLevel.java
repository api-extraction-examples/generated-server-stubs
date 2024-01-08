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
 * Details of an issue level security item.
 */

@Schema(name = "SecurityLevel", description = "Details of an issue level security item.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SecurityLevel {

  private String description;

  private String id;

  private Boolean isDefault;

  private String issueSecuritySchemeId;

  private String name;

  private String self;

  public SecurityLevel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue level security item.
   * @return description
  */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of the issue level security item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecurityLevel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue level security item.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue level security item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityLevel isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether the issue level security item is the default.
   * @return isDefault
  */
  
  @Schema(name = "isDefault", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the issue level security item is the default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SecurityLevel issueSecuritySchemeId(String issueSecuritySchemeId) {
    this.issueSecuritySchemeId = issueSecuritySchemeId;
    return this;
  }

  /**
   * The ID of the issue level security scheme.
   * @return issueSecuritySchemeId
  */
  
  @Schema(name = "issueSecuritySchemeId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue level security scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueSecuritySchemeId")
  public String getIssueSecuritySchemeId() {
    return issueSecuritySchemeId;
  }

  public void setIssueSecuritySchemeId(String issueSecuritySchemeId) {
    this.issueSecuritySchemeId = issueSecuritySchemeId;
  }

  public SecurityLevel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue level security item.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the issue level security item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityLevel self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the issue level security item.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the issue level security item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
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
    SecurityLevel securityLevel = (SecurityLevel) o;
    return Objects.equals(this.description, securityLevel.description) &&
        Objects.equals(this.id, securityLevel.id) &&
        Objects.equals(this.isDefault, securityLevel.isDefault) &&
        Objects.equals(this.issueSecuritySchemeId, securityLevel.issueSecuritySchemeId) &&
        Objects.equals(this.name, securityLevel.name) &&
        Objects.equals(this.self, securityLevel.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isDefault, issueSecuritySchemeId, name, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityLevel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    issueSecuritySchemeId: ").append(toIndentedString(issueSecuritySchemeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

