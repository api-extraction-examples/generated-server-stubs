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
    public partial class GamePPA : IEquatable<GamePPA>
    {
        /// <summary>
        /// Gets or Sets Conference
        /// </summary>
        [DataMember(Name="conference", EmitDefaultValue=false)]
        public string Conference { get; set; }

        /// <summary>
        /// Gets or Sets Defense
        /// </summary>
        [DataMember(Name="defense", EmitDefaultValue=false)]
        public GamePPADefense Defense { get; set; }

        /// <summary>
        /// Gets or Sets GameId
        /// </summary>
        [DataMember(Name="gameId", EmitDefaultValue=true)]
        public int GameId { get; set; }

        /// <summary>
        /// Gets or Sets Offense
        /// </summary>
        [DataMember(Name="offense", EmitDefaultValue=false)]
        public GamePPADefense Offense { get; set; }

        /// <summary>
        /// Gets or Sets Opponent
        /// </summary>
        [DataMember(Name="opponent", EmitDefaultValue=false)]
        public string Opponent { get; set; }

        /// <summary>
        /// Gets or Sets Season
        /// </summary>
        [DataMember(Name="season", EmitDefaultValue=true)]
        public int Season { get; set; }

        /// <summary>
        /// Gets or Sets Team
        /// </summary>
        [DataMember(Name="team", EmitDefaultValue=false)]
        public string Team { get; set; }

        /// <summary>
        /// Gets or Sets Week
        /// </summary>
        [DataMember(Name="week", EmitDefaultValue=true)]
        public int Week { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GamePPA {\n");
            sb.Append("  Conference: ").Append(Conference).Append("\n");
            sb.Append("  Defense: ").Append(Defense).Append("\n");
            sb.Append("  GameId: ").Append(GameId).Append("\n");
            sb.Append("  Offense: ").Append(Offense).Append("\n");
            sb.Append("  Opponent: ").Append(Opponent).Append("\n");
            sb.Append("  Season: ").Append(Season).Append("\n");
            sb.Append("  Team: ").Append(Team).Append("\n");
            sb.Append("  Week: ").Append(Week).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GamePPA)obj);
        }

        /// <summary>
        /// Returns true if GamePPA instances are equal
        /// </summary>
        /// <param name="other">Instance of GamePPA to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GamePPA other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Conference == other.Conference ||
                    Conference != null &&
                    Conference.Equals(other.Conference)
                ) && 
                (
                    Defense == other.Defense ||
                    Defense != null &&
                    Defense.Equals(other.Defense)
                ) && 
                (
                    GameId == other.GameId ||
                    
                    GameId.Equals(other.GameId)
                ) && 
                (
                    Offense == other.Offense ||
                    Offense != null &&
                    Offense.Equals(other.Offense)
                ) && 
                (
                    Opponent == other.Opponent ||
                    Opponent != null &&
                    Opponent.Equals(other.Opponent)
                ) && 
                (
                    Season == other.Season ||
                    
                    Season.Equals(other.Season)
                ) && 
                (
                    Team == other.Team ||
                    Team != null &&
                    Team.Equals(other.Team)
                ) && 
                (
                    Week == other.Week ||
                    
                    Week.Equals(other.Week)
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
                    if (Conference != null)
                    hashCode = hashCode * 59 + Conference.GetHashCode();
                    if (Defense != null)
                    hashCode = hashCode * 59 + Defense.GetHashCode();
                    
                    hashCode = hashCode * 59 + GameId.GetHashCode();
                    if (Offense != null)
                    hashCode = hashCode * 59 + Offense.GetHashCode();
                    if (Opponent != null)
                    hashCode = hashCode * 59 + Opponent.GetHashCode();
                    
                    hashCode = hashCode * 59 + Season.GetHashCode();
                    if (Team != null)
                    hashCode = hashCode * 59 + Team.GetHashCode();
                    
                    hashCode = hashCode * 59 + Week.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GamePPA left, GamePPA right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GamePPA left, GamePPA right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
