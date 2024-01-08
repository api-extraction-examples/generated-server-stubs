/*
 * AWS Identity and Access Management
 *
 * <fullname>Identity and Access Management</fullname> <p>Identity and Access Management (IAM) is a web service for securely controlling access to Amazon Web Services services. With IAM, you can centrally manage users, security credentials such as access keys, and permissions that control which Amazon Web Services resources users and applications can access. For more information about IAM, see <a href=\"http://aws.amazon.com/iam/\">Identity and Access Management (IAM)</a> and the <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/\">Identity and Access Management User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2010-05-08
 * Contact: mike.ralphson@gmail.com
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
    /// Contains information about an IAM role. This structure is returned as a response element in several API operations that interact with roles.
    /// </summary>
    [DataContract]
    public partial class Role : IEquatable<Role>
    {
        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [Required]
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets RoleName
        /// </summary>
        [Required]
        [DataMember(Name="RoleName", EmitDefaultValue=false)]
        public string RoleName { get; set; }

        /// <summary>
        /// Gets or Sets RoleId
        /// </summary>
        [Required]
        [DataMember(Name="RoleId", EmitDefaultValue=false)]
        public string RoleId { get; set; }

        /// <summary>
        /// Gets or Sets Arn
        /// </summary>
        [Required]
        [DataMember(Name="Arn", EmitDefaultValue=false)]
        public string Arn { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [Required]
        [DataMember(Name="CreateDate", EmitDefaultValue=false)]
        public DateTime CreateDate { get; set; }

        /// <summary>
        /// Gets or Sets AssumeRolePolicyDocument
        /// </summary>
        [DataMember(Name="AssumeRolePolicyDocument", EmitDefaultValue=false)]
        public string AssumeRolePolicyDocument { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="Description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets MaxSessionDuration
        /// </summary>
        [DataMember(Name="MaxSessionDuration", EmitDefaultValue=true)]
        public int MaxSessionDuration { get; set; }

        /// <summary>
        /// Gets or Sets PermissionsBoundary
        /// </summary>
        [DataMember(Name="PermissionsBoundary", EmitDefaultValue=false)]
        public RolePermissionsBoundary PermissionsBoundary { get; set; }

        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name="Tags", EmitDefaultValue=false)]
        public List Tags { get; set; }

        /// <summary>
        /// Gets or Sets RoleLastUsed
        /// </summary>
        [DataMember(Name="RoleLastUsed", EmitDefaultValue=false)]
        public RoleRoleLastUsed RoleLastUsed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Role {\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  RoleName: ").Append(RoleName).Append("\n");
            sb.Append("  RoleId: ").Append(RoleId).Append("\n");
            sb.Append("  Arn: ").Append(Arn).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  AssumeRolePolicyDocument: ").Append(AssumeRolePolicyDocument).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  MaxSessionDuration: ").Append(MaxSessionDuration).Append("\n");
            sb.Append("  PermissionsBoundary: ").Append(PermissionsBoundary).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  RoleLastUsed: ").Append(RoleLastUsed).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Role)obj);
        }

        /// <summary>
        /// Returns true if Role instances are equal
        /// </summary>
        /// <param name="other">Instance of Role to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Role other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Path == other.Path ||
                    Path != null &&
                    Path.Equals(other.Path)
                ) && 
                (
                    RoleName == other.RoleName ||
                    RoleName != null &&
                    RoleName.Equals(other.RoleName)
                ) && 
                (
                    RoleId == other.RoleId ||
                    RoleId != null &&
                    RoleId.Equals(other.RoleId)
                ) && 
                (
                    Arn == other.Arn ||
                    Arn != null &&
                    Arn.Equals(other.Arn)
                ) && 
                (
                    CreateDate == other.CreateDate ||
                    CreateDate != null &&
                    CreateDate.Equals(other.CreateDate)
                ) && 
                (
                    AssumeRolePolicyDocument == other.AssumeRolePolicyDocument ||
                    AssumeRolePolicyDocument != null &&
                    AssumeRolePolicyDocument.Equals(other.AssumeRolePolicyDocument)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    MaxSessionDuration == other.MaxSessionDuration ||
                    
                    MaxSessionDuration.Equals(other.MaxSessionDuration)
                ) && 
                (
                    PermissionsBoundary == other.PermissionsBoundary ||
                    PermissionsBoundary != null &&
                    PermissionsBoundary.Equals(other.PermissionsBoundary)
                ) && 
                (
                    Tags == other.Tags ||
                    Tags != null &&
                    Tags.Equals(other.Tags)
                ) && 
                (
                    RoleLastUsed == other.RoleLastUsed ||
                    RoleLastUsed != null &&
                    RoleLastUsed.Equals(other.RoleLastUsed)
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
                    if (Path != null)
                    hashCode = hashCode * 59 + Path.GetHashCode();
                    if (RoleName != null)
                    hashCode = hashCode * 59 + RoleName.GetHashCode();
                    if (RoleId != null)
                    hashCode = hashCode * 59 + RoleId.GetHashCode();
                    if (Arn != null)
                    hashCode = hashCode * 59 + Arn.GetHashCode();
                    if (CreateDate != null)
                    hashCode = hashCode * 59 + CreateDate.GetHashCode();
                    if (AssumeRolePolicyDocument != null)
                    hashCode = hashCode * 59 + AssumeRolePolicyDocument.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxSessionDuration.GetHashCode();
                    if (PermissionsBoundary != null)
                    hashCode = hashCode * 59 + PermissionsBoundary.GetHashCode();
                    if (Tags != null)
                    hashCode = hashCode * 59 + Tags.GetHashCode();
                    if (RoleLastUsed != null)
                    hashCode = hashCode * 59 + RoleLastUsed.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Role left, Role right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Role left, Role right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
