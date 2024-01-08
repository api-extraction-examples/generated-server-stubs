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
    /// The default value for a multiple version picker custom field.
    /// </summary>
    [DataContract]
    public partial class CustomFieldContextDefaultValueMultipleVersionPicker : IEquatable<CustomFieldContextDefaultValueMultipleVersionPicker>
    {
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// The IDs of the default versions.
        /// </summary>
        /// <value>The IDs of the default versions.</value>
        [Required]
        [DataMember(Name="versionIds", EmitDefaultValue=false)]
        public List<string> VersionIds { get; set; }

        /// <summary>
        /// The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are &#x60;\&quot;releasedFirst\&quot;&#x60; and &#x60;\&quot;unreleasedFirst\&quot;&#x60;.
        /// </summary>
        /// <value>The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are &#x60;\&quot;releasedFirst\&quot;&#x60; and &#x60;\&quot;unreleasedFirst\&quot;&#x60;.</value>
        [DataMember(Name="versionOrder", EmitDefaultValue=false)]
        public string VersionOrder { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CustomFieldContextDefaultValueMultipleVersionPicker {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  VersionIds: ").Append(VersionIds).Append("\n");
            sb.Append("  VersionOrder: ").Append(VersionOrder).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CustomFieldContextDefaultValueMultipleVersionPicker)obj);
        }

        /// <summary>
        /// Returns true if CustomFieldContextDefaultValueMultipleVersionPicker instances are equal
        /// </summary>
        /// <param name="other">Instance of CustomFieldContextDefaultValueMultipleVersionPicker to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CustomFieldContextDefaultValueMultipleVersionPicker other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    VersionIds == other.VersionIds ||
                    VersionIds != null &&
                    other.VersionIds != null &&
                    VersionIds.SequenceEqual(other.VersionIds)
                ) && 
                (
                    VersionOrder == other.VersionOrder ||
                    VersionOrder != null &&
                    VersionOrder.Equals(other.VersionOrder)
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
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (VersionIds != null)
                    hashCode = hashCode * 59 + VersionIds.GetHashCode();
                    if (VersionOrder != null)
                    hashCode = hashCode * 59 + VersionOrder.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CustomFieldContextDefaultValueMultipleVersionPicker left, CustomFieldContextDefaultValueMultipleVersionPicker right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CustomFieldContextDefaultValueMultipleVersionPicker left, CustomFieldContextDefaultValueMultipleVersionPicker right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}