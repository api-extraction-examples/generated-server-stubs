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
    public partial class UpdateSAMLProviderRequest : IEquatable<UpdateSAMLProviderRequest>
    {
        /// <summary>
        /// Gets or Sets SAMLMetadataDocument
        /// </summary>
        [Required]
        [DataMember(Name="SAMLMetadataDocument", EmitDefaultValue=false)]
        public string SAMLMetadataDocument { get; set; }

        /// <summary>
        /// Gets or Sets SAMLProviderArn
        /// </summary>
        [Required]
        [DataMember(Name="SAMLProviderArn", EmitDefaultValue=false)]
        public string SAMLProviderArn { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdateSAMLProviderRequest {\n");
            sb.Append("  SAMLMetadataDocument: ").Append(SAMLMetadataDocument).Append("\n");
            sb.Append("  SAMLProviderArn: ").Append(SAMLProviderArn).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UpdateSAMLProviderRequest)obj);
        }

        /// <summary>
        /// Returns true if UpdateSAMLProviderRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of UpdateSAMLProviderRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdateSAMLProviderRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    SAMLMetadataDocument == other.SAMLMetadataDocument ||
                    SAMLMetadataDocument != null &&
                    SAMLMetadataDocument.Equals(other.SAMLMetadataDocument)
                ) && 
                (
                    SAMLProviderArn == other.SAMLProviderArn ||
                    SAMLProviderArn != null &&
                    SAMLProviderArn.Equals(other.SAMLProviderArn)
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
                    if (SAMLMetadataDocument != null)
                    hashCode = hashCode * 59 + SAMLMetadataDocument.GetHashCode();
                    if (SAMLProviderArn != null)
                    hashCode = hashCode * 59 + SAMLProviderArn.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UpdateSAMLProviderRequest left, UpdateSAMLProviderRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UpdateSAMLProviderRequest left, UpdateSAMLProviderRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
