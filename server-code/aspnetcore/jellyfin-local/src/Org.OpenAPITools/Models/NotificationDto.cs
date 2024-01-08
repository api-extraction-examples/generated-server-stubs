/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
    /// The notification DTO.
    /// </summary>
    [DataContract]
    public partial class NotificationDto : IEquatable<NotificationDto>
    {
        /// <summary>
        /// Gets or sets the notification date.
        /// </summary>
        /// <value>Gets or sets the notification date.</value>
        [DataMember(Name="Date", EmitDefaultValue=false)]
        public DateTime Date { get; set; }

        /// <summary>
        /// Gets or sets the notification&#39;s description. Defaults to an empty string.
        /// </summary>
        /// <value>Gets or sets the notification&#39;s description. Defaults to an empty string.</value>
        [DataMember(Name="Description", EmitDefaultValue=true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or sets the notification ID. Defaults to an empty string.
        /// </summary>
        /// <value>Gets or sets the notification ID. Defaults to an empty string.</value>
        [DataMember(Name="Id", EmitDefaultValue=true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether the notification has been read. Defaults to false.
        /// </summary>
        /// <value>Gets or sets a value indicating whether the notification has been read. Defaults to false.</value>
        [DataMember(Name="IsRead", EmitDefaultValue=true)]
        public bool IsRead { get; set; }

        /// <summary>
        /// Gets or Sets Level
        /// </summary>
        [DataMember(Name="Level", EmitDefaultValue=true)]
        public NotificationLevel Level { get; set; }

        /// <summary>
        /// Gets or sets the notification&#39;s name. Defaults to an empty string.
        /// </summary>
        /// <value>Gets or sets the notification&#39;s name. Defaults to an empty string.</value>
        [DataMember(Name="Name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the notification&#39;s URL. Defaults to an empty string.
        /// </summary>
        /// <value>Gets or sets the notification&#39;s URL. Defaults to an empty string.</value>
        [DataMember(Name="Url", EmitDefaultValue=true)]
        public string Url { get; set; }

        /// <summary>
        /// Gets or sets the notification&#39;s user ID. Defaults to an empty string.
        /// </summary>
        /// <value>Gets or sets the notification&#39;s user ID. Defaults to an empty string.</value>
        [DataMember(Name="UserId", EmitDefaultValue=true)]
        public string UserId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NotificationDto {\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsRead: ").Append(IsRead).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((NotificationDto)obj);
        }

        /// <summary>
        /// Returns true if NotificationDto instances are equal
        /// </summary>
        /// <param name="other">Instance of NotificationDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NotificationDto other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Date == other.Date ||
                    Date != null &&
                    Date.Equals(other.Date)
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
                    IsRead == other.IsRead ||
                    
                    IsRead.Equals(other.IsRead)
                ) && 
                (
                    Level == other.Level ||
                    
                    Level.Equals(other.Level)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Url == other.Url ||
                    Url != null &&
                    Url.Equals(other.Url)
                ) && 
                (
                    UserId == other.UserId ||
                    UserId != null &&
                    UserId.Equals(other.UserId)
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
                    if (Date != null)
                    hashCode = hashCode * 59 + Date.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsRead.GetHashCode();
                    
                    hashCode = hashCode * 59 + Level.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                    if (UserId != null)
                    hashCode = hashCode * 59 + UserId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(NotificationDto left, NotificationDto right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(NotificationDto left, NotificationDto right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
