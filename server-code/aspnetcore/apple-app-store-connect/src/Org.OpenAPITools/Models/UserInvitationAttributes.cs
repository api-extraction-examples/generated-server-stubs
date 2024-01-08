/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.4.1
 * 
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
    public partial class UserInvitationAttributes : IEquatable<UserInvitationAttributes>
    {
        /// <summary>
        /// Gets or Sets AllAppsVisible
        /// </summary>
        [DataMember(Name="allAppsVisible", EmitDefaultValue=true)]
        public bool AllAppsVisible { get; set; }

        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets ExpirationDate
        /// </summary>
        [DataMember(Name="expirationDate", EmitDefaultValue=false)]
        public DateTime ExpirationDate { get; set; }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name="firstName", EmitDefaultValue=false)]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        [DataMember(Name="lastName", EmitDefaultValue=false)]
        public string LastName { get; set; }

        /// <summary>
        /// Gets or Sets ProvisioningAllowed
        /// </summary>
        [DataMember(Name="provisioningAllowed", EmitDefaultValue=true)]
        public bool ProvisioningAllowed { get; set; }

        /// <summary>
        /// Gets or Sets Roles
        /// </summary>
        [DataMember(Name="roles", EmitDefaultValue=false)]
        public List<UserRole> Roles { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserInvitationAttributes {\n");
            sb.Append("  AllAppsVisible: ").Append(AllAppsVisible).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  ExpirationDate: ").Append(ExpirationDate).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  ProvisioningAllowed: ").Append(ProvisioningAllowed).Append("\n");
            sb.Append("  Roles: ").Append(Roles).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UserInvitationAttributes)obj);
        }

        /// <summary>
        /// Returns true if UserInvitationAttributes instances are equal
        /// </summary>
        /// <param name="other">Instance of UserInvitationAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserInvitationAttributes other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AllAppsVisible == other.AllAppsVisible ||
                    
                    AllAppsVisible.Equals(other.AllAppsVisible)
                ) && 
                (
                    Email == other.Email ||
                    Email != null &&
                    Email.Equals(other.Email)
                ) && 
                (
                    ExpirationDate == other.ExpirationDate ||
                    ExpirationDate != null &&
                    ExpirationDate.Equals(other.ExpirationDate)
                ) && 
                (
                    FirstName == other.FirstName ||
                    FirstName != null &&
                    FirstName.Equals(other.FirstName)
                ) && 
                (
                    LastName == other.LastName ||
                    LastName != null &&
                    LastName.Equals(other.LastName)
                ) && 
                (
                    ProvisioningAllowed == other.ProvisioningAllowed ||
                    
                    ProvisioningAllowed.Equals(other.ProvisioningAllowed)
                ) && 
                (
                    Roles == other.Roles ||
                    Roles != null &&
                    other.Roles != null &&
                    Roles.SequenceEqual(other.Roles)
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
                    
                    hashCode = hashCode * 59 + AllAppsVisible.GetHashCode();
                    if (Email != null)
                    hashCode = hashCode * 59 + Email.GetHashCode();
                    if (ExpirationDate != null)
                    hashCode = hashCode * 59 + ExpirationDate.GetHashCode();
                    if (FirstName != null)
                    hashCode = hashCode * 59 + FirstName.GetHashCode();
                    if (LastName != null)
                    hashCode = hashCode * 59 + LastName.GetHashCode();
                    
                    hashCode = hashCode * 59 + ProvisioningAllowed.GetHashCode();
                    if (Roles != null)
                    hashCode = hashCode * 59 + Roles.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UserInvitationAttributes left, UserInvitationAttributes right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserInvitationAttributes left, UserInvitationAttributes right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
