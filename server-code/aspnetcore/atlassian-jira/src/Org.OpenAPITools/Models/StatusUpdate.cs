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
    /// Details of the status being updated.
    /// </summary>
    [DataContract]
    public partial class StatusUpdate : IEquatable<StatusUpdate>
    {
        /// <summary>
        /// The description of the status.
        /// </summary>
        /// <value>The description of the status.</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// The ID of the status.
        /// </summary>
        /// <value>The ID of the status.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The name of the status.
        /// </summary>
        /// <value>The name of the status.</value>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }


        /// <summary>
        /// The category of the status.
        /// </summary>
        /// <value>The category of the status.</value>
        [TypeConverter(typeof(CustomEnumConverter<StatusCategoryEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum StatusCategoryEnum
        {
            
            /// <summary>
            /// Enum TODOEnum for TODO
            /// </summary>
            [EnumMember(Value = "TODO")]
            TODOEnum = 1,
            
            /// <summary>
            /// Enum INPROGRESSEnum for IN_PROGRESS
            /// </summary>
            [EnumMember(Value = "IN_PROGRESS")]
            INPROGRESSEnum = 2,
            
            /// <summary>
            /// Enum DONEEnum for DONE
            /// </summary>
            [EnumMember(Value = "DONE")]
            DONEEnum = 3
        }

        /// <summary>
        /// The category of the status.
        /// </summary>
        /// <value>The category of the status.</value>
        [Required]
        [DataMember(Name="statusCategory", EmitDefaultValue=true)]
        public StatusCategoryEnum StatusCategory { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StatusUpdate {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  StatusCategory: ").Append(StatusCategory).Append("\n");
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
            return obj.GetType() == GetType() && Equals((StatusUpdate)obj);
        }

        /// <summary>
        /// Returns true if StatusUpdate instances are equal
        /// </summary>
        /// <param name="other">Instance of StatusUpdate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StatusUpdate other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
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
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    StatusCategory == other.StatusCategory ||
                    
                    StatusCategory.Equals(other.StatusCategory)
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
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + StatusCategory.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(StatusUpdate left, StatusUpdate right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(StatusUpdate left, StatusUpdate right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
