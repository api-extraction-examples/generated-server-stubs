/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
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
    /// A map of the user’s profile photo in various sizes, or null if no photo is set. Sizes provided are 21, 27, 36, 60, 128, and 1024. All images are in PNG format, except for 1024 (which is in JPEG format).
    /// </summary>
    [DataContract]
    public partial class UserBaseResponseAllOfPhoto : IEquatable<UserBaseResponseAllOfPhoto>
    {
        /// <summary>
        /// Gets or Sets Image1024x1024
        /// </summary>
        [DataMember(Name="image_1024x1024", EmitDefaultValue=false)]
        public string Image1024x1024 { get; set; }

        /// <summary>
        /// Gets or Sets Image128x128
        /// </summary>
        [DataMember(Name="image_128x128", EmitDefaultValue=false)]
        public string Image128x128 { get; set; }

        /// <summary>
        /// Gets or Sets Image21x21
        /// </summary>
        [DataMember(Name="image_21x21", EmitDefaultValue=false)]
        public string Image21x21 { get; set; }

        /// <summary>
        /// Gets or Sets Image27x27
        /// </summary>
        [DataMember(Name="image_27x27", EmitDefaultValue=false)]
        public string Image27x27 { get; set; }

        /// <summary>
        /// Gets or Sets Image36x36
        /// </summary>
        [DataMember(Name="image_36x36", EmitDefaultValue=false)]
        public string Image36x36 { get; set; }

        /// <summary>
        /// Gets or Sets Image60x60
        /// </summary>
        [DataMember(Name="image_60x60", EmitDefaultValue=false)]
        public string Image60x60 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserBaseResponseAllOfPhoto {\n");
            sb.Append("  Image1024x1024: ").Append(Image1024x1024).Append("\n");
            sb.Append("  Image128x128: ").Append(Image128x128).Append("\n");
            sb.Append("  Image21x21: ").Append(Image21x21).Append("\n");
            sb.Append("  Image27x27: ").Append(Image27x27).Append("\n");
            sb.Append("  Image36x36: ").Append(Image36x36).Append("\n");
            sb.Append("  Image60x60: ").Append(Image60x60).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UserBaseResponseAllOfPhoto)obj);
        }

        /// <summary>
        /// Returns true if UserBaseResponseAllOfPhoto instances are equal
        /// </summary>
        /// <param name="other">Instance of UserBaseResponseAllOfPhoto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserBaseResponseAllOfPhoto other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Image1024x1024 == other.Image1024x1024 ||
                    Image1024x1024 != null &&
                    Image1024x1024.Equals(other.Image1024x1024)
                ) && 
                (
                    Image128x128 == other.Image128x128 ||
                    Image128x128 != null &&
                    Image128x128.Equals(other.Image128x128)
                ) && 
                (
                    Image21x21 == other.Image21x21 ||
                    Image21x21 != null &&
                    Image21x21.Equals(other.Image21x21)
                ) && 
                (
                    Image27x27 == other.Image27x27 ||
                    Image27x27 != null &&
                    Image27x27.Equals(other.Image27x27)
                ) && 
                (
                    Image36x36 == other.Image36x36 ||
                    Image36x36 != null &&
                    Image36x36.Equals(other.Image36x36)
                ) && 
                (
                    Image60x60 == other.Image60x60 ||
                    Image60x60 != null &&
                    Image60x60.Equals(other.Image60x60)
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
                    if (Image1024x1024 != null)
                    hashCode = hashCode * 59 + Image1024x1024.GetHashCode();
                    if (Image128x128 != null)
                    hashCode = hashCode * 59 + Image128x128.GetHashCode();
                    if (Image21x21 != null)
                    hashCode = hashCode * 59 + Image21x21.GetHashCode();
                    if (Image27x27 != null)
                    hashCode = hashCode * 59 + Image27x27.GetHashCode();
                    if (Image36x36 != null)
                    hashCode = hashCode * 59 + Image36x36.GetHashCode();
                    if (Image60x60 != null)
                    hashCode = hashCode * 59 + Image60x60.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UserBaseResponseAllOfPhoto left, UserBaseResponseAllOfPhoto right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserBaseResponseAllOfPhoto left, UserBaseResponseAllOfPhoto right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}