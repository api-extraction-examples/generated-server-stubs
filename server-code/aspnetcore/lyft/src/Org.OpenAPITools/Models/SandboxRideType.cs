/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api-support@lyft.com
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
    public partial class SandboxRideType : IEquatable<SandboxRideType>
    {
        /// <summary>
        /// The latitude component of a location
        /// </summary>
        /// <value>The latitude component of a location</value>
        [Required]
        [DataMember(Name="lat", EmitDefaultValue=true)]
        public double Lat { get; set; }

        /// <summary>
        /// The longitude component of a location
        /// </summary>
        /// <value>The longitude component of a location</value>
        [Required]
        [DataMember(Name="lng", EmitDefaultValue=true)]
        public double Lng { get; set; }

        /// <summary>
        /// Gets or Sets RideTypes
        /// </summary>
        [Required]
        [DataMember(Name="ride_types", EmitDefaultValue=false)]
        public List<RideTypeEnum> RideTypes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SandboxRideType {\n");
            sb.Append("  Lat: ").Append(Lat).Append("\n");
            sb.Append("  Lng: ").Append(Lng).Append("\n");
            sb.Append("  RideTypes: ").Append(RideTypes).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SandboxRideType)obj);
        }

        /// <summary>
        /// Returns true if SandboxRideType instances are equal
        /// </summary>
        /// <param name="other">Instance of SandboxRideType to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SandboxRideType other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Lat == other.Lat ||
                    
                    Lat.Equals(other.Lat)
                ) && 
                (
                    Lng == other.Lng ||
                    
                    Lng.Equals(other.Lng)
                ) && 
                (
                    RideTypes == other.RideTypes ||
                    RideTypes != null &&
                    other.RideTypes != null &&
                    RideTypes.SequenceEqual(other.RideTypes)
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
                    
                    hashCode = hashCode * 59 + Lat.GetHashCode();
                    
                    hashCode = hashCode * 59 + Lng.GetHashCode();
                    if (RideTypes != null)
                    hashCode = hashCode * 59 + RideTypes.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SandboxRideType left, SandboxRideType right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SandboxRideType left, SandboxRideType right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
