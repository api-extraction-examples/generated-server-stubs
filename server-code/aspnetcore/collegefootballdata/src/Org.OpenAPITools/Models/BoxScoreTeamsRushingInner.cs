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
    public partial class BoxScoreTeamsRushingInner : IEquatable<BoxScoreTeamsRushingInner>
    {
        /// <summary>
        /// Gets or Sets LineYards
        /// </summary>
        [DataMember(Name="lineYards", EmitDefaultValue=true)]
        public decimal LineYards { get; set; }

        /// <summary>
        /// Gets or Sets LineYardsAverage
        /// </summary>
        [DataMember(Name="lineYardsAverage", EmitDefaultValue=true)]
        public decimal LineYardsAverage { get; set; }

        /// <summary>
        /// Gets or Sets OpenFieldYards
        /// </summary>
        [DataMember(Name="openFieldYards", EmitDefaultValue=true)]
        public int OpenFieldYards { get; set; }

        /// <summary>
        /// Gets or Sets OpenFieldYardsAverage
        /// </summary>
        [DataMember(Name="openFieldYardsAverage", EmitDefaultValue=true)]
        public decimal OpenFieldYardsAverage { get; set; }

        /// <summary>
        /// Gets or Sets PowerSuccess
        /// </summary>
        [DataMember(Name="powerSuccess", EmitDefaultValue=true)]
        public decimal PowerSuccess { get; set; }

        /// <summary>
        /// Gets or Sets SecondLevelYards
        /// </summary>
        [DataMember(Name="secondLevelYards", EmitDefaultValue=true)]
        public int SecondLevelYards { get; set; }

        /// <summary>
        /// Gets or Sets SecondLevelYardsAverage
        /// </summary>
        [DataMember(Name="secondLevelYardsAverage", EmitDefaultValue=true)]
        public decimal SecondLevelYardsAverage { get; set; }

        /// <summary>
        /// Gets or Sets StuffRate
        /// </summary>
        [DataMember(Name="stuffRate", EmitDefaultValue=true)]
        public decimal StuffRate { get; set; }

        /// <summary>
        /// Gets or Sets Team
        /// </summary>
        [DataMember(Name="team", EmitDefaultValue=false)]
        public string Team { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BoxScoreTeamsRushingInner {\n");
            sb.Append("  LineYards: ").Append(LineYards).Append("\n");
            sb.Append("  LineYardsAverage: ").Append(LineYardsAverage).Append("\n");
            sb.Append("  OpenFieldYards: ").Append(OpenFieldYards).Append("\n");
            sb.Append("  OpenFieldYardsAverage: ").Append(OpenFieldYardsAverage).Append("\n");
            sb.Append("  PowerSuccess: ").Append(PowerSuccess).Append("\n");
            sb.Append("  SecondLevelYards: ").Append(SecondLevelYards).Append("\n");
            sb.Append("  SecondLevelYardsAverage: ").Append(SecondLevelYardsAverage).Append("\n");
            sb.Append("  StuffRate: ").Append(StuffRate).Append("\n");
            sb.Append("  Team: ").Append(Team).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BoxScoreTeamsRushingInner)obj);
        }

        /// <summary>
        /// Returns true if BoxScoreTeamsRushingInner instances are equal
        /// </summary>
        /// <param name="other">Instance of BoxScoreTeamsRushingInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BoxScoreTeamsRushingInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    LineYards == other.LineYards ||
                    
                    LineYards.Equals(other.LineYards)
                ) && 
                (
                    LineYardsAverage == other.LineYardsAverage ||
                    
                    LineYardsAverage.Equals(other.LineYardsAverage)
                ) && 
                (
                    OpenFieldYards == other.OpenFieldYards ||
                    
                    OpenFieldYards.Equals(other.OpenFieldYards)
                ) && 
                (
                    OpenFieldYardsAverage == other.OpenFieldYardsAverage ||
                    
                    OpenFieldYardsAverage.Equals(other.OpenFieldYardsAverage)
                ) && 
                (
                    PowerSuccess == other.PowerSuccess ||
                    
                    PowerSuccess.Equals(other.PowerSuccess)
                ) && 
                (
                    SecondLevelYards == other.SecondLevelYards ||
                    
                    SecondLevelYards.Equals(other.SecondLevelYards)
                ) && 
                (
                    SecondLevelYardsAverage == other.SecondLevelYardsAverage ||
                    
                    SecondLevelYardsAverage.Equals(other.SecondLevelYardsAverage)
                ) && 
                (
                    StuffRate == other.StuffRate ||
                    
                    StuffRate.Equals(other.StuffRate)
                ) && 
                (
                    Team == other.Team ||
                    Team != null &&
                    Team.Equals(other.Team)
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
                    
                    hashCode = hashCode * 59 + LineYards.GetHashCode();
                    
                    hashCode = hashCode * 59 + LineYardsAverage.GetHashCode();
                    
                    hashCode = hashCode * 59 + OpenFieldYards.GetHashCode();
                    
                    hashCode = hashCode * 59 + OpenFieldYardsAverage.GetHashCode();
                    
                    hashCode = hashCode * 59 + PowerSuccess.GetHashCode();
                    
                    hashCode = hashCode * 59 + SecondLevelYards.GetHashCode();
                    
                    hashCode = hashCode * 59 + SecondLevelYardsAverage.GetHashCode();
                    
                    hashCode = hashCode * 59 + StuffRate.GetHashCode();
                    if (Team != null)
                    hashCode = hashCode * 59 + Team.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BoxScoreTeamsRushingInner left, BoxScoreTeamsRushingInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BoxScoreTeamsRushingInner left, BoxScoreTeamsRushingInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}