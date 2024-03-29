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
    public partial class TeamGameTeamsInner : IEquatable<TeamGameTeamsInner>
    {
        /// <summary>
        /// Gets or Sets Conference
        /// </summary>
        [DataMember(Name="conference", EmitDefaultValue=false)]
        public string Conference { get; set; }

        /// <summary>
        /// Gets or Sets HomeAway
        /// </summary>
        [DataMember(Name="homeAway", EmitDefaultValue=false)]
        public string HomeAway { get; set; }

        /// <summary>
        /// Gets or Sets Points
        /// </summary>
        [DataMember(Name="points", EmitDefaultValue=true)]
        public int Points { get; set; }

        /// <summary>
        /// Gets or Sets School
        /// </summary>
        [DataMember(Name="school", EmitDefaultValue=false)]
        public string School { get; set; }

        /// <summary>
        /// Gets or Sets Stats
        /// </summary>
        [DataMember(Name="stats", EmitDefaultValue=false)]
        public List<TeamGameTeamsInnerStatsInner> Stats { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TeamGameTeamsInner {\n");
            sb.Append("  Conference: ").Append(Conference).Append("\n");
            sb.Append("  HomeAway: ").Append(HomeAway).Append("\n");
            sb.Append("  Points: ").Append(Points).Append("\n");
            sb.Append("  School: ").Append(School).Append("\n");
            sb.Append("  Stats: ").Append(Stats).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TeamGameTeamsInner)obj);
        }

        /// <summary>
        /// Returns true if TeamGameTeamsInner instances are equal
        /// </summary>
        /// <param name="other">Instance of TeamGameTeamsInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TeamGameTeamsInner other)
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
                    HomeAway == other.HomeAway ||
                    HomeAway != null &&
                    HomeAway.Equals(other.HomeAway)
                ) && 
                (
                    Points == other.Points ||
                    
                    Points.Equals(other.Points)
                ) && 
                (
                    School == other.School ||
                    School != null &&
                    School.Equals(other.School)
                ) && 
                (
                    Stats == other.Stats ||
                    Stats != null &&
                    other.Stats != null &&
                    Stats.SequenceEqual(other.Stats)
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
                    if (HomeAway != null)
                    hashCode = hashCode * 59 + HomeAway.GetHashCode();
                    
                    hashCode = hashCode * 59 + Points.GetHashCode();
                    if (School != null)
                    hashCode = hashCode * 59 + School.GetHashCode();
                    if (Stats != null)
                    hashCode = hashCode * 59 + Stats.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TeamGameTeamsInner left, TeamGameTeamsInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TeamGameTeamsInner left, TeamGameTeamsInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
