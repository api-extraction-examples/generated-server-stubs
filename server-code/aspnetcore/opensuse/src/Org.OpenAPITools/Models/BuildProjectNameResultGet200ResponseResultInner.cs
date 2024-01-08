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
    public partial class BuildProjectNameResultGet200ResponseResultInner : IEquatable<BuildProjectNameResultGet200ResponseResultInner>
    {
        /// <summary>
        /// Gets or Sets Arch
        /// </summary>
        /// <example>x86_64</example>
        [DataMember(Name="arch", EmitDefaultValue=false)]
        public string Arch { get; set; }

        /// <summary>
        /// Gets or Sets Binarylist
        /// </summary>
        [DataMember(Name="binarylist", EmitDefaultValue=false)]
        public List<BuildProjectNameResultGet200ResponseResultInnerBinarylistInner> Binarylist { get; set; }

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        /// <example>published</example>
        [DataMember(Name="code", EmitDefaultValue=false)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or Sets Project
        /// </summary>
        /// <example>home:foo</example>
        [DataMember(Name="project", EmitDefaultValue=false)]
        public string Project { get; set; }

        /// <summary>
        /// Gets or Sets Repository
        /// </summary>
        /// <example>openSUSE_Leap_15.3</example>
        [DataMember(Name="repository", EmitDefaultValue=false)]
        public string Repository { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        /// <example>published</example>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public List<BuildProjectNameResultGet200ResponseResultInnerStatusInner> Status { get; set; }

        /// <summary>
        /// Gets or Sets Summary
        /// </summary>
        [DataMember(Name="summary", EmitDefaultValue=false)]
        public BuildProjectNameResultGet200ResponseResultInnerSummary Summary { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BuildProjectNameResultGet200ResponseResultInner {\n");
            sb.Append("  Arch: ").Append(Arch).Append("\n");
            sb.Append("  Binarylist: ").Append(Binarylist).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Project: ").Append(Project).Append("\n");
            sb.Append("  Repository: ").Append(Repository).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Summary: ").Append(Summary).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BuildProjectNameResultGet200ResponseResultInner)obj);
        }

        /// <summary>
        /// Returns true if BuildProjectNameResultGet200ResponseResultInner instances are equal
        /// </summary>
        /// <param name="other">Instance of BuildProjectNameResultGet200ResponseResultInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BuildProjectNameResultGet200ResponseResultInner other)
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
                    Binarylist == other.Binarylist ||
                    Binarylist != null &&
                    other.Binarylist != null &&
                    Binarylist.SequenceEqual(other.Binarylist)
                ) && 
                (
                    Code == other.Code ||
                    Code != null &&
                    Code.Equals(other.Code)
                ) && 
                (
                    Project == other.Project ||
                    Project != null &&
                    Project.Equals(other.Project)
                ) && 
                (
                    Repository == other.Repository ||
                    Repository != null &&
                    Repository.Equals(other.Repository)
                ) && 
                (
                    State == other.State ||
                    State != null &&
                    State.Equals(other.State)
                ) && 
                (
                    Status == other.Status ||
                    Status != null &&
                    other.Status != null &&
                    Status.SequenceEqual(other.Status)
                ) && 
                (
                    Summary == other.Summary ||
                    Summary != null &&
                    Summary.Equals(other.Summary)
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
                    if (Binarylist != null)
                    hashCode = hashCode * 59 + Binarylist.GetHashCode();
                    if (Code != null)
                    hashCode = hashCode * 59 + Code.GetHashCode();
                    if (Project != null)
                    hashCode = hashCode * 59 + Project.GetHashCode();
                    if (Repository != null)
                    hashCode = hashCode * 59 + Repository.GetHashCode();
                    if (State != null)
                    hashCode = hashCode * 59 + State.GetHashCode();
                    if (Status != null)
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    if (Summary != null)
                    hashCode = hashCode * 59 + Summary.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BuildProjectNameResultGet200ResponseResultInner left, BuildProjectNameResultGet200ResponseResultInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BuildProjectNameResultGet200ResponseResultInner left, BuildProjectNameResultGet200ResponseResultInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
