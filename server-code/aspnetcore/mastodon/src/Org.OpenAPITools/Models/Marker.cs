/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
    /// Represents the last read position within a user&#39;s timelines.
    /// </summary>
    [DataContract]
    public partial class Marker : IEquatable<Marker>
    {
        /// <summary>
        /// Information about the user&#39;s position in the home timeline.
        /// </summary>
        /// <value>Information about the user&#39;s position in the home timeline.</value>
        [DataMember(Name="home", EmitDefaultValue=false)]
        public Object Home { get; set; }

        /// <summary>
        /// The ID of the most recently viewed entity. Cast from integer but not guaranteed to be a number
        /// </summary>
        /// <value>The ID of the most recently viewed entity. Cast from integer but not guaranteed to be a number</value>
        [DataMember(Name="last_read_id", EmitDefaultValue=false)]
        public string LastReadId { get; set; }

        /// <summary>
        /// Information about the user&#39;s position in their notifications.
        /// </summary>
        /// <value>Information about the user&#39;s position in their notifications.</value>
        [DataMember(Name="notifications", EmitDefaultValue=false)]
        public Object Notifications { get; set; }

        /// <summary>
        /// The timestamp of when the marker was set. ISO 8601 Datetime.
        /// </summary>
        /// <value>The timestamp of when the marker was set. ISO 8601 Datetime.</value>
        [DataMember(Name="updated_at", EmitDefaultValue=false)]
        public DateTime UpdatedAt { get; set; }

        /// <summary>
        /// Used for locking to prevent write conflicts.
        /// </summary>
        /// <value>Used for locking to prevent write conflicts.</value>
        [DataMember(Name="version", EmitDefaultValue=true)]
        public int VarVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Marker {\n");
            sb.Append("  Home: ").Append(Home).Append("\n");
            sb.Append("  LastReadId: ").Append(LastReadId).Append("\n");
            sb.Append("  Notifications: ").Append(Notifications).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Marker)obj);
        }

        /// <summary>
        /// Returns true if Marker instances are equal
        /// </summary>
        /// <param name="other">Instance of Marker to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Marker other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Home == other.Home ||
                    Home != null &&
                    Home.Equals(other.Home)
                ) && 
                (
                    LastReadId == other.LastReadId ||
                    LastReadId != null &&
                    LastReadId.Equals(other.LastReadId)
                ) && 
                (
                    Notifications == other.Notifications ||
                    Notifications != null &&
                    Notifications.Equals(other.Notifications)
                ) && 
                (
                    UpdatedAt == other.UpdatedAt ||
                    UpdatedAt != null &&
                    UpdatedAt.Equals(other.UpdatedAt)
                ) && 
                (
                    VarVersion == other.VarVersion ||
                    
                    VarVersion.Equals(other.VarVersion)
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
                    if (Home != null)
                    hashCode = hashCode * 59 + Home.GetHashCode();
                    if (LastReadId != null)
                    hashCode = hashCode * 59 + LastReadId.GetHashCode();
                    if (Notifications != null)
                    hashCode = hashCode * 59 + Notifications.GetHashCode();
                    if (UpdatedAt != null)
                    hashCode = hashCode * 59 + UpdatedAt.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarVersion.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Marker left, Marker right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Marker left, Marker right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
