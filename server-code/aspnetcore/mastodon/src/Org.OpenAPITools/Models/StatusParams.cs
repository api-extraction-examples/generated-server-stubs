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
    /// 
    /// </summary>
    [DataContract]
    public partial class StatusParams : IEquatable<StatusParams>
    {
        /// <summary>
        /// application_id
        /// </summary>
        /// <value>application_id</value>
        [DataMember(Name="application_id", EmitDefaultValue=false)]
        public string ApplicationId { get; set; }

        /// <summary>
        /// in_reply_to_id
        /// </summary>
        /// <value>in_reply_to_id</value>
        [DataMember(Name="in_reply_to_id", EmitDefaultValue=false)]
        public string InReplyToId { get; set; }

        /// <summary>
        /// media_ids
        /// </summary>
        /// <value>media_ids</value>
        [DataMember(Name="media_ids", EmitDefaultValue=false)]
        public List<string> MediaIds { get; set; }

        /// <summary>
        /// scheduled_at
        /// </summary>
        /// <value>scheduled_at</value>
        [DataMember(Name="scheduled_at", EmitDefaultValue=false)]
        public DateTime ScheduledAt { get; set; }

        /// <summary>
        /// sensitive
        /// </summary>
        /// <value>sensitive</value>
        [DataMember(Name="sensitive", EmitDefaultValue=true)]
        public bool Sensitive { get; set; }

        /// <summary>
        /// spoiler_text
        /// </summary>
        /// <value>spoiler_text</value>
        [DataMember(Name="spoiler_text", EmitDefaultValue=false)]
        public string SpoilerText { get; set; }

        /// <summary>
        /// text
        /// </summary>
        /// <value>text</value>
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; set; }

        /// <summary>
        /// visibility
        /// </summary>
        /// <value>visibility</value>
        [DataMember(Name="visibility", EmitDefaultValue=false)]
        public string Visibility { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StatusParams {\n");
            sb.Append("  ApplicationId: ").Append(ApplicationId).Append("\n");
            sb.Append("  InReplyToId: ").Append(InReplyToId).Append("\n");
            sb.Append("  MediaIds: ").Append(MediaIds).Append("\n");
            sb.Append("  ScheduledAt: ").Append(ScheduledAt).Append("\n");
            sb.Append("  Sensitive: ").Append(Sensitive).Append("\n");
            sb.Append("  SpoilerText: ").Append(SpoilerText).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  Visibility: ").Append(Visibility).Append("\n");
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
            return obj.GetType() == GetType() && Equals((StatusParams)obj);
        }

        /// <summary>
        /// Returns true if StatusParams instances are equal
        /// </summary>
        /// <param name="other">Instance of StatusParams to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StatusParams other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ApplicationId == other.ApplicationId ||
                    ApplicationId != null &&
                    ApplicationId.Equals(other.ApplicationId)
                ) && 
                (
                    InReplyToId == other.InReplyToId ||
                    InReplyToId != null &&
                    InReplyToId.Equals(other.InReplyToId)
                ) && 
                (
                    MediaIds == other.MediaIds ||
                    MediaIds != null &&
                    other.MediaIds != null &&
                    MediaIds.SequenceEqual(other.MediaIds)
                ) && 
                (
                    ScheduledAt == other.ScheduledAt ||
                    ScheduledAt != null &&
                    ScheduledAt.Equals(other.ScheduledAt)
                ) && 
                (
                    Sensitive == other.Sensitive ||
                    
                    Sensitive.Equals(other.Sensitive)
                ) && 
                (
                    SpoilerText == other.SpoilerText ||
                    SpoilerText != null &&
                    SpoilerText.Equals(other.SpoilerText)
                ) && 
                (
                    Text == other.Text ||
                    Text != null &&
                    Text.Equals(other.Text)
                ) && 
                (
                    Visibility == other.Visibility ||
                    Visibility != null &&
                    Visibility.Equals(other.Visibility)
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
                    if (ApplicationId != null)
                    hashCode = hashCode * 59 + ApplicationId.GetHashCode();
                    if (InReplyToId != null)
                    hashCode = hashCode * 59 + InReplyToId.GetHashCode();
                    if (MediaIds != null)
                    hashCode = hashCode * 59 + MediaIds.GetHashCode();
                    if (ScheduledAt != null)
                    hashCode = hashCode * 59 + ScheduledAt.GetHashCode();
                    
                    hashCode = hashCode * 59 + Sensitive.GetHashCode();
                    if (SpoilerText != null)
                    hashCode = hashCode * 59 + SpoilerText.GetHashCode();
                    if (Text != null)
                    hashCode = hashCode * 59 + Text.GetHashCode();
                    if (Visibility != null)
                    hashCode = hashCode * 59 + Visibility.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(StatusParams left, StatusParams right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(StatusParams left, StatusParams right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
