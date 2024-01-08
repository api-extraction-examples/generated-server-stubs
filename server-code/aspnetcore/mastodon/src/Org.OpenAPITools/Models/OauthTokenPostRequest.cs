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
    /// 
    /// </summary>
    [DataContract]
    public partial class OauthTokenPostRequest : IEquatable<OauthTokenPostRequest>
    {
        /// <summary>
        /// Client ID, obtained during app registration
        /// </summary>
        /// <value>Client ID, obtained during app registration</value>
        [Required]
        [DataMember(Name="client_id", EmitDefaultValue=false)]
        public string ClientId { get; set; }

        /// <summary>
        /// Client secret, obtained during app registration
        /// </summary>
        /// <value>Client secret, obtained during app registration</value>
        [Required]
        [DataMember(Name="client_secret", EmitDefaultValue=false)]
        public string ClientSecret { get; set; }

        /// <summary>
        /// A user authorization code, obtained via /oauth/authorize
        /// </summary>
        /// <value>A user authorization code, obtained via /oauth/authorize</value>
        [DataMember(Name="code", EmitDefaultValue=false)]
        public string Code { get; set; }

        /// <summary>
        /// Set equal to authorization_code if code is provided in order to gain user-level access. Otherwise, set equal to client_credentials to obtain app-level access only.
        /// </summary>
        /// <value>Set equal to authorization_code if code is provided in order to gain user-level access. Otherwise, set equal to client_credentials to obtain app-level access only.</value>
        [Required]
        [DataMember(Name="grant_type", EmitDefaultValue=false)]
        public string GrantType { get; set; }

        /// <summary>
        /// Set a URI to redirect the user to. If this parameter is set to urn:ietf:wg:oauth:2.0:oob then the token will be shown instead. Must match one of the redirect URIs declared during app registration.
        /// </summary>
        /// <value>Set a URI to redirect the user to. If this parameter is set to urn:ietf:wg:oauth:2.0:oob then the token will be shown instead. Must match one of the redirect URIs declared during app registration.</value>
        [Required]
        [DataMember(Name="redirect_uri", EmitDefaultValue=false)]
        public string RedirectUri { get; set; }

        /// <summary>
        /// List of requested OAuth scopes, separated by spaces. Must be a subset of scopes declared during app registration. If not provided, defaults to read.
        /// </summary>
        /// <value>List of requested OAuth scopes, separated by spaces. Must be a subset of scopes declared during app registration. If not provided, defaults to read.</value>
        [DataMember(Name="scopes", EmitDefaultValue=false)]
        public string Scopes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OauthTokenPostRequest {\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  ClientSecret: ").Append(ClientSecret).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  GrantType: ").Append(GrantType).Append("\n");
            sb.Append("  RedirectUri: ").Append(RedirectUri).Append("\n");
            sb.Append("  Scopes: ").Append(Scopes).Append("\n");
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
            return obj.GetType() == GetType() && Equals((OauthTokenPostRequest)obj);
        }

        /// <summary>
        /// Returns true if OauthTokenPostRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of OauthTokenPostRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OauthTokenPostRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ClientId == other.ClientId ||
                    ClientId != null &&
                    ClientId.Equals(other.ClientId)
                ) && 
                (
                    ClientSecret == other.ClientSecret ||
                    ClientSecret != null &&
                    ClientSecret.Equals(other.ClientSecret)
                ) && 
                (
                    Code == other.Code ||
                    Code != null &&
                    Code.Equals(other.Code)
                ) && 
                (
                    GrantType == other.GrantType ||
                    GrantType != null &&
                    GrantType.Equals(other.GrantType)
                ) && 
                (
                    RedirectUri == other.RedirectUri ||
                    RedirectUri != null &&
                    RedirectUri.Equals(other.RedirectUri)
                ) && 
                (
                    Scopes == other.Scopes ||
                    Scopes != null &&
                    Scopes.Equals(other.Scopes)
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
                    if (ClientId != null)
                    hashCode = hashCode * 59 + ClientId.GetHashCode();
                    if (ClientSecret != null)
                    hashCode = hashCode * 59 + ClientSecret.GetHashCode();
                    if (Code != null)
                    hashCode = hashCode * 59 + Code.GetHashCode();
                    if (GrantType != null)
                    hashCode = hashCode * 59 + GrantType.GetHashCode();
                    if (RedirectUri != null)
                    hashCode = hashCode * 59 + RedirectUri.GetHashCode();
                    if (Scopes != null)
                    hashCode = hashCode * 59 + Scopes.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OauthTokenPostRequest left, OauthTokenPostRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OauthTokenPostRequest left, OauthTokenPostRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
