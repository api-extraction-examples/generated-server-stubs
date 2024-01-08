package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NotificationEnumPriority;
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
 * NotifyV1ServiceNotification
 */

@JsonTypeName("notify.v1.service.notification")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:49.917798-04:00[America/Lower_Princes]")
public class NotifyV1ServiceNotification {

  private JsonNullable<@Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> accountSid = JsonNullable.<String>undefined();

  private JsonNullable<String> action = JsonNullable.<String>undefined();

  private JsonNullable<Object> alexa = JsonNullable.<Object>undefined();

  private JsonNullable<Object> apn = JsonNullable.<Object>undefined();

  private JsonNullable<String> body = JsonNullable.<String>undefined();

  private JsonNullable<Object> data = JsonNullable.<Object>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateCreated = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Object> facebookMessenger = JsonNullable.<Object>undefined();

  private JsonNullable<Object> fcm = JsonNullable.<Object>undefined();

  private JsonNullable<Object> gcm = JsonNullable.<Object>undefined();

  @Valid
  private JsonNullable<List<String>> identities = JsonNullable.<List<String>>undefined();

  private NotificationEnumPriority priority;

  @Valid
  private JsonNullable<List<String>> segments = JsonNullable.<List<String>>undefined();

  private JsonNullable<@Pattern(regexp = "^IS[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> serviceSid = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^NT[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> sid = JsonNullable.<String>undefined();

  private JsonNullable<Object> sms = JsonNullable.<Object>undefined();

  private JsonNullable<String> sound = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> title = JsonNullable.<String>undefined();

  private JsonNullable<Integer> ttl = JsonNullable.<Integer>undefined();

  public NotifyV1ServiceNotification accountSid(String accountSid) {
    this.accountSid = JsonNullable.of(accountSid);
    return this;
  }

  /**
   * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Notification resource.
   * @return accountSid
  */
  @Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "account_sid", description = "The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Notification resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account_sid")
  public JsonNullable<@Pattern(regexp = "^AC[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(JsonNullable<String> accountSid) {
    this.accountSid = accountSid;
  }

  public NotifyV1ServiceNotification action(String action) {
    this.action = JsonNullable.of(action);
    return this;
  }

  /**
   * The actions to display for the notification. For APNS, translates to the `aps.category` value. For GCM, translates to the `data.twi_action` value. For SMS, this parameter is not supported and is omitted from deliveries to those channels.
   * @return action
  */
  
  @Schema(name = "action", description = "The actions to display for the notification. For APNS, translates to the `aps.category` value. For GCM, translates to the `data.twi_action` value. For SMS, this parameter is not supported and is omitted from deliveries to those channels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public JsonNullable<String> getAction() {
    return action;
  }

  public void setAction(JsonNullable<String> action) {
    this.action = action;
  }

  public NotifyV1ServiceNotification alexa(Object alexa) {
    this.alexa = JsonNullable.of(alexa);
    return this;
  }

  /**
   * Deprecated.
   * @return alexa
  */
  
  @Schema(name = "alexa", description = "Deprecated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alexa")
  public JsonNullable<Object> getAlexa() {
    return alexa;
  }

  public void setAlexa(JsonNullable<Object> alexa) {
    this.alexa = alexa;
  }

  public NotifyV1ServiceNotification apn(Object apn) {
    this.apn = JsonNullable.of(apn);
    return this;
  }

  /**
   * The APNS-specific payload that overrides corresponding attributes in the generic payload for APNS Bindings. This property maps to the APNS `Payload` item, therefore the `aps` key must be used to change standard attributes. Adds custom key-value pairs to the root of the dictionary. See the [APNS documentation](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CommunicatingwithAPNs.html) for more details. We reserve keys that start with `twi_` for future use. Custom keys that start with `twi_` are not allowed.
   * @return apn
  */
  
