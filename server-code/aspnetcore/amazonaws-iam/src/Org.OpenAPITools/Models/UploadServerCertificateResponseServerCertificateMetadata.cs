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
    public partial class UploadServerCertificateResponseServerCertificateMetadata : IEquatable<UploadServerCertificateResponseServerCertificateMetadata>
    {
        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [Required]
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets ServerCertificateName
        /// </summary>
        [Required]
        [DataMember(Name="ServerCertificateName", EmitDefaultValue=false)]
        public string ServerCertificateName { get; set; }

        /// <summary>
        /// Gets or Sets ServerCertificateId
        /// </summary>
        [Required]
        [DataMember(Name="ServerCertificateId", EmitDefaultValue=false)]
        public string ServerCertificateId { get; set; }

        /// <summary>
        /// Gets or Sets Arn
        /// </summary>
        [Required]
        [DataMember(Name="Arn", EmitDefaultValue=false)]
        public string Arn { get; set; }

        /// <summary>
        /// Gets or Sets UploadDate
        /// </summary>
        [DataMember(Name="UploadDate", EmitDefaultValue=false)]
        public DateTime UploadDate { get; set; }

        /// <summary>
        /// Gets or Sets Expiration
        /// </summary>
        [DataMember(Name="Expiration", EmitDefaultValue=false)]
        public DateTime Expiration { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UploadServerCertificateResponseServerCertificateMetadata {\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  ServerCertificateName: ").Append(ServerCertificateName).Append("\n");
            sb.Append("  ServerCertificateId: ").Append(ServerCertificateId).Append("\n");
            sb.Append("  Arn: ").Append(Arn).Append("\n");
            sb.Append("  UploadDate: ").Append(UploadDate).Append("\n");
            sb.Append("  Expiration: ").Append(Expiration).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UploadServerCertificateResponseServerCertificateMetadata)obj);
        }

        /// <summary>
        /// Returns true if UploadServerCertificateResponseServerCertificateMetadata instances are equal
        /// </summary>
        /// <param name="other">Instance of UploadServerCertificateResponseServerCertificateMetadata to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UploadServerCertificateResponseServerCertificateMetadata other)
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
                    ServerCertificateName == other.ServerCertificateName ||
                    ServerCertificateName != null &&
                    ServerCertificateName.Equals(other.ServerCertificateName)
                ) && 
                (
                    ServerCertificateId == other.ServerCertificateId ||
                    ServerCertificateId != null &&
                    ServerCertificateId.Equals(other.ServerCertificateId)
                ) && 
                (
                    Arn == other.Arn ||
                    Arn != null &&
                    Arn.Equals(other.Arn)
                ) && 
                (
                    UploadDate == other.UploadDate ||
                    UploadDate != null &&
                    UploadDate.Equals(other.UploadDate)
                ) && 
                (
                    Expiration == other.Expiration ||
                    Expiration != null &&
                    Expiration.Equals(other.Expiration)
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
                    if (ServerCertificateName != null)
                    hashCode = hashCode * 59 + ServerCertificateName.GetHashCode();
                    if (ServerCertificateId != null)
                    hashCode = hashCode * 59 + ServerCertificateId.GetHashCode();
                    if (Arn != null)
                    hashCode = hashCode * 59 + Arn.GetHashCode();
                    if (UploadDate != null)
                    hashCode = hashCode * 59 + UploadDate.GetHashCode();
                    if (Expiration != null)
                    hashCode = hashCode * 59 + Expiration.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UploadServerCertificateResponseServerCertificateMetadata left, UploadServerCertificateResponseServerCertificateMetadata right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UploadServerCertificateResponseServerCertificateMetadata left, UploadServerCertificateResponseServerCertificateMetadata right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
