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
    /// Details of a share permission for the filter.
    /// </summary>
    [DataContract]
    public partial class SharePermission : IEquatable<SharePermission>
    {
        /// <summary>
        /// Gets or Sets Group
        /// </summary>
        [DataMember(Name="group", EmitDefaultValue=false)]
        public GroupName Group { get; set; }

        /// <summary>
        /// The unique identifier of the share permission.
        /// </summary>
        /// <value>The unique identifier of the share permission.</value>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public long Id { get; set; }

        /// <summary>
        /// Gets or Sets Project
        /// </summary>
        [DataMember(Name="project", EmitDefaultValue=false)]
        public Project Project { get; set; }

        /// <summary>
        /// Gets or Sets Role
        /// </summary>
        [DataMember(Name="role", EmitDefaultValue=false)]
        public ProjectRole Role { get; set; }


        /// <summary>
        /// The type of share permission:   *  `user` Shared with a user.  *  `group` Shared with a group. If set in a request, then specify `sharePermission.group` as well.  *  `project` Shared with a project. If set in a request, then specify `sharePermission.project` as well.  *  `projectRole` Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with `projectId` and `projectRoleId`.  *  `global` Shared globally. If set in a request, no other `sharePermission` properties need to be specified.  *  `loggedin` Shared with all logged-in users. Note: This value is set in a request by specifying `authenticated` as the `type`.  *  `project-unknown` Shared with a project that the user does not have access to. Cannot be set in a request.
        /// </summary>
        /// <value>The type of share permission:   *  `user` Shared with a user.  *  `group` Shared with a group. If set in a request, then specify `sharePermission.group` as well.  *  `project` Shared with a project. If set in a request, then specify `sharePermission.project` as well.  *  `projectRole` Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with `projectId` and `projectRoleId`.  *  `global` Shared globally. If set in a request, no other `sharePermission` properties need to be specified.  *  `loggedin` Shared with all logged-in users. Note: This value is set in a request by specifying `authenticated` as the `type`.  *  `project-unknown` Shared with a project that the user does not have access to. Cannot be set in a request.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum UserEnum for user
            /// </summary>
            [EnumMember(Value = "user")]
            UserEnum = 1,
            
            /// <summary>
            /// Enum GroupEnum for group
            /// </summary>
            [EnumMember(Value = "group")]
            GroupEnum = 2,
            
            /// <summary>
            /// Enum ProjectEnum for project
            /// </summary>
            [EnumMember(Value = "project")]
            ProjectEnum = 3,
            
            /// <summary>
            /// Enum ProjectRoleEnum for projectRole
            /// </summary>
            [EnumMember(Value = "projectRole")]
            ProjectRoleEnum = 4,
            
            /// <summary>
            /// Enum GlobalEnum for global
            /// </summary>
            [EnumMember(Value = "global")]
            GlobalEnum = 5,
            
            /// <summary>
            /// Enum LoggedinEnum for loggedin
            /// </summary>
            [EnumMember(Value = "loggedin")]
            LoggedinEnum = 6,
            
            /// <summary>
            /// Enum AuthenticatedEnum for authenticated
            /// </summary>
            [EnumMember(Value = "authenticated")]
            AuthenticatedEnum = 7,
            
            /// <summary>
            /// Enum ProjectUnknownEnum for project-unknown
            /// </summary>
            [EnumMember(Value = "project-unknown")]
            ProjectUnknownEnum = 8
        }

        /// <summary>
        /// The type of share permission:   *  &#x60;user&#x60; Shared with a user.  *  &#x60;group&#x60; Shared with a group. If set in a request, then specify &#x60;sharePermission.group&#x60; as well.  *  &#x60;project&#x60; Shared with a project. If set in a request, then specify &#x60;sharePermission.project&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with &#x60;projectId&#x60; and &#x60;projectRoleId&#x60;.  *  &#x60;global&#x60; Shared globally. If set in a request, no other &#x60;sharePermission&#x60; properties need to be specified.  *  &#x60;loggedin&#x60; Shared with all logged-in users. Note: This value is set in a request by specifying &#x60;authenticated&#x60; as the &#x60;type&#x60;.  *  &#x60;project-unknown&#x60; Shared with a project that the user does not have access to. Cannot be set in a request.
        /// </summary>
        /// <value>The type of share permission:   *  &#x60;user&#x60; Shared with a user.  *  &#x60;group&#x60; Shared with a group. If set in a request, then specify &#x60;sharePermission.group&#x60; as well.  *  &#x60;project&#x60; Shared with a project. If set in a request, then specify &#x60;sharePermission.project&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with &#x60;projectId&#x60; and &#x60;projectRoleId&#x60;.  *  &#x60;global&#x60; Shared globally. If set in a request, no other &#x60;sharePermission&#x60; properties need to be specified.  *  &#x60;loggedin&#x60; Shared with all logged-in users. Note: This value is set in a request by specifying &#x60;authenticated&#x60; as the &#x60;type&#x60;.  *  &#x60;project-unknown&#x60; Shared with a project that the user does not have access to. Cannot be set in a request.</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name="user", EmitDefaultValue=false)]
        public UserBean User { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SharePermission {\n");
            sb.Append("  Group: ").Append(Group).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Project: ").Append(Project).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SharePermission)obj);
        }

        /// <summary>
        /// Returns true if SharePermission instances are equal
        /// </summary>
        /// <param name="other">Instance of SharePermission to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SharePermission other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Group == other.Group ||
                    Group != null &&
                    Group.Equals(other.Group)
                ) && 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    Project == other.Project ||
                    Project != null &&
                    Project.Equals(other.Project)
                ) && 
                (
                    Role == other.Role ||
                    Role != null &&
                    Role.Equals(other.Role)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    User == other.User ||
                    User != null &&
                    User.Equals(other.User)
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
                    if (Group != null)
                    hashCode = hashCode * 59 + Group.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Project != null)
                    hashCode = hashCode * 59 + Project.GetHashCode();
                    if (Role != null)
                    hashCode = hashCode * 59 + Role.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (User != null)
                    hashCode = hashCode * 59 + User.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SharePermission left, SharePermission right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SharePermission left, SharePermission right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}