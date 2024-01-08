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
    public partial class ConnectWorkflowTransitionRule : IEquatable<ConnectWorkflowTransitionRule>
    {
        /// <summary>
        /// Gets or Sets VarConfiguration
        /// </summary>
        [Required]
        [DataMember(Name="configuration", EmitDefaultValue=false)]
        public RuleConfiguration VarConfiguration { get; set; }

        /// <summary>
        /// The ID of the transition rule.
        /// </summary>
        /// <value>The ID of the transition rule.</value>
        /// <example>123</example>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The key of the rule, as defined in the Connect app descriptor.
        /// </summary>
        /// <value>The key of the rule, as defined in the Connect app descriptor.</value>
        /// <example>WorkflowKey</example>
        [Required]
        [DataMember(Name="key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// Gets or Sets Transition
        /// </summary>
        [DataMember(Name="transition", EmitDefaultValue=false)]
        public WorkflowTransition Transition { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConnectWorkflowTransitionRule {\n");
            sb.Append("  VarConfiguration: ").Append(VarConfiguration).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Transition: ").Append(Transition).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ConnectWorkflowTransitionRule)obj);
        }

        /// <summary>
        /// Returns true if ConnectWorkflowTransitionRule instances are equal
        /// </summary>
        /// <param name="other">Instance of ConnectWorkflowTransitionRule to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConnectWorkflowTransitionRule other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    VarConfiguration == other.VarConfiguration ||
                    VarConfiguration != null &&
                    VarConfiguration.Equals(other.VarConfiguration)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Key == other.Key ||
                    Key != null &&
                    Key.Equals(other.Key)
                ) && 
                (
                    Transition == other.Transition ||
                    Transition != null &&
                    Transition.Equals(other.Transition)
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
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Key != null)
                    hashCode = hashCode * 59 + Key.GetHashCode();
                    if (Transition != null)
                    hashCode = hashCode * 59 + Transition.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ConnectWorkflowTransitionRule left, ConnectWorkflowTransitionRule right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ConnectWorkflowTransitionRule left, ConnectWorkflowTransitionRule right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
