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
    /// Insights about the project.
    /// </summary>
    [DataContract]
    public partial class ProjectInsight : IEquatable<ProjectInsight>
    {
        /// <summary>
        /// The last issue update time.
        /// </summary>
        /// <value>The last issue update time.</value>
        [DataMember(Name="lastIssueUpdateTime", EmitDefaultValue=false)]
        public DateTime LastIssueUpdateTime { get; set; }

        /// <summary>
        /// Total issue count.
        /// </summary>
        /// <value>Total issue count.</value>
        [DataMember(Name="totalIssueCount", EmitDefaultValue=true)]
        public long TotalIssueCount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProjectInsight {\n");
            sb.Append("  LastIssueUpdateTime: ").Append(LastIssueUpdateTime).Append("\n");
            sb.Append("  TotalIssueCount: ").Append(TotalIssueCount).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ProjectInsight)obj);
        }

        /// <summary>
        /// Returns true if ProjectInsight instances are equal
        /// </summary>
        /// <param name="other">Instance of ProjectInsight to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProjectInsight other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    LastIssueUpdateTime == other.LastIssueUpdateTime ||
                    LastIssueUpdateTime != null &&
                    LastIssueUpdateTime.Equals(other.LastIssueUpdateTime)
                ) && 
                (
                    TotalIssueCount == other.TotalIssueCount ||
                    
                    TotalIssueCount.Equals(other.TotalIssueCount)
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
                    if (LastIssueUpdateTime != null)
                    hashCode = hashCode * 59 + LastIssueUpdateTime.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalIssueCount.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ProjectInsight left, ProjectInsight right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProjectInsight left, ProjectInsight right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}