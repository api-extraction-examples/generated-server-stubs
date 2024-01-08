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
    /// A collection of transition rules.
    /// </summary>
    [DataContract]
    public partial class WorkflowRules : IEquatable<WorkflowRules>
    {
        /// <summary>
        /// Gets or Sets ConditionsTree
        /// </summary>
        [DataMember(Name="conditionsTree", EmitDefaultValue=false)]
        public WorkflowCondition ConditionsTree { get; set; }

        /// <summary>
        /// The workflow post functions.
        /// </summary>
        /// <value>The workflow post functions.</value>
        [DataMember(Name="postFunctions", EmitDefaultValue=false)]
        public List<WorkflowTransitionRule> PostFunctions { get; set; }

        /// <summary>
        /// The workflow validators.
        /// </summary>
        /// <value>The workflow validators.</value>
        [DataMember(Name="validators", EmitDefaultValue=false)]
        public List<WorkflowTransitionRule> Validators { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkflowRules {\n");
            sb.Append("  ConditionsTree: ").Append(ConditionsTree).Append("\n");
            sb.Append("  PostFunctions: ").Append(PostFunctions).Append("\n");
            sb.Append("  Validators: ").Append(Validators).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WorkflowRules)obj);
        }

        /// <summary>
        /// Returns true if WorkflowRules instances are equal
        /// </summary>
        /// <param name="other">Instance of WorkflowRules to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkflowRules other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ConditionsTree == other.ConditionsTree ||
                    ConditionsTree != null &&
                    ConditionsTree.Equals(other.ConditionsTree)
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
                    if (ConditionsTree != null)
                    hashCode = hashCode * 59 + ConditionsTree.GetHashCode();
                    if (PostFunctions != null)
                    hashCode = hashCode * 59 + PostFunctions.GetHashCode();
                    if (Validators != null)
                    hashCode = hashCode * 59 + Validators.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WorkflowRules left, WorkflowRules right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WorkflowRules left, WorkflowRules right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
