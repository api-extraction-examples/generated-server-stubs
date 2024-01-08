/*
 * Intel Product Catalogue Service
 *
 * This is the documentation for PIM Micro services. In order to use this tool you need to have Basic Auth credentials and a client id. If you dont have one, please make sure to request one by sending an email to the PIM MS team: [pim.360.team@intel.com](mailto:pim.360.team@intel.com?subject=PIMServices)
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: pim.360.team@intel.com
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
    public partial class UnsuccessfulOperation : IEquatable<UnsuccessfulOperation>
    {
        /// <summary>
        /// Gets or Sets ErrorCode
        /// </summary>
        /// <example>SERVICE_ERROR</example>
        [DataMember(Name="error_code", EmitDefaultValue=false)]
        public string ErrorCode { get; set; }

        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        /// <example>Something went wrong, we have already captured log. Will fix this asap.</example>
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UnsuccessfulOperation {\n");
            sb.Append("  ErrorCode: ").Append(ErrorCode).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UnsuccessfulOperation)obj);
        }

        /// <summary>
        /// Returns true if UnsuccessfulOperation instances are equal
        /// </summary>
        /// <param name="other">Instance of UnsuccessfulOperation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UnsuccessfulOperation other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ErrorCode == other.ErrorCode ||
                    ErrorCode != null &&
                    ErrorCode.Equals(other.ErrorCode)
                ) && 
                (
                    Message == other.Message ||
                    Message != null &&
                    Message.Equals(other.Message)
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
                    if (ErrorCode != null)
                    hashCode = hashCode * 59 + ErrorCode.GetHashCode();
                    if (Message != null)
                    hashCode = hashCode * 59 + Message.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UnsuccessfulOperation left, UnsuccessfulOperation right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UnsuccessfulOperation left, UnsuccessfulOperation right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
