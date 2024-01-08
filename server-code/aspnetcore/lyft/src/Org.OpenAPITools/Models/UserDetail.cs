/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api-support@lyft.com
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
    public partial class UserDetail : IEquatable<UserDetail>
    {
        /// <summary>
        /// The passenger&#39;s first name
        /// </summary>
        /// <value>The passenger&#39;s first name</value>
        [Required]
        [DataMember(Name="first_name", EmitDefaultValue=false)]
        public string FirstName { get; set; }

        /// <summary>
        /// The passenger&#39;s profile image
        /// </summary>
        /// <value>The passenger&#39;s profile image</value>
        [Required]
        [DataMember(Name="image_url", EmitDefaultValue=false)]
        public string ImageUrl { get; set; }

        /// <summary>
        /// The passenger&#39;s rating
        /// </summary>
        /// <value>The passenger&#39;s rating</value>
        [Required]
        [DataMember(Name="rating", EmitDefaultValue=false)]
        public string Rating { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserDetail {\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  ImageUrl: ").Append(ImageUrl).Append("\n");
            sb.Append("  Rating: ").Append(Rating).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UserDetail)obj);
        }

        /// <summary>
        /// Returns true if UserDetail instances are equal
        /// </summary>
        /// <param name="other">Instance of UserDetail to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserDetail other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    FirstName == other.FirstName ||
                    FirstName != null &&
                    FirstName.Equals(other.FirstName)
                ) && 
                (
                    ImageUrl == other.ImageUrl ||
                    ImageUrl != null &&
                    ImageUrl.Equals(other.ImageUrl)
                ) && 
                (
                    Rating == other.Rating ||
                    Rating != null &&
                    Rating.Equals(other.Rating)
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
                    if (FirstName != null)
                    hashCode = hashCode * 59 + FirstName.GetHashCode();
                    if (ImageUrl != null)
                    hashCode = hashCode * 59 + ImageUrl.GetHashCode();
                    if (Rating != null)
                    hashCode = hashCode * 59 + Rating.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UserDetail left, UserDetail right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserDetail left, UserDetail right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
