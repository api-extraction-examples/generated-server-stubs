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
    /// The wrapper for the issue creation metadata for a list of projects.
    /// </summary>
    [DataContract]
    public partial class IssueCreateMetadata : IEquatable<IssueCreateMetadata>
    {
        /// <summary>
        /// Expand options that include additional project details in the response.
        /// </summary>
        /// <value>Expand options that include additional project details in the response.</value>
        [DataMember(Name="expand", EmitDefaultValue=false)]
        public string Expand { get; set; }

        /// <summary>
        /// List of projects and their issue creation metadata.
        /// </summary>
        /// <value>List of projects and their issue creation metadata.</value>
        [DataMember(Name="projects", EmitDefaultValue=false)]
        public List<ProjectIssueCreateMetadata> Projects { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IssueCreateMetadata {\n");
            sb.Append("  Expand: ").Append(Expand).Append("\n");
            sb.Append("  Projects: ").Append(Projects).Append("\n");
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
            return obj.GetType() == GetType() && Equals((IssueCreateMetadata)obj);
        }

        /// <summary>
        /// Returns true if IssueCreateMetadata instances are equal
        /// </summary>
        /// <param name="other">Instance of IssueCreateMetadata to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IssueCreateMetadata other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Expand == other.Expand ||
                    Expand != null &&
                    Expand.Equals(other.Expand)
                ) && 
                (
                    Projects == other.Projects ||
                    Projects != null &&
                    other.Projects != null &&
                    Projects.SequenceEqual(other.Projects)
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
                    if (Expand != null)
                    hashCode = hashCode * 59 + Expand.GetHashCode();
                    if (Projects != null)
                    hashCode = hashCode * 59 + Projects.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IssueCreateMetadata left, IssueCreateMetadata right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IssueCreateMetadata left, IssueCreateMetadata right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}