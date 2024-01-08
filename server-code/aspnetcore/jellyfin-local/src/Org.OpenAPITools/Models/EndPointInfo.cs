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
    /// 
    /// </summary>
    [DataContract]
    public partial class EndPointInfo : IEquatable<EndPointInfo>
    {
        /// <summary>
        /// Gets or Sets IsInNetwork
        /// </summary>
        [DataMember(Name="IsInNetwork", EmitDefaultValue=true)]
        public bool IsInNetwork { get; set; }

        /// <summary>
        /// Gets or Sets IsLocal
        /// </summary>
        [DataMember(Name="IsLocal", EmitDefaultValue=true)]
        public bool IsLocal { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EndPointInfo {\n");
            sb.Append("  IsInNetwork: ").Append(IsInNetwork).Append("\n");
            sb.Append("  IsLocal: ").Append(IsLocal).Append("\n");
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
            return obj.GetType() == GetType() && Equals((EndPointInfo)obj);
        }

        /// <summary>
        /// Returns true if EndPointInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of EndPointInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EndPointInfo other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    IsInNetwork == other.IsInNetwork ||
                    
                    IsInNetwork.Equals(other.IsInNetwork)
                ) && 
                (
                    IsLocal == other.IsLocal ||
                    
                    IsLocal.Equals(other.IsLocal)
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
                    
                    hashCode = hashCode * 59 + IsInNetwork.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsLocal.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(EndPointInfo left, EndPointInfo right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(EndPointInfo left, EndPointInfo right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
