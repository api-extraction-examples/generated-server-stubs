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
    /// Details about the project.
    /// </summary>
    [DataContract]
    public partial class UpdateProjectDetails : IEquatable<UpdateProjectDetails>
    {

        /// <summary>
        /// The default assignee when creating issues for this project.
        /// </summary>
        /// <value>The default assignee when creating issues for this project.</value>
        [TypeConverter(typeof(CustomEnumConverter<AssigneeTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AssigneeTypeEnum
        {
            
            /// <summary>
            /// Enum PROJECTLEADEnum for PROJECT_LEAD
            /// </summary>
            [EnumMember(Value = "PROJECT_LEAD")]
            PROJECTLEADEnum = 1,
            
            /// <summary>
            /// Enum UNASSIGNEDEnum for UNASSIGNED
            /// </summary>
            [EnumMember(Value = "UNASSIGNED")]
            UNASSIGNEDEnum = 2
        }

        /// <summary>
        /// The default assignee when creating issues for this project.
        /// </summary>
        /// <value>The default assignee when creating issues for this project.</value>
        [DataMember(Name="assigneeType", EmitDefaultValue=true)]
        public AssigneeTypeEnum AssigneeType { get; set; }

        /// <summary>
        /// An integer value for the project&#39;s avatar.
        /// </summary>
        /// <value>An integer value for the project&#39;s avatar.</value>
        [DataMember(Name="avatarId", EmitDefaultValue=true)]
        public long AvatarId { get; set; }

        /// <summary>
        /// The ID of the project&#39;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to &#x60;-1.&#x60;
        /// </summary>
        /// <value>The ID of the project&#39;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to &#x60;-1.&#x60;</value>
        [DataMember(Name="categoryId", EmitDefaultValue=true)]
        public long CategoryId { get; set; }

        /// <summary>
        /// A brief description of the project.
        /// </summary>
        /// <value>A brief description of the project.</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.
        /// </summary>
        /// <value>The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.</value>
        [DataMember(Name="issueSecurityScheme", EmitDefaultValue=true)]
        public long IssueSecurityScheme { get; set; }

        /// <summary>
        /// Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
        /// </summary>
        /// <value>Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.</value>
        [DataMember(Name="key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// This parameter is deprecated because of privacy changes. Use &#x60;leadAccountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with &#x60;leadAccountId&#x60;.
        /// </summary>
        /// <value>This parameter is deprecated because of privacy changes. Use &#x60;leadAccountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with &#x60;leadAccountId&#x60;.</value>
        [DataMember(Name="lead", EmitDefaultValue=false)]
        public string Lead { get; set; }

        /// <summary>
        /// The account ID of the project lead. Cannot be provided with &#x60;lead&#x60;.
        /// </summary>
        /// <value>The account ID of the project lead. Cannot be provided with &#x60;lead&#x60;.</value>
        [MaxLength(128)]
        [DataMember(Name="leadAccountId", EmitDefaultValue=false)]
        public string LeadAccountId { get; set; }

        /// <summary>
        /// The name of the project.
        /// </summary>
        /// <value>The name of the project.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.
        /// </summary>
        /// <value>The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.</value>
        [DataMember(Name="notificationScheme", EmitDefaultValue=true)]
        public long NotificationScheme { get; set; }

        /// <summary>
        /// The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.
        /// </summary>
        /// <value>The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.</value>
        [DataMember(Name="permissionScheme", EmitDefaultValue=true)]
        public long PermissionScheme { get; set; }

        /// <summary>
        /// A link to information about this project, such as project documentation
        /// </summary>
        /// <value>A link to information about this project, such as project documentation</value>
        [DataMember(Name="url", EmitDefaultValue=false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdateProjectDetails {\n");
            sb.Append("  AssigneeType: ").Append(AssigneeType).Append("\n");
            sb.Append("  AvatarId: ").Append(AvatarId).Append("\n");
            sb.Append("  CategoryId: ").Append(CategoryId).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  IssueSecurityScheme: ").Append(IssueSecurityScheme).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Lead: ").Append(Lead).Append("\n");
            sb.Append("  LeadAccountId: ").Append(LeadAccountId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  NotificationScheme: ").Append(NotificationScheme).Append("\n");
            sb.Append("  PermissionScheme: ").Append(PermissionScheme).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UpdateProjectDetails)obj);
        }

        /// <summary>
        /// Returns true if UpdateProjectDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of UpdateProjectDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdateProjectDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AssigneeType == other.AssigneeType ||
                    
                    AssigneeType.Equals(other.AssigneeType)
                ) && 
                (
                    AvatarId == other.AvatarId ||
                    
                    AvatarId.Equals(other.AvatarId)
                ) && 
                (
                    CategoryId == other.CategoryId ||
                    
                    CategoryId.Equals(other.CategoryId)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    IssueSecurityScheme == other.IssueSecurityScheme ||
                    
                    IssueSecurityScheme.Equals(other.IssueSecurityScheme)
                ) && 
                (
                    Key == other.Key ||
                    Key != null &&
                    Key.Equals(other.Key)
                ) && 
                (
                    Lead == other.Lead ||
                    Lead != null &&
                    Lead.Equals(other.Lead)
                ) && 
                (
                    LeadAccountId == other.LeadAccountId ||
                    LeadAccountId != null &&
                    LeadAccountId.Equals(other.LeadAccountId)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    NotificationScheme == other.NotificationScheme ||
                    
                    NotificationScheme.Equals(other.NotificationScheme)
                ) && 
                (
                    PermissionScheme == other.PermissionScheme ||
                    
                    PermissionScheme.Equals(other.PermissionScheme)
                ) && 
                (
                    Url == other.Url ||
                    Url != null &&
                    Url.Equals(other.Url)
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
                    
                    hashCode = hashCode * 59 + AssigneeType.GetHashCode();
                    
                    hashCode = hashCode * 59 + AvatarId.GetHashCode();
                    
                    hashCode = hashCode * 59 + CategoryId.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    
                    hashCode = hashCode * 59 + IssueSecurityScheme.GetHashCode();
                    if (Key != null)
                    hashCode = hashCode * 59 + Key.GetHashCode();
                    if (Lead != null)
                    hashCode = hashCode * 59 + Lead.GetHashCode();
                    if (LeadAccountId != null)
                    hashCode = hashCode * 59 + LeadAccountId.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + NotificationScheme.GetHashCode();
                    
                    hashCode = hashCode * 59 + PermissionScheme.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UpdateProjectDetails left, UpdateProjectDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UpdateProjectDetails left, UpdateProjectDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
