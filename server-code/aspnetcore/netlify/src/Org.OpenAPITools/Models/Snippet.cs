/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * The version of the OpenAPI document: 2.16.0
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
    public partial class Snippet : IEquatable<Snippet>
    {
        /// <summary>
        /// Gets or Sets General
        /// </summary>
        [DataMember(Name="general", EmitDefaultValue=false)]
        public string General { get; set; }

        /// <summary>
        /// Gets or Sets GeneralPosition
        /// </summary>
        [DataMember(Name="general_position", EmitDefaultValue=false)]
        public string GeneralPosition { get; set; }

        /// <summary>
        /// Gets or Sets Goal
        /// </summary>
        [DataMember(Name="goal", EmitDefaultValue=false)]
        public string Goal { get; set; }

        /// <summary>
        /// Gets or Sets GoalPosition
        /// </summary>
        [DataMember(Name="goal_position", EmitDefaultValue=false)]
        public string GoalPosition { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets SiteId
        /// </summary>
        [DataMember(Name="site_id", EmitDefaultValue=false)]
        public string SiteId { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Snippet {\n");
            sb.Append("  General: ").Append(General).Append("\n");
            sb.Append("  GeneralPosition: ").Append(GeneralPosition).Append("\n");
            sb.Append("  Goal: ").Append(Goal).Append("\n");
            sb.Append("  GoalPosition: ").Append(GoalPosition).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  SiteId: ").Append(SiteId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Snippet)obj);
        }

        /// <summary>
        /// Returns true if Snippet instances are equal
        /// </summary>
        /// <param name="other">Instance of Snippet to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Snippet other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    General == other.General ||
                    General != null &&
                    General.Equals(other.General)
                ) && 
                (
                    GeneralPosition == other.GeneralPosition ||
                    GeneralPosition != null &&
                    GeneralPosition.Equals(other.GeneralPosition)
                ) && 
                (
                    Goal == other.Goal ||
                    Goal != null &&
                    Goal.Equals(other.Goal)
                ) && 
                (
                    GoalPosition == other.GoalPosition ||
                    GoalPosition != null &&
                    GoalPosition.Equals(other.GoalPosition)
                ) && 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    SiteId == other.SiteId ||
                    SiteId != null &&
                    SiteId.Equals(other.SiteId)
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
                    if (General != null)
                    hashCode = hashCode * 59 + General.GetHashCode();
                    if (GeneralPosition != null)
                    hashCode = hashCode * 59 + GeneralPosition.GetHashCode();
                    if (Goal != null)
                    hashCode = hashCode * 59 + Goal.GetHashCode();
                    if (GoalPosition != null)
                    hashCode = hashCode * 59 + GoalPosition.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (SiteId != null)
                    hashCode = hashCode * 59 + SiteId.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Snippet left, Snippet right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Snippet left, Snippet right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
