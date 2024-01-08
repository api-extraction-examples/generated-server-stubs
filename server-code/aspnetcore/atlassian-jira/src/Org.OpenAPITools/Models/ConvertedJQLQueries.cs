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
    /// The converted JQL queries.
    /// </summary>
    [DataContract]
    public partial class ConvertedJQLQueries : IEquatable<ConvertedJQLQueries>
    {
        /// <summary>
        /// List of queries containing user information that could not be mapped to an existing user
        /// </summary>
        /// <value>List of queries containing user information that could not be mapped to an existing user</value>
        [DataMember(Name="queriesWithUnknownUsers", EmitDefaultValue=false)]
        public List<JQLQueryWithUnknownUsers> QueriesWithUnknownUsers { get; set; }

        /// <summary>
        /// The list of converted query strings with account IDs in place of user identifiers.
        /// </summary>
        /// <value>The list of converted query strings with account IDs in place of user identifiers.</value>
        [DataMember(Name="queryStrings", EmitDefaultValue=false)]
        public List<string> QueryStrings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConvertedJQLQueries {\n");
            sb.Append("  QueriesWithUnknownUsers: ").Append(QueriesWithUnknownUsers).Append("\n");
            sb.Append("  QueryStrings: ").Append(QueryStrings).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ConvertedJQLQueries)obj);
        }

        /// <summary>
        /// Returns true if ConvertedJQLQueries instances are equal
        /// </summary>
        /// <param name="other">Instance of ConvertedJQLQueries to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConvertedJQLQueries other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    QueriesWithUnknownUsers == other.QueriesWithUnknownUsers ||
                    QueriesWithUnknownUsers != null &&
                    other.QueriesWithUnknownUsers != null &&
                    QueriesWithUnknownUsers.SequenceEqual(other.QueriesWithUnknownUsers)
                ) && 
                (
                    QueryStrings == other.QueryStrings ||
                    QueryStrings != null &&
                    other.QueryStrings != null &&
                    QueryStrings.SequenceEqual(other.QueryStrings)
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
                    if (QueriesWithUnknownUsers != null)
                    hashCode = hashCode * 59 + QueriesWithUnknownUsers.GetHashCode();
                    if (QueryStrings != null)
                    hashCode = hashCode * 59 + QueryStrings.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ConvertedJQLQueries left, ConvertedJQLQueries right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ConvertedJQLQueries left, ConvertedJQLQueries right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
