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
    /// &lt;p&gt;An object that contains details about when the IAM entities (users or roles) were last used in an attempt to access the specified Amazon Web Services service.&lt;/p&gt; &lt;p&gt;This data type is a response element in the &lt;a&gt;GetServiceLastAccessedDetailsWithEntities&lt;/a&gt; operation.&lt;/p&gt;
    /// </summary>
    [DataContract]
    public partial class EntityDetails : IEquatable<EntityDetails>
    {
        /// <summary>
        /// Gets or Sets EntityInfo
        /// </summary>
        [Required]
        [DataMember(Name="EntityInfo", EmitDefaultValue=false)]
        public EntityDetailsEntityInfo EntityInfo { get; set; }

        /// <summary>
        /// Gets or Sets LastAuthenticated
        /// </summary>
        [DataMember(Name="LastAuthenticated", EmitDefaultValue=false)]
        public DateTime LastAuthenticated { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EntityDetails {\n");
            sb.Append("  EntityInfo: ").Append(EntityInfo).Append("\n");
            sb.Append("  LastAuthenticated: ").Append(LastAuthenticated).Append("\n");
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
            return obj.GetType() == GetType() && Equals((EntityDetails)obj);
        }

        /// <summary>
        /// Returns true if EntityDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of EntityDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    EntityInfo == other.EntityInfo ||
                    EntityInfo != null &&
                    EntityInfo.Equals(other.EntityInfo)
                ) && 
                (
                    LastAuthenticated == other.LastAuthenticated ||
                    LastAuthenticated != null &&
                    LastAuthenticated.Equals(other.LastAuthenticated)
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
                    if (EntityInfo != null)
                    hashCode = hashCode * 59 + EntityInfo.GetHashCode();
                    if (LastAuthenticated != null)
                    hashCode = hashCode * 59 + LastAuthenticated.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(EntityDetails left, EntityDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(EntityDetails left, EntityDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
