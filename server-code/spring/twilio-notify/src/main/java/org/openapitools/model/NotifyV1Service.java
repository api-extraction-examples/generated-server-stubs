package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
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
 * NotifyV1Service
 */

@JsonTypeName("notify.v1.service")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:49.917798-04:00[America/Lower_Princes]")
public class NotifyV1Service {

  private JsonNullable<@Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> accountSid = JsonNullable.<String>undefined();

  private JsonNullable<String> alexaSkillId = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> apnCredentialSid = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateCreated = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateUpdated = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> defaultAlexaNotificationProtocolVersion = JsonNullable.<String>undefined();

  private JsonNullable<String> defaultApnNotificationProtocolVersion = JsonNullable.<String>undefined();

  private JsonNullable<String> defaultFcmNotificationProtocolVersion = JsonNullable.<String>undefined();

  private JsonNullable<String> defaultGcmNotificationProtocolVersion = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> deliveryCallbackEnabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> deliveryCallbackUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> facebookMessengerPageId = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> fcmCredentialSid = JsonNullable.<String>undefined();

  private JsonNullable<String> friendlyName = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> gcmCredentialSid = JsonNullable.<String>undefined();

  private JsonNullable<Object> links = JsonNullable.<Object>undefined();

  private JsonNullable<Boolean> logEnabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<@Pattern(regexp = "^MG[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> messagingServiceSid = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^IS[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> sid = JsonNullable.<String>undefined();

  private JsonNullable<URI> url = JsonNullable.<URI>undefined();

  public NotifyV1Service accountSid(String accountSid) {
    this.accountSid = JsonNullable.of(accountSid);
    return this;
  }

  /**
   * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Service resource.
   * @return accountSid
  */
  @Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "account_sid", description = "The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Service resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account_sid")
  public JsonNullable<@Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(JsonNullable<String> accountSid) {
    this.accountSid = accountSid;
  }

  public NotifyV1Service alexaSkillId(String alexaSkillId) {
    this.alexaSkillId = JsonNullable.of(alexaSkillId);
    return this;
  }

  /**
   * Deprecated.
   * @return alexaSkillId
  */
  
  @Schema(name = "alexa_skill_id", description = "Deprecated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alexa_skill_id")
  public JsonNullable<String> getAlexaSkillId() {
    return alexaSkillId;
  }

  public void setAlexaSkillId(JsonNullable<String> alexaSkillId) {
    this.alexaSkillId = alexaSkillId;
  }

  public NotifyV1Service apnCredentialSid(String apnCredentialSid) {
    this.apnCredentialSid = JsonNullable.of(apnCredentialSid);
    return this;
  }

