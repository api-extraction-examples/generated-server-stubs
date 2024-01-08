package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppRelationshipsAppInfosLinks
 */

@JsonTypeName("App_relationships_appInfos_links")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppRelationshipsAppInfosLinks {

  private String related;

  private String self;

  public AppRelationshipsAppInfosLinks related(String related) {
    this.related = related;
    return this;
  }

  /**
   * Get related
   * @return related
  */
  
  @Schema(name = "related", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("related")
  public String getRelated() {
    return related;
  }

  public void setRelated(String related) {
    this.related = related;
  }

  public AppRelationshipsAppInfosLinks self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  
  @Schema(name = "self", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    AppRelationshipsAppInfosLinks appRelationshipsAppInfosLinks = (AppRelationshipsAppInfosLinks) o;
    return Objects.equals(this.related, appRelationshipsAppInfosLinks.related) &&
        Objects.equals(this.self, appRelationshipsAppInfosLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(related, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppRelationshipsAppInfosLinks {\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
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

