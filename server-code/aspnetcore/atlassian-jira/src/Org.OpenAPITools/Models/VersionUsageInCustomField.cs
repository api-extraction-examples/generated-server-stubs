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
    /// List of custom fields using the version.
    /// </summary>
    [DataContract]
    public partial class VersionUsageInCustomField : IEquatable<VersionUsageInCustomField>
    {
        /// <summary>
        /// The ID of the custom field.
        /// </summary>
        /// <value>The ID of the custom field.</value>
        [DataMember(Name="customFieldId", EmitDefaultValue=true)]
        public long CustomFieldId { get; set; }

        /// <summary>
        /// The name of the custom field.
        /// </summary>
        /// <value>The name of the custom field.</value>
        [DataMember(Name="fieldName", EmitDefaultValue=false)]
        public string FieldName { get; set; }

        /// <summary>
        /// Count of the issues where the custom field contains the version.
        /// </summary>
        /// <value>Count of the issues where the custom field contains the version.</value>
        [DataMember(Name="issueCountWithVersionInCustomField", EmitDefaultValue=true)]
        public long IssueCountWithVersionInCustomField { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VersionUsageInCustomField {\n");
            sb.Append("  CustomFieldId: ").Append(CustomFieldId).Append("\n");
            sb.Append("  FieldName: ").Append(FieldName).Append("\n");
            sb.Append("  IssueCountWithVersionInCustomField: ").Append(IssueCountWithVersionInCustomField).Append("\n");
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
            return obj.GetType() == GetType() && Equals((VersionUsageInCustomField)obj);
        }

        /// <summary>
        /// Returns true if VersionUsageInCustomField instances are equal
        /// </summary>
        /// <param name="other">Instance of VersionUsageInCustomField to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VersionUsageInCustomField other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CustomFieldId == other.CustomFieldId ||
                    
                    CustomFieldId.Equals(other.CustomFieldId)
                ) && 
                (
                    FieldName == other.FieldName ||
                    FieldName != null &&
                    FieldName.Equals(other.FieldName)
                ) && 
                (
                    IssueCountWithVersionInCustomField == other.IssueCountWithVersionInCustomField ||
                    
                    IssueCountWithVersionInCustomField.Equals(other.IssueCountWithVersionInCustomField)
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
                    
                    hashCode = hashCode * 59 + CustomFieldId.GetHashCode();
                    if (FieldName != null)
                    hashCode = hashCode * 59 + FieldName.GetHashCode();
                    
                    hashCode = hashCode * 59 + IssueCountWithVersionInCustomField.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(VersionUsageInCustomField left, VersionUsageInCustomField right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(VersionUsageInCustomField left, VersionUsageInCustomField right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
