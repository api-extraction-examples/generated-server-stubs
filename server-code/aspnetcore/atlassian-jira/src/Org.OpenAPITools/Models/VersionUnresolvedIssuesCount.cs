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
    /// Count of a version&#39;s unresolved issues.
    /// </summary>
    [DataContract]
    public partial class VersionUnresolvedIssuesCount : IEquatable<VersionUnresolvedIssuesCount>
    {
        /// <summary>
        /// Count of issues.
        /// </summary>
        /// <value>Count of issues.</value>
        [DataMember(Name="issuesCount", EmitDefaultValue=true)]
        public long IssuesCount { get; set; }

        /// <summary>
        /// Count of unresolved issues.
        /// </summary>
        /// <value>Count of unresolved issues.</value>
        [DataMember(Name="issuesUnresolvedCount", EmitDefaultValue=true)]
        public long IssuesUnresolvedCount { get; set; }

        /// <summary>
        /// The URL of these count details.
        /// </summary>
        /// <value>The URL of these count details.</value>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public string Self { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VersionUnresolvedIssuesCount {\n");
            sb.Append("  IssuesCount: ").Append(IssuesCount).Append("\n");
            sb.Append("  IssuesUnresolvedCount: ").Append(IssuesUnresolvedCount).Append("\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
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
            return obj.GetType() == GetType() && Equals((VersionUnresolvedIssuesCount)obj);
        }

        /// <summary>
        /// Returns true if VersionUnresolvedIssuesCount instances are equal
        /// </summary>
        /// <param name="other">Instance of VersionUnresolvedIssuesCount to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VersionUnresolvedIssuesCount other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    IssuesCount == other.IssuesCount ||
                    
                    IssuesCount.Equals(other.IssuesCount)
                ) && 
                (
                    IssuesUnresolvedCount == other.IssuesUnresolvedCount ||
                    
                    IssuesUnresolvedCount.Equals(other.IssuesUnresolvedCount)
                ) && 
                (
                    Self == other.Self ||
                    Self != null &&
                    Self.Equals(other.Self)
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
                    
                    hashCode = hashCode * 59 + IssuesCount.GetHashCode();
                    
                    hashCode = hashCode * 59 + IssuesUnresolvedCount.GetHashCode();
                    if (Self != null)
                    hashCode = hashCode * 59 + Self.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(VersionUnresolvedIssuesCount left, VersionUnresolvedIssuesCount right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(VersionUnresolvedIssuesCount left, VersionUnresolvedIssuesCount right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
