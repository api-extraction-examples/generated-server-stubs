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
    public partial class BillPublication : IEquatable<BillPublication>
    {
        /// <summary>
        /// Gets or Sets DisplayDate
        /// </summary>
        [DataMember(Name="displayDate", EmitDefaultValue=false)]
        public DateTime DisplayDate { get; set; }

        /// <summary>
        /// Gets or Sets Files
        /// </summary>
        [DataMember(Name="files", EmitDefaultValue=true)]
        public List<PublicationDocument> Files { get; set; }

        /// <summary>
        /// Gets or Sets House
        /// </summary>
        [DataMember(Name="house", EmitDefaultValue=true)]
        public House House { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="links", EmitDefaultValue=true)]
        public List<PublicationLink> Links { get; set; }

        /// <summary>
        /// Gets or Sets PublicationType
        /// </summary>
        [DataMember(Name="publicationType", EmitDefaultValue=false)]
        public PublicationType PublicationType { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name="title", EmitDefaultValue=true)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BillPublication {\n");
            sb.Append("  DisplayDate: ").Append(DisplayDate).Append("\n");
            sb.Append("  Files: ").Append(Files).Append("\n");
            sb.Append("  House: ").Append(House).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  PublicationType: ").Append(PublicationType).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BillPublication)obj);
        }

        /// <summary>
        /// Returns true if BillPublication instances are equal
        /// </summary>
        /// <param name="other">Instance of BillPublication to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BillPublication other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DisplayDate == other.DisplayDate ||
                    DisplayDate != null &&
                    DisplayDate.Equals(other.DisplayDate)
                ) && 
                (
                    Files == other.Files ||
                    Files != null &&
                    other.Files != null &&
                    Files.SequenceEqual(other.Files)
                ) && 
                (
                    House == other.House ||
                    
                    House.Equals(other.House)
                ) && 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    Links == other.Links ||
                    Links != null &&
                    other.Links != null &&
                    Links.SequenceEqual(other.Links)
                ) && 
                (
                    PublicationType == other.PublicationType ||
                    PublicationType != null &&
                    PublicationType.Equals(other.PublicationType)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
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
                    if (DisplayDate != null)
                    hashCode = hashCode * 59 + DisplayDate.GetHashCode();
                    if (Files != null)
                    hashCode = hashCode * 59 + Files.GetHashCode();
                    
                    hashCode = hashCode * 59 + House.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Links != null)
                    hashCode = hashCode * 59 + Links.GetHashCode();
                    if (PublicationType != null)
                    hashCode = hashCode * 59 + PublicationType.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BillPublication left, BillPublication right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BillPublication left, BillPublication right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
