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
    /// The data type of the field.
    /// </summary>
    [DataContract]
    public partial class FieldMetadataSchema : IEquatable<FieldMetadataSchema>
    {
        /// <summary>
        /// If the field is a custom field, the configuration of the field.
        /// </summary>
        /// <value>If the field is a custom field, the configuration of the field.</value>
        [DataMember(Name="configuration", EmitDefaultValue=false)]
        public Dictionary<string, Object> VarConfiguration { get; set; }

        /// <summary>
        /// If the field is a custom field, the URI of the field.
        /// </summary>
        /// <value>If the field is a custom field, the URI of the field.</value>
        [DataMember(Name="custom", EmitDefaultValue=false)]
        public string Custom { get; set; }

        /// <summary>
        /// If the field is a custom field, the custom ID of the field.
        /// </summary>
        /// <value>If the field is a custom field, the custom ID of the field.</value>
        [DataMember(Name="customId", EmitDefaultValue=true)]
        public long CustomId { get; set; }

        /// <summary>
        /// When the data type is an array, the name of the field items within the array.
        /// </summary>
        /// <value>When the data type is an array, the name of the field items within the array.</value>
        [DataMember(Name="items", EmitDefaultValue=false)]
        public string Items { get; set; }

        /// <summary>
        /// If the field is a system field, the name of the field.
        /// </summary>
        /// <value>If the field is a system field, the name of the field.</value>
        [DataMember(Name="system", EmitDefaultValue=false)]
        public string VarSystem { get; set; }

        /// <summary>
        /// The data type of the field.
        /// </summary>
        /// <value>The data type of the field.</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FieldMetadataSchema {\n");
            sb.Append("  VarConfiguration: ").Append(VarConfiguration).Append("\n");
            sb.Append("  Custom: ").Append(Custom).Append("\n");
            sb.Append("  CustomId: ").Append(CustomId).Append("\n");
            sb.Append("  Items: ").Append(Items).Append("\n");
            sb.Append("  VarSystem: ").Append(VarSystem).Append("\n");
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
            return obj.GetType() == GetType() && Equals((FieldMetadataSchema)obj);
        }

        /// <summary>
        /// Returns true if FieldMetadataSchema instances are equal
        /// </summary>
        /// <param name="other">Instance of FieldMetadataSchema to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FieldMetadataSchema other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    VarConfiguration == other.VarConfiguration ||
                    VarConfiguration != null &&
                    other.VarConfiguration != null &&
                    VarConfiguration.SequenceEqual(other.VarConfiguration)
                ) && 
                (
                    Custom == other.Custom ||
                    Custom != null &&
                    Custom.Equals(other.Custom)
                ) && 
                (
                    CustomId == other.CustomId ||
                    
                    CustomId.Equals(other.CustomId)
                ) && 
                (
                    Items == other.Items ||
                    Items != null &&
                    Items.Equals(other.Items)
                ) && 
                (
                    VarSystem == other.VarSystem ||
                    VarSystem != null &&
                    VarSystem.Equals(other.VarSystem)
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
                    if (VarConfiguration != null)
                    hashCode = hashCode * 59 + VarConfiguration.GetHashCode();
                    if (Custom != null)
                    hashCode = hashCode * 59 + Custom.GetHashCode();
                    
                    hashCode = hashCode * 59 + CustomId.GetHashCode();
                    if (Items != null)
                    hashCode = hashCode * 59 + Items.GetHashCode();
                    if (VarSystem != null)
                    hashCode = hashCode * 59 + VarSystem.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FieldMetadataSchema left, FieldMetadataSchema right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FieldMetadataSchema left, FieldMetadataSchema right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}