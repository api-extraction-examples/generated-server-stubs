/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api-support@lyft.com
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
    /// A non-guaranteed estimate of price
    /// </summary>
    [DataContract]
    public partial class CostEstimate : IEquatable<CostEstimate>
    {
        /// <summary>
        /// A token that confirms the user has accepted current Prime Time and/or fixed price charges. See &#39;Request a Lyft&#39; for more details
        /// </summary>
        /// <value>A token that confirms the user has accepted current Prime Time and/or fixed price charges. See &#39;Request a Lyft&#39; for more details</value>
        [DataMember(Name="cost_token", EmitDefaultValue=false)]
        public string CostToken { get; set; }

        /// <summary>
        /// The ISO 4217 currency code for the amount (e.g. &#39;USD&#39;)
        /// </summary>
        /// <value>The ISO 4217 currency code for the amount (e.g. &#39;USD&#39;)</value>
        [DataMember(Name="currency", EmitDefaultValue=false)]
        public string Currency { get; set; }

        /// <summary>
        /// A human readable description of the ride type
        /// </summary>
        /// <value>A human readable description of the ride type</value>
        [DataMember(Name="display_name", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Estimated upper bound for trip cost, in minor units (cents). Estimates are not guaranteed, and only provide a reasonable range based on current conditions. 
        /// </summary>
        /// <value>Estimated upper bound for trip cost, in minor units (cents). Estimates are not guaranteed, and only provide a reasonable range based on current conditions. </value>
        [DataMember(Name="estimated_cost_cents_max", EmitDefaultValue=true)]
        public int EstimatedCostCentsMax { get; set; }

        /// <summary>
        /// Estimated lower bound for trip cost, in minor units (cents). Estimates are not guaranteed, and only provide a reasonable range based on current conditions. 
        /// </summary>
        /// <value>Estimated lower bound for trip cost, in minor units (cents). Estimates are not guaranteed, and only provide a reasonable range based on current conditions. </value>
        [DataMember(Name="estimated_cost_cents_min", EmitDefaultValue=true)]
        public int EstimatedCostCentsMin { get; set; }

        /// <summary>
        /// Estimated distance for this trip 
        /// </summary>
        /// <value>Estimated distance for this trip </value>
        [DataMember(Name="estimated_distance_miles", EmitDefaultValue=true)]
        public double EstimatedDistanceMiles { get; set; }

        /// <summary>
        /// Estimated time to get from the start location to the end. 
        /// </summary>
        /// <value>Estimated time to get from the start location to the end. </value>
        [DataMember(Name="estimated_duration_seconds", EmitDefaultValue=true)]
        public int EstimatedDurationSeconds { get; set; }

        /// <summary>
        /// The validity of the cost estimate returned
        /// </summary>
        /// <value>The validity of the cost estimate returned</value>
        [DataMember(Name="is_valid_estimate", EmitDefaultValue=true)]
        public bool IsValidEstimate { get; set; }

        /// <summary>
        /// This token is needed when requesting rides. (Deprecated)
        /// </summary>
        /// <value>This token is needed when requesting rides. (Deprecated)</value>
        [DataMember(Name="primetime_confirmation_token", EmitDefaultValue=false)]
        public string PrimetimeConfirmationToken { get; set; }

        /// <summary>
        /// Current Prime Time Percentage. Prime Time adds a percentage to ride costs, prior to other applicable fees. When ride requests greatly outnumber available drivers, our system will automatically turn on Prime Time. If Prime Time is inactive, the value returned will be &#39;0%&#39;. Note: The returned estimate already has Prime Time factored in. The value is returned here for reference and to allow users to confirm/accept Prime Time prior to initiating a ride. 
        /// </summary>
        /// <value>Current Prime Time Percentage. Prime Time adds a percentage to ride costs, prior to other applicable fees. When ride requests greatly outnumber available drivers, our system will automatically turn on Prime Time. If Prime Time is inactive, the value returned will be &#39;0%&#39;. Note: The returned estimate already has Prime Time factored in. The value is returned here for reference and to allow users to confirm/accept Prime Time prior to initiating a ride. </value>
        [DataMember(Name="primetime_percentage", EmitDefaultValue=false)]
        public string PrimetimePercentage { get; set; }

        /// <summary>
        /// Gets or Sets RideType
        /// </summary>
        [DataMember(Name="ride_type", EmitDefaultValue=true)]
        public RideTypeEnum RideType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CostEstimate {\n");
            sb.Append("  CostToken: ").Append(CostToken).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  EstimatedCostCentsMax: ").Append(EstimatedCostCentsMax).Append("\n");
            sb.Append("  EstimatedCostCentsMin: ").Append(EstimatedCostCentsMin).Append("\n");
            sb.Append("  EstimatedDistanceMiles: ").Append(EstimatedDistanceMiles).Append("\n");
            sb.Append("  EstimatedDurationSeconds: ").Append(EstimatedDurationSeconds).Append("\n");
            sb.Append("  IsValidEstimate: ").Append(IsValidEstimate).Append("\n");
            sb.Append("  PrimetimeConfirmationToken: ").Append(PrimetimeConfirmationToken).Append("\n");
            sb.Append("  PrimetimePercentage: ").Append(PrimetimePercentage).Append("\n");
            sb.Append("  RideType: ").Append(RideType).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CostEstimate)obj);
        }

        /// <summary>
        /// Returns true if CostEstimate instances are equal
        /// </summary>
        /// <param name="other">Instance of CostEstimate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CostEstimate other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CostToken == other.CostToken ||
                    CostToken != null &&
                    CostToken.Equals(other.CostToken)
                ) && 
                (
                    Currency == other.Currency ||
                    Currency != null &&
                    Currency.Equals(other.Currency)
                ) && 
                (
                    DisplayName == other.DisplayName ||
                    DisplayName != null &&
                    DisplayName.Equals(other.DisplayName)
                ) && 
                (
                    EstimatedCostCentsMax == other.EstimatedCostCentsMax ||
                    
                    EstimatedCostCentsMax.Equals(other.EstimatedCostCentsMax)
                ) && 
                (
                    EstimatedCostCentsMin == other.EstimatedCostCentsMin ||
                    
                    EstimatedCostCentsMin.Equals(other.EstimatedCostCentsMin)
                ) && 
                (
                    EstimatedDistanceMiles == other.EstimatedDistanceMiles ||
                    
                    EstimatedDistanceMiles.Equals(other.EstimatedDistanceMiles)
                ) && 
                (
                    EstimatedDurationSeconds == other.EstimatedDurationSeconds ||
                    
                    EstimatedDurationSeconds.Equals(other.EstimatedDurationSeconds)
                ) && 
                (
                    IsValidEstimate == other.IsValidEstimate ||
                    
                    IsValidEstimate.Equals(other.IsValidEstimate)
                ) && 
                (
                    PrimetimeConfirmationToken == other.PrimetimeConfirmationToken ||
                    PrimetimeConfirmationToken != null &&
                    PrimetimeConfirmationToken.Equals(other.PrimetimeConfirmationToken)
                ) && 
                (
                    PrimetimePercentage == other.PrimetimePercentage ||
                    PrimetimePercentage != null &&
                    PrimetimePercentage.Equals(other.PrimetimePercentage)
                ) && 
                (
                    RideType == other.RideType ||
                    
                    RideType.Equals(other.RideType)
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
                    if (CostToken != null)
                    hashCode = hashCode * 59 + CostToken.GetHashCode();
                    if (Currency != null)
                    hashCode = hashCode * 59 + Currency.GetHashCode();
                    if (DisplayName != null)
                    hashCode = hashCode * 59 + DisplayName.GetHashCode();
                    
                    hashCode = hashCode * 59 + EstimatedCostCentsMax.GetHashCode();
                    
                    hashCode = hashCode * 59 + EstimatedCostCentsMin.GetHashCode();
                    
                    hashCode = hashCode * 59 + EstimatedDistanceMiles.GetHashCode();
                    
                    hashCode = hashCode * 59 + EstimatedDurationSeconds.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsValidEstimate.GetHashCode();
                    if (PrimetimeConfirmationToken != null)
                    hashCode = hashCode * 59 + PrimetimeConfirmationToken.GetHashCode();
                    if (PrimetimePercentage != null)
                    hashCode = hashCode * 59 + PrimetimePercentage.GetHashCode();
                    
                    hashCode = hashCode * 59 + RideType.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CostEstimate left, CostEstimate right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CostEstimate left, CostEstimate right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
