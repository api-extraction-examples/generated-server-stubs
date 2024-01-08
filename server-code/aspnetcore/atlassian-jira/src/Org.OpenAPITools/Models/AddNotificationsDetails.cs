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
    /// Details of notifications which should be added to the notification scheme.
    /// </summary>
    [DataContract]
    public partial class AddNotificationsDetails : IEquatable<AddNotificationsDetails>
    {
        /// <summary>
        /// The list of notifications which should be added to the notification scheme.
        /// </summary>
        /// <value>The list of notifications which should be added to the notification scheme.</value>
        [Required]
        [DataMember(Name="notificationSchemeEvents", EmitDefaultValue=false)]
        public List<NotificationSchemeEventDetails> NotificationSchemeEvents { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AddNotificationsDetails {\n");
            sb.Append("  NotificationSchemeEvents: ").Append(NotificationSchemeEvents).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AddNotificationsDetails)obj);
        }

        /// <summary>
        /// Returns true if AddNotificationsDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of AddNotificationsDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AddNotificationsDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    NotificationSchemeEvents == other.NotificationSchemeEvents ||
                    NotificationSchemeEvents != null &&
                    other.NotificationSchemeEvents != null &&
                    NotificationSchemeEvents.SequenceEqual(other.NotificationSchemeEvents)
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
                    if (NotificationSchemeEvents != null)
                    hashCode = hashCode * 59 + NotificationSchemeEvents.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AddNotificationsDetails left, AddNotificationsDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AddNotificationsDetails left, AddNotificationsDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
