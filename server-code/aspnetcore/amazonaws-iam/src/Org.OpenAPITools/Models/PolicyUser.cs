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
    /// &lt;p&gt;Contains information about a user that a managed policy is attached to.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;ListEntitiesForPolicy&lt;/a&gt; operation. &lt;/p&gt; &lt;p&gt;For more information about managed policies, refer to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt;
    /// </summary>
    [DataContract]
    public partial class PolicyUser : IEquatable<PolicyUser>
    {
        /// <summary>
        /// Gets or Sets UserName
        /// </summary>
        [DataMember(Name="UserName", EmitDefaultValue=false)]
        public string UserName { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PolicyUser {\n");
            sb.Append("  UserName: ").Append(UserName).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PolicyUser)obj);
        }

        /// <summary>
        /// Returns true if PolicyUser instances are equal
        /// </summary>
        /// <param name="other">Instance of PolicyUser to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PolicyUser other)
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
                    UserId == other.UserId ||
                    UserId != null &&
                    UserId.Equals(other.UserId)
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
                    if (UserId != null)
                    hashCode = hashCode * 59 + UserId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PolicyUser left, PolicyUser right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PolicyUser left, PolicyUser right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}