/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: support@launchdarkly.com
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
    public partial class UserSegment : IEquatable<UserSegment>
    {
        /// <summary>
        /// Gets or Sets Flags
        /// </summary>
        [DataMember(Name="_flags", EmitDefaultValue=false)]
        public List<FlagListItem> Flags { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="_links", EmitDefaultValue=false)]
        public Links Links { get; set; }

        /// <summary>
        /// A unix epoch time in milliseconds specifying the creation time of this flag.
        /// </summary>
        /// <value>A unix epoch time in milliseconds specifying the creation time of this flag.</value>
        /// <example>1443652232590</example>
        [Required]
        [DataMember(Name="creationDate", EmitDefaultValue=true)]
        public long CreationDate { get; set; }

        /// <summary>
        /// Description of the user segment.
        /// </summary>
        /// <value>Description of the user segment.</value>
        /// <example>Users in this segment can access beta features.</example>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// An array of user keys that should not be included in this segment, unless they are also listed in \&quot;included\&quot;.
        /// </summary>
        /// <value>An array of user keys that should not be included in this segment, unless they are also listed in \&quot;included\&quot;.</value>
        [DataMember(Name="excluded", EmitDefaultValue=false)]
        public List<string> Excluded { get; set; }

        /// <summary>
        /// An array of user keys that are included in this segment.
        /// </summary>
        /// <value>An array of user keys that are included in this segment.</value>
        [DataMember(Name="included", EmitDefaultValue=false)]
        public List<string> Included { get; set; }

        /// <summary>
        /// Unique identifier for the user segment.
        /// </summary>
        /// <value>Unique identifier for the user segment.</value>
        /// <example>beta-testers</example>
        [Required]
        [DataMember(Name="key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// Name of the user segment.
        /// </summary>
        /// <value>Name of the user segment.</value>
        /// <example>Beta Testers</example>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// An array of rules that can cause a user to be included in this segment.
        /// </summary>
        /// <value>An array of rules that can cause a user to be included in this segment.</value>
        [DataMember(Name="rules", EmitDefaultValue=false)]
        public List<UserSegmentRule> Rules { get; set; }

        /// <summary>
        /// An array of tags for this user segment.
        /// </summary>
        /// <value>An array of tags for this user segment.</value>
        /// <example>[dev, ops]</example>
        [DataMember(Name="tags", EmitDefaultValue=false)]
        public List<string> Tags { get; set; }

        /// <summary>
        /// Controls whether this is considered a \&quot;big segment\&quot; which can support an unlimited numbers of users. Include/exclude lists sent with this payload are not used in big segments. Contact your account manager for early access to this feature.
        /// </summary>
        /// <value>Controls whether this is considered a \&quot;big segment\&quot; which can support an unlimited numbers of users. Include/exclude lists sent with this payload are not used in big segments. Contact your account manager for early access to this feature.</value>
        /// <example>false</example>
        [DataMember(Name="unbounded", EmitDefaultValue=true)]
        public bool Unbounded { get; set; }

        /// <summary>
        /// Gets or Sets VarVersion
        /// </summary>
        [DataMember(Name="version", EmitDefaultValue=true)]
        public int VarVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserSegment {\n");
            sb.Append("  Flags: ").Append(Flags).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  CreationDate: ").Append(CreationDate).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Excluded: ").Append(Excluded).Append("\n");
            sb.Append("  Included: ").Append(Included).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Rules: ").Append(Rules).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  Unbounded: ").Append(Unbounded).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UserSegment)obj);
        }

        /// <summary>
        /// Returns true if UserSegment instances are equal
        /// </summary>
        /// <param name="other">Instance of UserSegment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserSegment other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Flags == other.Flags ||
                    Flags != null &&
                    other.Flags != null &&
                    Flags.SequenceEqual(other.Flags)
                ) && 
                (
                    Links == other.Links ||
                    Links != null &&
                    Links.Equals(other.Links)
                ) && 
                (
                    CreationDate == other.CreationDate ||
                    
                    CreationDate.Equals(other.CreationDate)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    Excluded == other.Excluded ||
                    Excluded != null &&
                    other.Excluded != null &&
                    Excluded.SequenceEqual(other.Excluded)
                ) && 
                (
                    Included == other.Included ||
                    Included != null &&
                    other.Included != null &&
                    Included.SequenceEqual(other.Included)
                ) && 
                (
                    Key == other.Key ||
                    Key != null &&
                    Key.Equals(other.Key)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Rules == other.Rules ||
                    Rules != null &&
                    other.Rules != null &&
                    Rules.SequenceEqual(other.Rules)
                ) && 
                (
                    Tags == other.Tags ||
                    Tags != null &&
                    other.Tags != null &&
                    Tags.SequenceEqual(other.Tags)
                ) && 
                (
                    Unbounded == other.Unbounded ||
                    
                    Unbounded.Equals(other.Unbounded)
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
                    if (Flags != null)
                    hashCode = hashCode * 59 + Flags.GetHashCode();
                    if (Links != null)
                    hashCode = hashCode * 59 + Links.GetHashCode();
                    
                    hashCode = hashCode * 59 + CreationDate.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Excluded != null)
                    hashCode = hashCode * 59 + Excluded.GetHashCode();
                    if (Included != null)
                    hashCode = hashCode * 59 + Included.GetHashCode();
                    if (Key != null)
                    hashCode = hashCode * 59 + Key.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Rules != null)
                    hashCode = hashCode * 59 + Rules.GetHashCode();
                    if (Tags != null)
                    hashCode = hashCode * 59 + Tags.GetHashCode();
                    
                    hashCode = hashCode * 59 + Unbounded.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarVersion.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UserSegment left, UserSegment right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserSegment left, UserSegment right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
