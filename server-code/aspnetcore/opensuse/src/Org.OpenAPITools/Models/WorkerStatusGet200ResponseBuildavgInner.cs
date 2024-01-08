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
    public partial class WorkerStatusGet200ResponseBuildavgInner : IEquatable<WorkerStatusGet200ResponseBuildavgInner>
    {
        /// <summary>
        /// Gets or Sets Arch
        /// </summary>
        [DataMember(Name="arch", EmitDefaultValue=false)]
        public string Arch { get; set; }

        /// <summary>
        /// Gets or Sets Buildavg
        /// </summary>
        [DataMember(Name="buildavg", EmitDefaultValue=false)]
        public string Buildavg { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkerStatusGet200ResponseBuildavgInner {\n");
            sb.Append("  Arch: ").Append(Arch).Append("\n");
            sb.Append("  Buildavg: ").Append(Buildavg).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WorkerStatusGet200ResponseBuildavgInner)obj);
        }

        /// <summary>
        /// Returns true if WorkerStatusGet200ResponseBuildavgInner instances are equal
        /// </summary>
        /// <param name="other">Instance of WorkerStatusGet200ResponseBuildavgInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkerStatusGet200ResponseBuildavgInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Arch == other.Arch ||
                    Arch != null &&
                    Arch.Equals(other.Arch)
                ) && 
                (
                    Buildavg == other.Buildavg ||
                    Buildavg != null &&
                    Buildavg.Equals(other.Buildavg)
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
                    if (Arch != null)
                    hashCode = hashCode * 59 + Arch.GetHashCode();
                    if (Buildavg != null)
                    hashCode = hashCode * 59 + Buildavg.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WorkerStatusGet200ResponseBuildavgInner left, WorkerStatusGet200ResponseBuildavgInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WorkerStatusGet200ResponseBuildavgInner left, WorkerStatusGet200ResponseBuildavgInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
