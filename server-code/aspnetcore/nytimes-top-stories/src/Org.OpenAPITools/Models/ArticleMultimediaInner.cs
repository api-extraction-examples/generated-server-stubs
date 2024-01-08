/*
 * Top Stories
 *
 * The Top Stories API provides lists of articles and associated images by section.
 *
 * The version of the OpenAPI document: 2.0.0
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
    public partial class ArticleMultimediaInner : IEquatable<ArticleMultimediaInner>
    {
        /// <summary>
        /// Gets or Sets Caption
        /// </summary>
        [DataMember(Name="caption", EmitDefaultValue=false)]
        public string Caption { get; set; }

        /// <summary>
        /// Gets or Sets Copyright
        /// </summary>
        [DataMember(Name="copyright", EmitDefaultValue=false)]
        public string Copyright { get; set; }

        /// <summary>
        /// Gets or Sets Format
        /// </summary>
        [DataMember(Name="format", EmitDefaultValue=false)]
        public string Format { get; set; }

        /// <summary>
        /// Gets or Sets Height
        /// </summary>
        [DataMember(Name="height", EmitDefaultValue=true)]
        public int Height { get; set; }

        /// <summary>
        /// Gets or Sets Subtype
        /// </summary>
        [DataMember(Name="subtype", EmitDefaultValue=false)]
        public string Subtype { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Url
        /// </summary>
        [DataMember(Name="url", EmitDefaultValue=false)]
        public string Url { get; set; }

        /// <summary>
        /// Gets or Sets Width
        /// </summary>
        [DataMember(Name="width", EmitDefaultValue=true)]
        public int Width { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ArticleMultimediaInner {\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  Copyright: ").Append(Copyright).Append("\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Subtype: ").Append(Subtype).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ArticleMultimediaInner)obj);
        }

        /// <summary>
        /// Returns true if ArticleMultimediaInner instances are equal
        /// </summary>
        /// <param name="other">Instance of ArticleMultimediaInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ArticleMultimediaInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Caption == other.Caption ||
                    Caption != null &&
                    Caption.Equals(other.Caption)
                ) && 
                (
                    Copyright == other.Copyright ||
                    Copyright != null &&
                    Copyright.Equals(other.Copyright)
                ) && 
                (
                    Format == other.Format ||
                    Format != null &&
                    Format.Equals(other.Format)
                ) && 
                (
                    Height == other.Height ||
                    
                    Height.Equals(other.Height)
                ) && 
                (
                    Subtype == other.Subtype ||
                    Subtype != null &&
                    Subtype.Equals(other.Subtype)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    Url == other.Url ||
                    Url != null &&
                    Url.Equals(other.Url)
                ) && 
                (
                    Width == other.Width ||
                    
                    Width.Equals(other.Width)
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
                    if (Caption != null)
                    hashCode = hashCode * 59 + Caption.GetHashCode();
                    if (Copyright != null)
                    hashCode = hashCode * 59 + Copyright.GetHashCode();
                    if (Format != null)
                    hashCode = hashCode * 59 + Format.GetHashCode();
                    
                    hashCode = hashCode * 59 + Height.GetHashCode();
                    if (Subtype != null)
                    hashCode = hashCode * 59 + Subtype.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                    
                    hashCode = hashCode * 59 + Width.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ArticleMultimediaInner left, ArticleMultimediaInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ArticleMultimediaInner left, ArticleMultimediaInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
