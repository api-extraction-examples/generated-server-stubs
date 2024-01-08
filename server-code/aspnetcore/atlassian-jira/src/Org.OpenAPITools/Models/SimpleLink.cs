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
    /// Details about the operations available in this version.
    /// </summary>
    [DataContract]
    public partial class SimpleLink : IEquatable<SimpleLink>
    {
        /// <summary>
        /// Gets or Sets Href
        /// </summary>
        [DataMember(Name="href", EmitDefaultValue=false)]
        public string Href { get; set; }

        /// <summary>
        /// Gets or Sets IconClass
        /// </summary>
        [DataMember(Name="iconClass", EmitDefaultValue=false)]
        public string IconClass { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Label
        /// </summary>
        [DataMember(Name="label", EmitDefaultValue=false)]
        public string Label { get; set; }

        /// <summary>
        /// Gets or Sets StyleClass
        /// </summary>
        [DataMember(Name="styleClass", EmitDefaultValue=false)]
        public string StyleClass { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Weight
        /// </summary>
        [DataMember(Name="weight", EmitDefaultValue=true)]
        public int Weight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SimpleLink {\n");
            sb.Append("  Href: ").Append(Href).Append("\n");
            sb.Append("  IconClass: ").Append(IconClass).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  StyleClass: ").Append(StyleClass).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Weight: ").Append(Weight).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SimpleLink)obj);
        }

        /// <summary>
        /// Returns true if SimpleLink instances are equal
        /// </summary>
        /// <param name="other">Instance of SimpleLink to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SimpleLink other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Href == other.Href ||
                    Href != null &&
                    Href.Equals(other.Href)
                ) && 
                (
                    IconClass == other.IconClass ||
                    IconClass != null &&
                    IconClass.Equals(other.IconClass)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Label == other.Label ||
                    Label != null &&
                    Label.Equals(other.Label)
                ) && 
                (
                    StyleClass == other.StyleClass ||
                    StyleClass != null &&
                    StyleClass.Equals(other.StyleClass)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
                ) && 
                (
                    Weight == other.Weight ||
                    
                    Weight.Equals(other.Weight)
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
                    if (Href != null)
                    hashCode = hashCode * 59 + Href.GetHashCode();
                    if (IconClass != null)
                    hashCode = hashCode * 59 + IconClass.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Label != null)
                    hashCode = hashCode * 59 + Label.GetHashCode();
                    if (StyleClass != null)
                    hashCode = hashCode * 59 + StyleClass.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                    
                    hashCode = hashCode * 59 + Weight.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SimpleLink left, SimpleLink right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SimpleLink left, SimpleLink right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
