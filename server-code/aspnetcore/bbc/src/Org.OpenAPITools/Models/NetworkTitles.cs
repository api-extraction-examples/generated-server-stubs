/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * The version of the OpenAPI document: 1.0.0
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
    public partial class NetworkTitles : IEquatable<NetworkTitles>
    {
        /// <summary>
        /// Gets or Sets LongTitle
        /// </summary>
        [Required]
        [DataMember(Name="long_title", EmitDefaultValue=false)]
        public string LongTitle { get; set; }

        /// <summary>
        /// Gets or Sets ShortTitle
        /// </summary>
        [Required]
        [DataMember(Name="short_title", EmitDefaultValue=false)]
        public string ShortTitle { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NetworkTitles {\n");
            sb.Append("  LongTitle: ").Append(LongTitle).Append("\n");
            sb.Append("  ShortTitle: ").Append(ShortTitle).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((NetworkTitles)obj);
        }

        /// <summary>
        /// Returns true if NetworkTitles instances are equal
        /// </summary>
        /// <param name="other">Instance of NetworkTitles to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NetworkTitles other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    LongTitle == other.LongTitle ||
                    LongTitle != null &&
                    LongTitle.Equals(other.LongTitle)
                ) && 
                (
                    ShortTitle == other.ShortTitle ||
                    ShortTitle != null &&
                    ShortTitle.Equals(other.ShortTitle)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
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
                    if (LongTitle != null)
                    hashCode = hashCode * 59 + LongTitle.GetHashCode();
                    if (ShortTitle != null)
                    hashCode = hashCode * 59 + ShortTitle.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(NetworkTitles left, NetworkTitles right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(NetworkTitles left, NetworkTitles right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
