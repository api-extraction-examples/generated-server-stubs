/*
 * Instagram API
 *
 * Description of Instagram RESTful API.  Current limitations:   * Instagram service does not support [cross origin headers](https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS)   for security reasons, therefore it is not possible to use Swagger UI and make API calls directly from browser.   * Modification API requests (`POST`, `DELETE`) require additional security [scopes](https://instagram.com/developer/authorization/)   that are available for Apps [created on or after Nov 17, 2015](http://instagram.com/developer/review/) and   started in [Sandbox Mode](http://instagram.com/developer/sandbox/).   * Consider the [Instagram limitations](https://instagram.com/developer/limits/) for API calls that depends on App Mode.  **Warning:** For Apps [created on or after Nov 17, 2015](http://instagram.com/developer/changelog/) API responses containing media objects no longer return the `data` field in `comments` and `likes` nodes.  Last update: 2015-11-28 
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
    public partial class MediaEntry : IEquatable<MediaEntry>
    {
        /// <summary>
        /// ??? Unknown ???
        /// </summary>
        /// <value>??? Unknown ???</value>
        [DataMember(Name="attribution", EmitDefaultValue=false)]
        public string Attribution { get; set; }

        /// <summary>
        /// Gets or Sets Caption
        /// </summary>
        [DataMember(Name="caption", EmitDefaultValue=false)]
        public CaptionData Caption { get; set; }

        /// <summary>
        /// Gets or Sets Comments
        /// </summary>
        [DataMember(Name="comments", EmitDefaultValue=false)]
        public CommentsCollection Comments { get; set; }

        /// <summary>
        /// Media creation UNIX timestamp
        /// </summary>
        /// <value>Media creation UNIX timestamp</value>
        [DataMember(Name="created_time", EmitDefaultValue=false)]
        public string CreatedTime { get; set; }

        /// <summary>
        /// Filter of this media entry
        /// </summary>
        /// <value>Filter of this media entry</value>
        [DataMember(Name="filter", EmitDefaultValue=false)]
        public string Filter { get; set; }

        /// <summary>
        /// ID of a media entry
        /// </summary>
        /// <value>ID of a media entry</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Images
        /// </summary>
        [DataMember(Name="images", EmitDefaultValue=false)]
        public ImagesData Images { get; set; }

        /// <summary>
        /// Gets or Sets Likes
        /// </summary>
        [DataMember(Name="likes", EmitDefaultValue=false)]
        public LikesCollection Likes { get; set; }

        /// <summary>
        /// Fixed URL of this media entry
        /// </summary>
        /// <value>Fixed URL of this media entry</value>
        [DataMember(Name="link", EmitDefaultValue=false)]
        public string Link { get; set; }

        /// <summary>
        /// Gets or Sets Location
        /// </summary>
        [DataMember(Name="location", EmitDefaultValue=false)]
        public LocationInfo Location { get; set; }

        /// <summary>
        /// List of tags assigned to this media
        /// </summary>
        /// <value>List of tags assigned to this media</value>
        [DataMember(Name="tags", EmitDefaultValue=false)]
        public List<string> Tags { get; set; }


        /// <summary>
        /// Type of this media entry
        /// </summary>
        /// <value>Type of this media entry</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum ImageEnum for image
            /// </summary>
            [EnumMember(Value = "image")]
            ImageEnum = 1,
            
            /// <summary>
            /// Enum VideoEnum for video
            /// </summary>
            [EnumMember(Value = "video")]
            VideoEnum = 2
        }

        /// <summary>
        /// Type of this media entry
        /// </summary>
        /// <value>Type of this media entry</value>
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name="user", EmitDefaultValue=false)]
        public UserShortInfo User { get; set; }

        /// <summary>
        /// Indicates whether authenticated user has liked this media or not
        /// </summary>
        /// <value>Indicates whether authenticated user has liked this media or not</value>
        [DataMember(Name="user_has_liked", EmitDefaultValue=true)]
        public bool UserHasLiked { get; set; }

        /// <summary>
        /// Users located on this media entry
        /// </summary>
        /// <value>Users located on this media entry</value>
        [DataMember(Name="users_in_photo", EmitDefaultValue=false)]
        public List<UserInPhoto> UsersInPhoto { get; set; }

        /// <summary>
        /// Gets or Sets Videos
        /// </summary>
        [DataMember(Name="videos", EmitDefaultValue=false)]
        public VideosData Videos { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaEntry {\n");
            sb.Append("  Attribution: ").Append(Attribution).Append("\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  Comments: ").Append(Comments).Append("\n");
            sb.Append("  CreatedTime: ").Append(CreatedTime).Append("\n");
            sb.Append("  Filter: ").Append(Filter).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Images: ").Append(Images).Append("\n");
            sb.Append("  Likes: ").Append(Likes).Append("\n");
            sb.Append("  Link: ").Append(Link).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  UserHasLiked: ").Append(UserHasLiked).Append("\n");
            sb.Append("  UsersInPhoto: ").Append(UsersInPhoto).Append("\n");
            sb.Append("  Videos: ").Append(Videos).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MediaEntry)obj);
        }

        /// <summary>
        /// Returns true if MediaEntry instances are equal
        /// </summary>
        /// <param name="other">Instance of MediaEntry to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaEntry other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Attribution == other.Attribution ||
                    Attribution != null &&
                    Attribution.Equals(other.Attribution)
                ) && 
                (
                    Caption == other.Caption ||
                    Caption != null &&
                    Caption.Equals(other.Caption)
                ) && 
                (
                    Comments == other.Comments ||
                    Comments != null &&
                    Comments.Equals(other.Comments)
                ) && 
                (
                    CreatedTime == other.CreatedTime ||
                    CreatedTime != null &&
                    CreatedTime.Equals(other.CreatedTime)
                ) && 
                (
                    Filter == other.Filter ||
                    Filter != null &&
                    Filter.Equals(other.Filter)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Images == other.Images ||
                    Images != null &&
                    Images.Equals(other.Images)
                ) && 
                (
                    Likes == other.Likes ||
                    Likes != null &&
                    Likes.Equals(other.Likes)
                ) && 
                (
                    Link == other.Link ||
                    Link != null &&
                    Link.Equals(other.Link)
                ) && 
                (
                    Location == other.Location ||
                    Location != null &&
                    Location.Equals(other.Location)
                ) && 
                (
                    Tags == other.Tags ||
                    Tags != null &&
                    other.Tags != null &&
                    Tags.SequenceEqual(other.Tags)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    User == other.User ||
                    User != null &&
                    User.Equals(other.User)
                ) && 
                (
                    UserHasLiked == other.UserHasLiked ||
                    
                    UserHasLiked.Equals(other.UserHasLiked)
                ) && 
                (
                    UsersInPhoto == other.UsersInPhoto ||
                    UsersInPhoto != null &&
                    other.UsersInPhoto != null &&
                    UsersInPhoto.SequenceEqual(other.UsersInPhoto)
                ) && 
                (
                    Videos == other.Videos ||
                    Videos != null &&
                    Videos.Equals(other.Videos)
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
                    if (Attribution != null)
                    hashCode = hashCode * 59 + Attribution.GetHashCode();
                    if (Caption != null)
                    hashCode = hashCode * 59 + Caption.GetHashCode();
                    if (Comments != null)
                    hashCode = hashCode * 59 + Comments.GetHashCode();
                    if (CreatedTime != null)
                    hashCode = hashCode * 59 + CreatedTime.GetHashCode();
                    if (Filter != null)
                    hashCode = hashCode * 59 + Filter.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Images != null)
                    hashCode = hashCode * 59 + Images.GetHashCode();
                    if (Likes != null)
                    hashCode = hashCode * 59 + Likes.GetHashCode();
                    if (Link != null)
                    hashCode = hashCode * 59 + Link.GetHashCode();
                    if (Location != null)
                    hashCode = hashCode * 59 + Location.GetHashCode();
                    if (Tags != null)
                    hashCode = hashCode * 59 + Tags.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (User != null)
                    hashCode = hashCode * 59 + User.GetHashCode();
                    
                    hashCode = hashCode * 59 + UserHasLiked.GetHashCode();
                    if (UsersInPhoto != null)
                    hashCode = hashCode * 59 + UsersInPhoto.GetHashCode();
                    if (Videos != null)
                    hashCode = hashCode * 59 + Videos.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MediaEntry left, MediaEntry right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MediaEntry left, MediaEntry right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
