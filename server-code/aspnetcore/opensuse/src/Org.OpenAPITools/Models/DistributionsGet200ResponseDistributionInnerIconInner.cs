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
    public partial class DistributionsGet200ResponseDistributionInnerIconInner : IEquatable<DistributionsGet200ResponseDistributionInnerIconInner>
    {
        /// <summary>
        /// Gets or Sets Height
        /// </summary>
        [DataMember(Name="height", EmitDefaultValue=true)]
        public int Height { get; set; }

        /// <summary>
        /// Gets or Sets Url
        /// </summary>
        [DataMember(Name="url", EmitDefaultValue=false)]
        public string Url { get; set; }

        /// <summary>
        /// Gets or Sets Width
        /// </summary>
        [DataMember(Name="width", EmitDefaultValue=true)]
        public int Width { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DistributionsGet200ResponseDistributionInnerIconInner {\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DistributionsGet200ResponseDistributionInnerIconInner)obj);
        }

        /// <summary>
        /// Returns true if DistributionsGet200ResponseDistributionInnerIconInner instances are equal
        /// </summary>
        /// <param name="other">Instance of DistributionsGet200ResponseDistributionInnerIconInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DistributionsGet200ResponseDistributionInnerIconInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Height == other.Height ||
                    
                    Height.Equals(other.Height)
                ) && 
                (
                    Url == other.Url ||
                    Url != null &&
                    Url.Equals(other.Url)
                ) && 
                (
                    Width == other.Width ||
                    
                    Width.Equals(other.Width)
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
                    
                    hashCode = hashCode * 59 + Height.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                    
                    hashCode = hashCode * 59 + Width.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DistributionsGet200ResponseDistributionInnerIconInner left, DistributionsGet200ResponseDistributionInnerIconInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DistributionsGet200ResponseDistributionInnerIconInner left, DistributionsGet200ResponseDistributionInnerIconInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}