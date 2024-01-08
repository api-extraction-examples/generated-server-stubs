package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.EntityDetailsEntityInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;An object that contains details about when the IAM entities (users or roles) were last used in an attempt to access the specified Amazon Web Services service.&lt;/p&gt; &lt;p&gt;This data type is a response element in the &lt;a&gt;GetServiceLastAccessedDetailsWithEntities&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "EntityDetails", description = "<p>An object that contains details about when the IAM entities (users or roles) were last used in an attempt to access the specified Amazon Web Services service.</p> <p>This data type is a response element in the <a>GetServiceLastAccessedDetailsWithEntities</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class EntityDetails {

  private EntityDetailsEntityInfo entityInfo;

  private OffsetDateTime lastAuthenticated;

  public EntityDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EntityDetails(EntityDetailsEntityInfo entityInfo) {
    this.entityInfo = entityInfo;
  }

  public EntityDetails entityInfo(EntityDetailsEntityInfo entityInfo) {
    this.entityInfo = entityInfo;
    return this;
  }

  /**
   * Get entityInfo
   * @return entityInfo
  */
  @NotNull @Valid 
  @Schema(name = "EntityInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EntityInfo")
  public EntityDetailsEntityInfo getEntityInfo() {
    return entityInfo;
  }

  public void setEntityInfo(EntityDetailsEntityInfo entityInfo) {
    this.entityInfo = entityInfo;
  }

  public EntityDetails lastAuthenticated(OffsetDateTime lastAuthenticated) {
    this.lastAuthenticated = lastAuthenticated;
    return this;
  }

  /**
   * Get lastAuthenticated
   * @return lastAuthenticated
  */
  @Valid 
  @Schema(name = "LastAuthenticated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastAuthenticated")
  public OffsetDateTime getLastAuthenticated() {
    return lastAuthenticated;
  }

  public void setLastAuthenticated(OffsetDateTime lastAuthenticated) {
    this.lastAuthenticated = lastAuthenticated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityDetails entityDetails = (EntityDetails) o;
    return Objects.equals(this.entityInfo, entityDetails.entityInfo) &&
        Objects.equals(this.lastAuthenticated, entityDetails.lastAuthenticated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityInfo, lastAuthenticated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityDetails {\n");
    sb.append("    entityInfo: ").append(toIndentedString(entityInfo)).append("\n");
    sb.append("    lastAuthenticated: ").append(toIndentedString(lastAuthenticated)).append("\n");
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

