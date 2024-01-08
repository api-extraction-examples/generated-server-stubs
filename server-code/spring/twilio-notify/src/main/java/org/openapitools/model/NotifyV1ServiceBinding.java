package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * NotifyV1ServiceBinding
 */

@JsonTypeName("notify.v1.service.binding")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:49.917798-04:00[America/Lower_Princes]")
public class NotifyV1ServiceBinding {

  private JsonNullable<@Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> accountSid = JsonNullable.<String>undefined();

  private JsonNullable<String> address = JsonNullable.<String>undefined();

  private JsonNullable<String> bindingType = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> credentialSid = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateCreated = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateUpdated = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> endpoint = JsonNullable.<String>undefined();

  private JsonNullable<String> identity = JsonNullable.<String>undefined();

  private JsonNullable<Object> links = JsonNullable.<Object>undefined();

  private JsonNullable<String> notificationProtocolVersion = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^IS[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> serviceSid = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^BS[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> sid = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  private JsonNullable<URI> url = JsonNullable.<URI>undefined();

  public NotifyV1ServiceBinding accountSid(String accountSid) {
    this.accountSid = JsonNullable.of(accountSid);
    return this;
  }

  /**
   * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Binding resource.
   * @return accountSid
  */
  @Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "account_sid", description = "The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Binding resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account_sid")
  public JsonNullable<@Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(JsonNullable<String> accountSid) {
    this.accountSid = accountSid;
  }

  public NotifyV1ServiceBinding address(String address) {
    this.address = JsonNullable.of(address);
    return this;
  }

  /**
   * The channel-specific address. For APNS, the device token. For FCM and GCM, the registration token. For SMS, a phone number in E.164 format. For Facebook Messenger, the Messenger ID of the user or a phone number in E.164 format.
   * @return address
  */
  
  @Schema(name = "address", description = "The channel-specific address. For APNS, the device token. For FCM and GCM, the registration token. For SMS, a phone number in E.164 format. For Facebook Messenger, the Messenger ID of the user or a phone number in E.164 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public JsonNullable<String> getAddress() {
    return address;
  }

  public void setAddress(JsonNullable<String> address) {
    this.address = address;
  }

  public NotifyV1ServiceBinding bindingType(String bindingType) {
    this.bindingType = JsonNullable.of(bindingType);
    return this;
  }

  /**
   * The transport technology to use for the Binding. Can be: `apn`, `fcm`, `gcm`, `sms`, or `facebook-messenger`.
   * @return bindingType
  */
  
  @Schema(name = "binding_type", description = "The transport technology to use for the Binding. Can be: `apn`, `fcm`, `gcm`, `sms`, or `facebook-messenger`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("binding_type")
  public JsonNullable<String> getBindingType() {
    return bindingType;
  }

  public void setBindingType(JsonNullable<String> bindingType) {
    this.bindingType = bindingType;
  }

  public NotifyV1ServiceBinding credentialSid(String credentialSid) {
    this.credentialSid = JsonNullable.of(credentialSid);
    return this;
  }

  /**
   * The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) resource to be used to send notifications to this Binding. If present, this overrides the Credential specified in the Service resource. Applicable only to `apn`, `fcm`, and `gcm` type Bindings.
   * @return credentialSid
  */
  @Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "credential_sid", description = "The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) resource to be used to send notifications to this Binding. If present, this overrides the Credential specified in the Service resource. Applicable only to `apn`, `fcm`, and `gcm` type Bindings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credential_sid")
  public JsonNullable<@Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getCredentialSid() {
    return credentialSid;
  }

  public void setCredentialSid(JsonNullable<String> credentialSid) {
    this.credentialSid = credentialSid;
  }

  public NotifyV1ServiceBinding dateCreated(OffsetDateTime dateCreated) {
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

  public NotifyV1ServiceBinding dateUpdated(OffsetDateTime dateUpdated) {
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

  public NotifyV1ServiceBinding endpoint(String endpoint) {
    this.endpoint = JsonNullable.of(endpoint);
    return this;
  }

  /**
   * Deprecated.
   * @return endpoint
  */
  
  @Schema(name = "endpoint", description = "Deprecated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endpoint")
  public JsonNullable<String> getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(JsonNullable<String> endpoint) {
    this.endpoint = endpoint;
  }

  public NotifyV1ServiceBinding identity(String identity) {
    this.identity = JsonNullable.of(identity);
    return this;
  }

  /**
   * The `identity` value that uniquely identifies the resource's [User](https://www.twilio.com/docs/chat/rest/user-resource) within the [Service](https://www.twilio.com/docs/notify/api/service-resource). Up to 20 Bindings can be created for the same Identity in a given Service.
   * @return identity
  */
  
  @Schema(name = "identity", description = "The `identity` value that uniquely identifies the resource's [User](https://www.twilio.com/docs/chat/rest/user-resource) within the [Service](https://www.twilio.com/docs/notify/api/service-resource). Up to 20 Bindings can be created for the same Identity in a given Service.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identity")
  public JsonNullable<String> getIdentity() {
    return identity;
  }

  public void setIdentity(JsonNullable<String> identity) {
    this.identity = identity;
  }

  public NotifyV1ServiceBinding links(Object links) {
    this.links = JsonNullable.of(links);
    return this;
  }

  /**
   * The URLs of related resources.
   * @return links
  */
  
  @Schema(name = "links", description = "The URLs of related resources.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public JsonNullable<Object> getLinks() {
    return links;
  }

  public void setLinks(JsonNullable<Object> links) {
    this.links = links;
  }

  public NotifyV1ServiceBinding notificationProtocolVersion(String notificationProtocolVersion) {
    this.notificationProtocolVersion = JsonNullable.of(notificationProtocolVersion);
    return this;
  }

  /**
   * The protocol version to use to send the notification. This defaults to the value of `default_xxxx_notification_protocol_version` in the [Service](https://www.twilio.com/docs/notify/api/service-resource) for the protocol. The current version is `\"3\"` for `apn`, `fcm`, and `gcm` type Bindings. The parameter is not applicable to `sms` and `facebook-messenger` type Bindings as the data format is fixed.
   * @return notificationProtocolVersion
  */
  
  @Schema(name = "notification_protocol_version", description = "The protocol version to use to send the notification. This defaults to the value of `default_xxxx_notification_protocol_version` in the [Service](https://www.twilio.com/docs/notify/api/service-resource) for the protocol. The current version is `\"3\"` for `apn`, `fcm`, and `gcm` type Bindings. The parameter is not applicable to `sms` and `facebook-messenger` type Bindings as the data format is fixed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notification_protocol_version")
  public JsonNullable<String> getNotificationProtocolVersion() {
    return notificationProtocolVersion;
  }

  public void setNotificationProtocolVersion(JsonNullable<String> notificationProtocolVersion) {
    this.notificationProtocolVersion = notificationProtocolVersion;
  }

  public NotifyV1ServiceBinding serviceSid(String serviceSid) {
    this.serviceSid = JsonNullable.of(serviceSid);
    return this;
  }

  /**
   * The SID of the [Service](https://www.twilio.com/docs/notify/api/service-resource) the resource is associated with.
   * @return serviceSid
  */
  @Pattern(regexp = "^IS[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "service_sid", description = "The SID of the [Service](https://www.twilio.com/docs/notify/api/service-resource) the resource is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_sid")
  public JsonNullable<@Pattern(regexp = "^IS[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getServiceSid() {
    return serviceSid;
  }

  public void setServiceSid(JsonNullable<String> serviceSid) {
    this.serviceSid = serviceSid;
  }

  public NotifyV1ServiceBinding sid(String sid) {
    this.sid = JsonNullable.of(sid);
    return this;
  }

  /**
   * The unique string that we created to identify the Binding resource.
   * @return sid
  */
  @Pattern(regexp = "^BS[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "sid", description = "The unique string that we created to identify the Binding resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sid")
  public JsonNullable<@Pattern(regexp = "^BS[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getSid() {
    return sid;
  }

  public void setSid(JsonNullable<String> sid) {
    this.sid = sid;
  }

  public NotifyV1ServiceBinding tags(List<String> tags) {
    this.tags = JsonNullable.of(tags);
    return this;
  }

  public NotifyV1ServiceBinding addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.of(new ArrayList<>());
    }
    this.tags.get().add(tagsItem);
    return this;
  }

  /**
   * The list of tags associated with this Binding. Tags can be used to select the Bindings to use when sending a notification. Maximum 20 tags are allowed.
   * @return tags
  */
  
  @Schema(name = "tags", description = "The list of tags associated with this Binding. Tags can be used to select the Bindings to use when sending a notification. Maximum 20 tags are allowed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public JsonNullable<List<String>> getTags() {
    return tags;
  }

  public void setTags(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public NotifyV1ServiceBinding url(URI url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * The absolute URL of the Binding resource.
   * @return url
  */
  @Valid 
  @Schema(name = "url", description = "The absolute URL of the Binding resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    NotifyV1ServiceBinding notifyV1ServiceBinding = (NotifyV1ServiceBinding) o;
    return equalsNullable(this.accountSid, notifyV1ServiceBinding.accountSid) &&
        equalsNullable(this.address, notifyV1ServiceBinding.address) &&
        equalsNullable(this.bindingType, notifyV1ServiceBinding.bindingType) &&
        equalsNullable(this.credentialSid, notifyV1ServiceBinding.credentialSid) &&
        equalsNullable(this.dateCreated, notifyV1ServiceBinding.dateCreated) &&
        equalsNullable(this.dateUpdated, notifyV1ServiceBinding.dateUpdated) &&
        equalsNullable(this.endpoint, notifyV1ServiceBinding.endpoint) &&
        equalsNullable(this.identity, notifyV1ServiceBinding.identity) &&
        equalsNullable(this.links, notifyV1ServiceBinding.links) &&
        equalsNullable(this.notificationProtocolVersion, notifyV1ServiceBinding.notificationProtocolVersion) &&
        equalsNullable(this.serviceSid, notifyV1ServiceBinding.serviceSid) &&
        equalsNullable(this.sid, notifyV1ServiceBinding.sid) &&
        equalsNullable(this.tags, notifyV1ServiceBinding.tags) &&
        equalsNullable(this.url, notifyV1ServiceBinding.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accountSid), hashCodeNullable(address), hashCodeNullable(bindingType), hashCodeNullable(credentialSid), hashCodeNullable(dateCreated), hashCodeNullable(dateUpdated), hashCodeNullable(endpoint), hashCodeNullable(identity), hashCodeNullable(links), hashCodeNullable(notificationProtocolVersion), hashCodeNullable(serviceSid), hashCodeNullable(sid), hashCodeNullable(tags), hashCodeNullable(url));
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
    sb.append("class NotifyV1ServiceBinding {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    bindingType: ").append(toIndentedString(bindingType)).append("\n");
    sb.append("    credentialSid: ").append(toIndentedString(credentialSid)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    notificationProtocolVersion: ").append(toIndentedString(notificationProtocolVersion)).append("\n");
    sb.append("    serviceSid: ").append(toIndentedString(serviceSid)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

