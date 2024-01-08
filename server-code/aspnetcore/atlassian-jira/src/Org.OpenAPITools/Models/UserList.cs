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
    /// A paginated list of users sharing the filter. This includes users that are members of the groups or can browse the projects that the filter is shared with.
    /// </summary>
    [DataContract]
    public partial class UserList : IEquatable<UserList>
    {
        /// <summary>
        /// The index of the last item returned on the page.
        /// </summary>
        /// <value>The index of the last item returned on the page.</value>
        [DataMember(Name="end-index", EmitDefaultValue=true)]
        public int EndIndex { get; set; }

        /// <summary>
        /// The list of items.
        /// </summary>
        /// <value>The list of items.</value>
        [DataMember(Name="items", EmitDefaultValue=false)]
        public List<User> Items { get; set; }

        /// <summary>
        /// The maximum number of results that could be on the page.
        /// </summary>
        /// <value>The maximum number of results that could be on the page.</value>
        [DataMember(Name="max-results", EmitDefaultValue=true)]
        public int MaxResults { get; set; }

        /// <summary>
        /// The number of items on the page.
        /// </summary>
        /// <value>The number of items on the page.</value>
        [DataMember(Name="size", EmitDefaultValue=true)]
        public int Size { get; set; }

        /// <summary>
        /// The index of the first item returned on the page.
        /// </summary>
        /// <value>The index of the first item returned on the page.</value>
        [DataMember(Name="start-index", EmitDefaultValue=true)]
        public int StartIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserList {\n");
            sb.Append("  EndIndex: ").Append(EndIndex).Append("\n");
            sb.Append("  Items: ").Append(Items).Append("\n");
            sb.Append("  MaxResults: ").Append(MaxResults).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  StartIndex: ").Append(StartIndex).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UserList)obj);
        }

        /// <summary>
        /// Returns true if UserList instances are equal
        /// </summary>
        /// <param name="other">Instance of UserList to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserList other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    EndIndex == other.EndIndex ||
                    
                    EndIndex.Equals(other.EndIndex)
                ) && 
                (
                    Items == other.Items ||
                    Items != null &&
                    other.Items != null &&
                    Items.SequenceEqual(other.Items)
                ) && 
                (
                    MaxResults == other.MaxResults ||
                    
                    MaxResults.Equals(other.MaxResults)
                ) && 
                (
                    Size == other.Size ||
                    
                    Size.Equals(other.Size)
                ) && 
                (
                    StartIndex == other.StartIndex ||
                    
                    StartIndex.Equals(other.StartIndex)
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
                    
                    hashCode = hashCode * 59 + EndIndex.GetHashCode();
                    if (Items != null)
                    hashCode = hashCode * 59 + Items.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxResults.GetHashCode();
                    
                    hashCode = hashCode * 59 + Size.GetHashCode();
                    
                    hashCode = hashCode * 59 + StartIndex.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UserList left, UserList right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserList left, UserList right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}