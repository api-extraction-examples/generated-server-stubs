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
    /// The scope where this workflow applies
    /// </summary>
    [DataContract]
    public partial class DeprecatedWorkflowScope : IEquatable<DeprecatedWorkflowScope>
    {
        /// <summary>
        /// Gets or Sets Project
        /// </summary>
        [DataMember(Name="project", EmitDefaultValue=false)]
        public ScopeProject Project { get; set; }


        /// <summary>
        /// The type of scope.
        /// </summary>
        /// <value>The type of scope.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum PROJECTEnum for PROJECT
            /// </summary>
            [EnumMember(Value = "PROJECT")]
            PROJECTEnum = 1,
            
            /// <summary>
            /// Enum TEMPLATEEnum for TEMPLATE
            /// </summary>
            [EnumMember(Value = "TEMPLATE")]
            TEMPLATEEnum = 2
        }

        /// <summary>
        /// The type of scope.
        /// </summary>
        /// <value>The type of scope.</value>
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DeprecatedWorkflowScope {\n");
            sb.Append("  Project: ").Append(Project).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DeprecatedWorkflowScope)obj);
        }

        /// <summary>
        /// Returns true if DeprecatedWorkflowScope instances are equal
        /// </summary>
        /// <param name="other">Instance of DeprecatedWorkflowScope to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DeprecatedWorkflowScope other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Project == other.Project ||
                    Project != null &&
                    Project.Equals(other.Project)
                ) && 
                (
                    Type == other.Type ||
                    
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
                    if (Project != null)
                    hashCode = hashCode * 59 + Project.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DeprecatedWorkflowScope left, DeprecatedWorkflowScope right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DeprecatedWorkflowScope left, DeprecatedWorkflowScope right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
