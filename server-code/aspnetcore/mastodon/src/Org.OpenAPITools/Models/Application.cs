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
    /// Represents an application that interfaces with the REST API to access accounts or post statuses.
    /// </summary>
    [DataContract]
    public partial class Application : IEquatable<Application>
    {
        /// <summary>
        /// Client ID key, to be used for obtaining OAuth tokens
        /// </summary>
        /// <value>Client ID key, to be used for obtaining OAuth tokens</value>
        [DataMember(Name="client_id", EmitDefaultValue=false)]
        public string ClientId { get; set; }

        /// <summary>
        /// Client secret key, to be used for obtaining OAuth tokens
        /// </summary>
        /// <value>Client secret key, to be used for obtaining OAuth tokens</value>
        [DataMember(Name="client_secret", EmitDefaultValue=false)]
        public string ClientSecret { get; set; }

        /// <summary>
        /// The name of your application.
        /// </summary>
        /// <value>The name of your application.</value>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Used for Push Streaming API. Returned with [POST /api/v1/apps](https://docs.joinmastodon.org/methods/apps/#create-an-application). Equivalent to [PushSubscription#server_key](https://docs.joinmastodon.org/entities/pushsubscription/#server_key)
        /// </summary>
        /// <value>Used for Push Streaming API. Returned with [POST /api/v1/apps](https://docs.joinmastodon.org/methods/apps/#create-an-application). Equivalent to [PushSubscription#server_key](https://docs.joinmastodon.org/entities/pushsubscription/#server_key)</value>
        [DataMember(Name="vapid_key", EmitDefaultValue=false)]
        public string VapidKey { get; set; }

        /// <summary>
        /// The website associated with your application. Must be URL.
        /// </summary>
        /// <value>The website associated with your application. Must be URL.</value>
        [DataMember(Name="website", EmitDefaultValue=false)]
        public string Website { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Application {\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  ClientSecret: ").Append(ClientSecret).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  VapidKey: ").Append(VapidKey).Append("\n");
            sb.Append("  Website: ").Append(Website).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Application)obj);
        }

        /// <summary>
        /// Returns true if Application instances are equal
        /// </summary>
        /// <param name="other">Instance of Application to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Application other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ClientId == other.ClientId ||
                    ClientId != null &&
                    ClientId.Equals(other.ClientId)
                ) && 
                (
                    ClientSecret == other.ClientSecret ||
                    ClientSecret != null &&
                    ClientSecret.Equals(other.ClientSecret)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    VapidKey == other.VapidKey ||
                    VapidKey != null &&
                    VapidKey.Equals(other.VapidKey)
                ) && 
                (
                    Website == other.Website ||
                    Website != null &&
                    Website.Equals(other.Website)
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
                    if (ClientId != null)
                    hashCode = hashCode * 59 + ClientId.GetHashCode();
                    if (ClientSecret != null)
                    hashCode = hashCode * 59 + ClientSecret.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (VapidKey != null)
                    hashCode = hashCode * 59 + VapidKey.GetHashCode();
                    if (Website != null)
                    hashCode = hashCode * 59 + Website.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Application left, Application right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Application left, Application right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
