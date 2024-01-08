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
    /// Details about the analysed Jira expression.
    /// </summary>
    [DataContract]
    public partial class JiraExpressionAnalysis : IEquatable<JiraExpressionAnalysis>
    {
        /// <summary>
        /// Gets or Sets Complexity
        /// </summary>
        [DataMember(Name="complexity", EmitDefaultValue=false)]
        public JiraExpressionComplexity Complexity { get; set; }

        /// <summary>
        /// A list of validation errors. Not included if the expression is valid.
        /// </summary>
        /// <value>A list of validation errors. Not included if the expression is valid.</value>
        [DataMember(Name="errors", EmitDefaultValue=false)]
        public List<JiraExpressionValidationError> Errors { get; set; }

        /// <summary>
        /// The analysed expression.
        /// </summary>
        /// <value>The analysed expression.</value>
        [Required]
        [DataMember(Name="expression", EmitDefaultValue=false)]
        public string Expression { get; set; }

        /// <summary>
        /// EXPERIMENTAL. The inferred type of the expression.
        /// </summary>
        /// <value>EXPERIMENTAL. The inferred type of the expression.</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations).
        /// </summary>
        /// <value>Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations).</value>
        [Required]
        [DataMember(Name="valid", EmitDefaultValue=true)]
        public bool Valid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class JiraExpressionAnalysis {\n");
            sb.Append("  Complexity: ").Append(Complexity).Append("\n");
            sb.Append("  Errors: ").Append(Errors).Append("\n");
            sb.Append("  Expression: ").Append(Expression).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Valid: ").Append(Valid).Append("\n");
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
            return obj.GetType() == GetType() && Equals((JiraExpressionAnalysis)obj);
        }

        /// <summary>
        /// Returns true if JiraExpressionAnalysis instances are equal
        /// </summary>
        /// <param name="other">Instance of JiraExpressionAnalysis to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(JiraExpressionAnalysis other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Complexity == other.Complexity ||
                    Complexity != null &&
                    Complexity.Equals(other.Complexity)
                ) && 
                (
                    Errors == other.Errors ||
                    Errors != null &&
                    other.Errors != null &&
                    Errors.SequenceEqual(other.Errors)
                ) && 
                (
                    Expression == other.Expression ||
                    Expression != null &&
                    Expression.Equals(other.Expression)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    Valid == other.Valid ||
                    
                    Valid.Equals(other.Valid)
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
                    if (Complexity != null)
                    hashCode = hashCode * 59 + Complexity.GetHashCode();
                    if (Errors != null)
                    hashCode = hashCode * 59 + Errors.GetHashCode();
                    if (Expression != null)
                    hashCode = hashCode * 59 + Expression.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    
                    hashCode = hashCode * 59 + Valid.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(JiraExpressionAnalysis left, JiraExpressionAnalysis right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(JiraExpressionAnalysis left, JiraExpressionAnalysis right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
