package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.SecurityLevelMemberHolder;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Issue security level member.
 */

@Schema(name = "SecurityLevelMember", description = "Issue security level member.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SecurityLevelMember {

  private SecurityLevelMemberHolder holder;

  private String id;

  private String issueSecurityLevelId;

  private String issueSecuritySchemeId;

  public SecurityLevelMember() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SecurityLevelMember(SecurityLevelMemberHolder holder, String id, String issueSecurityLevelId, String issueSecuritySchemeId) {
    this.holder = holder;
    this.id = id;
    this.issueSecurityLevelId = issueSecurityLevelId;
    this.issueSecuritySchemeId = issueSecuritySchemeId;
  }

  public SecurityLevelMember holder(SecurityLevelMemberHolder holder) {
    this.holder = holder;
    return this;
  }

  /**
   * Get holder
   * @return holder
  */
  @NotNull @Valid 
  @Schema(name = "holder", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("holder")
  public SecurityLevelMemberHolder getHolder() {
    return holder;
  }

  public void setHolder(SecurityLevelMemberHolder holder) {
    this.holder = holder;
  }

  public SecurityLevelMember id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue security level member.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue security level member.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityLevelMember issueSecurityLevelId(String issueSecurityLevelId) {
    this.issueSecurityLevelId = issueSecurityLevelId;
    return this;
  }

  /**
   * The ID of the issue security level.
   * @return issueSecurityLevelId
  */
  
  @Schema(name = "issueSecurityLevelId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue security level.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueSecurityLevelId")
  public String getIssueSecurityLevelId() {
    return issueSecurityLevelId;
  }

  public void setIssueSecurityLevelId(String issueSecurityLevelId) {
    this.issueSecurityLevelId = issueSecurityLevelId;
  }

  public SecurityLevelMember issueSecuritySchemeId(String issueSecuritySchemeId) {
    this.issueSecuritySchemeId = issueSecuritySchemeId;
    return this;
  }

  /**
   * The ID of the issue security scheme.
   * @return issueSecuritySchemeId
  */
  
  @Schema(name = "issueSecuritySchemeId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue security scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueSecuritySchemeId")
  public String getIssueSecuritySchemeId() {
    return issueSecuritySchemeId;
  }

  public void setIssueSecuritySchemeId(String issueSecuritySchemeId) {
    this.issueSecuritySchemeId = issueSecuritySchemeId;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public SecurityLevelMember putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityLevelMember securityLevelMember = (SecurityLevelMember) o;
    return Objects.equals(this.holder, securityLevelMember.holder) &&
        Objects.equals(this.id, securityLevelMember.id) &&
        Objects.equals(this.issueSecurityLevelId, securityLevelMember.issueSecurityLevelId) &&
        Objects.equals(this.issueSecuritySchemeId, securityLevelMember.issueSecuritySchemeId) &&
    Objects.equals(this.additionalProperties, securityLevelMember.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holder, id, issueSecurityLevelId, issueSecuritySchemeId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityLevelMember {\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueSecurityLevelId: ").append(toIndentedString(issueSecurityLevelId)).append("\n");
    sb.append("    issueSecuritySchemeId: ").append(toIndentedString(issueSecuritySchemeId)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

