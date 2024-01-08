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
    /// Class PreviousItemRequestDto.
    /// </summary>
    [DataContract]
    public partial class PreviousItemRequestDto : IEquatable<PreviousItemRequestDto>
    {
        /// <summary>
        /// Gets or sets the playing item identifier.
        /// </summary>
        /// <value>Gets or sets the playing item identifier.</value>
        [DataMember(Name="PlaylistItemId", EmitDefaultValue=false)]
        public Guid PlaylistItemId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PreviousItemRequestDto {\n");
            sb.Append("  PlaylistItemId: ").Append(PlaylistItemId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PreviousItemRequestDto)obj);
        }

        /// <summary>
        /// Returns true if PreviousItemRequestDto instances are equal
        /// </summary>
        /// <param name="other">Instance of PreviousItemRequestDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PreviousItemRequestDto other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    PlaylistItemId == other.PlaylistItemId ||
                    PlaylistItemId != null &&
                    PlaylistItemId.Equals(other.PlaylistItemId)
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
                    if (PlaylistItemId != null)
                    hashCode = hashCode * 59 + PlaylistItemId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PreviousItemRequestDto left, PreviousItemRequestDto right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PreviousItemRequestDto left, PreviousItemRequestDto right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
