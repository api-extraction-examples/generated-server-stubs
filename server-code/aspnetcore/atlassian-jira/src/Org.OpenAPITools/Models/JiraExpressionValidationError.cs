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
    /// Details about syntax and type errors. The error details apply to the entire expression, unless the object includes:   *  &#x60;line&#x60; and &#x60;column&#x60;  *  &#x60;expression&#x60;
    /// </summary>
    [DataContract]
    public partial class JiraExpressionValidationError : IEquatable<JiraExpressionValidationError>
    {
        /// <summary>
        /// The text column in which the error occurred.
        /// </summary>
        /// <value>The text column in which the error occurred.</value>
        [DataMember(Name="column", EmitDefaultValue=true)]
        public int Column { get; set; }

        /// <summary>
        /// The part of the expression in which the error occurred.
        /// </summary>
        /// <value>The part of the expression in which the error occurred.</value>
        [DataMember(Name="expression", EmitDefaultValue=false)]
        public string Expression { get; set; }

        /// <summary>
        /// The text line in which the error occurred.
        /// </summary>
        /// <value>The text line in which the error occurred.</value>
        [DataMember(Name="line", EmitDefaultValue=true)]
        public int Line { get; set; }

        /// <summary>
        /// Details about the error.
        /// </summary>
        /// <value>Details about the error.</value>
        /// <example>!, -, typeof, (, IDENTIFIER, null, true, false, NUMBER, STRING, TEMPLATE_LITERAL, new, [ or { expected, &gt; encountered.</example>
        [Required]
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }


        /// <summary>
        /// The error type.
        /// </summary>
        /// <value>The error type.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum SyntaxEnum for syntax
            /// </summary>
            [EnumMember(Value = "syntax")]
            SyntaxEnum = 1,
            
            /// <summary>
            /// Enum TypeEnum for type
            /// </summary>
            [EnumMember(Value = "type")]
            TypeEnum = 2,
            
            /// <summary>
            /// Enum OtherEnum for other
            /// </summary>
            [EnumMember(Value = "other")]
            OtherEnum = 3
        }

        /// <summary>
        /// The error type.
        /// </summary>
        /// <value>The error type.</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class JiraExpressionValidationError {\n");
            sb.Append("  Column: ").Append(Column).Append("\n");
            sb.Append("  Expression: ").Append(Expression).Append("\n");
            sb.Append("  Line: ").Append(Line).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((JiraExpressionValidationError)obj);
        }

        /// <summary>
        /// Returns true if JiraExpressionValidationError instances are equal
        /// </summary>
        /// <param name="other">Instance of JiraExpressionValidationError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(JiraExpressionValidationError other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Column == other.Column ||
                    
                    Column.Equals(other.Column)
                ) && 
                (
                    Expression == other.Expression ||
                    Expression != null &&
                    Expression.Equals(other.Expression)
                ) && 
                (
                    Line == other.Line ||
                    
                    Line.Equals(other.Line)
                ) && 
                (
                    Message == other.Message ||
                    Message != null &&
                    Message.Equals(other.Message)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
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
                    
                    hashCode = hashCode * 59 + Column.GetHashCode();
                    if (Expression != null)
                    hashCode = hashCode * 59 + Expression.GetHashCode();
                    
                    hashCode = hashCode * 59 + Line.GetHashCode();
                    if (Message != null)
                    hashCode = hashCode * 59 + Message.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(JiraExpressionValidationError left, JiraExpressionValidationError right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(JiraExpressionValidationError left, JiraExpressionValidationError right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}