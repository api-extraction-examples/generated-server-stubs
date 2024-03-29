/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
    public partial class ApiV1AccountsUpdateCredentialsPatchRequestSource : IEquatable<ApiV1AccountsUpdateCredentialsPatchRequestSource>
    {
        /// <summary>
        /// Default language to use for authored statuses. (ISO 6391)
        /// </summary>
        /// <value>Default language to use for authored statuses. (ISO 6391)</value>
        [DataMember(Name="language", EmitDefaultValue=false)]
        public string Language { get; set; }

        /// <summary>
        /// Default post privacy for authored statuses.
        /// </summary>
        /// <value>Default post privacy for authored statuses.</value>
        [DataMember(Name="privacy", EmitDefaultValue=false)]
        public string Privacy { get; set; }

        /// <summary>
        /// Whether to mark authored statuses as sensitive by default.
        /// </summary>
        /// <value>Whether to mark authored statuses as sensitive by default.</value>
        [DataMember(Name="sensitive", EmitDefaultValue=true)]
        public bool Sensitive { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiV1AccountsUpdateCredentialsPatchRequestSource {\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  Privacy: ").Append(Privacy).Append("\n");
            sb.Append("  Sensitive: ").Append(Sensitive).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ApiV1AccountsUpdateCredentialsPatchRequestSource)obj);
        }

        /// <summary>
        /// Returns true if ApiV1AccountsUpdateCredentialsPatchRequestSource instances are equal
        /// </summary>
        /// <param name="other">Instance of ApiV1AccountsUpdateCredentialsPatchRequestSource to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiV1AccountsUpdateCredentialsPatchRequestSource other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Language == other.Language ||
                    Language != null &&
                    Language.Equals(other.Language)
                ) && 
                (
                    Privacy == other.Privacy ||
                    Privacy != null &&
                    Privacy.Equals(other.Privacy)
                ) && 
                (
                    Sensitive == other.Sensitive ||
                    
                    Sensitive.Equals(other.Sensitive)
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
                    if (Language != null)
                    hashCode = hashCode * 59 + Language.GetHashCode();
                    if (Privacy != null)
                    hashCode = hashCode * 59 + Privacy.GetHashCode();
                    
                    hashCode = hashCode * 59 + Sensitive.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ApiV1AccountsUpdateCredentialsPatchRequestSource left, ApiV1AccountsUpdateCredentialsPatchRequestSource right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ApiV1AccountsUpdateCredentialsPatchRequestSource left, ApiV1AccountsUpdateCredentialsPatchRequestSource right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
