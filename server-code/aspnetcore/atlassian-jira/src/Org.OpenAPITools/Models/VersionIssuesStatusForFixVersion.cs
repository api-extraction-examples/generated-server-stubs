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
    /// If the expand option &#x60;issuesstatus&#x60; is used, returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.
    /// </summary>
    [DataContract]
    public partial class VersionIssuesStatusForFixVersion : IEquatable<VersionIssuesStatusForFixVersion>
    {
        /// <summary>
        /// Count of issues with status *done*.
        /// </summary>
        /// <value>Count of issues with status *done*.</value>
        [DataMember(Name="done", EmitDefaultValue=true)]
        public long Done { get; set; }

        /// <summary>
        /// Count of issues with status *in progress*.
        /// </summary>
        /// <value>Count of issues with status *in progress*.</value>
        [DataMember(Name="inProgress", EmitDefaultValue=true)]
        public long InProgress { get; set; }

        /// <summary>
        /// Count of issues with status *to do*.
        /// </summary>
        /// <value>Count of issues with status *to do*.</value>
        [DataMember(Name="toDo", EmitDefaultValue=true)]
        public long ToDo { get; set; }

        /// <summary>
        /// Count of issues with a status other than *to do*, *in progress*, and *done*.
        /// </summary>
        /// <value>Count of issues with a status other than *to do*, *in progress*, and *done*.</value>
        [DataMember(Name="unmapped", EmitDefaultValue=true)]
        public long Unmapped { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VersionIssuesStatusForFixVersion {\n");
            sb.Append("  Done: ").Append(Done).Append("\n");
            sb.Append("  InProgress: ").Append(InProgress).Append("\n");
            sb.Append("  ToDo: ").Append(ToDo).Append("\n");
            sb.Append("  Unmapped: ").Append(Unmapped).Append("\n");
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
            return obj.GetType() == GetType() && Equals((VersionIssuesStatusForFixVersion)obj);
        }

        /// <summary>
        /// Returns true if VersionIssuesStatusForFixVersion instances are equal
        /// </summary>
        /// <param name="other">Instance of VersionIssuesStatusForFixVersion to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VersionIssuesStatusForFixVersion other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Done == other.Done ||
                    
                    Done.Equals(other.Done)
                ) && 
                (
                    InProgress == other.InProgress ||
                    
                    InProgress.Equals(other.InProgress)
                ) && 
                (
                    ToDo == other.ToDo ||
                    
                    ToDo.Equals(other.ToDo)
                ) && 
                (
                    Unmapped == other.Unmapped ||
                    
                    Unmapped.Equals(other.Unmapped)
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
                    
                    hashCode = hashCode * 59 + Done.GetHashCode();
                    
                    hashCode = hashCode * 59 + InProgress.GetHashCode();
                    
                    hashCode = hashCode * 59 + ToDo.GetHashCode();
                    
                    hashCode = hashCode * 59 + Unmapped.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(VersionIssuesStatusForFixVersion left, VersionIssuesStatusForFixVersion right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(VersionIssuesStatusForFixVersion left, VersionIssuesStatusForFixVersion right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
