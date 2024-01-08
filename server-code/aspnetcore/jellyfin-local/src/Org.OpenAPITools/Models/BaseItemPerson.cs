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
    /// This is used by the api to get information about a Person within a BaseItem.
    /// </summary>
    [DataContract]
    public partial class BaseItemPerson : IEquatable<BaseItemPerson>
    {
        /// <summary>
        /// Gets or sets the identifier.
        /// </summary>
        /// <value>Gets or sets the identifier.</value>
        [DataMember(Name="Id", EmitDefaultValue=true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ImageBlurHashes
        /// </summary>
        [DataMember(Name="ImageBlurHashes", EmitDefaultValue=true)]
        public BaseItemPersonImageBlurHashes ImageBlurHashes { get; set; }

        /// <summary>
        /// Gets or sets the name.
        /// </summary>
        /// <value>Gets or sets the name.</value>
        [DataMember(Name="Name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the primary image tag.
        /// </summary>
        /// <value>Gets or sets the primary image tag.</value>
        [DataMember(Name="PrimaryImageTag", EmitDefaultValue=true)]
        public string PrimaryImageTag { get; set; }

        /// <summary>
        /// Gets or sets the role.
        /// </summary>
        /// <value>Gets or sets the role.</value>
        [DataMember(Name="Role", EmitDefaultValue=true)]
        public string Role { get; set; }

        /// <summary>
        /// Gets or sets the type.
        /// </summary>
        /// <value>Gets or sets the type.</value>
        [DataMember(Name="Type", EmitDefaultValue=true)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BaseItemPerson {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ImageBlurHashes: ").Append(ImageBlurHashes).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  PrimaryImageTag: ").Append(PrimaryImageTag).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BaseItemPerson)obj);
        }

        /// <summary>
        /// Returns true if BaseItemPerson instances are equal
        /// </summary>
        /// <param name="other">Instance of BaseItemPerson to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BaseItemPerson other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    ImageBlurHashes == other.ImageBlurHashes ||
                    ImageBlurHashes != null &&
                    ImageBlurHashes.Equals(other.ImageBlurHashes)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    PrimaryImageTag == other.PrimaryImageTag ||
                    PrimaryImageTag != null &&
                    PrimaryImageTag.Equals(other.PrimaryImageTag)
                ) && 
                (
                    Role == other.Role ||
                    Role != null &&
                    Role.Equals(other.Role)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
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
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (ImageBlurHashes != null)
                    hashCode = hashCode * 59 + ImageBlurHashes.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (PrimaryImageTag != null)
                    hashCode = hashCode * 59 + PrimaryImageTag.GetHashCode();
                    if (Role != null)
                    hashCode = hashCode * 59 + Role.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BaseItemPerson left, BaseItemPerson right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BaseItemPerson left, BaseItemPerson right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}