package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents an OAuth token used for authenticating with the API and performing actions.
 */

@Schema(name = "Token", description = "Represents an OAuth token used for authenticating with the API and performing actions.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Token {

  private String accessToken;

  private Integer createdAt;

  private String scope;

  private String tokenType;

  public Token accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * An OAuth token to be used for authorization.
   * @return accessToken
  */
  
  @Schema(name = "access_token", description = "An OAuth token to be used for authorization.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public Token createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the token was generated. UNIX Timestamp.
   * @return createdAt
  */
  
  @Schema(name = "created_at", description = "When the token was generated. UNIX Timestamp.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public Token scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The OAuth scopes granted by this token, space-separated.
   * @return scope
  */
  
  @Schema(name = "scope", description = "The OAuth scopes granted by this token, space-separated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public Token tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * The OAuth token type. Mastodon uses `Bearer` tokens.
   * @return tokenType
  */
  
  @Schema(name = "token_type", description = "The OAuth token type. Mastodon uses `Bearer` tokens.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Token token = (Token) o;
    return Objects.equals(this.accessToken, token.accessToken) &&
        Objects.equals(this.createdAt, token.createdAt) &&
        Objects.equals(this.scope, token.scope) &&
        Objects.equals(this.tokenType, token.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, createdAt, scope, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

