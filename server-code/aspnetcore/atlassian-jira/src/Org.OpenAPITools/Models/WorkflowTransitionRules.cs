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
    /// A workflow with transition rules.
    /// </summary>
    [DataContract]
    public partial class WorkflowTransitionRules : IEquatable<WorkflowTransitionRules>
    {
        /// <summary>
        /// The list of conditions within the workflow.
        /// </summary>
        /// <value>The list of conditions within the workflow.</value>
        [DataMember(Name="conditions", EmitDefaultValue=false)]
        public List<AppWorkflowTransitionRule> Conditions { get; set; }

        /// <summary>
        /// The list of post functions within the workflow.
        /// </summary>
        /// <value>The list of post functions within the workflow.</value>
        [DataMember(Name="postFunctions", EmitDefaultValue=false)]
        public List<AppWorkflowTransitionRule> PostFunctions { get; set; }

        /// <summary>
        /// The list of validators within the workflow.
        /// </summary>
        /// <value>The list of validators within the workflow.</value>
        [DataMember(Name="validators", EmitDefaultValue=false)]
        public List<AppWorkflowTransitionRule> Validators { get; set; }

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
            sb.Append("class WorkflowTransitionRules {\n");
            sb.Append("  Conditions: ").Append(Conditions).Append("\n");
            sb.Append("  PostFunctions: ").Append(PostFunctions).Append("\n");
            sb.Append("  Validators: ").Append(Validators).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WorkflowTransitionRules)obj);
        }

        /// <summary>
        /// Returns true if WorkflowTransitionRules instances are equal
        /// </summary>
        /// <param name="other">Instance of WorkflowTransitionRules to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkflowTransitionRules other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Conditions == other.Conditions ||
                    Conditions != null &&
                    other.Conditions != null &&
                    Conditions.SequenceEqual(other.Conditions)
                ) && 
                (
                    PostFunctions == other.PostFunctions ||
                    PostFunctions != null &&
                    other.PostFunctions != null &&
                    PostFunctions.SequenceEqual(other.PostFunctions)
                ) && 
                (
                    Validators == other.Validators ||
                    Validators != null &&
                    other.Validators != null &&
                    Validators.SequenceEqual(other.Validators)
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
                    if (Conditions != null)
                    hashCode = hashCode * 59 + Conditions.GetHashCode();
                    if (PostFunctions != null)
                    hashCode = hashCode * 59 + PostFunctions.GetHashCode();
                    if (Validators != null)
                    hashCode = hashCode * 59 + Validators.GetHashCode();
                    if (WorkflowId != null)
                    hashCode = hashCode * 59 + WorkflowId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WorkflowTransitionRules left, WorkflowTransitionRules right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WorkflowTransitionRules left, WorkflowTransitionRules right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
