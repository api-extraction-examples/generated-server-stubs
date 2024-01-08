/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
    /// Default directory browser info.
    /// </summary>
    [DataContract]
    public partial class DefaultDirectoryBrowserInfoDto : IEquatable<DefaultDirectoryBrowserInfoDto>
    {
        /// <summary>
        /// Gets or sets the path.
        /// </summary>
        /// <value>Gets or sets the path.</value>
        [DataMember(Name="Path", EmitDefaultValue=true)]
        public string Path { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DefaultDirectoryBrowserInfoDto {\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DefaultDirectoryBrowserInfoDto)obj);
        }

        /// <summary>
        /// Returns true if DefaultDirectoryBrowserInfoDto instances are equal
        /// </summary>
        /// <param name="other">Instance of DefaultDirectoryBrowserInfoDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DefaultDirectoryBrowserInfoDto other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Path == other.Path ||
                    Path != null &&
                    Path.Equals(other.Path)
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
                    if (Path != null)
                    hashCode = hashCode * 59 + Path.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DefaultDirectoryBrowserInfoDto left, DefaultDirectoryBrowserInfoDto right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DefaultDirectoryBrowserInfoDto left, DefaultDirectoryBrowserInfoDto right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}