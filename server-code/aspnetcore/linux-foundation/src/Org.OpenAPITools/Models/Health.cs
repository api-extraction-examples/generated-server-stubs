/*
 * Reimbursements API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
    /// 
    /// </summary>
    [DataContract]
    public partial class Health : IEquatable<Health>
    {
        /// <summary>
        /// Time the service was built and deployed
        /// </summary>
        /// <value>Time the service was built and deployed</value>
        /// <example>2019-06-06_02:59:49PM</example>
        [DataMember(Name="BuildTimeStamp", EmitDefaultValue=false)]
        public string BuildTimeStamp { get; set; }

        /// <summary>
        /// hash of the latest Git commit of the service at time of building
        /// </summary>
        /// <value>hash of the latest Git commit of the service at time of building</value>
        /// <example>62009963c9e1cedaf7a24649208983163f8c439e</example>
        [DataMember(Name="Githash", EmitDefaultValue=false)]
        public string Githash { get; set; }

        /// <summary>
        /// Gets or Sets Healths
        /// </summary>
        [DataMember(Name="Healths", EmitDefaultValue=false)]
        public List<HealthStatus> Healths { get; set; }

        /// <summary>
        /// Confirmation that the service is doing well
        /// </summary>
        /// <value>Confirmation that the service is doing well</value>
        /// <example>healthy</example>
        [DataMember(Name="Status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// Current server time
        /// </summary>
        /// <value>Current server time</value>
        /// <example>2019-06-07 15:37:43.131125775 +0000 UTC m&#x3D;+0.257970409</example>
        [DataMember(Name="TimeStamp", EmitDefaultValue=false)]
        public string TimeStamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Health {\n");
            sb.Append("  BuildTimeStamp: ").Append(BuildTimeStamp).Append("\n");
            sb.Append("  Githash: ").Append(Githash).Append("\n");
            sb.Append("  Healths: ").Append(Healths).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  TimeStamp: ").Append(TimeStamp).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Health)obj);
        }

        /// <summary>
        /// Returns true if Health instances are equal
        /// </summary>
        /// <param name="other">Instance of Health to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Health other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    BuildTimeStamp == other.BuildTimeStamp ||
                    BuildTimeStamp != null &&
                    BuildTimeStamp.Equals(other.BuildTimeStamp)
                ) && 
                (
                    Githash == other.Githash ||
                    Githash != null &&
                    Githash.Equals(other.Githash)
                ) && 
                (
                    Healths == other.Healths ||
                    Healths != null &&
                    other.Healths != null &&
                    Healths.SequenceEqual(other.Healths)
                ) && 
                (
                    Status == other.Status ||
                    Status != null &&
                    Status.Equals(other.Status)
                ) && 
                (
                    TimeStamp == other.TimeStamp ||
                    TimeStamp != null &&
                    TimeStamp.Equals(other.TimeStamp)
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
                    if (BuildTimeStamp != null)
                    hashCode = hashCode * 59 + BuildTimeStamp.GetHashCode();
                    if (Githash != null)
                    hashCode = hashCode * 59 + Githash.GetHashCode();
                    if (Healths != null)
                    hashCode = hashCode * 59 + Healths.GetHashCode();
                    if (Status != null)
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    if (TimeStamp != null)
                    hashCode = hashCode * 59 + TimeStamp.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Health left, Health right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Health left, Health right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
