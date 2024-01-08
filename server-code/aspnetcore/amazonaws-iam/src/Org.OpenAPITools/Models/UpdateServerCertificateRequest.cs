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
    public partial class UpdateServerCertificateRequest : IEquatable<UpdateServerCertificateRequest>
    {
        /// <summary>
        /// Gets or Sets ServerCertificateName
        /// </summary>
        [Required]
        [DataMember(Name="ServerCertificateName", EmitDefaultValue=false)]
        public string ServerCertificateName { get; set; }

        /// <summary>
        /// Gets or Sets NewPath
        /// </summary>
        [DataMember(Name="NewPath", EmitDefaultValue=false)]
        public string NewPath { get; set; }

        /// <summary>
        /// Gets or Sets NewServerCertificateName
        /// </summary>
        [DataMember(Name="NewServerCertificateName", EmitDefaultValue=false)]
        public string NewServerCertificateName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdateServerCertificateRequest {\n");
            sb.Append("  ServerCertificateName: ").Append(ServerCertificateName).Append("\n");
            sb.Append("  NewPath: ").Append(NewPath).Append("\n");
            sb.Append("  NewServerCertificateName: ").Append(NewServerCertificateName).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UpdateServerCertificateRequest)obj);
        }

        /// <summary>
        /// Returns true if UpdateServerCertificateRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of UpdateServerCertificateRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdateServerCertificateRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ServerCertificateName == other.ServerCertificateName ||
                    ServerCertificateName != null &&
                    ServerCertificateName.Equals(other.ServerCertificateName)
                ) && 
                (
                    NewPath == other.NewPath ||
                    NewPath != null &&
                    NewPath.Equals(other.NewPath)
                ) && 
                (
                    NewServerCertificateName == other.NewServerCertificateName ||
                    NewServerCertificateName != null &&
                    NewServerCertificateName.Equals(other.NewServerCertificateName)
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
                    if (ServerCertificateName != null)
                    hashCode = hashCode * 59 + ServerCertificateName.GetHashCode();
                    if (NewPath != null)
                    hashCode = hashCode * 59 + NewPath.GetHashCode();
                    if (NewServerCertificateName != null)
                    hashCode = hashCode * 59 + NewServerCertificateName.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UpdateServerCertificateRequest left, UpdateServerCertificateRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UpdateServerCertificateRequest left, UpdateServerCertificateRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
