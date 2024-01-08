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
    public partial class WorkerArchitectureNameWorkerIdGet200Response : IEquatable<WorkerArchitectureNameWorkerIdGet200Response>
    {
        /// <summary>
        /// Gets or Sets Hardware
        /// </summary>
        [DataMember(Name="hardware", EmitDefaultValue=false)]
        public WorkerArchitectureNameWorkerIdGet200ResponseHardware Hardware { get; set; }

        /// <summary>
        /// Gets or Sets Hostarch
        /// </summary>
        [DataMember(Name="hostarch", EmitDefaultValue=false)]
        public string Hostarch { get; set; }

        /// <summary>
        /// Gets or Sets Hostlabel
        /// </summary>
        [DataMember(Name="hostlabel", EmitDefaultValue=false)]
        public string Hostlabel { get; set; }

        /// <summary>
        /// Gets or Sets Linux
        /// </summary>
        [DataMember(Name="linux", EmitDefaultValue=false)]
        public WorkerArchitectureNameWorkerIdGet200ResponseLinux Linux { get; set; }

        /// <summary>
        /// Gets or Sets Registerserver
        /// </summary>
        [DataMember(Name="registerserver", EmitDefaultValue=false)]
        public string Registerserver { get; set; }

        /// <summary>
        /// Gets or Sets Sandbox
        /// </summary>
        [DataMember(Name="sandbox", EmitDefaultValue=false)]
        public string Sandbox { get; set; }

        /// <summary>
        /// Gets or Sets Workerid
        /// </summary>
        [DataMember(Name="workerid", EmitDefaultValue=false)]
        public string Workerid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkerArchitectureNameWorkerIdGet200Response {\n");
            sb.Append("  Hardware: ").Append(Hardware).Append("\n");
            sb.Append("  Hostarch: ").Append(Hostarch).Append("\n");
            sb.Append("  Hostlabel: ").Append(Hostlabel).Append("\n");
            sb.Append("  Linux: ").Append(Linux).Append("\n");
            sb.Append("  Registerserver: ").Append(Registerserver).Append("\n");
            sb.Append("  Sandbox: ").Append(Sandbox).Append("\n");
            sb.Append("  Workerid: ").Append(Workerid).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WorkerArchitectureNameWorkerIdGet200Response)obj);
        }

        /// <summary>
        /// Returns true if WorkerArchitectureNameWorkerIdGet200Response instances are equal
        /// </summary>
        /// <param name="other">Instance of WorkerArchitectureNameWorkerIdGet200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkerArchitectureNameWorkerIdGet200Response other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Hardware == other.Hardware ||
                    Hardware != null &&
                    Hardware.Equals(other.Hardware)
                ) && 
                (
                    Hostarch == other.Hostarch ||
                    Hostarch != null &&
                    Hostarch.Equals(other.Hostarch)
                ) && 
                (
                    Hostlabel == other.Hostlabel ||
                    Hostlabel != null &&
                    Hostlabel.Equals(other.Hostlabel)
                ) && 
                (
                    Linux == other.Linux ||
                    Linux != null &&
                    Linux.Equals(other.Linux)
                ) && 
                (
                    Registerserver == other.Registerserver ||
                    Registerserver != null &&
                    Registerserver.Equals(other.Registerserver)
                ) && 
                (
                    Sandbox == other.Sandbox ||
                    Sandbox != null &&
                    Sandbox.Equals(other.Sandbox)
                ) && 
                (
                    Workerid == other.Workerid ||
                    Workerid != null &&
                    Workerid.Equals(other.Workerid)
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
                    if (Hardware != null)
                    hashCode = hashCode * 59 + Hardware.GetHashCode();
                    if (Hostarch != null)
                    hashCode = hashCode * 59 + Hostarch.GetHashCode();
                    if (Hostlabel != null)
                    hashCode = hashCode * 59 + Hostlabel.GetHashCode();
                    if (Linux != null)
                    hashCode = hashCode * 59 + Linux.GetHashCode();
                    if (Registerserver != null)
                    hashCode = hashCode * 59 + Registerserver.GetHashCode();
                    if (Sandbox != null)
                    hashCode = hashCode * 59 + Sandbox.GetHashCode();
                    if (Workerid != null)
                    hashCode = hashCode * 59 + Workerid.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WorkerArchitectureNameWorkerIdGet200Response left, WorkerArchitectureNameWorkerIdGet200Response right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WorkerArchitectureNameWorkerIdGet200Response left, WorkerArchitectureNameWorkerIdGet200Response right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}