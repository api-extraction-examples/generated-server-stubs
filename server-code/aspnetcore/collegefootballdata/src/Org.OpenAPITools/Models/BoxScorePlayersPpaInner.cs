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
    public partial class BoxScorePlayersPpaInner : IEquatable<BoxScorePlayersPpaInner>
    {
        /// <summary>
        /// Gets or Sets Average
        /// </summary>
        [DataMember(Name="average", EmitDefaultValue=false)]
        public BoxScorePlayersPpaInnerAverage Average { get; set; }

        /// <summary>
        /// Gets or Sets Cumulative
        /// </summary>
        [DataMember(Name="cumulative", EmitDefaultValue=false)]
        public BoxScorePlayersPpaInnerAverage Cumulative { get; set; }

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
            sb.Append("class BoxScorePlayersPpaInner {\n");
            sb.Append("  Average: ").Append(Average).Append("\n");
            sb.Append("  Cumulative: ").Append(Cumulative).Append("\n");
            sb.Append("  Player: ").Append(Player).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BoxScorePlayersPpaInner)obj);
        }

        /// <summary>
        /// Returns true if BoxScorePlayersPpaInner instances are equal
        /// </summary>
        /// <param name="other">Instance of BoxScorePlayersPpaInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BoxScorePlayersPpaInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Average == other.Average ||
                    Average != null &&
                    Average.Equals(other.Average)
                ) && 
                (
                    Cumulative == other.Cumulative ||
                    Cumulative != null &&
                    Cumulative.Equals(other.Cumulative)
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
                    if (Average != null)
                    hashCode = hashCode * 59 + Average.GetHashCode();
                    if (Cumulative != null)
                    hashCode = hashCode * 59 + Cumulative.GetHashCode();
                    if (Player != null)
                    hashCode = hashCode * 59 + Player.GetHashCode();
                    if (Position != null)
                    hashCode = hashCode * 59 + Position.GetHashCode();
                    if (Team != null)
                    hashCode = hashCode * 59 + Team.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BoxScorePlayersPpaInner left, BoxScorePlayersPpaInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BoxScorePlayersPpaInner left, BoxScorePlayersPpaInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
