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
    /// Details of an issue priority.
    /// </summary>
    [DataContract]
    public partial class UpdatePriorityDetails : IEquatable<UpdatePriorityDetails>
    {
        /// <summary>
        /// The description of the priority.
        /// </summary>
        /// <value>The description of the priority.</value>
        [MaxLength(255)]
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }


        /// <summary>
        /// The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
        /// </summary>
        /// <value>The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.</value>
        [TypeConverter(typeof(CustomEnumConverter<IconUrlEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum IconUrlEnum
        {
            
            /// <summary>
            /// Enum BlockerPngEnum for /images/icons/priorities/blocker.png
            /// </summary>
            [EnumMember(Value = "/images/icons/priorities/blocker.png")]
            BlockerPngEnum = 1,
            
            /// <summary>
            /// Enum CriticalPngEnum for /images/icons/priorities/critical.png
            /// </summary>
            [EnumMember(Value = "/images/icons/priorities/critical.png")]
            CriticalPngEnum = 2,
            
            /// <summary>
            /// Enum HighPngEnum for /images/icons/priorities/high.png
            /// </summary>
            [EnumMember(Value = "/images/icons/priorities/high.png")]
            HighPngEnum = 3,
            
            /// <summary>
            /// Enum HighestPngEnum for /images/icons/priorities/highest.png
            /// </summary>
            [EnumMember(Value = "/images/icons/priorities/highest.png")]
            HighestPngEnum = 4,
            
            /// <summary>
            /// Enum LowPngEnum for /images/icons/priorities/low.png
            /// </summary>
            [EnumMember(Value = "/images/icons/priorities/low.png")]
            LowPngEnum = 5,
            
            /// <summary>
            /// Enum LowestPngEnum for /images/icons/priorities/lowest.png
            /// </summary>
            [EnumMember(Value = "/images/icons/priorities/lowest.png")]
            LowestPngEnum = 6,
            
            /// <summary>
            /// Enum MajorPngEnum for /images/icons/priorities/major.png
            /// </summary>
            [EnumMember(Value = "/images/icons/priorities/major.png")]
            MajorPngEnum = 7,
            
            /// <summary>
            /// Enum MediumPngEnum for /images/icons/priorities/medium.png
            /// </summary>
            [EnumMember(Value = "/images/icons/priorities/medium.png")]
            MediumPngEnum = 8,
            
            /// <summary>
            /// Enum MinorPngEnum for /images/icons/priorities/minor.png
            /// </summary>
            [EnumMember(Value = "/images/icons/priorities/minor.png")]
            MinorPngEnum = 9,
            
            /// <summary>
            /// Enum TrivialPngEnum for /images/icons/priorities/trivial.png
            /// </summary>
            [EnumMember(Value = "/images/icons/priorities/trivial.png")]
            TrivialPngEnum = 10
        }

        /// <summary>
        /// The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
        /// </summary>
        /// <value>The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.</value>
        [MaxLength(255)]
        [DataMember(Name="iconUrl", EmitDefaultValue=true)]
        public IconUrlEnum IconUrl { get; set; }

        /// <summary>
        /// The name of the priority. Must be unique.
        /// </summary>
        /// <value>The name of the priority. Must be unique.</value>
        [MaxLength(60)]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The status color of the priority in 3-digit or 6-digit hexadecimal format.
        /// </summary>
        /// <value>The status color of the priority in 3-digit or 6-digit hexadecimal format.</value>
        [DataMember(Name="statusColor", EmitDefaultValue=false)]
        public string StatusColor { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdatePriorityDetails {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  IconUrl: ").Append(IconUrl).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  StatusColor: ").Append(StatusColor).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UpdatePriorityDetails)obj);
        }

        /// <summary>
        /// Returns true if UpdatePriorityDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of UpdatePriorityDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdatePriorityDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    IconUrl == other.IconUrl ||
                    
                    IconUrl.Equals(other.IconUrl)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    StatusColor == other.StatusColor ||
                    StatusColor != null &&
                    StatusColor.Equals(other.StatusColor)
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
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    
                    hashCode = hashCode * 59 + IconUrl.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (StatusColor != null)
                    hashCode = hashCode * 59 + StatusColor.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UpdatePriorityDetails left, UpdatePriorityDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UpdatePriorityDetails left, UpdatePriorityDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
