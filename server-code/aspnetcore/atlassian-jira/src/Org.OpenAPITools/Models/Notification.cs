/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
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
    /// Details about a notification.
    /// </summary>
    [DataContract]
    public partial class Notification : IEquatable<Notification>
    {
        /// <summary>
        /// The HTML body of the email notification for the issue.
        /// </summary>
        /// <value>The HTML body of the email notification for the issue.</value>
        [DataMember(Name="htmlBody", EmitDefaultValue=false)]
        public string HtmlBody { get; set; }

        /// <summary>
        /// Gets or Sets Restrict
        /// </summary>
        [DataMember(Name="restrict", EmitDefaultValue=false)]
        public NotificationRecipientsRestrictions Restrict { get; set; }

        /// <summary>
        /// The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.
        /// </summary>
        /// <value>The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.</value>
        [DataMember(Name="subject", EmitDefaultValue=false)]
        public string Subject { get; set; }

        /// <summary>
        /// The plain text body of the email notification for the issue.
        /// </summary>
        /// <value>The plain text body of the email notification for the issue.</value>
        [DataMember(Name="textBody", EmitDefaultValue=false)]
        public string TextBody { get; set; }

        /// <summary>
        /// Gets or Sets To
        /// </summary>
        [DataMember(Name="to", EmitDefaultValue=false)]
        public NotificationRecipients To { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Notification {\n");
            sb.Append("  HtmlBody: ").Append(HtmlBody).Append("\n");
            sb.Append("  Restrict: ").Append(Restrict).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("  TextBody: ").Append(TextBody).Append("\n");
            sb.Append("  To: ").Append(To).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Notification)obj);
        }

        /// <summary>
        /// Returns true if Notification instances are equal
        /// </summary>
        /// <param name="other">Instance of Notification to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Notification other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    HtmlBody == other.HtmlBody ||
                    HtmlBody != null &&
                    HtmlBody.Equals(other.HtmlBody)
                ) && 
                (
                    Restrict == other.Restrict ||
                    Restrict != null &&
                    Restrict.Equals(other.Restrict)
                ) && 
                (
                    Subject == other.Subject ||
                    Subject != null &&
                    Subject.Equals(other.Subject)
                ) && 
                (
                    TextBody == other.TextBody ||
                    TextBody != null &&
                    TextBody.Equals(other.TextBody)
                ) && 
                (
                    To == other.To ||
                    To != null &&
                    To.Equals(other.To)
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
                    if (HtmlBody != null)
                    hashCode = hashCode * 59 + HtmlBody.GetHashCode();
                    if (Restrict != null)
                    hashCode = hashCode * 59 + Restrict.GetHashCode();
                    if (Subject != null)
                    hashCode = hashCode * 59 + Subject.GetHashCode();
                    if (TextBody != null)
                    hashCode = hashCode * 59 + TextBody.GetHashCode();
                    if (To != null)
                    hashCode = hashCode * 59 + To.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Notification left, Notification right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Notification left, Notification right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}