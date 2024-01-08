/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: nishu@mediumapi.com
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
    public partial class SearchListsQueryQueryGet200Response : IEquatable<SearchListsQueryQueryGet200Response>
    {
        /// <summary>
        /// Gets or Sets Lists
        /// </summary>
        [DataMember(Name="lists", EmitDefaultValue=false)]
        public List<string> Lists { get; set; }

        /// <summary>
        /// Gets or Sets SearchQuery
        /// </summary>
        /// <example>artificial intelligence</example>
        [DataMember(Name="search_query", EmitDefaultValue=false)]
        public string SearchQuery { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SearchListsQueryQueryGet200Response {\n");
            sb.Append("  Lists: ").Append(Lists).Append("\n");
            sb.Append("  SearchQuery: ").Append(SearchQuery).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SearchListsQueryQueryGet200Response)obj);
        }

        /// <summary>
        /// Returns true if SearchListsQueryQueryGet200Response instances are equal
        /// </summary>
        /// <param name="other">Instance of SearchListsQueryQueryGet200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SearchListsQueryQueryGet200Response other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Lists == other.Lists ||
                    Lists != null &&
                    other.Lists != null &&
                    Lists.SequenceEqual(other.Lists)
                ) && 
                (
                    SearchQuery == other.SearchQuery ||
                    SearchQuery != null &&
                    SearchQuery.Equals(other.SearchQuery)
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
                    if (Lists != null)
                    hashCode = hashCode * 59 + Lists.GetHashCode();
                    if (SearchQuery != null)
                    hashCode = hashCode * 59 + SearchQuery.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SearchListsQueryQueryGet200Response left, SearchListsQueryQueryGet200Response right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SearchListsQueryQueryGet200Response left, SearchListsQueryQueryGet200Response right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
