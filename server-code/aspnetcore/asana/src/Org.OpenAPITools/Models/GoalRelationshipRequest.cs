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
    public partial class GoalRelationshipRequest : IEquatable<GoalRelationshipRequest>
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
        /// The weight that the supporting resource&#39;s progress contributes to the supported goal&#39;s progress. This can only be 0 or 1.
        /// </summary>
        /// <value>The weight that the supporting resource&#39;s progress contributes to the supported goal&#39;s progress. This can only be 0 or 1.</value>
        /// <example>1</example>
        [DataMember(Name="contribution_weight", EmitDefaultValue=true)]
        public decimal ContributionWeight { get; set; }


        /// <summary>
        /// The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
        /// </summary>
        /// <value>The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.</value>
        [TypeConverter(typeof(CustomEnumConverter<ResourceSubtypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ResourceSubtypeEnum
        {
            
            /// <summary>
            /// Enum SubgoalEnum for subgoal
            /// </summary>
            [EnumMember(Value = "subgoal")]
            SubgoalEnum = 1,
            
            /// <summary>
            /// Enum SupportingWorkEnum for supporting_work
            /// </summary>
            [EnumMember(Value = "supporting_work")]
            SupportingWorkEnum = 2
        }

        /// <summary>
        /// The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
        /// </summary>
        /// <value>The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.</value>
        /// <example>subgoal</example>
        [DataMember(Name="resource_subtype", EmitDefaultValue=true)]
        public ResourceSubtypeEnum ResourceSubtype { get; set; }

        /// <summary>
        /// Gets or Sets SupportingResource
        /// </summary>
        [DataMember(Name="supporting_resource", EmitDefaultValue=false)]
        public GoalRelationshipCompactAllOfSupportingResource SupportingResource { get; set; }

        /// <summary>
        /// Gets or Sets SupportedGoal
        /// </summary>
        [DataMember(Name="supported_goal", EmitDefaultValue=false)]
        public GoalRelationshipBaseAllOfSupportedGoal SupportedGoal { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GoalRelationshipRequest {\n");
            sb.Append("  Gid: ").Append(Gid).Append("\n");
            sb.Append("  ResourceType: ").Append(ResourceType).Append("\n");
            sb.Append("  ContributionWeight: ").Append(ContributionWeight).Append("\n");
            sb.Append("  ResourceSubtype: ").Append(ResourceSubtype).Append("\n");
            sb.Append("  SupportingResource: ").Append(SupportingResource).Append("\n");
            sb.Append("  SupportedGoal: ").Append(SupportedGoal).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GoalRelationshipRequest)obj);
        }

        /// <summary>
        /// Returns true if GoalRelationshipRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of GoalRelationshipRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GoalRelationshipRequest other)
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
                    ContributionWeight == other.ContributionWeight ||
                    
                    ContributionWeight.Equals(other.ContributionWeight)
                ) && 
                (
                    ResourceSubtype == other.ResourceSubtype ||
                    
                    ResourceSubtype.Equals(other.ResourceSubtype)
                ) && 
                (
                    SupportingResource == other.SupportingResource ||
                    SupportingResource != null &&
                    SupportingResource.Equals(other.SupportingResource)
                ) && 
                (
                    SupportedGoal == other.SupportedGoal ||
                    SupportedGoal != null &&
                    SupportedGoal.Equals(other.SupportedGoal)
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
                    
                    hashCode = hashCode * 59 + ContributionWeight.GetHashCode();
                    
                    hashCode = hashCode * 59 + ResourceSubtype.GetHashCode();
                    if (SupportingResource != null)
                    hashCode = hashCode * 59 + SupportingResource.GetHashCode();
                    if (SupportedGoal != null)
                    hashCode = hashCode * 59 + SupportedGoal.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GoalRelationshipRequest left, GoalRelationshipRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GoalRelationshipRequest left, GoalRelationshipRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
