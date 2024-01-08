/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: support@launchdarkly.com
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
    public partial class GetFlagConfigScheduledChangesConflictsRequest : IEquatable<GetFlagConfigScheduledChangesConflictsRequest>
    {
        /// <summary>
        /// A unix epoch time in milliseconds specifying the date the scheduled changes will be applied
        /// </summary>
        /// <value>A unix epoch time in milliseconds specifying the date the scheduled changes will be applied</value>
        [DataMember(Name="executionDate", EmitDefaultValue=true)]
        public int ExecutionDate { get; set; }

        /// <summary>
        /// Gets or Sets Instructions
        /// </summary>
        [DataMember(Name="instructions", EmitDefaultValue=false)]
        public List<SemanticPatchInstructionInner> Instructions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetFlagConfigScheduledChangesConflictsRequest {\n");
            sb.Append("  ExecutionDate: ").Append(ExecutionDate).Append("\n");
            sb.Append("  Instructions: ").Append(Instructions).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GetFlagConfigScheduledChangesConflictsRequest)obj);
        }

        /// <summary>
        /// Returns true if GetFlagConfigScheduledChangesConflictsRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of GetFlagConfigScheduledChangesConflictsRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetFlagConfigScheduledChangesConflictsRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ExecutionDate == other.ExecutionDate ||
                    
                    ExecutionDate.Equals(other.ExecutionDate)
                ) && 
                (
                    Instructions == other.Instructions ||
                    Instructions != null &&
                    other.Instructions != null &&
                    Instructions.SequenceEqual(other.Instructions)
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
                    
                    hashCode = hashCode * 59 + ExecutionDate.GetHashCode();
                    if (Instructions != null)
                    hashCode = hashCode * 59 + Instructions.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GetFlagConfigScheduledChangesConflictsRequest left, GetFlagConfigScheduledChangesConflictsRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GetFlagConfigScheduledChangesConflictsRequest left, GetFlagConfigScheduledChangesConflictsRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}