  @Schema(name = "apn", description = "The APNS-specific payload that overrides corresponding attributes in the generic payload for APNS Bindings. This property maps to the APNS `Payload` item, therefore the `aps` key must be used to change standard attributes. Adds custom key-value pairs to the root of the dictionary. See the [APNS documentation](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CommunicatingwithAPNs.html) for more details. We reserve keys that start with `twi_` for future use. Custom keys that start with `twi_` are not allowed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apn")
  public JsonNullable<Object> getApn() {
    return apn;
  }

  public void setApn(JsonNullable<Object> apn) {
    this.apn = apn;
  }

  public NotifyV1ServiceNotification body(String body) {
    this.body = JsonNullable.of(body);
    return this;
  }

  /**
   * The notification text. For FCM and GCM, translates to `data.twi_body`. For APNS, translates to `aps.alert.body`. For SMS, translates to `body`. SMS requires either this `body` value, or `media_urls` attribute defined in the `sms` parameter of the notification.
   * @return body
  */
  
  @Schema(name = "body", description = "The notification text. For FCM and GCM, translates to `data.twi_body`. For APNS, translates to `aps.alert.body`. For SMS, translates to `body`. SMS requires either this `body` value, or `media_urls` attribute defined in the `sms` parameter of the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public JsonNullable<String> getBody() {
    return body;
  }

  public void setBody(JsonNullable<String> body) {
    this.body = body;
  }

  public NotifyV1ServiceNotification data(Object data) {
    this.data = JsonNullable.of(data);
    return this;
  }

  /**
   * The custom key-value pairs of the notification's payload. For FCM and GCM, this value translates to `data` in the FCM and GCM payloads. FCM and GCM [reserve certain keys](https://firebase.google.com/docs/cloud-messaging/http-server-ref) that cannot be used in those channels. For APNS, attributes of `data` are inserted into the APNS payload as custom properties outside of the `aps` dictionary. In all channels, we reserve keys that start with `twi_` for future use. Custom keys that start with `twi_` are not allowed and are rejected as 400 Bad request with no delivery attempted. For SMS, this parameter is not supported and is omitted from deliveries to those channels.
   * @return data
  */
  
  @Schema(name = "data", description = "The custom key-value pairs of the notification's payload. For FCM and GCM, this value translates to `data` in the FCM and GCM payloads. FCM and GCM [reserve certain keys](https://firebase.google.com/docs/cloud-messaging/http-server-ref) that cannot be used in those channels. For APNS, attributes of `data` are inserted into the APNS payload as custom properties outside of the `aps` dictionary. In all channels, we reserve keys that start with `twi_` for future use. Custom keys that start with `twi_` are not allowed and are rejected as 400 Bad request with no delivery attempted. For SMS, this parameter is not supported and is omitted from deliveries to those channels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public JsonNullable<Object> getData() {
    return data;
  }

  public void setData(JsonNullable<Object> data) {
    this.data = data;
  }

