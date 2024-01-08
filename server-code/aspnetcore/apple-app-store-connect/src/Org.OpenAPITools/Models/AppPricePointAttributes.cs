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
    public partial class AppPricePointAttributes : IEquatable<AppPricePointAttributes>
    {
        /// <summary>
        /// Gets or Sets CustomerPrice
        /// </summary>
        [DataMember(Name="customerPrice", EmitDefaultValue=false)]
        public string CustomerPrice { get; set; }

        /// <summary>
        /// Gets or Sets Proceeds
        /// </summary>
        [DataMember(Name="proceeds", EmitDefaultValue=false)]
        public string Proceeds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AppPricePointAttributes {\n");
            sb.Append("  CustomerPrice: ").Append(CustomerPrice).Append("\n");
            sb.Append("  Proceeds: ").Append(Proceeds).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AppPricePointAttributes)obj);
        }

        /// <summary>
        /// Returns true if AppPricePointAttributes instances are equal
        /// </summary>
        /// <param name="other">Instance of AppPricePointAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AppPricePointAttributes other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CustomerPrice == other.CustomerPrice ||
                    CustomerPrice != null &&
                    CustomerPrice.Equals(other.CustomerPrice)
                ) && 
                (
                    Proceeds == other.Proceeds ||
                    Proceeds != null &&
                    Proceeds.Equals(other.Proceeds)
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
                    if (CustomerPrice != null)
                    hashCode = hashCode * 59 + CustomerPrice.GetHashCode();
                    if (Proceeds != null)
                    hashCode = hashCode * 59 + Proceeds.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AppPricePointAttributes left, AppPricePointAttributes right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AppPricePointAttributes left, AppPricePointAttributes right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
