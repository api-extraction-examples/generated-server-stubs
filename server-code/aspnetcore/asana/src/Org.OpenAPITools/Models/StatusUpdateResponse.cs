/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
 * 
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
    public partial class StatusUpdateResponse : IEquatable<StatusUpdateResponse>
    {
        /// <summary>
        /// Globally unique identifier of the resource, as a string.
        /// </summary>
        /// <value>Globally unique identifier of the resource, as a string.</value>
        /// <example>12345</example>
        [DataMember(Name="gid", EmitDefaultValue=false)]
        public string Gid { get; set; }

        /// <summary>
        /// The base type of this resource.
        /// </summary>
        /// <value>The base type of this resource.</value>
        /// <example>task</example>
        [DataMember(Name="resource_type", EmitDefaultValue=false)]
        public string ResourceType { get; set; }


        /// <summary>
        /// The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.
        /// </summary>
        /// <value>The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.</value>
        [TypeConverter(typeof(CustomEnumConverter<ResourceSubtypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ResourceSubtypeEnum
        {
            
            /// <summary>
            /// Enum ProjectStatusUpdateEnum for project_status_update
            /// </summary>
            [EnumMember(Value = "project_status_update")]
            ProjectStatusUpdateEnum = 1,
            
            /// <summary>
            /// Enum PortfolioStatusUpdateEnum for portfolio_status_update
            /// </summary>
            [EnumMember(Value = "portfolio_status_update")]
            PortfolioStatusUpdateEnum = 2,
            
            /// <summary>
            /// Enum GoalStatusUpdateEnum for goal_status_update
            /// </summary>
            [EnumMember(Value = "goal_status_update")]
            GoalStatusUpdateEnum = 3
        }

        /// <summary>
        /// The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The &#x60;resource_subtype&#x60;s for &#x60;status&#x60; objects represent the type of their parent.
        /// </summary>
        /// <value>The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The &#x60;resource_subtype&#x60;s for &#x60;status&#x60; objects represent the type of their parent.</value>
        /// <example>project_status_update</example>
        [DataMember(Name="resource_subtype", EmitDefaultValue=true)]
        public ResourceSubtypeEnum ResourceSubtype { get; set; }

        /// <summary>
        /// The title of the status update.
        /// </summary>
        /// <value>The title of the status update.</value>
        /// <example>Status Update - Jun 15</example>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// [Opt In](/docs/input-output-options). The text content of the status update with formatting as HTML.
        /// </summary>
        /// <value>[Opt In](/docs/input-output-options). The text content of the status update with formatting as HTML.</value>
        /// <example>&lt;body&gt;The project &lt;strong&gt;is&lt;/strong&gt; moving forward according to plan...&lt;/body&gt;</example>
        [DataMember(Name="html_text", EmitDefaultValue=false)]
        public string HtmlText { get; set; }


        /// <summary>
        /// The type associated with the status update. This represents the current state of the object this object is on.
        /// </summary>
        /// <value>The type associated with the status update. This represents the current state of the object this object is on.</value>
        [TypeConverter(typeof(CustomEnumConverter<StatusTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum StatusTypeEnum
        {
            
            /// <summary>
            /// Enum OnTrackEnum for on_track
            /// </summary>
            [EnumMember(Value = "on_track")]
            OnTrackEnum = 1,
            
            /// <summary>
            /// Enum AtRiskEnum for at_risk
            /// </summary>
            [EnumMember(Value = "at_risk")]
            AtRiskEnum = 2,
            
            /// <summary>
            /// Enum OffTrackEnum for off_track
            /// </summary>
            [EnumMember(Value = "off_track")]
            OffTrackEnum = 3,
            
            /// <summary>
            /// Enum OnHoldEnum for on_hold
            /// </summary>
            [EnumMember(Value = "on_hold")]
            OnHoldEnum = 4,
            
            /// <summary>
            /// Enum CompleteEnum for complete
            /// </summary>
            [EnumMember(Value = "complete")]
            CompleteEnum = 5,
            
            /// <summary>
            /// Enum AchievedEnum for achieved
            /// </summary>
            [EnumMember(Value = "achieved")]
            AchievedEnum = 6,
            
            /// <summary>
            /// Enum PartialEnum for partial
            /// </summary>
            [EnumMember(Value = "partial")]
            PartialEnum = 7,
            
            /// <summary>
            /// Enum MissedEnum for missed
            /// </summary>
            [EnumMember(Value = "missed")]
            MissedEnum = 8,
            
            /// <summary>
            /// Enum DroppedEnum for dropped
            /// </summary>
            [EnumMember(Value = "dropped")]
            DroppedEnum = 9
        }

        /// <summary>
        /// The type associated with the status update. This represents the current state of the object this object is on.
        /// </summary>
        /// <value>The type associated with the status update. This represents the current state of the object this object is on.</value>
        [Required]
        [DataMember(Name="status_type", EmitDefaultValue=true)]
        public StatusTypeEnum StatusType { get; set; }

        /// <summary>
        /// The text content of the status update.
        /// </summary>
        /// <value>The text content of the status update.</value>
        /// <example>The project is moving forward according to plan...</example>
        [Required]
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; set; }

        /// <summary>
        /// Gets or Sets Author
        /// </summary>
        [DataMember(Name="author", EmitDefaultValue=false)]
        public UserCompact Author { get; set; }

        /// <summary>
        /// The time at which this resource was created.
        /// </summary>
        /// <value>The time at which this resource was created.</value>
        /// <example>2012-02-22T02:06:58.147Z</example>
        [DataMember(Name="created_at", EmitDefaultValue=false)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets CreatedBy
        /// </summary>
        [DataMember(Name="created_by", EmitDefaultValue=false)]
        public UserCompact CreatedBy { get; set; }

        /// <summary>
        /// *Deprecated - please use liked instead* True if the status is hearted by the authorized user, false if not.
        /// </summary>
        /// <value>*Deprecated - please use liked instead* True if the status is hearted by the authorized user, false if not.</value>
        /// <example>true</example>
        [DataMember(Name="hearted", EmitDefaultValue=true)]
        public bool Hearted { get; set; }

        /// <summary>
        /// *Deprecated - please use likes instead* Array of likes for users who have hearted this status.
        /// </summary>
        /// <value>*Deprecated - please use likes instead* Array of likes for users who have hearted this status.</value>
        [DataMember(Name="hearts", EmitDefaultValue=false)]
        public List<Like> Hearts { get; set; }

        /// <summary>
        /// True if the status is liked by the authorized user, false if not.
        /// </summary>
        /// <value>True if the status is liked by the authorized user, false if not.</value>
        /// <example>true</example>
        [DataMember(Name="liked", EmitDefaultValue=true)]
        public bool Liked { get; set; }

        /// <summary>
        /// Array of likes for users who have liked this status.
        /// </summary>
        /// <value>Array of likes for users who have liked this status.</value>
        [DataMember(Name="likes", EmitDefaultValue=false)]
        public List<Like> Likes { get; set; }

        /// <summary>
        /// The time at which this project status was last modified. *Note: This does not currently reflect any changes in associations such as comments that may have been added or removed from the status.*
        /// </summary>
        /// <value>The time at which this project status was last modified. *Note: This does not currently reflect any changes in associations such as comments that may have been added or removed from the status.*</value>
        /// <example>2012-02-22T02:06:58.147Z</example>
        [DataMember(Name="modified_at", EmitDefaultValue=false)]
        public DateTime ModifiedAt { get; set; }

        /// <summary>
        /// *Deprecated - please use likes instead* The number of users who have hearted this status.
        /// </summary>
        /// <value>*Deprecated - please use likes instead* The number of users who have hearted this status.</value>
        /// <example>5</example>
        [DataMember(Name="num_hearts", EmitDefaultValue=true)]
        public int NumHearts { get; set; }

        /// <summary>
        /// The number of users who have liked this status.
        /// </summary>
        /// <value>The number of users who have liked this status.</value>
        /// <example>5</example>
        [DataMember(Name="num_likes", EmitDefaultValue=true)]
        public int NumLikes { get; set; }

        /// <summary>
        /// Gets or Sets Parent
        /// </summary>
        [DataMember(Name="parent", EmitDefaultValue=false)]
        public StatusUpdateResponseAllOfParent Parent { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StatusUpdateResponse {\n");
            sb.Append("  Gid: ").Append(Gid).Append("\n");
            sb.Append("  ResourceType: ").Append(ResourceType).Append("\n");
            sb.Append("  ResourceSubtype: ").Append(ResourceSubtype).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  HtmlText: ").Append(HtmlText).Append("\n");
            sb.Append("  StatusType: ").Append(StatusType).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  Author: ").Append(Author).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  CreatedBy: ").Append(CreatedBy).Append("\n");
            sb.Append("  Hearted: ").Append(Hearted).Append("\n");
            sb.Append("  Hearts: ").Append(Hearts).Append("\n");
            sb.Append("  Liked: ").Append(Liked).Append("\n");
            sb.Append("  Likes: ").Append(Likes).Append("\n");
            sb.Append("  ModifiedAt: ").Append(ModifiedAt).Append("\n");
            sb.Append("  NumHearts: ").Append(NumHearts).Append("\n");
            sb.Append("  NumLikes: ").Append(NumLikes).Append("\n");
            sb.Append("  Parent: ").Append(Parent).Append("\n");
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
            return obj.GetType() == GetType() && Equals((StatusUpdateResponse)obj);
        }

        /// <summary>
        /// Returns true if StatusUpdateResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of StatusUpdateResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StatusUpdateResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Gid == other.Gid ||
                    Gid != null &&
                    Gid.Equals(other.Gid)
                ) && 
                (
                    ResourceType == other.ResourceType ||
                    ResourceType != null &&
                    ResourceType.Equals(other.ResourceType)
                ) && 
                (
                    ResourceSubtype == other.ResourceSubtype ||
                    
                    ResourceSubtype.Equals(other.ResourceSubtype)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
                ) && 
                (
                    HtmlText == other.HtmlText ||
                    HtmlText != null &&
                    HtmlText.Equals(other.HtmlText)
                ) && 
                (
                    StatusType == other.StatusType ||
                    
                    StatusType.Equals(other.StatusType)
                ) && 
                (
                    Text == other.Text ||
                    Text != null &&
                    Text.Equals(other.Text)
                ) && 
                (
                    Author == other.Author ||
                    Author != null &&
                    Author.Equals(other.Author)
                ) && 
                (
                    CreatedAt == other.CreatedAt ||
                    CreatedAt != null &&
                    CreatedAt.Equals(other.CreatedAt)
                ) && 
                (
                    CreatedBy == other.CreatedBy ||
                    CreatedBy != null &&
                    CreatedBy.Equals(other.CreatedBy)
                ) && 
                (
                    Hearted == other.Hearted ||
                    
                    Hearted.Equals(other.Hearted)
                ) && 
                (
                    Hearts == other.Hearts ||
                    Hearts != null &&
                    other.Hearts != null &&
                    Hearts.SequenceEqual(other.Hearts)
                ) && 
                (
                    Liked == other.Liked ||
                    
                    Liked.Equals(other.Liked)
                ) && 
                (
                    Likes == other.Likes ||
                    Likes != null &&
                    other.Likes != null &&
                    Likes.SequenceEqual(other.Likes)
                ) && 
                (
                    ModifiedAt == other.ModifiedAt ||
                    ModifiedAt != null &&
                    ModifiedAt.Equals(other.ModifiedAt)
                ) && 
                (
                    NumHearts == other.NumHearts ||
                    
                    NumHearts.Equals(other.NumHearts)
                ) && 
                (
                    NumLikes == other.NumLikes ||
                    
                    NumLikes.Equals(other.NumLikes)
                ) && 
                (
                    Parent == other.Parent ||
                    Parent != null &&
                    Parent.Equals(other.Parent)
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
                    if (Gid != null)
                    hashCode = hashCode * 59 + Gid.GetHashCode();
                    if (ResourceType != null)
                    hashCode = hashCode * 59 + ResourceType.GetHashCode();
                    
                    hashCode = hashCode * 59 + ResourceSubtype.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                    if (HtmlText != null)
                    hashCode = hashCode * 59 + HtmlText.GetHashCode();
                    
                    hashCode = hashCode * 59 + StatusType.GetHashCode();
                    if (Text != null)
                    hashCode = hashCode * 59 + Text.GetHashCode();
                    if (Author != null)
                    hashCode = hashCode * 59 + Author.GetHashCode();
                    if (CreatedAt != null)
                    hashCode = hashCode * 59 + CreatedAt.GetHashCode();
                    if (CreatedBy != null)
                    hashCode = hashCode * 59 + CreatedBy.GetHashCode();
                    
                    hashCode = hashCode * 59 + Hearted.GetHashCode();
                    if (Hearts != null)
                    hashCode = hashCode * 59 + Hearts.GetHashCode();
                    
                    hashCode = hashCode * 59 + Liked.GetHashCode();
                    if (Likes != null)
                    hashCode = hashCode * 59 + Likes.GetHashCode();
                    if (ModifiedAt != null)
                    hashCode = hashCode * 59 + ModifiedAt.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumHearts.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumLikes.GetHashCode();
                    if (Parent != null)
                    hashCode = hashCode * 59 + Parent.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(StatusUpdateResponse left, StatusUpdateResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(StatusUpdateResponse left, StatusUpdateResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
