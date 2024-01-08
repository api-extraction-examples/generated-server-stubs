package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * APIRequestActor
 */

@JsonTypeName("APIRequest_actor")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:26.239496-04:00[America/Lower_Princes]")
public class APIRequestActor {

  private String account;

  private UUID id;

  private String jti;

  private String requestIp;

  private String userAgent;

  public APIRequestActor account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public APIRequestActor id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public APIRequestActor jti(String jti) {
    this.jti = jti;
    return this;
  }

  /**
   * Get jti
   * @return jti
  */
  
  @Schema(name = "jti", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jti")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  public APIRequestActor requestIp(String requestIp) {
    this.requestIp = requestIp;
    return this;
  }

  /**
   * Get requestIp
   * @return requestIp
  */
  
  @Schema(name = "requestIp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestIp")
  public String getRequestIp() {
    return requestIp;
  }

  public void setRequestIp(String requestIp) {
    this.requestIp = requestIp;
  }

  public APIRequestActor userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Get userAgent
   * @return userAgent
  */
  
  @Schema(name = "userAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userAgent")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIRequestActor apIRequestActor = (APIRequestActor) o;
    return Objects.equals(this.account, apIRequestActor.account) &&
        Objects.equals(this.id, apIRequestActor.id) &&
        Objects.equals(this.jti, apIRequestActor.jti) &&
        Objects.equals(this.requestIp, apIRequestActor.requestIp) &&
        Objects.equals(this.userAgent, apIRequestActor.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, id, jti, requestIp, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIRequestActor {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
    sb.append("    requestIp: ").append(toIndentedString(requestIp)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

