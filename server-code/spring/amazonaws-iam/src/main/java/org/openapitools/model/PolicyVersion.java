package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains information about a version of a managed policy.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;CreatePolicyVersion&lt;/a&gt;, &lt;a&gt;GetPolicyVersion&lt;/a&gt;, &lt;a&gt;ListPolicyVersions&lt;/a&gt;, and &lt;a&gt;GetAccountAuthorizationDetails&lt;/a&gt; operations. &lt;/p&gt; &lt;p&gt;For more information about managed policies, refer to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt;
 */

@Schema(name = "PolicyVersion", description = "<p>Contains information about a version of a managed policy.</p> <p>This data type is used as a response element in the <a>CreatePolicyVersion</a>, <a>GetPolicyVersion</a>, <a>ListPolicyVersions</a>, and <a>GetAccountAuthorizationDetails</a> operations. </p> <p>For more information about managed policies, refer to <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>. </p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class PolicyVersion {

  private String document;

  private String versionId;

  private Boolean isDefaultVersion;

  private OffsetDateTime createDate;

  public PolicyVersion document(String document) {
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

  public PolicyVersion versionId(String versionId) {
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

  public PolicyVersion isDefaultVersion(Boolean isDefaultVersion) {
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

  public PolicyVersion createDate(OffsetDateTime createDate) {
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
    PolicyVersion policyVersion = (PolicyVersion) o;
    return Objects.equals(this.document, policyVersion.document) &&
        Objects.equals(this.versionId, policyVersion.versionId) &&
        Objects.equals(this.isDefaultVersion, policyVersion.isDefaultVersion) &&
        Objects.equals(this.createDate, policyVersion.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, versionId, isDefaultVersion, createDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyVersion {\n");
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

