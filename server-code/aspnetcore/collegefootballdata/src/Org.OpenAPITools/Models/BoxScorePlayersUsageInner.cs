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
    public partial class BoxScorePlayersUsageInner : IEquatable<BoxScorePlayersUsageInner>
    {
        /// <summary>
        /// Gets or Sets Passing
        /// </summary>
        [DataMember(Name="passing", EmitDefaultValue=true)]
        public decimal Passing { get; set; }

        /// <summary>
        /// Gets or Sets Player
        /// </summary>
        [DataMember(Name="player", EmitDefaultValue=false)]
        public string Player { get; set; }

        /// <summary>
        /// Gets or Sets Position
        /// </summary>
        [DataMember(Name="position", EmitDefaultValue=false)]
        public string Position { get; set; }

        /// <summary>
        /// Gets or Sets Quarter1
        /// </summary>
        [DataMember(Name="quarter1", EmitDefaultValue=true)]
        public decimal Quarter1 { get; set; }

        /// <summary>
        /// Gets or Sets Quarter2
        /// </summary>
        [DataMember(Name="quarter2", EmitDefaultValue=true)]
        public decimal Quarter2 { get; set; }

        /// <summary>
        /// Gets or Sets Quarter3
        /// </summary>
        [DataMember(Name="quarter3", EmitDefaultValue=true)]
        public decimal Quarter3 { get; set; }

        /// <summary>
        /// Gets or Sets Quarter4
        /// </summary>
        [DataMember(Name="quarter4", EmitDefaultValue=true)]
        public decimal Quarter4 { get; set; }

        /// <summary>
        /// Gets or Sets Rushing
        /// </summary>
        [DataMember(Name="rushing", EmitDefaultValue=true)]
        public decimal Rushing { get; set; }

        /// <summary>
        /// Gets or Sets Team
        /// </summary>
        [DataMember(Name="team", EmitDefaultValue=false)]
        public string Team { get; set; }

        /// <summary>
        /// Gets or Sets Total
        /// </summary>
        [DataMember(Name="total", EmitDefaultValue=true)]
        public decimal Total { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BoxScorePlayersUsageInner {\n");
            sb.Append("  Passing: ").Append(Passing).Append("\n");
            sb.Append("  Player: ").Append(Player).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  Quarter1: ").Append(Quarter1).Append("\n");
            sb.Append("  Quarter2: ").Append(Quarter2).Append("\n");
            sb.Append("  Quarter3: ").Append(Quarter3).Append("\n");
            sb.Append("  Quarter4: ").Append(Quarter4).Append("\n");
            sb.Append("  Rushing: ").Append(Rushing).Append("\n");
            sb.Append("  Team: ").Append(Team).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BoxScorePlayersUsageInner)obj);
        }

        /// <summary>
        /// Returns true if BoxScorePlayersUsageInner instances are equal
        /// </summary>
        /// <param name="other">Instance of BoxScorePlayersUsageInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BoxScorePlayersUsageInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Passing == other.Passing ||
                    
                    Passing.Equals(other.Passing)
                ) && 
                (
                    Player == other.Player ||
                    Player != null &&
                    Player.Equals(other.Player)
                ) && 
                (
                    Position == other.Position ||
                    Position != null &&
                    Position.Equals(other.Position)
                ) && 
                (
                    Quarter1 == other.Quarter1 ||
                    
                    Quarter1.Equals(other.Quarter1)
                ) && 
                (
                    Quarter2 == other.Quarter2 ||
                    
                    Quarter2.Equals(other.Quarter2)
                ) && 
                (
                    Quarter3 == other.Quarter3 ||
                    
                    Quarter3.Equals(other.Quarter3)
                ) && 
                (
                    Quarter4 == other.Quarter4 ||
                    
                    Quarter4.Equals(other.Quarter4)
                ) && 
                (
                    Rushing == other.Rushing ||
                    
                    Rushing.Equals(other.Rushing)
                ) && 
                (
                    Team == other.Team ||
                    Team != null &&
                    Team.Equals(other.Team)
                ) && 
                (
                    Total == other.Total ||
                    
                    Total.Equals(other.Total)
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
                    
                    hashCode = hashCode * 59 + Passing.GetHashCode();
                    if (Player != null)
                    hashCode = hashCode * 59 + Player.GetHashCode();
                    if (Position != null)
                    hashCode = hashCode * 59 + Position.GetHashCode();
                    
                    hashCode = hashCode * 59 + Quarter1.GetHashCode();
                    
                    hashCode = hashCode * 59 + Quarter2.GetHashCode();
                    
                    hashCode = hashCode * 59 + Quarter3.GetHashCode();
                    
                    hashCode = hashCode * 59 + Quarter4.GetHashCode();
                    
                    hashCode = hashCode * 59 + Rushing.GetHashCode();
                    if (Team != null)
                    hashCode = hashCode * 59 + Team.GetHashCode();
                    
                    hashCode = hashCode * 59 + Total.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BoxScorePlayersUsageInner left, BoxScorePlayersUsageInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BoxScorePlayersUsageInner left, BoxScorePlayersUsageInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
