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
    public partial class PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200ResponseGroupSoftwareItem : IEquatable<PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200ResponseGroupSoftwareItem>
    {
        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Summary
        /// </summary>
        [DataMember(Name="summary", EmitDefaultValue=false)]
        public string Summary { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200ResponseGroupSoftwareItem {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200ResponseGroupSoftwareItem)obj);
        }

        /// <summary>
        /// Returns true if PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200ResponseGroupSoftwareItem instances are equal
        /// </summary>
        /// <param name="other">Instance of PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200ResponseGroupSoftwareItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200ResponseGroupSoftwareItem other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
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
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Summary != null)
                    hashCode = hashCode * 59 + Summary.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200ResponseGroupSoftwareItem left, PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200ResponseGroupSoftwareItem right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200ResponseGroupSoftwareItem left, PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200ResponseGroupSoftwareItem right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}