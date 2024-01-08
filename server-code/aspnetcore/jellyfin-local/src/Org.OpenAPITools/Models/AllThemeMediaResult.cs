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
    public partial class AllThemeMediaResult : IEquatable<AllThemeMediaResult>
    {
        /// <summary>
        /// Gets or Sets SoundtrackSongsResult
        /// </summary>
        [DataMember(Name="SoundtrackSongsResult", EmitDefaultValue=false)]
        public ThemeMediaResult SoundtrackSongsResult { get; set; }

        /// <summary>
        /// Gets or Sets ThemeSongsResult
        /// </summary>
        [DataMember(Name="ThemeSongsResult", EmitDefaultValue=false)]
        public ThemeMediaResult ThemeSongsResult { get; set; }

        /// <summary>
        /// Gets or Sets ThemeVideosResult
        /// </summary>
        [DataMember(Name="ThemeVideosResult", EmitDefaultValue=false)]
        public ThemeMediaResult ThemeVideosResult { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AllThemeMediaResult {\n");
            sb.Append("  SoundtrackSongsResult: ").Append(SoundtrackSongsResult).Append("\n");
            sb.Append("  ThemeSongsResult: ").Append(ThemeSongsResult).Append("\n");
            sb.Append("  ThemeVideosResult: ").Append(ThemeVideosResult).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AllThemeMediaResult)obj);
        }

        /// <summary>
        /// Returns true if AllThemeMediaResult instances are equal
        /// </summary>
        /// <param name="other">Instance of AllThemeMediaResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AllThemeMediaResult other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    SoundtrackSongsResult == other.SoundtrackSongsResult ||
                    SoundtrackSongsResult != null &&
                    SoundtrackSongsResult.Equals(other.SoundtrackSongsResult)
                ) && 
                (
                    ThemeSongsResult == other.ThemeSongsResult ||
                    ThemeSongsResult != null &&
                    ThemeSongsResult.Equals(other.ThemeSongsResult)
                ) && 
                (
                    ThemeVideosResult == other.ThemeVideosResult ||
                    ThemeVideosResult != null &&
                    ThemeVideosResult.Equals(other.ThemeVideosResult)
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
                    if (SoundtrackSongsResult != null)
                    hashCode = hashCode * 59 + SoundtrackSongsResult.GetHashCode();
                    if (ThemeSongsResult != null)
                    hashCode = hashCode * 59 + ThemeSongsResult.GetHashCode();
                    if (ThemeVideosResult != null)
                    hashCode = hashCode * 59 + ThemeVideosResult.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AllThemeMediaResult left, AllThemeMediaResult right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AllThemeMediaResult left, AllThemeMediaResult right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
