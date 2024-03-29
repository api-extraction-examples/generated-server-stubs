/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
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
    public partial class WebhookRequest : IEquatable<WebhookRequest>
    {
        /// <summary>
        /// An array of WebhookFilter objects to specify a whitelist of filters to apply to events from this webhook. If a webhook event passes any of the filters the event will be delivered; otherwise no event will be sent to the receiving server.
        /// </summary>
        /// <value>An array of WebhookFilter objects to specify a whitelist of filters to apply to events from this webhook. If a webhook event passes any of the filters the event will be delivered; otherwise no event will be sent to the receiving server.</value>
        [DataMember(Name="filters", EmitDefaultValue=false)]
        public List<WebhookRequestFiltersInner> Filters { get; set; }

        /// <summary>
        /// A resource ID to subscribe to. Many Asana resources are valid to create webhooks on, but higher-level resources require filters.
        /// </summary>
        /// <value>A resource ID to subscribe to. Many Asana resources are valid to create webhooks on, but higher-level resources require filters.</value>
        /// <example>12345</example>
        [Required]
        [DataMember(Name="resource", EmitDefaultValue=false)]
        public string Resource { get; set; }

        /// <summary>
        /// The URL to receive the HTTP POST. The full URL will be used to deliver events from this webhook (including parameters) which allows encoding of application-specific state when the webhook is created.
        /// </summary>
        /// <value>The URL to receive the HTTP POST. The full URL will be used to deliver events from this webhook (including parameters) which allows encoding of application-specific state when the webhook is created.</value>
        /// <example>https://example.com/receive-webhook/7654?app_specific_param&#x3D;app_specific_value</example>
        [Required]
        [DataMember(Name="target", EmitDefaultValue=false)]
        public string Target { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WebhookRequest {\n");
            sb.Append("  Filters: ").Append(Filters).Append("\n");
            sb.Append("  Resource: ").Append(Resource).Append("\n");
            sb.Append("  Target: ").Append(Target).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WebhookRequest)obj);
        }

        /// <summary>
        /// Returns true if WebhookRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of WebhookRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WebhookRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Filters == other.Filters ||
                    Filters != null &&
                    other.Filters != null &&
                    Filters.SequenceEqual(other.Filters)
                ) && 
                (
                    Resource == other.Resource ||
                    Resource != null &&
                    Resource.Equals(other.Resource)
                ) && 
                (
                    Target == other.Target ||
                    Target != null &&
                    Target.Equals(other.Target)
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
                    if (Filters != null)
                    hashCode = hashCode * 59 + Filters.GetHashCode();
                    if (Resource != null)
                    hashCode = hashCode * 59 + Resource.GetHashCode();
                    if (Target != null)
                    hashCode = hashCode * 59 + Target.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WebhookRequest left, WebhookRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WebhookRequest left, WebhookRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
