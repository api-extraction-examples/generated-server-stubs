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
    public partial class CreatePolicyResponsePolicy : IEquatable<CreatePolicyResponsePolicy>
    {
        /// <summary>
        /// Gets or Sets PolicyName
        /// </summary>
        [DataMember(Name="PolicyName", EmitDefaultValue=false)]
        public string PolicyName { get; set; }

        /// <summary>
        /// Gets or Sets PolicyId
        /// </summary>
        [DataMember(Name="PolicyId", EmitDefaultValue=false)]
        public string PolicyId { get; set; }

        /// <summary>
        /// &lt;p&gt;The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.&lt;/p&gt; &lt;p&gt;For more information about ARNs, go to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;. &lt;/p&gt;
        /// </summary>
        /// <value>&lt;p&gt;The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.&lt;/p&gt; &lt;p&gt;For more information about ARNs, go to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;. &lt;/p&gt;</value>
        [StringLength(2048, MinimumLength=20)]
        [DataMember(Name="Arn", EmitDefaultValue=false)]
        public string Arn { get; set; }

        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets DefaultVersionId
        /// </summary>
        [DataMember(Name="DefaultVersionId", EmitDefaultValue=false)]
        public string DefaultVersionId { get; set; }

        /// <summary>
        /// Gets or Sets AttachmentCount
        /// </summary>
        [DataMember(Name="AttachmentCount", EmitDefaultValue=true)]
        public int AttachmentCount { get; set; }

        /// <summary>
        /// Gets or Sets PermissionsBoundaryUsageCount
        /// </summary>
        [DataMember(Name="PermissionsBoundaryUsageCount", EmitDefaultValue=true)]
        public int PermissionsBoundaryUsageCount { get; set; }

        /// <summary>
        /// Gets or Sets IsAttachable
        /// </summary>
        [DataMember(Name="IsAttachable", EmitDefaultValue=true)]
        public bool IsAttachable { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="Description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="CreateDate", EmitDefaultValue=false)]
        public DateTime CreateDate { get; set; }

        /// <summary>
        /// Gets or Sets UpdateDate
        /// </summary>
        [DataMember(Name="UpdateDate", EmitDefaultValue=false)]
        public DateTime UpdateDate { get; set; }

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
            sb.Append("class CreatePolicyResponsePolicy {\n");
            sb.Append("  PolicyName: ").Append(PolicyName).Append("\n");
            sb.Append("  PolicyId: ").Append(PolicyId).Append("\n");
            sb.Append("  Arn: ").Append(Arn).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  DefaultVersionId: ").Append(DefaultVersionId).Append("\n");
            sb.Append("  AttachmentCount: ").Append(AttachmentCount).Append("\n");
            sb.Append("  PermissionsBoundaryUsageCount: ").Append(PermissionsBoundaryUsageCount).Append("\n");
            sb.Append("  IsAttachable: ").Append(IsAttachable).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  UpdateDate: ").Append(UpdateDate).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CreatePolicyResponsePolicy)obj);
        }

        /// <summary>
        /// Returns true if CreatePolicyResponsePolicy instances are equal
        /// </summary>
        /// <param name="other">Instance of CreatePolicyResponsePolicy to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreatePolicyResponsePolicy other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    PolicyName == other.PolicyName ||
                    PolicyName != null &&
                    PolicyName.Equals(other.PolicyName)
                ) && 
                (
                    PolicyId == other.PolicyId ||
                    PolicyId != null &&
                    PolicyId.Equals(other.PolicyId)
                ) && 
                (
                    Arn == other.Arn ||
                    Arn != null &&
                    Arn.Equals(other.Arn)
                ) && 
                (
                    Path == other.Path ||
                    Path != null &&
                    Path.Equals(other.Path)
                ) && 
                (
                    DefaultVersionId == other.DefaultVersionId ||
                    DefaultVersionId != null &&
                    DefaultVersionId.Equals(other.DefaultVersionId)
                ) && 
                (
                    AttachmentCount == other.AttachmentCount ||
                    
                    AttachmentCount.Equals(other.AttachmentCount)
                ) && 
                (
                    PermissionsBoundaryUsageCount == other.PermissionsBoundaryUsageCount ||
                    
                    PermissionsBoundaryUsageCount.Equals(other.PermissionsBoundaryUsageCount)
                ) && 
                (
                    IsAttachable == other.IsAttachable ||
                    
                    IsAttachable.Equals(other.IsAttachable)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    CreateDate == other.CreateDate ||
                    CreateDate != null &&
                    CreateDate.Equals(other.CreateDate)
                ) && 
                (
                    UpdateDate == other.UpdateDate ||
                    UpdateDate != null &&
                    UpdateDate.Equals(other.UpdateDate)
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
                    if (PolicyName != null)
                    hashCode = hashCode * 59 + PolicyName.GetHashCode();
                    if (PolicyId != null)
                    hashCode = hashCode * 59 + PolicyId.GetHashCode();
                    if (Arn != null)
                    hashCode = hashCode * 59 + Arn.GetHashCode();
                    if (Path != null)
                    hashCode = hashCode * 59 + Path.GetHashCode();
                    if (DefaultVersionId != null)
                    hashCode = hashCode * 59 + DefaultVersionId.GetHashCode();
                    
                    hashCode = hashCode * 59 + AttachmentCount.GetHashCode();
                    
                    hashCode = hashCode * 59 + PermissionsBoundaryUsageCount.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsAttachable.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (CreateDate != null)
                    hashCode = hashCode * 59 + CreateDate.GetHashCode();
                    if (UpdateDate != null)
                    hashCode = hashCode * 59 + UpdateDate.GetHashCode();
                    if (Tags != null)
                    hashCode = hashCode * 59 + Tags.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreatePolicyResponsePolicy left, CreatePolicyResponsePolicy right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreatePolicyResponsePolicy left, CreatePolicyResponsePolicy right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
