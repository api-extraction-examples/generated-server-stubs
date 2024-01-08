/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.4.1
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
    public partial class ErrorResponseErrorsInnerSource : IEquatable<ErrorResponseErrorsInnerSource>
    {
        /// <summary>
        /// Gets or Sets Pointer
        /// </summary>
        [DataMember(Name="pointer", EmitDefaultValue=false)]
        public string Pointer { get; set; }

        /// <summary>
        /// Gets or Sets VarParameter
        /// </summary>
        [DataMember(Name="parameter", EmitDefaultValue=false)]
        public string VarParameter { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ErrorResponseErrorsInnerSource {\n");
            sb.Append("  Pointer: ").Append(Pointer).Append("\n");
            sb.Append("  VarParameter: ").Append(VarParameter).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ErrorResponseErrorsInnerSource)obj);
        }

        /// <summary>
        /// Returns true if ErrorResponseErrorsInnerSource instances are equal
        /// </summary>
        /// <param name="other">Instance of ErrorResponseErrorsInnerSource to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ErrorResponseErrorsInnerSource other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Pointer == other.Pointer ||
                    Pointer != null &&
                    Pointer.Equals(other.Pointer)
                ) && 
                (
                    VarParameter == other.VarParameter ||
                    VarParameter != null &&
                    VarParameter.Equals(other.VarParameter)
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
                    if (Pointer != null)
                    hashCode = hashCode * 59 + Pointer.GetHashCode();
                    if (VarParameter != null)
                    hashCode = hashCode * 59 + VarParameter.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ErrorResponseErrorsInnerSource left, ErrorResponseErrorsInnerSource right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ErrorResponseErrorsInnerSource left, ErrorResponseErrorsInnerSource right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
