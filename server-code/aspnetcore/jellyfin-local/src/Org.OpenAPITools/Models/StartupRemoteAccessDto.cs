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
    /// Startup remote access dto.
    /// </summary>
    [DataContract]
    public partial class StartupRemoteAccessDto : IEquatable<StartupRemoteAccessDto>
    {
        /// <summary>
        /// Gets or sets a value indicating whether enable automatic port mapping.
        /// </summary>
        /// <value>Gets or sets a value indicating whether enable automatic port mapping.</value>
        [Required]
        [DataMember(Name="EnableAutomaticPortMapping", EmitDefaultValue=true)]
        public bool EnableAutomaticPortMapping { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether enable remote access.
        /// </summary>
        /// <value>Gets or sets a value indicating whether enable remote access.</value>
        [Required]
        [DataMember(Name="EnableRemoteAccess", EmitDefaultValue=true)]
        public bool EnableRemoteAccess { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StartupRemoteAccessDto {\n");
            sb.Append("  EnableAutomaticPortMapping: ").Append(EnableAutomaticPortMapping).Append("\n");
            sb.Append("  EnableRemoteAccess: ").Append(EnableRemoteAccess).Append("\n");
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
            return obj.GetType() == GetType() && Equals((StartupRemoteAccessDto)obj);
        }

        /// <summary>
        /// Returns true if StartupRemoteAccessDto instances are equal
        /// </summary>
        /// <param name="other">Instance of StartupRemoteAccessDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StartupRemoteAccessDto other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    EnableAutomaticPortMapping == other.EnableAutomaticPortMapping ||
                    
                    EnableAutomaticPortMapping.Equals(other.EnableAutomaticPortMapping)
                ) && 
                (
                    EnableRemoteAccess == other.EnableRemoteAccess ||
                    
                    EnableRemoteAccess.Equals(other.EnableRemoteAccess)
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
                    
                    hashCode = hashCode * 59 + EnableAutomaticPortMapping.GetHashCode();
                    
                    hashCode = hashCode * 59 + EnableRemoteAccess.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(StartupRemoteAccessDto left, StartupRemoteAccessDto right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(StartupRemoteAccessDto left, StartupRemoteAccessDto right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
