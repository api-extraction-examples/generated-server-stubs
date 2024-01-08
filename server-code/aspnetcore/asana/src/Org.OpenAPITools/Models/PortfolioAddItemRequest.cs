/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
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
    public partial class PortfolioAddItemRequest : IEquatable<PortfolioAddItemRequest>
    {
        /// <summary>
        /// An id of an item in this portfolio. The new item will be added after the one specified here. &#x60;insert_before&#x60; and &#x60;insert_after&#x60; parameters cannot both be specified.
        /// </summary>
        /// <value>An id of an item in this portfolio. The new item will be added after the one specified here. &#x60;insert_before&#x60; and &#x60;insert_after&#x60; parameters cannot both be specified.</value>
        /// <example>1331</example>
        [DataMember(Name="insert_after", EmitDefaultValue=false)]
        public string InsertAfter { get; set; }

        /// <summary>
        /// An id of an item in this portfolio. The new item will be added before the one specified here. &#x60;insert_before&#x60; and &#x60;insert_after&#x60; parameters cannot both be specified.
        /// </summary>
        /// <value>An id of an item in this portfolio. The new item will be added before the one specified here. &#x60;insert_before&#x60; and &#x60;insert_after&#x60; parameters cannot both be specified.</value>
        /// <example>1331</example>
        [DataMember(Name="insert_before", EmitDefaultValue=false)]
        public string InsertBefore { get; set; }

        /// <summary>
        /// The item to add to the portfolio.
        /// </summary>
        /// <value>The item to add to the portfolio.</value>
        /// <example>1331</example>
        [Required]
        [DataMember(Name="item", EmitDefaultValue=false)]
        public string Item { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PortfolioAddItemRequest {\n");
            sb.Append("  InsertAfter: ").Append(InsertAfter).Append("\n");
            sb.Append("  InsertBefore: ").Append(InsertBefore).Append("\n");
            sb.Append("  Item: ").Append(Item).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PortfolioAddItemRequest)obj);
        }

        /// <summary>
        /// Returns true if PortfolioAddItemRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of PortfolioAddItemRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PortfolioAddItemRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    InsertAfter == other.InsertAfter ||
                    InsertAfter != null &&
                    InsertAfter.Equals(other.InsertAfter)
                ) && 
                (
                    InsertBefore == other.InsertBefore ||
                    InsertBefore != null &&
                    InsertBefore.Equals(other.InsertBefore)
                ) && 
                (
                    Item == other.Item ||
                    Item != null &&
                    Item.Equals(other.Item)
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
                    if (InsertAfter != null)
                    hashCode = hashCode * 59 + InsertAfter.GetHashCode();
                    if (InsertBefore != null)
                    hashCode = hashCode * 59 + InsertBefore.GetHashCode();
                    if (Item != null)
                    hashCode = hashCode * 59 + Item.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PortfolioAddItemRequest left, PortfolioAddItemRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PortfolioAddItemRequest left, PortfolioAddItemRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
