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
        /// Gets or Sets summaryKeyType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<SummaryKeyType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum SummaryKeyType
        {
            
            /// <summary>
            /// Enum UsersEnum for Users
            /// </summary>
            [EnumMember(Value = "Users")]
            UsersEnum = 1,
            
            /// <summary>
            /// Enum UsersQuotaEnum for UsersQuota
            /// </summary>
            [EnumMember(Value = "UsersQuota")]
            UsersQuotaEnum = 2,
            
            /// <summary>
            /// Enum GroupsEnum for Groups
            /// </summary>
            [EnumMember(Value = "Groups")]
            GroupsEnum = 3,
            
            /// <summary>
            /// Enum GroupsQuotaEnum for GroupsQuota
            /// </summary>
            [EnumMember(Value = "GroupsQuota")]
            GroupsQuotaEnum = 4,
            
            /// <summary>
            /// Enum ServerCertificatesEnum for ServerCertificates
            /// </summary>
            [EnumMember(Value = "ServerCertificates")]
            ServerCertificatesEnum = 5,
            
            /// <summary>
            /// Enum ServerCertificatesQuotaEnum for ServerCertificatesQuota
            /// </summary>
            [EnumMember(Value = "ServerCertificatesQuota")]
            ServerCertificatesQuotaEnum = 6,
            
            /// <summary>
            /// Enum UserPolicySizeQuotaEnum for UserPolicySizeQuota
            /// </summary>
            [EnumMember(Value = "UserPolicySizeQuota")]
            UserPolicySizeQuotaEnum = 7,
            
            /// <summary>
            /// Enum GroupPolicySizeQuotaEnum for GroupPolicySizeQuota
            /// </summary>
            [EnumMember(Value = "GroupPolicySizeQuota")]
            GroupPolicySizeQuotaEnum = 8,
            
            /// <summary>
            /// Enum GroupsPerUserQuotaEnum for GroupsPerUserQuota
            /// </summary>
            [EnumMember(Value = "GroupsPerUserQuota")]
            GroupsPerUserQuotaEnum = 9,
            
            /// <summary>
            /// Enum SigningCertificatesPerUserQuotaEnum for SigningCertificatesPerUserQuota
            /// </summary>
            [EnumMember(Value = "SigningCertificatesPerUserQuota")]
            SigningCertificatesPerUserQuotaEnum = 10,
            
            /// <summary>
            /// Enum AccessKeysPerUserQuotaEnum for AccessKeysPerUserQuota
            /// </summary>
            [EnumMember(Value = "AccessKeysPerUserQuota")]
            AccessKeysPerUserQuotaEnum = 11,
            
            /// <summary>
            /// Enum MFADevicesEnum for MFADevices
            /// </summary>
            [EnumMember(Value = "MFADevices")]
            MFADevicesEnum = 12,
            
            /// <summary>
            /// Enum MFADevicesInUseEnum for MFADevicesInUse
            /// </summary>
            [EnumMember(Value = "MFADevicesInUse")]
            MFADevicesInUseEnum = 13,
            
            /// <summary>
            /// Enum AccountMFAEnabledEnum for AccountMFAEnabled
            /// </summary>
            [EnumMember(Value = "AccountMFAEnabled")]
            AccountMFAEnabledEnum = 14,
            
            /// <summary>
            /// Enum AccountAccessKeysPresentEnum for AccountAccessKeysPresent
            /// </summary>
            [EnumMember(Value = "AccountAccessKeysPresent")]
            AccountAccessKeysPresentEnum = 15,
            
            /// <summary>
            /// Enum AccountSigningCertificatesPresentEnum for AccountSigningCertificatesPresent
            /// </summary>
            [EnumMember(Value = "AccountSigningCertificatesPresent")]
            AccountSigningCertificatesPresentEnum = 16,
            
            /// <summary>
            /// Enum AttachedPoliciesPerGroupQuotaEnum for AttachedPoliciesPerGroupQuota
            /// </summary>
            [EnumMember(Value = "AttachedPoliciesPerGroupQuota")]
            AttachedPoliciesPerGroupQuotaEnum = 17,
            
            /// <summary>
            /// Enum AttachedPoliciesPerRoleQuotaEnum for AttachedPoliciesPerRoleQuota
            /// </summary>
            [EnumMember(Value = "AttachedPoliciesPerRoleQuota")]
            AttachedPoliciesPerRoleQuotaEnum = 18,
            
            /// <summary>
            /// Enum AttachedPoliciesPerUserQuotaEnum for AttachedPoliciesPerUserQuota
            /// </summary>
            [EnumMember(Value = "AttachedPoliciesPerUserQuota")]
            AttachedPoliciesPerUserQuotaEnum = 19,
            
            /// <summary>
            /// Enum PoliciesEnum for Policies
            /// </summary>
            [EnumMember(Value = "Policies")]
            PoliciesEnum = 20,
            
            /// <summary>
            /// Enum PoliciesQuotaEnum for PoliciesQuota
            /// </summary>
            [EnumMember(Value = "PoliciesQuota")]
            PoliciesQuotaEnum = 21,
            
            /// <summary>
            /// Enum PolicySizeQuotaEnum for PolicySizeQuota
            /// </summary>
            [EnumMember(Value = "PolicySizeQuota")]
            PolicySizeQuotaEnum = 22,
            
            /// <summary>
            /// Enum PolicyVersionsInUseEnum for PolicyVersionsInUse
            /// </summary>
            [EnumMember(Value = "PolicyVersionsInUse")]
            PolicyVersionsInUseEnum = 23,
            
            /// <summary>
            /// Enum PolicyVersionsInUseQuotaEnum for PolicyVersionsInUseQuota
            /// </summary>
            [EnumMember(Value = "PolicyVersionsInUseQuota")]
            PolicyVersionsInUseQuotaEnum = 24,
            
            /// <summary>
            /// Enum VersionsPerPolicyQuotaEnum for VersionsPerPolicyQuota
            /// </summary>
            [EnumMember(Value = "VersionsPerPolicyQuota")]
            VersionsPerPolicyQuotaEnum = 25,
            
            /// <summary>
            /// Enum GlobalEndpointTokenVersionEnum for GlobalEndpointTokenVersion
            /// </summary>
            [EnumMember(Value = "GlobalEndpointTokenVersion")]
            GlobalEndpointTokenVersionEnum = 26
        }
}