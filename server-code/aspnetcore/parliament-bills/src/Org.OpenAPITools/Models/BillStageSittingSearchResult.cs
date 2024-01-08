/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * The version of the OpenAPI document: v1
 * Contact: softwareengineering@parliament.uk
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
    public partial class BillStageSittingSearchResult : IEquatable<BillStageSittingSearchResult>
    {
        /// <summary>
        /// Gets or Sets Items
        /// </summary>
        [DataMember(Name="items", EmitDefaultValue=true)]
        public List<BillStageSitting> Items { get; set; }

        /// <summary>
        /// Gets or Sets ItemsPerPage
        /// </summary>
        [DataMember(Name="itemsPerPage", EmitDefaultValue=true)]
        public int ItemsPerPage { get; set; }

        /// <summary>
        /// Gets or Sets TotalResults
        /// </summary>
        [DataMember(Name="totalResults", EmitDefaultValue=true)]
        public int TotalResults { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BillStageSittingSearchResult {\n");
            sb.Append("  Items: ").Append(Items).Append("\n");
            sb.Append("  ItemsPerPage: ").Append(ItemsPerPage).Append("\n");
            sb.Append("  TotalResults: ").Append(TotalResults).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BillStageSittingSearchResult)obj);
        }

        /// <summary>
        /// Returns true if BillStageSittingSearchResult instances are equal
        /// </summary>
        /// <param name="other">Instance of BillStageSittingSearchResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BillStageSittingSearchResult other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Items == other.Items ||
                    Items != null &&
                    other.Items != null &&
                    Items.SequenceEqual(other.Items)
                ) && 
                (
                    ItemsPerPage == other.ItemsPerPage ||
                    
                    ItemsPerPage.Equals(other.ItemsPerPage)
                ) && 
                (
                    TotalResults == other.TotalResults ||
                    
                    TotalResults.Equals(other.TotalResults)
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
                    if (Items != null)
                    hashCode = hashCode * 59 + Items.GetHashCode();
                    
                    hashCode = hashCode * 59 + ItemsPerPage.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalResults.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BillStageSittingSearchResult left, BillStageSittingSearchResult right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BillStageSittingSearchResult left, BillStageSittingSearchResult right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
