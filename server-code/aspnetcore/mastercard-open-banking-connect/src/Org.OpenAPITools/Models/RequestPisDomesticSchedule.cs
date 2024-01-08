/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * The version of the OpenAPI document: 1.16.0
 * Contact: apisupport@mastercard.com
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
    public partial class RequestPisDomesticSchedule : IEquatable<RequestPisDomesticSchedule>
    {
        /// <summary>
        /// End date for the schedule
        /// </summary>
        /// <value>End date for the schedule</value>
        [DataMember(Name="endDate", EmitDefaultValue=false)]
        public DateTime EndDate { get; set; }


        /// <summary>
        /// Frequency type
        /// </summary>
        /// <value>Frequency type</value>
        [TypeConverter(typeof(CustomEnumConverter<FrequencyEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum FrequencyEnum
        {
            
            /// <summary>
            /// Enum DAILEnum for DAIL
            /// </summary>
            [EnumMember(Value = "DAIL")]
            DAILEnum = 1,
            
            /// <summary>
            /// Enum WEEKEnum for WEEK
            /// </summary>
            [EnumMember(Value = "WEEK")]
            WEEKEnum = 2,
            
            /// <summary>
            /// Enum MNTHEnum for MNTH
            /// </summary>
            [EnumMember(Value = "MNTH")]
            MNTHEnum = 3,
            
            /// <summary>
            /// Enum QUTREnum for QUTR
            /// </summary>
            [EnumMember(Value = "QUTR")]
            QUTREnum = 4,
            
            /// <summary>
            /// Enum SEMIEnum for SEMI
            /// </summary>
            [EnumMember(Value = "SEMI")]
            SEMIEnum = 5,
            
            /// <summary>
            /// Enum YEAREnum for YEAR
            /// </summary>
            [EnumMember(Value = "YEAR")]
            YEAREnum = 6
        }

        /// <summary>
        /// Frequency type
        /// </summary>
        /// <value>Frequency type</value>
        [Required]
        [DataMember(Name="frequency", EmitDefaultValue=true)]
        public FrequencyEnum Frequency { get; set; }

        /// <summary>
        /// Start date for the schedule
        /// </summary>
        /// <value>Start date for the schedule</value>
        [Required]
        [DataMember(Name="startDate", EmitDefaultValue=false)]
        public DateTime StartDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RequestPisDomesticSchedule {\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RequestPisDomesticSchedule)obj);
        }

        /// <summary>
        /// Returns true if RequestPisDomesticSchedule instances are equal
        /// </summary>
        /// <param name="other">Instance of RequestPisDomesticSchedule to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RequestPisDomesticSchedule other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    EndDate == other.EndDate ||
                    EndDate != null &&
                    EndDate.Equals(other.EndDate)
                ) && 
                (
                    Frequency == other.Frequency ||
                    
                    Frequency.Equals(other.Frequency)
                ) && 
                (
                    StartDate == other.StartDate ||
                    StartDate != null &&
                    StartDate.Equals(other.StartDate)
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
                    if (EndDate != null)
                    hashCode = hashCode * 59 + EndDate.GetHashCode();
                    
                    hashCode = hashCode * 59 + Frequency.GetHashCode();
                    if (StartDate != null)
                    hashCode = hashCode * 59 + StartDate.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RequestPisDomesticSchedule left, RequestPisDomesticSchedule right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RequestPisDomesticSchedule left, RequestPisDomesticSchedule right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
