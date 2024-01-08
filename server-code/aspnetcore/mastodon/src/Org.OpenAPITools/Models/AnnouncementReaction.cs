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
    /// Represents an emoji reaction to an Announcement.
    /// </summary>
    [DataContract]
    public partial class AnnouncementReaction : IEquatable<AnnouncementReaction>
    {
        /// <summary>
        /// The total number of users who have added this reaction.
        /// </summary>
        /// <value>The total number of users who have added this reaction.</value>
        [DataMember(Name="count", EmitDefaultValue=true)]
        public int Count { get; set; }

        /// <summary>
        /// Whether the authorized user has added this reaction to the announcement.
        /// </summary>
        /// <value>Whether the authorized user has added this reaction to the announcement.</value>
        [DataMember(Name="me", EmitDefaultValue=true)]
        public bool Me { get; set; }

        /// <summary>
        /// The emoji used for the reaction. Either a unicode emoji, or a custom emoji&#39;s shortcode.
        /// </summary>
        /// <value>The emoji used for the reaction. Either a unicode emoji, or a custom emoji&#39;s shortcode.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// A link to a non-animated version of the custom emoji (URL).
        /// </summary>
        /// <value>A link to a non-animated version of the custom emoji (URL).</value>
        [DataMember(Name="static_url", EmitDefaultValue=false)]
        public string StaticUrl { get; set; }

        /// <summary>
        /// A link to the custom emoji (URL).
        /// </summary>
        /// <value>A link to the custom emoji (URL).</value>
        [DataMember(Name="url", EmitDefaultValue=false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AnnouncementReaction {\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
            sb.Append("  Me: ").Append(Me).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  StaticUrl: ").Append(StaticUrl).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AnnouncementReaction)obj);
        }

        /// <summary>
        /// Returns true if AnnouncementReaction instances are equal
        /// </summary>
        /// <param name="other">Instance of AnnouncementReaction to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AnnouncementReaction other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Count == other.Count ||
                    
                    Count.Equals(other.Count)
                ) && 
                (
                    Me == other.Me ||
                    
                    Me.Equals(other.Me)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    StaticUrl == other.StaticUrl ||
                    StaticUrl != null &&
                    StaticUrl.Equals(other.StaticUrl)
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
                    
                    hashCode = hashCode * 59 + Count.GetHashCode();
                    
                    hashCode = hashCode * 59 + Me.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (StaticUrl != null)
                    hashCode = hashCode * 59 + StaticUrl.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AnnouncementReaction left, AnnouncementReaction right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AnnouncementReaction left, AnnouncementReaction right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}