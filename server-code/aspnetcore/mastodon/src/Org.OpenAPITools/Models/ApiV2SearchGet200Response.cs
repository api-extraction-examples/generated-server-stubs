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
    public partial class ApiV2SearchGet200Response : IEquatable<ApiV2SearchGet200Response>
    {
        /// <summary>
        /// Gets or Sets Accounts
        /// </summary>
        [DataMember(Name="accounts", EmitDefaultValue=false)]
        public List<Account> Accounts { get; set; }

        /// <summary>
        /// Gets or Sets Hashtags
        /// </summary>
        [DataMember(Name="hashtags", EmitDefaultValue=false)]
        public List<Status> Hashtags { get; set; }

        /// <summary>
        /// Gets or Sets Statuses
        /// </summary>
        [DataMember(Name="statuses", EmitDefaultValue=false)]
        public List<Tag> Statuses { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiV2SearchGet200Response {\n");
            sb.Append("  Accounts: ").Append(Accounts).Append("\n");
            sb.Append("  Hashtags: ").Append(Hashtags).Append("\n");
            sb.Append("  Statuses: ").Append(Statuses).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ApiV2SearchGet200Response)obj);
        }

        /// <summary>
        /// Returns true if ApiV2SearchGet200Response instances are equal
        /// </summary>
        /// <param name="other">Instance of ApiV2SearchGet200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiV2SearchGet200Response other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Accounts == other.Accounts ||
                    Accounts != null &&
                    other.Accounts != null &&
                    Accounts.SequenceEqual(other.Accounts)
                ) && 
                (
                    Hashtags == other.Hashtags ||
                    Hashtags != null &&
                    other.Hashtags != null &&
                    Hashtags.SequenceEqual(other.Hashtags)
                ) && 
                (
                    Statuses == other.Statuses ||
                    Statuses != null &&
                    other.Statuses != null &&
                    Statuses.SequenceEqual(other.Statuses)
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
                    if (Accounts != null)
                    hashCode = hashCode * 59 + Accounts.GetHashCode();
                    if (Hashtags != null)
                    hashCode = hashCode * 59 + Hashtags.GetHashCode();
                    if (Statuses != null)
                    hashCode = hashCode * 59 + Statuses.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ApiV2SearchGet200Response left, ApiV2SearchGet200Response right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ApiV2SearchGet200Response left, ApiV2SearchGet200Response right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
