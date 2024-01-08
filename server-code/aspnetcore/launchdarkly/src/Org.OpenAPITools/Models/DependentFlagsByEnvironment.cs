/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: support@launchdarkly.com
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
    public partial class DependentFlagsByEnvironment : IEquatable<DependentFlagsByEnvironment>
    {
        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="_links", EmitDefaultValue=false)]
        public DependentFlagsLinks Links { get; set; }

        /// <summary>
        /// Gets or Sets Site
        /// </summary>
        [DataMember(Name="_site", EmitDefaultValue=false)]
        public Site Site { get; set; }

        /// <summary>
        /// Gets or Sets Items
        /// </summary>
        [DataMember(Name="items", EmitDefaultValue=false)]
        public List<DependentFlag> Items { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DependentFlagsByEnvironment {\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  Site: ").Append(Site).Append("\n");
            sb.Append("  Items: ").Append(Items).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DependentFlagsByEnvironment)obj);
        }

        /// <summary>
        /// Returns true if DependentFlagsByEnvironment instances are equal
        /// </summary>
        /// <param name="other">Instance of DependentFlagsByEnvironment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DependentFlagsByEnvironment other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Links == other.Links ||
                    Links != null &&
                    Links.Equals(other.Links)
                ) && 
                (
                    Site == other.Site ||
                    Site != null &&
                    Site.Equals(other.Site)
                ) && 
                (
                    Items == other.Items ||
                    Items != null &&
                    other.Items != null &&
                    Items.SequenceEqual(other.Items)
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
                    if (Links != null)
                    hashCode = hashCode * 59 + Links.GetHashCode();
                    if (Site != null)
                    hashCode = hashCode * 59 + Site.GetHashCode();
                    if (Items != null)
                    hashCode = hashCode * 59 + Items.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DependentFlagsByEnvironment left, DependentFlagsByEnvironment right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DependentFlagsByEnvironment left, DependentFlagsByEnvironment right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
