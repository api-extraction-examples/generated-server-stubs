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
    public partial class GoalMetricBase : IEquatable<GoalMetricBase>
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
        /// ISO 4217 currency code to format this custom field. This will be null if the &#x60;unit&#x60; is not &#x60;currency&#x60;.
        /// </summary>
        /// <value>ISO 4217 currency code to format this custom field. This will be null if the &#x60;unit&#x60; is not &#x60;currency&#x60;.</value>
        /// <example>EUR</example>
        [DataMember(Name="currency_code", EmitDefaultValue=true)]
        public string CurrencyCode { get; set; }

        /// <summary>
        /// This string is the current value of a goal metric of type string.
        /// </summary>
        /// <value>This string is the current value of a goal metric of type string.</value>
        /// <example>8.12</example>
        [DataMember(Name="current_display_value", EmitDefaultValue=false)]
        public string CurrentDisplayValue { get; set; }

        /// <summary>
        /// This number is the current value of a goal metric of type number.
        /// </summary>
        /// <value>This number is the current value of a goal metric of type number.</value>
        /// <example>8.12</example>
        [DataMember(Name="current_number_value", EmitDefaultValue=true)]
        public decimal CurrentNumberValue { get; set; }

        /// <summary>
        /// This number is the start value of a goal metric of type number.
        /// </summary>
        /// <value>This number is the start value of a goal metric of type number.</value>
        /// <example>5.2</example>
        [DataMember(Name="initial_number_value", EmitDefaultValue=true)]
        public decimal InitialNumberValue { get; set; }

        /// <summary>
        /// *Conditional*. Only relevant for goal metrics of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%.
        /// </summary>
        /// <value>*Conditional*. Only relevant for goal metrics of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%.</value>
        /// <example>2</example>
        [DataMember(Name="precision", EmitDefaultValue=true)]
        public int Precision { get; set; }


        /// <summary>
        /// This field defines how the progress value of a goal metric is being calculated. A goal's progress can be provided manually by the user, calculated automatically from contributing subgoals or projects, or managed by an integration with an external data source, such as Salesforce.
        /// </summary>
        /// <value>This field defines how the progress value of a goal metric is being calculated. A goal's progress can be provided manually by the user, calculated automatically from contributing subgoals or projects, or managed by an integration with an external data source, such as Salesforce.</value>
        [TypeConverter(typeof(CustomEnumConverter<ProgressSourceEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ProgressSourceEnum
        {
            
            /// <summary>
            /// Enum ManualEnum for manual
            /// </summary>
            [EnumMember(Value = "manual")]
            ManualEnum = 1,
            
            /// <summary>
            /// Enum SubgoalProgressEnum for subgoal_progress
            /// </summary>
            [EnumMember(Value = "subgoal_progress")]
            SubgoalProgressEnum = 2,
            
            /// <summary>
            /// Enum ProjectTaskCompletionEnum for project_task_completion
            /// </summary>
            [EnumMember(Value = "project_task_completion")]
            ProjectTaskCompletionEnum = 3,
            
            /// <summary>
            /// Enum ProjectMilestoneCompletionEnum for project_milestone_completion
            /// </summary>
            [EnumMember(Value = "project_milestone_completion")]
            ProjectMilestoneCompletionEnum = 4,
            
            /// <summary>
            /// Enum ExternalEnum for external
            /// </summary>
            [EnumMember(Value = "external")]
            ExternalEnum = 5
        }

        /// <summary>
        /// This field defines how the progress value of a goal metric is being calculated. A goal&#39;s progress can be provided manually by the user, calculated automatically from contributing subgoals or projects, or managed by an integration with an external data source, such as Salesforce.
        /// </summary>
        /// <value>This field defines how the progress value of a goal metric is being calculated. A goal&#39;s progress can be provided manually by the user, calculated automatically from contributing subgoals or projects, or managed by an integration with an external data source, such as Salesforce.</value>
        /// <example>manual</example>
        [DataMember(Name="progress_source", EmitDefaultValue=true)]
        public ProgressSourceEnum ProgressSource { get; set; }


        /// <summary>
        /// The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
        /// </summary>
        /// <value>The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.</value>
        [TypeConverter(typeof(CustomEnumConverter<ResourceSubtypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ResourceSubtypeEnum
        {
            
            /// <summary>
            /// Enum NumberEnum for number
            /// </summary>
            [EnumMember(Value = "number")]
            NumberEnum = 1
        }

        /// <summary>
        /// The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
        /// </summary>
        /// <value>The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.</value>
        /// <example>number</example>
        [DataMember(Name="resource_subtype", EmitDefaultValue=true)]
        public ResourceSubtypeEnum ResourceSubtype { get; set; }

        /// <summary>
        /// This number is the end value of a goal metric of type number. This number cannot equal &#x60;initial_number_value&#x60;.
        /// </summary>
        /// <value>This number is the end value of a goal metric of type number. This number cannot equal &#x60;initial_number_value&#x60;.</value>
        /// <example>10.2</example>
        [DataMember(Name="target_number_value", EmitDefaultValue=true)]
        public decimal TargetNumberValue { get; set; }


        /// <summary>
        /// A supported unit of measure for the goal metric, or none.
        /// </summary>
        /// <value>A supported unit of measure for the goal metric, or none.</value>
        [TypeConverter(typeof(CustomEnumConverter<UnitEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum UnitEnum
        {
            
            /// <summary>
            /// Enum NoneEnum for none
            /// </summary>
            [EnumMember(Value = "none")]
            NoneEnum = 1,
            
            /// <summary>
            /// Enum CurrencyEnum for currency
            /// </summary>
            [EnumMember(Value = "currency")]
            CurrencyEnum = 2,
            
            /// <summary>
            /// Enum PercentageEnum for percentage
            /// </summary>
            [EnumMember(Value = "percentage")]
            PercentageEnum = 3
        }

        /// <summary>
        /// A supported unit of measure for the goal metric, or none.
        /// </summary>
        /// <value>A supported unit of measure for the goal metric, or none.</value>
        [DataMember(Name="unit", EmitDefaultValue=true)]
        public UnitEnum Unit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GoalMetricBase {\n");
            sb.Append("  Gid: ").Append(Gid).Append("\n");
            sb.Append("  ResourceType: ").Append(ResourceType).Append("\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  CurrentDisplayValue: ").Append(CurrentDisplayValue).Append("\n");
            sb.Append("  CurrentNumberValue: ").Append(CurrentNumberValue).Append("\n");
            sb.Append("  InitialNumberValue: ").Append(InitialNumberValue).Append("\n");
            sb.Append("  Precision: ").Append(Precision).Append("\n");
            sb.Append("  ProgressSource: ").Append(ProgressSource).Append("\n");
            sb.Append("  ResourceSubtype: ").Append(ResourceSubtype).Append("\n");
            sb.Append("  TargetNumberValue: ").Append(TargetNumberValue).Append("\n");
            sb.Append("  Unit: ").Append(Unit).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GoalMetricBase)obj);
        }

        /// <summary>
        /// Returns true if GoalMetricBase instances are equal
        /// </summary>
        /// <param name="other">Instance of GoalMetricBase to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GoalMetricBase other)
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
                    CurrencyCode == other.CurrencyCode ||
                    CurrencyCode != null &&
                    CurrencyCode.Equals(other.CurrencyCode)
                ) && 
                (
                    CurrentDisplayValue == other.CurrentDisplayValue ||
                    CurrentDisplayValue != null &&
                    CurrentDisplayValue.Equals(other.CurrentDisplayValue)
                ) && 
                (
                    CurrentNumberValue == other.CurrentNumberValue ||
                    
                    CurrentNumberValue.Equals(other.CurrentNumberValue)
                ) && 
                (
                    InitialNumberValue == other.InitialNumberValue ||
                    
                    InitialNumberValue.Equals(other.InitialNumberValue)
                ) && 
                (
                    Precision == other.Precision ||
                    
                    Precision.Equals(other.Precision)
                ) && 
                (
                    ProgressSource == other.ProgressSource ||
                    
                    ProgressSource.Equals(other.ProgressSource)
                ) && 
                (
                    ResourceSubtype == other.ResourceSubtype ||
                    
                    ResourceSubtype.Equals(other.ResourceSubtype)
                ) && 
                (
                    TargetNumberValue == other.TargetNumberValue ||
                    
                    TargetNumberValue.Equals(other.TargetNumberValue)
                ) && 
                (
                    Unit == other.Unit ||
                    
                    Unit.Equals(other.Unit)
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
                    if (CurrencyCode != null)
                    hashCode = hashCode * 59 + CurrencyCode.GetHashCode();
                    if (CurrentDisplayValue != null)
                    hashCode = hashCode * 59 + CurrentDisplayValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + CurrentNumberValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + InitialNumberValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + Precision.GetHashCode();
                    
                    hashCode = hashCode * 59 + ProgressSource.GetHashCode();
                    
                    hashCode = hashCode * 59 + ResourceSubtype.GetHashCode();
                    
                    hashCode = hashCode * 59 + TargetNumberValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + Unit.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GoalMetricBase left, GoalMetricBase right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GoalMetricBase left, GoalMetricBase right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
