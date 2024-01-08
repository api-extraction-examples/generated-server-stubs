/*
 * Twilio - Notify
 *
 * This is the public Twilio REST API.
 *
 * The version of the OpenAPI document: 1.52.0
 * Contact: support@twilio.com
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
    public partial class ListCredentialResponseMeta : IEquatable<ListCredentialResponseMeta>
    {
        /// <summary>
        /// Gets or Sets FirstPageUrl
        /// </summary>
        [DataMember(Name="first_page_url", EmitDefaultValue=false)]
        public string FirstPageUrl { get; set; }

        /// <summary>
        /// Gets or Sets Key
        /// </summary>
        [DataMember(Name="key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// Gets or Sets NextPageUrl
        /// </summary>
        [DataMember(Name="next_page_url", EmitDefaultValue=true)]
        public string NextPageUrl { get; set; }

        /// <summary>
        /// Gets or Sets Page
        /// </summary>
        [DataMember(Name="page", EmitDefaultValue=true)]
        public int Page { get; set; }

        /// <summary>
        /// Gets or Sets PageSize
        /// </summary>
        [DataMember(Name="page_size", EmitDefaultValue=true)]
        public int PageSize { get; set; }

        /// <summary>
        /// Gets or Sets PreviousPageUrl
        /// </summary>
        [DataMember(Name="previous_page_url", EmitDefaultValue=true)]
        public string PreviousPageUrl { get; set; }

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
            sb.Append("class ListCredentialResponseMeta {\n");
            sb.Append("  FirstPageUrl: ").Append(FirstPageUrl).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  NextPageUrl: ").Append(NextPageUrl).Append("\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
            sb.Append("  PageSize: ").Append(PageSize).Append("\n");
            sb.Append("  PreviousPageUrl: ").Append(PreviousPageUrl).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ListCredentialResponseMeta)obj);
        }

        /// <summary>
        /// Returns true if ListCredentialResponseMeta instances are equal
        /// </summary>
        /// <param name="other">Instance of ListCredentialResponseMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ListCredentialResponseMeta other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    FirstPageUrl == other.FirstPageUrl ||
                    FirstPageUrl != null &&
                    FirstPageUrl.Equals(other.FirstPageUrl)
                ) && 
                (
                    Key == other.Key ||
                    Key != null &&
                    Key.Equals(other.Key)
                ) && 
                (
                    NextPageUrl == other.NextPageUrl ||
                    NextPageUrl != null &&
                    NextPageUrl.Equals(other.NextPageUrl)
                ) && 
                (
                    Page == other.Page ||
                    
                    Page.Equals(other.Page)
                ) && 
                (
                    PageSize == other.PageSize ||
                    
                    PageSize.Equals(other.PageSize)
                ) && 
                (
                    PreviousPageUrl == other.PreviousPageUrl ||
                    PreviousPageUrl != null &&
                    PreviousPageUrl.Equals(other.PreviousPageUrl)
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
                    if (FirstPageUrl != null)
                    hashCode = hashCode * 59 + FirstPageUrl.GetHashCode();
                    if (Key != null)
                    hashCode = hashCode * 59 + Key.GetHashCode();
                    if (NextPageUrl != null)
                    hashCode = hashCode * 59 + NextPageUrl.GetHashCode();
                    
                    hashCode = hashCode * 59 + Page.GetHashCode();
                    
                    hashCode = hashCode * 59 + PageSize.GetHashCode();
                    if (PreviousPageUrl != null)
                    hashCode = hashCode * 59 + PreviousPageUrl.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ListCredentialResponseMeta left, ListCredentialResponseMeta right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ListCredentialResponseMeta left, ListCredentialResponseMeta right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
