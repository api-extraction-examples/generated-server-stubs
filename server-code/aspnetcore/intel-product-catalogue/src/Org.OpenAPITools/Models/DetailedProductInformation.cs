/*
 * Intel Product Catalogue Service
 *
 * This is the documentation for PIM Micro services. In order to use this tool you need to have Basic Auth credentials and a client id. If you dont have one, please make sure to request one by sending an email to the PIM MS team: [pim.360.team@intel.com](mailto:pim.360.team@intel.com?subject=PIMServices)
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: pim.360.team@intel.com
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
    public partial class DetailedProductInformation : IEquatable<DetailedProductInformation>
    {
        /// <summary>
        /// Product info for a locale.
        /// </summary>
        /// <value>Product info for a locale.</value>
        [DataMember(Name="result", EmitDefaultValue=false)]
        public List<DetailedProductInformationResultInner> Result { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        /// <example>success</example>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// Gets or Sets TotalCount
        /// </summary>
        /// <example>10</example>
        [DataMember(Name="total_count", EmitDefaultValue=true)]
        public int TotalCount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DetailedProductInformation {\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  TotalCount: ").Append(TotalCount).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DetailedProductInformation)obj);
        }

        /// <summary>
        /// Returns true if DetailedProductInformation instances are equal
        /// </summary>
        /// <param name="other">Instance of DetailedProductInformation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DetailedProductInformation other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Result == other.Result ||
                    Result != null &&
                    other.Result != null &&
                    Result.SequenceEqual(other.Result)
                ) && 
                (
                    Status == other.Status ||
                    Status != null &&
                    Status.Equals(other.Status)
                ) && 
                (
                    TotalCount == other.TotalCount ||
                    
                    TotalCount.Equals(other.TotalCount)
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
                    if (Result != null)
                    hashCode = hashCode * 59 + Result.GetHashCode();
                    if (Status != null)
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalCount.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DetailedProductInformation left, DetailedProductInformation right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DetailedProductInformation left, DetailedProductInformation right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
