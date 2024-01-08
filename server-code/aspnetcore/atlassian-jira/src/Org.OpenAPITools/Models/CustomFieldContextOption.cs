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
    /// Details of the custom field options for a context.
    /// </summary>
    [DataContract]
    public partial class CustomFieldContextOption : IEquatable<CustomFieldContextOption>
    {
        /// <summary>
        /// Whether the option is disabled.
        /// </summary>
        /// <value>Whether the option is disabled.</value>
        [Required]
        [DataMember(Name="disabled", EmitDefaultValue=true)]
        public bool Disabled { get; set; }

        /// <summary>
        /// The ID of the custom field option.
        /// </summary>
        /// <value>The ID of the custom field option.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// For cascading options, the ID of the custom field option containing the cascading option.
        /// </summary>
        /// <value>For cascading options, the ID of the custom field option containing the cascading option.</value>
        [DataMember(Name="optionId", EmitDefaultValue=false)]
        public string OptionId { get; set; }

        /// <summary>
        /// The value of the custom field option.
        /// </summary>
        /// <value>The value of the custom field option.</value>
        [Required]
        [DataMember(Name="value", EmitDefaultValue=false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CustomFieldContextOption {\n");
            sb.Append("  Disabled: ").Append(Disabled).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  OptionId: ").Append(OptionId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CustomFieldContextOption)obj);
        }

        /// <summary>
        /// Returns true if CustomFieldContextOption instances are equal
        /// </summary>
        /// <param name="other">Instance of CustomFieldContextOption to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CustomFieldContextOption other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Disabled == other.Disabled ||
                    
                    Disabled.Equals(other.Disabled)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    OptionId == other.OptionId ||
                    OptionId != null &&
                    OptionId.Equals(other.OptionId)
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
                    
                    hashCode = hashCode * 59 + Disabled.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (OptionId != null)
                    hashCode = hashCode * 59 + OptionId.GetHashCode();
                    if (Value != null)
                    hashCode = hashCode * 59 + Value.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CustomFieldContextOption left, CustomFieldContextOption right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CustomFieldContextOption left, CustomFieldContextOption right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}