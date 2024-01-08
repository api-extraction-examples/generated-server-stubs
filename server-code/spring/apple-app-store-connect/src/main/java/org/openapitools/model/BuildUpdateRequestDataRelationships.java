package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildUpdateRequestDataRelationships
 */

@JsonTypeName("BuildUpdateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BuildUpdateRequestDataRelationships {

  private BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration appEncryptionDeclaration;

  public BuildUpdateRequestDataRelationships appEncryptionDeclaration(BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
    this.appEncryptionDeclaration = appEncryptionDeclaration;
    return this;
  }

  /**
   * Get appEncryptionDeclaration
   * @return appEncryptionDeclaration
  */
  @Valid 
  @Schema(name = "appEncryptionDeclaration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appEncryptionDeclaration")
  public BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration getAppEncryptionDeclaration() {
    return appEncryptionDeclaration;
  }

  public void setAppEncryptionDeclaration(BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
    this.appEncryptionDeclaration = appEncryptionDeclaration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildUpdateRequestDataRelationships buildUpdateRequestDataRelationships = (BuildUpdateRequestDataRelationships) o;
    return Objects.equals(this.appEncryptionDeclaration, buildUpdateRequestDataRelationships.appEncryptionDeclaration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appEncryptionDeclaration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildUpdateRequestDataRelationships {\n");
    sb.append("    appEncryptionDeclaration: ").append(toIndentedString(appEncryptionDeclaration)).append("\n");
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

