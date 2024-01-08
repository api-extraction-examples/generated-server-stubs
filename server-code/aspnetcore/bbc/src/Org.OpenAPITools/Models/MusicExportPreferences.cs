/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * The version of the OpenAPI document: 1.0.0
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
    public partial class MusicExportPreferences : IEquatable<MusicExportPreferences>
    {
        /// <summary>
        /// Gets or Sets AccessExpiresAt
        /// </summary>
        [Required]
        [DataMember(Name="access_expires_at", EmitDefaultValue=false)]
        public string AccessExpiresAt { get; set; }

        /// <summary>
        /// Gets or Sets AccessToken
        /// </summary>
        [Required]
        [DataMember(Name="access_token", EmitDefaultValue=false)]
        public string AccessToken { get; set; }

        /// <summary>
        /// Gets or Sets AddPlusExport
        /// </summary>
        [Required]
        [DataMember(Name="add_plus_export", EmitDefaultValue=true)]
        public bool AddPlusExport { get; set; }

        /// <summary>
        /// Gets or Sets AuthorizationCode
        /// </summary>
        [Required]
        [DataMember(Name="authorization_code", EmitDefaultValue=false)]
        public string AuthorizationCode { get; set; }

        /// <summary>
        /// Gets or Sets LastExport
        /// </summary>
        [Required]
        [DataMember(Name="last_export", EmitDefaultValue=false)]
        public string LastExport { get; set; }

        /// <summary>
        /// Gets or Sets LegacyState
        /// </summary>
        [Required]
        [DataMember(Name="legacy_state", EmitDefaultValue=false)]
        public string LegacyState { get; set; }

        /// <summary>
        /// Gets or Sets PartnerId
        /// </summary>
        [Required]
        [DataMember(Name="partner_id", EmitDefaultValue=false)]
        public string PartnerId { get; set; }

        /// <summary>
        /// Gets or Sets RefreshToken
        /// </summary>
        [Required]
        [DataMember(Name="refresh_token", EmitDefaultValue=false)]
        public string RefreshToken { get; set; }

        /// <summary>
        /// Gets or Sets Terms
        /// </summary>
        [Required]
        [DataMember(Name="terms", EmitDefaultValue=true)]
        public bool Terms { get; set; }

        /// <summary>
        /// Gets or Sets Vendor
        /// </summary>
        [Required]
        [DataMember(Name="vendor", EmitDefaultValue=false)]
        public string Vendor { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MusicExportPreferences {\n");
            sb.Append("  AccessExpiresAt: ").Append(AccessExpiresAt).Append("\n");
            sb.Append("  AccessToken: ").Append(AccessToken).Append("\n");
            sb.Append("  AddPlusExport: ").Append(AddPlusExport).Append("\n");
            sb.Append("  AuthorizationCode: ").Append(AuthorizationCode).Append("\n");
            sb.Append("  LastExport: ").Append(LastExport).Append("\n");
            sb.Append("  LegacyState: ").Append(LegacyState).Append("\n");
            sb.Append("  PartnerId: ").Append(PartnerId).Append("\n");
            sb.Append("  RefreshToken: ").Append(RefreshToken).Append("\n");
            sb.Append("  Terms: ").Append(Terms).Append("\n");
            sb.Append("  Vendor: ").Append(Vendor).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MusicExportPreferences)obj);
        }

        /// <summary>
        /// Returns true if MusicExportPreferences instances are equal
        /// </summary>
        /// <param name="other">Instance of MusicExportPreferences to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MusicExportPreferences other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AccessExpiresAt == other.AccessExpiresAt ||
                    AccessExpiresAt != null &&
                    AccessExpiresAt.Equals(other.AccessExpiresAt)
                ) && 
                (
                    AccessToken == other.AccessToken ||
                    AccessToken != null &&
                    AccessToken.Equals(other.AccessToken)
                ) && 
                (
                    AddPlusExport == other.AddPlusExport ||
                    
                    AddPlusExport.Equals(other.AddPlusExport)
                ) && 
                (
                    AuthorizationCode == other.AuthorizationCode ||
                    AuthorizationCode != null &&
                    AuthorizationCode.Equals(other.AuthorizationCode)
                ) && 
                (
                    LastExport == other.LastExport ||
                    LastExport != null &&
                    LastExport.Equals(other.LastExport)
                ) && 
                (
                    LegacyState == other.LegacyState ||
                    LegacyState != null &&
                    LegacyState.Equals(other.LegacyState)
                ) && 
                (
                    PartnerId == other.PartnerId ||
                    PartnerId != null &&
                    PartnerId.Equals(other.PartnerId)
                ) && 
                (
                    RefreshToken == other.RefreshToken ||
                    RefreshToken != null &&
                    RefreshToken.Equals(other.RefreshToken)
                ) && 
                (
                    Terms == other.Terms ||
                    
                    Terms.Equals(other.Terms)
                ) && 
                (
                    Vendor == other.Vendor ||
                    Vendor != null &&
                    Vendor.Equals(other.Vendor)
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
                    if (AccessExpiresAt != null)
                    hashCode = hashCode * 59 + AccessExpiresAt.GetHashCode();
                    if (AccessToken != null)
                    hashCode = hashCode * 59 + AccessToken.GetHashCode();
                    
                    hashCode = hashCode * 59 + AddPlusExport.GetHashCode();
                    if (AuthorizationCode != null)
                    hashCode = hashCode * 59 + AuthorizationCode.GetHashCode();
                    if (LastExport != null)
                    hashCode = hashCode * 59 + LastExport.GetHashCode();
                    if (LegacyState != null)
                    hashCode = hashCode * 59 + LegacyState.GetHashCode();
                    if (PartnerId != null)
                    hashCode = hashCode * 59 + PartnerId.GetHashCode();
                    if (RefreshToken != null)
                    hashCode = hashCode * 59 + RefreshToken.GetHashCode();
                    
                    hashCode = hashCode * 59 + Terms.GetHashCode();
                    if (Vendor != null)
                    hashCode = hashCode * 59 + Vendor.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MusicExportPreferences left, MusicExportPreferences right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MusicExportPreferences left, MusicExportPreferences right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}