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
    /// Details of the projects the option is available in.
    /// </summary>
    [DataContract]
    public partial class IssueFieldOptionConfiguration : IEquatable<IssueFieldOptionConfiguration>
    {

        /// <summary>
        /// Gets or Sets Attributes
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<AttributesEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AttributesEnum
        {
            
            /// <summary>
            /// Enum NotSelectableEnum for notSelectable
            /// </summary>
            [EnumMember(Value = "notSelectable")]
            NotSelectableEnum = 1,
            
            /// <summary>
            /// Enum DefaultValueEnum for defaultValue
            /// </summary>
            [EnumMember(Value = "defaultValue")]
            DefaultValueEnum = 2
        }

        /// <summary>
        /// DEPRECATED
        /// </summary>
        /// <value>DEPRECATED</value>
        [DataMember(Name="attributes", EmitDefaultValue=false)]
        public List<IssueFieldOptionConfiguration.AttributesEnum> Attributes { get; set; }

        /// <summary>
        /// Gets or Sets Scope
        /// </summary>
        [DataMember(Name="scope", EmitDefaultValue=false)]
        public IssueFieldOptionScopeBean Scope { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IssueFieldOptionConfiguration {\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Scope: ").Append(Scope).Append("\n");
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
            return obj.GetType() == GetType() && Equals((IssueFieldOptionConfiguration)obj);
        }

        /// <summary>
        /// Returns true if IssueFieldOptionConfiguration instances are equal
        /// </summary>
        /// <param name="other">Instance of IssueFieldOptionConfiguration to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IssueFieldOptionConfiguration other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Attributes == other.Attributes ||
                    Attributes != null &&
                    other.Attributes != null &&
                    Attributes.SequenceEqual(other.Attributes)
                ) && 
                (
                    Scope == other.Scope ||
                    Scope != null &&
                    Scope.Equals(other.Scope)
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
                    if (Attributes != null)
                    hashCode = hashCode * 59 + Attributes.GetHashCode();
                    if (Scope != null)
                    hashCode = hashCode * 59 + Scope.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IssueFieldOptionConfiguration left, IssueFieldOptionConfiguration right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IssueFieldOptionConfiguration left, IssueFieldOptionConfiguration right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
