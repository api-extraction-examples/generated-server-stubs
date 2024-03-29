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
    /// Represents a status that will be published at a future scheduled date.
    /// </summary>
    [DataContract]
    public partial class ScheduledStatus : IEquatable<ScheduledStatus>
    {
        /// <summary>
        /// ID of the scheduled status in the database. Cast from an integer, but not guaranteed to be a number.
        /// </summary>
        /// <value>ID of the scheduled status in the database. Cast from an integer, but not guaranteed to be a number.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Array of attachements
        /// </summary>
        /// <value>Array of attachements</value>
        [Required]
        [DataMember(Name="media_attachments", EmitDefaultValue=false)]
        public List<Attachment> MediaAttachments { get; set; }

        /// <summary>
        /// Gets or Sets VarParams
        /// </summary>
        [Required]
        [DataMember(Name="params", EmitDefaultValue=false)]
        public StatusParams VarParams { get; set; }

        /// <summary>
        /// ID of the status in the database. ISO 8601 Datetime.
        /// </summary>
        /// <value>ID of the status in the database. ISO 8601 Datetime.</value>
        [Required]
        [DataMember(Name="scheduled_at", EmitDefaultValue=false)]
        public DateTime ScheduledAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ScheduledStatus {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  MediaAttachments: ").Append(MediaAttachments).Append("\n");
            sb.Append("  VarParams: ").Append(VarParams).Append("\n");
            sb.Append("  ScheduledAt: ").Append(ScheduledAt).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ScheduledStatus)obj);
        }

        /// <summary>
        /// Returns true if ScheduledStatus instances are equal
        /// </summary>
        /// <param name="other">Instance of ScheduledStatus to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ScheduledStatus other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    MediaAttachments == other.MediaAttachments ||
                    MediaAttachments != null &&
                    other.MediaAttachments != null &&
                    MediaAttachments.SequenceEqual(other.MediaAttachments)
                ) && 
                (
                    VarParams == other.VarParams ||
                    VarParams != null &&
                    VarParams.Equals(other.VarParams)
                ) && 
                (
                    ScheduledAt == other.ScheduledAt ||
                    ScheduledAt != null &&
                    ScheduledAt.Equals(other.ScheduledAt)
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
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (MediaAttachments != null)
                    hashCode = hashCode * 59 + MediaAttachments.GetHashCode();
                    if (VarParams != null)
                    hashCode = hashCode * 59 + VarParams.GetHashCode();
                    if (ScheduledAt != null)
                    hashCode = hashCode * 59 + ScheduledAt.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ScheduledStatus left, ScheduledStatus right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ScheduledStatus left, ScheduledStatus right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
