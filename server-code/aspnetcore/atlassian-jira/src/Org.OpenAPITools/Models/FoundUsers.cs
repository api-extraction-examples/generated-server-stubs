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
    /// The list of users found in a search, including header text (Showing X of Y matching users) and total of matched users.
    /// </summary>
    [DataContract]
    public partial class FoundUsers : IEquatable<FoundUsers>
    {
        /// <summary>
        /// Header text indicating the number of users in the response and the total number of users found in the search.
        /// </summary>
        /// <value>Header text indicating the number of users in the response and the total number of users found in the search.</value>
        [DataMember(Name="header", EmitDefaultValue=false)]
        public string Header { get; set; }

        /// <summary>
        /// The total number of users found in the search.
        /// </summary>
        /// <value>The total number of users found in the search.</value>
        [DataMember(Name="total", EmitDefaultValue=true)]
        public int Total { get; set; }

        /// <summary>
        /// Gets or Sets Users
        /// </summary>
        [DataMember(Name="users", EmitDefaultValue=false)]
        public List<UserPickerUser> Users { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FoundUsers {\n");
            sb.Append("  Header: ").Append(Header).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
            sb.Append("  Users: ").Append(Users).Append("\n");
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
            return obj.GetType() == GetType() && Equals((FoundUsers)obj);
        }

        /// <summary>
        /// Returns true if FoundUsers instances are equal
        /// </summary>
        /// <param name="other">Instance of FoundUsers to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FoundUsers other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Header == other.Header ||
                    Header != null &&
                    Header.Equals(other.Header)
                ) && 
                (
                    Total == other.Total ||
                    
                    Total.Equals(other.Total)
                ) && 
                (
                    Users == other.Users ||
                    Users != null &&
                    other.Users != null &&
                    Users.SequenceEqual(other.Users)
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
                    if (Header != null)
                    hashCode = hashCode * 59 + Header.GetHashCode();
                    
                    hashCode = hashCode * 59 + Total.GetHashCode();
                    if (Users != null)
                    hashCode = hashCode * 59 + Users.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FoundUsers left, FoundUsers right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FoundUsers left, FoundUsers right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}