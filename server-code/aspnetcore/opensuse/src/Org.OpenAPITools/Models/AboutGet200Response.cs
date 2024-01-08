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
    public partial class AboutGet200Response : IEquatable<AboutGet200Response>
    {
        /// <summary>
        /// Gets or Sets Commit
        /// </summary>
        /// <example>7b5d82e6143442a8eb8459f35cc94d2fbe263ebe</example>
        [DataMember(Name="commit", EmitDefaultValue=false)]
        public string Commit { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        /// <example>API to the Open Build Service</example>
        [Required]
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets LastDeployment
        /// </summary>
        /// <example>2020-11-10 15:07:02 +0000</example>
        [DataMember(Name="last_deployment", EmitDefaultValue=false)]
        public string LastDeployment { get; set; }

        /// <summary>
        /// Gets or Sets Revision
        /// </summary>
        /// <example>2.11~alpha.20201110T101235.7b5d82e614</example>
        [Required]
        [DataMember(Name="revision", EmitDefaultValue=false)]
        public string Revision { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        /// <example>Open Build Service API</example>
        [Required]
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AboutGet200Response {\n");
            sb.Append("  Commit: ").Append(Commit).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  LastDeployment: ").Append(LastDeployment).Append("\n");
            sb.Append("  Revision: ").Append(Revision).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AboutGet200Response)obj);
        }

        /// <summary>
        /// Returns true if AboutGet200Response instances are equal
        /// </summary>
        /// <param name="other">Instance of AboutGet200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AboutGet200Response other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Commit == other.Commit ||
                    Commit != null &&
                    Commit.Equals(other.Commit)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    LastDeployment == other.LastDeployment ||
                    LastDeployment != null &&
                    LastDeployment.Equals(other.LastDeployment)
                ) && 
                (
                    Revision == other.Revision ||
                    Revision != null &&
                    Revision.Equals(other.Revision)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
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
                    if (Commit != null)
                    hashCode = hashCode * 59 + Commit.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (LastDeployment != null)
                    hashCode = hashCode * 59 + LastDeployment.GetHashCode();
                    if (Revision != null)
                    hashCode = hashCode * 59 + Revision.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AboutGet200Response left, AboutGet200Response right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AboutGet200Response left, AboutGet200Response right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}