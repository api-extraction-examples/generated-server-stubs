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
    public partial class ApiV1ScheduledStatusesIdPutRequest : IEquatable<ApiV1ScheduledStatusesIdPutRequest>
    {
        /// <summary>
        /// ISO 8601 Datetime at which the status will be published. Must be at least 5 minutes into the future.
        /// </summary>
        /// <value>ISO 8601 Datetime at which the status will be published. Must be at least 5 minutes into the future.</value>
        [DataMember(Name="scheduled_at", EmitDefaultValue=false)]
        public DateTime ScheduledAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiV1ScheduledStatusesIdPutRequest {\n");
            sb.Append("  ScheduledAt: ").Append(ScheduledAt).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ApiV1ScheduledStatusesIdPutRequest)obj);
        }

        /// <summary>
        /// Returns true if ApiV1ScheduledStatusesIdPutRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of ApiV1ScheduledStatusesIdPutRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiV1ScheduledStatusesIdPutRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ScheduledAt == other.ScheduledAt ||
                    ScheduledAt != null &&
                    ScheduledAt.Equals(other.ScheduledAt)
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
                    if (ScheduledAt != null)
                    hashCode = hashCode * 59 + ScheduledAt.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ApiV1ScheduledStatusesIdPutRequest left, ApiV1ScheduledStatusesIdPutRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ApiV1ScheduledStatusesIdPutRequest left, ApiV1ScheduledStatusesIdPutRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
