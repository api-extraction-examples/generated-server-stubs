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
    /// Details of a notification within a notification scheme.
    /// </summary>
    [DataContract]
    public partial class NotificationSchemeNotificationDetails : IEquatable<NotificationSchemeNotificationDetails>
    {
        /// <summary>
        /// The notification type, e.g &#x60;CurrentAssignee&#x60;, &#x60;Group&#x60;, &#x60;EmailAddress&#x60;.
        /// </summary>
        /// <value>The notification type, e.g &#x60;CurrentAssignee&#x60;, &#x60;Group&#x60;, &#x60;EmailAddress&#x60;.</value>
        [Required]
        [DataMember(Name="notificationType", EmitDefaultValue=false)]
        public string NotificationType { get; set; }

        /// <summary>
        /// The value corresponding to the specified notification type.
        /// </summary>
        /// <value>The value corresponding to the specified notification type.</value>
        [DataMember(Name="parameter", EmitDefaultValue=false)]
        public string VarParameter { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NotificationSchemeNotificationDetails {\n");
            sb.Append("  NotificationType: ").Append(NotificationType).Append("\n");
            sb.Append("  VarParameter: ").Append(VarParameter).Append("\n");
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
            return obj.GetType() == GetType() && Equals((NotificationSchemeNotificationDetails)obj);
        }

        /// <summary>
        /// Returns true if NotificationSchemeNotificationDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of NotificationSchemeNotificationDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NotificationSchemeNotificationDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    NotificationType == other.NotificationType ||
                    NotificationType != null &&
                    NotificationType.Equals(other.NotificationType)
                ) && 
                (
                    VarParameter == other.VarParameter ||
                    VarParameter != null &&
                    VarParameter.Equals(other.VarParameter)
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
                    if (NotificationType != null)
                    hashCode = hashCode * 59 + NotificationType.GetHashCode();
                    if (VarParameter != null)
                    hashCode = hashCode * 59 + VarParameter.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(NotificationSchemeNotificationDetails left, NotificationSchemeNotificationDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(NotificationSchemeNotificationDetails left, NotificationSchemeNotificationDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}