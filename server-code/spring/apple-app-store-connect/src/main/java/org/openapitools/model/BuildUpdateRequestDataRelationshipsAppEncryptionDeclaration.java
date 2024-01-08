package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BuildRelationshipsAppEncryptionDeclarationData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration
 */

@JsonTypeName("BuildUpdateRequest_data_relationships_appEncryptionDeclaration")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration {

  private BuildRelationshipsAppEncryptionDeclarationData data;

  public BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration data(BuildRelationshipsAppEncryptionDeclarationData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public BuildRelationshipsAppEncryptionDeclarationData getData() {
    return data;
  }

  public void setData(BuildRelationshipsAppEncryptionDeclarationData data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration buildUpdateRequestDataRelationshipsAppEncryptionDeclaration = (BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration) o;
    return Objects.equals(this.data, buildUpdateRequestDataRelationshipsAppEncryptionDeclaration.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

