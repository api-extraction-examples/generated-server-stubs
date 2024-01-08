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
    /// The details of a created custom field context.
    /// </summary>
    [DataContract]
    public partial class CreateCustomFieldContext : IEquatable<CreateCustomFieldContext>
    {
        /// <summary>
        /// The description of the context.
        /// </summary>
        /// <value>The description of the context.</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// The ID of the context.
        /// </summary>
        /// <value>The ID of the context.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.
        /// </summary>
        /// <value>The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.</value>
        [DataMember(Name="issueTypeIds", EmitDefaultValue=false)]
        public List<string> IssueTypeIds { get; set; }

        /// <summary>
        /// The name of the context.
        /// </summary>
        /// <value>The name of the context.</value>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The list of project IDs associated with the context. If the list is empty, the context is global.
        /// </summary>
        /// <value>The list of project IDs associated with the context. If the list is empty, the context is global.</value>
        [DataMember(Name="projectIds", EmitDefaultValue=false)]
        public List<string> ProjectIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateCustomFieldContext {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IssueTypeIds: ").Append(IssueTypeIds).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ProjectIds: ").Append(ProjectIds).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CreateCustomFieldContext)obj);
        }

        /// <summary>
        /// Returns true if CreateCustomFieldContext instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateCustomFieldContext to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateCustomFieldContext other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    IssueTypeIds == other.IssueTypeIds ||
                    IssueTypeIds != null &&
                    other.IssueTypeIds != null &&
                    IssueTypeIds.SequenceEqual(other.IssueTypeIds)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    ProjectIds == other.ProjectIds ||
                    ProjectIds != null &&
                    other.ProjectIds != null &&
                    ProjectIds.SequenceEqual(other.ProjectIds)
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
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (IssueTypeIds != null)
                    hashCode = hashCode * 59 + IssueTypeIds.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (ProjectIds != null)
                    hashCode = hashCode * 59 + ProjectIds.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateCustomFieldContext left, CreateCustomFieldContext right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateCustomFieldContext left, CreateCustomFieldContext right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}