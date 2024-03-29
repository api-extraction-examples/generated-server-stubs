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
    public partial class NotifyV1ServiceBinding : IEquatable<NotifyV1ServiceBinding>
    {
        /// <summary>
        /// The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Binding resource.
        /// </summary>
        /// <value>The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Binding resource.</value>
        [RegularExpression("^AC[0-9a-fA-F]{32}$")]
        [StringLength(34, MinimumLength=34)]
        [DataMember(Name="account_sid", EmitDefaultValue=true)]
        public string AccountSid { get; set; }

        /// <summary>
        /// The channel-specific address. For APNS, the device token. For FCM and GCM, the registration token. For SMS, a phone number in E.164 format. For Facebook Messenger, the Messenger ID of the user or a phone number in E.164 format.
        /// </summary>
        /// <value>The channel-specific address. For APNS, the device token. For FCM and GCM, the registration token. For SMS, a phone number in E.164 format. For Facebook Messenger, the Messenger ID of the user or a phone number in E.164 format.</value>
        [DataMember(Name="address", EmitDefaultValue=true)]
        public string Address { get; set; }

        /// <summary>
        /// The transport technology to use for the Binding. Can be: &#x60;apn&#x60;, &#x60;fcm&#x60;, &#x60;gcm&#x60;, &#x60;sms&#x60;, or &#x60;facebook-messenger&#x60;.
        /// </summary>
        /// <value>The transport technology to use for the Binding. Can be: &#x60;apn&#x60;, &#x60;fcm&#x60;, &#x60;gcm&#x60;, &#x60;sms&#x60;, or &#x60;facebook-messenger&#x60;.</value>
        [DataMember(Name="binding_type", EmitDefaultValue=true)]
        public string BindingType { get; set; }

        /// <summary>
        /// The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) resource to be used to send notifications to this Binding. If present, this overrides the Credential specified in the Service resource. Applicable only to &#x60;apn&#x60;, &#x60;fcm&#x60;, and &#x60;gcm&#x60; type Bindings.
        /// </summary>
        /// <value>The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) resource to be used to send notifications to this Binding. If present, this overrides the Credential specified in the Service resource. Applicable only to &#x60;apn&#x60;, &#x60;fcm&#x60;, and &#x60;gcm&#x60; type Bindings.</value>
        [RegularExpression("^CR[0-9a-fA-F]{32}$")]
        [StringLength(34, MinimumLength=34)]
        [DataMember(Name="credential_sid", EmitDefaultValue=true)]
        public string CredentialSid { get; set; }

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
        [DataMember(Name="endpoint", EmitDefaultValue=true)]
        public string Endpoint { get; set; }

        /// <summary>
        /// The &#x60;identity&#x60; value that uniquely identifies the resource&#39;s [User](https://www.twilio.com/docs/chat/rest/user-resource) within the [Service](https://www.twilio.com/docs/notify/api/service-resource). Up to 20 Bindings can be created for the same Identity in a given Service.
        /// </summary>
        /// <value>The &#x60;identity&#x60; value that uniquely identifies the resource&#39;s [User](https://www.twilio.com/docs/chat/rest/user-resource) within the [Service](https://www.twilio.com/docs/notify/api/service-resource). Up to 20 Bindings can be created for the same Identity in a given Service.</value>
        [DataMember(Name="identity", EmitDefaultValue=true)]
        public string Identity { get; set; }

        /// <summary>
        /// The URLs of related resources.
        /// </summary>
        /// <value>The URLs of related resources.</value>
        [DataMember(Name="links", EmitDefaultValue=true)]
        public Object Links { get; set; }

        /// <summary>
        /// The protocol version to use to send the notification. This defaults to the value of &#x60;default_xxxx_notification_protocol_version&#x60; in the [Service](https://www.twilio.com/docs/notify/api/service-resource) for the protocol. The current version is &#x60;\&quot;3\&quot;&#x60; for &#x60;apn&#x60;, &#x60;fcm&#x60;, and &#x60;gcm&#x60; type Bindings. The parameter is not applicable to &#x60;sms&#x60; and &#x60;facebook-messenger&#x60; type Bindings as the data format is fixed.
        /// </summary>
        /// <value>The protocol version to use to send the notification. This defaults to the value of &#x60;default_xxxx_notification_protocol_version&#x60; in the [Service](https://www.twilio.com/docs/notify/api/service-resource) for the protocol. The current version is &#x60;\&quot;3\&quot;&#x60; for &#x60;apn&#x60;, &#x60;fcm&#x60;, and &#x60;gcm&#x60; type Bindings. The parameter is not applicable to &#x60;sms&#x60; and &#x60;facebook-messenger&#x60; type Bindings as the data format is fixed.</value>
        [DataMember(Name="notification_protocol_version", EmitDefaultValue=true)]
        public string NotificationProtocolVersion { get; set; }

        /// <summary>
        /// The SID of the [Service](https://www.twilio.com/docs/notify/api/service-resource) the resource is associated with.
        /// </summary>
        /// <value>The SID of the [Service](https://www.twilio.com/docs/notify/api/service-resource) the resource is associated with.</value>
        [RegularExpression("^IS[0-9a-fA-F]{32}$")]
        [StringLength(34, MinimumLength=34)]
        [DataMember(Name="service_sid", EmitDefaultValue=true)]
        public string ServiceSid { get; set; }

        /// <summary>
        /// The unique string that we created to identify the Binding resource.
        /// </summary>
        /// <value>The unique string that we created to identify the Binding resource.</value>
        [RegularExpression("^BS[0-9a-fA-F]{32}$")]
        [StringLength(34, MinimumLength=34)]
        [DataMember(Name="sid", EmitDefaultValue=true)]
        public string Sid { get; set; }

        /// <summary>
        /// The list of tags associated with this Binding. Tags can be used to select the Bindings to use when sending a notification. Maximum 20 tags are allowed.
        /// </summary>
        /// <value>The list of tags associated with this Binding. Tags can be used to select the Bindings to use when sending a notification. Maximum 20 tags are allowed.</value>
        [DataMember(Name="tags", EmitDefaultValue=true)]
        public List<string> Tags { get; set; }

        /// <summary>
        /// The absolute URL of the Binding resource.
        /// </summary>
        /// <value>The absolute URL of the Binding resource.</value>
        [DataMember(Name="url", EmitDefaultValue=true)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NotifyV1ServiceBinding {\n");
            sb.Append("  AccountSid: ").Append(AccountSid).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  BindingType: ").Append(BindingType).Append("\n");
            sb.Append("  CredentialSid: ").Append(CredentialSid).Append("\n");
            sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
            sb.Append("  DateUpdated: ").Append(DateUpdated).Append("\n");
            sb.Append("  Endpoint: ").Append(Endpoint).Append("\n");
            sb.Append("  Identity: ").Append(Identity).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  NotificationProtocolVersion: ").Append(NotificationProtocolVersion).Append("\n");
            sb.Append("  ServiceSid: ").Append(ServiceSid).Append("\n");
            sb.Append("  Sid: ").Append(Sid).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
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
            return obj.GetType() == GetType() && Equals((NotifyV1ServiceBinding)obj);
        }

        /// <summary>
        /// Returns true if NotifyV1ServiceBinding instances are equal
        /// </summary>
        /// <param name="other">Instance of NotifyV1ServiceBinding to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NotifyV1ServiceBinding other)
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
                    Address == other.Address ||
                    Address != null &&
                    Address.Equals(other.Address)
                ) && 
                (
                    BindingType == other.BindingType ||
                    BindingType != null &&
                    BindingType.Equals(other.BindingType)
                ) && 
                (
                    CredentialSid == other.CredentialSid ||
                    CredentialSid != null &&
                    CredentialSid.Equals(other.CredentialSid)
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
                    Endpoint == other.Endpoint ||
                    Endpoint != null &&
                    Endpoint.Equals(other.Endpoint)
                ) && 
                (
                    Identity == other.Identity ||
                    Identity != null &&
                    Identity.Equals(other.Identity)
                ) && 
                (
                    Links == other.Links ||
                    Links != null &&
                    Links.Equals(other.Links)
                ) && 
                (
                    NotificationProtocolVersion == other.NotificationProtocolVersion ||
                    NotificationProtocolVersion != null &&
                    NotificationProtocolVersion.Equals(other.NotificationProtocolVersion)
                ) && 
                (
                    ServiceSid == other.ServiceSid ||
                    ServiceSid != null &&
                    ServiceSid.Equals(other.ServiceSid)
                ) && 
                (
                    Sid == other.Sid ||
                    Sid != null &&
                    Sid.Equals(other.Sid)
                ) && 
                (
                    Tags == other.Tags ||
                    Tags != null &&
                    other.Tags != null &&
                    Tags.SequenceEqual(other.Tags)
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
                    if (Address != null)
                    hashCode = hashCode * 59 + Address.GetHashCode();
                    if (BindingType != null)
                    hashCode = hashCode * 59 + BindingType.GetHashCode();
                    if (CredentialSid != null)
                    hashCode = hashCode * 59 + CredentialSid.GetHashCode();
                    if (DateCreated != null)
                    hashCode = hashCode * 59 + DateCreated.GetHashCode();
                    if (DateUpdated != null)
                    hashCode = hashCode * 59 + DateUpdated.GetHashCode();
                    if (Endpoint != null)
                    hashCode = hashCode * 59 + Endpoint.GetHashCode();
                    if (Identity != null)
                    hashCode = hashCode * 59 + Identity.GetHashCode();
                    if (Links != null)
                    hashCode = hashCode * 59 + Links.GetHashCode();
                    if (NotificationProtocolVersion != null)
                    hashCode = hashCode * 59 + NotificationProtocolVersion.GetHashCode();
                    if (ServiceSid != null)
                    hashCode = hashCode * 59 + ServiceSid.GetHashCode();
                    if (Sid != null)
                    hashCode = hashCode * 59 + Sid.GetHashCode();
                    if (Tags != null)
                    hashCode = hashCode * 59 + Tags.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(NotifyV1ServiceBinding left, NotifyV1ServiceBinding right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(NotifyV1ServiceBinding left, NotifyV1ServiceBinding right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
