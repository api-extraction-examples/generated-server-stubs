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
    /// List of project permissions and the projects and issues those permissions grant access to.
    /// </summary>
    [DataContract]
    public partial class BulkProjectPermissionGrants : IEquatable<BulkProjectPermissionGrants>
    {
        /// <summary>
        /// IDs of the issues the user has the permission for.
        /// </summary>
        /// <value>IDs of the issues the user has the permission for.</value>
        [Required]
        [DataMember(Name="issues", EmitDefaultValue=false)]
        public List<long> Issues { get; set; }

        /// <summary>
        /// A project permission,
        /// </summary>
        /// <value>A project permission,</value>
        [Required]
        [DataMember(Name="permission", EmitDefaultValue=false)]
        public string Permission { get; set; }

        /// <summary>
        /// IDs of the projects the user has the permission for.
        /// </summary>
        /// <value>IDs of the projects the user has the permission for.</value>
        [Required]
        [DataMember(Name="projects", EmitDefaultValue=false)]
        public List<long> Projects { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BulkProjectPermissionGrants {\n");
            sb.Append("  Issues: ").Append(Issues).Append("\n");
            sb.Append("  Permission: ").Append(Permission).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BulkProjectPermissionGrants)obj);
        }

        /// <summary>
        /// Returns true if BulkProjectPermissionGrants instances are equal
        /// </summary>
        /// <param name="other">Instance of BulkProjectPermissionGrants to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BulkProjectPermissionGrants other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Issues == other.Issues ||
                    Issues != null &&
                    other.Issues != null &&
                    Issues.SequenceEqual(other.Issues)
                ) && 
                (
                    Permission == other.Permission ||
                    Permission != null &&
                    Permission.Equals(other.Permission)
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
                    if (Issues != null)
                    hashCode = hashCode * 59 + Issues.GetHashCode();
                    if (Permission != null)
                    hashCode = hashCode * 59 + Permission.GetHashCode();
                    if (Projects != null)
                    hashCode = hashCode * 59 + Projects.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BulkProjectPermissionGrants left, BulkProjectPermissionGrants right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BulkProjectPermissionGrants left, BulkProjectPermissionGrants right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
