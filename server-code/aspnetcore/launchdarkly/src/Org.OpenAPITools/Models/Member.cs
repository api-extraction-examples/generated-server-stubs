/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: support@launchdarkly.com
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
    public partial class Member : IEquatable<Member>
    {
        /// <summary>
        /// The unique resource id.
        /// </summary>
        /// <value>The unique resource id.</value>
        /// <example>5a580a01b4ff89217bdf9dc1</example>
        [DataMember(Name="_id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// A unix epoch time in milliseconds specifying the last time this member was active in LaunchDarkly.
        /// </summary>
        /// <value>A unix epoch time in milliseconds specifying the last time this member was active in LaunchDarkly.</value>
        /// <example>1469326565348</example>
        [DataMember(Name="_lastSeen", EmitDefaultValue=true)]
        public long LastSeen { get; set; }

        /// <summary>
        /// Gets or Sets LastSeenMetadata
        /// </summary>
        [DataMember(Name="_lastSeenMetadata", EmitDefaultValue=false)]
        public MemberLastSeenMetadata LastSeenMetadata { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="_links", EmitDefaultValue=false)]
        public Links Links { get; set; }

        /// <summary>
        /// Gets or Sets PendingInvite
        /// </summary>
        [DataMember(Name="_pendingInvite", EmitDefaultValue=true)]
        public bool PendingInvite { get; set; }

        /// <summary>
        /// Gets or Sets Verified
        /// </summary>
        [DataMember(Name="_verified", EmitDefaultValue=true)]
        public bool Verified { get; set; }

        /// <summary>
        /// Gets or Sets CustomRoles
        /// </summary>
        [DataMember(Name="customRoles", EmitDefaultValue=false)]
        public List<string> CustomRoles { get; set; }

        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        /// <example>user@launchdarkly.com</example>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        /// <example>Alan</example>
        [DataMember(Name="firstName", EmitDefaultValue=false)]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or Sets IsBeta
        /// </summary>
        [DataMember(Name="isBeta", EmitDefaultValue=true)]
        public bool IsBeta { get; set; }

        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        /// <example>Turing</example>
        [DataMember(Name="lastName", EmitDefaultValue=false)]
        public string LastName { get; set; }

        /// <summary>
        /// Gets or Sets Role
        /// </summary>
        [DataMember(Name="role", EmitDefaultValue=true)]
        public Role Role { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Member {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  LastSeen: ").Append(LastSeen).Append("\n");
            sb.Append("  LastSeenMetadata: ").Append(LastSeenMetadata).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  PendingInvite: ").Append(PendingInvite).Append("\n");
            sb.Append("  Verified: ").Append(Verified).Append("\n");
            sb.Append("  CustomRoles: ").Append(CustomRoles).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  IsBeta: ").Append(IsBeta).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Member)obj);
        }

        /// <summary>
        /// Returns true if Member instances are equal
        /// </summary>
        /// <param name="other">Instance of Member to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Member other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    LastSeen == other.LastSeen ||
                    
                    LastSeen.Equals(other.LastSeen)
                ) && 
                (
                    LastSeenMetadata == other.LastSeenMetadata ||
                    LastSeenMetadata != null &&
                    LastSeenMetadata.Equals(other.LastSeenMetadata)
                ) && 
                (
                    Links == other.Links ||
                    Links != null &&
                    Links.Equals(other.Links)
                ) && 
                (
                    PendingInvite == other.PendingInvite ||
                    
                    PendingInvite.Equals(other.PendingInvite)
                ) && 
                (
                    Verified == other.Verified ||
                    
                    Verified.Equals(other.Verified)
                ) && 
                (
                    CustomRoles == other.CustomRoles ||
                    CustomRoles != null &&
                    other.CustomRoles != null &&
                    CustomRoles.SequenceEqual(other.CustomRoles)
                ) && 
                (
                    Email == other.Email ||
                    Email != null &&
                    Email.Equals(other.Email)
                ) && 
                (
                    FirstName == other.FirstName ||
                    FirstName != null &&
                    FirstName.Equals(other.FirstName)
                ) && 
                (
                    IsBeta == other.IsBeta ||
                    
                    IsBeta.Equals(other.IsBeta)
                ) && 
                (
                    LastName == other.LastName ||
                    LastName != null &&
                    LastName.Equals(other.LastName)
                ) && 
                (
                    Role == other.Role ||
                    
                    Role.Equals(other.Role)
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
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + LastSeen.GetHashCode();
                    if (LastSeenMetadata != null)
                    hashCode = hashCode * 59 + LastSeenMetadata.GetHashCode();
                    if (Links != null)
                    hashCode = hashCode * 59 + Links.GetHashCode();
                    
                    hashCode = hashCode * 59 + PendingInvite.GetHashCode();
                    
                    hashCode = hashCode * 59 + Verified.GetHashCode();
                    if (CustomRoles != null)
                    hashCode = hashCode * 59 + CustomRoles.GetHashCode();
                    if (Email != null)
                    hashCode = hashCode * 59 + Email.GetHashCode();
                    if (FirstName != null)
                    hashCode = hashCode * 59 + FirstName.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsBeta.GetHashCode();
                    if (LastName != null)
                    hashCode = hashCode * 59 + LastName.GetHashCode();
                    
                    hashCode = hashCode * 59 + Role.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Member left, Member right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Member left, Member right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
