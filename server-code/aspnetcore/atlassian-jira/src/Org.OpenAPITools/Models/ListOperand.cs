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
    /// An operand that is a list of values.
    /// </summary>
    [DataContract]
    public partial class ListOperand : IEquatable<ListOperand>
    {
        /// <summary>
        /// Encoded operand, which can be used directly in a JQL query.
        /// </summary>
        /// <value>Encoded operand, which can be used directly in a JQL query.</value>
        [DataMember(Name="encodedOperand", EmitDefaultValue=false)]
        public string EncodedOperand { get; set; }

        /// <summary>
        /// The list of operand values.
        /// </summary>
        /// <value>The list of operand values.</value>
        [Required]
        [DataMember(Name="values", EmitDefaultValue=false)]
        public List<JqlQueryUnitaryOperand> Values { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ListOperand {\n");
            sb.Append("  EncodedOperand: ").Append(EncodedOperand).Append("\n");
            sb.Append("  Values: ").Append(Values).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ListOperand)obj);
        }

        /// <summary>
        /// Returns true if ListOperand instances are equal
        /// </summary>
        /// <param name="other">Instance of ListOperand to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ListOperand other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    EncodedOperand == other.EncodedOperand ||
                    EncodedOperand != null &&
                    EncodedOperand.Equals(other.EncodedOperand)
                ) && 
                (
                    Values == other.Values ||
                    Values != null &&
                    other.Values != null &&
                    Values.SequenceEqual(other.Values)
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
                    if (EncodedOperand != null)
                    hashCode = hashCode * 59 + EncodedOperand.GetHashCode();
                    if (Values != null)
                    hashCode = hashCode * 59 + Values.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ListOperand left, ListOperand right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ListOperand left, ListOperand right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}