  /**
   * The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for APN Bindings.
   * @return apnCredentialSid
  */
  @Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "apn_credential_sid", description = "The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for APN Bindings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apn_credential_sid")
  public JsonNullable<@Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getApnCredentialSid() {
    return apnCredentialSid;
  }

  public void setApnCredentialSid(JsonNullable<String> apnCredentialSid) {
    this.apnCredentialSid = apnCredentialSid;
  }

  public NotifyV1Service dateCreated(OffsetDateTime dateCreated) {
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

  public NotifyV1Service dateUpdated(OffsetDateTime dateUpdated) {
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

  public NotifyV1Service defaultAlexaNotificationProtocolVersion(String defaultAlexaNotificationProtocolVersion) {
    this.defaultAlexaNotificationProtocolVersion = JsonNullable.of(defaultAlexaNotificationProtocolVersion);
    return this;
  }

  /**
   * Deprecated.
   * @return defaultAlexaNotificationProtocolVersion
  */
  
  @Schema(name = "default_alexa_notification_protocol_version", description = "Deprecated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_alexa_notification_protocol_version")
  public JsonNullable<String> getDefaultAlexaNotificationProtocolVersion() {
    return defaultAlexaNotificationProtocolVersion;
  }

  public void setDefaultAlexaNotificationProtocolVersion(JsonNullable<String> defaultAlexaNotificationProtocolVersion) {
    this.defaultAlexaNotificationProtocolVersion = defaultAlexaNotificationProtocolVersion;
  }

  public NotifyV1Service defaultApnNotificationProtocolVersion(String defaultApnNotificationProtocolVersion) {
    this.defaultApnNotificationProtocolVersion = JsonNullable.of(defaultApnNotificationProtocolVersion);
    return this;
  }

  /**
   * The protocol version to use for sending APNS notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
   * @return defaultApnNotificationProtocolVersion
  */
  
  @Schema(name = "default_apn_notification_protocol_version", description = "The protocol version to use for sending APNS notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_apn_notification_protocol_version")
  public JsonNullable<String> getDefaultApnNotificationProtocolVersion() {
    return defaultApnNotificationProtocolVersion;
  }

  public void setDefaultApnNotificationProtocolVersion(JsonNullable<String> defaultApnNotificationProtocolVersion) {
    this.defaultApnNotificationProtocolVersion = defaultApnNotificationProtocolVersion;
  }

  public NotifyV1Service defaultFcmNotificationProtocolVersion(String defaultFcmNotificationProtocolVersion) {
    this.defaultFcmNotificationProtocolVersion = JsonNullable.of(defaultFcmNotificationProtocolVersion);
    return this;
  }

  /**
   * The protocol version to use for sending FCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
   * @return defaultFcmNotificationProtocolVersion
  */
  
  @Schema(name = "default_fcm_notification_protocol_version", description = "The protocol version to use for sending FCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_fcm_notification_protocol_version")
  public JsonNullable<String> getDefaultFcmNotificationProtocolVersion() {
    return defaultFcmNotificationProtocolVersion;
  }

  public void setDefaultFcmNotificationProtocolVersion(JsonNullable<String> defaultFcmNotificationProtocolVersion) {
    this.defaultFcmNotificationProtocolVersion = defaultFcmNotificationProtocolVersion;
  }

  public NotifyV1Service defaultGcmNotificationProtocolVersion(String defaultGcmNotificationProtocolVersion) {
    this.defaultGcmNotificationProtocolVersion = JsonNullable.of(defaultGcmNotificationProtocolVersion);
    return this;
  }

  /**
   * The protocol version to use for sending GCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
   * @return defaultGcmNotificationProtocolVersion
  */
  
  @Schema(name = "default_gcm_notification_protocol_version", description = "The protocol version to use for sending GCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_gcm_notification_protocol_version")
  public JsonNullable<String> getDefaultGcmNotificationProtocolVersion() {
    return defaultGcmNotificationProtocolVersion;
  }

  public void setDefaultGcmNotificationProtocolVersion(JsonNullable<String> defaultGcmNotificationProtocolVersion) {
    this.defaultGcmNotificationProtocolVersion = defaultGcmNotificationProtocolVersion;
  }

  public NotifyV1Service deliveryCallbackEnabled(Boolean deliveryCallbackEnabled) {
    this.deliveryCallbackEnabled = JsonNullable.of(deliveryCallbackEnabled);
    return this;
  }

  /**
   * Callback configuration that enables delivery callbacks, default false
   * @return deliveryCallbackEnabled
  */
  
  @Schema(name = "delivery_callback_enabled", description = "Callback configuration that enables delivery callbacks, default false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delivery_callback_enabled")
  public JsonNullable<Boolean> getDeliveryCallbackEnabled() {
    return deliveryCallbackEnabled;
  }

  public void setDeliveryCallbackEnabled(JsonNullable<Boolean> deliveryCallbackEnabled) {
    this.deliveryCallbackEnabled = deliveryCallbackEnabled;
  }

  public NotifyV1Service deliveryCallbackUrl(String deliveryCallbackUrl) {
    this.deliveryCallbackUrl = JsonNullable.of(deliveryCallbackUrl);
    return this;
  }

  /**
   * URL to send delivery status callback.
   * @return deliveryCallbackUrl
  */
  
  @Schema(name = "delivery_callback_url", description = "URL to send delivery status callback.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delivery_callback_url")
  public JsonNullable<String> getDeliveryCallbackUrl() {
    return deliveryCallbackUrl;
  }

  public void setDeliveryCallbackUrl(JsonNullable<String> deliveryCallbackUrl) {
    this.deliveryCallbackUrl = deliveryCallbackUrl;
  }

  public NotifyV1Service facebookMessengerPageId(String facebookMessengerPageId) {
    this.facebookMessengerPageId = JsonNullable.of(facebookMessengerPageId);
    return this;
  }

  /**
   * Deprecated.
   * @return facebookMessengerPageId
  */
  
  @Schema(name = "facebook_messenger_page_id", description = "Deprecated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facebook_messenger_page_id")
  public JsonNullable<String> getFacebookMessengerPageId() {
    return facebookMessengerPageId;
  }

  public void setFacebookMessengerPageId(JsonNullable<String> facebookMessengerPageId) {
    this.facebookMessengerPageId = facebookMessengerPageId;
  }

  public NotifyV1Service fcmCredentialSid(String fcmCredentialSid) {
    this.fcmCredentialSid = JsonNullable.of(fcmCredentialSid);
    return this;
  }

  /**
   * The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for FCM Bindings.
   * @return fcmCredentialSid
  */
  @Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "fcm_credential_sid", description = "The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for FCM Bindings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fcm_credential_sid")
  public JsonNullable<@Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getFcmCredentialSid() {
    return fcmCredentialSid;
  }

  public void setFcmCredentialSid(JsonNullable<String> fcmCredentialSid) {
    this.fcmCredentialSid = fcmCredentialSid;
  }

  public NotifyV1Service friendlyName(String friendlyName) {
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

  public NotifyV1Service gcmCredentialSid(String gcmCredentialSid) {
    this.gcmCredentialSid = JsonNullable.of(gcmCredentialSid);
    return this;
  }

  /**
   * The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for GCM Bindings.
   * @return gcmCredentialSid
  */
  @Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "gcm_credential_sid", description = "The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for GCM Bindings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gcm_credential_sid")
  public JsonNullable<@Pattern(regexp = "^CR[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getGcmCredentialSid() {
    return gcmCredentialSid;
  }

  public void setGcmCredentialSid(JsonNullable<String> gcmCredentialSid) {
    this.gcmCredentialSid = gcmCredentialSid;
  }

  public NotifyV1Service links(Object links) {
    this.links = JsonNullable.of(links);
    return this;
  }

  /**
   * The URLs of the Binding, Notification, Segment, and User resources related to the service.
   * @return links
  */
  
  @Schema(name = "links", description = "The URLs of the Binding, Notification, Segment, and User resources related to the service.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public JsonNullable<Object> getLinks() {
    return links;
  }

  public void setLinks(JsonNullable<Object> links) {
    this.links = links;
  }

  public NotifyV1Service logEnabled(Boolean logEnabled) {
    this.logEnabled = JsonNullable.of(logEnabled);
    return this;
  }

  /**
   * Whether to log notifications. Can be: `true` or `false` and the default is `true`.
   * @return logEnabled
  */
  
  @Schema(name = "log_enabled", description = "Whether to log notifications. Can be: `true` or `false` and the default is `true`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("log_enabled")
  public JsonNullable<Boolean> getLogEnabled() {
    return logEnabled;
  }

  public void setLogEnabled(JsonNullable<Boolean> logEnabled) {
    this.logEnabled = logEnabled;
  }

  public NotifyV1Service messagingServiceSid(String messagingServiceSid) {
    this.messagingServiceSid = JsonNullable.of(messagingServiceSid);
    return this;
  }

  /**
   * The SID of the [Messaging Service](https://www.twilio.com/docs/sms/quickstart#messaging-services) to use for SMS Bindings. In order to send SMS notifications this parameter has to be set.
   * @return messagingServiceSid
  */
  @Pattern(regexp = "^MG[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "messaging_service_sid", description = "The SID of the [Messaging Service](https://www.twilio.com/docs/sms/quickstart#messaging-services) to use for SMS Bindings. In order to send SMS notifications this parameter has to be set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messaging_service_sid")
  public JsonNullable<@Pattern(regexp = "^MG[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getMessagingServiceSid() {
    return messagingServiceSid;
  }

  public void setMessagingServiceSid(JsonNullable<String> messagingServiceSid) {
    this.messagingServiceSid = messagingServiceSid;
  }

  public NotifyV1Service sid(String sid) {
    this.sid = JsonNullable.of(sid);
    return this;
  }

  /**
   * The unique string that we created to identify the Service resource.
   * @return sid
  */
  @Pattern(regexp = "^IS[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "sid", description = "The unique string that we created to identify the Service resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sid")
  public JsonNullable<@Pattern(regexp = "^IS[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getSid() {
    return sid;
  }

  public void setSid(JsonNullable<String> sid) {
    this.sid = sid;
  }

  public NotifyV1Service url(URI url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * The absolute URL of the Service resource.
   * @return url
  */
  @Valid 
  @Schema(name = "url", description = "The absolute URL of the Service resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    NotifyV1Service notifyV1Service = (NotifyV1Service) o;
    return equalsNullable(this.accountSid, notifyV1Service.accountSid) &&
        equalsNullable(this.alexaSkillId, notifyV1Service.alexaSkillId) &&
        equalsNullable(this.apnCredentialSid, notifyV1Service.apnCredentialSid) &&
        equalsNullable(this.dateCreated, notifyV1Service.dateCreated) &&
        equalsNullable(this.dateUpdated, notifyV1Service.dateUpdated) &&
        equalsNullable(this.defaultAlexaNotificationProtocolVersion, notifyV1Service.defaultAlexaNotificationProtocolVersion) &&
        equalsNullable(this.defaultApnNotificationProtocolVersion, notifyV1Service.defaultApnNotificationProtocolVersion) &&
        equalsNullable(this.defaultFcmNotificationProtocolVersion, notifyV1Service.defaultFcmNotificationProtocolVersion) &&
        equalsNullable(this.defaultGcmNotificationProtocolVersion, notifyV1Service.defaultGcmNotificationProtocolVersion) &&
        equalsNullable(this.deliveryCallbackEnabled, notifyV1Service.deliveryCallbackEnabled) &&
        equalsNullable(this.deliveryCallbackUrl, notifyV1Service.deliveryCallbackUrl) &&
        equalsNullable(this.facebookMessengerPageId, notifyV1Service.facebookMessengerPageId) &&
        equalsNullable(this.fcmCredentialSid, notifyV1Service.fcmCredentialSid) &&
        equalsNullable(this.friendlyName, notifyV1Service.friendlyName) &&
        equalsNullable(this.gcmCredentialSid, notifyV1Service.gcmCredentialSid) &&
        equalsNullable(this.links, notifyV1Service.links) &&
        equalsNullable(this.logEnabled, notifyV1Service.logEnabled) &&
        equalsNullable(this.messagingServiceSid, notifyV1Service.messagingServiceSid) &&
        equalsNullable(this.sid, notifyV1Service.sid) &&
        equalsNullable(this.url, notifyV1Service.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accountSid), hashCodeNullable(alexaSkillId), hashCodeNullable(apnCredentialSid), hashCodeNullable(dateCreated), hashCodeNullable(dateUpdated), hashCodeNullable(defaultAlexaNotificationProtocolVersion), hashCodeNullable(defaultApnNotificationProtocolVersion), hashCodeNullable(defaultFcmNotificationProtocolVersion), hashCodeNullable(defaultGcmNotificationProtocolVersion), hashCodeNullable(deliveryCallbackEnabled), hashCodeNullable(deliveryCallbackUrl), hashCodeNullable(facebookMessengerPageId), hashCodeNullable(fcmCredentialSid), hashCodeNullable(friendlyName), hashCodeNullable(gcmCredentialSid), hashCodeNullable(links), hashCodeNullable(logEnabled), hashCodeNullable(messagingServiceSid), hashCodeNullable(sid), hashCodeNullable(url));
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
    sb.append("class NotifyV1Service {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    alexaSkillId: ").append(toIndentedString(alexaSkillId)).append("\n");
    sb.append("    apnCredentialSid: ").append(toIndentedString(apnCredentialSid)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    defaultAlexaNotificationProtocolVersion: ").append(toIndentedString(defaultAlexaNotificationProtocolVersion)).append("\n");
    sb.append("    defaultApnNotificationProtocolVersion: ").append(toIndentedString(defaultApnNotificationProtocolVersion)).append("\n");
    sb.append("    defaultFcmNotificationProtocolVersion: ").append(toIndentedString(defaultFcmNotificationProtocolVersion)).append("\n");
    sb.append("    defaultGcmNotificationProtocolVersion: ").append(toIndentedString(defaultGcmNotificationProtocolVersion)).append("\n");
    sb.append("    deliveryCallbackEnabled: ").append(toIndentedString(deliveryCallbackEnabled)).append("\n");
    sb.append("    deliveryCallbackUrl: ").append(toIndentedString(deliveryCallbackUrl)).append("\n");
    sb.append("    facebookMessengerPageId: ").append(toIndentedString(facebookMessengerPageId)).append("\n");
    sb.append("    fcmCredentialSid: ").append(toIndentedString(fcmCredentialSid)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    gcmCredentialSid: ").append(toIndentedString(gcmCredentialSid)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    logEnabled: ").append(toIndentedString(logEnabled)).append("\n");
    sb.append("    messagingServiceSid: ").append(toIndentedString(messagingServiceSid)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
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

