/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * The version of the OpenAPI document: 2.10.50
 * 
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
    public partial class RequestPostRequestReviewInnerAnyOf1 : IEquatable<RequestPostRequestReviewInnerAnyOf1>
    {
        /// <summary>
        /// Gets or Sets ByGroup
        /// </summary>
        /// <example>obs-group</example>
        [DataMember(Name="by_group", EmitDefaultValue=false)]
        public string ByGroup { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        /// <example>accepted</example>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }

        /// <summary>
        /// Gets or Sets When
        /// </summary>
        /// <example>2021-01-15T15:49:32</example>
        [DataMember(Name="when", EmitDefaultValue=false)]
        public string When { get; set; }

        /// <summary>
        /// Gets or Sets Who
        /// </summary>
        /// <example>obs-maintainer</example>
        [DataMember(Name="who", EmitDefaultValue=false)]
        public string Who { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RequestPostRequestReviewInnerAnyOf1 {\n");
            sb.Append("  ByGroup: ").Append(ByGroup).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  When: ").Append(When).Append("\n");
            sb.Append("  Who: ").Append(Who).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RequestPostRequestReviewInnerAnyOf1)obj);
        }

        /// <summary>
        /// Returns true if RequestPostRequestReviewInnerAnyOf1 instances are equal
        /// </summary>
        /// <param name="other">Instance of RequestPostRequestReviewInnerAnyOf1 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RequestPostRequestReviewInnerAnyOf1 other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ByGroup == other.ByGroup ||
                    ByGroup != null &&
                    ByGroup.Equals(other.ByGroup)
                ) && 
                (
                    State == other.State ||
                    State != null &&
                    State.Equals(other.State)
                ) && 
                (
                    When == other.When ||
                    When != null &&
                    When.Equals(other.When)
                ) && 
                (
                    Who == other.Who ||
                    Who != null &&
                    Who.Equals(other.Who)
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
                    if (ByGroup != null)
                    hashCode = hashCode * 59 + ByGroup.GetHashCode();
                    if (State != null)
                    hashCode = hashCode * 59 + State.GetHashCode();
                    if (When != null)
                    hashCode = hashCode * 59 + When.GetHashCode();
                    if (Who != null)
                    hashCode = hashCode * 59 + Who.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RequestPostRequestReviewInnerAnyOf1 left, RequestPostRequestReviewInnerAnyOf1 right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RequestPostRequestReviewInnerAnyOf1 left, RequestPostRequestReviewInnerAnyOf1 right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
