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
    /// Details of any errors encountered while updating workflow transition rules for a workflow.
    /// </summary>
    [DataContract]
    public partial class WorkflowTransitionRulesUpdateErrorDetails : IEquatable<WorkflowTransitionRulesUpdateErrorDetails>
    {
        /// <summary>
        /// A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn&#39;t updated.
        /// </summary>
        /// <value>A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn&#39;t updated.</value>
        [Required]
        [DataMember(Name="ruleUpdateErrors", EmitDefaultValue=false)]
        public Dictionary<string, List<string>> RuleUpdateErrors { get; set; }

        /// <summary>
        /// The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.
        /// </summary>
        /// <value>The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.</value>
        [Required]
        [DataMember(Name="updateErrors", EmitDefaultValue=false)]
        public List<string> UpdateErrors { get; set; }

        /// <summary>
        /// Gets or Sets WorkflowId
        /// </summary>
        [Required]
        [DataMember(Name="workflowId", EmitDefaultValue=false)]
        public WorkflowId WorkflowId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkflowTransitionRulesUpdateErrorDetails {\n");
            sb.Append("  RuleUpdateErrors: ").Append(RuleUpdateErrors).Append("\n");
            sb.Append("  UpdateErrors: ").Append(UpdateErrors).Append("\n");
            sb.Append("  WorkflowId: ").Append(WorkflowId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WorkflowTransitionRulesUpdateErrorDetails)obj);
        }

        /// <summary>
        /// Returns true if WorkflowTransitionRulesUpdateErrorDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of WorkflowTransitionRulesUpdateErrorDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkflowTransitionRulesUpdateErrorDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    RuleUpdateErrors == other.RuleUpdateErrors ||
                    RuleUpdateErrors != null &&
                    other.RuleUpdateErrors != null &&
                    RuleUpdateErrors.SequenceEqual(other.RuleUpdateErrors)
                ) && 
                (
                    UpdateErrors == other.UpdateErrors ||
                    UpdateErrors != null &&
                    other.UpdateErrors != null &&
                    UpdateErrors.SequenceEqual(other.UpdateErrors)
                ) && 
                (
                    WorkflowId == other.WorkflowId ||
                    WorkflowId != null &&
                    WorkflowId.Equals(other.WorkflowId)
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
                    if (RuleUpdateErrors != null)
                    hashCode = hashCode * 59 + RuleUpdateErrors.GetHashCode();
                    if (UpdateErrors != null)
                    hashCode = hashCode * 59 + UpdateErrors.GetHashCode();
                    if (WorkflowId != null)
                    hashCode = hashCode * 59 + WorkflowId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WorkflowTransitionRulesUpdateErrorDetails left, WorkflowTransitionRulesUpdateErrorDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WorkflowTransitionRulesUpdateErrorDetails left, WorkflowTransitionRulesUpdateErrorDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
