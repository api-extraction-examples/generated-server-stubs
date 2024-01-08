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
    /// Response when a sandbox ride is propagated through ride status
    /// </summary>
    [DataContract]
    public partial class SandboxRideUpdate : IEquatable<SandboxRideUpdate>
    {
        /// <summary>
        /// The ID of the ride
        /// </summary>
        /// <value>The ID of the ride</value>
        [DataMember(Name="ride_id", EmitDefaultValue=false)]
        public string RideId { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=true)]
        public RideStatusEnum Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SandboxRideUpdate {\n");
            sb.Append("  RideId: ").Append(RideId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SandboxRideUpdate)obj);
        }

        /// <summary>
        /// Returns true if SandboxRideUpdate instances are equal
        /// </summary>
        /// <param name="other">Instance of SandboxRideUpdate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SandboxRideUpdate other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    RideId == other.RideId ||
                    RideId != null &&
                    RideId.Equals(other.RideId)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
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
                    if (RideId != null)
                    hashCode = hashCode * 59 + RideId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SandboxRideUpdate left, SandboxRideUpdate right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SandboxRideUpdate left, SandboxRideUpdate right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
