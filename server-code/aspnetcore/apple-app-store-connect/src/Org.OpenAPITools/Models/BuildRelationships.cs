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
    public partial class BuildRelationships : IEquatable<BuildRelationships>
    {
        /// <summary>
        /// Gets or Sets App
        /// </summary>
        [DataMember(Name="app", EmitDefaultValue=false)]
        public AppEncryptionDeclarationRelationshipsApp App { get; set; }

        /// <summary>
        /// Gets or Sets AppEncryptionDeclaration
        /// </summary>
        [DataMember(Name="appEncryptionDeclaration", EmitDefaultValue=false)]
        public BuildRelationshipsAppEncryptionDeclaration AppEncryptionDeclaration { get; set; }

        /// <summary>
        /// Gets or Sets AppStoreVersion
        /// </summary>
        [DataMember(Name="appStoreVersion", EmitDefaultValue=false)]
        public AppStoreReviewDetailRelationshipsAppStoreVersion AppStoreVersion { get; set; }

        /// <summary>
        /// Gets or Sets BetaAppReviewSubmission
        /// </summary>
        [DataMember(Name="betaAppReviewSubmission", EmitDefaultValue=false)]
        public BuildRelationshipsBetaAppReviewSubmission BetaAppReviewSubmission { get; set; }

        /// <summary>
        /// Gets or Sets BetaBuildLocalizations
        /// </summary>
        [DataMember(Name="betaBuildLocalizations", EmitDefaultValue=false)]
        public BuildRelationshipsBetaBuildLocalizations BetaBuildLocalizations { get; set; }

        /// <summary>
        /// Gets or Sets BuildBetaDetail
        /// </summary>
        [DataMember(Name="buildBetaDetail", EmitDefaultValue=false)]
        public BuildRelationshipsBuildBetaDetail BuildBetaDetail { get; set; }

        /// <summary>
        /// Gets or Sets Icons
        /// </summary>
        [DataMember(Name="icons", EmitDefaultValue=false)]
        public BuildRelationshipsIcons Icons { get; set; }

        /// <summary>
        /// Gets or Sets IndividualTesters
        /// </summary>
        [DataMember(Name="individualTesters", EmitDefaultValue=false)]
        public BetaGroupRelationshipsBetaTesters IndividualTesters { get; set; }

        /// <summary>
        /// Gets or Sets PreReleaseVersion
        /// </summary>
        [DataMember(Name="preReleaseVersion", EmitDefaultValue=false)]
        public BuildRelationshipsPreReleaseVersion PreReleaseVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BuildRelationships {\n");
            sb.Append("  App: ").Append(App).Append("\n");
            sb.Append("  AppEncryptionDeclaration: ").Append(AppEncryptionDeclaration).Append("\n");
            sb.Append("  AppStoreVersion: ").Append(AppStoreVersion).Append("\n");
            sb.Append("  BetaAppReviewSubmission: ").Append(BetaAppReviewSubmission).Append("\n");
            sb.Append("  BetaBuildLocalizations: ").Append(BetaBuildLocalizations).Append("\n");
            sb.Append("  BuildBetaDetail: ").Append(BuildBetaDetail).Append("\n");
            sb.Append("  Icons: ").Append(Icons).Append("\n");
            sb.Append("  IndividualTesters: ").Append(IndividualTesters).Append("\n");
            sb.Append("  PreReleaseVersion: ").Append(PreReleaseVersion).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BuildRelationships)obj);
        }

        /// <summary>
        /// Returns true if BuildRelationships instances are equal
        /// </summary>
        /// <param name="other">Instance of BuildRelationships to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BuildRelationships other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    App == other.App ||
                    App != null &&
                    App.Equals(other.App)
                ) && 
                (
                    AppEncryptionDeclaration == other.AppEncryptionDeclaration ||
                    AppEncryptionDeclaration != null &&
                    AppEncryptionDeclaration.Equals(other.AppEncryptionDeclaration)
                ) && 
                (
                    AppStoreVersion == other.AppStoreVersion ||
                    AppStoreVersion != null &&
                    AppStoreVersion.Equals(other.AppStoreVersion)
                ) && 
                (
                    BetaAppReviewSubmission == other.BetaAppReviewSubmission ||
                    BetaAppReviewSubmission != null &&
                    BetaAppReviewSubmission.Equals(other.BetaAppReviewSubmission)
                ) && 
                (
                    BetaBuildLocalizations == other.BetaBuildLocalizations ||
                    BetaBuildLocalizations != null &&
                    BetaBuildLocalizations.Equals(other.BetaBuildLocalizations)
                ) && 
                (
                    BuildBetaDetail == other.BuildBetaDetail ||
                    BuildBetaDetail != null &&
                    BuildBetaDetail.Equals(other.BuildBetaDetail)
                ) && 
                (
                    Icons == other.Icons ||
                    Icons != null &&
                    Icons.Equals(other.Icons)
                ) && 
                (
                    IndividualTesters == other.IndividualTesters ||
                    IndividualTesters != null &&
                    IndividualTesters.Equals(other.IndividualTesters)
                ) && 
                (
                    PreReleaseVersion == other.PreReleaseVersion ||
                    PreReleaseVersion != null &&
                    PreReleaseVersion.Equals(other.PreReleaseVersion)
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
                    if (App != null)
                    hashCode = hashCode * 59 + App.GetHashCode();
                    if (AppEncryptionDeclaration != null)
                    hashCode = hashCode * 59 + AppEncryptionDeclaration.GetHashCode();
                    if (AppStoreVersion != null)
                    hashCode = hashCode * 59 + AppStoreVersion.GetHashCode();
                    if (BetaAppReviewSubmission != null)
                    hashCode = hashCode * 59 + BetaAppReviewSubmission.GetHashCode();
                    if (BetaBuildLocalizations != null)
                    hashCode = hashCode * 59 + BetaBuildLocalizations.GetHashCode();
                    if (BuildBetaDetail != null)
                    hashCode = hashCode * 59 + BuildBetaDetail.GetHashCode();
                    if (Icons != null)
                    hashCode = hashCode * 59 + Icons.GetHashCode();
                    if (IndividualTesters != null)
                    hashCode = hashCode * 59 + IndividualTesters.GetHashCode();
                    if (PreReleaseVersion != null)
                    hashCode = hashCode * 59 + PreReleaseVersion.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BuildRelationships left, BuildRelationships right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BuildRelationships left, BuildRelationships right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
