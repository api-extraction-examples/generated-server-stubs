package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UserOnboardingProgress;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * User
 */

@JsonTypeName("user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class User {

  private String affiliateId;

  private String avatarUrl;

  private String createdAt;

  private String email;

  private String fullName;

  private String id;

  private String lastLogin;

  @Valid
  private List<String> loginProviders;

  private UserOnboardingProgress onboardingProgress;

  private Long siteCount;

  private String uid;

  public User affiliateId(String affiliateId) {
    this.affiliateId = affiliateId;
    return this;
  }

  /**
   * Get affiliateId
   * @return affiliateId
  */
  
  @Schema(name = "affiliate_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("affiliate_id")
  public String getAffiliateId() {
    return affiliateId;
  }

  public void setAffiliateId(String affiliateId) {
    this.affiliateId = affiliateId;
  }

  public User avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * Get avatarUrl
   * @return avatarUrl
  */
  
  @Schema(name = "avatar_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public User createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  */
  
  @Schema(name = "full_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public User id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User lastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * Get lastLogin
   * @return lastLogin
  */
  
  @Schema(name = "last_login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_login")
  public String getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }

  public User loginProviders(List<String> loginProviders) {
    this.loginProviders = loginProviders;
    return this;
  }

  public User addLoginProvidersItem(String loginProvidersItem) {
    if (this.loginProviders == null) {
      this.loginProviders = new ArrayList<>();
    }
    this.loginProviders.add(loginProvidersItem);
    return this;
  }

  /**
   * Get loginProviders
   * @return loginProviders
  */
  
  @Schema(name = "login_providers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("login_providers")
  public List<String> getLoginProviders() {
    return loginProviders;
  }

  public void setLoginProviders(List<String> loginProviders) {
    this.loginProviders = loginProviders;
  }

  public User onboardingProgress(UserOnboardingProgress onboardingProgress) {
    this.onboardingProgress = onboardingProgress;
    return this;
  }

  /**
   * Get onboardingProgress
   * @return onboardingProgress
  */
  @Valid 
  @Schema(name = "onboarding_progress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onboarding_progress")
  public UserOnboardingProgress getOnboardingProgress() {
    return onboardingProgress;
  }

  public void setOnboardingProgress(UserOnboardingProgress onboardingProgress) {
    this.onboardingProgress = onboardingProgress;
  }

  public User siteCount(Long siteCount) {
    this.siteCount = siteCount;
    return this;
  }

  /**
   * Get siteCount
   * @return siteCount
  */
  
  @Schema(name = "site_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("site_count")
  public Long getSiteCount() {
    return siteCount;
  }

  public void setSiteCount(Long siteCount) {
    this.siteCount = siteCount;
  }

  public User uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Get uid
   * @return uid
  */
  
  @Schema(name = "uid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
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
    return Objects.equals(this.affiliateId, user.affiliateId) &&
        Objects.equals(this.avatarUrl, user.avatarUrl) &&
        Objects.equals(this.createdAt, user.createdAt) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.fullName, user.fullName) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.loginProviders, user.loginProviders) &&
        Objects.equals(this.onboardingProgress, user.onboardingProgress) &&
        Objects.equals(this.siteCount, user.siteCount) &&
        Objects.equals(this.uid, user.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateId, avatarUrl, createdAt, email, fullName, id, lastLogin, loginProviders, onboardingProgress, siteCount, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    affiliateId: ").append(toIndentedString(affiliateId)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    loginProviders: ").append(toIndentedString(loginProviders)).append("\n");
    sb.append("    onboardingProgress: ").append(toIndentedString(onboardingProgress)).append("\n");
    sb.append("    siteCount: ").append(toIndentedString(siteCount)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

