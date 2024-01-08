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
    public partial class AppRelationships : IEquatable<AppRelationships>
    {
        /// <summary>
        /// Gets or Sets AppInfos
        /// </summary>
        [DataMember(Name="appInfos", EmitDefaultValue=false)]
        public AppRelationshipsAppInfos AppInfos { get; set; }

        /// <summary>
        /// Gets or Sets AppStoreVersions
        /// </summary>
        [DataMember(Name="appStoreVersions", EmitDefaultValue=false)]
        public AppRelationshipsAppStoreVersions AppStoreVersions { get; set; }

        /// <summary>
        /// Gets or Sets AvailableTerritories
        /// </summary>
        [DataMember(Name="availableTerritories", EmitDefaultValue=false)]
        public AppRelationshipsAvailableTerritories AvailableTerritories { get; set; }

        /// <summary>
        /// Gets or Sets BetaAppLocalizations
        /// </summary>
        [DataMember(Name="betaAppLocalizations", EmitDefaultValue=false)]
        public AppRelationshipsBetaAppLocalizations BetaAppLocalizations { get; set; }

        /// <summary>
        /// Gets or Sets BetaAppReviewDetail
        /// </summary>
        [DataMember(Name="betaAppReviewDetail", EmitDefaultValue=false)]
        public AppRelationshipsBetaAppReviewDetail BetaAppReviewDetail { get; set; }

        /// <summary>
        /// Gets or Sets BetaGroups
        /// </summary>
        [DataMember(Name="betaGroups", EmitDefaultValue=false)]
        public AppRelationshipsBetaGroups BetaGroups { get; set; }

        /// <summary>
        /// Gets or Sets BetaLicenseAgreement
        /// </summary>
        [DataMember(Name="betaLicenseAgreement", EmitDefaultValue=false)]
        public AppRelationshipsBetaLicenseAgreement BetaLicenseAgreement { get; set; }

        /// <summary>
        /// Gets or Sets Builds
        /// </summary>
        [DataMember(Name="builds", EmitDefaultValue=false)]
        public AppRelationshipsBuilds Builds { get; set; }

        /// <summary>
        /// Gets or Sets EndUserLicenseAgreement
        /// </summary>
        [DataMember(Name="endUserLicenseAgreement", EmitDefaultValue=false)]
        public AppRelationshipsEndUserLicenseAgreement EndUserLicenseAgreement { get; set; }

        /// <summary>
        /// Gets or Sets GameCenterEnabledVersions
        /// </summary>
        [DataMember(Name="gameCenterEnabledVersions", EmitDefaultValue=false)]
        public AppRelationshipsGameCenterEnabledVersions GameCenterEnabledVersions { get; set; }

        /// <summary>
        /// Gets or Sets InAppPurchases
        /// </summary>
        [DataMember(Name="inAppPurchases", EmitDefaultValue=false)]
        public AppRelationshipsInAppPurchases InAppPurchases { get; set; }

        /// <summary>
        /// Gets or Sets PreOrder
        /// </summary>
        [DataMember(Name="preOrder", EmitDefaultValue=false)]
        public AppRelationshipsPreOrder PreOrder { get; set; }

        /// <summary>
        /// Gets or Sets PreReleaseVersions
        /// </summary>
        [DataMember(Name="preReleaseVersions", EmitDefaultValue=false)]
        public AppRelationshipsPreReleaseVersions PreReleaseVersions { get; set; }

        /// <summary>
        /// Gets or Sets Prices
        /// </summary>
        [DataMember(Name="prices", EmitDefaultValue=false)]
        public AppRelationshipsPrices Prices { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AppRelationships {\n");
            sb.Append("  AppInfos: ").Append(AppInfos).Append("\n");
            sb.Append("  AppStoreVersions: ").Append(AppStoreVersions).Append("\n");
            sb.Append("  AvailableTerritories: ").Append(AvailableTerritories).Append("\n");
            sb.Append("  BetaAppLocalizations: ").Append(BetaAppLocalizations).Append("\n");
            sb.Append("  BetaAppReviewDetail: ").Append(BetaAppReviewDetail).Append("\n");
            sb.Append("  BetaGroups: ").Append(BetaGroups).Append("\n");
            sb.Append("  BetaLicenseAgreement: ").Append(BetaLicenseAgreement).Append("\n");
            sb.Append("  Builds: ").Append(Builds).Append("\n");
            sb.Append("  EndUserLicenseAgreement: ").Append(EndUserLicenseAgreement).Append("\n");
            sb.Append("  GameCenterEnabledVersions: ").Append(GameCenterEnabledVersions).Append("\n");
            sb.Append("  InAppPurchases: ").Append(InAppPurchases).Append("\n");
            sb.Append("  PreOrder: ").Append(PreOrder).Append("\n");
            sb.Append("  PreReleaseVersions: ").Append(PreReleaseVersions).Append("\n");
            sb.Append("  Prices: ").Append(Prices).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AppRelationships)obj);
        }

        /// <summary>
        /// Returns true if AppRelationships instances are equal
        /// </summary>
        /// <param name="other">Instance of AppRelationships to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AppRelationships other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AppInfos == other.AppInfos ||
                    AppInfos != null &&
                    AppInfos.Equals(other.AppInfos)
                ) && 
                (
                    AppStoreVersions == other.AppStoreVersions ||
                    AppStoreVersions != null &&
                    AppStoreVersions.Equals(other.AppStoreVersions)
                ) && 
                (
                    AvailableTerritories == other.AvailableTerritories ||
                    AvailableTerritories != null &&
                    AvailableTerritories.Equals(other.AvailableTerritories)
                ) && 
                (
                    BetaAppLocalizations == other.BetaAppLocalizations ||
                    BetaAppLocalizations != null &&
                    BetaAppLocalizations.Equals(other.BetaAppLocalizations)
                ) && 
                (
                    BetaAppReviewDetail == other.BetaAppReviewDetail ||
                    BetaAppReviewDetail != null &&
                    BetaAppReviewDetail.Equals(other.BetaAppReviewDetail)
                ) && 
                (
                    BetaGroups == other.BetaGroups ||
                    BetaGroups != null &&
                    BetaGroups.Equals(other.BetaGroups)
                ) && 
                (
                    BetaLicenseAgreement == other.BetaLicenseAgreement ||
                    BetaLicenseAgreement != null &&
                    BetaLicenseAgreement.Equals(other.BetaLicenseAgreement)
                ) && 
                (
                    Builds == other.Builds ||
                    Builds != null &&
                    Builds.Equals(other.Builds)
                ) && 
                (
                    EndUserLicenseAgreement == other.EndUserLicenseAgreement ||
                    EndUserLicenseAgreement != null &&
                    EndUserLicenseAgreement.Equals(other.EndUserLicenseAgreement)
                ) && 
                (
                    GameCenterEnabledVersions == other.GameCenterEnabledVersions ||
                    GameCenterEnabledVersions != null &&
                    GameCenterEnabledVersions.Equals(other.GameCenterEnabledVersions)
                ) && 
                (
                    InAppPurchases == other.InAppPurchases ||
                    InAppPurchases != null &&
                    InAppPurchases.Equals(other.InAppPurchases)
                ) && 
                (
                    PreOrder == other.PreOrder ||
                    PreOrder != null &&
                    PreOrder.Equals(other.PreOrder)
                ) && 
                (
                    PreReleaseVersions == other.PreReleaseVersions ||
                    PreReleaseVersions != null &&
                    PreReleaseVersions.Equals(other.PreReleaseVersions)
                ) && 
                (
                    Prices == other.Prices ||
                    Prices != null &&
                    Prices.Equals(other.Prices)
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
                    if (AppInfos != null)
                    hashCode = hashCode * 59 + AppInfos.GetHashCode();
                    if (AppStoreVersions != null)
                    hashCode = hashCode * 59 + AppStoreVersions.GetHashCode();
                    if (AvailableTerritories != null)
                    hashCode = hashCode * 59 + AvailableTerritories.GetHashCode();
                    if (BetaAppLocalizations != null)
                    hashCode = hashCode * 59 + BetaAppLocalizations.GetHashCode();
                    if (BetaAppReviewDetail != null)
                    hashCode = hashCode * 59 + BetaAppReviewDetail.GetHashCode();
                    if (BetaGroups != null)
                    hashCode = hashCode * 59 + BetaGroups.GetHashCode();
                    if (BetaLicenseAgreement != null)
                    hashCode = hashCode * 59 + BetaLicenseAgreement.GetHashCode();
                    if (Builds != null)
                    hashCode = hashCode * 59 + Builds.GetHashCode();
                    if (EndUserLicenseAgreement != null)
                    hashCode = hashCode * 59 + EndUserLicenseAgreement.GetHashCode();
                    if (GameCenterEnabledVersions != null)
                    hashCode = hashCode * 59 + GameCenterEnabledVersions.GetHashCode();
                    if (InAppPurchases != null)
                    hashCode = hashCode * 59 + InAppPurchases.GetHashCode();
                    if (PreOrder != null)
                    hashCode = hashCode * 59 + PreOrder.GetHashCode();
                    if (PreReleaseVersions != null)
                    hashCode = hashCode * 59 + PreReleaseVersions.GetHashCode();
                    if (Prices != null)
                    hashCode = hashCode * 59 + Prices.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AppRelationships left, AppRelationships right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AppRelationships left, AppRelationships right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
