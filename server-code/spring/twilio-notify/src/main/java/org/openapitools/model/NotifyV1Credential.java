package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CredentialEnumPushService;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NotifyV1Credential
 */

@JsonTypeName("notify.v1.credential")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:49.917798-04:00[America/Lower_Princes]")
public class NotifyV1Credential {

  private JsonNullable<@Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> accountSid = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateCreated = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateUpdated = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> friendlyName = JsonNullable.<String>undefined();

  private JsonNullable<String> sandbox = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> sid = JsonNullable.<String>undefined();

  private CredentialEnumPushService type;

  private JsonNullable<URI> url = JsonNullable.<URI>undefined();

  public NotifyV1Credential accountSid(String accountSid) {
    this.accountSid = JsonNullable.of(accountSid);
    return this;
  }

  /**
   * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Credential resource.
   * @return accountSid
  */
  @Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "account_sid", description = "The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Credential resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account_sid")
  public JsonNullable<@Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(JsonNullable<String> accountSid) {
    this.accountSid = accountSid;
  }

  public NotifyV1Credential dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = JsonNullable.of(dateCreated);
    return this;
  }

  /**
   * The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
   * @return dateCreated
  */
  @Valid 
  @Schema(name = "date_created", description = "The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date_created")
  public JsonNullable<OffsetDateTime> getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(JsonNullable<OffsetDateTime> dateCreated) {
    this.dateCreated = dateCreated;
  }

  public NotifyV1Credential dateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = JsonNullable.of(dateUpdated);
    return this;
  }

  /**
   * The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
   * @return dateUpdated
  */
  @Valid 
  @Schema(name = "date_updated", description = "The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date_updated")
  public JsonNullable<OffsetDateTime> getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(JsonNullable<OffsetDateTime> dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  public NotifyV1Credential friendlyName(String friendlyName) {
    this.friendlyName = JsonNullable.of(friendlyName);
    return this;
  }

  /**
   * The string that you assigned to describe the resource.
   * @return friendlyName
  */
  
  @Schema(name = "friendly_name", description = "The string that you assigned to describe the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendly_name")
  public JsonNullable<String> getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(JsonNullable<String> friendlyName) {
    this.friendlyName = friendlyName;
  }

  public NotifyV1Credential sandbox(String sandbox) {
    this.sandbox = JsonNullable.of(sandbox);
    return this;
  }

  /**
   * [APN only] Whether to send the credential to sandbox APNs. Can be `true` to send to sandbox APNs or `false` to send to production.
   * @return sandbox
  */
  
  @Schema(name = "sandbox", description = "[APN only] Whether to send the credential to sandbox APNs. Can be `true` to send to sandbox APNs or `false` to send to production.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sandbox")
  public JsonNullable<String> getSandbox() {
    return sandbox;
  }

  public void setSandbox(JsonNullable<String> sandbox) {
    this.sandbox = sandbox;
  }

  public NotifyV1Credential sid(String sid) {
    this.sid = JsonNullable.of(sid);
    return this;
  }

  /**
   * The unique string that we created to identify the Credential resource.
   * @return sid
  */
  @Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "sid", description = "The unique string that we created to identify the Credential resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sid")
  public JsonNullable<@Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getSid() {
    return sid;
  }

  public void setSid(JsonNullable<String> sid) {
    this.sid = sid;
  }

  public NotifyV1Credential type(CredentialEnumPushService type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public CredentialEnumPushService getType() {
    return type;
  }

  public void setType(CredentialEnumPushService type) {
    this.type = type;
  }

  public NotifyV1Credential url(URI url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * The absolute URL of the Credential resource.
   * @return url
  */
  @Valid 
  @Schema(name = "url", description = "The absolute URL of the Credential resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public JsonNullable<URI> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<URI> url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyV1Credential notifyV1Credential = (NotifyV1Credential) o;
    return equalsNullable(this.accountSid, notifyV1Credential.accountSid) &&
        equalsNullable(this.dateCreated, notifyV1Credential.dateCreated) &&
        equalsNullable(this.dateUpdated, notifyV1Credential.dateUpdated) &&
        equalsNullable(this.friendlyName, notifyV1Credential.friendlyName) &&
        equalsNullable(this.sandbox, notifyV1Credential.sandbox) &&
        equalsNullable(this.sid, notifyV1Credential.sid) &&
        Objects.equals(this.type, notifyV1Credential.type) &&
        equalsNullable(this.url, notifyV1Credential.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accountSid), hashCodeNullable(dateCreated), hashCodeNullable(dateUpdated), hashCodeNullable(friendlyName), hashCodeNullable(sandbox), hashCodeNullable(sid), type, hashCodeNullable(url));
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
    sb.append("class NotifyV1Credential {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

