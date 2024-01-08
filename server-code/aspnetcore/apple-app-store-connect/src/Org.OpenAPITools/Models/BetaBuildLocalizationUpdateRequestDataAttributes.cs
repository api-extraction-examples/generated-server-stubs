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
    public partial class BetaBuildLocalizationUpdateRequestDataAttributes : IEquatable<BetaBuildLocalizationUpdateRequestDataAttributes>
    {
        /// <summary>
        /// Gets or Sets WhatsNew
        /// </summary>
        [DataMember(Name="whatsNew", EmitDefaultValue=false)]
        public string WhatsNew { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BetaBuildLocalizationUpdateRequestDataAttributes {\n");
            sb.Append("  WhatsNew: ").Append(WhatsNew).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BetaBuildLocalizationUpdateRequestDataAttributes)obj);
        }

        /// <summary>
        /// Returns true if BetaBuildLocalizationUpdateRequestDataAttributes instances are equal
        /// </summary>
        /// <param name="other">Instance of BetaBuildLocalizationUpdateRequestDataAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BetaBuildLocalizationUpdateRequestDataAttributes other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    WhatsNew == other.WhatsNew ||
                    WhatsNew != null &&
                    WhatsNew.Equals(other.WhatsNew)
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
                    if (WhatsNew != null)
                    hashCode = hashCode * 59 + WhatsNew.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BetaBuildLocalizationUpdateRequestDataAttributes left, BetaBuildLocalizationUpdateRequestDataAttributes right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BetaBuildLocalizationUpdateRequestDataAttributes left, BetaBuildLocalizationUpdateRequestDataAttributes right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
