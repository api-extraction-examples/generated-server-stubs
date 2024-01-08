/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: nishu@mediumapi.com
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
    public partial class PublicationPublicationIdNewsletterGet200Response : IEquatable<PublicationPublicationIdNewsletterGet200Response>
    {
        /// <summary>
        /// Gets or Sets CreatorId
        /// </summary>
        /// <example>aea8a19ea239</example>
        [DataMember(Name="creator_id", EmitDefaultValue=false)]
        public string CreatorId { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        /// <example>We have moved our newsletter. Subscribe → https://ws.towardsai.net/subscribe</example>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        /// <example>d710a73cd042</example>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Image
        /// </summary>
        /// <example>https://miro.medium.com/1*j2OVd7j2o2FHeE7T8TzpXw.png</example>
        [DataMember(Name="image", EmitDefaultValue=false)]
        public string Image { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        /// <example>This AI newsletter is all you need</example>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Slug
        /// </summary>
        /// <example>this-ai-newsletter-is-all-you-need</example>
        [DataMember(Name="slug", EmitDefaultValue=false)]
        public string Slug { get; set; }

        /// <summary>
        /// Gets or Sets Subscribers
        /// </summary>
        /// <example>6752</example>
        [DataMember(Name="subscribers", EmitDefaultValue=true)]
        public int Subscribers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PublicationPublicationIdNewsletterGet200Response {\n");
            sb.Append("  CreatorId: ").Append(CreatorId).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Image: ").Append(Image).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Slug: ").Append(Slug).Append("\n");
            sb.Append("  Subscribers: ").Append(Subscribers).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PublicationPublicationIdNewsletterGet200Response)obj);
        }

        /// <summary>
        /// Returns true if PublicationPublicationIdNewsletterGet200Response instances are equal
        /// </summary>
        /// <param name="other">Instance of PublicationPublicationIdNewsletterGet200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PublicationPublicationIdNewsletterGet200Response other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CreatorId == other.CreatorId ||
                    CreatorId != null &&
                    CreatorId.Equals(other.CreatorId)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Image == other.Image ||
                    Image != null &&
                    Image.Equals(other.Image)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Slug == other.Slug ||
                    Slug != null &&
                    Slug.Equals(other.Slug)
                ) && 
                (
                    Subscribers == other.Subscribers ||
                    
                    Subscribers.Equals(other.Subscribers)
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
                    if (CreatorId != null)
                    hashCode = hashCode * 59 + CreatorId.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Image != null)
                    hashCode = hashCode * 59 + Image.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Slug != null)
                    hashCode = hashCode * 59 + Slug.GetHashCode();
                    
                    hashCode = hashCode * 59 + Subscribers.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PublicationPublicationIdNewsletterGet200Response left, PublicationPublicationIdNewsletterGet200Response right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PublicationPublicationIdNewsletterGet200Response left, PublicationPublicationIdNewsletterGet200Response right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}