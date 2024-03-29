/*
 * Top Stories
 *
 * The Top Stories API provides lists of articles and associated images by section.
 *
 * The version of the OpenAPI document: 2.0.0
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
    public partial class ArticleRelatedUrlsInner : IEquatable<ArticleRelatedUrlsInner>
    {
        /// <summary>
        /// Gets or Sets SuggestedLinkText
        /// </summary>
        [DataMember(Name="suggested_link_text", EmitDefaultValue=false)]
        public string SuggestedLinkText { get; set; }

        /// <summary>
        /// Gets or Sets Url
        /// </summary>
        [DataMember(Name="url", EmitDefaultValue=false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ArticleRelatedUrlsInner {\n");
            sb.Append("  SuggestedLinkText: ").Append(SuggestedLinkText).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ArticleRelatedUrlsInner)obj);
        }

        /// <summary>
        /// Returns true if ArticleRelatedUrlsInner instances are equal
        /// </summary>
        /// <param name="other">Instance of ArticleRelatedUrlsInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ArticleRelatedUrlsInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    SuggestedLinkText == other.SuggestedLinkText ||
                    SuggestedLinkText != null &&
                    SuggestedLinkText.Equals(other.SuggestedLinkText)
                ) && 
                (
                    Url == other.Url ||
                    Url != null &&
                    Url.Equals(other.Url)
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
                    if (SuggestedLinkText != null)
                    hashCode = hashCode * 59 + SuggestedLinkText.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ArticleRelatedUrlsInner left, ArticleRelatedUrlsInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ArticleRelatedUrlsInner left, ArticleRelatedUrlsInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
