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
    /// 
    /// </summary>
    [DataContract]
    public partial class ForgotPasswordResult : IEquatable<ForgotPasswordResult>
    {
        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [DataMember(Name="Action", EmitDefaultValue=true)]
        public ForgotPasswordAction Action { get; set; }

        /// <summary>
        /// Gets or sets the pin expiration date.
        /// </summary>
        /// <value>Gets or sets the pin expiration date.</value>
        [DataMember(Name="PinExpirationDate", EmitDefaultValue=true)]
        public DateTime? PinExpirationDate { get; set; }

        /// <summary>
        /// Gets or sets the pin file.
        /// </summary>
        /// <value>Gets or sets the pin file.</value>
        [DataMember(Name="PinFile", EmitDefaultValue=true)]
        public string PinFile { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ForgotPasswordResult {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  PinExpirationDate: ").Append(PinExpirationDate).Append("\n");
            sb.Append("  PinFile: ").Append(PinFile).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ForgotPasswordResult)obj);
        }

        /// <summary>
        /// Returns true if ForgotPasswordResult instances are equal
        /// </summary>
        /// <param name="other">Instance of ForgotPasswordResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ForgotPasswordResult other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Action == other.Action ||
                    
                    Action.Equals(other.Action)
                ) && 
                (
                    PinExpirationDate == other.PinExpirationDate ||
                    PinExpirationDate != null &&
                    PinExpirationDate.Equals(other.PinExpirationDate)
                ) && 
                (
                    PinFile == other.PinFile ||
                    PinFile != null &&
                    PinFile.Equals(other.PinFile)
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
                    
                    hashCode = hashCode * 59 + Action.GetHashCode();
                    if (PinExpirationDate != null)
                    hashCode = hashCode * 59 + PinExpirationDate.GetHashCode();
                    if (PinFile != null)
                    hashCode = hashCode * 59 + PinFile.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ForgotPasswordResult left, ForgotPasswordResult right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ForgotPasswordResult left, ForgotPasswordResult right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
