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
    public partial class WorkerArchitectureNameWorkerIdGet200ResponseHardware : IEquatable<WorkerArchitectureNameWorkerIdGet200ResponseHardware>
    {
        /// <summary>
        /// Gets or Sets Cpu
        /// </summary>
        [DataMember(Name="cpu", EmitDefaultValue=false)]
        public WorkerArchitectureNameWorkerIdGet200ResponseHardwareCpu Cpu { get; set; }

        /// <summary>
        /// Gets or Sets Jobs
        /// </summary>
        [DataMember(Name="jobs", EmitDefaultValue=false)]
        public string Jobs { get; set; }

        /// <summary>
        /// Gets or Sets Processors
        /// </summary>
        [DataMember(Name="processors", EmitDefaultValue=false)]
        public string Processors { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkerArchitectureNameWorkerIdGet200ResponseHardware {\n");
            sb.Append("  Cpu: ").Append(Cpu).Append("\n");
            sb.Append("  Jobs: ").Append(Jobs).Append("\n");
            sb.Append("  Processors: ").Append(Processors).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WorkerArchitectureNameWorkerIdGet200ResponseHardware)obj);
        }

        /// <summary>
        /// Returns true if WorkerArchitectureNameWorkerIdGet200ResponseHardware instances are equal
        /// </summary>
        /// <param name="other">Instance of WorkerArchitectureNameWorkerIdGet200ResponseHardware to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkerArchitectureNameWorkerIdGet200ResponseHardware other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Cpu == other.Cpu ||
                    Cpu != null &&
                    Cpu.Equals(other.Cpu)
                ) && 
                (
                    Jobs == other.Jobs ||
                    Jobs != null &&
                    Jobs.Equals(other.Jobs)
                ) && 
                (
                    Processors == other.Processors ||
                    Processors != null &&
                    Processors.Equals(other.Processors)
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
                    if (Cpu != null)
                    hashCode = hashCode * 59 + Cpu.GetHashCode();
                    if (Jobs != null)
                    hashCode = hashCode * 59 + Jobs.GetHashCode();
                    if (Processors != null)
                    hashCode = hashCode * 59 + Processors.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WorkerArchitectureNameWorkerIdGet200ResponseHardware left, WorkerArchitectureNameWorkerIdGet200ResponseHardware right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WorkerArchitectureNameWorkerIdGet200ResponseHardware left, WorkerArchitectureNameWorkerIdGet200ResponseHardware right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
