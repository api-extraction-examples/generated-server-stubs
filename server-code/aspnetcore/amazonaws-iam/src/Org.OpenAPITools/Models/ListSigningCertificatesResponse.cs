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
    /// Contains the response to a successful &lt;a&gt;ListSigningCertificates&lt;/a&gt; request. 
    /// </summary>
    [DataContract]
    public partial class ListSigningCertificatesResponse : IEquatable<ListSigningCertificatesResponse>
    {
        /// <summary>
        /// Gets or Sets Certificates
        /// </summary>
        [Required]
        [DataMember(Name="Certificates", EmitDefaultValue=false)]
        public List Certificates { get; set; }

        /// <summary>
        /// Gets or Sets IsTruncated
        /// </summary>
        [DataMember(Name="IsTruncated", EmitDefaultValue=true)]
        public bool IsTruncated { get; set; }

        /// <summary>
        /// Gets or Sets Marker
        /// </summary>
        [DataMember(Name="Marker", EmitDefaultValue=false)]
        public string Marker { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ListSigningCertificatesResponse {\n");
            sb.Append("  Certificates: ").Append(Certificates).Append("\n");
            sb.Append("  IsTruncated: ").Append(IsTruncated).Append("\n");
            sb.Append("  Marker: ").Append(Marker).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ListSigningCertificatesResponse)obj);
        }

        /// <summary>
        /// Returns true if ListSigningCertificatesResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of ListSigningCertificatesResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ListSigningCertificatesResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Certificates == other.Certificates ||
                    Certificates != null &&
                    Certificates.Equals(other.Certificates)
                ) && 
                (
                    IsTruncated == other.IsTruncated ||
                    
                    IsTruncated.Equals(other.IsTruncated)
                ) && 
                (
                    Marker == other.Marker ||
                    Marker != null &&
                    Marker.Equals(other.Marker)
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
                    if (Certificates != null)
                    hashCode = hashCode * 59 + Certificates.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsTruncated.GetHashCode();
                    if (Marker != null)
                    hashCode = hashCode * 59 + Marker.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ListSigningCertificatesResponse left, ListSigningCertificatesResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ListSigningCertificatesResponse left, ListSigningCertificatesResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
