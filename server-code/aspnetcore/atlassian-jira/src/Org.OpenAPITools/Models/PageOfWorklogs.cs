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
    /// Paginated list of worklog details
    /// </summary>
    [DataContract]
    public partial class PageOfWorklogs : IEquatable<PageOfWorklogs>
    {
        /// <summary>
        /// The maximum number of results that could be on the page.
        /// </summary>
        /// <value>The maximum number of results that could be on the page.</value>
        [DataMember(Name="maxResults", EmitDefaultValue=true)]
        public int MaxResults { get; set; }

        /// <summary>
        /// The index of the first item returned on the page.
        /// </summary>
        /// <value>The index of the first item returned on the page.</value>
        [DataMember(Name="startAt", EmitDefaultValue=true)]
        public int StartAt { get; set; }

        /// <summary>
        /// The number of results on the page.
        /// </summary>
        /// <value>The number of results on the page.</value>
        [DataMember(Name="total", EmitDefaultValue=true)]
        public int Total { get; set; }

        /// <summary>
        /// List of worklogs.
        /// </summary>
        /// <value>List of worklogs.</value>
        [DataMember(Name="worklogs", EmitDefaultValue=false)]
        public List<Worklog> Worklogs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PageOfWorklogs {\n");
            sb.Append("  MaxResults: ").Append(MaxResults).Append("\n");
            sb.Append("  StartAt: ").Append(StartAt).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
            sb.Append("  Worklogs: ").Append(Worklogs).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PageOfWorklogs)obj);
        }

        /// <summary>
        /// Returns true if PageOfWorklogs instances are equal
        /// </summary>
        /// <param name="other">Instance of PageOfWorklogs to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PageOfWorklogs other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    MaxResults == other.MaxResults ||
                    
                    MaxResults.Equals(other.MaxResults)
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
                    Worklogs == other.Worklogs ||
                    Worklogs != null &&
                    other.Worklogs != null &&
                    Worklogs.SequenceEqual(other.Worklogs)
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
                    
                    hashCode = hashCode * 59 + MaxResults.GetHashCode();
                    
                    hashCode = hashCode * 59 + StartAt.GetHashCode();
                    
                    hashCode = hashCode * 59 + Total.GetHashCode();
                    if (Worklogs != null)
                    hashCode = hashCode * 59 + Worklogs.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PageOfWorklogs left, PageOfWorklogs right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PageOfWorklogs left, PageOfWorklogs right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}