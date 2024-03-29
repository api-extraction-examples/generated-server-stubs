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
    public partial class PostTokenRequest : IEquatable<PostTokenRequest>
    {
        /// <summary>
        /// A list of custom role IDs to use as access limits for the access token
        /// </summary>
        /// <value>A list of custom role IDs to use as access limits for the access token</value>
        [DataMember(Name="customRoleIds", EmitDefaultValue=false)]
        public List<string> CustomRoleIds { get; set; }

        /// <summary>
        /// The default API version for this token
        /// </summary>
        /// <value>The default API version for this token</value>
        [DataMember(Name="defaultApiVersion", EmitDefaultValue=true)]
        public int DefaultApiVersion { get; set; }

        /// <summary>
        /// Gets or Sets InlineRole
        /// </summary>
        [DataMember(Name="inlineRole", EmitDefaultValue=false)]
        public List<Statement> InlineRole { get; set; }

        /// <summary>
        /// A human-friendly name for the access token
        /// </summary>
        /// <value>A human-friendly name for the access token</value>
        /// <example>My access token</example>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The name of a built-in role for the token
        /// </summary>
        /// <value>The name of a built-in role for the token</value>
        /// <example>writer</example>
        [DataMember(Name="role", EmitDefaultValue=false)]
        public string Role { get; set; }

        /// <summary>
        /// Whether the token will be a service token https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens
        /// </summary>
        /// <value>Whether the token will be a service token https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens</value>
        [DataMember(Name="serviceToken", EmitDefaultValue=true)]
        public bool ServiceToken { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PostTokenRequest {\n");
            sb.Append("  CustomRoleIds: ").Append(CustomRoleIds).Append("\n");
            sb.Append("  DefaultApiVersion: ").Append(DefaultApiVersion).Append("\n");
            sb.Append("  InlineRole: ").Append(InlineRole).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  ServiceToken: ").Append(ServiceToken).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PostTokenRequest)obj);
        }

        /// <summary>
        /// Returns true if PostTokenRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of PostTokenRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostTokenRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CustomRoleIds == other.CustomRoleIds ||
                    CustomRoleIds != null &&
                    other.CustomRoleIds != null &&
                    CustomRoleIds.SequenceEqual(other.CustomRoleIds)
                ) && 
                (
                    DefaultApiVersion == other.DefaultApiVersion ||
                    
                    DefaultApiVersion.Equals(other.DefaultApiVersion)
                ) && 
                (
                    InlineRole == other.InlineRole ||
                    InlineRole != null &&
                    other.InlineRole != null &&
                    InlineRole.SequenceEqual(other.InlineRole)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Role == other.Role ||
                    Role != null &&
                    Role.Equals(other.Role)
                ) && 
                (
                    ServiceToken == other.ServiceToken ||
                    
                    ServiceToken.Equals(other.ServiceToken)
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
                    if (CustomRoleIds != null)
                    hashCode = hashCode * 59 + CustomRoleIds.GetHashCode();
                    
                    hashCode = hashCode * 59 + DefaultApiVersion.GetHashCode();
                    if (InlineRole != null)
                    hashCode = hashCode * 59 + InlineRole.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Role != null)
                    hashCode = hashCode * 59 + Role.GetHashCode();
                    
                    hashCode = hashCode * 59 + ServiceToken.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PostTokenRequest left, PostTokenRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PostTokenRequest left, PostTokenRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
