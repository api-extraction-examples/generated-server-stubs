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
    /// A clause that asserts whether a field was changed. For example, &#x60;status CHANGED AFTER startOfMonth(-1M)&#x60;.See [CHANGED](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for more information about the CHANGED operator.
    /// </summary>
    [DataContract]
    public partial class FieldChangedClause : IEquatable<FieldChangedClause>
    {
        /// <summary>
        /// Gets or Sets Field
        /// </summary>
        [Required]
        [DataMember(Name="field", EmitDefaultValue=false)]
        public JqlQueryField Field { get; set; }


        /// <summary>
        /// The operator applied to the field.
        /// </summary>
        /// <value>The operator applied to the field.</value>
        [TypeConverter(typeof(CustomEnumConverter<OperatorEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OperatorEnum
        {
            
            /// <summary>
            /// Enum ChangedEnum for changed
            /// </summary>
            [EnumMember(Value = "changed")]
            ChangedEnum = 1
        }

        /// <summary>
        /// The operator applied to the field.
        /// </summary>
        /// <value>The operator applied to the field.</value>
        [Required]
        [DataMember(Name="operator", EmitDefaultValue=true)]
        public OperatorEnum VarOperator { get; set; }

        /// <summary>
        /// The list of time predicates.
        /// </summary>
        /// <value>The list of time predicates.</value>
        [Required]
        [DataMember(Name="predicates", EmitDefaultValue=false)]
        public List<JqlQueryClauseTimePredicate> Predicates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FieldChangedClause {\n");
            sb.Append("  Field: ").Append(Field).Append("\n");
            sb.Append("  VarOperator: ").Append(VarOperator).Append("\n");
            sb.Append("  Predicates: ").Append(Predicates).Append("\n");
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
            return obj.GetType() == GetType() && Equals((FieldChangedClause)obj);
        }

        /// <summary>
        /// Returns true if FieldChangedClause instances are equal
        /// </summary>
        /// <param name="other">Instance of FieldChangedClause to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FieldChangedClause other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Field == other.Field ||
                    Field != null &&
                    Field.Equals(other.Field)
                ) && 
                (
                    VarOperator == other.VarOperator ||
                    
                    VarOperator.Equals(other.VarOperator)
                ) && 
                (
                    Predicates == other.Predicates ||
                    Predicates != null &&
                    other.Predicates != null &&
                    Predicates.SequenceEqual(other.Predicates)
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
                    if (Field != null)
                    hashCode = hashCode * 59 + Field.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarOperator.GetHashCode();
                    if (Predicates != null)
                    hashCode = hashCode * 59 + Predicates.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FieldChangedClause left, FieldChangedClause right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FieldChangedClause left, FieldChangedClause right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}