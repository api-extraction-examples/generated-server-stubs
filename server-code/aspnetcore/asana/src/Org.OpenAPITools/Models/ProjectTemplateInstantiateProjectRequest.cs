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
    public partial class ProjectTemplateInstantiateProjectRequest : IEquatable<ProjectTemplateInstantiateProjectRequest>
    {
        /// <summary>
        /// *Optional*. If set to &#x60;true&#x60;, the endpoint returns an \&quot;Unprocessable Entity\&quot; error if you fail to provide a calendar date value for any date variable. If set to &#x60;false&#x60;, a default date is used for each unfulfilled date variable (e.g., the current date is used as the Start Date of a project).
        /// </summary>
        /// <value>*Optional*. If set to &#x60;true&#x60;, the endpoint returns an \&quot;Unprocessable Entity\&quot; error if you fail to provide a calendar date value for any date variable. If set to &#x60;false&#x60;, a default date is used for each unfulfilled date variable (e.g., the current date is used as the Start Date of a project).</value>
        /// <example>true</example>
        [DataMember(Name="is_strict", EmitDefaultValue=true)]
        public bool IsStrict { get; set; }

        /// <summary>
        /// The name of the new project.
        /// </summary>
        /// <value>The name of the new project.</value>
        /// <example>New Project Name</example>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Sets the project to public to its team.
        /// </summary>
        /// <value>Sets the project to public to its team.</value>
        /// <example>true</example>
        [Required]
        [DataMember(Name="public", EmitDefaultValue=true)]
        public bool VarPublic { get; set; }

        /// <summary>
        /// Array of mappings of date variables to calendar dates.
        /// </summary>
        /// <value>Array of mappings of date variables to calendar dates.</value>
        [DataMember(Name="requested_dates", EmitDefaultValue=false)]
        public List<DateVariableRequest> RequestedDates { get; set; }

        /// <summary>
        /// *Conditional*. Sets the team of the new project. If the project template exists in an _organization_, you must specify a value for &#x60;team&#x60; and not &#x60;workspace&#x60;.
        /// </summary>
        /// <value>*Conditional*. Sets the team of the new project. If the project template exists in an _organization_, you must specify a value for &#x60;team&#x60; and not &#x60;workspace&#x60;.</value>
        /// <example>12345</example>
        [DataMember(Name="team", EmitDefaultValue=false)]
        public string Team { get; set; }

        /// <summary>
        /// *Conditional*. Sets the workspace of the new project. If the project template exists in a _workspace_, you must specify a value for &#x60;workspace&#x60; and not &#x60;team&#x60;.
        /// </summary>
        /// <value>*Conditional*. Sets the workspace of the new project. If the project template exists in a _workspace_, you must specify a value for &#x60;workspace&#x60; and not &#x60;team&#x60;.</value>
        /// <example>12345</example>
        [DataMember(Name="workspace", EmitDefaultValue=false)]
        public string Workspace { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProjectTemplateInstantiateProjectRequest {\n");
            sb.Append("  IsStrict: ").Append(IsStrict).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  VarPublic: ").Append(VarPublic).Append("\n");
            sb.Append("  RequestedDates: ").Append(RequestedDates).Append("\n");
            sb.Append("  Team: ").Append(Team).Append("\n");
            sb.Append("  Workspace: ").Append(Workspace).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ProjectTemplateInstantiateProjectRequest)obj);
        }

        /// <summary>
        /// Returns true if ProjectTemplateInstantiateProjectRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of ProjectTemplateInstantiateProjectRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProjectTemplateInstantiateProjectRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    IsStrict == other.IsStrict ||
                    
                    IsStrict.Equals(other.IsStrict)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    VarPublic == other.VarPublic ||
                    
                    VarPublic.Equals(other.VarPublic)
                ) && 
                (
                    RequestedDates == other.RequestedDates ||
                    RequestedDates != null &&
                    other.RequestedDates != null &&
                    RequestedDates.SequenceEqual(other.RequestedDates)
                ) && 
                (
                    Team == other.Team ||
                    Team != null &&
                    Team.Equals(other.Team)
                ) && 
                (
                    Workspace == other.Workspace ||
                    Workspace != null &&
                    Workspace.Equals(other.Workspace)
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
                    
                    hashCode = hashCode * 59 + IsStrict.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarPublic.GetHashCode();
                    if (RequestedDates != null)
                    hashCode = hashCode * 59 + RequestedDates.GetHashCode();
                    if (Team != null)
                    hashCode = hashCode * 59 + Team.GetHashCode();
                    if (Workspace != null)
                    hashCode = hashCode * 59 + Workspace.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ProjectTemplateInstantiateProjectRequest left, ProjectTemplateInstantiateProjectRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProjectTemplateInstantiateProjectRequest left, ProjectTemplateInstantiateProjectRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}