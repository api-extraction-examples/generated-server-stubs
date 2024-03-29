/*
 * Twilio - Notify
 *
 * This is the public Twilio REST API.
 *
 * The version of the OpenAPI document: 1.52.0
 * Contact: support@twilio.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class NotifyV1Service : IEquatable<NotifyV1Service>
    {
        /// <summary>
        /// The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Service resource.
        /// </summary>
        /// <value>The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Service resource.</value>
        [RegularExpression("^AC[0-9a-fA-F]{32}$")]
        [StringLength(34, MinimumLength=34)]
        [DataMember(Name="account_sid", EmitDefaultValue=true)]
        public string AccountSid { get; set; }

        /// <summary>
        /// Deprecated.
        /// </summary>
        /// <value>Deprecated.</value>
        [DataMember(Name="alexa_skill_id", EmitDefaultValue=true)]
        public string AlexaSkillId { get; set; }

        /// <summary>
        /// The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for APN Bindings.
        /// </summary>
        /// <value>The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for APN Bindings.</value>
        [RegularExpression("^CR[0-9a-fA-F]{32}$")]
        [StringLength(34, MinimumLength=34)]
        [DataMember(Name="apn_credential_sid", EmitDefaultValue=true)]
        public string ApnCredentialSid { get; set; }

        /// <summary>
        /// The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
        /// </summary>
        /// <value>The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.</value>
        [DataMember(Name="date_created", EmitDefaultValue=true)]
        public DateTime? DateCreated { get; set; }

        /// <summary>
        /// The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.
        /// </summary>
        /// <value>The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.</value>
        [DataMember(Name="date_updated", EmitDefaultValue=true)]
        public DateTime? DateUpdated { get; set; }

        /// <summary>
        /// Deprecated.
        /// </summary>
        /// <value>Deprecated.</value>
        [DataMember(Name="default_alexa_notification_protocol_version", EmitDefaultValue=true)]
        public string DefaultAlexaNotificationProtocolVersion { get; set; }

        /// <summary>
        /// The protocol version to use for sending APNS notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
        /// </summary>
        /// <value>The protocol version to use for sending APNS notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.</value>
        [DataMember(Name="default_apn_notification_protocol_version", EmitDefaultValue=true)]
        public string DefaultApnNotificationProtocolVersion { get; set; }

        /// <summary>
        /// The protocol version to use for sending FCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
        /// </summary>
        /// <value>The protocol version to use for sending FCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.</value>
        [DataMember(Name="default_fcm_notification_protocol_version", EmitDefaultValue=true)]
        public string DefaultFcmNotificationProtocolVersion { get; set; }

        /// <summary>
        /// The protocol version to use for sending GCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
        /// </summary>
        /// <value>The protocol version to use for sending GCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.</value>
        [DataMember(Name="default_gcm_notification_protocol_version", EmitDefaultValue=true)]
        public string DefaultGcmNotificationProtocolVersion { get; set; }

        /// <summary>
        /// Callback configuration that enables delivery callbacks, default false
        /// </summary>
        /// <value>Callback configuration that enables delivery callbacks, default false</value>
        [DataMember(Name="delivery_callback_enabled", EmitDefaultValue=true)]
        public bool? DeliveryCallbackEnabled { get; set; }

        /// <summary>
        /// URL to send delivery status callback.
        /// </summary>
        /// <value>URL to send delivery status callback.</value>
        [DataMember(Name="delivery_callback_url", EmitDefaultValue=true)]
        public string DeliveryCallbackUrl { get; set; }

        /// <summary>
        /// Deprecated.
        /// </summary>
        /// <value>Deprecated.</value>
        [DataMember(Name="facebook_messenger_page_id", EmitDefaultValue=true)]
        public string FacebookMessengerPageId { get; set; }

        /// <summary>
        /// The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for FCM Bindings.
        /// </summary>
        /// <value>The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for FCM Bindings.</value>
        [RegularExpression("^CR[0-9a-fA-F]{32}$")]
        [StringLength(34, MinimumLength=34)]
        [DataMember(Name="fcm_credential_sid", EmitDefaultValue=true)]
        public string FcmCredentialSid { get; set; }

        /// <summary>
        /// The string that you assigned to describe the resource.
        /// </summary>
        /// <value>The string that you assigned to describe the resource.</value>
        [DataMember(Name="friendly_name", EmitDefaultValue=true)]
        public string FriendlyName { get; set; }

        /// <summary>
        /// The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for GCM Bindings.
        /// </summary>
        /// <value>The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for GCM Bindings.</value>
        [RegularExpression("^CR[0-9a-fA-F]{32}$")]
        [StringLength(34, MinimumLength=34)]
        [DataMember(Name="gcm_credential_sid", EmitDefaultValue=true)]
        public string GcmCredentialSid { get; set; }

        /// <summary>
        /// The URLs of the Binding, Notification, Segment, and User resources related to the service.
        /// </summary>
        /// <value>The URLs of the Binding, Notification, Segment, and User resources related to the service.</value>
        [DataMember(Name="links", EmitDefaultValue=true)]
        public Object Links { get; set; }

        /// <summary>
        /// Whether to log notifications. Can be: &#x60;true&#x60; or &#x60;false&#x60; and the default is &#x60;true&#x60;.
        /// </summary>
        /// <value>Whether to log notifications. Can be: &#x60;true&#x60; or &#x60;false&#x60; and the default is &#x60;true&#x60;.</value>
        [DataMember(Name="log_enabled", EmitDefaultValue=true)]
        public bool? LogEnabled { get; set; }

        /// <summary>
        /// The SID of the [Messaging Service](https://www.twilio.com/docs/sms/quickstart#messaging-services) to use for SMS Bindings. In order to send SMS notifications this parameter has to be set.
        /// </summary>
        /// <value>The SID of the [Messaging Service](https://www.twilio.com/docs/sms/quickstart#messaging-services) to use for SMS Bindings. In order to send SMS notifications this parameter has to be set.</value>
        [RegularExpression("^MG[0-9a-fA-F]{32}$")]
        [StringLength(34, MinimumLength=34)]
        [DataMember(Name="messaging_service_sid", EmitDefaultValue=true)]
        public string MessagingServiceSid { get; set; }

        /// <summary>
        /// The unique string that we created to identify the Service resource.
        /// </summary>
        /// <value>The unique string that we created to identify the Service resource.</value>
        [RegularExpression("^IS[0-9a-fA-F]{32}$")]
        [StringLength(34, MinimumLength=34)]
        [DataMember(Name="sid", EmitDefaultValue=true)]
        public string Sid { get; set; }

        /// <summary>
        /// The absolute URL of the Service resource.
        /// </summary>
        /// <value>The absolute URL of the Service resource.</value>
        [DataMember(Name="url", EmitDefaultValue=true)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NotifyV1Service {\n");
            sb.Append("  AccountSid: ").Append(AccountSid).Append("\n");
            sb.Append("  AlexaSkillId: ").Append(AlexaSkillId).Append("\n");
            sb.Append("  ApnCredentialSid: ").Append(ApnCredentialSid).Append("\n");
            sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
            sb.Append("  DateUpdated: ").Append(DateUpdated).Append("\n");
            sb.Append("  DefaultAlexaNotificationProtocolVersion: ").Append(DefaultAlexaNotificationProtocolVersion).Append("\n");
            sb.Append("  DefaultApnNotificationProtocolVersion: ").Append(DefaultApnNotificationProtocolVersion).Append("\n");
            sb.Append("  DefaultFcmNotificationProtocolVersion: ").Append(DefaultFcmNotificationProtocolVersion).Append("\n");
            sb.Append("  DefaultGcmNotificationProtocolVersion: ").Append(DefaultGcmNotificationProtocolVersion).Append("\n");
            sb.Append("  DeliveryCallbackEnabled: ").Append(DeliveryCallbackEnabled).Append("\n");
            sb.Append("  DeliveryCallbackUrl: ").Append(DeliveryCallbackUrl).Append("\n");
            sb.Append("  FacebookMessengerPageId: ").Append(FacebookMessengerPageId).Append("\n");
            sb.Append("  FcmCredentialSid: ").Append(FcmCredentialSid).Append("\n");
            sb.Append("  FriendlyName: ").Append(FriendlyName).Append("\n");
            sb.Append("  GcmCredentialSid: ").Append(GcmCredentialSid).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  LogEnabled: ").Append(LogEnabled).Append("\n");
            sb.Append("  MessagingServiceSid: ").Append(MessagingServiceSid).Append("\n");
            sb.Append("  Sid: ").Append(Sid).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((NotifyV1Service)obj);
        }

        /// <summary>
        /// Returns true if NotifyV1Service instances are equal
        /// </summary>
        /// <param name="other">Instance of NotifyV1Service to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NotifyV1Service other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AccountSid == other.AccountSid ||
                    AccountSid != null &&
                    AccountSid.Equals(other.AccountSid)
                ) && 
                (
                    AlexaSkillId == other.AlexaSkillId ||
                    AlexaSkillId != null &&
                    AlexaSkillId.Equals(other.AlexaSkillId)
                ) && 
                (
                    ApnCredentialSid == other.ApnCredentialSid ||
                    ApnCredentialSid != null &&
                    ApnCredentialSid.Equals(other.ApnCredentialSid)
                ) && 
                (
                    DateCreated == other.DateCreated ||
                    DateCreated != null &&
                    DateCreated.Equals(other.DateCreated)
                ) && 
                (
                    DateUpdated == other.DateUpdated ||
                    DateUpdated != null &&
                    DateUpdated.Equals(other.DateUpdated)
                ) && 
                (
                    DefaultAlexaNotificationProtocolVersion == other.DefaultAlexaNotificationProtocolVersion ||
                    DefaultAlexaNotificationProtocolVersion != null &&
                    DefaultAlexaNotificationProtocolVersion.Equals(other.DefaultAlexaNotificationProtocolVersion)
                ) && 
                (
                    DefaultApnNotificationProtocolVersion == other.DefaultApnNotificationProtocolVersion ||
                    DefaultApnNotificationProtocolVersion != null &&
                    DefaultApnNotificationProtocolVersion.Equals(other.DefaultApnNotificationProtocolVersion)
                ) && 
                (
                    DefaultFcmNotificationProtocolVersion == other.DefaultFcmNotificationProtocolVersion ||
                    DefaultFcmNotificationProtocolVersion != null &&
                    DefaultFcmNotificationProtocolVersion.Equals(other.DefaultFcmNotificationProtocolVersion)
                ) && 
                (
                    DefaultGcmNotificationProtocolVersion == other.DefaultGcmNotificationProtocolVersion ||
                    DefaultGcmNotificationProtocolVersion != null &&
                    DefaultGcmNotificationProtocolVersion.Equals(other.DefaultGcmNotificationProtocolVersion)
                ) && 
                (
                    DeliveryCallbackEnabled == other.DeliveryCallbackEnabled ||
                    DeliveryCallbackEnabled != null &&
                    DeliveryCallbackEnabled.Equals(other.DeliveryCallbackEnabled)
                ) && 
                (
                    DeliveryCallbackUrl == other.DeliveryCallbackUrl ||
                    DeliveryCallbackUrl != null &&
                    DeliveryCallbackUrl.Equals(other.DeliveryCallbackUrl)
                ) && 
                (
                    FacebookMessengerPageId == other.FacebookMessengerPageId ||
                    FacebookMessengerPageId != null &&
                    FacebookMessengerPageId.Equals(other.FacebookMessengerPageId)
                ) && 
                (
                    FcmCredentialSid == other.FcmCredentialSid ||
                    FcmCredentialSid != null &&
                    FcmCredentialSid.Equals(other.FcmCredentialSid)
                ) && 
                (
                    FriendlyName == other.FriendlyName ||
                    FriendlyName != null &&
                    FriendlyName.Equals(other.FriendlyName)
                ) && 
                (
                    GcmCredentialSid == other.GcmCredentialSid ||
                    GcmCredentialSid != null &&
                    GcmCredentialSid.Equals(other.GcmCredentialSid)
                ) && 
                (
                    Links == other.Links ||
                    Links != null &&
                    Links.Equals(other.Links)
                ) && 
                (
                    LogEnabled == other.LogEnabled ||
                    LogEnabled != null &&
                    LogEnabled.Equals(other.LogEnabled)
                ) && 
                (
                    MessagingServiceSid == other.MessagingServiceSid ||
                    MessagingServiceSid != null &&
                    MessagingServiceSid.Equals(other.MessagingServiceSid)
                ) && 
                (
                    Sid == other.Sid ||
                    Sid != null &&
                    Sid.Equals(other.Sid)
                ) && 
                (
                    Url == other.Url ||
                    Url != null &&
                    Url.Equals(other.Url)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (AccountSid != null)
                    hashCode = hashCode * 59 + AccountSid.GetHashCode();
                    if (AlexaSkillId != null)
                    hashCode = hashCode * 59 + AlexaSkillId.GetHashCode();
                    if (ApnCredentialSid != null)
                    hashCode = hashCode * 59 + ApnCredentialSid.GetHashCode();
                    if (DateCreated != null)
                    hashCode = hashCode * 59 + DateCreated.GetHashCode();
                    if (DateUpdated != null)
                    hashCode = hashCode * 59 + DateUpdated.GetHashCode();
                    if (DefaultAlexaNotificationProtocolVersion != null)
                    hashCode = hashCode * 59 + DefaultAlexaNotificationProtocolVersion.GetHashCode();
                    if (DefaultApnNotificationProtocolVersion != null)
                    hashCode = hashCode * 59 + DefaultApnNotificationProtocolVersion.GetHashCode();
                    if (DefaultFcmNotificationProtocolVersion != null)
                    hashCode = hashCode * 59 + DefaultFcmNotificationProtocolVersion.GetHashCode();
                    if (DefaultGcmNotificationProtocolVersion != null)
                    hashCode = hashCode * 59 + DefaultGcmNotificationProtocolVersion.GetHashCode();
                    if (DeliveryCallbackEnabled != null)
                    hashCode = hashCode * 59 + DeliveryCallbackEnabled.GetHashCode();
                    if (DeliveryCallbackUrl != null)
                    hashCode = hashCode * 59 + DeliveryCallbackUrl.GetHashCode();
                    if (FacebookMessengerPageId != null)
                    hashCode = hashCode * 59 + FacebookMessengerPageId.GetHashCode();
                    if (FcmCredentialSid != null)
                    hashCode = hashCode * 59 + FcmCredentialSid.GetHashCode();
                    if (FriendlyName != null)
                    hashCode = hashCode * 59 + FriendlyName.GetHashCode();
                    if (GcmCredentialSid != null)
                    hashCode = hashCode * 59 + GcmCredentialSid.GetHashCode();
                    if (Links != null)
                    hashCode = hashCode * 59 + Links.GetHashCode();
                    if (LogEnabled != null)
                    hashCode = hashCode * 59 + LogEnabled.GetHashCode();
                    if (MessagingServiceSid != null)
                    hashCode = hashCode * 59 + MessagingServiceSid.GetHashCode();
                    if (Sid != null)
                    hashCode = hashCode * 59 + Sid.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(NotifyV1Service left, NotifyV1Service right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(NotifyV1Service left, NotifyV1Service right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
