/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * The version of the OpenAPI document: v1
 * Contact: softwareengineering@parliament.uk
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
    public partial class AmendmentLine : IEquatable<AmendmentLine>
    {
        /// <summary>
        /// Gets or Sets HangingIndentation
        /// </summary>
        [DataMember(Name="hangingIndentation", EmitDefaultValue=true)]
        public string HangingIndentation { get; set; }

        /// <summary>
        /// Gets or Sets ImageType
        /// </summary>
        [DataMember(Name="imageType", EmitDefaultValue=true)]
        public string ImageType { get; set; }

        /// <summary>
        /// Gets or Sets Indentation
        /// </summary>
        [DataMember(Name="indentation", EmitDefaultValue=true)]
        public int Indentation { get; set; }

        /// <summary>
        /// Gets or Sets IsImage
        /// </summary>
        [DataMember(Name="isImage", EmitDefaultValue=true)]
        public bool IsImage { get; set; }

        /// <summary>
        /// Gets or Sets Text
        /// </summary>
        [DataMember(Name="text", EmitDefaultValue=true)]
        public string Text { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AmendmentLine {\n");
            sb.Append("  HangingIndentation: ").Append(HangingIndentation).Append("\n");
            sb.Append("  ImageType: ").Append(ImageType).Append("\n");
            sb.Append("  Indentation: ").Append(Indentation).Append("\n");
            sb.Append("  IsImage: ").Append(IsImage).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AmendmentLine)obj);
        }

        /// <summary>
        /// Returns true if AmendmentLine instances are equal
        /// </summary>
        /// <param name="other">Instance of AmendmentLine to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AmendmentLine other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    HangingIndentation == other.HangingIndentation ||
                    HangingIndentation != null &&
                    HangingIndentation.Equals(other.HangingIndentation)
                ) && 
                (
                    ImageType == other.ImageType ||
                    ImageType != null &&
                    ImageType.Equals(other.ImageType)
                ) && 
                (
                    Indentation == other.Indentation ||
                    
                    Indentation.Equals(other.Indentation)
                ) && 
                (
                    IsImage == other.IsImage ||
                    
                    IsImage.Equals(other.IsImage)
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
                    if (HangingIndentation != null)
                    hashCode = hashCode * 59 + HangingIndentation.GetHashCode();
                    if (ImageType != null)
                    hashCode = hashCode * 59 + ImageType.GetHashCode();
                    
                    hashCode = hashCode * 59 + Indentation.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsImage.GetHashCode();
                    if (Text != null)
                    hashCode = hashCode * 59 + Text.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AmendmentLine left, AmendmentLine right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AmendmentLine left, AmendmentLine right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
