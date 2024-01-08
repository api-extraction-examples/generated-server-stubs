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
    /// Details about the default workflow.
    /// </summary>
    [DataContract]
    public partial class DefaultWorkflow : IEquatable<DefaultWorkflow>
    {
        /// <summary>
        /// Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to &#x60;false&#x60;.
        /// </summary>
        /// <value>Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to &#x60;false&#x60;.</value>
        [DataMember(Name="updateDraftIfNeeded", EmitDefaultValue=true)]
        public bool UpdateDraftIfNeeded { get; set; }

        /// <summary>
        /// The name of the workflow to set as the default workflow.
        /// </summary>
        /// <value>The name of the workflow to set as the default workflow.</value>
        [Required]
        [DataMember(Name="workflow", EmitDefaultValue=false)]
        public string Workflow { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DefaultWorkflow {\n");
            sb.Append("  UpdateDraftIfNeeded: ").Append(UpdateDraftIfNeeded).Append("\n");
            sb.Append("  Workflow: ").Append(Workflow).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DefaultWorkflow)obj);
        }

        /// <summary>
        /// Returns true if DefaultWorkflow instances are equal
        /// </summary>
        /// <param name="other">Instance of DefaultWorkflow to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DefaultWorkflow other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    UpdateDraftIfNeeded == other.UpdateDraftIfNeeded ||
                    
                    UpdateDraftIfNeeded.Equals(other.UpdateDraftIfNeeded)
                ) && 
                (
                    Workflow == other.Workflow ||
                    Workflow != null &&
                    Workflow.Equals(other.Workflow)
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
                    
                    hashCode = hashCode * 59 + UpdateDraftIfNeeded.GetHashCode();
                    if (Workflow != null)
                    hashCode = hashCode * 59 + Workflow.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DefaultWorkflow left, DefaultWorkflow right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DefaultWorkflow left, DefaultWorkflow right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
