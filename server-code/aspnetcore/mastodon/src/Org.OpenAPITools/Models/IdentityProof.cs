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
    /// Represents a proof from an external identity provider.
    /// </summary>
    [DataContract]
    public partial class IdentityProof : IEquatable<IdentityProof>
    {
        /// <summary>
        /// The account owner&#39;s profile URL on the identity provider.
        /// </summary>
        /// <value>The account owner&#39;s profile URL on the identity provider.</value>
        [DataMember(Name="profile_url", EmitDefaultValue=false)]
        public string ProfileUrl { get; set; }

        /// <summary>
        /// A link to a statement of identity proof, hosted by the identity provider.
        /// </summary>
        /// <value>A link to a statement of identity proof, hosted by the identity provider.</value>
        [DataMember(Name="proof_url", EmitDefaultValue=false)]
        public string ProofUrl { get; set; }

        /// <summary>
        /// The name of the identity provider.
        /// </summary>
        /// <value>The name of the identity provider.</value>
        [DataMember(Name="provider", EmitDefaultValue=false)]
        public string Provider { get; set; }

        /// <summary>
        /// The account owner&#39;s username on the identity provider&#39;s service.
        /// </summary>
        /// <value>The account owner&#39;s username on the identity provider&#39;s service.</value>
        [DataMember(Name="provider_username", EmitDefaultValue=false)]
        public string ProviderUsername { get; set; }

        /// <summary>
        /// When the identity proof was last updated. ISO 8601 Datetime.
        /// </summary>
        /// <value>When the identity proof was last updated. ISO 8601 Datetime.</value>
        [DataMember(Name="updated_at", EmitDefaultValue=false)]
        public string UpdatedAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IdentityProof {\n");
            sb.Append("  ProfileUrl: ").Append(ProfileUrl).Append("\n");
            sb.Append("  ProofUrl: ").Append(ProofUrl).Append("\n");
            sb.Append("  Provider: ").Append(Provider).Append("\n");
            sb.Append("  ProviderUsername: ").Append(ProviderUsername).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
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
            return obj.GetType() == GetType() && Equals((IdentityProof)obj);
        }

        /// <summary>
        /// Returns true if IdentityProof instances are equal
        /// </summary>
        /// <param name="other">Instance of IdentityProof to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IdentityProof other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ProfileUrl == other.ProfileUrl ||
                    ProfileUrl != null &&
                    ProfileUrl.Equals(other.ProfileUrl)
                ) && 
                (
                    ProofUrl == other.ProofUrl ||
                    ProofUrl != null &&
                    ProofUrl.Equals(other.ProofUrl)
                ) && 
                (
                    Provider == other.Provider ||
                    Provider != null &&
                    Provider.Equals(other.Provider)
                ) && 
                (
                    ProviderUsername == other.ProviderUsername ||
                    ProviderUsername != null &&
                    ProviderUsername.Equals(other.ProviderUsername)
                ) && 
                (
                    UpdatedAt == other.UpdatedAt ||
                    UpdatedAt != null &&
                    UpdatedAt.Equals(other.UpdatedAt)
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
                    if (ProfileUrl != null)
                    hashCode = hashCode * 59 + ProfileUrl.GetHashCode();
                    if (ProofUrl != null)
                    hashCode = hashCode * 59 + ProofUrl.GetHashCode();
                    if (Provider != null)
                    hashCode = hashCode * 59 + Provider.GetHashCode();
                    if (ProviderUsername != null)
                    hashCode = hashCode * 59 + ProviderUsername.GetHashCode();
                    if (UpdatedAt != null)
                    hashCode = hashCode * 59 + UpdatedAt.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IdentityProof left, IdentityProof right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IdentityProof left, IdentityProof right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
