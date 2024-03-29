/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
    public partial class ApiV1ListsPostRequest : IEquatable<ApiV1ListsPostRequest>
    {

        /// <summary>
        /// Enumerable oneOf followed list none. Defaults to list.
        /// </summary>
        /// <value>Enumerable oneOf followed list none. Defaults to list.</value>
        [TypeConverter(typeof(CustomEnumConverter<RepliesPolicyEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum RepliesPolicyEnum
        {
            
            /// <summary>
            /// Enum FollowedEnum for followed
            /// </summary>
            [EnumMember(Value = "followed")]
            FollowedEnum = 1,
            
            /// <summary>
            /// Enum ListEnum for list
            /// </summary>
            [EnumMember(Value = "list")]
            ListEnum = 2,
            
            /// <summary>
            /// Enum NoneEnum for none
            /// </summary>
            [EnumMember(Value = "none")]
            NoneEnum = 3
        }

        /// <summary>
        /// Enumerable oneOf followed list none. Defaults to list.
        /// </summary>
        /// <value>Enumerable oneOf followed list none. Defaults to list.</value>
        [DataMember(Name="replies_policy", EmitDefaultValue=true)]
        public RepliesPolicyEnum RepliesPolicy { get; set; } = RepliesPolicyEnum.ListEnum;

        /// <summary>
        /// The title of the list to be created.
        /// </summary>
        /// <value>The title of the list to be created.</value>
        [Required]
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiV1ListsPostRequest {\n");
            sb.Append("  RepliesPolicy: ").Append(RepliesPolicy).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ApiV1ListsPostRequest)obj);
        }

        /// <summary>
        /// Returns true if ApiV1ListsPostRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of ApiV1ListsPostRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiV1ListsPostRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    RepliesPolicy == other.RepliesPolicy ||
                    
                    RepliesPolicy.Equals(other.RepliesPolicy)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
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
                    
                    hashCode = hashCode * 59 + RepliesPolicy.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ApiV1ListsPostRequest left, ApiV1ListsPostRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ApiV1ListsPostRequest left, ApiV1ListsPostRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
