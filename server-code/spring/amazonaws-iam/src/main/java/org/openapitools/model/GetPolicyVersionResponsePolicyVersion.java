package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetPolicyVersionResponsePolicyVersion
 */

@JsonTypeName("GetPolicyVersionResponse_PolicyVersion")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetPolicyVersionResponsePolicyVersion {

  private String document;

  private String versionId;

  private Boolean isDefaultVersion;

  private OffsetDateTime createDate;

  public GetPolicyVersionResponsePolicyVersion document(String document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
  */
  
  @Schema(name = "Document", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Document")
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public GetPolicyVersionResponsePolicyVersion versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Get versionId
   * @return versionId
  */
  
  @Schema(name = "VersionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VersionId")
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public GetPolicyVersionResponsePolicyVersion isDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
    return this;
  }

  /**
   * Get isDefaultVersion
   * @return isDefaultVersion
  */
  
  @Schema(name = "IsDefaultVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsDefaultVersion")
  public Boolean getIsDefaultVersion() {
    return isDefaultVersion;
  }

  public void setIsDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
  }

  public GetPolicyVersionResponsePolicyVersion createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @Valid 
  @Schema(name = "CreateDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreateDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPolicyVersionResponsePolicyVersion getPolicyVersionResponsePolicyVersion = (GetPolicyVersionResponsePolicyVersion) o;
    return Objects.equals(this.document, getPolicyVersionResponsePolicyVersion.document) &&
        Objects.equals(this.versionId, getPolicyVersionResponsePolicyVersion.versionId) &&
        Objects.equals(this.isDefaultVersion, getPolicyVersionResponsePolicyVersion.isDefaultVersion) &&
        Objects.equals(this.createDate, getPolicyVersionResponsePolicyVersion.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, versionId, isDefaultVersion, createDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPolicyVersionResponsePolicyVersion {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    isDefaultVersion: ").append(toIndentedString(isDefaultVersion)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

