/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * The version of the OpenAPI document: 1.16.0
 * Contact: apisupport@mastercard.com
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
    public partial class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress : IEquatable<PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress>
    {
        /// <summary>
        /// Gets or Sets BuildingNumber
        /// </summary>
        /// <example>15</example>
        [StringLength(256, MinimumLength=1)]
        [DataMember(Name="buildingNumber", EmitDefaultValue=false)]
        public string BuildingNumber { get; set; }

        /// <summary>
        /// Gets or Sets City
        /// </summary>
        /// <example>City</example>
        [StringLength(256, MinimumLength=1)]
        [DataMember(Name="city", EmitDefaultValue=false)]
        public string City { get; set; }

        /// <summary>
        /// ISO 3166 ALPHA2 country code
        /// </summary>
        /// <value>ISO 3166 ALPHA2 country code</value>
        /// <example>CC</example>
        [RegularExpression("^[A-Z]{2}$")]
        [DataMember(Name="country", EmitDefaultValue=false)]
        public string Country { get; set; }

        /// <summary>
        /// Gets or Sets CountrySubDivision
        /// </summary>
        /// <example>Division</example>
        [StringLength(256, MinimumLength=1)]
        [DataMember(Name="countrySubDivision", EmitDefaultValue=false)]
        public string CountrySubDivision { get; set; }

        /// <summary>
        /// Gets or Sets PostalCode
        /// </summary>
        /// <example>PostCode</example>
        [StringLength(256, MinimumLength=1)]
        [DataMember(Name="postalCode", EmitDefaultValue=false)]
        public string PostalCode { get; set; }

        /// <summary>
        /// Gets or Sets Street
        /// </summary>
        /// <example>Street</example>
        [StringLength(70, MinimumLength=1)]
        [DataMember(Name="street", EmitDefaultValue=false)]
        public string Street { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress {\n");
            sb.Append("  BuildingNumber: ").Append(BuildingNumber).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  CountrySubDivision: ").Append(CountrySubDivision).Append("\n");
            sb.Append("  PostalCode: ").Append(PostalCode).Append("\n");
            sb.Append("  Street: ").Append(Street).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress)obj);
        }

        /// <summary>
        /// Returns true if PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress instances are equal
        /// </summary>
        /// <param name="other">Instance of PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    BuildingNumber == other.BuildingNumber ||
                    BuildingNumber != null &&
                    BuildingNumber.Equals(other.BuildingNumber)
                ) && 
                (
                    City == other.City ||
                    City != null &&
                    City.Equals(other.City)
                ) && 
                (
                    Country == other.Country ||
                    Country != null &&
                    Country.Equals(other.Country)
                ) && 
                (
                    CountrySubDivision == other.CountrySubDivision ||
                    CountrySubDivision != null &&
                    CountrySubDivision.Equals(other.CountrySubDivision)
                ) && 
                (
                    PostalCode == other.PostalCode ||
                    PostalCode != null &&
                    PostalCode.Equals(other.PostalCode)
                ) && 
                (
                    Street == other.Street ||
                    Street != null &&
                    Street.Equals(other.Street)
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
                    if (BuildingNumber != null)
                    hashCode = hashCode * 59 + BuildingNumber.GetHashCode();
                    if (City != null)
                    hashCode = hashCode * 59 + City.GetHashCode();
                    if (Country != null)
                    hashCode = hashCode * 59 + Country.GetHashCode();
                    if (CountrySubDivision != null)
                    hashCode = hashCode * 59 + CountrySubDivision.GetHashCode();
                    if (PostalCode != null)
                    hashCode = hashCode * 59 + PostalCode.GetHashCode();
                    if (Street != null)
                    hashCode = hashCode * 59 + Street.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress left, PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress left, PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}