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
    /// Details of user or system associated with a issue history metadata item.
    /// </summary>
    [DataContract]
    public partial class HistoryMetadataParticipant : IEquatable<HistoryMetadataParticipant>
    {
        /// <summary>
        /// The URL to an avatar for the user or system associated with a history record.
        /// </summary>
        /// <value>The URL to an avatar for the user or system associated with a history record.</value>
        [DataMember(Name="avatarUrl", EmitDefaultValue=false)]
        public string AvatarUrl { get; set; }

        /// <summary>
        /// The display name of the user or system associated with a history record.
        /// </summary>
        /// <value>The display name of the user or system associated with a history record.</value>
        [DataMember(Name="displayName", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// The key of the display name of the user or system associated with a history record.
        /// </summary>
        /// <value>The key of the display name of the user or system associated with a history record.</value>
        [DataMember(Name="displayNameKey", EmitDefaultValue=false)]
        public string DisplayNameKey { get; set; }

        /// <summary>
        /// The ID of the user or system associated with a history record.
        /// </summary>
        /// <value>The ID of the user or system associated with a history record.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The type of the user or system associated with a history record.
        /// </summary>
        /// <value>The type of the user or system associated with a history record.</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// The URL of the user or system associated with a history record.
        /// </summary>
        /// <value>The URL of the user or system associated with a history record.</value>
        [DataMember(Name="url", EmitDefaultValue=false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HistoryMetadataParticipant {\n");
            sb.Append("  AvatarUrl: ").Append(AvatarUrl).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  DisplayNameKey: ").Append(DisplayNameKey).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((HistoryMetadataParticipant)obj);
        }

        /// <summary>
        /// Returns true if HistoryMetadataParticipant instances are equal
        /// </summary>
        /// <param name="other">Instance of HistoryMetadataParticipant to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HistoryMetadataParticipant other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AvatarUrl == other.AvatarUrl ||
                    AvatarUrl != null &&
                    AvatarUrl.Equals(other.AvatarUrl)
                ) && 
                (
                    DisplayName == other.DisplayName ||
                    DisplayName != null &&
                    DisplayName.Equals(other.DisplayName)
                ) && 
                (
                    DisplayNameKey == other.DisplayNameKey ||
                    DisplayNameKey != null &&
                    DisplayNameKey.Equals(other.DisplayNameKey)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
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
                    if (AvatarUrl != null)
                    hashCode = hashCode * 59 + AvatarUrl.GetHashCode();
                    if (DisplayName != null)
                    hashCode = hashCode * 59 + DisplayName.GetHashCode();
                    if (DisplayNameKey != null)
                    hashCode = hashCode * 59 + DisplayNameKey.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(HistoryMetadataParticipant left, HistoryMetadataParticipant right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(HistoryMetadataParticipant left, HistoryMetadataParticipant right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
