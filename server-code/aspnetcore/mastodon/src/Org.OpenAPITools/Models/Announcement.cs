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
    /// Represents an announcement set by an administrator.
    /// </summary>
    [DataContract]
    public partial class Announcement : IEquatable<Announcement>
    {
        /// <summary>
        /// Whether the announcement has a start/end time.
        /// </summary>
        /// <value>Whether the announcement has a start/end time.</value>
        [Required]
        [DataMember(Name="all_day", EmitDefaultValue=true)]
        public bool AllDay { get; set; }

        /// <summary>
        /// When the announcement was created.
        /// </summary>
        /// <value>When the announcement was created.</value>
        [Required]
        [DataMember(Name="created_at", EmitDefaultValue=false)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// When the future announcement will end. ISO 8601 Datetime.
        /// </summary>
        /// <value>When the future announcement will end. ISO 8601 Datetime.</value>
        [DataMember(Name="ends_at", EmitDefaultValue=false)]
        public string EndsAt { get; set; }

        /// <summary>
        /// The announcement id. Cast from an integer, but not guaranteed to be a number.
        /// </summary>
        /// <value>The announcement id. Cast from an integer, but not guaranteed to be a number.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Whether the announcement is currently active.
        /// </summary>
        /// <value>Whether the announcement is currently active.</value>
        [Required]
        [DataMember(Name="published", EmitDefaultValue=true)]
        public bool Published { get; set; }

        /// <summary>
        /// Whether the announcement has been read by the user.
        /// </summary>
        /// <value>Whether the announcement has been read by the user.</value>
        [Required]
        [DataMember(Name="read", EmitDefaultValue=true)]
        public bool Read { get; set; }

        /// <summary>
        /// When the future announcement was scheduled. ISO 8601 Datetime.
        /// </summary>
        /// <value>When the future announcement was scheduled. ISO 8601 Datetime.</value>
        [DataMember(Name="scheduled_at", EmitDefaultValue=false)]
        public string ScheduledAt { get; set; }

        /// <summary>
        /// When the future announcement will start. ISO 8601 Datetime.
        /// </summary>
        /// <value>When the future announcement will start. ISO 8601 Datetime.</value>
        [DataMember(Name="starts_at", EmitDefaultValue=false)]
        public string StartsAt { get; set; }

        /// <summary>
        /// The content of the announcement.
        /// </summary>
        /// <value>The content of the announcement.</value>
        [Required]
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; set; }

        /// <summary>
        /// When the announcement was last updated. ISO 8601 Datetime.
        /// </summary>
        /// <value>When the announcement was last updated. ISO 8601 Datetime.</value>
        [Required]
        [DataMember(Name="updated_at", EmitDefaultValue=false)]
        public string UpdatedAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Announcement {\n");
            sb.Append("  AllDay: ").Append(AllDay).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  EndsAt: ").Append(EndsAt).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Published: ").Append(Published).Append("\n");
            sb.Append("  Read: ").Append(Read).Append("\n");
            sb.Append("  ScheduledAt: ").Append(ScheduledAt).Append("\n");
            sb.Append("  StartsAt: ").Append(StartsAt).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Announcement)obj);
        }

        /// <summary>
        /// Returns true if Announcement instances are equal
        /// </summary>
        /// <param name="other">Instance of Announcement to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Announcement other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AllDay == other.AllDay ||
                    
                    AllDay.Equals(other.AllDay)
                ) && 
                (
                    CreatedAt == other.CreatedAt ||
                    CreatedAt != null &&
                    CreatedAt.Equals(other.CreatedAt)
                ) && 
                (
                    EndsAt == other.EndsAt ||
                    EndsAt != null &&
                    EndsAt.Equals(other.EndsAt)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Published == other.Published ||
                    
                    Published.Equals(other.Published)
                ) && 
                (
                    Read == other.Read ||
                    
                    Read.Equals(other.Read)
                ) && 
                (
                    ScheduledAt == other.ScheduledAt ||
                    ScheduledAt != null &&
                    ScheduledAt.Equals(other.ScheduledAt)
                ) && 
                (
                    StartsAt == other.StartsAt ||
                    StartsAt != null &&
                    StartsAt.Equals(other.StartsAt)
                ) && 
                (
                    Text == other.Text ||
                    Text != null &&
                    Text.Equals(other.Text)
                ) && 
                (
                    UpdatedAt == other.UpdatedAt ||
                    UpdatedAt != null &&
                    UpdatedAt.Equals(other.UpdatedAt)
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
                    
                    hashCode = hashCode * 59 + AllDay.GetHashCode();
                    if (CreatedAt != null)
                    hashCode = hashCode * 59 + CreatedAt.GetHashCode();
                    if (EndsAt != null)
                    hashCode = hashCode * 59 + EndsAt.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + Published.GetHashCode();
                    
                    hashCode = hashCode * 59 + Read.GetHashCode();
                    if (ScheduledAt != null)
                    hashCode = hashCode * 59 + ScheduledAt.GetHashCode();
                    if (StartsAt != null)
                    hashCode = hashCode * 59 + StartsAt.GetHashCode();
                    if (Text != null)
                    hashCode = hashCode * 59 + Text.GetHashCode();
                    if (UpdatedAt != null)
                    hashCode = hashCode * 59 + UpdatedAt.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Announcement left, Announcement right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Announcement left, Announcement right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
