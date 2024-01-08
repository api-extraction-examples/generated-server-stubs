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
    /// 
    /// </summary>
    [DataContract]
    public partial class ProjectScopeBean : IEquatable<ProjectScopeBean>
    {

        /// <summary>
        /// Gets or Sets Attributes
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<AttributesEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AttributesEnum
        {
            
            /// <summary>
            /// Enum NotSelectableEnum for notSelectable
            /// </summary>
            [EnumMember(Value = "notSelectable")]
            NotSelectableEnum = 1,
            
            /// <summary>
            /// Enum DefaultValueEnum for defaultValue
            /// </summary>
            [EnumMember(Value = "defaultValue")]
            DefaultValueEnum = 2
        }

        /// <summary>
        /// Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field&#39;s value. This is useful for archiving an option that has previously been selected but shouldn&#39;t be used anymore.If defaultValue is set, the option is selected by default.
        /// </summary>
        /// <value>Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field&#39;s value. This is useful for archiving an option that has previously been selected but shouldn&#39;t be used anymore.If defaultValue is set, the option is selected by default.</value>
        [DataMember(Name="attributes", EmitDefaultValue=false)]
        public List<ProjectScopeBean.AttributesEnum> Attributes { get; set; }

        /// <summary>
        /// The ID of the project that the option&#39;s behavior applies to.
        /// </summary>
        /// <value>The ID of the project that the option&#39;s behavior applies to.</value>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public long Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProjectScopeBean {\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ProjectScopeBean)obj);
        }

        /// <summary>
        /// Returns true if ProjectScopeBean instances are equal
        /// </summary>
        /// <param name="other">Instance of ProjectScopeBean to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProjectScopeBean other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Attributes == other.Attributes ||
                    Attributes != null &&
                    other.Attributes != null &&
                    Attributes.SequenceEqual(other.Attributes)
                ) && 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
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
                    if (Attributes != null)
                    hashCode = hashCode * 59 + Attributes.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ProjectScopeBean left, ProjectScopeBean right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProjectScopeBean left, ProjectScopeBean right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}