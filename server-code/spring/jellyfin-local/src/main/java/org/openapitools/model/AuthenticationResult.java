package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SessionInfo;
import org.openapitools.model.UserDto;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AuthenticationResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class AuthenticationResult {

  private JsonNullable<String> accessToken = JsonNullable.<String>undefined();

  private JsonNullable<String> serverId = JsonNullable.<String>undefined();

  private SessionInfo sessionInfo;

  private UserDto user;

  public AuthenticationResult accessToken(String accessToken) {
    this.accessToken = JsonNullable.of(accessToken);
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
  */
  
  @Schema(name = "AccessToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccessToken")
  public JsonNullable<String> getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(JsonNullable<String> accessToken) {
    this.accessToken = accessToken;
  }

  public AuthenticationResult serverId(String serverId) {
    this.serverId = JsonNullable.of(serverId);
    return this;
  }

  /**
   * Get serverId
   * @return serverId
  */
  
  @Schema(name = "ServerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServerId")
  public JsonNullable<String> getServerId() {
    return serverId;
  }

  public void setServerId(JsonNullable<String> serverId) {
    this.serverId = serverId;
  }

  public AuthenticationResult sessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
    return this;
  }

  /**
   * Get sessionInfo
   * @return sessionInfo
  */
  @Valid 
  @Schema(name = "SessionInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SessionInfo")
  public SessionInfo getSessionInfo() {
    return sessionInfo;
  }

  public void setSessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
  }

  public AuthenticationResult user(UserDto user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "User", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("User")
  public UserDto getUser() {
    return user;
  }

  public void setUser(UserDto user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationResult authenticationResult = (AuthenticationResult) o;
    return equalsNullable(this.accessToken, authenticationResult.accessToken) &&
        equalsNullable(this.serverId, authenticationResult.serverId) &&
        Objects.equals(this.sessionInfo, authenticationResult.sessionInfo) &&
        Objects.equals(this.user, authenticationResult.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accessToken), hashCodeNullable(serverId), sessionInfo, user);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationResult {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    sessionInfo: ").append(toIndentedString(sessionInfo)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