  public NotifyV1ServiceNotification dateCreated(OffsetDateTime dateCreated) {
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

  public NotifyV1ServiceNotification facebookMessenger(Object facebookMessenger) {
    this.facebookMessenger = JsonNullable.of(facebookMessenger);
    return this;
  }

  /**
   * Deprecated.
   * @return facebookMessenger
  */
  
  @Schema(name = "facebook_messenger", description = "Deprecated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facebook_messenger")
  public JsonNullable<Object> getFacebookMessenger() {
    return facebookMessenger;
  }

  public void setFacebookMessenger(JsonNullable<Object> facebookMessenger) {
    this.facebookMessenger = facebookMessenger;
  }

  public NotifyV1ServiceNotification fcm(Object fcm) {
    this.fcm = JsonNullable.of(fcm);
    return this;
  }

  /**
   * The FCM-specific payload that overrides corresponding attributes in the generic payload for FCM Bindings. This property maps to the root JSON dictionary. See the [FCM documentation](https://firebase.google.com/docs/cloud-messaging/http-server-ref#downstream) for more details. Target parameters `to`, `registration_ids`, `condition`, and `notification_key` are not allowed in this parameter. We reserve keys that start with `twi_` for future use. Custom keys that start with `twi_` are not allowed. FCM also [reserves certain keys](https://firebase.google.com/docs/cloud-messaging/http-server-ref), which cannot be used in that channel.
   * @return fcm
  */
  
  @Schema(name = "fcm", description = "The FCM-specific payload that overrides corresponding attributes in the generic payload for FCM Bindings. This property maps to the root JSON dictionary. See the [FCM documentation](https://firebase.google.com/docs/cloud-messaging/http-server-ref#downstream) for more details. Target parameters `to`, `registration_ids`, `condition`, and `notification_key` are not allowed in this parameter. We reserve keys that start with `twi_` for future use. Custom keys that start with `twi_` are not allowed. FCM also [reserves certain keys](https://firebase.google.com/docs/cloud-messaging/http-server-ref), which cannot be used in that channel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fcm")
  public JsonNullable<Object> getFcm() {
    return fcm;
  }

  public void setFcm(JsonNullable<Object> fcm) {
    this.fcm = fcm;
  }

  public NotifyV1ServiceNotification gcm(Object gcm) {
    this.gcm = JsonNullable.of(gcm);
    return this;
  }

  /**
   * The GCM-specific payload that overrides corresponding attributes in the generic payload for GCM Bindings.  This property maps to the root JSON dictionary. Target parameters `to`, `registration_ids`, and `notification_key` are not allowed. We reserve keys that start with `twi_` for future use. Custom keys that start with `twi_` are not allowed.
   * @return gcm
  */
  
  @Schema(name = "gcm", description = "The GCM-specific payload that overrides corresponding attributes in the generic payload for GCM Bindings.  This property maps to the root JSON dictionary. Target parameters `to`, `registration_ids`, and `notification_key` are not allowed. We reserve keys that start with `twi_` for future use. Custom keys that start with `twi_` are not allowed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gcm")
  public JsonNullable<Object> getGcm() {
    return gcm;
  }

  public void setGcm(JsonNullable<Object> gcm) {
    this.gcm = gcm;
  }

  public NotifyV1ServiceNotification identities(List<String> identities) {
    this.identities = JsonNullable.of(identities);
    return this;
  }

  public NotifyV1ServiceNotification addIdentitiesItem(String identitiesItem) {
    if (this.identities == null || !this.identities.isPresent()) {
      this.identities = JsonNullable.of(new ArrayList<>());
    }
    this.identities.get().add(identitiesItem);
    return this;
  }

  /**
   * The list of `identity` values of the Users to notify. We will attempt to deliver notifications only to Bindings with an identity in this list.
   * @return identities
  */
  
  @Schema(name = "identities", description = "The list of `identity` values of the Users to notify. We will attempt to deliver notifications only to Bindings with an identity in this list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identities")
  public JsonNullable<List<String>> getIdentities() {
    return identities;
  }

  public void setIdentities(JsonNullable<List<String>> identities) {
    this.identities = identities;
  }

  public NotifyV1ServiceNotification priority(NotificationEnumPriority priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
  @Valid 
  @Schema(name = "priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public NotificationEnumPriority getPriority() {
    return priority;
  }

  public void setPriority(NotificationEnumPriority priority) {
    this.priority = priority;
  }

  public NotifyV1ServiceNotification segments(List<String> segments) {
    this.segments = JsonNullable.of(segments);
    return this;
  }

  public NotifyV1ServiceNotification addSegmentsItem(String segmentsItem) {
    if (this.segments == null || !this.segments.isPresent()) {
      this.segments = JsonNullable.of(new ArrayList<>());
    }
    this.segments.get().add(segmentsItem);
    return this;
  }

  /**
   * The list of Segments to notify. The [Segment](https://www.twilio.com/docs/notify/api/segment-resource) resource is deprecated. Use the `tags` property, instead.
   * @return segments
  */
  
  @Schema(name = "segments", description = "The list of Segments to notify. The [Segment](https://www.twilio.com/docs/notify/api/segment-resource) resource is deprecated. Use the `tags` property, instead.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("segments")
  public JsonNullable<List<String>> getSegments() {
    return segments;
  }

  public void setSegments(JsonNullable<List<String>> segments) {
    this.segments = segments;
  }

  public NotifyV1ServiceNotification serviceSid(String serviceSid) {
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

  public NotifyV1ServiceNotification sid(String sid) {
    this.sid = JsonNullable.of(sid);
    return this;
  }

  /**
   * The unique string that we created to identify the Notification resource.
   * @return sid
  */
  @Pattern(regexp = "^NT[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) 
  @Schema(name = "sid", description = "The unique string that we created to identify the Notification resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sid")
  public JsonNullable<@Pattern(regexp = "^NT[0-9a-fA-F]{32}$") @Size(min = 34, max = 34) String> getSid() {
    return sid;
  }

  public void setSid(JsonNullable<String> sid) {
    this.sid = sid;
  }

  public NotifyV1ServiceNotification sms(Object sms) {
    this.sms = JsonNullable.of(sms);
    return this;
  }

  /**
   * The SMS-specific payload that overrides corresponding attributes in the generic payload for SMS Bindings.  Each attribute in this value maps to the corresponding `form` parameter of the Twilio [Message](https://www.twilio.com/docs/sms/api/message-resource) resource.  These parameters of the Message resource are supported in snake case format: `body`, `media_urls`, `status_callback`, and `max_price`.  The `status_callback` parameter overrides the corresponding parameter in the messaging service, if configured. The `media_urls` property expects a JSON array.
   * @return sms
  */
  
  @Schema(name = "sms", description = "The SMS-specific payload that overrides corresponding attributes in the generic payload for SMS Bindings.  Each attribute in this value maps to the corresponding `form` parameter of the Twilio [Message](https://www.twilio.com/docs/sms/api/message-resource) resource.  These parameters of the Message resource are supported in snake case format: `body`, `media_urls`, `status_callback`, and `max_price`.  The `status_callback` parameter overrides the corresponding parameter in the messaging service, if configured. The `media_urls` property expects a JSON array.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sms")
  public JsonNullable<Object> getSms() {
    return sms;
  }

  public void setSms(JsonNullable<Object> sms) {
    this.sms = sms;
  }

  public NotifyV1ServiceNotification sound(String sound) {
    this.sound = JsonNullable.of(sound);
    return this;
  }

  /**
   * The name of the sound to be played for the notification. For FCM and GCM, this Translates to `data.twi_sound`.  For APNS, this translates to `aps.sound`.  SMS does not support this property.
   * @return sound
  */
  
  @Schema(name = "sound", description = "The name of the sound to be played for the notification. For FCM and GCM, this Translates to `data.twi_sound`.  For APNS, this translates to `aps.sound`.  SMS does not support this property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sound")
  public JsonNullable<String> getSound() {
    return sound;
  }

  public void setSound(JsonNullable<String> sound) {
    this.sound = sound;
  }

  public NotifyV1ServiceNotification tags(List<String> tags) {
    this.tags = JsonNullable.of(tags);
    return this;
  }

  public NotifyV1ServiceNotification addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.of(new ArrayList<>());
    }
    this.tags.get().add(tagsItem);
    return this;
  }

  /**
   * The tags that select the Bindings to notify. Notifications will be attempted only to Bindings that have all of the tags listed in this property.
   * @return tags
  */
  
  @Schema(name = "tags", description = "The tags that select the Bindings to notify. Notifications will be attempted only to Bindings that have all of the tags listed in this property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public JsonNullable<List<String>> getTags() {
    return tags;
  }

  public void setTags(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public NotifyV1ServiceNotification title(String title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * The notification title. For FCM and GCM, this translates to the `data.twi_title` value. For APNS, this translates to the `aps.alert.title` value. SMS does not support this property. This field is not visible on iOS phones and tablets but appears on Apple Watch and Android devices.
   * @return title
  */
  
  @Schema(name = "title", description = "The notification title. For FCM and GCM, this translates to the `data.twi_title` value. For APNS, this translates to the `aps.alert.title` value. SMS does not support this property. This field is not visible on iOS phones and tablets but appears on Apple Watch and Android devices.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public JsonNullable<String> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<String> title) {
    this.title = title;
  }

  public NotifyV1ServiceNotification ttl(Integer ttl) {
    this.ttl = JsonNullable.of(ttl);
    return this;
  }

  /**
   * How long, in seconds, the notification is valid. Can be an integer between 0 and 2,419,200, which is 4 weeks, the default and the maximum supported time to live (TTL). Delivery should be attempted if the device is offline until the TTL elapses. Zero means that the notification delivery is attempted immediately, only once, and is not stored for future delivery. SMS does not support this property.
   * @return ttl
  */
  
  @Schema(name = "ttl", description = "How long, in seconds, the notification is valid. Can be an integer between 0 and 2,419,200, which is 4 weeks, the default and the maximum supported time to live (TTL). Delivery should be attempted if the device is offline until the TTL elapses. Zero means that the notification delivery is attempted immediately, only once, and is not stored for future delivery. SMS does not support this property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ttl")
  public JsonNullable<Integer> getTtl() {
    return ttl;
  }

  public void setTtl(JsonNullable<Integer> ttl) {
    this.ttl = ttl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyV1ServiceNotification notifyV1ServiceNotification = (NotifyV1ServiceNotification) o;
    return equalsNullable(this.accountSid, notifyV1ServiceNotification.accountSid) &&
        equalsNullable(this.action, notifyV1ServiceNotification.action) &&
        equalsNullable(this.alexa, notifyV1ServiceNotification.alexa) &&
        equalsNullable(this.apn, notifyV1ServiceNotification.apn) &&
        equalsNullable(this.body, notifyV1ServiceNotification.body) &&
        equalsNullable(this.data, notifyV1ServiceNotification.data) &&
        equalsNullable(this.dateCreated, notifyV1ServiceNotification.dateCreated) &&
        equalsNullable(this.facebookMessenger, notifyV1ServiceNotification.facebookMessenger) &&
        equalsNullable(this.fcm, notifyV1ServiceNotification.fcm) &&
        equalsNullable(this.gcm, notifyV1ServiceNotification.gcm) &&
        equalsNullable(this.identities, notifyV1ServiceNotification.identities) &&
        Objects.equals(this.priority, notifyV1ServiceNotification.priority) &&
        equalsNullable(this.segments, notifyV1ServiceNotification.segments) &&
        equalsNullable(this.serviceSid, notifyV1ServiceNotification.serviceSid) &&
        equalsNullable(this.sid, notifyV1ServiceNotification.sid) &&
        equalsNullable(this.sms, notifyV1ServiceNotification.sms) &&
        equalsNullable(this.sound, notifyV1ServiceNotification.sound) &&
        equalsNullable(this.tags, notifyV1ServiceNotification.tags) &&
        equalsNullable(this.title, notifyV1ServiceNotification.title) &&
        equalsNullable(this.ttl, notifyV1ServiceNotification.ttl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accountSid), hashCodeNullable(action), hashCodeNullable(alexa), hashCodeNullable(apn), hashCodeNullable(body), hashCodeNullable(data), hashCodeNullable(dateCreated), hashCodeNullable(facebookMessenger), hashCodeNullable(fcm), hashCodeNullable(gcm), hashCodeNullable(identities), priority, hashCodeNullable(segments), hashCodeNullable(serviceSid), hashCodeNullable(sid), hashCodeNullable(sms), hashCodeNullable(sound), hashCodeNullable(tags), hashCodeNullable(title), hashCodeNullable(ttl));
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
    sb.append("class NotifyV1ServiceNotification {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alexa: ").append(toIndentedString(alexa)).append("\n");
    sb.append("    apn: ").append(toIndentedString(apn)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    facebookMessenger: ").append(toIndentedString(facebookMessenger)).append("\n");
    sb.append("    fcm: ").append(toIndentedString(fcm)).append("\n");
    sb.append("    gcm: ").append(toIndentedString(gcm)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    serviceSid: ").append(toIndentedString(serviceSid)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    sound: ").append(toIndentedString(sound)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

