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
    public partial class UserCounts : IEquatable<UserCounts>
    {
        /// <summary>
        /// Number of followers of this user
        /// </summary>
        /// <value>Number of followers of this user</value>
        [DataMember(Name="followed_by", EmitDefaultValue=true)]
        public int FollowedBy { get; set; }

        /// <summary>
        /// Number of users followed by this user
        /// </summary>
        /// <value>Number of users followed by this user</value>
        [DataMember(Name="follows", EmitDefaultValue=true)]
        public int Follows { get; set; }

        /// <summary>
        /// Number of user media
        /// </summary>
        /// <value>Number of user media</value>
        [DataMember(Name="media", EmitDefaultValue=true)]
        public int Media { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserCounts {\n");
            sb.Append("  FollowedBy: ").Append(FollowedBy).Append("\n");
            sb.Append("  Follows: ").Append(Follows).Append("\n");
            sb.Append("  Media: ").Append(Media).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UserCounts)obj);
        }

        /// <summary>
        /// Returns true if UserCounts instances are equal
        /// </summary>
        /// <param name="other">Instance of UserCounts to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserCounts other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    FollowedBy == other.FollowedBy ||
                    
                    FollowedBy.Equals(other.FollowedBy)
                ) && 
                (
                    Follows == other.Follows ||
                    
                    Follows.Equals(other.Follows)
                ) && 
                (
                    Media == other.Media ||
                    
                    Media.Equals(other.Media)
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
                    
                    hashCode = hashCode * 59 + FollowedBy.GetHashCode();
                    
                    hashCode = hashCode * 59 + Follows.GetHashCode();
                    
                    hashCode = hashCode * 59 + Media.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UserCounts left, UserCounts right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserCounts left, UserCounts right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
