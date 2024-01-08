/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
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
    public partial class GoalRelationshipCompactAllOfSupportingResource : IEquatable<GoalRelationshipCompactAllOfSupportingResource>
    {
        /// <summary>
        /// Globally unique identifier of the resource, as a string.
        /// </summary>
        /// <value>Globally unique identifier of the resource, as a string.</value>
        /// <example>12345</example>
        [DataMember(Name="gid", EmitDefaultValue=false)]
        public string Gid { get; set; }

        /// <summary>
        /// The base type of this resource.
        /// </summary>
        /// <value>The base type of this resource.</value>
        /// <example>task</example>
        [DataMember(Name="resource_type", EmitDefaultValue=false)]
        public string ResourceType { get; set; }

        /// <summary>
        /// Name of the project. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.
        /// </summary>
        /// <value>Name of the project. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.</value>
        /// <example>Stuff to buy</example>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GoalRelationshipCompactAllOfSupportingResource {\n");
            sb.Append("  Gid: ").Append(Gid).Append("\n");
            sb.Append("  ResourceType: ").Append(ResourceType).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GoalRelationshipCompactAllOfSupportingResource)obj);
        }

        /// <summary>
        /// Returns true if GoalRelationshipCompactAllOfSupportingResource instances are equal
        /// </summary>
        /// <param name="other">Instance of GoalRelationshipCompactAllOfSupportingResource to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GoalRelationshipCompactAllOfSupportingResource other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Gid == other.Gid ||
                    Gid != null &&
                    Gid.Equals(other.Gid)
                ) && 
                (
                    ResourceType == other.ResourceType ||
                    ResourceType != null &&
                    ResourceType.Equals(other.ResourceType)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
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
                    if (Gid != null)
                    hashCode = hashCode * 59 + Gid.GetHashCode();
                    if (ResourceType != null)
                    hashCode = hashCode * 59 + ResourceType.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GoalRelationshipCompactAllOfSupportingResource left, GoalRelationshipCompactAllOfSupportingResource right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GoalRelationshipCompactAllOfSupportingResource left, GoalRelationshipCompactAllOfSupportingResource right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
