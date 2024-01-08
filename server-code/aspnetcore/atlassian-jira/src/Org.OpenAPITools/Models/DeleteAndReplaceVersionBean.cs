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
    /// 
    /// </summary>
    [DataContract]
    public partial class DeleteAndReplaceVersionBean : IEquatable<DeleteAndReplaceVersionBean>
    {
        /// <summary>
        /// An array of custom field IDs (&#x60;customFieldId&#x60;) and version IDs (&#x60;moveTo&#x60;) to update when the fields contain the deleted version.
        /// </summary>
        /// <value>An array of custom field IDs (&#x60;customFieldId&#x60;) and version IDs (&#x60;moveTo&#x60;) to update when the fields contain the deleted version.</value>
        [DataMember(Name="customFieldReplacementList", EmitDefaultValue=false)]
        public List<CustomFieldReplacement> CustomFieldReplacementList { get; set; }

        /// <summary>
        /// The ID of the version to update &#x60;affectedVersion&#x60; to when the field contains the deleted version.
        /// </summary>
        /// <value>The ID of the version to update &#x60;affectedVersion&#x60; to when the field contains the deleted version.</value>
        [DataMember(Name="moveAffectedIssuesTo", EmitDefaultValue=true)]
        public long MoveAffectedIssuesTo { get; set; }

        /// <summary>
        /// The ID of the version to update &#x60;fixVersion&#x60; to when the field contains the deleted version.
        /// </summary>
        /// <value>The ID of the version to update &#x60;fixVersion&#x60; to when the field contains the deleted version.</value>
        [DataMember(Name="moveFixIssuesTo", EmitDefaultValue=true)]
        public long MoveFixIssuesTo { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DeleteAndReplaceVersionBean {\n");
            sb.Append("  CustomFieldReplacementList: ").Append(CustomFieldReplacementList).Append("\n");
            sb.Append("  MoveAffectedIssuesTo: ").Append(MoveAffectedIssuesTo).Append("\n");
            sb.Append("  MoveFixIssuesTo: ").Append(MoveFixIssuesTo).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DeleteAndReplaceVersionBean)obj);
        }

        /// <summary>
        /// Returns true if DeleteAndReplaceVersionBean instances are equal
        /// </summary>
        /// <param name="other">Instance of DeleteAndReplaceVersionBean to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DeleteAndReplaceVersionBean other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CustomFieldReplacementList == other.CustomFieldReplacementList ||
                    CustomFieldReplacementList != null &&
                    other.CustomFieldReplacementList != null &&
                    CustomFieldReplacementList.SequenceEqual(other.CustomFieldReplacementList)
                ) && 
                (
                    MoveAffectedIssuesTo == other.MoveAffectedIssuesTo ||
                    
                    MoveAffectedIssuesTo.Equals(other.MoveAffectedIssuesTo)
                ) && 
                (
                    MoveFixIssuesTo == other.MoveFixIssuesTo ||
                    
                    MoveFixIssuesTo.Equals(other.MoveFixIssuesTo)
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
                    if (CustomFieldReplacementList != null)
                    hashCode = hashCode * 59 + CustomFieldReplacementList.GetHashCode();
                    
                    hashCode = hashCode * 59 + MoveAffectedIssuesTo.GetHashCode();
                    
                    hashCode = hashCode * 59 + MoveFixIssuesTo.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DeleteAndReplaceVersionBean left, DeleteAndReplaceVersionBean right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DeleteAndReplaceVersionBean left, DeleteAndReplaceVersionBean right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
