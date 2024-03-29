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
    public partial class PublicationPublicationIdGet200Response : IEquatable<PublicationPublicationIdGet200Response>
    {
        /// <summary>
        /// Gets or Sets Creator
        /// </summary>
        /// <example>8a819983d566</example>
        [DataMember(Name="creator", EmitDefaultValue=false)]
        public string Creator { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        /// <example>Towards AI is the world&#39;s leading AI and technology publication. Publishing unbiased AI and technology-related articles. Read by thought-leaders and decision-makers around the world.</example>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Editors
        /// </summary>
        [DataMember(Name="editors", EmitDefaultValue=false)]
        public List<string> Editors { get; set; }

        /// <summary>
        /// Gets or Sets FacebookPagename
        /// </summary>
        /// <example>towardsAl</example>
        [DataMember(Name="facebook_pagename", EmitDefaultValue=false)]
        public string FacebookPagename { get; set; }

        /// <summary>
        /// Gets or Sets Followers
        /// </summary>
        /// <example>25260</example>
        [DataMember(Name="followers", EmitDefaultValue=true)]
        public int Followers { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        /// <example>98111c9905da</example>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets InstagramUsername
        /// </summary>
        /// <example>towards_ai</example>
        [DataMember(Name="instagram_username", EmitDefaultValue=false)]
        public string InstagramUsername { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        /// <example>Towards AI</example>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Slug
        /// </summary>
        /// <example>towards-artificial-intelligence</example>
        [DataMember(Name="slug", EmitDefaultValue=false)]
        public string Slug { get; set; }

        /// <summary>
        /// Gets or Sets Tagline
        /// </summary>
        /// <example>The World&#39;s Leading AI and Technology Publication</example>
        [DataMember(Name="tagline", EmitDefaultValue=false)]
        public string Tagline { get; set; }

        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name="tags", EmitDefaultValue=false)]
        public List<string> Tags { get; set; }

        /// <summary>
        /// Gets or Sets TwitterUsername
        /// </summary>
        /// <example>towards_AI</example>
        [DataMember(Name="twitter_username", EmitDefaultValue=false)]
        public string TwitterUsername { get; set; }

        /// <summary>
        /// Gets or Sets Url
        /// </summary>
        /// <example>pub.towardsai.net</example>
        [DataMember(Name="url", EmitDefaultValue=false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PublicationPublicationIdGet200Response {\n");
            sb.Append("  Creator: ").Append(Creator).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Editors: ").Append(Editors).Append("\n");
            sb.Append("  FacebookPagename: ").Append(FacebookPagename).Append("\n");
            sb.Append("  Followers: ").Append(Followers).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  InstagramUsername: ").Append(InstagramUsername).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Slug: ").Append(Slug).Append("\n");
            sb.Append("  Tagline: ").Append(Tagline).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  TwitterUsername: ").Append(TwitterUsername).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PublicationPublicationIdGet200Response)obj);
        }

        /// <summary>
        /// Returns true if PublicationPublicationIdGet200Response instances are equal
        /// </summary>
        /// <param name="other">Instance of PublicationPublicationIdGet200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PublicationPublicationIdGet200Response other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Creator == other.Creator ||
                    Creator != null &&
                    Creator.Equals(other.Creator)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    Editors == other.Editors ||
                    Editors != null &&
                    other.Editors != null &&
                    Editors.SequenceEqual(other.Editors)
                ) && 
                (
                    FacebookPagename == other.FacebookPagename ||
                    FacebookPagename != null &&
                    FacebookPagename.Equals(other.FacebookPagename)
                ) && 
                (
                    Followers == other.Followers ||
                    
                    Followers.Equals(other.Followers)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    InstagramUsername == other.InstagramUsername ||
                    InstagramUsername != null &&
                    InstagramUsername.Equals(other.InstagramUsername)
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
                    Tagline == other.Tagline ||
                    Tagline != null &&
                    Tagline.Equals(other.Tagline)
                ) && 
                (
                    Tags == other.Tags ||
                    Tags != null &&
                    other.Tags != null &&
                    Tags.SequenceEqual(other.Tags)
                ) && 
                (
                    TwitterUsername == other.TwitterUsername ||
                    TwitterUsername != null &&
                    TwitterUsername.Equals(other.TwitterUsername)
                ) && 
                (
                    Url == other.Url ||
                    Url != null &&
                    Url.Equals(other.Url)
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
                    if (Creator != null)
                    hashCode = hashCode * 59 + Creator.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Editors != null)
                    hashCode = hashCode * 59 + Editors.GetHashCode();
                    if (FacebookPagename != null)
                    hashCode = hashCode * 59 + FacebookPagename.GetHashCode();
                    
                    hashCode = hashCode * 59 + Followers.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (InstagramUsername != null)
                    hashCode = hashCode * 59 + InstagramUsername.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Slug != null)
                    hashCode = hashCode * 59 + Slug.GetHashCode();
                    if (Tagline != null)
                    hashCode = hashCode * 59 + Tagline.GetHashCode();
                    if (Tags != null)
                    hashCode = hashCode * 59 + Tags.GetHashCode();
                    if (TwitterUsername != null)
                    hashCode = hashCode * 59 + TwitterUsername.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PublicationPublicationIdGet200Response left, PublicationPublicationIdGet200Response right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PublicationPublicationIdGet200Response left, PublicationPublicationIdGet200Response right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
