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
    public partial class AppStoreVersionRelationships : IEquatable<AppStoreVersionRelationships>
    {
        /// <summary>
        /// Gets or Sets AgeRatingDeclaration
        /// </summary>
        [DataMember(Name="ageRatingDeclaration", EmitDefaultValue=false)]
        public AppStoreVersionRelationshipsAgeRatingDeclaration AgeRatingDeclaration { get; set; }

        /// <summary>
        /// Gets or Sets App
        /// </summary>
        [DataMember(Name="app", EmitDefaultValue=false)]
        public AppEncryptionDeclarationRelationshipsApp App { get; set; }

        /// <summary>
        /// Gets or Sets AppStoreReviewDetail
        /// </summary>
        [DataMember(Name="appStoreReviewDetail", EmitDefaultValue=false)]
        public AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail AppStoreReviewDetail { get; set; }

        /// <summary>
        /// Gets or Sets AppStoreVersionLocalizations
        /// </summary>
        [DataMember(Name="appStoreVersionLocalizations", EmitDefaultValue=false)]
        public AppStoreVersionRelationshipsAppStoreVersionLocalizations AppStoreVersionLocalizations { get; set; }

        /// <summary>
        /// Gets or Sets AppStoreVersionPhasedRelease
        /// </summary>
        [DataMember(Name="appStoreVersionPhasedRelease", EmitDefaultValue=false)]
        public AppStoreVersionRelationshipsAppStoreVersionPhasedRelease AppStoreVersionPhasedRelease { get; set; }

        /// <summary>
        /// Gets or Sets AppStoreVersionSubmission
        /// </summary>
        [DataMember(Name="appStoreVersionSubmission", EmitDefaultValue=false)]
        public AppStoreVersionRelationshipsAppStoreVersionSubmission AppStoreVersionSubmission { get; set; }

        /// <summary>
        /// Gets or Sets Build
        /// </summary>
        [DataMember(Name="build", EmitDefaultValue=false)]
        public AppStoreVersionRelationshipsBuild Build { get; set; }

        /// <summary>
        /// Gets or Sets IdfaDeclaration
        /// </summary>
        [DataMember(Name="idfaDeclaration", EmitDefaultValue=false)]
        public AppStoreVersionRelationshipsIdfaDeclaration IdfaDeclaration { get; set; }

        /// <summary>
        /// Gets or Sets RoutingAppCoverage
        /// </summary>
        [DataMember(Name="routingAppCoverage", EmitDefaultValue=false)]
        public AppStoreVersionRelationshipsRoutingAppCoverage RoutingAppCoverage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AppStoreVersionRelationships {\n");
            sb.Append("  AgeRatingDeclaration: ").Append(AgeRatingDeclaration).Append("\n");
            sb.Append("  App: ").Append(App).Append("\n");
            sb.Append("  AppStoreReviewDetail: ").Append(AppStoreReviewDetail).Append("\n");
            sb.Append("  AppStoreVersionLocalizations: ").Append(AppStoreVersionLocalizations).Append("\n");
            sb.Append("  AppStoreVersionPhasedRelease: ").Append(AppStoreVersionPhasedRelease).Append("\n");
            sb.Append("  AppStoreVersionSubmission: ").Append(AppStoreVersionSubmission).Append("\n");
            sb.Append("  Build: ").Append(Build).Append("\n");
            sb.Append("  IdfaDeclaration: ").Append(IdfaDeclaration).Append("\n");
            sb.Append("  RoutingAppCoverage: ").Append(RoutingAppCoverage).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AppStoreVersionRelationships)obj);
        }

        /// <summary>
        /// Returns true if AppStoreVersionRelationships instances are equal
        /// </summary>
        /// <param name="other">Instance of AppStoreVersionRelationships to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AppStoreVersionRelationships other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AgeRatingDeclaration == other.AgeRatingDeclaration ||
                    AgeRatingDeclaration != null &&
                    AgeRatingDeclaration.Equals(other.AgeRatingDeclaration)
                ) && 
                (
                    App == other.App ||
                    App != null &&
                    App.Equals(other.App)
                ) && 
                (
                    AppStoreReviewDetail == other.AppStoreReviewDetail ||
                    AppStoreReviewDetail != null &&
                    AppStoreReviewDetail.Equals(other.AppStoreReviewDetail)
                ) && 
                (
                    AppStoreVersionLocalizations == other.AppStoreVersionLocalizations ||
                    AppStoreVersionLocalizations != null &&
                    AppStoreVersionLocalizations.Equals(other.AppStoreVersionLocalizations)
                ) && 
                (
                    AppStoreVersionPhasedRelease == other.AppStoreVersionPhasedRelease ||
                    AppStoreVersionPhasedRelease != null &&
                    AppStoreVersionPhasedRelease.Equals(other.AppStoreVersionPhasedRelease)
                ) && 
                (
                    AppStoreVersionSubmission == other.AppStoreVersionSubmission ||
                    AppStoreVersionSubmission != null &&
                    AppStoreVersionSubmission.Equals(other.AppStoreVersionSubmission)
                ) && 
                (
                    Build == other.Build ||
                    Build != null &&
                    Build.Equals(other.Build)
                ) && 
                (
                    IdfaDeclaration == other.IdfaDeclaration ||
                    IdfaDeclaration != null &&
                    IdfaDeclaration.Equals(other.IdfaDeclaration)
                ) && 
                (
                    RoutingAppCoverage == other.RoutingAppCoverage ||
                    RoutingAppCoverage != null &&
                    RoutingAppCoverage.Equals(other.RoutingAppCoverage)
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
                    if (AgeRatingDeclaration != null)
                    hashCode = hashCode * 59 + AgeRatingDeclaration.GetHashCode();
                    if (App != null)
                    hashCode = hashCode * 59 + App.GetHashCode();
                    if (AppStoreReviewDetail != null)
                    hashCode = hashCode * 59 + AppStoreReviewDetail.GetHashCode();
                    if (AppStoreVersionLocalizations != null)
                    hashCode = hashCode * 59 + AppStoreVersionLocalizations.GetHashCode();
                    if (AppStoreVersionPhasedRelease != null)
                    hashCode = hashCode * 59 + AppStoreVersionPhasedRelease.GetHashCode();
                    if (AppStoreVersionSubmission != null)
                    hashCode = hashCode * 59 + AppStoreVersionSubmission.GetHashCode();
                    if (Build != null)
                    hashCode = hashCode * 59 + Build.GetHashCode();
                    if (IdfaDeclaration != null)
                    hashCode = hashCode * 59 + IdfaDeclaration.GetHashCode();
                    if (RoutingAppCoverage != null)
                    hashCode = hashCode * 59 + RoutingAppCoverage.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AppStoreVersionRelationships left, AppStoreVersionRelationships right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AppStoreVersionRelationships left, AppStoreVersionRelationships right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
