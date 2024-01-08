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
    public partial class MusicVideoInfoRemoteSearchQuery : IEquatable<MusicVideoInfoRemoteSearchQuery>
    {
        /// <summary>
        /// Gets or sets a value indicating whether disabled providers should be included.
        /// </summary>
        /// <value>Gets or sets a value indicating whether disabled providers should be included.</value>
        [DataMember(Name="IncludeDisabledProviders", EmitDefaultValue=true)]
        public bool IncludeDisabledProviders { get; set; }

        /// <summary>
        /// Gets or Sets ItemId
        /// </summary>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public Guid ItemId { get; set; }

        /// <summary>
        /// Gets or Sets SearchInfo
        /// </summary>
        [DataMember(Name="SearchInfo", EmitDefaultValue=false)]
        public MusicVideoInfo SearchInfo { get; set; }

        /// <summary>
        /// Will only search within the given provider when set.
        /// </summary>
        /// <value>Will only search within the given provider when set.</value>
        [DataMember(Name="SearchProviderName", EmitDefaultValue=true)]
        public string SearchProviderName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MusicVideoInfoRemoteSearchQuery {\n");
            sb.Append("  IncludeDisabledProviders: ").Append(IncludeDisabledProviders).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  SearchInfo: ").Append(SearchInfo).Append("\n");
            sb.Append("  SearchProviderName: ").Append(SearchProviderName).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MusicVideoInfoRemoteSearchQuery)obj);
        }

        /// <summary>
        /// Returns true if MusicVideoInfoRemoteSearchQuery instances are equal
        /// </summary>
        /// <param name="other">Instance of MusicVideoInfoRemoteSearchQuery to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MusicVideoInfoRemoteSearchQuery other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    IncludeDisabledProviders == other.IncludeDisabledProviders ||
                    
                    IncludeDisabledProviders.Equals(other.IncludeDisabledProviders)
                ) && 
                (
                    ItemId == other.ItemId ||
                    ItemId != null &&
                    ItemId.Equals(other.ItemId)
                ) && 
                (
                    SearchInfo == other.SearchInfo ||
                    SearchInfo != null &&
                    SearchInfo.Equals(other.SearchInfo)
                ) && 
                (
                    SearchProviderName == other.SearchProviderName ||
                    SearchProviderName != null &&
                    SearchProviderName.Equals(other.SearchProviderName)
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
                    
                    hashCode = hashCode * 59 + IncludeDisabledProviders.GetHashCode();
                    if (ItemId != null)
                    hashCode = hashCode * 59 + ItemId.GetHashCode();
                    if (SearchInfo != null)
                    hashCode = hashCode * 59 + SearchInfo.GetHashCode();
                    if (SearchProviderName != null)
                    hashCode = hashCode * 59 + SearchProviderName.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MusicVideoInfoRemoteSearchQuery left, MusicVideoInfoRemoteSearchQuery right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MusicVideoInfoRemoteSearchQuery left, MusicVideoInfoRemoteSearchQuery right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
