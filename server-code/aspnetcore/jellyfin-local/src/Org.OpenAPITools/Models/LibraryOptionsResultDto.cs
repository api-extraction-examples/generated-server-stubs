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
    /// Library options result dto.
    /// </summary>
    [DataContract]
    public partial class LibraryOptionsResultDto : IEquatable<LibraryOptionsResultDto>
    {
        /// <summary>
        /// Gets or sets the metadata readers.
        /// </summary>
        /// <value>Gets or sets the metadata readers.</value>
        [DataMember(Name="MetadataReaders", EmitDefaultValue=true)]
        public List<LibraryOptionInfoDto> MetadataReaders { get; set; }

        /// <summary>
        /// Gets or sets the metadata savers.
        /// </summary>
        /// <value>Gets or sets the metadata savers.</value>
        [DataMember(Name="MetadataSavers", EmitDefaultValue=true)]
        public List<LibraryOptionInfoDto> MetadataSavers { get; set; }

        /// <summary>
        /// Gets or sets the subtitle fetchers.
        /// </summary>
        /// <value>Gets or sets the subtitle fetchers.</value>
        [DataMember(Name="SubtitleFetchers", EmitDefaultValue=true)]
        public List<LibraryOptionInfoDto> SubtitleFetchers { get; set; }

        /// <summary>
        /// Gets or sets the type options.
        /// </summary>
        /// <value>Gets or sets the type options.</value>
        [DataMember(Name="TypeOptions", EmitDefaultValue=true)]
        public List<LibraryTypeOptionsDto> TypeOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibraryOptionsResultDto {\n");
            sb.Append("  MetadataReaders: ").Append(MetadataReaders).Append("\n");
            sb.Append("  MetadataSavers: ").Append(MetadataSavers).Append("\n");
            sb.Append("  SubtitleFetchers: ").Append(SubtitleFetchers).Append("\n");
            sb.Append("  TypeOptions: ").Append(TypeOptions).Append("\n");
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
            return obj.GetType() == GetType() && Equals((LibraryOptionsResultDto)obj);
        }

        /// <summary>
        /// Returns true if LibraryOptionsResultDto instances are equal
        /// </summary>
        /// <param name="other">Instance of LibraryOptionsResultDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryOptionsResultDto other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    MetadataReaders == other.MetadataReaders ||
                    MetadataReaders != null &&
                    other.MetadataReaders != null &&
                    MetadataReaders.SequenceEqual(other.MetadataReaders)
                ) && 
                (
                    MetadataSavers == other.MetadataSavers ||
                    MetadataSavers != null &&
                    other.MetadataSavers != null &&
                    MetadataSavers.SequenceEqual(other.MetadataSavers)
                ) && 
                (
                    SubtitleFetchers == other.SubtitleFetchers ||
                    SubtitleFetchers != null &&
                    other.SubtitleFetchers != null &&
                    SubtitleFetchers.SequenceEqual(other.SubtitleFetchers)
                ) && 
                (
                    TypeOptions == other.TypeOptions ||
                    TypeOptions != null &&
                    other.TypeOptions != null &&
                    TypeOptions.SequenceEqual(other.TypeOptions)
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
                    if (MetadataReaders != null)
                    hashCode = hashCode * 59 + MetadataReaders.GetHashCode();
                    if (MetadataSavers != null)
                    hashCode = hashCode * 59 + MetadataSavers.GetHashCode();
                    if (SubtitleFetchers != null)
                    hashCode = hashCode * 59 + SubtitleFetchers.GetHashCode();
                    if (TypeOptions != null)
                    hashCode = hashCode * 59 + TypeOptions.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(LibraryOptionsResultDto left, LibraryOptionsResultDto right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(LibraryOptionsResultDto left, LibraryOptionsResultDto right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}