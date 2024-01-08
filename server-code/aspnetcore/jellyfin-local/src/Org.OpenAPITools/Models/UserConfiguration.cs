/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
    /// Class UserConfiguration.
    /// </summary>
    [DataContract]
    public partial class UserConfiguration : IEquatable<UserConfiguration>
    {
        /// <summary>
        /// Gets or sets the audio language preference.
        /// </summary>
        /// <value>Gets or sets the audio language preference.</value>
        [DataMember(Name="AudioLanguagePreference", EmitDefaultValue=true)]
        public string AudioLanguagePreference { get; set; }

        /// <summary>
        /// Gets or Sets DisplayCollectionsView
        /// </summary>
        [DataMember(Name="DisplayCollectionsView", EmitDefaultValue=true)]
        public bool DisplayCollectionsView { get; set; }

        /// <summary>
        /// Gets or Sets DisplayMissingEpisodes
        /// </summary>
        [DataMember(Name="DisplayMissingEpisodes", EmitDefaultValue=true)]
        public bool DisplayMissingEpisodes { get; set; }

        /// <summary>
        /// Gets or Sets EnableLocalPassword
        /// </summary>
        [DataMember(Name="EnableLocalPassword", EmitDefaultValue=true)]
        public bool EnableLocalPassword { get; set; }

        /// <summary>
        /// Gets or Sets EnableNextEpisodeAutoPlay
        /// </summary>
        [DataMember(Name="EnableNextEpisodeAutoPlay", EmitDefaultValue=true)]
        public bool EnableNextEpisodeAutoPlay { get; set; }

        /// <summary>
        /// Gets or Sets GroupedFolders
        /// </summary>
        [DataMember(Name="GroupedFolders", EmitDefaultValue=true)]
        public List<string> GroupedFolders { get; set; }

        /// <summary>
        /// Gets or Sets HidePlayedInLatest
        /// </summary>
        [DataMember(Name="HidePlayedInLatest", EmitDefaultValue=true)]
        public bool HidePlayedInLatest { get; set; }

        /// <summary>
        /// Gets or Sets LatestItemsExcludes
        /// </summary>
        [DataMember(Name="LatestItemsExcludes", EmitDefaultValue=true)]
        public List<string> LatestItemsExcludes { get; set; }

        /// <summary>
        /// Gets or Sets MyMediaExcludes
        /// </summary>
        [DataMember(Name="MyMediaExcludes", EmitDefaultValue=true)]
        public List<string> MyMediaExcludes { get; set; }

        /// <summary>
        /// Gets or Sets OrderedViews
        /// </summary>
        [DataMember(Name="OrderedViews", EmitDefaultValue=true)]
        public List<string> OrderedViews { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether [play default audio track].
        /// </summary>
        /// <value>Gets or sets a value indicating whether [play default audio track].</value>
        [DataMember(Name="PlayDefaultAudioTrack", EmitDefaultValue=true)]
        public bool PlayDefaultAudioTrack { get; set; }

        /// <summary>
        /// Gets or Sets RememberAudioSelections
        /// </summary>
        [DataMember(Name="RememberAudioSelections", EmitDefaultValue=true)]
        public bool RememberAudioSelections { get; set; }

        /// <summary>
        /// Gets or Sets RememberSubtitleSelections
        /// </summary>
        [DataMember(Name="RememberSubtitleSelections", EmitDefaultValue=true)]
        public bool RememberSubtitleSelections { get; set; }

        /// <summary>
        /// Gets or sets the subtitle language preference.
        /// </summary>
        /// <value>Gets or sets the subtitle language preference.</value>
        [DataMember(Name="SubtitleLanguagePreference", EmitDefaultValue=true)]
        public string SubtitleLanguagePreference { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleMode
        /// </summary>
        [DataMember(Name="SubtitleMode", EmitDefaultValue=true)]
        public SubtitlePlaybackMode SubtitleMode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserConfiguration {\n");
            sb.Append("  AudioLanguagePreference: ").Append(AudioLanguagePreference).Append("\n");
            sb.Append("  DisplayCollectionsView: ").Append(DisplayCollectionsView).Append("\n");
            sb.Append("  DisplayMissingEpisodes: ").Append(DisplayMissingEpisodes).Append("\n");
            sb.Append("  EnableLocalPassword: ").Append(EnableLocalPassword).Append("\n");
            sb.Append("  EnableNextEpisodeAutoPlay: ").Append(EnableNextEpisodeAutoPlay).Append("\n");
            sb.Append("  GroupedFolders: ").Append(GroupedFolders).Append("\n");
            sb.Append("  HidePlayedInLatest: ").Append(HidePlayedInLatest).Append("\n");
            sb.Append("  LatestItemsExcludes: ").Append(LatestItemsExcludes).Append("\n");
            sb.Append("  MyMediaExcludes: ").Append(MyMediaExcludes).Append("\n");
            sb.Append("  OrderedViews: ").Append(OrderedViews).Append("\n");
            sb.Append("  PlayDefaultAudioTrack: ").Append(PlayDefaultAudioTrack).Append("\n");
            sb.Append("  RememberAudioSelections: ").Append(RememberAudioSelections).Append("\n");
            sb.Append("  RememberSubtitleSelections: ").Append(RememberSubtitleSelections).Append("\n");
            sb.Append("  SubtitleLanguagePreference: ").Append(SubtitleLanguagePreference).Append("\n");
            sb.Append("  SubtitleMode: ").Append(SubtitleMode).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UserConfiguration)obj);
        }

        /// <summary>
        /// Returns true if UserConfiguration instances are equal
        /// </summary>
        /// <param name="other">Instance of UserConfiguration to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserConfiguration other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AudioLanguagePreference == other.AudioLanguagePreference ||
                    AudioLanguagePreference != null &&
                    AudioLanguagePreference.Equals(other.AudioLanguagePreference)
                ) && 
                (
                    DisplayCollectionsView == other.DisplayCollectionsView ||
                    
                    DisplayCollectionsView.Equals(other.DisplayCollectionsView)
                ) && 
                (
                    DisplayMissingEpisodes == other.DisplayMissingEpisodes ||
                    
                    DisplayMissingEpisodes.Equals(other.DisplayMissingEpisodes)
                ) && 
                (
                    EnableLocalPassword == other.EnableLocalPassword ||
                    
                    EnableLocalPassword.Equals(other.EnableLocalPassword)
                ) && 
                (
                    EnableNextEpisodeAutoPlay == other.EnableNextEpisodeAutoPlay ||
                    
                    EnableNextEpisodeAutoPlay.Equals(other.EnableNextEpisodeAutoPlay)
                ) && 
                (
                    GroupedFolders == other.GroupedFolders ||
                    GroupedFolders != null &&
                    other.GroupedFolders != null &&
                    GroupedFolders.SequenceEqual(other.GroupedFolders)
                ) && 
                (
                    HidePlayedInLatest == other.HidePlayedInLatest ||
                    
                    HidePlayedInLatest.Equals(other.HidePlayedInLatest)
                ) && 
                (
                    LatestItemsExcludes == other.LatestItemsExcludes ||
                    LatestItemsExcludes != null &&
                    other.LatestItemsExcludes != null &&
                    LatestItemsExcludes.SequenceEqual(other.LatestItemsExcludes)
                ) && 
                (
                    MyMediaExcludes == other.MyMediaExcludes ||
                    MyMediaExcludes != null &&
                    other.MyMediaExcludes != null &&
                    MyMediaExcludes.SequenceEqual(other.MyMediaExcludes)
                ) && 
                (
                    OrderedViews == other.OrderedViews ||
                    OrderedViews != null &&
                    other.OrderedViews != null &&
                    OrderedViews.SequenceEqual(other.OrderedViews)
                ) && 
                (
                    PlayDefaultAudioTrack == other.PlayDefaultAudioTrack ||
                    
                    PlayDefaultAudioTrack.Equals(other.PlayDefaultAudioTrack)
                ) && 
                (
                    RememberAudioSelections == other.RememberAudioSelections ||
                    
                    RememberAudioSelections.Equals(other.RememberAudioSelections)
                ) && 
                (
                    RememberSubtitleSelections == other.RememberSubtitleSelections ||
                    
                    RememberSubtitleSelections.Equals(other.RememberSubtitleSelections)
                ) && 
                (
                    SubtitleLanguagePreference == other.SubtitleLanguagePreference ||
                    SubtitleLanguagePreference != null &&
                    SubtitleLanguagePreference.Equals(other.SubtitleLanguagePreference)
                ) && 
                (
                    SubtitleMode == other.SubtitleMode ||
                    
                    SubtitleMode.Equals(other.SubtitleMode)
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
                    if (AudioLanguagePreference != null)
                    hashCode = hashCode * 59 + AudioLanguagePreference.GetHashCode();
                    
                    hashCode = hashCode * 59 + DisplayCollectionsView.GetHashCode();
                    
                    hashCode = hashCode * 59 + DisplayMissingEpisodes.GetHashCode();
                    
                    hashCode = hashCode * 59 + EnableLocalPassword.GetHashCode();
                    
                    hashCode = hashCode * 59 + EnableNextEpisodeAutoPlay.GetHashCode();
                    if (GroupedFolders != null)
                    hashCode = hashCode * 59 + GroupedFolders.GetHashCode();
                    
                    hashCode = hashCode * 59 + HidePlayedInLatest.GetHashCode();
                    if (LatestItemsExcludes != null)
                    hashCode = hashCode * 59 + LatestItemsExcludes.GetHashCode();
                    if (MyMediaExcludes != null)
                    hashCode = hashCode * 59 + MyMediaExcludes.GetHashCode();
                    if (OrderedViews != null)
                    hashCode = hashCode * 59 + OrderedViews.GetHashCode();
                    
                    hashCode = hashCode * 59 + PlayDefaultAudioTrack.GetHashCode();
                    
                    hashCode = hashCode * 59 + RememberAudioSelections.GetHashCode();
                    
                    hashCode = hashCode * 59 + RememberSubtitleSelections.GetHashCode();
                    if (SubtitleLanguagePreference != null)
                    hashCode = hashCode * 59 + SubtitleLanguagePreference.GetHashCode();
                    
                    hashCode = hashCode * 59 + SubtitleMode.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UserConfiguration left, UserConfiguration right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserConfiguration left, UserConfiguration right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
