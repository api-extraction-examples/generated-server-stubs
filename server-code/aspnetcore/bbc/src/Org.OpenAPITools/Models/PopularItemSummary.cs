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
    public partial class PopularItemSummary : IEquatable<PopularItemSummary>
    {
        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [Required]
        [DataMember(Name="data", EmitDefaultValue=false)]
        public ProgrammeSummary Data { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Score
        /// </summary>
        [Required]
        [DataMember(Name="score", EmitDefaultValue=true)]
        public int Score { get; set; }

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
            sb.Append("class PopularItemSummary {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Score: ").Append(Score).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PopularItemSummary)obj);
        }

        /// <summary>
        /// Returns true if PopularItemSummary instances are equal
        /// </summary>
        /// <param name="other">Instance of PopularItemSummary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PopularItemSummary other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Data == other.Data ||
                    Data != null &&
                    Data.Equals(other.Data)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Score == other.Score ||
                    
                    Score.Equals(other.Score)
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
                    if (Data != null)
                    hashCode = hashCode * 59 + Data.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + Score.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PopularItemSummary left, PopularItemSummary right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PopularItemSummary left, PopularItemSummary right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}