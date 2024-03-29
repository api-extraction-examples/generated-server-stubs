/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * The version of the OpenAPI document: v1.9.0
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
    /// The base response type of the &lt;b&gt;getOptedInPrograms&lt;/b&gt; method.
    /// </summary>
    [DataContract]
    public partial class Programs : IEquatable<Programs>
    {
        /// <summary>
        /// An array of seller programs that the seller&#39;s account is opted in to.
        /// </summary>
        /// <value>An array of seller programs that the seller&#39;s account is opted in to.</value>
        [DataMember(Name="programs", EmitDefaultValue=false)]
        public List<Program> VarPrograms { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Programs {\n");
            sb.Append("  VarPrograms: ").Append(VarPrograms).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Programs)obj);
        }

        /// <summary>
        /// Returns true if Programs instances are equal
        /// </summary>
        /// <param name="other">Instance of Programs to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Programs other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    VarPrograms == other.VarPrograms ||
                    VarPrograms != null &&
                    other.VarPrograms != null &&
                    VarPrograms.SequenceEqual(other.VarPrograms)
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
                    if (VarPrograms != null)
                    hashCode = hashCode * 59 + VarPrograms.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Programs left, Programs right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Programs left, Programs right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
