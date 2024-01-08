/*
 * College Football Data API
 *
 * This is an API for accessing all sorts of college football data.  Please note that API keys should be supplied with \"Bearer \" prepended (e.g. \"Bearer your_key\"). API keys can be acquired from the CollegeFootballData.com website.
 *
 * The version of the OpenAPI document: 4.4.12
 * Contact: admin@collegefootballdata.com
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
    public partial class AdvancedSeasonStatDefense : IEquatable<AdvancedSeasonStatDefense>
    {
        /// <summary>
        /// Gets or Sets Drives
        /// </summary>
        [DataMember(Name="drives", EmitDefaultValue=true)]
        public int Drives { get; set; }

        /// <summary>
        /// Gets or Sets Explosiveness
        /// </summary>
        [DataMember(Name="explosiveness", EmitDefaultValue=true)]
        public decimal Explosiveness { get; set; }

        /// <summary>
        /// Gets or Sets FieldPosition
        /// </summary>
        [DataMember(Name="fieldPosition", EmitDefaultValue=false)]
        public AdvancedSeasonStatDefenseFieldPosition FieldPosition { get; set; }

        /// <summary>
        /// Gets or Sets Havoc
        /// </summary>
        [DataMember(Name="havoc", EmitDefaultValue=false)]
        public AdvancedSeasonStatDefenseHavoc Havoc { get; set; }

        /// <summary>
        /// Gets or Sets LineYards
        /// </summary>
        [DataMember(Name="lineYards", EmitDefaultValue=true)]
        public decimal LineYards { get; set; }

        /// <summary>
        /// Gets or Sets LineYardsTotal
        /// </summary>
        [DataMember(Name="lineYardsTotal", EmitDefaultValue=true)]
        public decimal LineYardsTotal { get; set; }

        /// <summary>
        /// Gets or Sets OpenFieldYards
        /// </summary>
        [DataMember(Name="openFieldYards", EmitDefaultValue=true)]
        public decimal OpenFieldYards { get; set; }

        /// <summary>
        /// Gets or Sets OpenFieldYardsTotal
        /// </summary>
        [DataMember(Name="openFieldYardsTotal", EmitDefaultValue=true)]
        public int OpenFieldYardsTotal { get; set; }

        /// <summary>
        /// Gets or Sets PassingDowns
        /// </summary>
        [DataMember(Name="passingDowns", EmitDefaultValue=false)]
        public AdvancedSeasonStatDefensePassingDowns PassingDowns { get; set; }

        /// <summary>
        /// Gets or Sets PassingPlays
        /// </summary>
        [DataMember(Name="passingPlays", EmitDefaultValue=false)]
        public AdvancedSeasonStatDefensePassingPlays PassingPlays { get; set; }

        /// <summary>
        /// Gets or Sets Plays
        /// </summary>
        [DataMember(Name="plays", EmitDefaultValue=true)]
        public int Plays { get; set; }

        /// <summary>
        /// Gets or Sets PointsPerOpportunity
        /// </summary>
        [DataMember(Name="pointsPerOpportunity", EmitDefaultValue=true)]
        public decimal PointsPerOpportunity { get; set; }

        /// <summary>
        /// Gets or Sets PowerSuccess
        /// </summary>
        [DataMember(Name="powerSuccess", EmitDefaultValue=true)]
        public decimal PowerSuccess { get; set; }

        /// <summary>
        /// Gets or Sets Ppa
        /// </summary>
        [DataMember(Name="ppa", EmitDefaultValue=true)]
        public decimal Ppa { get; set; }

        /// <summary>
        /// Gets or Sets RushingPlays
        /// </summary>
        [DataMember(Name="rushingPlays", EmitDefaultValue=false)]
        public AdvancedSeasonStatDefensePassingPlays RushingPlays { get; set; }

        /// <summary>
        /// Gets or Sets SecondLevelYards
        /// </summary>
        [DataMember(Name="secondLevelYards", EmitDefaultValue=true)]
        public decimal SecondLevelYards { get; set; }

        /// <summary>
        /// Gets or Sets SecondLevelYardsTotal
        /// </summary>
        [DataMember(Name="secondLevelYardsTotal", EmitDefaultValue=true)]
        public int SecondLevelYardsTotal { get; set; }

        /// <summary>
        /// Gets or Sets StandardDowns
        /// </summary>
        [DataMember(Name="standardDowns", EmitDefaultValue=false)]
        public AdvancedSeasonStatDefensePassingDowns StandardDowns { get; set; }

        /// <summary>
        /// Gets or Sets StuffRate
        /// </summary>
        [DataMember(Name="stuffRate", EmitDefaultValue=true)]
        public decimal StuffRate { get; set; }

        /// <summary>
        /// Gets or Sets SuccessRate
        /// </summary>
        [DataMember(Name="successRate", EmitDefaultValue=true)]
        public decimal SuccessRate { get; set; }

        /// <summary>
        /// Gets or Sets TotalOpportunies
        /// </summary>
        [DataMember(Name="totalOpportunies", EmitDefaultValue=true)]
        public int TotalOpportunies { get; set; }

        /// <summary>
        /// Gets or Sets TotalPPA
        /// </summary>
        [DataMember(Name="totalPPA", EmitDefaultValue=true)]
        public decimal TotalPPA { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdvancedSeasonStatDefense {\n");
            sb.Append("  Drives: ").Append(Drives).Append("\n");
            sb.Append("  Explosiveness: ").Append(Explosiveness).Append("\n");
            sb.Append("  FieldPosition: ").Append(FieldPosition).Append("\n");
            sb.Append("  Havoc: ").Append(Havoc).Append("\n");
            sb.Append("  LineYards: ").Append(LineYards).Append("\n");
            sb.Append("  LineYardsTotal: ").Append(LineYardsTotal).Append("\n");
            sb.Append("  OpenFieldYards: ").Append(OpenFieldYards).Append("\n");
            sb.Append("  OpenFieldYardsTotal: ").Append(OpenFieldYardsTotal).Append("\n");
            sb.Append("  PassingDowns: ").Append(PassingDowns).Append("\n");
            sb.Append("  PassingPlays: ").Append(PassingPlays).Append("\n");
            sb.Append("  Plays: ").Append(Plays).Append("\n");
            sb.Append("  PointsPerOpportunity: ").Append(PointsPerOpportunity).Append("\n");
            sb.Append("  PowerSuccess: ").Append(PowerSuccess).Append("\n");
            sb.Append("  Ppa: ").Append(Ppa).Append("\n");
            sb.Append("  RushingPlays: ").Append(RushingPlays).Append("\n");
            sb.Append("  SecondLevelYards: ").Append(SecondLevelYards).Append("\n");
            sb.Append("  SecondLevelYardsTotal: ").Append(SecondLevelYardsTotal).Append("\n");
            sb.Append("  StandardDowns: ").Append(StandardDowns).Append("\n");
            sb.Append("  StuffRate: ").Append(StuffRate).Append("\n");
            sb.Append("  SuccessRate: ").Append(SuccessRate).Append("\n");
            sb.Append("  TotalOpportunies: ").Append(TotalOpportunies).Append("\n");
            sb.Append("  TotalPPA: ").Append(TotalPPA).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AdvancedSeasonStatDefense)obj);
        }

        /// <summary>
        /// Returns true if AdvancedSeasonStatDefense instances are equal
        /// </summary>
        /// <param name="other">Instance of AdvancedSeasonStatDefense to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdvancedSeasonStatDefense other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Drives == other.Drives ||
                    
                    Drives.Equals(other.Drives)
                ) && 
                (
                    Explosiveness == other.Explosiveness ||
                    
                    Explosiveness.Equals(other.Explosiveness)
                ) && 
                (
                    FieldPosition == other.FieldPosition ||
                    FieldPosition != null &&
                    FieldPosition.Equals(other.FieldPosition)
                ) && 
                (
                    Havoc == other.Havoc ||
                    Havoc != null &&
                    Havoc.Equals(other.Havoc)
                ) && 
                (
                    LineYards == other.LineYards ||
                    
                    LineYards.Equals(other.LineYards)
                ) && 
                (
                    LineYardsTotal == other.LineYardsTotal ||
                    
                    LineYardsTotal.Equals(other.LineYardsTotal)
                ) && 
                (
                    OpenFieldYards == other.OpenFieldYards ||
                    
                    OpenFieldYards.Equals(other.OpenFieldYards)
                ) && 
                (
                    OpenFieldYardsTotal == other.OpenFieldYardsTotal ||
                    
                    OpenFieldYardsTotal.Equals(other.OpenFieldYardsTotal)
                ) && 
                (
                    PassingDowns == other.PassingDowns ||
                    PassingDowns != null &&
                    PassingDowns.Equals(other.PassingDowns)
                ) && 
                (
                    PassingPlays == other.PassingPlays ||
                    PassingPlays != null &&
                    PassingPlays.Equals(other.PassingPlays)
                ) && 
                (
                    Plays == other.Plays ||
                    
                    Plays.Equals(other.Plays)
                ) && 
                (
                    PointsPerOpportunity == other.PointsPerOpportunity ||
                    
                    PointsPerOpportunity.Equals(other.PointsPerOpportunity)
                ) && 
                (
                    PowerSuccess == other.PowerSuccess ||
                    
                    PowerSuccess.Equals(other.PowerSuccess)
                ) && 
                (
                    Ppa == other.Ppa ||
                    
                    Ppa.Equals(other.Ppa)
                ) && 
                (
                    RushingPlays == other.RushingPlays ||
                    RushingPlays != null &&
                    RushingPlays.Equals(other.RushingPlays)
                ) && 
                (
                    SecondLevelYards == other.SecondLevelYards ||
                    
                    SecondLevelYards.Equals(other.SecondLevelYards)
                ) && 
                (
                    SecondLevelYardsTotal == other.SecondLevelYardsTotal ||
                    
                    SecondLevelYardsTotal.Equals(other.SecondLevelYardsTotal)
                ) && 
                (
                    StandardDowns == other.StandardDowns ||
                    StandardDowns != null &&
                    StandardDowns.Equals(other.StandardDowns)
                ) && 
                (
                    StuffRate == other.StuffRate ||
                    
                    StuffRate.Equals(other.StuffRate)
                ) && 
                (
                    SuccessRate == other.SuccessRate ||
                    
                    SuccessRate.Equals(other.SuccessRate)
                ) && 
                (
                    TotalOpportunies == other.TotalOpportunies ||
                    
                    TotalOpportunies.Equals(other.TotalOpportunies)
                ) && 
                (
                    TotalPPA == other.TotalPPA ||
                    
                    TotalPPA.Equals(other.TotalPPA)
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
                    
                    hashCode = hashCode * 59 + Drives.GetHashCode();
                    
                    hashCode = hashCode * 59 + Explosiveness.GetHashCode();
                    if (FieldPosition != null)
                    hashCode = hashCode * 59 + FieldPosition.GetHashCode();
                    if (Havoc != null)
                    hashCode = hashCode * 59 + Havoc.GetHashCode();
                    
                    hashCode = hashCode * 59 + LineYards.GetHashCode();
                    
                    hashCode = hashCode * 59 + LineYardsTotal.GetHashCode();
                    
                    hashCode = hashCode * 59 + OpenFieldYards.GetHashCode();
                    
                    hashCode = hashCode * 59 + OpenFieldYardsTotal.GetHashCode();
                    if (PassingDowns != null)
                    hashCode = hashCode * 59 + PassingDowns.GetHashCode();
                    if (PassingPlays != null)
                    hashCode = hashCode * 59 + PassingPlays.GetHashCode();
                    
                    hashCode = hashCode * 59 + Plays.GetHashCode();
                    
                    hashCode = hashCode * 59 + PointsPerOpportunity.GetHashCode();
                    
                    hashCode = hashCode * 59 + PowerSuccess.GetHashCode();
                    
                    hashCode = hashCode * 59 + Ppa.GetHashCode();
                    if (RushingPlays != null)
                    hashCode = hashCode * 59 + RushingPlays.GetHashCode();
                    
                    hashCode = hashCode * 59 + SecondLevelYards.GetHashCode();
                    
                    hashCode = hashCode * 59 + SecondLevelYardsTotal.GetHashCode();
                    if (StandardDowns != null)
                    hashCode = hashCode * 59 + StandardDowns.GetHashCode();
                    
                    hashCode = hashCode * 59 + StuffRate.GetHashCode();
                    
                    hashCode = hashCode * 59 + SuccessRate.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalOpportunies.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalPPA.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AdvancedSeasonStatDefense left, AdvancedSeasonStatDefense right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AdvancedSeasonStatDefense left, AdvancedSeasonStatDefense right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}