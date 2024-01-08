package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.StatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains information about an Amazon Web Services access key.&lt;/p&gt; &lt;p&gt; This data type is used as a response element in the &lt;a&gt;CreateAccessKey&lt;/a&gt; and &lt;a&gt;ListAccessKeys&lt;/a&gt; operations. &lt;/p&gt; &lt;note&gt; &lt;p&gt;The &lt;code&gt;SecretAccessKey&lt;/code&gt; value is returned only in response to &lt;a&gt;CreateAccessKey&lt;/a&gt;. You can get a secret access key only when you first create an access key; you cannot recover the secret access key later. If you lose a secret access key, you must create a new access key.&lt;/p&gt; &lt;/note&gt;
 */

@Schema(name = "AccessKey", description = "<p>Contains information about an Amazon Web Services access key.</p> <p> This data type is used as a response element in the <a>CreateAccessKey</a> and <a>ListAccessKeys</a> operations. </p> <note> <p>The <code>SecretAccessKey</code> value is returned only in response to <a>CreateAccessKey</a>. You can get a secret access key only when you first create an access key; you cannot recover the secret access key later. If you lose a secret access key, you must create a new access key.</p> </note>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class AccessKey {

  private String userName;

  private String accessKeyId;

  private StatusType status;

  private String secretAccessKey;

  private OffsetDateTime createDate;

  public AccessKey() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccessKey(String userName, String accessKeyId, StatusType status, String secretAccessKey) {
    this.userName = userName;
    this.accessKeyId = accessKeyId;
    this.status = status;
    this.secretAccessKey = secretAccessKey;
  }

  public AccessKey userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  @NotNull 
  @Schema(name = "UserName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public AccessKey accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * Get accessKeyId
   * @return accessKeyId
  */
  @NotNull 
  @Schema(name = "AccessKeyId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AccessKeyId")
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public AccessKey status(StatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Status")
  public StatusType getStatus() {
    return status;
  }

  public void setStatus(StatusType status) {
    this.status = status;
  }

  public AccessKey secretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  /**
   * Get secretAccessKey
   * @return secretAccessKey
  */
  @NotNull 
  @Schema(name = "SecretAccessKey", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SecretAccessKey")
  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }

  public AccessKey createDate(OffsetDateTime createDate) {
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
    AccessKey accessKey = (AccessKey) o;
    return Objects.equals(this.userName, accessKey.userName) &&
        Objects.equals(this.accessKeyId, accessKey.accessKeyId) &&
        Objects.equals(this.status, accessKey.status) &&
        Objects.equals(this.secretAccessKey, accessKey.secretAccessKey) &&
        Objects.equals(this.createDate, accessKey.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, accessKeyId, status, secretAccessKey, createDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKey {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
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

