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
    /// Details of global and project permissions granted to the user.
    /// </summary>
    [DataContract]
    public partial class BulkPermissionGrants : IEquatable<BulkPermissionGrants>
    {
        /// <summary>
        /// List of permissions granted to the user.
        /// </summary>
        /// <value>List of permissions granted to the user.</value>
        [Required]
        [DataMember(Name="globalPermissions", EmitDefaultValue=false)]
        public List<string> GlobalPermissions { get; set; }

        /// <summary>
        /// List of project permissions and the projects and issues those permissions provide access to.
        /// </summary>
        /// <value>List of project permissions and the projects and issues those permissions provide access to.</value>
        [Required]
        [DataMember(Name="projectPermissions", EmitDefaultValue=false)]
        public List<BulkProjectPermissionGrants> ProjectPermissions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BulkPermissionGrants {\n");
            sb.Append("  GlobalPermissions: ").Append(GlobalPermissions).Append("\n");
            sb.Append("  ProjectPermissions: ").Append(ProjectPermissions).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BulkPermissionGrants)obj);
        }

        /// <summary>
        /// Returns true if BulkPermissionGrants instances are equal
        /// </summary>
        /// <param name="other">Instance of BulkPermissionGrants to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BulkPermissionGrants other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    GlobalPermissions == other.GlobalPermissions ||
                    GlobalPermissions != null &&
                    other.GlobalPermissions != null &&
                    GlobalPermissions.SequenceEqual(other.GlobalPermissions)
                ) && 
                (
                    ProjectPermissions == other.ProjectPermissions ||
                    ProjectPermissions != null &&
                    other.ProjectPermissions != null &&
                    ProjectPermissions.SequenceEqual(other.ProjectPermissions)
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
                    if (GlobalPermissions != null)
                    hashCode = hashCode * 59 + GlobalPermissions.GetHashCode();
                    if (ProjectPermissions != null)
                    hashCode = hashCode * 59 + ProjectPermissions.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BulkPermissionGrants left, BulkPermissionGrants right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BulkPermissionGrants left, BulkPermissionGrants right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
