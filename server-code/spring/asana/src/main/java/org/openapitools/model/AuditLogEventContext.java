package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The context from which this event originated.
 */

@Schema(name = "AuditLogEventContext", description = "The context from which this event originated.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class AuditLogEventContext {

  /**
   * The authentication method used in the context of an API request. Only present if the `context_type` is `api`. Can be one of `cookie`, `oauth`, `personal_access_token`, or `service_account`.
   */
  public enum ApiAuthenticationMethodEnum {
    COOKIE("cookie"),
    
    OAUTH("oauth"),
    
    PERSONAL_ACCESS_TOKEN("personal_access_token"),
    
    SERVICE_ACCOUNT("service_account");

    private String value;

    ApiAuthenticationMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApiAuthenticationMethodEnum fromValue(String value) {
      for (ApiAuthenticationMethodEnum b : ApiAuthenticationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ApiAuthenticationMethodEnum apiAuthenticationMethod;

  private String clientIpAddress;

  /**
   * The type of context. Can be one of `web`, `desktop`, `mobile`, `asana_support`, `asana`, `email`, or `api`.
   */
  public enum ContextTypeEnum {
    WEB("web"),
    
    DESKTOP("desktop"),
    
    MOBILE("mobile"),
    
    ASANA_SUPPORT("asana_support"),
    
    ASANA("asana"),
    
    EMAIL("email"),
    
    API("api");

    private String value;

    ContextTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContextTypeEnum fromValue(String value) {
      for (ContextTypeEnum b : ContextTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ContextTypeEnum contextType;

  private String oauthAppName;

  private String userAgent;

  public AuditLogEventContext apiAuthenticationMethod(ApiAuthenticationMethodEnum apiAuthenticationMethod) {
    this.apiAuthenticationMethod = apiAuthenticationMethod;
    return this;
  }

  /**
   * The authentication method used in the context of an API request. Only present if the `context_type` is `api`. Can be one of `cookie`, `oauth`, `personal_access_token`, or `service_account`.
   * @return apiAuthenticationMethod
  */
  
  @Schema(name = "api_authentication_method", description = "The authentication method used in the context of an API request. Only present if the `context_type` is `api`. Can be one of `cookie`, `oauth`, `personal_access_token`, or `service_account`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("api_authentication_method")
  public ApiAuthenticationMethodEnum getApiAuthenticationMethod() {
    return apiAuthenticationMethod;
  }

  public void setApiAuthenticationMethod(ApiAuthenticationMethodEnum apiAuthenticationMethod) {
    this.apiAuthenticationMethod = apiAuthenticationMethod;
  }

  public AuditLogEventContext clientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
    return this;
  }

  /**
   * The IP address of the client that initiated the event, if applicable.
   * @return clientIpAddress
  */
  
  @Schema(name = "client_ip_address", example = "1.1.1.1", description = "The IP address of the client that initiated the event, if applicable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client_ip_address")
  public String getClientIpAddress() {
    return clientIpAddress;
  }

  public void setClientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }

  public AuditLogEventContext contextType(ContextTypeEnum contextType) {
    this.contextType = contextType;
    return this;
  }

  /**
   * The type of context. Can be one of `web`, `desktop`, `mobile`, `asana_support`, `asana`, `email`, or `api`.
   * @return contextType
  */
  
  @Schema(name = "context_type", example = "web", description = "The type of context. Can be one of `web`, `desktop`, `mobile`, `asana_support`, `asana`, `email`, or `api`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("context_type")
  public ContextTypeEnum getContextType() {
    return contextType;
  }

  public void setContextType(ContextTypeEnum contextType) {
    this.contextType = contextType;
  }

  public AuditLogEventContext oauthAppName(String oauthAppName) {
    this.oauthAppName = oauthAppName;
    return this;
  }

  /**
   * The name of the OAuth App that initiated the event. Only present if the `api_authentication_method` is `oauth`.
   * @return oauthAppName
  */
  
  @Schema(name = "oauth_app_name", description = "The name of the OAuth App that initiated the event. Only present if the `api_authentication_method` is `oauth`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth_app_name")
  public String getOauthAppName() {
    return oauthAppName;
  }

  public void setOauthAppName(String oauthAppName) {
    this.oauthAppName = oauthAppName;
  }

  public AuditLogEventContext userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * The user agent of the client that initiated the event, if applicable.
   * @return userAgent
  */
  
  @Schema(name = "user_agent", example = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36", description = "The user agent of the client that initiated the event, if applicable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_agent")
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
    AuditLogEventContext auditLogEventContext = (AuditLogEventContext) o;
    return Objects.equals(this.apiAuthenticationMethod, auditLogEventContext.apiAuthenticationMethod) &&
        Objects.equals(this.clientIpAddress, auditLogEventContext.clientIpAddress) &&
        Objects.equals(this.contextType, auditLogEventContext.contextType) &&
        Objects.equals(this.oauthAppName, auditLogEventContext.oauthAppName) &&
        Objects.equals(this.userAgent, auditLogEventContext.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiAuthenticationMethod, clientIpAddress, contextType, oauthAppName, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogEventContext {\n");
    sb.append("    apiAuthenticationMethod: ").append(toIndentedString(apiAuthenticationMethod)).append("\n");
    sb.append("    clientIpAddress: ").append(toIndentedString(clientIpAddress)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    oauthAppName: ").append(toIndentedString(oauthAppName)).append("\n");
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

