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
    /// A response object returned from the task count endpoint.
    /// </summary>
    [DataContract]
    public partial class TaskCountResponse : IEquatable<TaskCountResponse>
    {
        /// <summary>
        /// The number of completed milestones in a project.
        /// </summary>
        /// <value>The number of completed milestones in a project.</value>
        /// <example>3</example>
        [DataMember(Name="num_completed_milestones", EmitDefaultValue=true)]
        public int NumCompletedMilestones { get; set; }

        /// <summary>
        /// The number of completed tasks in a project.
        /// </summary>
        /// <value>The number of completed tasks in a project.</value>
        /// <example>150</example>
        [DataMember(Name="num_completed_tasks", EmitDefaultValue=true)]
        public int NumCompletedTasks { get; set; }

        /// <summary>
        /// The number of incomplete milestones in a project.
        /// </summary>
        /// <value>The number of incomplete milestones in a project.</value>
        /// <example>7</example>
        [DataMember(Name="num_incomplete_milestones", EmitDefaultValue=true)]
        public int NumIncompleteMilestones { get; set; }

        /// <summary>
        /// The number of incomplete tasks in a project.
        /// </summary>
        /// <value>The number of incomplete tasks in a project.</value>
        /// <example>50</example>
        [DataMember(Name="num_incomplete_tasks", EmitDefaultValue=true)]
        public int NumIncompleteTasks { get; set; }

        /// <summary>
        /// The number of milestones in a project.
        /// </summary>
        /// <value>The number of milestones in a project.</value>
        /// <example>10</example>
        [DataMember(Name="num_milestones", EmitDefaultValue=true)]
        public int NumMilestones { get; set; }

        /// <summary>
        /// The number of tasks in a project.
        /// </summary>
        /// <value>The number of tasks in a project.</value>
        /// <example>200</example>
        [DataMember(Name="num_tasks", EmitDefaultValue=true)]
        public int NumTasks { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TaskCountResponse {\n");
            sb.Append("  NumCompletedMilestones: ").Append(NumCompletedMilestones).Append("\n");
            sb.Append("  NumCompletedTasks: ").Append(NumCompletedTasks).Append("\n");
            sb.Append("  NumIncompleteMilestones: ").Append(NumIncompleteMilestones).Append("\n");
            sb.Append("  NumIncompleteTasks: ").Append(NumIncompleteTasks).Append("\n");
            sb.Append("  NumMilestones: ").Append(NumMilestones).Append("\n");
            sb.Append("  NumTasks: ").Append(NumTasks).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TaskCountResponse)obj);
        }

        /// <summary>
        /// Returns true if TaskCountResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of TaskCountResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TaskCountResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    NumCompletedMilestones == other.NumCompletedMilestones ||
                    
                    NumCompletedMilestones.Equals(other.NumCompletedMilestones)
                ) && 
                (
                    NumCompletedTasks == other.NumCompletedTasks ||
                    
                    NumCompletedTasks.Equals(other.NumCompletedTasks)
                ) && 
                (
                    NumIncompleteMilestones == other.NumIncompleteMilestones ||
                    
                    NumIncompleteMilestones.Equals(other.NumIncompleteMilestones)
                ) && 
                (
                    NumIncompleteTasks == other.NumIncompleteTasks ||
                    
                    NumIncompleteTasks.Equals(other.NumIncompleteTasks)
                ) && 
                (
                    NumMilestones == other.NumMilestones ||
                    
                    NumMilestones.Equals(other.NumMilestones)
                ) && 
                (
                    NumTasks == other.NumTasks ||
                    
                    NumTasks.Equals(other.NumTasks)
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
                    
                    hashCode = hashCode * 59 + NumCompletedMilestones.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumCompletedTasks.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumIncompleteMilestones.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumIncompleteTasks.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumMilestones.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumTasks.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TaskCountResponse left, TaskCountResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TaskCountResponse left, TaskCountResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
