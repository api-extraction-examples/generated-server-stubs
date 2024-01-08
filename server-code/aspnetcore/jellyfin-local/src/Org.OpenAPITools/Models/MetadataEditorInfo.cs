/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
    public partial class MetadataEditorInfo : IEquatable<MetadataEditorInfo>
    {
        /// <summary>
        /// Gets or Sets ContentType
        /// </summary>
        [DataMember(Name="ContentType", EmitDefaultValue=true)]
        public string ContentType { get; set; }

        /// <summary>
        /// Gets or Sets ContentTypeOptions
        /// </summary>
        [DataMember(Name="ContentTypeOptions", EmitDefaultValue=true)]
        public List<NameValuePair> ContentTypeOptions { get; set; }

        /// <summary>
        /// Gets or Sets Countries
        /// </summary>
        [DataMember(Name="Countries", EmitDefaultValue=true)]
        public List<CountryInfo> Countries { get; set; }

        /// <summary>
        /// Gets or Sets Cultures
        /// </summary>
        [DataMember(Name="Cultures", EmitDefaultValue=true)]
        public List<CultureDto> Cultures { get; set; }

        /// <summary>
        /// Gets or Sets ExternalIdInfos
        /// </summary>
        [DataMember(Name="ExternalIdInfos", EmitDefaultValue=true)]
        public List<ExternalIdInfo> ExternalIdInfos { get; set; }

        /// <summary>
        /// Gets or Sets ParentalRatingOptions
        /// </summary>
        [DataMember(Name="ParentalRatingOptions", EmitDefaultValue=true)]
        public List<ParentalRating> ParentalRatingOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MetadataEditorInfo {\n");
            sb.Append("  ContentType: ").Append(ContentType).Append("\n");
            sb.Append("  ContentTypeOptions: ").Append(ContentTypeOptions).Append("\n");
            sb.Append("  Countries: ").Append(Countries).Append("\n");
            sb.Append("  Cultures: ").Append(Cultures).Append("\n");
            sb.Append("  ExternalIdInfos: ").Append(ExternalIdInfos).Append("\n");
            sb.Append("  ParentalRatingOptions: ").Append(ParentalRatingOptions).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MetadataEditorInfo)obj);
        }

        /// <summary>
        /// Returns true if MetadataEditorInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of MetadataEditorInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MetadataEditorInfo other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ContentType == other.ContentType ||
                    ContentType != null &&
                    ContentType.Equals(other.ContentType)
                ) && 
                (
                    ContentTypeOptions == other.ContentTypeOptions ||
                    ContentTypeOptions != null &&
                    other.ContentTypeOptions != null &&
                    ContentTypeOptions.SequenceEqual(other.ContentTypeOptions)
                ) && 
                (
                    Countries == other.Countries ||
                    Countries != null &&
                    other.Countries != null &&
                    Countries.SequenceEqual(other.Countries)
                ) && 
                (
                    Cultures == other.Cultures ||
                    Cultures != null &&
                    other.Cultures != null &&
                    Cultures.SequenceEqual(other.Cultures)
                ) && 
                (
                    ExternalIdInfos == other.ExternalIdInfos ||
                    ExternalIdInfos != null &&
                    other.ExternalIdInfos != null &&
                    ExternalIdInfos.SequenceEqual(other.ExternalIdInfos)
                ) && 
                (
                    ParentalRatingOptions == other.ParentalRatingOptions ||
                    ParentalRatingOptions != null &&
                    other.ParentalRatingOptions != null &&
                    ParentalRatingOptions.SequenceEqual(other.ParentalRatingOptions)
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
                    if (ContentType != null)
                    hashCode = hashCode * 59 + ContentType.GetHashCode();
                    if (ContentTypeOptions != null)
                    hashCode = hashCode * 59 + ContentTypeOptions.GetHashCode();
                    if (Countries != null)
                    hashCode = hashCode * 59 + Countries.GetHashCode();
                    if (Cultures != null)
                    hashCode = hashCode * 59 + Cultures.GetHashCode();
                    if (ExternalIdInfos != null)
                    hashCode = hashCode * 59 + ExternalIdInfos.GetHashCode();
                    if (ParentalRatingOptions != null)
                    hashCode = hashCode * 59 + ParentalRatingOptions.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MetadataEditorInfo left, MetadataEditorInfo right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MetadataEditorInfo left, MetadataEditorInfo right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
