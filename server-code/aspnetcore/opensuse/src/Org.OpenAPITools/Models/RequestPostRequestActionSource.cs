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
    public partial class RequestPostRequestActionSource : IEquatable<RequestPostRequestActionSource>
    {
        /// <summary>
        /// Gets or Sets Package
        /// </summary>
        /// <example>obs-server</example>
        [DataMember(Name="package", EmitDefaultValue=false)]
        public string Package { get; set; }

        /// <summary>
        /// Gets or Sets Project
        /// </summary>
        /// <example>home:foo-user</example>
        [DataMember(Name="project", EmitDefaultValue=false)]
        public string Project { get; set; }

        /// <summary>
        /// Gets or Sets Rev
        /// </summary>
        /// <example>521</example>
        [DataMember(Name="rev", EmitDefaultValue=true)]
        public int Rev { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RequestPostRequestActionSource {\n");
            sb.Append("  Package: ").Append(Package).Append("\n");
            sb.Append("  Project: ").Append(Project).Append("\n");
            sb.Append("  Rev: ").Append(Rev).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RequestPostRequestActionSource)obj);
        }

        /// <summary>
        /// Returns true if RequestPostRequestActionSource instances are equal
        /// </summary>
        /// <param name="other">Instance of RequestPostRequestActionSource to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RequestPostRequestActionSource other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Package == other.Package ||
                    Package != null &&
                    Package.Equals(other.Package)
                ) && 
                (
                    Project == other.Project ||
                    Project != null &&
                    Project.Equals(other.Project)
                ) && 
                (
                    Rev == other.Rev ||
                    
                    Rev.Equals(other.Rev)
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
                    if (Package != null)
                    hashCode = hashCode * 59 + Package.GetHashCode();
                    if (Project != null)
                    hashCode = hashCode * 59 + Project.GetHashCode();
                    
                    hashCode = hashCode * 59 + Rev.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RequestPostRequestActionSource left, RequestPostRequestActionSource right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RequestPostRequestActionSource left, RequestPostRequestActionSource right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
