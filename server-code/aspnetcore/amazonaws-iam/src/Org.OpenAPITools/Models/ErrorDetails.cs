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
    /// &lt;p&gt;Contains information about the reason that the operation failed.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;GetOrganizationsAccessReport&lt;/a&gt;, &lt;a&gt;GetServiceLastAccessedDetails&lt;/a&gt;, and &lt;a&gt;GetServiceLastAccessedDetailsWithEntities&lt;/a&gt; operations.&lt;/p&gt;
    /// </summary>
    [DataContract]
    public partial class ErrorDetails : IEquatable<ErrorDetails>
    {
        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [Required]
        [DataMember(Name="Message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [Required]
        [DataMember(Name="Code", EmitDefaultValue=false)]
        public string Code { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ErrorDetails {\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ErrorDetails)obj);
        }

        /// <summary>
        /// Returns true if ErrorDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of ErrorDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ErrorDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Message == other.Message ||
                    Message != null &&
                    Message.Equals(other.Message)
                ) && 
                (
                    Code == other.Code ||
                    Code != null &&
                    Code.Equals(other.Code)
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
                    if (Message != null)
                    hashCode = hashCode * 59 + Message.GetHashCode();
                    if (Code != null)
                    hashCode = hashCode * 59 + Code.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ErrorDetails left, ErrorDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ErrorDetails left, ErrorDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
