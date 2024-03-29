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
    public partial class Fallthrough : IEquatable<Fallthrough>
    {
        /// <summary>
        /// Gets or Sets Rollout
        /// </summary>
        [DataMember(Name="rollout", EmitDefaultValue=false)]
        public Rollout Rollout { get; set; }

        /// <summary>
        /// Gets or Sets Variation
        /// </summary>
        [DataMember(Name="variation", EmitDefaultValue=true)]
        public int Variation { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Fallthrough {\n");
            sb.Append("  Rollout: ").Append(Rollout).Append("\n");
            sb.Append("  Variation: ").Append(Variation).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Fallthrough)obj);
        }

        /// <summary>
        /// Returns true if Fallthrough instances are equal
        /// </summary>
        /// <param name="other">Instance of Fallthrough to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Fallthrough other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Rollout == other.Rollout ||
                    Rollout != null &&
                    Rollout.Equals(other.Rollout)
                ) && 
                (
                    Variation == other.Variation ||
                    
                    Variation.Equals(other.Variation)
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
                    if (Rollout != null)
                    hashCode = hashCode * 59 + Rollout.GetHashCode();
                    
                    hashCode = hashCode * 59 + Variation.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Fallthrough left, Fallthrough right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Fallthrough left, Fallthrough right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
