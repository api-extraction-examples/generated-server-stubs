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
    /// &lt;p&gt;Contains information about an X.509 signing certificate.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;UploadSigningCertificate&lt;/a&gt; and &lt;a&gt;ListSigningCertificates&lt;/a&gt; operations. &lt;/p&gt;
    /// </summary>
    [DataContract]
    public partial class SigningCertificate : IEquatable<SigningCertificate>
    {
        /// <summary>
        /// Gets or Sets UserName
        /// </summary>
        [Required]
        [DataMember(Name="UserName", EmitDefaultValue=false)]
        public string UserName { get; set; }

        /// <summary>
        /// Gets or Sets CertificateId
        /// </summary>
        [Required]
        [DataMember(Name="CertificateId", EmitDefaultValue=false)]
        public string CertificateId { get; set; }

        /// <summary>
        /// Gets or Sets CertificateBody
        /// </summary>
        [Required]
        [DataMember(Name="CertificateBody", EmitDefaultValue=false)]
        public string CertificateBody { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [Required]
        [DataMember(Name="Status", EmitDefaultValue=true)]
        public StatusType Status { get; set; }

        /// <summary>
        /// Gets or Sets UploadDate
        /// </summary>
        [DataMember(Name="UploadDate", EmitDefaultValue=false)]
        public DateTime UploadDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SigningCertificate {\n");
            sb.Append("  UserName: ").Append(UserName).Append("\n");
            sb.Append("  CertificateId: ").Append(CertificateId).Append("\n");
            sb.Append("  CertificateBody: ").Append(CertificateBody).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  UploadDate: ").Append(UploadDate).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SigningCertificate)obj);
        }

        /// <summary>
        /// Returns true if SigningCertificate instances are equal
        /// </summary>
        /// <param name="other">Instance of SigningCertificate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SigningCertificate other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    UserName == other.UserName ||
                    UserName != null &&
                    UserName.Equals(other.UserName)
                ) && 
                (
                    CertificateId == other.CertificateId ||
                    CertificateId != null &&
                    CertificateId.Equals(other.CertificateId)
                ) && 
                (
                    CertificateBody == other.CertificateBody ||
                    CertificateBody != null &&
                    CertificateBody.Equals(other.CertificateBody)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
                ) && 
                (
                    UploadDate == other.UploadDate ||
                    UploadDate != null &&
                    UploadDate.Equals(other.UploadDate)
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
                    if (UserName != null)
                    hashCode = hashCode * 59 + UserName.GetHashCode();
                    if (CertificateId != null)
                    hashCode = hashCode * 59 + CertificateId.GetHashCode();
                    if (CertificateBody != null)
                    hashCode = hashCode * 59 + CertificateBody.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    if (UploadDate != null)
                    hashCode = hashCode * 59 + UploadDate.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SigningCertificate left, SigningCertificate right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SigningCertificate left, SigningCertificate right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
