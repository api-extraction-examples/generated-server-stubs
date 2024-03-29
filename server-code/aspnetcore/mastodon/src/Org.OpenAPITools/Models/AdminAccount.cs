/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
    /// Admin-level information about a given account.
    /// </summary>
    [DataContract]
    public partial class AdminAccount : IEquatable<AdminAccount>
    {
        /// <summary>
        /// Gets or Sets Account
        /// </summary>
        [DataMember(Name="account", EmitDefaultValue=false)]
        public Account Account { get; set; }

        /// <summary>
        /// Whether the account is currently approved.
        /// </summary>
        /// <value>Whether the account is currently approved.</value>
        [DataMember(Name="approved", EmitDefaultValue=true)]
        public bool Approved { get; set; }

        /// <summary>
        /// Whether the account has confirmed their email address.
        /// </summary>
        /// <value>Whether the account has confirmed their email address.</value>
        [DataMember(Name="confirmed", EmitDefaultValue=true)]
        public bool Confirmed { get; set; }

        /// <summary>
        /// When the account was first discovered.
        /// </summary>
        /// <value>When the account was first discovered.</value>
        [DataMember(Name="created_at", EmitDefaultValue=false)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// The ID of the application that created this account. Cast from an integer, but not guaranteed to be a number.
        /// </summary>
        /// <value>The ID of the application that created this account. Cast from an integer, but not guaranteed to be a number.</value>
        [DataMember(Name="created_by_application_id", EmitDefaultValue=false)]
        public string CreatedByApplicationId { get; set; }

        /// <summary>
        /// Whether the account is currently disabled.
        /// </summary>
        /// <value>Whether the account is currently disabled.</value>
        [DataMember(Name="disabled", EmitDefaultValue=true)]
        public bool Disabled { get; set; }

        /// <summary>
        /// The email address associated with the account.
        /// </summary>
        /// <value>The email address associated with the account.</value>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }

        /// <summary>
        /// The ID of the account in the database. Cast from an integer, but not guaranteed to be a number.
        /// </summary>
        /// <value>The ID of the account in the database. Cast from an integer, but not guaranteed to be a number.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Invite request text ???
        /// </summary>
        /// <value>Invite request text ???</value>
        [DataMember(Name="invite_request", EmitDefaultValue=false)]
        public string InviteRequest { get; set; }

        /// <summary>
        /// The ID of the account that invited this user. Cast from an integer, but not guaranteed to be a number.
        /// </summary>
        /// <value>The ID of the account that invited this user. Cast from an integer, but not guaranteed to be a number.</value>
        [DataMember(Name="invited_by_account_id", EmitDefaultValue=false)]
        public string InvitedByAccountId { get; set; }

        /// <summary>
        /// The IP address last used to login to this account.
        /// </summary>
        /// <value>The IP address last used to login to this account.</value>
        [DataMember(Name="ip", EmitDefaultValue=false)]
        public string Ip { get; set; }

        /// <summary>
        /// The locale of the account. ISO 639 Part 1 two-letter language code.
        /// </summary>
        /// <value>The locale of the account. ISO 639 Part 1 two-letter language code.</value>
        [DataMember(Name="locale", EmitDefaultValue=false)]
        public string Locale { get; set; }

        /// <summary>
        /// The current role of the account. Enumerable oneOf.
        /// </summary>
        /// <value>The current role of the account. Enumerable oneOf.</value>
        [DataMember(Name="role", EmitDefaultValue=false)]
        public string Role { get; set; }

        /// <summary>
        /// Whether the account is currently silenced.
        /// </summary>
        /// <value>Whether the account is currently silenced.</value>
        [DataMember(Name="silenced", EmitDefaultValue=true)]
        public bool Silenced { get; set; }

        /// <summary>
        /// Whether the account is currently suspended.
        /// </summary>
        /// <value>Whether the account is currently suspended.</value>
        [DataMember(Name="suspended", EmitDefaultValue=true)]
        public bool Suspended { get; set; }

        /// <summary>
        /// The username of the account.
        /// </summary>
        /// <value>The username of the account.</value>
        [DataMember(Name="username", EmitDefaultValue=false)]
        public string Username { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdminAccount {\n");
            sb.Append("  Account: ").Append(Account).Append("\n");
            sb.Append("  Approved: ").Append(Approved).Append("\n");
            sb.Append("  Confirmed: ").Append(Confirmed).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  CreatedByApplicationId: ").Append(CreatedByApplicationId).Append("\n");
            sb.Append("  Disabled: ").Append(Disabled).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  InviteRequest: ").Append(InviteRequest).Append("\n");
            sb.Append("  InvitedByAccountId: ").Append(InvitedByAccountId).Append("\n");
            sb.Append("  Ip: ").Append(Ip).Append("\n");
            sb.Append("  Locale: ").Append(Locale).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Silenced: ").Append(Silenced).Append("\n");
            sb.Append("  Suspended: ").Append(Suspended).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AdminAccount)obj);
        }

        /// <summary>
        /// Returns true if AdminAccount instances are equal
        /// </summary>
        /// <param name="other">Instance of AdminAccount to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdminAccount other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Account == other.Account ||
                    Account != null &&
                    Account.Equals(other.Account)
                ) && 
                (
                    Approved == other.Approved ||
                    
                    Approved.Equals(other.Approved)
                ) && 
                (
                    Confirmed == other.Confirmed ||
                    
                    Confirmed.Equals(other.Confirmed)
                ) && 
                (
                    CreatedAt == other.CreatedAt ||
                    CreatedAt != null &&
                    CreatedAt.Equals(other.CreatedAt)
                ) && 
                (
                    CreatedByApplicationId == other.CreatedByApplicationId ||
                    CreatedByApplicationId != null &&
                    CreatedByApplicationId.Equals(other.CreatedByApplicationId)
                ) && 
                (
                    Disabled == other.Disabled ||
                    
                    Disabled.Equals(other.Disabled)
                ) && 
                (
                    Email == other.Email ||
                    Email != null &&
                    Email.Equals(other.Email)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    InviteRequest == other.InviteRequest ||
                    InviteRequest != null &&
                    InviteRequest.Equals(other.InviteRequest)
                ) && 
                (
                    InvitedByAccountId == other.InvitedByAccountId ||
                    InvitedByAccountId != null &&
                    InvitedByAccountId.Equals(other.InvitedByAccountId)
                ) && 
                (
                    Ip == other.Ip ||
                    Ip != null &&
                    Ip.Equals(other.Ip)
                ) && 
                (
                    Locale == other.Locale ||
                    Locale != null &&
                    Locale.Equals(other.Locale)
                ) && 
                (
                    Role == other.Role ||
                    Role != null &&
                    Role.Equals(other.Role)
                ) && 
                (
                    Silenced == other.Silenced ||
                    
                    Silenced.Equals(other.Silenced)
                ) && 
                (
                    Suspended == other.Suspended ||
                    
                    Suspended.Equals(other.Suspended)
                ) && 
                (
                    Username == other.Username ||
                    Username != null &&
                    Username.Equals(other.Username)
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
                    if (Account != null)
                    hashCode = hashCode * 59 + Account.GetHashCode();
                    
                    hashCode = hashCode * 59 + Approved.GetHashCode();
                    
                    hashCode = hashCode * 59 + Confirmed.GetHashCode();
                    if (CreatedAt != null)
                    hashCode = hashCode * 59 + CreatedAt.GetHashCode();
                    if (CreatedByApplicationId != null)
                    hashCode = hashCode * 59 + CreatedByApplicationId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Disabled.GetHashCode();
                    if (Email != null)
                    hashCode = hashCode * 59 + Email.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (InviteRequest != null)
                    hashCode = hashCode * 59 + InviteRequest.GetHashCode();
                    if (InvitedByAccountId != null)
                    hashCode = hashCode * 59 + InvitedByAccountId.GetHashCode();
                    if (Ip != null)
                    hashCode = hashCode * 59 + Ip.GetHashCode();
                    if (Locale != null)
                    hashCode = hashCode * 59 + Locale.GetHashCode();
                    if (Role != null)
                    hashCode = hashCode * 59 + Role.GetHashCode();
                    
                    hashCode = hashCode * 59 + Silenced.GetHashCode();
                    
                    hashCode = hashCode * 59 + Suspended.GetHashCode();
                    if (Username != null)
                    hashCode = hashCode * 59 + Username.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AdminAccount left, AdminAccount right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AdminAccount left, AdminAccount right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
