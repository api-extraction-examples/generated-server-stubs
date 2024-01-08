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
    public partial class MoveFieldBean : IEquatable<MoveFieldBean>
    {
        /// <summary>
        /// The ID of the screen tab field after which to place the moved screen tab field. Required if &#x60;position&#x60; isn&#39;t provided.
        /// </summary>
        /// <value>The ID of the screen tab field after which to place the moved screen tab field. Required if &#x60;position&#x60; isn&#39;t provided.</value>
        [DataMember(Name="after", EmitDefaultValue=false)]
        public string After { get; set; }


        /// <summary>
        /// The named position to which the screen tab field should be moved. Required if `after` isn't provided.
        /// </summary>
        /// <value>The named position to which the screen tab field should be moved. Required if `after` isn't provided.</value>
        [TypeConverter(typeof(CustomEnumConverter<PositionEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum PositionEnum
        {
            
            /// <summary>
            /// Enum EarlierEnum for Earlier
            /// </summary>
            [EnumMember(Value = "Earlier")]
            EarlierEnum = 1,
            
            /// <summary>
            /// Enum LaterEnum for Later
            /// </summary>
            [EnumMember(Value = "Later")]
            LaterEnum = 2,
            
            /// <summary>
            /// Enum FirstEnum for First
            /// </summary>
            [EnumMember(Value = "First")]
            FirstEnum = 3,
            
            /// <summary>
            /// Enum LastEnum for Last
            /// </summary>
            [EnumMember(Value = "Last")]
            LastEnum = 4
        }

        /// <summary>
        /// The named position to which the screen tab field should be moved. Required if &#x60;after&#x60; isn&#39;t provided.
        /// </summary>
        /// <value>The named position to which the screen tab field should be moved. Required if &#x60;after&#x60; isn&#39;t provided.</value>
        [DataMember(Name="position", EmitDefaultValue=true)]
        public PositionEnum Position { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MoveFieldBean {\n");
            sb.Append("  After: ").Append(After).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MoveFieldBean)obj);
        }

        /// <summary>
        /// Returns true if MoveFieldBean instances are equal
        /// </summary>
        /// <param name="other">Instance of MoveFieldBean to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MoveFieldBean other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    After == other.After ||
                    After != null &&
                    After.Equals(other.After)
                ) && 
                (
                    Position == other.Position ||
                    
                    Position.Equals(other.Position)
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
                    if (After != null)
                    hashCode = hashCode * 59 + After.GetHashCode();
                    
                    hashCode = hashCode * 59 + Position.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MoveFieldBean left, MoveFieldBean right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MoveFieldBean left, MoveFieldBean right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}