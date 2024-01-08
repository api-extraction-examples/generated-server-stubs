/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: nishu@mediumapi.com
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
    public partial class UserUserIdFollowersGet200Response : IEquatable<UserUserIdFollowersGet200Response>
    {
        /// <summary>
        /// Gets or Sets Followers
        /// </summary>
        [DataMember(Name="followers", EmitDefaultValue=false)]
        public List<string> Followers { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        /// <example>14d5c41e0264</example>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserUserIdFollowersGet200Response {\n");
            sb.Append("  Followers: ").Append(Followers).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UserUserIdFollowersGet200Response)obj);
        }

        /// <summary>
        /// Returns true if UserUserIdFollowersGet200Response instances are equal
        /// </summary>
        /// <param name="other">Instance of UserUserIdFollowersGet200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserUserIdFollowersGet200Response other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Followers == other.Followers ||
                    Followers != null &&
                    other.Followers != null &&
                    Followers.SequenceEqual(other.Followers)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
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
                    if (Followers != null)
                    hashCode = hashCode * 59 + Followers.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UserUserIdFollowersGet200Response left, UserUserIdFollowersGet200Response right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserUserIdFollowersGet200Response left, UserUserIdFollowersGet200Response right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
