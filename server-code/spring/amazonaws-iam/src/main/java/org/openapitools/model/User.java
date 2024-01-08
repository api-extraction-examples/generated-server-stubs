package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.model.UserPermissionsBoundary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains information about an IAM user entity.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the following operations:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;CreateUser&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;GetUser&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;ListUsers&lt;/a&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
 */

@Schema(name = "User", description = "<p>Contains information about an IAM user entity.</p> <p>This data type is used as a response element in the following operations:</p> <ul> <li> <p> <a>CreateUser</a> </p> </li> <li> <p> <a>GetUser</a> </p> </li> <li> <p> <a>ListUsers</a> </p> </li> </ul>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class User {

  private String path;

  private String userName;

  private String userId;

  private String arn;

  private OffsetDateTime createDate;

  private OffsetDateTime passwordLastUsed;

  private UserPermissionsBoundary permissionsBoundary;

  private List tags;

  public User() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public User(String path, String userName, String userId, String arn, OffsetDateTime createDate) {
    this.path = path;
    this.userName = userName;
    this.userId = userId;
    this.arn = arn;
    this.createDate = createDate;
  }

  public User path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  @NotNull 
  @Schema(name = "Path", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public User userName(String userName) {
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

  public User userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @NotNull 
  @Schema(name = "UserId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("UserId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public User arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
  */
  @NotNull 
  @Schema(name = "Arn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Arn")
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public User createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @NotNull @Valid 
  @Schema(name = "CreateDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreateDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public User passwordLastUsed(OffsetDateTime passwordLastUsed) {
    this.passwordLastUsed = passwordLastUsed;
    return this;
  }

  /**
   * Get passwordLastUsed
   * @return passwordLastUsed
  */
  @Valid 
  @Schema(name = "PasswordLastUsed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PasswordLastUsed")
  public OffsetDateTime getPasswordLastUsed() {
    return passwordLastUsed;
  }

  public void setPasswordLastUsed(OffsetDateTime passwordLastUsed) {
    this.passwordLastUsed = passwordLastUsed;
  }

  public User permissionsBoundary(UserPermissionsBoundary permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
    return this;
  }

  /**
   * Get permissionsBoundary
   * @return permissionsBoundary
  */
  @Valid 
  @Schema(name = "PermissionsBoundary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PermissionsBoundary")
  public UserPermissionsBoundary getPermissionsBoundary() {
    return permissionsBoundary;
  }

  public void setPermissionsBoundary(UserPermissionsBoundary permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
  }

  public User tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @Valid 
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tags")
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.path, user.path) &&
        Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.arn, user.arn) &&
        Objects.equals(this.createDate, user.createDate) &&
        Objects.equals(this.passwordLastUsed, user.passwordLastUsed) &&
        Objects.equals(this.permissionsBoundary, user.permissionsBoundary) &&
        Objects.equals(this.tags, user.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, userName, userId, arn, createDate, passwordLastUsed, permissionsBoundary, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    passwordLastUsed: ").append(toIndentedString(passwordLastUsed)).append("\n");
    sb.append("    permissionsBoundary: ").append(toIndentedString(permissionsBoundary)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

