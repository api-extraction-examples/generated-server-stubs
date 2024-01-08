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
 * RemoveClientIDFromOpenIDConnectProviderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class RemoveClientIDFromOpenIDConnectProviderRequest {

  private String openIDConnectProviderArn;

  private String clientID;

  public RemoveClientIDFromOpenIDConnectProviderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RemoveClientIDFromOpenIDConnectProviderRequest(String openIDConnectProviderArn, String clientID) {
    this.openIDConnectProviderArn = openIDConnectProviderArn;
    this.clientID = clientID;
  }

  public RemoveClientIDFromOpenIDConnectProviderRequest openIDConnectProviderArn(String openIDConnectProviderArn) {
    this.openIDConnectProviderArn = openIDConnectProviderArn;
    return this;
  }

  /**
   * Get openIDConnectProviderArn
   * @return openIDConnectProviderArn
  */
  @NotNull 
  @Schema(name = "OpenIDConnectProviderArn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("OpenIDConnectProviderArn")
  public String getOpenIDConnectProviderArn() {
    return openIDConnectProviderArn;
  }

  public void setOpenIDConnectProviderArn(String openIDConnectProviderArn) {
    this.openIDConnectProviderArn = openIDConnectProviderArn;
  }

  public RemoveClientIDFromOpenIDConnectProviderRequest clientID(String clientID) {
    this.clientID = clientID;
    return this;
  }

  /**
   * Get clientID
   * @return clientID
  */
  @NotNull 
  @Schema(name = "ClientID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ClientID")
  public String getClientID() {
    return clientID;
  }

  public void setClientID(String clientID) {
    this.clientID = clientID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveClientIDFromOpenIDConnectProviderRequest removeClientIDFromOpenIDConnectProviderRequest = (RemoveClientIDFromOpenIDConnectProviderRequest) o;
    return Objects.equals(this.openIDConnectProviderArn, removeClientIDFromOpenIDConnectProviderRequest.openIDConnectProviderArn) &&
        Objects.equals(this.clientID, removeClientIDFromOpenIDConnectProviderRequest.clientID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openIDConnectProviderArn, clientID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveClientIDFromOpenIDConnectProviderRequest {\n");
    sb.append("    openIDConnectProviderArn: ").append(toIndentedString(openIDConnectProviderArn)).append("\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
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

