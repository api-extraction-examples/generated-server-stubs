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
    public partial class IdfaDeclarationAttributes : IEquatable<IdfaDeclarationAttributes>
    {
        /// <summary>
        /// Gets or Sets AttributesActionWithPreviousAd
        /// </summary>
        [DataMember(Name="attributesActionWithPreviousAd", EmitDefaultValue=true)]
        public bool AttributesActionWithPreviousAd { get; set; }

        /// <summary>
        /// Gets or Sets AttributesAppInstallationToPreviousAd
        /// </summary>
        [DataMember(Name="attributesAppInstallationToPreviousAd", EmitDefaultValue=true)]
        public bool AttributesAppInstallationToPreviousAd { get; set; }

        /// <summary>
        /// Gets or Sets HonorsLimitedAdTracking
        /// </summary>
        [DataMember(Name="honorsLimitedAdTracking", EmitDefaultValue=true)]
        public bool HonorsLimitedAdTracking { get; set; }

        /// <summary>
        /// Gets or Sets ServesAds
        /// </summary>
        [DataMember(Name="servesAds", EmitDefaultValue=true)]
        public bool ServesAds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IdfaDeclarationAttributes {\n");
            sb.Append("  AttributesActionWithPreviousAd: ").Append(AttributesActionWithPreviousAd).Append("\n");
            sb.Append("  AttributesAppInstallationToPreviousAd: ").Append(AttributesAppInstallationToPreviousAd).Append("\n");
            sb.Append("  HonorsLimitedAdTracking: ").Append(HonorsLimitedAdTracking).Append("\n");
            sb.Append("  ServesAds: ").Append(ServesAds).Append("\n");
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
            return obj.GetType() == GetType() && Equals((IdfaDeclarationAttributes)obj);
        }

        /// <summary>
        /// Returns true if IdfaDeclarationAttributes instances are equal
        /// </summary>
        /// <param name="other">Instance of IdfaDeclarationAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IdfaDeclarationAttributes other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AttributesActionWithPreviousAd == other.AttributesActionWithPreviousAd ||
                    
                    AttributesActionWithPreviousAd.Equals(other.AttributesActionWithPreviousAd)
                ) && 
                (
                    AttributesAppInstallationToPreviousAd == other.AttributesAppInstallationToPreviousAd ||
                    
                    AttributesAppInstallationToPreviousAd.Equals(other.AttributesAppInstallationToPreviousAd)
                ) && 
                (
                    HonorsLimitedAdTracking == other.HonorsLimitedAdTracking ||
                    
                    HonorsLimitedAdTracking.Equals(other.HonorsLimitedAdTracking)
                ) && 
                (
                    ServesAds == other.ServesAds ||
                    
                    ServesAds.Equals(other.ServesAds)
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
                    
                    hashCode = hashCode * 59 + AttributesActionWithPreviousAd.GetHashCode();
                    
                    hashCode = hashCode * 59 + AttributesAppInstallationToPreviousAd.GetHashCode();
                    
                    hashCode = hashCode * 59 + HonorsLimitedAdTracking.GetHashCode();
                    
                    hashCode = hashCode * 59 + ServesAds.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IdfaDeclarationAttributes left, IdfaDeclarationAttributes right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IdfaDeclarationAttributes left, IdfaDeclarationAttributes right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
