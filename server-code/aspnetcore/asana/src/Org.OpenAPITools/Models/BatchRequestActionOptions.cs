/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
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
    /// Pagination (&#x60;limit&#x60; and &#x60;offset&#x60;) and output options (&#x60;fields&#x60; or &#x60;expand&#x60;) for the action. “Pretty” JSON output is not an available option on individual actions; if you want pretty output, specify that option on the parent request.
    /// </summary>
    [DataContract]
    public partial class BatchRequestActionOptions : IEquatable<BatchRequestActionOptions>
    {
        /// <summary>
        /// The fields to retrieve in the request.
        /// </summary>
        /// <value>The fields to retrieve in the request.</value>
        /// <example>[&quot;name&quot;,&quot;gid&quot;,&quot;notes&quot;,&quot;completed&quot;]</example>
        [DataMember(Name="fields", EmitDefaultValue=false)]
        public List<string> Fields { get; set; }

        /// <summary>
        /// Pagination limit for the request.
        /// </summary>
        /// <value>Pagination limit for the request.</value>
        /// <example>50</example>
        [DataMember(Name="limit", EmitDefaultValue=true)]
        public int Limit { get; set; }

        /// <summary>
        /// Pagination offset for the request.
        /// </summary>
        /// <value>Pagination offset for the request.</value>
        [DataMember(Name="offset", EmitDefaultValue=true)]
        public int Offset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BatchRequestActionOptions {\n");
            sb.Append("  Fields: ").Append(Fields).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  Offset: ").Append(Offset).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BatchRequestActionOptions)obj);
        }

        /// <summary>
        /// Returns true if BatchRequestActionOptions instances are equal
        /// </summary>
        /// <param name="other">Instance of BatchRequestActionOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BatchRequestActionOptions other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Fields == other.Fields ||
                    Fields != null &&
                    other.Fields != null &&
                    Fields.SequenceEqual(other.Fields)
                ) && 
                (
                    Limit == other.Limit ||
                    
                    Limit.Equals(other.Limit)
                ) && 
                (
                    Offset == other.Offset ||
                    
                    Offset.Equals(other.Offset)
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
                    if (Fields != null)
                    hashCode = hashCode * 59 + Fields.GetHashCode();
                    
                    hashCode = hashCode * 59 + Limit.GetHashCode();
                    
                    hashCode = hashCode * 59 + Offset.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BatchRequestActionOptions left, BatchRequestActionOptions right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BatchRequestActionOptions left, BatchRequestActionOptions right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
