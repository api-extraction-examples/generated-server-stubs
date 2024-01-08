/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
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
    public partial class ProjectBriefResponse : IEquatable<ProjectBriefResponse>
    {
        /// <summary>
        /// Globally unique identifier of the resource, as a string.
        /// </summary>
        /// <value>Globally unique identifier of the resource, as a string.</value>
        /// <example>12345</example>
        [DataMember(Name="gid", EmitDefaultValue=false)]
        public string Gid { get; set; }

        /// <summary>
        /// The base type of this resource.
        /// </summary>
        /// <value>The base type of this resource.</value>
        /// <example>task</example>
        [DataMember(Name="resource_type", EmitDefaultValue=false)]
        public string ResourceType { get; set; }

        /// <summary>
        /// HTML formatted text for the project brief.
        /// </summary>
        /// <value>HTML formatted text for the project brief.</value>
        /// <example>&lt;body&gt;This is a &lt;strong&gt;project brief&lt;/strong&gt;.&lt;/body&gt;</example>
        [DataMember(Name="html_text", EmitDefaultValue=false)]
        public string HtmlText { get; set; }

        /// <summary>
        /// The title of the project brief.
        /// </summary>
        /// <value>The title of the project brief.</value>
        /// <example>Stuff to buy — Project Brief</example>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// A url that points directly to the object within Asana.
        /// </summary>
        /// <value>A url that points directly to the object within Asana.</value>
        /// <example>https://app.asana.com/0/11111111/22222222</example>
        [DataMember(Name="permalink_url", EmitDefaultValue=false)]
        public string PermalinkUrl { get; set; }

        /// <summary>
        /// Gets or Sets Project
        /// </summary>
        [DataMember(Name="project", EmitDefaultValue=false)]
        public ProjectBriefResponseAllOfProject Project { get; set; }

        /// <summary>
        /// [Opt In](/docs/input-output-options). The plain text of the project brief.
        /// </summary>
        /// <value>[Opt In](/docs/input-output-options). The plain text of the project brief.</value>
        /// <example>This is a project brief.</example>
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProjectBriefResponse {\n");
            sb.Append("  Gid: ").Append(Gid).Append("\n");
            sb.Append("  ResourceType: ").Append(ResourceType).Append("\n");
            sb.Append("  HtmlText: ").Append(HtmlText).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  PermalinkUrl: ").Append(PermalinkUrl).Append("\n");
            sb.Append("  Project: ").Append(Project).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ProjectBriefResponse)obj);
        }

        /// <summary>
        /// Returns true if ProjectBriefResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of ProjectBriefResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProjectBriefResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Gid == other.Gid ||
                    Gid != null &&
                    Gid.Equals(other.Gid)
                ) && 
                (
                    ResourceType == other.ResourceType ||
                    ResourceType != null &&
                    ResourceType.Equals(other.ResourceType)
                ) && 
                (
                    HtmlText == other.HtmlText ||
                    HtmlText != null &&
                    HtmlText.Equals(other.HtmlText)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
                ) && 
                (
                    PermalinkUrl == other.PermalinkUrl ||
                    PermalinkUrl != null &&
                    PermalinkUrl.Equals(other.PermalinkUrl)
                ) && 
                (
                    Project == other.Project ||
                    Project != null &&
                    Project.Equals(other.Project)
                ) && 
                (
                    Text == other.Text ||
                    Text != null &&
                    Text.Equals(other.Text)
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
                    if (Gid != null)
                    hashCode = hashCode * 59 + Gid.GetHashCode();
                    if (ResourceType != null)
                    hashCode = hashCode * 59 + ResourceType.GetHashCode();
                    if (HtmlText != null)
                    hashCode = hashCode * 59 + HtmlText.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                    if (PermalinkUrl != null)
                    hashCode = hashCode * 59 + PermalinkUrl.GetHashCode();
                    if (Project != null)
                    hashCode = hashCode * 59 + Project.GetHashCode();
                    if (Text != null)
                    hashCode = hashCode * 59 + Text.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ProjectBriefResponse left, ProjectBriefResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProjectBriefResponse left, ProjectBriefResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
