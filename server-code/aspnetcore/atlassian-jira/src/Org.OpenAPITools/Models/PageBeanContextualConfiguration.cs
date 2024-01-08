/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
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
    /// A page of items.
    /// </summary>
    [DataContract]
    public partial class PageBeanContextualConfiguration : IEquatable<PageBeanContextualConfiguration>
    {
        /// <summary>
        /// Whether this is the last page.
        /// </summary>
        /// <value>Whether this is the last page.</value>
        [DataMember(Name="isLast", EmitDefaultValue=true)]
        public bool IsLast { get; set; }

        /// <summary>
        /// The maximum number of items that could be returned.
        /// </summary>
        /// <value>The maximum number of items that could be returned.</value>
        [DataMember(Name="maxResults", EmitDefaultValue=true)]
        public int MaxResults { get; set; }

        /// <summary>
        /// If there is another page of results, the URL of the next page.
        /// </summary>
        /// <value>If there is another page of results, the URL of the next page.</value>
        [DataMember(Name="nextPage", EmitDefaultValue=false)]
        public string NextPage { get; set; }

        /// <summary>
        /// The URL of the page.
        /// </summary>
        /// <value>The URL of the page.</value>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public string Self { get; set; }

        /// <summary>
        /// The index of the first item returned.
        /// </summary>
        /// <value>The index of the first item returned.</value>
        [DataMember(Name="startAt", EmitDefaultValue=true)]
        public long StartAt { get; set; }

        /// <summary>
        /// The number of items returned.
        /// </summary>
        /// <value>The number of items returned.</value>
        [DataMember(Name="total", EmitDefaultValue=true)]
        public long Total { get; set; }

        /// <summary>
        /// The list of items.
        /// </summary>
        /// <value>The list of items.</value>
        [DataMember(Name="values", EmitDefaultValue=false)]
        public List<ContextualConfiguration> Values { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PageBeanContextualConfiguration {\n");
            sb.Append("  IsLast: ").Append(IsLast).Append("\n");
            sb.Append("  MaxResults: ").Append(MaxResults).Append("\n");
            sb.Append("  NextPage: ").Append(NextPage).Append("\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  StartAt: ").Append(StartAt).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
            sb.Append("  Values: ").Append(Values).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PageBeanContextualConfiguration)obj);
        }

        /// <summary>
        /// Returns true if PageBeanContextualConfiguration instances are equal
        /// </summary>
        /// <param name="other">Instance of PageBeanContextualConfiguration to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PageBeanContextualConfiguration other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    IsLast == other.IsLast ||
                    
                    IsLast.Equals(other.IsLast)
                ) && 
                (
                    MaxResults == other.MaxResults ||
                    
                    MaxResults.Equals(other.MaxResults)
                ) && 
                (
                    NextPage == other.NextPage ||
                    NextPage != null &&
                    NextPage.Equals(other.NextPage)
                ) && 
                (
                    Self == other.Self ||
                    Self != null &&
                    Self.Equals(other.Self)
                ) && 
                (
                    StartAt == other.StartAt ||
                    
                    StartAt.Equals(other.StartAt)
                ) && 
                (
                    Total == other.Total ||
                    
                    Total.Equals(other.Total)
                ) && 
                (
                    Values == other.Values ||
                    Values != null &&
                    other.Values != null &&
                    Values.SequenceEqual(other.Values)
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
                    
                    hashCode = hashCode * 59 + IsLast.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxResults.GetHashCode();
                    if (NextPage != null)
                    hashCode = hashCode * 59 + NextPage.GetHashCode();
                    if (Self != null)
                    hashCode = hashCode * 59 + Self.GetHashCode();
                    
                    hashCode = hashCode * 59 + StartAt.GetHashCode();
                    
                    hashCode = hashCode * 59 + Total.GetHashCode();
                    if (Values != null)
                    hashCode = hashCode * 59 + Values.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PageBeanContextualConfiguration left, PageBeanContextualConfiguration right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PageBeanContextualConfiguration left, PageBeanContextualConfiguration right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
