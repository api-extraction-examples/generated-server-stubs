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
    public partial class MusicPopularityPlaylist : IEquatable<MusicPopularityPlaylist>
    {
        /// <summary>
        /// Gets or Sets Categories
        /// </summary>
        [Required]
        [DataMember(Name="categories", EmitDefaultValue=false)]
        public List<string> Categories { get; set; }

        /// <summary>
        /// Gets or Sets CommentsEnabled
        /// </summary>
        [Required]
        [DataMember(Name="commentsEnabled", EmitDefaultValue=true)]
        public bool CommentsEnabled { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [Required]
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets ExternalPartners
        /// </summary>
        [Required]
        [DataMember(Name="externalPartners", EmitDefaultValue=false)]
        public List<ExternalPartner> ExternalPartners { get; set; }

        /// <summary>
        /// Gets or Sets Genre
        /// </summary>
        [Required]
        [DataMember(Name="genre", EmitDefaultValue=false)]
        public string Genre { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ImagePid
        /// </summary>
        [Required]
        [DataMember(Name="imagePid", EmitDefaultValue=false)]
        public string ImagePid { get; set; }

        /// <summary>
        /// Gets or Sets ImageUrl
        /// </summary>
        [Required]
        [DataMember(Name="imageUrl", EmitDefaultValue=false)]
        public string ImageUrl { get; set; }

        /// <summary>
        /// Gets or Sets Kind
        /// </summary>
        [Required]
        [DataMember(Name="kind", EmitDefaultValue=false)]
        public string Kind { get; set; }

        /// <summary>
        /// Gets or Sets Mood
        /// </summary>
        [Required]
        [DataMember(Name="mood", EmitDefaultValue=false)]
        public string Mood { get; set; }

        /// <summary>
        /// Gets or Sets OneOff
        /// </summary>
        [Required]
        [DataMember(Name="oneOff", EmitDefaultValue=true)]
        public bool OneOff { get; set; }

        /// <summary>
        /// Gets or Sets PlaylistPlaybackType
        /// </summary>
        [Required]
        [DataMember(Name="playlistPlaybackType", EmitDefaultValue=false)]
        public string PlaylistPlaybackType { get; set; }

        /// <summary>
        /// Gets or Sets Score
        /// </summary>
        [Required]
        [DataMember(Name="score", EmitDefaultValue=true)]
        public int Score { get; set; }

        /// <summary>
        /// Gets or Sets ServiceId
        /// </summary>
        [Required]
        [DataMember(Name="serviceId", EmitDefaultValue=false)]
        public string ServiceId { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [Required]
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAt
        /// </summary>
        [Required]
        [DataMember(Name="updatedAt", EmitDefaultValue=false)]
        public string UpdatedAt { get; set; }

        /// <summary>
        /// Gets or Sets Visibility
        /// </summary>
        [Required]
        [DataMember(Name="visibility", EmitDefaultValue=false)]
        public string Visibility { get; set; }

        /// <summary>
        /// Gets or Sets WideImagePid
        /// </summary>
        [Required]
        [DataMember(Name="wideImagePid", EmitDefaultValue=false)]
        public string WideImagePid { get; set; }

        /// <summary>
        /// Gets or Sets WideImageUrl
        /// </summary>
        [Required]
        [DataMember(Name="wideImageUrl", EmitDefaultValue=false)]
        public string WideImageUrl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MusicPopularityPlaylist {\n");
            sb.Append("  Categories: ").Append(Categories).Append("\n");
            sb.Append("  CommentsEnabled: ").Append(CommentsEnabled).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  ExternalPartners: ").Append(ExternalPartners).Append("\n");
            sb.Append("  Genre: ").Append(Genre).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ImagePid: ").Append(ImagePid).Append("\n");
            sb.Append("  ImageUrl: ").Append(ImageUrl).Append("\n");
            sb.Append("  Kind: ").Append(Kind).Append("\n");
            sb.Append("  Mood: ").Append(Mood).Append("\n");
            sb.Append("  OneOff: ").Append(OneOff).Append("\n");
            sb.Append("  PlaylistPlaybackType: ").Append(PlaylistPlaybackType).Append("\n");
            sb.Append("  Score: ").Append(Score).Append("\n");
            sb.Append("  ServiceId: ").Append(ServiceId).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  Visibility: ").Append(Visibility).Append("\n");
            sb.Append("  WideImagePid: ").Append(WideImagePid).Append("\n");
            sb.Append("  WideImageUrl: ").Append(WideImageUrl).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MusicPopularityPlaylist)obj);
        }

        /// <summary>
        /// Returns true if MusicPopularityPlaylist instances are equal
        /// </summary>
        /// <param name="other">Instance of MusicPopularityPlaylist to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MusicPopularityPlaylist other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Categories == other.Categories ||
                    Categories != null &&
                    other.Categories != null &&
                    Categories.SequenceEqual(other.Categories)
                ) && 
                (
                    CommentsEnabled == other.CommentsEnabled ||
                    
                    CommentsEnabled.Equals(other.CommentsEnabled)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    ExternalPartners == other.ExternalPartners ||
                    ExternalPartners != null &&
                    other.ExternalPartners != null &&
                    ExternalPartners.SequenceEqual(other.ExternalPartners)
                ) && 
                (
                    Genre == other.Genre ||
                    Genre != null &&
                    Genre.Equals(other.Genre)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    ImagePid == other.ImagePid ||
                    ImagePid != null &&
                    ImagePid.Equals(other.ImagePid)
                ) && 
                (
                    ImageUrl == other.ImageUrl ||
                    ImageUrl != null &&
                    ImageUrl.Equals(other.ImageUrl)
                ) && 
                (
                    Kind == other.Kind ||
                    Kind != null &&
                    Kind.Equals(other.Kind)
                ) && 
                (
                    Mood == other.Mood ||
                    Mood != null &&
                    Mood.Equals(other.Mood)
                ) && 
                (
                    OneOff == other.OneOff ||
                    
                    OneOff.Equals(other.OneOff)
                ) && 
                (
                    PlaylistPlaybackType == other.PlaylistPlaybackType ||
                    PlaylistPlaybackType != null &&
                    PlaylistPlaybackType.Equals(other.PlaylistPlaybackType)
                ) && 
                (
                    Score == other.Score ||
                    
                    Score.Equals(other.Score)
                ) && 
                (
                    ServiceId == other.ServiceId ||
                    ServiceId != null &&
                    ServiceId.Equals(other.ServiceId)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
                ) && 
                (
                    UpdatedAt == other.UpdatedAt ||
                    UpdatedAt != null &&
                    UpdatedAt.Equals(other.UpdatedAt)
                ) && 
                (
                    Visibility == other.Visibility ||
                    Visibility != null &&
                    Visibility.Equals(other.Visibility)
                ) && 
                (
                    WideImagePid == other.WideImagePid ||
                    WideImagePid != null &&
                    WideImagePid.Equals(other.WideImagePid)
                ) && 
                (
                    WideImageUrl == other.WideImageUrl ||
                    WideImageUrl != null &&
                    WideImageUrl.Equals(other.WideImageUrl)
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
                    if (Categories != null)
                    hashCode = hashCode * 59 + Categories.GetHashCode();
                    
                    hashCode = hashCode * 59 + CommentsEnabled.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (ExternalPartners != null)
                    hashCode = hashCode * 59 + ExternalPartners.GetHashCode();
                    if (Genre != null)
                    hashCode = hashCode * 59 + Genre.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (ImagePid != null)
                    hashCode = hashCode * 59 + ImagePid.GetHashCode();
                    if (ImageUrl != null)
                    hashCode = hashCode * 59 + ImageUrl.GetHashCode();
                    if (Kind != null)
                    hashCode = hashCode * 59 + Kind.GetHashCode();
                    if (Mood != null)
                    hashCode = hashCode * 59 + Mood.GetHashCode();
                    
                    hashCode = hashCode * 59 + OneOff.GetHashCode();
                    if (PlaylistPlaybackType != null)
                    hashCode = hashCode * 59 + PlaylistPlaybackType.GetHashCode();
                    
                    hashCode = hashCode * 59 + Score.GetHashCode();
                    if (ServiceId != null)
                    hashCode = hashCode * 59 + ServiceId.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                    if (UpdatedAt != null)
                    hashCode = hashCode * 59 + UpdatedAt.GetHashCode();
                    if (Visibility != null)
                    hashCode = hashCode * 59 + Visibility.GetHashCode();
                    if (WideImagePid != null)
                    hashCode = hashCode * 59 + WideImagePid.GetHashCode();
                    if (WideImageUrl != null)
                    hashCode = hashCode * 59 + WideImageUrl.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MusicPopularityPlaylist left, MusicPopularityPlaylist right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MusicPopularityPlaylist left, MusicPopularityPlaylist right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}