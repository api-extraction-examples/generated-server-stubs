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
    public partial class ProgrammeTitles : IEquatable<ProgrammeTitles>
    {
        /// <summary>
        /// Gets or Sets DisplayTitle
        /// </summary>
        [DataMember(Name="display_title", EmitDefaultValue=false)]
        public string DisplayTitle { get; set; }

        /// <summary>
        /// Gets or Sets EntityTitle
        /// </summary>
        [DataMember(Name="entity_title", EmitDefaultValue=false)]
        public string EntityTitle { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryTitle
        /// </summary>
        [DataMember(Name="primary_title", EmitDefaultValue=false)]
        public string PrimaryTitle { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryTitle
        /// </summary>
        [DataMember(Name="secondary_title", EmitDefaultValue=false)]
        public string SecondaryTitle { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProgrammeTitles {\n");
            sb.Append("  DisplayTitle: ").Append(DisplayTitle).Append("\n");
            sb.Append("  EntityTitle: ").Append(EntityTitle).Append("\n");
            sb.Append("  PrimaryTitle: ").Append(PrimaryTitle).Append("\n");
            sb.Append("  SecondaryTitle: ").Append(SecondaryTitle).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ProgrammeTitles)obj);
        }

        /// <summary>
        /// Returns true if ProgrammeTitles instances are equal
        /// </summary>
        /// <param name="other">Instance of ProgrammeTitles to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProgrammeTitles other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DisplayTitle == other.DisplayTitle ||
                    DisplayTitle != null &&
                    DisplayTitle.Equals(other.DisplayTitle)
                ) && 
                (
                    EntityTitle == other.EntityTitle ||
                    EntityTitle != null &&
                    EntityTitle.Equals(other.EntityTitle)
                ) && 
                (
                    PrimaryTitle == other.PrimaryTitle ||
                    PrimaryTitle != null &&
                    PrimaryTitle.Equals(other.PrimaryTitle)
                ) && 
                (
                    SecondaryTitle == other.SecondaryTitle ||
                    SecondaryTitle != null &&
                    SecondaryTitle.Equals(other.SecondaryTitle)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
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
                    if (DisplayTitle != null)
                    hashCode = hashCode * 59 + DisplayTitle.GetHashCode();
                    if (EntityTitle != null)
                    hashCode = hashCode * 59 + EntityTitle.GetHashCode();
                    if (PrimaryTitle != null)
                    hashCode = hashCode * 59 + PrimaryTitle.GetHashCode();
                    if (SecondaryTitle != null)
                    hashCode = hashCode * 59 + SecondaryTitle.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ProgrammeTitles left, ProgrammeTitles right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProgrammeTitles left, ProgrammeTitles right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}