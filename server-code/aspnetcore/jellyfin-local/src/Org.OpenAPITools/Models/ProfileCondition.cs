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
    public partial class ProfileCondition : IEquatable<ProfileCondition>
    {
        /// <summary>
        /// Gets or Sets Condition
        /// </summary>
        [DataMember(Name="Condition", EmitDefaultValue=true)]
        public ProfileConditionType Condition { get; set; }

        /// <summary>
        /// Gets or Sets IsRequired
        /// </summary>
        [DataMember(Name="IsRequired", EmitDefaultValue=true)]
        public bool IsRequired { get; set; }

        /// <summary>
        /// Gets or Sets Property
        /// </summary>
        [DataMember(Name="Property", EmitDefaultValue=true)]
        public ProfileConditionValue Property { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name="Value", EmitDefaultValue=true)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProfileCondition {\n");
            sb.Append("  Condition: ").Append(Condition).Append("\n");
            sb.Append("  IsRequired: ").Append(IsRequired).Append("\n");
            sb.Append("  Property: ").Append(Property).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ProfileCondition)obj);
        }

        /// <summary>
        /// Returns true if ProfileCondition instances are equal
        /// </summary>
        /// <param name="other">Instance of ProfileCondition to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProfileCondition other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Condition == other.Condition ||
                    
                    Condition.Equals(other.Condition)
                ) && 
                (
                    IsRequired == other.IsRequired ||
                    
                    IsRequired.Equals(other.IsRequired)
                ) && 
                (
                    Property == other.Property ||
                    
                    Property.Equals(other.Property)
                ) && 
                (
                    Value == other.Value ||
                    Value != null &&
                    Value.Equals(other.Value)
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
                    
                    hashCode = hashCode * 59 + Condition.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsRequired.GetHashCode();
                    
                    hashCode = hashCode * 59 + Property.GetHashCode();
                    if (Value != null)
                    hashCode = hashCode * 59 + Value.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ProfileCondition left, ProfileCondition right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProfileCondition left, ProfileCondition right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
