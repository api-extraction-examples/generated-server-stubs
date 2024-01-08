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
    /// The user subscribing to filter.
    /// </summary>
    [DataContract]
    public partial class FilterSubscriptionUser : IEquatable<FilterSubscriptionUser>
    {
        /// <summary>
        /// The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
        /// </summary>
        /// <value>The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.</value>
        [MaxLength(128)]
        [DataMember(Name="accountId", EmitDefaultValue=false)]
        public string AccountId { get; set; }


        /// <summary>
        /// The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk
        /// </summary>
        /// <value>The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk</value>
        [TypeConverter(typeof(CustomEnumConverter<AccountTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AccountTypeEnum
        {
            
            /// <summary>
            /// Enum AtlassianEnum for atlassian
            /// </summary>
            [EnumMember(Value = "atlassian")]
            AtlassianEnum = 1,
            
            /// <summary>
            /// Enum AppEnum for app
            /// </summary>
            [EnumMember(Value = "app")]
            AppEnum = 2,
            
            /// <summary>
            /// Enum CustomerEnum for customer
            /// </summary>
            [EnumMember(Value = "customer")]
            CustomerEnum = 3,
            
            /// <summary>
            /// Enum UnknownEnum for unknown
            /// </summary>
            [EnumMember(Value = "unknown")]
            UnknownEnum = 4
        }

        /// <summary>
        /// The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk
        /// </summary>
        /// <value>The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk</value>
        [DataMember(Name="accountType", EmitDefaultValue=true)]
        public AccountTypeEnum AccountType { get; set; }

        /// <summary>
        /// Whether the user is active.
        /// </summary>
        /// <value>Whether the user is active.</value>
        [DataMember(Name="active", EmitDefaultValue=true)]
        public bool Active { get; set; }

        /// <summary>
        /// Gets or Sets ApplicationRoles
        /// </summary>
        [DataMember(Name="applicationRoles", EmitDefaultValue=false)]
        public UserApplicationRoles ApplicationRoles { get; set; }

        /// <summary>
        /// Gets or Sets AvatarUrls
        /// </summary>
        [DataMember(Name="avatarUrls", EmitDefaultValue=false)]
        public UserAvatarUrls AvatarUrls { get; set; }

        /// <summary>
        /// The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
        /// </summary>
        /// <value>The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.</value>
        [DataMember(Name="displayName", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
        /// </summary>
        /// <value>The email address of the user. Depending on the user’s privacy setting, this may be returned as null.</value>
        [DataMember(Name="emailAddress", EmitDefaultValue=false)]
        public string EmailAddress { get; set; }

        /// <summary>
        /// Expand options that include additional user details in the response.
        /// </summary>
        /// <value>Expand options that include additional user details in the response.</value>
        [DataMember(Name="expand", EmitDefaultValue=false)]
        public string Expand { get; set; }

        /// <summary>
        /// Gets or Sets Groups
        /// </summary>
        [DataMember(Name="groups", EmitDefaultValue=false)]
        public UserGroups Groups { get; set; }

        /// <summary>
        /// This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
        /// </summary>
        /// <value>This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.</value>
        [DataMember(Name="key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
        /// </summary>
        /// <value>The locale of the user. Depending on the user’s privacy setting, this may be returned as null.</value>
        [DataMember(Name="locale", EmitDefaultValue=false)]
        public string Locale { get; set; }

        /// <summary>
        /// This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
        /// </summary>
        /// <value>This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The URL of the user.
        /// </summary>
        /// <value>The URL of the user.</value>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public string Self { get; set; }

        /// <summary>
        /// The time zone specified in the user&#39;s profile. Depending on the user’s privacy setting, this may be returned as null.
        /// </summary>
        /// <value>The time zone specified in the user&#39;s profile. Depending on the user’s privacy setting, this may be returned as null.</value>
        [DataMember(Name="timeZone", EmitDefaultValue=false)]
        public string VarTimeZone { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FilterSubscriptionUser {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  AccountType: ").Append(AccountType).Append("\n");
            sb.Append("  Active: ").Append(Active).Append("\n");
            sb.Append("  ApplicationRoles: ").Append(ApplicationRoles).Append("\n");
            sb.Append("  AvatarUrls: ").Append(AvatarUrls).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  EmailAddress: ").Append(EmailAddress).Append("\n");
            sb.Append("  Expand: ").Append(Expand).Append("\n");
            sb.Append("  Groups: ").Append(Groups).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Locale: ").Append(Locale).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  VarTimeZone: ").Append(VarTimeZone).Append("\n");
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
            return obj.GetType() == GetType() && Equals((FilterSubscriptionUser)obj);
        }

        /// <summary>
        /// Returns true if FilterSubscriptionUser instances are equal
        /// </summary>
        /// <param name="other">Instance of FilterSubscriptionUser to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FilterSubscriptionUser other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AccountId == other.AccountId ||
                    AccountId != null &&
                    AccountId.Equals(other.AccountId)
                ) && 
                (
                    AccountType == other.AccountType ||
                    
                    AccountType.Equals(other.AccountType)
                ) && 
                (
                    Active == other.Active ||
                    
                    Active.Equals(other.Active)
                ) && 
                (
                    ApplicationRoles == other.ApplicationRoles ||
                    ApplicationRoles != null &&
                    ApplicationRoles.Equals(other.ApplicationRoles)
                ) && 
                (
                    AvatarUrls == other.AvatarUrls ||
                    AvatarUrls != null &&
                    AvatarUrls.Equals(other.AvatarUrls)
                ) && 
                (
                    DisplayName == other.DisplayName ||
                    DisplayName != null &&
                    DisplayName.Equals(other.DisplayName)
                ) && 
                (
                    EmailAddress == other.EmailAddress ||
                    EmailAddress != null &&
                    EmailAddress.Equals(other.EmailAddress)
                ) && 
                (
                    Expand == other.Expand ||
                    Expand != null &&
                    Expand.Equals(other.Expand)
                ) && 
                (
                    Groups == other.Groups ||
                    Groups != null &&
                    Groups.Equals(other.Groups)
                ) && 
                (
                    Key == other.Key ||
                    Key != null &&
                    Key.Equals(other.Key)
                ) && 
                (
                    Locale == other.Locale ||
                    Locale != null &&
                    Locale.Equals(other.Locale)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Self == other.Self ||
                    Self != null &&
                    Self.Equals(other.Self)
                ) && 
                (
                    VarTimeZone == other.VarTimeZone ||
                    VarTimeZone != null &&
                    VarTimeZone.Equals(other.VarTimeZone)
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
                    if (AccountId != null)
                    hashCode = hashCode * 59 + AccountId.GetHashCode();
                    
                    hashCode = hashCode * 59 + AccountType.GetHashCode();
                    
                    hashCode = hashCode * 59 + Active.GetHashCode();
                    if (ApplicationRoles != null)
                    hashCode = hashCode * 59 + ApplicationRoles.GetHashCode();
                    if (AvatarUrls != null)
                    hashCode = hashCode * 59 + AvatarUrls.GetHashCode();
                    if (DisplayName != null)
                    hashCode = hashCode * 59 + DisplayName.GetHashCode();
                    if (EmailAddress != null)
                    hashCode = hashCode * 59 + EmailAddress.GetHashCode();
                    if (Expand != null)
                    hashCode = hashCode * 59 + Expand.GetHashCode();
                    if (Groups != null)
                    hashCode = hashCode * 59 + Groups.GetHashCode();
                    if (Key != null)
                    hashCode = hashCode * 59 + Key.GetHashCode();
                    if (Locale != null)
                    hashCode = hashCode * 59 + Locale.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Self != null)
                    hashCode = hashCode * 59 + Self.GetHashCode();
                    if (VarTimeZone != null)
                    hashCode = hashCode * 59 + VarTimeZone.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FilterSubscriptionUser left, FilterSubscriptionUser right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FilterSubscriptionUser left, FilterSubscriptionUser right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
