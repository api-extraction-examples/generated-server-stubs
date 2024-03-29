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
    public partial class RequestPostRequestHistoryInner : IEquatable<RequestPostRequestHistoryInner>
    {
        /// <summary>
        /// Gets or Sets Comment
        /// </summary>
        /// <example>Please review sources</example>
        [DataMember(Name="comment", EmitDefaultValue=false)]
        public string Comment { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        /// <example>Request created</example>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets When
        /// </summary>
        /// <example>2021-01-15T13:39:43</example>
        [DataMember(Name="when", EmitDefaultValue=false)]
        public string When { get; set; }

        /// <summary>
        /// Gets or Sets Who
        /// </summary>
        /// <example>foo</example>
        [DataMember(Name="who", EmitDefaultValue=false)]
        public string Who { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RequestPostRequestHistoryInner {\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RequestPostRequestHistoryInner)obj);
        }

        /// <summary>
        /// Returns true if RequestPostRequestHistoryInner instances are equal
        /// </summary>
        /// <param name="other">Instance of RequestPostRequestHistoryInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RequestPostRequestHistoryInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Comment == other.Comment ||
                    Comment != null &&
                    Comment.Equals(other.Comment)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
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
                    if (Comment != null)
                    hashCode = hashCode * 59 + Comment.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (When != null)
                    hashCode = hashCode * 59 + When.GetHashCode();
                    if (Who != null)
                    hashCode = hashCode * 59 + Who.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RequestPostRequestHistoryInner left, RequestPostRequestHistoryInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RequestPostRequestHistoryInner left, RequestPostRequestHistoryInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
