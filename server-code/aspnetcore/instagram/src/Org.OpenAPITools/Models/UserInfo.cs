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
    public partial class UserInfo : IEquatable<UserInfo>
    {
        /// <summary>
        /// User biography
        /// </summary>
        /// <value>User biography</value>
        [DataMember(Name="bio", EmitDefaultValue=false)]
        public string Bio { get; set; }

        /// <summary>
        /// Gets or Sets Counts
        /// </summary>
        [DataMember(Name="counts", EmitDefaultValue=false)]
        public UserCounts Counts { get; set; }

        /// <summary>
        /// User full name
        /// </summary>
        /// <value>User full name</value>
        [DataMember(Name="full_name", EmitDefaultValue=false)]
        public string FullName { get; set; }

        /// <summary>
        /// User ID
        /// </summary>
        /// <value>User ID</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// URL to user profile picture
        /// </summary>
        /// <value>URL to user profile picture</value>
        [DataMember(Name="profile_picture", EmitDefaultValue=false)]
        public string ProfilePicture { get; set; }

        /// <summary>
        /// User name, nickname
        /// </summary>
        /// <value>User name, nickname</value>
        [DataMember(Name="username", EmitDefaultValue=false)]
        public string Username { get; set; }

        /// <summary>
        /// URL to user web-site
        /// </summary>
        /// <value>URL to user web-site</value>
        [DataMember(Name="website", EmitDefaultValue=false)]
        public string Website { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserInfo {\n");
            sb.Append("  Bio: ").Append(Bio).Append("\n");
            sb.Append("  Counts: ").Append(Counts).Append("\n");
            sb.Append("  FullName: ").Append(FullName).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ProfilePicture: ").Append(ProfilePicture).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("  Website: ").Append(Website).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UserInfo)obj);
        }

        /// <summary>
        /// Returns true if UserInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of UserInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserInfo other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Bio == other.Bio ||
                    Bio != null &&
                    Bio.Equals(other.Bio)
                ) && 
                (
                    Counts == other.Counts ||
                    Counts != null &&
                    Counts.Equals(other.Counts)
                ) && 
                (
                    FullName == other.FullName ||
                    FullName != null &&
                    FullName.Equals(other.FullName)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    ProfilePicture == other.ProfilePicture ||
                    ProfilePicture != null &&
                    ProfilePicture.Equals(other.ProfilePicture)
                ) && 
                (
                    Username == other.Username ||
                    Username != null &&
                    Username.Equals(other.Username)
                ) && 
                (
                    Website == other.Website ||
                    Website != null &&
                    Website.Equals(other.Website)
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
                    if (Bio != null)
                    hashCode = hashCode * 59 + Bio.GetHashCode();
                    if (Counts != null)
                    hashCode = hashCode * 59 + Counts.GetHashCode();
                    if (FullName != null)
                    hashCode = hashCode * 59 + FullName.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (ProfilePicture != null)
                    hashCode = hashCode * 59 + ProfilePicture.GetHashCode();
                    if (Username != null)
                    hashCode = hashCode * 59 + Username.GetHashCode();
                    if (Website != null)
                    hashCode = hashCode * 59 + Website.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UserInfo left, UserInfo right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserInfo left, UserInfo right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
