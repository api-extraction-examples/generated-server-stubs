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
    /// Metadata for an issue attachment.
    /// </summary>
    [DataContract]
    public partial class AttachmentMetadata : IEquatable<AttachmentMetadata>
    {
        /// <summary>
        /// Gets or Sets Author
        /// </summary>
        [DataMember(Name="author", EmitDefaultValue=false)]
        public AttachmentMetadataAuthor Author { get; set; }

        /// <summary>
        /// The URL of the attachment.
        /// </summary>
        /// <value>The URL of the attachment.</value>
        [DataMember(Name="content", EmitDefaultValue=false)]
        public string Content { get; set; }

        /// <summary>
        /// The datetime the attachment was created.
        /// </summary>
        /// <value>The datetime the attachment was created.</value>
        [DataMember(Name="created", EmitDefaultValue=false)]
        public DateTime Created { get; set; }

        /// <summary>
        /// The name of the attachment file.
        /// </summary>
        /// <value>The name of the attachment file.</value>
        [DataMember(Name="filename", EmitDefaultValue=false)]
        public string Filename { get; set; }

        /// <summary>
        /// The ID of the attachment.
        /// </summary>
        /// <value>The ID of the attachment.</value>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public long Id { get; set; }

        /// <summary>
        /// The MIME type of the attachment.
        /// </summary>
        /// <value>The MIME type of the attachment.</value>
        [DataMember(Name="mimeType", EmitDefaultValue=false)]
        public string MimeType { get; set; }

        /// <summary>
        /// Additional properties of the attachment.
        /// </summary>
        /// <value>Additional properties of the attachment.</value>
        [DataMember(Name="properties", EmitDefaultValue=false)]
        public Dictionary<string, Object> Properties { get; set; }

        /// <summary>
        /// The URL of the attachment metadata details.
        /// </summary>
        /// <value>The URL of the attachment metadata details.</value>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public string Self { get; set; }

        /// <summary>
        /// The size of the attachment.
        /// </summary>
        /// <value>The size of the attachment.</value>
        [DataMember(Name="size", EmitDefaultValue=true)]
        public long Size { get; set; }

        /// <summary>
        /// The URL of a thumbnail representing the attachment.
        /// </summary>
        /// <value>The URL of a thumbnail representing the attachment.</value>
        [DataMember(Name="thumbnail", EmitDefaultValue=false)]
        public string Thumbnail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AttachmentMetadata {\n");
            sb.Append("  Author: ").Append(Author).Append("\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  Filename: ").Append(Filename).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  MimeType: ").Append(MimeType).Append("\n");
            sb.Append("  Properties: ").Append(Properties).Append("\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  Thumbnail: ").Append(Thumbnail).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AttachmentMetadata)obj);
        }

        /// <summary>
        /// Returns true if AttachmentMetadata instances are equal
        /// </summary>
        /// <param name="other">Instance of AttachmentMetadata to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AttachmentMetadata other)
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
                    Content == other.Content ||
                    Content != null &&
                    Content.Equals(other.Content)
                ) && 
                (
                    Created == other.Created ||
                    Created != null &&
                    Created.Equals(other.Created)
                ) && 
                (
                    Filename == other.Filename ||
                    Filename != null &&
                    Filename.Equals(other.Filename)
                ) && 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    MimeType == other.MimeType ||
                    MimeType != null &&
                    MimeType.Equals(other.MimeType)
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
                    Size == other.Size ||
                    
                    Size.Equals(other.Size)
                ) && 
                (
                    Thumbnail == other.Thumbnail ||
                    Thumbnail != null &&
                    Thumbnail.Equals(other.Thumbnail)
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
                    if (Content != null)
                    hashCode = hashCode * 59 + Content.GetHashCode();
                    if (Created != null)
                    hashCode = hashCode * 59 + Created.GetHashCode();
                    if (Filename != null)
                    hashCode = hashCode * 59 + Filename.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (MimeType != null)
                    hashCode = hashCode * 59 + MimeType.GetHashCode();
                    if (Properties != null)
                    hashCode = hashCode * 59 + Properties.GetHashCode();
                    if (Self != null)
                    hashCode = hashCode * 59 + Self.GetHashCode();
                    
                    hashCode = hashCode * 59 + Size.GetHashCode();
                    if (Thumbnail != null)
                    hashCode = hashCode * 59 + Thumbnail.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AttachmentMetadata left, AttachmentMetadata right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AttachmentMetadata left, AttachmentMetadata right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}