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
    /// A workflow scheme along with a list of projects that use it.
    /// </summary>
    [DataContract]
    public partial class WorkflowSchemeAssociations : IEquatable<WorkflowSchemeAssociations>
    {
        /// <summary>
        /// The list of projects that use the workflow scheme.
        /// </summary>
        /// <value>The list of projects that use the workflow scheme.</value>
        [Required]
        [DataMember(Name="projectIds", EmitDefaultValue=false)]
        public List<string> ProjectIds { get; set; }

        /// <summary>
        /// Gets or Sets WorkflowScheme
        /// </summary>
        [Required]
        [DataMember(Name="workflowScheme", EmitDefaultValue=false)]
        public WorkflowScheme WorkflowScheme { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkflowSchemeAssociations {\n");
            sb.Append("  ProjectIds: ").Append(ProjectIds).Append("\n");
            sb.Append("  WorkflowScheme: ").Append(WorkflowScheme).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WorkflowSchemeAssociations)obj);
        }

        /// <summary>
        /// Returns true if WorkflowSchemeAssociations instances are equal
        /// </summary>
        /// <param name="other">Instance of WorkflowSchemeAssociations to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkflowSchemeAssociations other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ProjectIds == other.ProjectIds ||
                    ProjectIds != null &&
                    other.ProjectIds != null &&
                    ProjectIds.SequenceEqual(other.ProjectIds)
                ) && 
                (
                    WorkflowScheme == other.WorkflowScheme ||
                    WorkflowScheme != null &&
                    WorkflowScheme.Equals(other.WorkflowScheme)
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
                    if (ProjectIds != null)
                    hashCode = hashCode * 59 + ProjectIds.GetHashCode();
                    if (WorkflowScheme != null)
                    hashCode = hashCode * 59 + WorkflowScheme.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WorkflowSchemeAssociations left, WorkflowSchemeAssociations right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WorkflowSchemeAssociations left, WorkflowSchemeAssociations right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}