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
    /// 
    /// </summary>
    [DataContract]
    public partial class CreateUserResponseUser : IEquatable<CreateUserResponseUser>
    {
        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [Required]
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets UserName
        /// </summary>
        [Required]
        [DataMember(Name="UserName", EmitDefaultValue=false)]
        public string UserName { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [Required]
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

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
        /// Gets or Sets PasswordLastUsed
        /// </summary>
        [DataMember(Name="PasswordLastUsed", EmitDefaultValue=false)]
        public DateTime PasswordLastUsed { get; set; }

        /// <summary>
        /// Gets or Sets PermissionsBoundary
        /// </summary>
        [DataMember(Name="PermissionsBoundary", EmitDefaultValue=false)]
        public UserPermissionsBoundary PermissionsBoundary { get; set; }

        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name="Tags", EmitDefaultValue=false)]
        public List Tags { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateUserResponseUser {\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  UserName: ").Append(UserName).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  Arn: ").Append(Arn).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  PasswordLastUsed: ").Append(PasswordLastUsed).Append("\n");
            sb.Append("  PermissionsBoundary: ").Append(PermissionsBoundary).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CreateUserResponseUser)obj);
        }

        /// <summary>
        /// Returns true if CreateUserResponseUser instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateUserResponseUser to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateUserResponseUser other)
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
                    UserName == other.UserName ||
                    UserName != null &&
                    UserName.Equals(other.UserName)
                ) && 
                (
                    UserId == other.UserId ||
                    UserId != null &&
                    UserId.Equals(other.UserId)
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
                    PasswordLastUsed == other.PasswordLastUsed ||
                    PasswordLastUsed != null &&
                    PasswordLastUsed.Equals(other.PasswordLastUsed)
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
                    if (UserName != null)
                    hashCode = hashCode * 59 + UserName.GetHashCode();
                    if (UserId != null)
                    hashCode = hashCode * 59 + UserId.GetHashCode();
                    if (Arn != null)
                    hashCode = hashCode * 59 + Arn.GetHashCode();
                    if (CreateDate != null)
                    hashCode = hashCode * 59 + CreateDate.GetHashCode();
                    if (PasswordLastUsed != null)
                    hashCode = hashCode * 59 + PasswordLastUsed.GetHashCode();
                    if (PermissionsBoundary != null)
                    hashCode = hashCode * 59 + PermissionsBoundary.GetHashCode();
                    if (Tags != null)
                    hashCode = hashCode * 59 + Tags.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateUserResponseUser left, CreateUserResponseUser right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateUserResponseUser left, CreateUserResponseUser right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
