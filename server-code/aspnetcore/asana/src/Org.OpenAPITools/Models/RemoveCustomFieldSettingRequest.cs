/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
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
    public partial class RemoveCustomFieldSettingRequest : IEquatable<RemoveCustomFieldSettingRequest>
    {
        /// <summary>
        /// The custom field to remove from this portfolio.
        /// </summary>
        /// <value>The custom field to remove from this portfolio.</value>
        /// <example>14916</example>
        [Required]
        [DataMember(Name="custom_field", EmitDefaultValue=false)]
        public string CustomField { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RemoveCustomFieldSettingRequest {\n");
            sb.Append("  CustomField: ").Append(CustomField).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RemoveCustomFieldSettingRequest)obj);
        }

        /// <summary>
        /// Returns true if RemoveCustomFieldSettingRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of RemoveCustomFieldSettingRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RemoveCustomFieldSettingRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CustomField == other.CustomField ||
                    CustomField != null &&
                    CustomField.Equals(other.CustomField)
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
                    if (CustomField != null)
                    hashCode = hashCode * 59 + CustomField.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RemoveCustomFieldSettingRequest left, RemoveCustomFieldSettingRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RemoveCustomFieldSettingRequest left, RemoveCustomFieldSettingRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}