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
    public partial class GeneralCommand : IEquatable<GeneralCommand>
    {
        /// <summary>
        /// Gets or Sets Arguments
        /// </summary>
        [DataMember(Name="Arguments", EmitDefaultValue=true)]
        public Dictionary<string, string> Arguments { get; set; }

        /// <summary>
        /// Gets or Sets ControllingUserId
        /// </summary>
        [DataMember(Name="ControllingUserId", EmitDefaultValue=false)]
        public Guid ControllingUserId { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=true)]
        public GeneralCommandType Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GeneralCommand {\n");
            sb.Append("  Arguments: ").Append(Arguments).Append("\n");
            sb.Append("  ControllingUserId: ").Append(ControllingUserId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GeneralCommand)obj);
        }

        /// <summary>
        /// Returns true if GeneralCommand instances are equal
        /// </summary>
        /// <param name="other">Instance of GeneralCommand to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GeneralCommand other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Arguments == other.Arguments ||
                    Arguments != null &&
                    other.Arguments != null &&
                    Arguments.SequenceEqual(other.Arguments)
                ) && 
                (
                    ControllingUserId == other.ControllingUserId ||
                    ControllingUserId != null &&
                    ControllingUserId.Equals(other.ControllingUserId)
                ) && 
                (
                    Name == other.Name ||
                    
                    Name.Equals(other.Name)
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
                    if (Arguments != null)
                    hashCode = hashCode * 59 + Arguments.GetHashCode();
                    if (ControllingUserId != null)
                    hashCode = hashCode * 59 + ControllingUserId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Name.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GeneralCommand left, GeneralCommand right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GeneralCommand left, GeneralCommand right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
