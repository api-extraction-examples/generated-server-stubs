/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * The version of the OpenAPI document: 2.16.0
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
    public partial class AccountSetup : IEquatable<AccountSetup>
    {
        /// <summary>
        /// Gets or Sets ExtraSeatsBlock
        /// </summary>
        [DataMember(Name="extra_seats_block", EmitDefaultValue=true)]
        public int ExtraSeatsBlock { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets PaymentMethodId
        /// </summary>
        [DataMember(Name="payment_method_id", EmitDefaultValue=false)]
        public string PaymentMethodId { get; set; }


        /// <summary>
        /// Gets or Sets Period
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<PeriodEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum PeriodEnum
        {
            
            /// <summary>
            /// Enum MonthlyEnum for monthly
            /// </summary>
            [EnumMember(Value = "monthly")]
            MonthlyEnum = 1,
            
            /// <summary>
            /// Enum YearlyEnum for yearly
            /// </summary>
            [EnumMember(Value = "yearly")]
            YearlyEnum = 2
        }

        /// <summary>
        /// Gets or Sets Period
        /// </summary>
        [DataMember(Name="period", EmitDefaultValue=true)]
        public PeriodEnum Period { get; set; }

        /// <summary>
        /// Gets or Sets TypeId
        /// </summary>
        [Required]
        [DataMember(Name="type_id", EmitDefaultValue=false)]
        public string TypeId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AccountSetup {\n");
            sb.Append("  ExtraSeatsBlock: ").Append(ExtraSeatsBlock).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  PaymentMethodId: ").Append(PaymentMethodId).Append("\n");
            sb.Append("  Period: ").Append(Period).Append("\n");
            sb.Append("  TypeId: ").Append(TypeId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AccountSetup)obj);
        }

        /// <summary>
        /// Returns true if AccountSetup instances are equal
        /// </summary>
        /// <param name="other">Instance of AccountSetup to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AccountSetup other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ExtraSeatsBlock == other.ExtraSeatsBlock ||
                    
                    ExtraSeatsBlock.Equals(other.ExtraSeatsBlock)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    PaymentMethodId == other.PaymentMethodId ||
                    PaymentMethodId != null &&
                    PaymentMethodId.Equals(other.PaymentMethodId)
                ) && 
                (
                    Period == other.Period ||
                    
                    Period.Equals(other.Period)
                ) && 
                (
                    TypeId == other.TypeId ||
                    TypeId != null &&
                    TypeId.Equals(other.TypeId)
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
                    
                    hashCode = hashCode * 59 + ExtraSeatsBlock.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (PaymentMethodId != null)
                    hashCode = hashCode * 59 + PaymentMethodId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Period.GetHashCode();
                    if (TypeId != null)
                    hashCode = hashCode * 59 + TypeId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AccountSetup left, AccountSetup right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AccountSetup left, AccountSetup right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}