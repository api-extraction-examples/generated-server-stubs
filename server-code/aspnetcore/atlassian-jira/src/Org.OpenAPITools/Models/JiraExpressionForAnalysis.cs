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
    /// Details of Jira expressions for analysis.
    /// </summary>
    [DataContract]
    public partial class JiraExpressionForAnalysis : IEquatable<JiraExpressionForAnalysis>
    {
        /// <summary>
        /// Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as &#x60;issue&#x60; or &#x60;project&#x60;, are available in context and sets their type. Use this property to override the default types or provide details of new variables.
        /// </summary>
        /// <value>Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as &#x60;issue&#x60; or &#x60;project&#x60;, are available in context and sets their type. Use this property to override the default types or provide details of new variables.</value>
        [DataMember(Name="contextVariables", EmitDefaultValue=false)]
        public Dictionary<string, string> ContextVariables { get; set; }

        /// <summary>
        /// The list of Jira expressions to analyse.
        /// </summary>
        /// <value>The list of Jira expressions to analyse.</value>
        /// <example>issues.map(issue &#x3D;&gt; issue.properties[&#39;property_key&#39;])</example>
        [Required]
        [DataMember(Name="expressions", EmitDefaultValue=false)]
        public List<string> Expressions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class JiraExpressionForAnalysis {\n");
            sb.Append("  ContextVariables: ").Append(ContextVariables).Append("\n");
            sb.Append("  Expressions: ").Append(Expressions).Append("\n");
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
            return obj.GetType() == GetType() && Equals((JiraExpressionForAnalysis)obj);
        }

        /// <summary>
        /// Returns true if JiraExpressionForAnalysis instances are equal
        /// </summary>
        /// <param name="other">Instance of JiraExpressionForAnalysis to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(JiraExpressionForAnalysis other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ContextVariables == other.ContextVariables ||
                    ContextVariables != null &&
                    other.ContextVariables != null &&
                    ContextVariables.SequenceEqual(other.ContextVariables)
                ) && 
                (
                    Expressions == other.Expressions ||
                    Expressions != null &&
                    other.Expressions != null &&
                    Expressions.SequenceEqual(other.Expressions)
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
                    if (ContextVariables != null)
                    hashCode = hashCode * 59 + ContextVariables.GetHashCode();
                    if (Expressions != null)
                    hashCode = hashCode * 59 + Expressions.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(JiraExpressionForAnalysis left, JiraExpressionForAnalysis right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(JiraExpressionForAnalysis left, JiraExpressionForAnalysis right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}