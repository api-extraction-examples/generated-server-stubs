package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ListCredentialResponseMeta;
import org.openapitools.model.NotifyV1Credential;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListCredentialResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:49.917798-04:00[America/Lower_Princes]")
public class ListCredentialResponse {

  @Valid
  private List<@Valid NotifyV1Credential> credentials;

  private ListCredentialResponseMeta meta;

  public ListCredentialResponse credentials(List<@Valid NotifyV1Credential> credentials) {
    this.credentials = credentials;
    return this;
  }

  public ListCredentialResponse addCredentialsItem(NotifyV1Credential credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

  /**
   * Get credentials
   * @return credentials
  */
  @Valid 
  @Schema(name = "credentials", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credentials")
  public List<@Valid NotifyV1Credential> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<@Valid NotifyV1Credential> credentials) {
    this.credentials = credentials;
  }

  public ListCredentialResponse meta(ListCredentialResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @Valid 
  @Schema(name = "meta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meta")
  public ListCredentialResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(ListCredentialResponseMeta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCredentialResponse listCredentialResponse = (ListCredentialResponse) o;
    return Objects.equals(this.credentials, listCredentialResponse.credentials) &&
        Objects.equals(this.meta, listCredentialResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCredentialResponse {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

