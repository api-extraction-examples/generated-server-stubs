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
 * &lt;p&gt;Contains information about an Amazon Web Services access key, without its secret key.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;ListAccessKeys&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "AccessKeyMetadata", description = "<p>Contains information about an Amazon Web Services access key, without its secret key.</p> <p>This data type is used as a response element in the <a>ListAccessKeys</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class AccessKeyMetadata {

  private String userName;

  private String accessKeyId;

  private StatusType status;

  private OffsetDateTime createDate;

  public AccessKeyMetadata userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  
  @Schema(name = "UserName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public AccessKeyMetadata accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * Get accessKeyId
   * @return accessKeyId
  */
  
  @Schema(name = "AccessKeyId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccessKeyId")
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public AccessKeyMetadata status(StatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public StatusType getStatus() {
    return status;
  }

  public void setStatus(StatusType status) {
    this.status = status;
  }

  public AccessKeyMetadata createDate(OffsetDateTime createDate) {
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
    AccessKeyMetadata accessKeyMetadata = (AccessKeyMetadata) o;
    return Objects.equals(this.userName, accessKeyMetadata.userName) &&
        Objects.equals(this.accessKeyId, accessKeyMetadata.accessKeyId) &&
        Objects.equals(this.status, accessKeyMetadata.status) &&
        Objects.equals(this.createDate, accessKeyMetadata.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, accessKeyId, status, createDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKeyMetadata {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

