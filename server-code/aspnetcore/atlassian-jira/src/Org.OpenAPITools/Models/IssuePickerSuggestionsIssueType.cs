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
    /// A type of issue suggested for use in auto-completion.
    /// </summary>
    [DataContract]
    public partial class IssuePickerSuggestionsIssueType : IEquatable<IssuePickerSuggestionsIssueType>
    {
        /// <summary>
        /// The ID of the type of issues suggested for use in auto-completion.
        /// </summary>
        /// <value>The ID of the type of issues suggested for use in auto-completion.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// A list of issues suggested for use in auto-completion.
        /// </summary>
        /// <value>A list of issues suggested for use in auto-completion.</value>
        [DataMember(Name="issues", EmitDefaultValue=false)]
        public List<SuggestedIssue> Issues { get; set; }

        /// <summary>
        /// The label of the type of issues suggested for use in auto-completion.
        /// </summary>
        /// <value>The label of the type of issues suggested for use in auto-completion.</value>
        [DataMember(Name="label", EmitDefaultValue=false)]
        public string Label { get; set; }

        /// <summary>
        /// If no issue suggestions are found, returns a message indicating no suggestions were found,
        /// </summary>
        /// <value>If no issue suggestions are found, returns a message indicating no suggestions were found,</value>
        [DataMember(Name="msg", EmitDefaultValue=false)]
        public string Msg { get; set; }

        /// <summary>
        /// If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.
        /// </summary>
        /// <value>If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.</value>
        [DataMember(Name="sub", EmitDefaultValue=false)]
        public string Sub { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IssuePickerSuggestionsIssueType {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Issues: ").Append(Issues).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  Msg: ").Append(Msg).Append("\n");
            sb.Append("  Sub: ").Append(Sub).Append("\n");
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
            return obj.GetType() == GetType() && Equals((IssuePickerSuggestionsIssueType)obj);
        }

        /// <summary>
        /// Returns true if IssuePickerSuggestionsIssueType instances are equal
        /// </summary>
        /// <param name="other">Instance of IssuePickerSuggestionsIssueType to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IssuePickerSuggestionsIssueType other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Issues == other.Issues ||
                    Issues != null &&
                    other.Issues != null &&
                    Issues.SequenceEqual(other.Issues)
                ) && 
                (
                    Label == other.Label ||
                    Label != null &&
                    Label.Equals(other.Label)
                ) && 
                (
                    Msg == other.Msg ||
                    Msg != null &&
                    Msg.Equals(other.Msg)
                ) && 
                (
                    Sub == other.Sub ||
                    Sub != null &&
                    Sub.Equals(other.Sub)
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
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Issues != null)
                    hashCode = hashCode * 59 + Issues.GetHashCode();
                    if (Label != null)
                    hashCode = hashCode * 59 + Label.GetHashCode();
                    if (Msg != null)
                    hashCode = hashCode * 59 + Msg.GetHashCode();
                    if (Sub != null)
                    hashCode = hashCode * 59 + Sub.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IssuePickerSuggestionsIssueType left, IssuePickerSuggestionsIssueType right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IssuePickerSuggestionsIssueType left, IssuePickerSuggestionsIssueType right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}