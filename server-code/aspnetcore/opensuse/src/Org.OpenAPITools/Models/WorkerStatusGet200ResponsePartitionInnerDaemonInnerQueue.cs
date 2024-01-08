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
    public partial class WorkerStatusGet200ResponsePartitionInnerDaemonInnerQueue : IEquatable<WorkerStatusGet200ResponsePartitionInnerDaemonInnerQueue>
    {
        /// <summary>
        /// Gets or Sets High
        /// </summary>
        [DataMember(Name="high", EmitDefaultValue=false)]
        public string High { get; set; }

        /// <summary>
        /// Gets or Sets Low
        /// </summary>
        [DataMember(Name="low", EmitDefaultValue=false)]
        public string Low { get; set; }

        /// <summary>
        /// Gets or Sets Med
        /// </summary>
        [DataMember(Name="med", EmitDefaultValue=false)]
        public string Med { get; set; }

        /// <summary>
        /// Gets or Sets Next
        /// </summary>
        [DataMember(Name="next", EmitDefaultValue=false)]
        public string Next { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkerStatusGet200ResponsePartitionInnerDaemonInnerQueue {\n");
            sb.Append("  High: ").Append(High).Append("\n");
            sb.Append("  Low: ").Append(Low).Append("\n");
            sb.Append("  Med: ").Append(Med).Append("\n");
            sb.Append("  Next: ").Append(Next).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WorkerStatusGet200ResponsePartitionInnerDaemonInnerQueue)obj);
        }

        /// <summary>
        /// Returns true if WorkerStatusGet200ResponsePartitionInnerDaemonInnerQueue instances are equal
        /// </summary>
        /// <param name="other">Instance of WorkerStatusGet200ResponsePartitionInnerDaemonInnerQueue to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkerStatusGet200ResponsePartitionInnerDaemonInnerQueue other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    High == other.High ||
                    High != null &&
                    High.Equals(other.High)
                ) && 
                (
                    Low == other.Low ||
                    Low != null &&
                    Low.Equals(other.Low)
                ) && 
                (
                    Med == other.Med ||
                    Med != null &&
                    Med.Equals(other.Med)
                ) && 
                (
                    Next == other.Next ||
                    Next != null &&
                    Next.Equals(other.Next)
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
                    if (High != null)
                    hashCode = hashCode * 59 + High.GetHashCode();
                    if (Low != null)
                    hashCode = hashCode * 59 + Low.GetHashCode();
                    if (Med != null)
                    hashCode = hashCode * 59 + Med.GetHashCode();
                    if (Next != null)
                    hashCode = hashCode * 59 + Next.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WorkerStatusGet200ResponsePartitionInnerDaemonInnerQueue left, WorkerStatusGet200ResponsePartitionInnerDaemonInnerQueue right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WorkerStatusGet200ResponsePartitionInnerDaemonInnerQueue left, WorkerStatusGet200ResponsePartitionInnerDaemonInnerQueue right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
