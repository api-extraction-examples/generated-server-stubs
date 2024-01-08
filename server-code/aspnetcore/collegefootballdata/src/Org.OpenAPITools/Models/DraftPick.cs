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
    public partial class DraftPick : IEquatable<DraftPick>
    {
        /// <summary>
        /// Gets or Sets CollegeAthleteId
        /// </summary>
        [DataMember(Name="collegeAthleteId", EmitDefaultValue=true)]
        public int CollegeAthleteId { get; set; }

        /// <summary>
        /// Gets or Sets CollegeConference
        /// </summary>
        [DataMember(Name="collegeConference", EmitDefaultValue=false)]
        public string CollegeConference { get; set; }

        /// <summary>
        /// Gets or Sets CollegeId
        /// </summary>
        [DataMember(Name="collegeId", EmitDefaultValue=true)]
        public int CollegeId { get; set; }

        /// <summary>
        /// Gets or Sets CollegeTeam
        /// </summary>
        [DataMember(Name="collegeTeam", EmitDefaultValue=false)]
        public string CollegeTeam { get; set; }

        /// <summary>
        /// Gets or Sets Height
        /// </summary>
        [DataMember(Name="height", EmitDefaultValue=true)]
        public int Height { get; set; }

        /// <summary>
        /// Gets or Sets HometownInfo
        /// </summary>
        [DataMember(Name="hometownInfo", EmitDefaultValue=false)]
        public DraftPickHometownInfo HometownInfo { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets NflAthleteId
        /// </summary>
        [DataMember(Name="nflAthleteId", EmitDefaultValue=true)]
        public int NflAthleteId { get; set; }

        /// <summary>
        /// Gets or Sets NflTeam
        /// </summary>
        [DataMember(Name="nflTeam", EmitDefaultValue=false)]
        public string NflTeam { get; set; }

        /// <summary>
        /// Gets or Sets Overall
        /// </summary>
        [DataMember(Name="overall", EmitDefaultValue=true)]
        public int Overall { get; set; }

        /// <summary>
        /// Gets or Sets Pick
        /// </summary>
        [DataMember(Name="pick", EmitDefaultValue=true)]
        public int Pick { get; set; }

        /// <summary>
        /// Gets or Sets Position
        /// </summary>
        [DataMember(Name="position", EmitDefaultValue=false)]
        public string Position { get; set; }

        /// <summary>
        /// Gets or Sets PreDraftGrade
        /// </summary>
        [DataMember(Name="preDraftGrade", EmitDefaultValue=true)]
        public int PreDraftGrade { get; set; }

        /// <summary>
        /// Gets or Sets PreDraftPositionRanking
        /// </summary>
        [DataMember(Name="preDraftPositionRanking", EmitDefaultValue=true)]
        public int PreDraftPositionRanking { get; set; }

        /// <summary>
        /// Gets or Sets PreDraftRanking
        /// </summary>
        [DataMember(Name="preDraftRanking", EmitDefaultValue=true)]
        public int PreDraftRanking { get; set; }

        /// <summary>
        /// Gets or Sets Round
        /// </summary>
        [DataMember(Name="round", EmitDefaultValue=true)]
        public int Round { get; set; }

        /// <summary>
        /// Gets or Sets Weight
        /// </summary>
        [DataMember(Name="weight", EmitDefaultValue=true)]
        public int Weight { get; set; }

        /// <summary>
        /// Gets or Sets Year
        /// </summary>
        [DataMember(Name="year", EmitDefaultValue=true)]
        public int Year { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DraftPick {\n");
            sb.Append("  CollegeAthleteId: ").Append(CollegeAthleteId).Append("\n");
            sb.Append("  CollegeConference: ").Append(CollegeConference).Append("\n");
            sb.Append("  CollegeId: ").Append(CollegeId).Append("\n");
            sb.Append("  CollegeTeam: ").Append(CollegeTeam).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  HometownInfo: ").Append(HometownInfo).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  NflAthleteId: ").Append(NflAthleteId).Append("\n");
            sb.Append("  NflTeam: ").Append(NflTeam).Append("\n");
            sb.Append("  Overall: ").Append(Overall).Append("\n");
            sb.Append("  Pick: ").Append(Pick).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  PreDraftGrade: ").Append(PreDraftGrade).Append("\n");
            sb.Append("  PreDraftPositionRanking: ").Append(PreDraftPositionRanking).Append("\n");
            sb.Append("  PreDraftRanking: ").Append(PreDraftRanking).Append("\n");
            sb.Append("  Round: ").Append(Round).Append("\n");
            sb.Append("  Weight: ").Append(Weight).Append("\n");
            sb.Append("  Year: ").Append(Year).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DraftPick)obj);
        }

        /// <summary>
        /// Returns true if DraftPick instances are equal
        /// </summary>
        /// <param name="other">Instance of DraftPick to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DraftPick other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CollegeAthleteId == other.CollegeAthleteId ||
                    
                    CollegeAthleteId.Equals(other.CollegeAthleteId)
                ) && 
                (
                    CollegeConference == other.CollegeConference ||
                    CollegeConference != null &&
                    CollegeConference.Equals(other.CollegeConference)
                ) && 
                (
                    CollegeId == other.CollegeId ||
                    
                    CollegeId.Equals(other.CollegeId)
                ) && 
                (
                    CollegeTeam == other.CollegeTeam ||
                    CollegeTeam != null &&
                    CollegeTeam.Equals(other.CollegeTeam)
                ) && 
                (
                    Height == other.Height ||
                    
                    Height.Equals(other.Height)
                ) && 
                (
                    HometownInfo == other.HometownInfo ||
                    HometownInfo != null &&
                    HometownInfo.Equals(other.HometownInfo)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    NflAthleteId == other.NflAthleteId ||
                    
                    NflAthleteId.Equals(other.NflAthleteId)
                ) && 
                (
                    NflTeam == other.NflTeam ||
                    NflTeam != null &&
                    NflTeam.Equals(other.NflTeam)
                ) && 
                (
                    Overall == other.Overall ||
                    
                    Overall.Equals(other.Overall)
                ) && 
                (
                    Pick == other.Pick ||
                    
                    Pick.Equals(other.Pick)
                ) && 
                (
                    Position == other.Position ||
                    Position != null &&
                    Position.Equals(other.Position)
                ) && 
                (
                    PreDraftGrade == other.PreDraftGrade ||
                    
                    PreDraftGrade.Equals(other.PreDraftGrade)
                ) && 
                (
                    PreDraftPositionRanking == other.PreDraftPositionRanking ||
                    
                    PreDraftPositionRanking.Equals(other.PreDraftPositionRanking)
                ) && 
                (
                    PreDraftRanking == other.PreDraftRanking ||
                    
                    PreDraftRanking.Equals(other.PreDraftRanking)
                ) && 
                (
                    Round == other.Round ||
                    
                    Round.Equals(other.Round)
                ) && 
                (
                    Weight == other.Weight ||
                    
                    Weight.Equals(other.Weight)
                ) && 
                (
                    Year == other.Year ||
                    
                    Year.Equals(other.Year)
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
                    
                    hashCode = hashCode * 59 + CollegeAthleteId.GetHashCode();
                    if (CollegeConference != null)
                    hashCode = hashCode * 59 + CollegeConference.GetHashCode();
                    
                    hashCode = hashCode * 59 + CollegeId.GetHashCode();
                    if (CollegeTeam != null)
                    hashCode = hashCode * 59 + CollegeTeam.GetHashCode();
                    
                    hashCode = hashCode * 59 + Height.GetHashCode();
                    if (HometownInfo != null)
                    hashCode = hashCode * 59 + HometownInfo.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + NflAthleteId.GetHashCode();
                    if (NflTeam != null)
                    hashCode = hashCode * 59 + NflTeam.GetHashCode();
                    
                    hashCode = hashCode * 59 + Overall.GetHashCode();
                    
                    hashCode = hashCode * 59 + Pick.GetHashCode();
                    if (Position != null)
                    hashCode = hashCode * 59 + Position.GetHashCode();
                    
                    hashCode = hashCode * 59 + PreDraftGrade.GetHashCode();
                    
                    hashCode = hashCode * 59 + PreDraftPositionRanking.GetHashCode();
                    
                    hashCode = hashCode * 59 + PreDraftRanking.GetHashCode();
                    
                    hashCode = hashCode * 59 + Round.GetHashCode();
                    
                    hashCode = hashCode * 59 + Weight.GetHashCode();
                    
                    hashCode = hashCode * 59 + Year.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DraftPick left, DraftPick right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DraftPick left, DraftPick right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}