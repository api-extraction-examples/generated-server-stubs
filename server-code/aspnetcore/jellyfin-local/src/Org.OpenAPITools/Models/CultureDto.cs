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
    /// Class CultureDto.
    /// </summary>
    [DataContract]
    public partial class CultureDto : IEquatable<CultureDto>
    {
        /// <summary>
        /// Gets or sets the display name.
        /// </summary>
        /// <value>Gets or sets the display name.</value>
        [DataMember(Name="DisplayName", EmitDefaultValue=true)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or sets the name.
        /// </summary>
        /// <value>Gets or sets the name.</value>
        [DataMember(Name="Name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the name of the three letter ISO language.
        /// </summary>
        /// <value>Gets or sets the name of the three letter ISO language.</value>
        [DataMember(Name="ThreeLetterISOLanguageName", EmitDefaultValue=true)]
        public string ThreeLetterISOLanguageName { get; set; }

        /// <summary>
        /// Gets or Sets ThreeLetterISOLanguageNames
        /// </summary>
        [DataMember(Name="ThreeLetterISOLanguageNames", EmitDefaultValue=true)]
        public List<string> ThreeLetterISOLanguageNames { get; set; }

        /// <summary>
        /// Gets or sets the name of the two letter ISO language.
        /// </summary>
        /// <value>Gets or sets the name of the two letter ISO language.</value>
        [DataMember(Name="TwoLetterISOLanguageName", EmitDefaultValue=true)]
        public string TwoLetterISOLanguageName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CultureDto {\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ThreeLetterISOLanguageName: ").Append(ThreeLetterISOLanguageName).Append("\n");
            sb.Append("  ThreeLetterISOLanguageNames: ").Append(ThreeLetterISOLanguageNames).Append("\n");
            sb.Append("  TwoLetterISOLanguageName: ").Append(TwoLetterISOLanguageName).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CultureDto)obj);
        }

        /// <summary>
        /// Returns true if CultureDto instances are equal
        /// </summary>
        /// <param name="other">Instance of CultureDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CultureDto other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DisplayName == other.DisplayName ||
                    DisplayName != null &&
                    DisplayName.Equals(other.DisplayName)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    ThreeLetterISOLanguageName == other.ThreeLetterISOLanguageName ||
                    ThreeLetterISOLanguageName != null &&
                    ThreeLetterISOLanguageName.Equals(other.ThreeLetterISOLanguageName)
                ) && 
                (
                    ThreeLetterISOLanguageNames == other.ThreeLetterISOLanguageNames ||
                    ThreeLetterISOLanguageNames != null &&
                    other.ThreeLetterISOLanguageNames != null &&
                    ThreeLetterISOLanguageNames.SequenceEqual(other.ThreeLetterISOLanguageNames)
                ) && 
                (
                    TwoLetterISOLanguageName == other.TwoLetterISOLanguageName ||
                    TwoLetterISOLanguageName != null &&
                    TwoLetterISOLanguageName.Equals(other.TwoLetterISOLanguageName)
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
                    if (DisplayName != null)
                    hashCode = hashCode * 59 + DisplayName.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (ThreeLetterISOLanguageName != null)
                    hashCode = hashCode * 59 + ThreeLetterISOLanguageName.GetHashCode();
                    if (ThreeLetterISOLanguageNames != null)
                    hashCode = hashCode * 59 + ThreeLetterISOLanguageNames.GetHashCode();
                    if (TwoLetterISOLanguageName != null)
                    hashCode = hashCode * 59 + TwoLetterISOLanguageName.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CultureDto left, CultureDto right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CultureDto left, CultureDto right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}