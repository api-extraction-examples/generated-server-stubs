/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
    public partial class Podcast : IEquatable<Podcast>
    {
        /// <summary>
        /// Gets or Sets CategorySummaries
        /// </summary>
        [Required]
        [DataMember(Name="category_summaries", EmitDefaultValue=false)]
        public List<CategorySummary> CategorySummaries { get; set; }

        /// <summary>
        /// Gets or Sets DaysAvailable
        /// </summary>
        [Required]
        [DataMember(Name="days_available", EmitDefaultValue=true)]
        public int DaysAvailable { get; set; }

        /// <summary>
        /// Gets or Sets EntityType
        /// </summary>
        [Required]
        [DataMember(Name="entity_type", EmitDefaultValue=false)]
        public string EntityType { get; set; }

        /// <summary>
        /// Gets or Sets FirstPublishedDate
        /// </summary>
        [Required]
        [DataMember(Name="first_published_date", EmitDefaultValue=false)]
        public string FirstPublishedDate { get; set; }

        /// <summary>
        /// Gets or Sets Frequency
        /// </summary>
        [Required]
        [DataMember(Name="frequency", EmitDefaultValue=false)]
        public string Frequency { get; set; }

        /// <summary>
        /// Gets or Sets Images
        /// </summary>
        [Required]
        [DataMember(Name="images", EmitDefaultValue=false)]
        public List<Image> Images { get; set; }

        /// <summary>
        /// Gets or Sets LatestAvailableEpisodes
        /// </summary>
        [Required]
        [DataMember(Name="latest_available_episodes", EmitDefaultValue=false)]
        public List<PodcastEpisodeSummary> LatestAvailableEpisodes { get; set; }

        /// <summary>
        /// Gets or Sets NetworkSummary
        /// </summary>
        [Required]
        [DataMember(Name="network_summary", EmitDefaultValue=false)]
        public NetworkSummary NetworkSummary { get; set; }

        /// <summary>
        /// Gets or Sets Pid
        /// </summary>
        [Required]
        [DataMember(Name="pid", EmitDefaultValue=false)]
        public string Pid { get; set; }

        /// <summary>
        /// Gets or Sets RssUrl
        /// </summary>
        [Required]
        [DataMember(Name="rss_url", EmitDefaultValue=false)]
        public string RssUrl { get; set; }

        /// <summary>
        /// Gets or Sets Synopses
        /// </summary>
        [Required]
        [DataMember(Name="synopses", EmitDefaultValue=false)]
        public PodcastSynopses Synopses { get; set; }

        /// <summary>
        /// Gets or Sets Territory
        /// </summary>
        [Required]
        [DataMember(Name="territory", EmitDefaultValue=false)]
        public string Territory { get; set; }

        /// <summary>
        /// Gets or Sets Titles
        /// </summary>
        [Required]
        [DataMember(Name="titles", EmitDefaultValue=false)]
        public ProgrammeTitles Titles { get; set; }

        /// <summary>
        /// Gets or Sets TotalAvailableEpisodes
        /// </summary>
        [Required]
        [DataMember(Name="total_available_episodes", EmitDefaultValue=true)]
        public int TotalAvailableEpisodes { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAt
        /// </summary>
        [Required]
        [DataMember(Name="updated_at", EmitDefaultValue=false)]
        public string UpdatedAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Podcast {\n");
            sb.Append("  CategorySummaries: ").Append(CategorySummaries).Append("\n");
            sb.Append("  DaysAvailable: ").Append(DaysAvailable).Append("\n");
            sb.Append("  EntityType: ").Append(EntityType).Append("\n");
            sb.Append("  FirstPublishedDate: ").Append(FirstPublishedDate).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
            sb.Append("  Images: ").Append(Images).Append("\n");
            sb.Append("  LatestAvailableEpisodes: ").Append(LatestAvailableEpisodes).Append("\n");
            sb.Append("  NetworkSummary: ").Append(NetworkSummary).Append("\n");
            sb.Append("  Pid: ").Append(Pid).Append("\n");
            sb.Append("  RssUrl: ").Append(RssUrl).Append("\n");
            sb.Append("  Synopses: ").Append(Synopses).Append("\n");
            sb.Append("  Territory: ").Append(Territory).Append("\n");
            sb.Append("  Titles: ").Append(Titles).Append("\n");
            sb.Append("  TotalAvailableEpisodes: ").Append(TotalAvailableEpisodes).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Podcast)obj);
        }

        /// <summary>
        /// Returns true if Podcast instances are equal
        /// </summary>
        /// <param name="other">Instance of Podcast to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Podcast other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CategorySummaries == other.CategorySummaries ||
                    CategorySummaries != null &&
                    other.CategorySummaries != null &&
                    CategorySummaries.SequenceEqual(other.CategorySummaries)
                ) && 
                (
                    DaysAvailable == other.DaysAvailable ||
                    
                    DaysAvailable.Equals(other.DaysAvailable)
                ) && 
                (
                    EntityType == other.EntityType ||
                    EntityType != null &&
                    EntityType.Equals(other.EntityType)
                ) && 
                (
                    FirstPublishedDate == other.FirstPublishedDate ||
                    FirstPublishedDate != null &&
                    FirstPublishedDate.Equals(other.FirstPublishedDate)
                ) && 
                (
                    Frequency == other.Frequency ||
                    Frequency != null &&
                    Frequency.Equals(other.Frequency)
                ) && 
                (
                    Images == other.Images ||
                    Images != null &&
                    other.Images != null &&
                    Images.SequenceEqual(other.Images)
                ) && 
                (
                    LatestAvailableEpisodes == other.LatestAvailableEpisodes ||
                    LatestAvailableEpisodes != null &&
                    other.LatestAvailableEpisodes != null &&
                    LatestAvailableEpisodes.SequenceEqual(other.LatestAvailableEpisodes)
                ) && 
                (
                    NetworkSummary == other.NetworkSummary ||
                    NetworkSummary != null &&
                    NetworkSummary.Equals(other.NetworkSummary)
                ) && 
                (
                    Pid == other.Pid ||
                    Pid != null &&
                    Pid.Equals(other.Pid)
                ) && 
                (
                    RssUrl == other.RssUrl ||
                    RssUrl != null &&
                    RssUrl.Equals(other.RssUrl)
                ) && 
                (
                    Synopses == other.Synopses ||
                    Synopses != null &&
                    Synopses.Equals(other.Synopses)
                ) && 
                (
                    Territory == other.Territory ||
                    Territory != null &&
                    Territory.Equals(other.Territory)
                ) && 
                (
                    Titles == other.Titles ||
                    Titles != null &&
                    Titles.Equals(other.Titles)
                ) && 
                (
                    TotalAvailableEpisodes == other.TotalAvailableEpisodes ||
                    
                    TotalAvailableEpisodes.Equals(other.TotalAvailableEpisodes)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    UpdatedAt == other.UpdatedAt ||
                    UpdatedAt != null &&
                    UpdatedAt.Equals(other.UpdatedAt)
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
                    if (CategorySummaries != null)
                    hashCode = hashCode * 59 + CategorySummaries.GetHashCode();
                    
                    hashCode = hashCode * 59 + DaysAvailable.GetHashCode();
                    if (EntityType != null)
                    hashCode = hashCode * 59 + EntityType.GetHashCode();
                    if (FirstPublishedDate != null)
                    hashCode = hashCode * 59 + FirstPublishedDate.GetHashCode();
                    if (Frequency != null)
                    hashCode = hashCode * 59 + Frequency.GetHashCode();
                    if (Images != null)
                    hashCode = hashCode * 59 + Images.GetHashCode();
                    if (LatestAvailableEpisodes != null)
                    hashCode = hashCode * 59 + LatestAvailableEpisodes.GetHashCode();
                    if (NetworkSummary != null)
                    hashCode = hashCode * 59 + NetworkSummary.GetHashCode();
                    if (Pid != null)
                    hashCode = hashCode * 59 + Pid.GetHashCode();
                    if (RssUrl != null)
                    hashCode = hashCode * 59 + RssUrl.GetHashCode();
                    if (Synopses != null)
                    hashCode = hashCode * 59 + Synopses.GetHashCode();
                    if (Territory != null)
                    hashCode = hashCode * 59 + Territory.GetHashCode();
                    if (Titles != null)
                    hashCode = hashCode * 59 + Titles.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalAvailableEpisodes.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (UpdatedAt != null)
                    hashCode = hashCode * 59 + UpdatedAt.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Podcast left, Podcast right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Podcast left, Podcast right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
