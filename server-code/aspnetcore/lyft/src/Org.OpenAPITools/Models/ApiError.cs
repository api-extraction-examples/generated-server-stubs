/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api-support@lyft.com
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
    /// Details about why a request failed, such as missing or invalid parameters
    /// </summary>
    [DataContract]
    public partial class ApiError : IEquatable<ApiError>
    {
        /// <summary>
        /// A \&quot;slug\&quot; that serves as the error code (eg. \&quot;bad_parameter\&quot;)
        /// </summary>
        /// <value>A \&quot;slug\&quot; that serves as the error code (eg. \&quot;bad_parameter\&quot;)</value>
        [DataMember(Name="error", EmitDefaultValue=false)]
        public string Error { get; set; }

        /// <summary>
        /// A user-friendly description of the error (appropriate to show to an end-user)
        /// </summary>
        /// <value>A user-friendly description of the error (appropriate to show to an end-user)</value>
        [DataMember(Name="error_description", EmitDefaultValue=false)]
        public string ErrorDescription { get; set; }

        /// <summary>
        /// Gets or Sets ErrorDetail
        /// </summary>
        [DataMember(Name="error_detail", EmitDefaultValue=false)]
        public List<ErrorDetail> ErrorDetail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiError {\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  ErrorDescription: ").Append(ErrorDescription).Append("\n");
            sb.Append("  ErrorDetail: ").Append(ErrorDetail).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ApiError)obj);
        }

        /// <summary>
        /// Returns true if ApiError instances are equal
        /// </summary>
        /// <param name="other">Instance of ApiError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiError other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Error == other.Error ||
                    Error != null &&
                    Error.Equals(other.Error)
                ) && 
                (
                    ErrorDescription == other.ErrorDescription ||
                    ErrorDescription != null &&
                    ErrorDescription.Equals(other.ErrorDescription)
                ) && 
                (
                    ErrorDetail == other.ErrorDetail ||
                    ErrorDetail != null &&
                    other.ErrorDetail != null &&
                    ErrorDetail.SequenceEqual(other.ErrorDetail)
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
                    if (Error != null)
                    hashCode = hashCode * 59 + Error.GetHashCode();
                    if (ErrorDescription != null)
                    hashCode = hashCode * 59 + ErrorDescription.GetHashCode();
                    if (ErrorDetail != null)
                    hashCode = hashCode * 59 + ErrorDetail.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ApiError left, ApiError right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ApiError left, ApiError right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
