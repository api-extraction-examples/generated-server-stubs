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
    /// A collection of rich text that will be displayed as a preview to another app.  This is read-only except for a small group of whitelisted apps.
    /// </summary>
    [DataContract]
    public partial class Preview : IEquatable<Preview>
    {
        /// <summary>
        /// Some fallback text to display if unable to display the full preview.
        /// </summary>
        /// <value>Some fallback text to display if unable to display the full preview.</value>
        /// <example>Greg: Great! I like this idea.\n\nhttps//a_company.slack.com/archives/ABCDEFG/12345678</example>
        [DataMember(Name="fallback", EmitDefaultValue=false)]
        public string Fallback { get; set; }

        /// <summary>
        /// Text to display in the footer.
        /// </summary>
        /// <value>Text to display in the footer.</value>
        /// <example>Mar 17, 2019 1:25 PM</example>
        [DataMember(Name="footer", EmitDefaultValue=false)]
        public string Footer { get; set; }

        /// <summary>
        /// Text to display in the header.
        /// </summary>
        /// <value>Text to display in the header.</value>
        /// <example>Asana for Slack</example>
        [DataMember(Name="header", EmitDefaultValue=false)]
        public string Header { get; set; }

        /// <summary>
        /// Where the header will link to.
        /// </summary>
        /// <value>Where the header will link to.</value>
        /// <example>https://asana.comn/apps/slack</example>
        [DataMember(Name="header_link", EmitDefaultValue=false)]
        public string HeaderLink { get; set; }

        /// <summary>
        /// HTML formatted text for the body of the preview.
        /// </summary>
        /// <value>HTML formatted text for the body of the preview.</value>
        /// <example>&lt;body&gt;Great! I like this idea.&lt;/body&gt;</example>
        [DataMember(Name="html_text", EmitDefaultValue=false)]
        public string HtmlText { get; set; }

        /// <summary>
        /// Text for the body of the preview.
        /// </summary>
        /// <value>Text for the body of the preview.</value>
        /// <example>Great! I like this idea.</example>
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; set; }

        /// <summary>
        /// Text to display as the title.
        /// </summary>
        /// <value>Text to display as the title.</value>
        /// <example>Greg</example>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Where to title will link to.
        /// </summary>
        /// <value>Where to title will link to.</value>
        /// <example>https://asana.slack.com/archives/ABCDEFG/12345678</example>
        [DataMember(Name="title_link", EmitDefaultValue=false)]
        public string TitleLink { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Preview {\n");
            sb.Append("  Fallback: ").Append(Fallback).Append("\n");
            sb.Append("  Footer: ").Append(Footer).Append("\n");
            sb.Append("  Header: ").Append(Header).Append("\n");
            sb.Append("  HeaderLink: ").Append(HeaderLink).Append("\n");
            sb.Append("  HtmlText: ").Append(HtmlText).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  TitleLink: ").Append(TitleLink).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Preview)obj);
        }

        /// <summary>
        /// Returns true if Preview instances are equal
        /// </summary>
        /// <param name="other">Instance of Preview to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Preview other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Fallback == other.Fallback ||
                    Fallback != null &&
                    Fallback.Equals(other.Fallback)
                ) && 
                (
                    Footer == other.Footer ||
                    Footer != null &&
                    Footer.Equals(other.Footer)
                ) && 
                (
                    Header == other.Header ||
                    Header != null &&
                    Header.Equals(other.Header)
                ) && 
                (
                    HeaderLink == other.HeaderLink ||
                    HeaderLink != null &&
                    HeaderLink.Equals(other.HeaderLink)
                ) && 
                (
                    HtmlText == other.HtmlText ||
                    HtmlText != null &&
                    HtmlText.Equals(other.HtmlText)
                ) && 
                (
                    Text == other.Text ||
                    Text != null &&
                    Text.Equals(other.Text)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
                ) && 
                (
                    TitleLink == other.TitleLink ||
                    TitleLink != null &&
                    TitleLink.Equals(other.TitleLink)
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
                    if (Fallback != null)
                    hashCode = hashCode * 59 + Fallback.GetHashCode();
                    if (Footer != null)
                    hashCode = hashCode * 59 + Footer.GetHashCode();
                    if (Header != null)
                    hashCode = hashCode * 59 + Header.GetHashCode();
                    if (HeaderLink != null)
                    hashCode = hashCode * 59 + HeaderLink.GetHashCode();
                    if (HtmlText != null)
                    hashCode = hashCode * 59 + HtmlText.GetHashCode();
                    if (Text != null)
                    hashCode = hashCode * 59 + Text.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                    if (TitleLink != null)
                    hashCode = hashCode * 59 + TitleLink.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Preview left, Preview right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Preview left, Preview right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
