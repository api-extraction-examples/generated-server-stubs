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
    /// Details of a worklog.
    /// </summary>
    [DataContract]
    public partial class Worklog : IEquatable<Worklog>
    {
        /// <summary>
        /// Gets or Sets Author
        /// </summary>
        [DataMember(Name="author", EmitDefaultValue=false)]
        public WorklogAuthor Author { get; set; }

        /// <summary>
        /// A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.
        /// </summary>
        /// <value>A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.</value>
        [DataMember(Name="comment", EmitDefaultValue=true)]
        public Object Comment { get; set; }

        /// <summary>
        /// The datetime on which the worklog was created.
        /// </summary>
        /// <value>The datetime on which the worklog was created.</value>
        [DataMember(Name="created", EmitDefaultValue=false)]
        public DateTime Created { get; set; }

        /// <summary>
        /// The ID of the worklog record.
        /// </summary>
        /// <value>The ID of the worklog record.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The ID of the issue this worklog is for.
        /// </summary>
        /// <value>The ID of the issue this worklog is for.</value>
        [DataMember(Name="issueId", EmitDefaultValue=false)]
        public string IssueId { get; set; }

        /// <summary>
        /// Details of properties for the worklog. Optional when creating or updating a worklog.
        /// </summary>
        /// <value>Details of properties for the worklog. Optional when creating or updating a worklog.</value>
        [DataMember(Name="properties", EmitDefaultValue=false)]
        public List<EntityProperty> Properties { get; set; }

        /// <summary>
        /// The URL of the worklog item.
        /// </summary>
        /// <value>The URL of the worklog item.</value>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public string Self { get; set; }

        /// <summary>
        /// The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog.
        /// </summary>
        /// <value>The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog.</value>
        [DataMember(Name="started", EmitDefaultValue=false)]
        public DateTime Started { get; set; }

        /// <summary>
        /// The time spent working on the issue as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). Required when creating a worklog if &#x60;timeSpentSeconds&#x60; isn&#39;t provided. Optional when updating a worklog. Cannot be provided if &#x60;timeSpentSecond&#x60; is provided.
        /// </summary>
        /// <value>The time spent working on the issue as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). Required when creating a worklog if &#x60;timeSpentSeconds&#x60; isn&#39;t provided. Optional when updating a worklog. Cannot be provided if &#x60;timeSpentSecond&#x60; is provided.</value>
        [DataMember(Name="timeSpent", EmitDefaultValue=false)]
        public string TimeSpent { get; set; }

        /// <summary>
        /// The time in seconds spent working on the issue. Required when creating a worklog if &#x60;timeSpent&#x60; isn&#39;t provided. Optional when updating a worklog. Cannot be provided if &#x60;timeSpent&#x60; is provided.
        /// </summary>
        /// <value>The time in seconds spent working on the issue. Required when creating a worklog if &#x60;timeSpent&#x60; isn&#39;t provided. Optional when updating a worklog. Cannot be provided if &#x60;timeSpent&#x60; is provided.</value>
        [DataMember(Name="timeSpentSeconds", EmitDefaultValue=true)]
        public long TimeSpentSeconds { get; set; }

        /// <summary>
        /// Gets or Sets UpdateAuthor
        /// </summary>
        [DataMember(Name="updateAuthor", EmitDefaultValue=false)]
        public WorklogUpdateAuthor UpdateAuthor { get; set; }

        /// <summary>
        /// The datetime on which the worklog was last updated.
        /// </summary>
        /// <value>The datetime on which the worklog was last updated.</value>
        [DataMember(Name="updated", EmitDefaultValue=false)]
        public DateTime Updated { get; set; }

        /// <summary>
        /// Gets or Sets Visibility
        /// </summary>
        [DataMember(Name="visibility", EmitDefaultValue=false)]
        public Visibility Visibility { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Worklog {\n");
            sb.Append("  Author: ").Append(Author).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IssueId: ").Append(IssueId).Append("\n");
            sb.Append("  Properties: ").Append(Properties).Append("\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  Started: ").Append(Started).Append("\n");
            sb.Append("  TimeSpent: ").Append(TimeSpent).Append("\n");
            sb.Append("  TimeSpentSeconds: ").Append(TimeSpentSeconds).Append("\n");
            sb.Append("  UpdateAuthor: ").Append(UpdateAuthor).Append("\n");
            sb.Append("  Updated: ").Append(Updated).Append("\n");
            sb.Append("  Visibility: ").Append(Visibility).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Worklog)obj);
        }

        /// <summary>
        /// Returns true if Worklog instances are equal
        /// </summary>
        /// <param name="other">Instance of Worklog to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Worklog other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Author == other.Author ||
                    Author != null &&
                    Author.Equals(other.Author)
                ) && 
                (
                    Comment == other.Comment ||
                    Comment != null &&
                    Comment.Equals(other.Comment)
                ) && 
                (
                    Created == other.Created ||
                    Created != null &&
                    Created.Equals(other.Created)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    IssueId == other.IssueId ||
                    IssueId != null &&
                    IssueId.Equals(other.IssueId)
                ) && 
                (
                    Properties == other.Properties ||
                    Properties != null &&
                    other.Properties != null &&
                    Properties.SequenceEqual(other.Properties)
                ) && 
                (
                    Self == other.Self ||
                    Self != null &&
                    Self.Equals(other.Self)
                ) && 
                (
                    Started == other.Started ||
                    Started != null &&
                    Started.Equals(other.Started)
                ) && 
                (
                    TimeSpent == other.TimeSpent ||
                    TimeSpent != null &&
                    TimeSpent.Equals(other.TimeSpent)
                ) && 
                (
                    TimeSpentSeconds == other.TimeSpentSeconds ||
                    
                    TimeSpentSeconds.Equals(other.TimeSpentSeconds)
                ) && 
                (
                    UpdateAuthor == other.UpdateAuthor ||
                    UpdateAuthor != null &&
                    UpdateAuthor.Equals(other.UpdateAuthor)
                ) && 
                (
                    Updated == other.Updated ||
                    Updated != null &&
                    Updated.Equals(other.Updated)
                ) && 
                (
                    Visibility == other.Visibility ||
                    Visibility != null &&
                    Visibility.Equals(other.Visibility)
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
                    if (Author != null)
                    hashCode = hashCode * 59 + Author.GetHashCode();
                    if (Comment != null)
                    hashCode = hashCode * 59 + Comment.GetHashCode();
                    if (Created != null)
                    hashCode = hashCode * 59 + Created.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (IssueId != null)
                    hashCode = hashCode * 59 + IssueId.GetHashCode();
                    if (Properties != null)
                    hashCode = hashCode * 59 + Properties.GetHashCode();
                    if (Self != null)
                    hashCode = hashCode * 59 + Self.GetHashCode();
                    if (Started != null)
                    hashCode = hashCode * 59 + Started.GetHashCode();
                    if (TimeSpent != null)
                    hashCode = hashCode * 59 + TimeSpent.GetHashCode();
                    
                    hashCode = hashCode * 59 + TimeSpentSeconds.GetHashCode();
                    if (UpdateAuthor != null)
                    hashCode = hashCode * 59 + UpdateAuthor.GetHashCode();
                    if (Updated != null)
                    hashCode = hashCode * 59 + Updated.GetHashCode();
                    if (Visibility != null)
                    hashCode = hashCode * 59 + Visibility.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Worklog left, Worklog right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Worklog left, Worklog right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}