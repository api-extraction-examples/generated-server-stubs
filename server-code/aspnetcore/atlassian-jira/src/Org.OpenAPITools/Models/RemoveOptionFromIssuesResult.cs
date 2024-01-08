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
    /// 
    /// </summary>
    [DataContract]
    public partial class RemoveOptionFromIssuesResult : IEquatable<RemoveOptionFromIssuesResult>
    {
        /// <summary>
        /// Gets or Sets Errors
        /// </summary>
        [DataMember(Name="errors", EmitDefaultValue=false)]
        public SimpleErrorCollection Errors { get; set; }

        /// <summary>
        /// The IDs of the modified issues.
        /// </summary>
        /// <value>The IDs of the modified issues.</value>
        [DataMember(Name="modifiedIssues", EmitDefaultValue=false)]
        public List<long> ModifiedIssues { get; set; }

        /// <summary>
        /// The IDs of the unchanged issues, those issues where errors prevent modification.
        /// </summary>
        /// <value>The IDs of the unchanged issues, those issues where errors prevent modification.</value>
        [DataMember(Name="unmodifiedIssues", EmitDefaultValue=false)]
        public List<long> UnmodifiedIssues { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RemoveOptionFromIssuesResult {\n");
            sb.Append("  Errors: ").Append(Errors).Append("\n");
            sb.Append("  ModifiedIssues: ").Append(ModifiedIssues).Append("\n");
            sb.Append("  UnmodifiedIssues: ").Append(UnmodifiedIssues).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RemoveOptionFromIssuesResult)obj);
        }

        /// <summary>
        /// Returns true if RemoveOptionFromIssuesResult instances are equal
        /// </summary>
        /// <param name="other">Instance of RemoveOptionFromIssuesResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RemoveOptionFromIssuesResult other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Errors == other.Errors ||
                    Errors != null &&
                    Errors.Equals(other.Errors)
                ) && 
                (
                    ModifiedIssues == other.ModifiedIssues ||
                    ModifiedIssues != null &&
                    other.ModifiedIssues != null &&
                    ModifiedIssues.SequenceEqual(other.ModifiedIssues)
                ) && 
                (
                    UnmodifiedIssues == other.UnmodifiedIssues ||
                    UnmodifiedIssues != null &&
                    other.UnmodifiedIssues != null &&
                    UnmodifiedIssues.SequenceEqual(other.UnmodifiedIssues)
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
                    if (Errors != null)
                    hashCode = hashCode * 59 + Errors.GetHashCode();
                    if (ModifiedIssues != null)
                    hashCode = hashCode * 59 + ModifiedIssues.GetHashCode();
                    if (UnmodifiedIssues != null)
                    hashCode = hashCode * 59 + UnmodifiedIssues.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RemoveOptionFromIssuesResult left, RemoveOptionFromIssuesResult right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RemoveOptionFromIssuesResult left, RemoveOptionFromIssuesResult right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}