/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: support@launchdarkly.com
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
    public partial class MemberLastSeenMetadata : IEquatable<MemberLastSeenMetadata>
    {
        /// <summary>
        /// If the last time this member accessed LaunchDarkly was using the REST API, this value will be set to the ID of the personal access token used.
        /// </summary>
        /// <value>If the last time this member accessed LaunchDarkly was using the REST API, this value will be set to the ID of the personal access token used.</value>
        /// <example>5fd2a1ee05600316d5cb3e96</example>
        [DataMember(Name="tokenId", EmitDefaultValue=false)]
        public string TokenId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MemberLastSeenMetadata {\n");
            sb.Append("  TokenId: ").Append(TokenId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MemberLastSeenMetadata)obj);
        }

        /// <summary>
        /// Returns true if MemberLastSeenMetadata instances are equal
        /// </summary>
        /// <param name="other">Instance of MemberLastSeenMetadata to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MemberLastSeenMetadata other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    TokenId == other.TokenId ||
                    TokenId != null &&
                    TokenId.Equals(other.TokenId)
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
                    if (TokenId != null)
                    hashCode = hashCode * 59 + TokenId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MemberLastSeenMetadata left, MemberLastSeenMetadata right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MemberLastSeenMetadata left, MemberLastSeenMetadata right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
