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
    /// 
    /// </summary>
    [DataContract]
    public partial class StoryResponseAllOfOldDateValue : IEquatable<StoryResponseAllOfOldDateValue>
    {
        /// <summary>
        /// The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with &#x60;due_on&#x60;.
        /// </summary>
        /// <value>The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with &#x60;due_on&#x60;.</value>
        /// <example>2019-09-15T02:06:58.158Z</example>
        [DataMember(Name="due_at", EmitDefaultValue=true)]
        public DateTime? DueAt { get; set; }

        /// <summary>
        /// The localized day on which this goal is due. This takes a date with format &#x60;YYYY-MM-DD&#x60;.
        /// </summary>
        /// <value>The localized day on which this goal is due. This takes a date with format &#x60;YYYY-MM-DD&#x60;.</value>
        /// <example>Sat Sep 14 20:00:00 AST 2019</example>
        [DataMember(Name="due_on", EmitDefaultValue=false)]
        public DateTime DueOn { get; set; }

        /// <summary>
        /// The day on which work for this goal begins, or null if the goal has no start date. This takes a date with &#x60;YYYY-MM-DD&#x60; format, and cannot be set unless there is an accompanying due date.
        /// </summary>
        /// <value>The day on which work for this goal begins, or null if the goal has no start date. This takes a date with &#x60;YYYY-MM-DD&#x60; format, and cannot be set unless there is an accompanying due date.</value>
        /// <example>Fri Sep 13 20:00:00 AST 2019</example>
        [DataMember(Name="start_on", EmitDefaultValue=true)]
        public DateTime? StartOn { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StoryResponseAllOfOldDateValue {\n");
            sb.Append("  DueAt: ").Append(DueAt).Append("\n");
            sb.Append("  DueOn: ").Append(DueOn).Append("\n");
            sb.Append("  StartOn: ").Append(StartOn).Append("\n");
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
            return obj.GetType() == GetType() && Equals((StoryResponseAllOfOldDateValue)obj);
        }

        /// <summary>
        /// Returns true if StoryResponseAllOfOldDateValue instances are equal
        /// </summary>
        /// <param name="other">Instance of StoryResponseAllOfOldDateValue to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StoryResponseAllOfOldDateValue other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DueAt == other.DueAt ||
                    DueAt != null &&
                    DueAt.Equals(other.DueAt)
                ) && 
                (
                    DueOn == other.DueOn ||
                    DueOn != null &&
                    DueOn.Equals(other.DueOn)
                ) && 
                (
                    StartOn == other.StartOn ||
                    StartOn != null &&
                    StartOn.Equals(other.StartOn)
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
                    if (DueAt != null)
                    hashCode = hashCode * 59 + DueAt.GetHashCode();
                    if (DueOn != null)
                    hashCode = hashCode * 59 + DueOn.GetHashCode();
                    if (StartOn != null)
                    hashCode = hashCode * 59 + StartOn.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(StoryResponseAllOfOldDateValue left, StoryResponseAllOfOldDateValue right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(StoryResponseAllOfOldDateValue left, StoryResponseAllOfOldDateValue right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
