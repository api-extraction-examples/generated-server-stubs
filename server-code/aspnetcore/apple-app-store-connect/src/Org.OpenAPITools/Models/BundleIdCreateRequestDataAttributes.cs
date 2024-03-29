/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.4.1
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
    public partial class BundleIdCreateRequestDataAttributes : IEquatable<BundleIdCreateRequestDataAttributes>
    {
        /// <summary>
        /// Gets or Sets Identifier
        /// </summary>
        [Required]
        [DataMember(Name="identifier", EmitDefaultValue=false)]
        public string Identifier { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Platform
        /// </summary>
        [Required]
        [DataMember(Name="platform", EmitDefaultValue=true)]
        public BundleIdPlatform Platform { get; set; }

        /// <summary>
        /// Gets or Sets SeedId
        /// </summary>
        [DataMember(Name="seedId", EmitDefaultValue=false)]
        public string SeedId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BundleIdCreateRequestDataAttributes {\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Platform: ").Append(Platform).Append("\n");
            sb.Append("  SeedId: ").Append(SeedId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BundleIdCreateRequestDataAttributes)obj);
        }

        /// <summary>
        /// Returns true if BundleIdCreateRequestDataAttributes instances are equal
        /// </summary>
        /// <param name="other">Instance of BundleIdCreateRequestDataAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BundleIdCreateRequestDataAttributes other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Identifier == other.Identifier ||
                    Identifier != null &&
                    Identifier.Equals(other.Identifier)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Platform == other.Platform ||
                    
                    Platform.Equals(other.Platform)
                ) && 
                (
                    SeedId == other.SeedId ||
                    SeedId != null &&
                    SeedId.Equals(other.SeedId)
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
                    if (Identifier != null)
                    hashCode = hashCode * 59 + Identifier.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + Platform.GetHashCode();
                    if (SeedId != null)
                    hashCode = hashCode * 59 + SeedId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BundleIdCreateRequestDataAttributes left, BundleIdCreateRequestDataAttributes right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BundleIdCreateRequestDataAttributes left, BundleIdCreateRequestDataAttributes right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
