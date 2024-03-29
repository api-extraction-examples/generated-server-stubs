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
    public partial class PersonalisedRadioSuccessResponse : IEquatable<PersonalisedRadioSuccessResponse>
    {
        /// <summary>
        /// Gets or Sets Schema
        /// </summary>
        [Required]
        [DataMember(Name="$schema", EmitDefaultValue=false)]
        public string Schema { get; set; }

        /// <summary>
        /// Gets or Sets Method
        /// </summary>
        [Required]
        [DataMember(Name="method", EmitDefaultValue=false)]
        public string Method { get; set; }

        /// <summary>
        /// Gets or Sets RepliedAt
        /// </summary>
        [Required]
        [DataMember(Name="replied_at", EmitDefaultValue=false)]
        public string RepliedAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PersonalisedRadioSuccessResponse {\n");
            sb.Append("  Schema: ").Append(Schema).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  RepliedAt: ").Append(RepliedAt).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PersonalisedRadioSuccessResponse)obj);
        }

        /// <summary>
        /// Returns true if PersonalisedRadioSuccessResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of PersonalisedRadioSuccessResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PersonalisedRadioSuccessResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Schema == other.Schema ||
                    Schema != null &&
                    Schema.Equals(other.Schema)
                ) && 
                (
                    Method == other.Method ||
                    Method != null &&
                    Method.Equals(other.Method)
                ) && 
                (
                    RepliedAt == other.RepliedAt ||
                    RepliedAt != null &&
                    RepliedAt.Equals(other.RepliedAt)
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
                    if (Schema != null)
                    hashCode = hashCode * 59 + Schema.GetHashCode();
                    if (Method != null)
                    hashCode = hashCode * 59 + Method.GetHashCode();
                    if (RepliedAt != null)
                    hashCode = hashCode * 59 + RepliedAt.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PersonalisedRadioSuccessResponse left, PersonalisedRadioSuccessResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PersonalisedRadioSuccessResponse left, PersonalisedRadioSuccessResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
