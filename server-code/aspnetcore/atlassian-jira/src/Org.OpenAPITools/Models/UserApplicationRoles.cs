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
    /// The application roles the user is assigned to.
    /// </summary>
    [DataContract]
    public partial class UserApplicationRoles : IEquatable<UserApplicationRoles>
    {
        /// <summary>
        /// Gets or Sets Callback
        /// </summary>
        [DataMember(Name="callback", EmitDefaultValue=false)]
        public Object Callback { get; set; }

        /// <summary>
        /// Gets or Sets Items
        /// </summary>
        [DataMember(Name="items", EmitDefaultValue=false)]
        public List<ApplicationRole> Items { get; set; }

        /// <summary>
        /// Gets or Sets MaxResults
        /// </summary>
        [DataMember(Name="max-results", EmitDefaultValue=true)]
        public int MaxResults { get; set; }

        /// <summary>
        /// Gets or Sets PagingCallback
        /// </summary>
        [DataMember(Name="pagingCallback", EmitDefaultValue=false)]
        public Object PagingCallback { get; set; }

        /// <summary>
        /// Gets or Sets Size
        /// </summary>
        [DataMember(Name="size", EmitDefaultValue=true)]
        public int Size { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserApplicationRoles {\n");
            sb.Append("  Callback: ").Append(Callback).Append("\n");
            sb.Append("  Items: ").Append(Items).Append("\n");
            sb.Append("  MaxResults: ").Append(MaxResults).Append("\n");
            sb.Append("  PagingCallback: ").Append(PagingCallback).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UserApplicationRoles)obj);
        }

        /// <summary>
        /// Returns true if UserApplicationRoles instances are equal
        /// </summary>
        /// <param name="other">Instance of UserApplicationRoles to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserApplicationRoles other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Callback == other.Callback ||
                    Callback != null &&
                    Callback.Equals(other.Callback)
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
                    PagingCallback == other.PagingCallback ||
                    PagingCallback != null &&
                    PagingCallback.Equals(other.PagingCallback)
                ) && 
                (
                    Size == other.Size ||
                    
                    Size.Equals(other.Size)
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
                    if (Callback != null)
                    hashCode = hashCode * 59 + Callback.GetHashCode();
                    if (Items != null)
                    hashCode = hashCode * 59 + Items.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxResults.GetHashCode();
                    if (PagingCallback != null)
                    hashCode = hashCode * 59 + PagingCallback.GetHashCode();
                    
                    hashCode = hashCode * 59 + Size.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UserApplicationRoles left, UserApplicationRoles right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserApplicationRoles left, UserApplicationRoles right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}