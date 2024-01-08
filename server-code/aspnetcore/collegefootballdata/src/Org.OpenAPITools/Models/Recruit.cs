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
    public partial class Recruit : IEquatable<Recruit>
    {
        /// <summary>
        /// Gets or Sets AthleteId
        /// </summary>
        [DataMember(Name="athleteId", EmitDefaultValue=true)]
        public int AthleteId { get; set; }

        /// <summary>
        /// Gets or Sets City
        /// </summary>
        [DataMember(Name="city", EmitDefaultValue=false)]
        public string City { get; set; }

        /// <summary>
        /// Gets or Sets CommittedTo
        /// </summary>
        [DataMember(Name="committedTo", EmitDefaultValue=false)]
        public string CommittedTo { get; set; }

        /// <summary>
        /// Gets or Sets Country
        /// </summary>
        [DataMember(Name="country", EmitDefaultValue=false)]
        public string Country { get; set; }

        /// <summary>
        /// Gets or Sets Height
        /// </summary>
        [DataMember(Name="height", EmitDefaultValue=true)]
        public decimal Height { get; set; }

        /// <summary>
        /// Gets or Sets HometownInfo
        /// </summary>
        [DataMember(Name="hometownInfo", EmitDefaultValue=false)]
        public RecruitHometownInfo HometownInfo { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Position
        /// </summary>
        [DataMember(Name="position", EmitDefaultValue=false)]
        public string Position { get; set; }

        /// <summary>
        /// Gets or Sets Ranking
        /// </summary>
        [DataMember(Name="ranking", EmitDefaultValue=true)]
        public int Ranking { get; set; }

        /// <summary>
        /// Gets or Sets Rating
        /// </summary>
        [DataMember(Name="rating", EmitDefaultValue=true)]
        public decimal Rating { get; set; }

        /// <summary>
        /// Gets or Sets RecruitType
        /// </summary>
        [DataMember(Name="recruitType", EmitDefaultValue=false)]
        public string RecruitType { get; set; }

        /// <summary>
        /// Gets or Sets School
        /// </summary>
        [DataMember(Name="school", EmitDefaultValue=false)]
        public string School { get; set; }

        /// <summary>
        /// Gets or Sets Stars
        /// </summary>
        [DataMember(Name="stars", EmitDefaultValue=true)]
        public int Stars { get; set; }

        /// <summary>
        /// Gets or Sets StateProvince
        /// </summary>
        [DataMember(Name="stateProvince", EmitDefaultValue=false)]
        public string StateProvince { get; set; }

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
            sb.Append("class Recruit {\n");
            sb.Append("  AthleteId: ").Append(AthleteId).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  CommittedTo: ").Append(CommittedTo).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  HometownInfo: ").Append(HometownInfo).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  Ranking: ").Append(Ranking).Append("\n");
            sb.Append("  Rating: ").Append(Rating).Append("\n");
            sb.Append("  RecruitType: ").Append(RecruitType).Append("\n");
            sb.Append("  School: ").Append(School).Append("\n");
            sb.Append("  Stars: ").Append(Stars).Append("\n");
            sb.Append("  StateProvince: ").Append(StateProvince).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Recruit)obj);
        }

        /// <summary>
        /// Returns true if Recruit instances are equal
        /// </summary>
        /// <param name="other">Instance of Recruit to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Recruit other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AthleteId == other.AthleteId ||
                    
                    AthleteId.Equals(other.AthleteId)
                ) && 
                (
                    City == other.City ||
                    City != null &&
                    City.Equals(other.City)
                ) && 
                (
                    CommittedTo == other.CommittedTo ||
                    CommittedTo != null &&
                    CommittedTo.Equals(other.CommittedTo)
                ) && 
                (
                    Country == other.Country ||
                    Country != null &&
                    Country.Equals(other.Country)
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
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Position == other.Position ||
                    Position != null &&
                    Position.Equals(other.Position)
                ) && 
                (
                    Ranking == other.Ranking ||
                    
                    Ranking.Equals(other.Ranking)
                ) && 
                (
                    Rating == other.Rating ||
                    
                    Rating.Equals(other.Rating)
                ) && 
                (
                    RecruitType == other.RecruitType ||
                    RecruitType != null &&
                    RecruitType.Equals(other.RecruitType)
                ) && 
                (
                    School == other.School ||
                    School != null &&
                    School.Equals(other.School)
                ) && 
                (
                    Stars == other.Stars ||
                    
                    Stars.Equals(other.Stars)
                ) && 
                (
                    StateProvince == other.StateProvince ||
                    StateProvince != null &&
                    StateProvince.Equals(other.StateProvince)
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
                    
                    hashCode = hashCode * 59 + AthleteId.GetHashCode();
                    if (City != null)
                    hashCode = hashCode * 59 + City.GetHashCode();
                    if (CommittedTo != null)
                    hashCode = hashCode * 59 + CommittedTo.GetHashCode();
                    if (Country != null)
                    hashCode = hashCode * 59 + Country.GetHashCode();
                    
                    hashCode = hashCode * 59 + Height.GetHashCode();
                    if (HometownInfo != null)
                    hashCode = hashCode * 59 + HometownInfo.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Position != null)
                    hashCode = hashCode * 59 + Position.GetHashCode();
                    
                    hashCode = hashCode * 59 + Ranking.GetHashCode();
                    
                    hashCode = hashCode * 59 + Rating.GetHashCode();
                    if (RecruitType != null)
                    hashCode = hashCode * 59 + RecruitType.GetHashCode();
                    if (School != null)
                    hashCode = hashCode * 59 + School.GetHashCode();
                    
                    hashCode = hashCode * 59 + Stars.GetHashCode();
                    if (StateProvince != null)
                    hashCode = hashCode * 59 + StateProvince.GetHashCode();
                    
                    hashCode = hashCode * 59 + Weight.GetHashCode();
                    
                    hashCode = hashCode * 59 + Year.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Recruit left, Recruit right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Recruit left, Recruit right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}