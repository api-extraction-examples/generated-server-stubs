/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
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
    /// A workflow transition rule.
    /// </summary>
    [DataContract]
    public partial class CreateWorkflowTransitionRule : IEquatable<CreateWorkflowTransitionRule>
    {
        /// <summary>
        /// EXPERIMENTAL. The configuration of the transition rule.
        /// </summary>
        /// <value>EXPERIMENTAL. The configuration of the transition rule.</value>
        [DataMember(Name="configuration", EmitDefaultValue=false)]
        public Dictionary<string, Object> VarConfiguration { get; set; }

        /// <summary>
        /// The type of the transition rule.
        /// </summary>
        /// <value>The type of the transition rule.</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateWorkflowTransitionRule {\n");
            sb.Append("  VarConfiguration: ").Append(VarConfiguration).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CreateWorkflowTransitionRule)obj);
        }

        /// <summary>
        /// Returns true if CreateWorkflowTransitionRule instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateWorkflowTransitionRule to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateWorkflowTransitionRule other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    VarConfiguration == other.VarConfiguration ||
                    VarConfiguration != null &&
                    other.VarConfiguration != null &&
                    VarConfiguration.SequenceEqual(other.VarConfiguration)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
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
                    if (VarConfiguration != null)
                    hashCode = hashCode * 59 + VarConfiguration.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateWorkflowTransitionRule left, CreateWorkflowTransitionRule right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateWorkflowTransitionRule left, CreateWorkflowTransitionRule right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
