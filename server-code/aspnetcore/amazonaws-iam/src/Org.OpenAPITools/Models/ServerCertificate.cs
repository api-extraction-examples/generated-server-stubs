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
    /// &lt;p&gt;Contains information about a server certificate.&lt;/p&gt; &lt;p&gt; This data type is used as a response element in the &lt;a&gt;GetServerCertificate&lt;/a&gt; operation. &lt;/p&gt;
    /// </summary>
    [DataContract]
    public partial class ServerCertificate : IEquatable<ServerCertificate>
    {
        /// <summary>
        /// Gets or Sets ServerCertificateMetadata
        /// </summary>
        [Required]
        [DataMember(Name="ServerCertificateMetadata", EmitDefaultValue=false)]
        public ServerCertificateServerCertificateMetadata ServerCertificateMetadata { get; set; }

        /// <summary>
        /// Gets or Sets CertificateBody
        /// </summary>
        [Required]
        [DataMember(Name="CertificateBody", EmitDefaultValue=false)]
        public string CertificateBody { get; set; }

        /// <summary>
        /// Gets or Sets CertificateChain
        /// </summary>
        [DataMember(Name="CertificateChain", EmitDefaultValue=false)]
        public string CertificateChain { get; set; }

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
            sb.Append("class ServerCertificate {\n");
            sb.Append("  ServerCertificateMetadata: ").Append(ServerCertificateMetadata).Append("\n");
            sb.Append("  CertificateBody: ").Append(CertificateBody).Append("\n");
            sb.Append("  CertificateChain: ").Append(CertificateChain).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ServerCertificate)obj);
        }

        /// <summary>
        /// Returns true if ServerCertificate instances are equal
        /// </summary>
        /// <param name="other">Instance of ServerCertificate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ServerCertificate other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ServerCertificateMetadata == other.ServerCertificateMetadata ||
                    ServerCertificateMetadata != null &&
                    ServerCertificateMetadata.Equals(other.ServerCertificateMetadata)
                ) && 
                (
                    CertificateBody == other.CertificateBody ||
                    CertificateBody != null &&
                    CertificateBody.Equals(other.CertificateBody)
                ) && 
                (
                    CertificateChain == other.CertificateChain ||
                    CertificateChain != null &&
                    CertificateChain.Equals(other.CertificateChain)
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
                    if (ServerCertificateMetadata != null)
                    hashCode = hashCode * 59 + ServerCertificateMetadata.GetHashCode();
                    if (CertificateBody != null)
                    hashCode = hashCode * 59 + CertificateBody.GetHashCode();
                    if (CertificateChain != null)
                    hashCode = hashCode * 59 + CertificateChain.GetHashCode();
                    if (Tags != null)
                    hashCode = hashCode * 59 + Tags.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ServerCertificate left, ServerCertificate right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ServerCertificate left, ServerCertificate right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
