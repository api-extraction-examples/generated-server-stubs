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
    public partial class TagRequest : IEquatable<TagRequest>
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
        /// Name of the tag. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.
        /// </summary>
        /// <value>Name of the tag. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.</value>
        /// <example>Stuff to buy</example>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }


        /// <summary>
        /// Color of the tag.
        /// </summary>
        /// <value>Color of the tag.</value>
        [TypeConverter(typeof(CustomEnumConverter<ColorEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ColorEnum
        {
            
            /// <summary>
            /// Enum DarkPinkEnum for dark-pink
            /// </summary>
            [EnumMember(Value = "dark-pink")]
            DarkPinkEnum = 1,
            
            /// <summary>
            /// Enum DarkGreenEnum for dark-green
            /// </summary>
            [EnumMember(Value = "dark-green")]
            DarkGreenEnum = 2,
            
            /// <summary>
            /// Enum DarkBlueEnum for dark-blue
            /// </summary>
            [EnumMember(Value = "dark-blue")]
            DarkBlueEnum = 3,
            
            /// <summary>
            /// Enum DarkRedEnum for dark-red
            /// </summary>
            [EnumMember(Value = "dark-red")]
            DarkRedEnum = 4,
            
            /// <summary>
            /// Enum DarkTealEnum for dark-teal
            /// </summary>
            [EnumMember(Value = "dark-teal")]
            DarkTealEnum = 5,
            
            /// <summary>
            /// Enum DarkBrownEnum for dark-brown
            /// </summary>
            [EnumMember(Value = "dark-brown")]
            DarkBrownEnum = 6,
            
            /// <summary>
            /// Enum DarkOrangeEnum for dark-orange
            /// </summary>
            [EnumMember(Value = "dark-orange")]
            DarkOrangeEnum = 7,
            
            /// <summary>
            /// Enum DarkPurpleEnum for dark-purple
            /// </summary>
            [EnumMember(Value = "dark-purple")]
            DarkPurpleEnum = 8,
            
            /// <summary>
            /// Enum DarkWarmGrayEnum for dark-warm-gray
            /// </summary>
            [EnumMember(Value = "dark-warm-gray")]
            DarkWarmGrayEnum = 9,
            
            /// <summary>
            /// Enum LightPinkEnum for light-pink
            /// </summary>
            [EnumMember(Value = "light-pink")]
            LightPinkEnum = 10,
            
            /// <summary>
            /// Enum LightGreenEnum for light-green
            /// </summary>
            [EnumMember(Value = "light-green")]
            LightGreenEnum = 11,
            
            /// <summary>
            /// Enum LightBlueEnum for light-blue
            /// </summary>
            [EnumMember(Value = "light-blue")]
            LightBlueEnum = 12,
            
            /// <summary>
            /// Enum LightRedEnum for light-red
            /// </summary>
            [EnumMember(Value = "light-red")]
            LightRedEnum = 13,
            
            /// <summary>
            /// Enum LightTealEnum for light-teal
            /// </summary>
            [EnumMember(Value = "light-teal")]
            LightTealEnum = 14,
            
            /// <summary>
            /// Enum LightBrownEnum for light-brown
            /// </summary>
            [EnumMember(Value = "light-brown")]
            LightBrownEnum = 15,
            
            /// <summary>
            /// Enum LightOrangeEnum for light-orange
            /// </summary>
            [EnumMember(Value = "light-orange")]
            LightOrangeEnum = 16,
            
            /// <summary>
            /// Enum LightPurpleEnum for light-purple
            /// </summary>
            [EnumMember(Value = "light-purple")]
            LightPurpleEnum = 17,
            
            /// <summary>
            /// Enum LightWarmGrayEnum for light-warm-gray
            /// </summary>
            [EnumMember(Value = "light-warm-gray")]
            LightWarmGrayEnum = 18
        }

        /// <summary>
        /// Color of the tag.
        /// </summary>
        /// <value>Color of the tag.</value>
        /// <example>light-green</example>
        [DataMember(Name="color", EmitDefaultValue=true)]
        public ColorEnum? Color { get; set; }

        /// <summary>
        /// Free-form textual information associated with the tag (i.e. its description).
        /// </summary>
        /// <value>Free-form textual information associated with the tag (i.e. its description).</value>
        /// <example>Mittens really likes the stuff from Humboldt.</example>
        [DataMember(Name="notes", EmitDefaultValue=false)]
        public string Notes { get; set; }

        /// <summary>
        /// An array of strings identifying users. These can either be the string \&quot;me\&quot;, an email, or the gid of a user.
        /// </summary>
        /// <value>An array of strings identifying users. These can either be the string \&quot;me\&quot;, an email, or the gid of a user.</value>
        /// <example>[&quot;12345&quot;,&quot;42563&quot;]</example>
        [DataMember(Name="followers", EmitDefaultValue=false)]
        public List<string> Followers { get; set; }

        /// <summary>
        /// Gid of an object.
        /// </summary>
        /// <value>Gid of an object.</value>
        /// <example>12345</example>
        [DataMember(Name="workspace", EmitDefaultValue=false)]
        public string Workspace { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TagRequest {\n");
            sb.Append("  Gid: ").Append(Gid).Append("\n");
            sb.Append("  ResourceType: ").Append(ResourceType).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Color: ").Append(Color).Append("\n");
            sb.Append("  Notes: ").Append(Notes).Append("\n");
            sb.Append("  Followers: ").Append(Followers).Append("\n");
            sb.Append("  Workspace: ").Append(Workspace).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TagRequest)obj);
        }

        /// <summary>
        /// Returns true if TagRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of TagRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TagRequest other)
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
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Color == other.Color ||
                    
                    Color.Equals(other.Color)
                ) && 
                (
                    Notes == other.Notes ||
                    Notes != null &&
                    Notes.Equals(other.Notes)
                ) && 
                (
                    Followers == other.Followers ||
                    Followers != null &&
                    other.Followers != null &&
                    Followers.SequenceEqual(other.Followers)
                ) && 
                (
                    Workspace == other.Workspace ||
                    Workspace != null &&
                    Workspace.Equals(other.Workspace)
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
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + Color.GetHashCode();
                    if (Notes != null)
                    hashCode = hashCode * 59 + Notes.GetHashCode();
                    if (Followers != null)
                    hashCode = hashCode * 59 + Followers.GetHashCode();
                    if (Workspace != null)
                    hashCode = hashCode * 59 + Workspace.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TagRequest left, TagRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TagRequest left, TagRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
