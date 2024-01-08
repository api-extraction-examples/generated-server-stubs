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
    public partial class PersonalisedRadioResponse : IEquatable<PersonalisedRadioResponse>
    {
        /// <summary>
        /// Gets or Sets Schema
        /// </summary>
        [Required]
        [DataMember(Name="$schema", EmitDefaultValue=false)]
        public string Schema { get; set; }

        /// <summary>
        /// Gets or Sets Limit
        /// </summary>
        [Required]
        [DataMember(Name="limit", EmitDefaultValue=true)]
        public int Limit { get; set; }

        /// <summary>
        /// Gets or Sets Method
        /// </summary>
        [Required]
        [DataMember(Name="method", EmitDefaultValue=false)]
        public string Method { get; set; }

        /// <summary>
        /// Gets or Sets Offset
        /// </summary>
        [Required]
        [DataMember(Name="offset", EmitDefaultValue=true)]
        public int Offset { get; set; }

        /// <summary>
        /// Gets or Sets RepliedAt
        /// </summary>
        [Required]
        [DataMember(Name="replied_at", EmitDefaultValue=false)]
        public string RepliedAt { get; set; }

        /// <summary>
        /// Gets or Sets Results
        /// </summary>
        [Required]
        [DataMember(Name="results", EmitDefaultValue=false)]
        public List<PersonalisedRadioActivity> Results { get; set; }

        /// <summary>
        /// Gets or Sets Total
        /// </summary>
        [Required]
        [DataMember(Name="total", EmitDefaultValue=true)]
        public int Total { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PersonalisedRadioResponse {\n");
            sb.Append("  Schema: ").Append(Schema).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  Offset: ").Append(Offset).Append("\n");
            sb.Append("  RepliedAt: ").Append(RepliedAt).Append("\n");
            sb.Append("  Results: ").Append(Results).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PersonalisedRadioResponse)obj);
        }

        /// <summary>
        /// Returns true if PersonalisedRadioResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of PersonalisedRadioResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PersonalisedRadioResponse other)
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
                    Limit == other.Limit ||
                    
                    Limit.Equals(other.Limit)
                ) && 
                (
                    Method == other.Method ||
                    Method != null &&
                    Method.Equals(other.Method)
                ) && 
                (
                    Offset == other.Offset ||
                    
                    Offset.Equals(other.Offset)
                ) && 
                (
                    RepliedAt == other.RepliedAt ||
                    RepliedAt != null &&
                    RepliedAt.Equals(other.RepliedAt)
                ) && 
                (
                    Results == other.Results ||
                    Results != null &&
                    other.Results != null &&
                    Results.SequenceEqual(other.Results)
                ) && 
                (
                    Total == other.Total ||
                    
                    Total.Equals(other.Total)
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
                    
                    hashCode = hashCode * 59 + Limit.GetHashCode();
                    if (Method != null)
                    hashCode = hashCode * 59 + Method.GetHashCode();
                    
                    hashCode = hashCode * 59 + Offset.GetHashCode();
                    if (RepliedAt != null)
                    hashCode = hashCode * 59 + RepliedAt.GetHashCode();
                    if (Results != null)
                    hashCode = hashCode * 59 + Results.GetHashCode();
                    
                    hashCode = hashCode * 59 + Total.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PersonalisedRadioResponse left, PersonalisedRadioResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PersonalisedRadioResponse left, PersonalisedRadioResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
