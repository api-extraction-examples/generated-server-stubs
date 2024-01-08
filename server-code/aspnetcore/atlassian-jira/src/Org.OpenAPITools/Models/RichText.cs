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
    /// 
    /// </summary>
    [DataContract]
    public partial class RichText : IEquatable<RichText>
    {
        /// <summary>
        /// Gets or Sets Empty
        /// </summary>
        [DataMember(Name="empty", EmitDefaultValue=true)]
        public bool Empty { get; set; }

        /// <summary>
        /// Gets or Sets EmptyAdf
        /// </summary>
        [DataMember(Name="emptyAdf", EmitDefaultValue=true)]
        public bool EmptyAdf { get; set; }

        /// <summary>
        /// Gets or Sets Finalised
        /// </summary>
        [DataMember(Name="finalised", EmitDefaultValue=true)]
        public bool Finalised { get; set; }

        /// <summary>
        /// Gets or Sets ValueSet
        /// </summary>
        [DataMember(Name="valueSet", EmitDefaultValue=true)]
        public bool ValueSet { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RichText {\n");
            sb.Append("  Empty: ").Append(Empty).Append("\n");
            sb.Append("  EmptyAdf: ").Append(EmptyAdf).Append("\n");
            sb.Append("  Finalised: ").Append(Finalised).Append("\n");
            sb.Append("  ValueSet: ").Append(ValueSet).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RichText)obj);
        }

        /// <summary>
        /// Returns true if RichText instances are equal
        /// </summary>
        /// <param name="other">Instance of RichText to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RichText other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Empty == other.Empty ||
                    
                    Empty.Equals(other.Empty)
                ) && 
                (
                    EmptyAdf == other.EmptyAdf ||
                    
                    EmptyAdf.Equals(other.EmptyAdf)
                ) && 
                (
                    Finalised == other.Finalised ||
                    
                    Finalised.Equals(other.Finalised)
                ) && 
                (
                    ValueSet == other.ValueSet ||
                    
                    ValueSet.Equals(other.ValueSet)
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
                    
                    hashCode = hashCode * 59 + Empty.GetHashCode();
                    
                    hashCode = hashCode * 59 + EmptyAdf.GetHashCode();
                    
                    hashCode = hashCode * 59 + Finalised.GetHashCode();
                    
                    hashCode = hashCode * 59 + ValueSet.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RichText left, RichText right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RichText left, RichText right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}