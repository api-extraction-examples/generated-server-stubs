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
    /// The default value for a cascading select custom field.
    /// </summary>
    [DataContract]
    public partial class CustomFieldContextDefaultValueCascadingOption : IEquatable<CustomFieldContextDefaultValueCascadingOption>
    {
        /// <summary>
        /// The ID of the default cascading option.
        /// </summary>
        /// <value>The ID of the default cascading option.</value>
        [DataMember(Name="cascadingOptionId", EmitDefaultValue=false)]
        public string CascadingOptionId { get; set; }

        /// <summary>
        /// The ID of the context.
        /// </summary>
        /// <value>The ID of the context.</value>
        [Required]
        [DataMember(Name="contextId", EmitDefaultValue=false)]
        public string ContextId { get; set; }

        /// <summary>
        /// The ID of the default option.
        /// </summary>
        /// <value>The ID of the default option.</value>
        [Required]
        [DataMember(Name="optionId", EmitDefaultValue=false)]
        public string OptionId { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CustomFieldContextDefaultValueCascadingOption {\n");
            sb.Append("  CascadingOptionId: ").Append(CascadingOptionId).Append("\n");
            sb.Append("  ContextId: ").Append(ContextId).Append("\n");
            sb.Append("  OptionId: ").Append(OptionId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CustomFieldContextDefaultValueCascadingOption)obj);
        }

        /// <summary>
        /// Returns true if CustomFieldContextDefaultValueCascadingOption instances are equal
        /// </summary>
        /// <param name="other">Instance of CustomFieldContextDefaultValueCascadingOption to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CustomFieldContextDefaultValueCascadingOption other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CascadingOptionId == other.CascadingOptionId ||
                    CascadingOptionId != null &&
                    CascadingOptionId.Equals(other.CascadingOptionId)
                ) && 
                (
                    ContextId == other.ContextId ||
                    ContextId != null &&
                    ContextId.Equals(other.ContextId)
                ) && 
                (
                    OptionId == other.OptionId ||
                    OptionId != null &&
                    OptionId.Equals(other.OptionId)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
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
                    if (CascadingOptionId != null)
                    hashCode = hashCode * 59 + CascadingOptionId.GetHashCode();
                    if (ContextId != null)
                    hashCode = hashCode * 59 + ContextId.GetHashCode();
                    if (OptionId != null)
                    hashCode = hashCode * 59 + OptionId.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CustomFieldContextDefaultValueCascadingOption left, CustomFieldContextDefaultValueCascadingOption right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CustomFieldContextDefaultValueCascadingOption left, CustomFieldContextDefaultValueCascadingOption right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
