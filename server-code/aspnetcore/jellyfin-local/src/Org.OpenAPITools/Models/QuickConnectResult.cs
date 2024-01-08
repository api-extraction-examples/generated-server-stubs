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
    /// Stores the result of an incoming quick connect request.
    /// </summary>
    [DataContract]
    public partial class QuickConnectResult : IEquatable<QuickConnectResult>
    {
        /// <summary>
        /// Gets a value indicating whether this request is authorized.
        /// </summary>
        /// <value>Gets a value indicating whether this request is authorized.</value>
        [DataMember(Name="Authenticated", EmitDefaultValue=true)]
        public bool Authenticated { get; set; }

        /// <summary>
        /// Gets or sets the private access token.
        /// </summary>
        /// <value>Gets or sets the private access token.</value>
        [DataMember(Name="Authentication", EmitDefaultValue=true)]
        public string Authentication { get; set; }

        /// <summary>
        /// Gets or sets the user facing code used so the user can quickly differentiate this request from others.
        /// </summary>
        /// <value>Gets or sets the user facing code used so the user can quickly differentiate this request from others.</value>
        [DataMember(Name="Code", EmitDefaultValue=true)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or sets the DateTime that this request was created.
        /// </summary>
        /// <value>Gets or sets the DateTime that this request was created.</value>
        [DataMember(Name="DateAdded", EmitDefaultValue=true)]
        public DateTime? DateAdded { get; set; }

        /// <summary>
        /// Gets or sets an error message.
        /// </summary>
        /// <value>Gets or sets an error message.</value>
        [DataMember(Name="Error", EmitDefaultValue=true)]
        public string Error { get; set; }

        /// <summary>
        /// Gets or sets the secret value used to uniquely identify this request. Can be used to retrieve authentication information.
        /// </summary>
        /// <value>Gets or sets the secret value used to uniquely identify this request. Can be used to retrieve authentication information.</value>
        [DataMember(Name="Secret", EmitDefaultValue=true)]
        public string Secret { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class QuickConnectResult {\n");
            sb.Append("  Authenticated: ").Append(Authenticated).Append("\n");
            sb.Append("  Authentication: ").Append(Authentication).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  DateAdded: ").Append(DateAdded).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  Secret: ").Append(Secret).Append("\n");
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
            return obj.GetType() == GetType() && Equals((QuickConnectResult)obj);
        }

        /// <summary>
        /// Returns true if QuickConnectResult instances are equal
        /// </summary>
        /// <param name="other">Instance of QuickConnectResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(QuickConnectResult other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Authenticated == other.Authenticated ||
                    
                    Authenticated.Equals(other.Authenticated)
                ) && 
                (
                    Authentication == other.Authentication ||
                    Authentication != null &&
                    Authentication.Equals(other.Authentication)
                ) && 
                (
                    Code == other.Code ||
                    Code != null &&
                    Code.Equals(other.Code)
                ) && 
                (
                    DateAdded == other.DateAdded ||
                    DateAdded != null &&
                    DateAdded.Equals(other.DateAdded)
                ) && 
                (
                    Error == other.Error ||
                    Error != null &&
                    Error.Equals(other.Error)
                ) && 
                (
                    Secret == other.Secret ||
                    Secret != null &&
                    Secret.Equals(other.Secret)
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
                    
                    hashCode = hashCode * 59 + Authenticated.GetHashCode();
                    if (Authentication != null)
                    hashCode = hashCode * 59 + Authentication.GetHashCode();
                    if (Code != null)
                    hashCode = hashCode * 59 + Code.GetHashCode();
                    if (DateAdded != null)
                    hashCode = hashCode * 59 + DateAdded.GetHashCode();
                    if (Error != null)
                    hashCode = hashCode * 59 + Error.GetHashCode();
                    if (Secret != null)
                    hashCode = hashCode * 59 + Secret.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(QuickConnectResult left, QuickConnectResult right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(QuickConnectResult left, QuickConnectResult right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}