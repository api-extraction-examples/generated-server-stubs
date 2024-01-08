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
    public partial class ListUserPoliciesRequest : IEquatable<ListUserPoliciesRequest>
    {
        /// <summary>
        /// Gets or Sets UserName
        /// </summary>
        [Required]
        [DataMember(Name="UserName", EmitDefaultValue=false)]
        public string UserName { get; set; }

        /// <summary>
        /// Gets or Sets Marker
        /// </summary>
        [DataMember(Name="Marker", EmitDefaultValue=false)]
        public string Marker { get; set; }

        /// <summary>
        /// Gets or Sets MaxItems
        /// </summary>
        [DataMember(Name="MaxItems", EmitDefaultValue=true)]
        public int MaxItems { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ListUserPoliciesRequest {\n");
            sb.Append("  UserName: ").Append(UserName).Append("\n");
            sb.Append("  Marker: ").Append(Marker).Append("\n");
            sb.Append("  MaxItems: ").Append(MaxItems).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ListUserPoliciesRequest)obj);
        }

        /// <summary>
        /// Returns true if ListUserPoliciesRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of ListUserPoliciesRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ListUserPoliciesRequest other)
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
                    Marker == other.Marker ||
                    Marker != null &&
                    Marker.Equals(other.Marker)
                ) && 
                (
                    MaxItems == other.MaxItems ||
                    
                    MaxItems.Equals(other.MaxItems)
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
                    if (Marker != null)
                    hashCode = hashCode * 59 + Marker.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxItems.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ListUserPoliciesRequest left, ListUserPoliciesRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ListUserPoliciesRequest left, ListUserPoliciesRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
