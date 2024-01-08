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
    public partial class ChannelFeatures : IEquatable<ChannelFeatures>
    {
        /// <summary>
        /// Gets or sets the automatic refresh levels.
        /// </summary>
        /// <value>Gets or sets the automatic refresh levels.</value>
        [DataMember(Name="AutoRefreshLevels", EmitDefaultValue=true)]
        public int? AutoRefreshLevels { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether this instance can filter.
        /// </summary>
        /// <value>Gets or sets a value indicating whether this instance can filter.</value>
        [DataMember(Name="CanFilter", EmitDefaultValue=true)]
        public bool CanFilter { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether this instance can search.
        /// </summary>
        /// <value>Gets or sets a value indicating whether this instance can search.</value>
        [DataMember(Name="CanSearch", EmitDefaultValue=true)]
        public bool CanSearch { get; set; }

        /// <summary>
        /// Gets or sets the content types.
        /// </summary>
        /// <value>Gets or sets the content types.</value>
        [DataMember(Name="ContentTypes", EmitDefaultValue=true)]
        public List<ChannelMediaContentType> ContentTypes { get; set; }

        /// <summary>
        /// Gets or sets the default sort orders.
        /// </summary>
        /// <value>Gets or sets the default sort orders.</value>
        [DataMember(Name="DefaultSortFields", EmitDefaultValue=true)]
        public List<ChannelItemSortField> DefaultSortFields { get; set; }

        /// <summary>
        /// Gets or sets the identifier.
        /// </summary>
        /// <value>Gets or sets the identifier.</value>
        [DataMember(Name="Id", EmitDefaultValue=true)]
        public string Id { get; set; }

        /// <summary>
        /// Represents the maximum number of records the channel allows retrieving at a time.
        /// </summary>
        /// <value>Represents the maximum number of records the channel allows retrieving at a time.</value>
        [DataMember(Name="MaxPageSize", EmitDefaultValue=true)]
        public int? MaxPageSize { get; set; }

        /// <summary>
        /// Gets or sets the media types.
        /// </summary>
        /// <value>Gets or sets the media types.</value>
        [DataMember(Name="MediaTypes", EmitDefaultValue=true)]
        public List<ChannelMediaType> MediaTypes { get; set; }

        /// <summary>
        /// Gets or sets the name.
        /// </summary>
        /// <value>Gets or sets the name.</value>
        [DataMember(Name="Name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether [supports content downloading].
        /// </summary>
        /// <value>Gets or sets a value indicating whether [supports content downloading].</value>
        [DataMember(Name="SupportsContentDownloading", EmitDefaultValue=true)]
        public bool SupportsContentDownloading { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether [supports latest media].
        /// </summary>
        /// <value>Gets or sets a value indicating whether [supports latest media].</value>
        [DataMember(Name="SupportsLatestMedia", EmitDefaultValue=true)]
        public bool SupportsLatestMedia { get; set; }

        /// <summary>
        /// Indicates if a sort ascending/descending toggle is supported or not.
        /// </summary>
        /// <value>Indicates if a sort ascending/descending toggle is supported or not.</value>
        [DataMember(Name="SupportsSortOrderToggle", EmitDefaultValue=true)]
        public bool SupportsSortOrderToggle { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ChannelFeatures {\n");
            sb.Append("  AutoRefreshLevels: ").Append(AutoRefreshLevels).Append("\n");
            sb.Append("  CanFilter: ").Append(CanFilter).Append("\n");
            sb.Append("  CanSearch: ").Append(CanSearch).Append("\n");
            sb.Append("  ContentTypes: ").Append(ContentTypes).Append("\n");
            sb.Append("  DefaultSortFields: ").Append(DefaultSortFields).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  MaxPageSize: ").Append(MaxPageSize).Append("\n");
            sb.Append("  MediaTypes: ").Append(MediaTypes).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  SupportsContentDownloading: ").Append(SupportsContentDownloading).Append("\n");
            sb.Append("  SupportsLatestMedia: ").Append(SupportsLatestMedia).Append("\n");
            sb.Append("  SupportsSortOrderToggle: ").Append(SupportsSortOrderToggle).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ChannelFeatures)obj);
        }

        /// <summary>
        /// Returns true if ChannelFeatures instances are equal
        /// </summary>
        /// <param name="other">Instance of ChannelFeatures to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ChannelFeatures other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AutoRefreshLevels == other.AutoRefreshLevels ||
                    AutoRefreshLevels != null &&
                    AutoRefreshLevels.Equals(other.AutoRefreshLevels)
                ) && 
                (
                    CanFilter == other.CanFilter ||
                    
                    CanFilter.Equals(other.CanFilter)
                ) && 
                (
                    CanSearch == other.CanSearch ||
                    
                    CanSearch.Equals(other.CanSearch)
                ) && 
                (
                    ContentTypes == other.ContentTypes ||
                    ContentTypes != null &&
                    other.ContentTypes != null &&
                    ContentTypes.SequenceEqual(other.ContentTypes)
                ) && 
                (
                    DefaultSortFields == other.DefaultSortFields ||
                    DefaultSortFields != null &&
                    other.DefaultSortFields != null &&
                    DefaultSortFields.SequenceEqual(other.DefaultSortFields)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    MaxPageSize == other.MaxPageSize ||
                    MaxPageSize != null &&
                    MaxPageSize.Equals(other.MaxPageSize)
                ) && 
                (
                    MediaTypes == other.MediaTypes ||
                    MediaTypes != null &&
                    other.MediaTypes != null &&
                    MediaTypes.SequenceEqual(other.MediaTypes)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    SupportsContentDownloading == other.SupportsContentDownloading ||
                    
                    SupportsContentDownloading.Equals(other.SupportsContentDownloading)
                ) && 
                (
                    SupportsLatestMedia == other.SupportsLatestMedia ||
                    
                    SupportsLatestMedia.Equals(other.SupportsLatestMedia)
                ) && 
                (
                    SupportsSortOrderToggle == other.SupportsSortOrderToggle ||
                    
                    SupportsSortOrderToggle.Equals(other.SupportsSortOrderToggle)
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
                    if (AutoRefreshLevels != null)
                    hashCode = hashCode * 59 + AutoRefreshLevels.GetHashCode();
                    
                    hashCode = hashCode * 59 + CanFilter.GetHashCode();
                    
                    hashCode = hashCode * 59 + CanSearch.GetHashCode();
                    if (ContentTypes != null)
                    hashCode = hashCode * 59 + ContentTypes.GetHashCode();
                    if (DefaultSortFields != null)
                    hashCode = hashCode * 59 + DefaultSortFields.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (MaxPageSize != null)
                    hashCode = hashCode * 59 + MaxPageSize.GetHashCode();
                    if (MediaTypes != null)
                    hashCode = hashCode * 59 + MediaTypes.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + SupportsContentDownloading.GetHashCode();
                    
                    hashCode = hashCode * 59 + SupportsLatestMedia.GetHashCode();
                    
                    hashCode = hashCode * 59 + SupportsSortOrderToggle.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ChannelFeatures left, ChannelFeatures right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ChannelFeatures left, ChannelFeatures right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}