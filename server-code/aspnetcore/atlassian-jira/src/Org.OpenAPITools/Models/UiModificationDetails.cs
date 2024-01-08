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
    /// The details of a UI modification.
    /// </summary>
    [DataContract]
    public partial class UiModificationDetails : IEquatable<UiModificationDetails>
    {
        /// <summary>
        /// List of contexts of the UI modification. The maximum number of contexts is 1000.
        /// </summary>
        /// <value>List of contexts of the UI modification. The maximum number of contexts is 1000.</value>
        [DataMember(Name="contexts", EmitDefaultValue=false)]
        public List<UiModificationContextDetails> Contexts { get; set; }

        /// <summary>
        /// The data of the UI modification. The maximum size of the data is 50000 characters.
        /// </summary>
        /// <value>The data of the UI modification. The maximum size of the data is 50000 characters.</value>
        [DataMember(Name="data", EmitDefaultValue=false)]
        public string Data { get; set; }

        /// <summary>
        /// The description of the UI modification. The maximum length is 255 characters.
        /// </summary>
        /// <value>The description of the UI modification. The maximum length is 255 characters.</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// The ID of the UI modification.
        /// </summary>
        /// <value>The ID of the UI modification.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The name of the UI modification. The maximum length is 255 characters.
        /// </summary>
        /// <value>The name of the UI modification. The maximum length is 255 characters.</value>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The URL of the UI modification.
        /// </summary>
        /// <value>The URL of the UI modification.</value>
        [Required]
        [DataMember(Name="self", EmitDefaultValue=false)]
        public string Self { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UiModificationDetails {\n");
            sb.Append("  Contexts: ").Append(Contexts).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UiModificationDetails)obj);
        }

        /// <summary>
        /// Returns true if UiModificationDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of UiModificationDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UiModificationDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Contexts == other.Contexts ||
                    Contexts != null &&
                    other.Contexts != null &&
                    Contexts.SequenceEqual(other.Contexts)
                ) && 
                (
                    Data == other.Data ||
                    Data != null &&
                    Data.Equals(other.Data)
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
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Self == other.Self ||
                    Self != null &&
                    Self.Equals(other.Self)
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
                    if (Contexts != null)
                    hashCode = hashCode * 59 + Contexts.GetHashCode();
                    if (Data != null)
                    hashCode = hashCode * 59 + Data.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Self != null)
                    hashCode = hashCode * 59 + Self.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UiModificationDetails left, UiModificationDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UiModificationDetails left, UiModificationDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}