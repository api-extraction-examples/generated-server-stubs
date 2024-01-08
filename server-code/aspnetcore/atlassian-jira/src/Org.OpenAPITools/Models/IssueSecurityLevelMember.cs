/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
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
    /// Issue security level member.
    /// </summary>
    [DataContract]
    public partial class IssueSecurityLevelMember : IEquatable<IssueSecurityLevelMember>
    {
        /// <summary>
        /// Gets or Sets Holder
        /// </summary>
        [Required]
        [DataMember(Name="holder", EmitDefaultValue=false)]
        public PermissionHolder Holder { get; set; }

        /// <summary>
        /// The ID of the issue security level member.
        /// </summary>
        /// <value>The ID of the issue security level member.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=true)]
        public long Id { get; set; }

        /// <summary>
        /// The ID of the issue security level.
        /// </summary>
        /// <value>The ID of the issue security level.</value>
        [Required]
        [DataMember(Name="issueSecurityLevelId", EmitDefaultValue=true)]
        public long IssueSecurityLevelId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IssueSecurityLevelMember {\n");
            sb.Append("  Holder: ").Append(Holder).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IssueSecurityLevelId: ").Append(IssueSecurityLevelId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((IssueSecurityLevelMember)obj);
        }

        /// <summary>
        /// Returns true if IssueSecurityLevelMember instances are equal
        /// </summary>
        /// <param name="other">Instance of IssueSecurityLevelMember to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IssueSecurityLevelMember other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Holder == other.Holder ||
                    Holder != null &&
                    Holder.Equals(other.Holder)
                ) && 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    IssueSecurityLevelId == other.IssueSecurityLevelId ||
                    
                    IssueSecurityLevelId.Equals(other.IssueSecurityLevelId)
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
                    if (Holder != null)
                    hashCode = hashCode * 59 + Holder.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + IssueSecurityLevelId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IssueSecurityLevelMember left, IssueSecurityLevelMember right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IssueSecurityLevelMember left, IssueSecurityLevelMember right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}