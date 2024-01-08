/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
    /// Defines the MediaBrowser.Model.Configuration.PathSubstitution.
    /// </summary>
    [DataContract]
    public partial class PathSubstitution : IEquatable<PathSubstitution>
    {
        /// <summary>
        /// Gets or sets the value to substitute.
        /// </summary>
        /// <value>Gets or sets the value to substitute.</value>
        [DataMember(Name="From", EmitDefaultValue=true)]
        public string From { get; set; }

        /// <summary>
        /// Gets or sets the value to substitution with.
        /// </summary>
        /// <value>Gets or sets the value to substitution with.</value>
        [DataMember(Name="To", EmitDefaultValue=true)]
        public string To { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PathSubstitution {\n");
            sb.Append("  From: ").Append(From).Append("\n");
            sb.Append("  To: ").Append(To).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PathSubstitution)obj);
        }

        /// <summary>
        /// Returns true if PathSubstitution instances are equal
        /// </summary>
        /// <param name="other">Instance of PathSubstitution to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PathSubstitution other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    From == other.From ||
                    From != null &&
                    From.Equals(other.From)
                ) && 
                (
                    To == other.To ||
                    To != null &&
                    To.Equals(other.To)
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
                    if (From != null)
                    hashCode = hashCode * 59 + From.GetHashCode();
                    if (To != null)
                    hashCode = hashCode * 59 + To.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PathSubstitution left, PathSubstitution right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PathSubstitution left, PathSubstitution right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}