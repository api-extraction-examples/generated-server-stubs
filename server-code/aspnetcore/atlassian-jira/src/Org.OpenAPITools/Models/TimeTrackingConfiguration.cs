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
    /// Details of the time tracking configuration.
    /// </summary>
    [DataContract]
    public partial class TimeTrackingConfiguration : IEquatable<TimeTrackingConfiguration>
    {

        /// <summary>
        /// The default unit of time applied to logged time.
        /// </summary>
        /// <value>The default unit of time applied to logged time.</value>
        [TypeConverter(typeof(CustomEnumConverter<DefaultUnitEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum DefaultUnitEnum
        {
            
            /// <summary>
            /// Enum MinuteEnum for minute
            /// </summary>
            [EnumMember(Value = "minute")]
            MinuteEnum = 1,
            
            /// <summary>
            /// Enum HourEnum for hour
            /// </summary>
            [EnumMember(Value = "hour")]
            HourEnum = 2,
            
            /// <summary>
            /// Enum DayEnum for day
            /// </summary>
            [EnumMember(Value = "day")]
            DayEnum = 3,
            
            /// <summary>
            /// Enum WeekEnum for week
            /// </summary>
            [EnumMember(Value = "week")]
            WeekEnum = 4
        }

        /// <summary>
        /// The default unit of time applied to logged time.
        /// </summary>
        /// <value>The default unit of time applied to logged time.</value>
        [Required]
        [DataMember(Name="defaultUnit", EmitDefaultValue=true)]
        public DefaultUnitEnum DefaultUnit { get; set; }


        /// <summary>
        /// The format that will appear on an issue's *Time Spent* field.
        /// </summary>
        /// <value>The format that will appear on an issue's *Time Spent* field.</value>
        [TypeConverter(typeof(CustomEnumConverter<TimeFormatEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TimeFormatEnum
        {
            
            /// <summary>
            /// Enum PrettyEnum for pretty
            /// </summary>
            [EnumMember(Value = "pretty")]
            PrettyEnum = 1,
            
            /// <summary>
            /// Enum DaysEnum for days
            /// </summary>
            [EnumMember(Value = "days")]
            DaysEnum = 2,
            
            /// <summary>
            /// Enum HoursEnum for hours
            /// </summary>
            [EnumMember(Value = "hours")]
            HoursEnum = 3
        }

        /// <summary>
        /// The format that will appear on an issue&#39;s *Time Spent* field.
        /// </summary>
        /// <value>The format that will appear on an issue&#39;s *Time Spent* field.</value>
        [Required]
        [DataMember(Name="timeFormat", EmitDefaultValue=true)]
        public TimeFormatEnum TimeFormat { get; set; }

        /// <summary>
        /// The number of days in a working week.
        /// </summary>
        /// <value>The number of days in a working week.</value>
        [Required]
        [DataMember(Name="workingDaysPerWeek", EmitDefaultValue=true)]
        public double WorkingDaysPerWeek { get; set; }

        /// <summary>
        /// The number of hours in a working day.
        /// </summary>
        /// <value>The number of hours in a working day.</value>
        [Required]
        [DataMember(Name="workingHoursPerDay", EmitDefaultValue=true)]
        public double WorkingHoursPerDay { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TimeTrackingConfiguration {\n");
            sb.Append("  DefaultUnit: ").Append(DefaultUnit).Append("\n");
            sb.Append("  TimeFormat: ").Append(TimeFormat).Append("\n");
            sb.Append("  WorkingDaysPerWeek: ").Append(WorkingDaysPerWeek).Append("\n");
            sb.Append("  WorkingHoursPerDay: ").Append(WorkingHoursPerDay).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TimeTrackingConfiguration)obj);
        }

        /// <summary>
        /// Returns true if TimeTrackingConfiguration instances are equal
        /// </summary>
        /// <param name="other">Instance of TimeTrackingConfiguration to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TimeTrackingConfiguration other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DefaultUnit == other.DefaultUnit ||
                    
                    DefaultUnit.Equals(other.DefaultUnit)
                ) && 
                (
                    TimeFormat == other.TimeFormat ||
                    
                    TimeFormat.Equals(other.TimeFormat)
                ) && 
                (
                    WorkingDaysPerWeek == other.WorkingDaysPerWeek ||
                    
                    WorkingDaysPerWeek.Equals(other.WorkingDaysPerWeek)
                ) && 
                (
                    WorkingHoursPerDay == other.WorkingHoursPerDay ||
                    
                    WorkingHoursPerDay.Equals(other.WorkingHoursPerDay)
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
                    
                    hashCode = hashCode * 59 + DefaultUnit.GetHashCode();
                    
                    hashCode = hashCode * 59 + TimeFormat.GetHashCode();
                    
                    hashCode = hashCode * 59 + WorkingDaysPerWeek.GetHashCode();
                    
                    hashCode = hashCode * 59 + WorkingHoursPerDay.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TimeTrackingConfiguration left, TimeTrackingConfiguration right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TimeTrackingConfiguration left, TimeTrackingConfiguration right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
