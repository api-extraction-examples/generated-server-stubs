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
    public partial class BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet200Response : IEquatable<BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet200Response>
    {
        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        /// <example>building</example>
        [DataMember(Name="code", EmitDefaultValue=false)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or Sets Hostarch
        /// </summary>
        /// <example>x86_64</example>
        [DataMember(Name="hostarch", EmitDefaultValue=false)]
        public string Hostarch { get; set; }

        /// <summary>
        /// Gets or Sets Jobid
        /// </summary>
        /// <example>17c8d25b92da67f6ec428ea51a9b5342</example>
        [DataMember(Name="jobid", EmitDefaultValue=false)]
        public string Jobid { get; set; }

        /// <summary>
        /// Gets or Sets Lastduration
        /// </summary>
        /// <example>43</example>
        [DataMember(Name="lastduration", EmitDefaultValue=false)]
        public string Lastduration { get; set; }

        /// <summary>
        /// Gets or Sets Starttime
        /// </summary>
        /// <example>1618222900</example>
        [DataMember(Name="starttime", EmitDefaultValue=false)]
        public string Starttime { get; set; }

        /// <summary>
        /// Gets or Sets Uri
        /// </summary>
        /// <example>http://172.18.0.5:38963</example>
        [DataMember(Name="uri", EmitDefaultValue=false)]
        public string Uri { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet200Response {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Hostarch: ").Append(Hostarch).Append("\n");
            sb.Append("  Jobid: ").Append(Jobid).Append("\n");
            sb.Append("  Lastduration: ").Append(Lastduration).Append("\n");
            sb.Append("  Starttime: ").Append(Starttime).Append("\n");
            sb.Append("  Uri: ").Append(Uri).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet200Response)obj);
        }

        /// <summary>
        /// Returns true if BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet200Response instances are equal
        /// </summary>
        /// <param name="other">Instance of BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet200Response other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Code == other.Code ||
                    Code != null &&
                    Code.Equals(other.Code)
                ) && 
                (
                    Hostarch == other.Hostarch ||
                    Hostarch != null &&
                    Hostarch.Equals(other.Hostarch)
                ) && 
                (
                    Jobid == other.Jobid ||
                    Jobid != null &&
                    Jobid.Equals(other.Jobid)
                ) && 
                (
                    Lastduration == other.Lastduration ||
                    Lastduration != null &&
                    Lastduration.Equals(other.Lastduration)
                ) && 
                (
                    Starttime == other.Starttime ||
                    Starttime != null &&
                    Starttime.Equals(other.Starttime)
                ) && 
                (
                    Uri == other.Uri ||
                    Uri != null &&
                    Uri.Equals(other.Uri)
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
                    if (Code != null)
                    hashCode = hashCode * 59 + Code.GetHashCode();
                    if (Hostarch != null)
                    hashCode = hashCode * 59 + Hostarch.GetHashCode();
                    if (Jobid != null)
                    hashCode = hashCode * 59 + Jobid.GetHashCode();
                    if (Lastduration != null)
                    hashCode = hashCode * 59 + Lastduration.GetHashCode();
                    if (Starttime != null)
                    hashCode = hashCode * 59 + Starttime.GetHashCode();
                    if (Uri != null)
                    hashCode = hashCode * 59 + Uri.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet200Response left, BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet200Response right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet200Response left, BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet200Response right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
