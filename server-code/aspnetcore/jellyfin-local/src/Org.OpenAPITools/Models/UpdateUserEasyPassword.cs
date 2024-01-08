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
    /// The update user easy password request body.
    /// </summary>
    [DataContract]
    public partial class UpdateUserEasyPassword : IEquatable<UpdateUserEasyPassword>
    {
        /// <summary>
        /// Gets or sets the new sha1-hashed password.
        /// </summary>
        /// <value>Gets or sets the new sha1-hashed password.</value>
        [DataMember(Name="NewPassword", EmitDefaultValue=true)]
        public string NewPassword { get; set; }

        /// <summary>
        /// Gets or sets the new password.
        /// </summary>
        /// <value>Gets or sets the new password.</value>
        [DataMember(Name="NewPw", EmitDefaultValue=true)]
        public string NewPw { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether to reset the password.
        /// </summary>
        /// <value>Gets or sets a value indicating whether to reset the password.</value>
        [DataMember(Name="ResetPassword", EmitDefaultValue=true)]
        public bool ResetPassword { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdateUserEasyPassword {\n");
            sb.Append("  NewPassword: ").Append(NewPassword).Append("\n");
            sb.Append("  NewPw: ").Append(NewPw).Append("\n");
            sb.Append("  ResetPassword: ").Append(ResetPassword).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UpdateUserEasyPassword)obj);
        }

        /// <summary>
        /// Returns true if UpdateUserEasyPassword instances are equal
        /// </summary>
        /// <param name="other">Instance of UpdateUserEasyPassword to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdateUserEasyPassword other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    NewPassword == other.NewPassword ||
                    NewPassword != null &&
                    NewPassword.Equals(other.NewPassword)
                ) && 
                (
                    NewPw == other.NewPw ||
                    NewPw != null &&
                    NewPw.Equals(other.NewPw)
                ) && 
                (
                    ResetPassword == other.ResetPassword ||
                    
                    ResetPassword.Equals(other.ResetPassword)
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
                    if (NewPassword != null)
                    hashCode = hashCode * 59 + NewPassword.GetHashCode();
                    if (NewPw != null)
                    hashCode = hashCode * 59 + NewPw.GetHashCode();
                    
                    hashCode = hashCode * 59 + ResetPassword.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UpdateUserEasyPassword left, UpdateUserEasyPassword right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UpdateUserEasyPassword left, UpdateUserEasyPassword right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
