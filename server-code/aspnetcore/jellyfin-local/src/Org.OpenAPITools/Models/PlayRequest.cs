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
    /// Class PlayRequest.
    /// </summary>
    [DataContract]
    public partial class PlayRequest : IEquatable<PlayRequest>
    {
        /// <summary>
        /// Gets or Sets AudioStreamIndex
        /// </summary>
        [DataMember(Name="AudioStreamIndex", EmitDefaultValue=true)]
        public int? AudioStreamIndex { get; set; }

        /// <summary>
        /// Gets or sets the controlling user identifier.
        /// </summary>
        /// <value>Gets or sets the controlling user identifier.</value>
        [DataMember(Name="ControllingUserId", EmitDefaultValue=false)]
        public Guid ControllingUserId { get; set; }

        /// <summary>
        /// Gets or sets the item ids.
        /// </summary>
        /// <value>Gets or sets the item ids.</value>
        [DataMember(Name="ItemIds", EmitDefaultValue=true)]
        public List<Guid> ItemIds { get; set; }

        /// <summary>
        /// Gets or Sets MediaSourceId
        /// </summary>
        [DataMember(Name="MediaSourceId", EmitDefaultValue=true)]
        public string MediaSourceId { get; set; }

        /// <summary>
        /// Gets or Sets PlayCommand
        /// </summary>
        [DataMember(Name="PlayCommand", EmitDefaultValue=true)]
        public PlayCommand PlayCommand { get; set; }

        /// <summary>
        /// Gets or Sets StartIndex
        /// </summary>
        [DataMember(Name="StartIndex", EmitDefaultValue=true)]
        public int? StartIndex { get; set; }

        /// <summary>
        /// Gets or sets the start position ticks that the first item should be played at.
        /// </summary>
        /// <value>Gets or sets the start position ticks that the first item should be played at.</value>
        [DataMember(Name="StartPositionTicks", EmitDefaultValue=true)]
        public long? StartPositionTicks { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleStreamIndex
        /// </summary>
        [DataMember(Name="SubtitleStreamIndex", EmitDefaultValue=true)]
        public int? SubtitleStreamIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PlayRequest {\n");
            sb.Append("  AudioStreamIndex: ").Append(AudioStreamIndex).Append("\n");
            sb.Append("  ControllingUserId: ").Append(ControllingUserId).Append("\n");
            sb.Append("  ItemIds: ").Append(ItemIds).Append("\n");
            sb.Append("  MediaSourceId: ").Append(MediaSourceId).Append("\n");
            sb.Append("  PlayCommand: ").Append(PlayCommand).Append("\n");
            sb.Append("  StartIndex: ").Append(StartIndex).Append("\n");
            sb.Append("  StartPositionTicks: ").Append(StartPositionTicks).Append("\n");
            sb.Append("  SubtitleStreamIndex: ").Append(SubtitleStreamIndex).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PlayRequest)obj);
        }

        /// <summary>
        /// Returns true if PlayRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of PlayRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlayRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AudioStreamIndex == other.AudioStreamIndex ||
                    AudioStreamIndex != null &&
                    AudioStreamIndex.Equals(other.AudioStreamIndex)
                ) && 
                (
                    ControllingUserId == other.ControllingUserId ||
                    ControllingUserId != null &&
                    ControllingUserId.Equals(other.ControllingUserId)
                ) && 
                (
                    ItemIds == other.ItemIds ||
                    ItemIds != null &&
                    other.ItemIds != null &&
                    ItemIds.SequenceEqual(other.ItemIds)
                ) && 
                (
                    MediaSourceId == other.MediaSourceId ||
                    MediaSourceId != null &&
                    MediaSourceId.Equals(other.MediaSourceId)
                ) && 
                (
                    PlayCommand == other.PlayCommand ||
                    
                    PlayCommand.Equals(other.PlayCommand)
                ) && 
                (
                    StartIndex == other.StartIndex ||
                    StartIndex != null &&
                    StartIndex.Equals(other.StartIndex)
                ) && 
                (
                    StartPositionTicks == other.StartPositionTicks ||
                    StartPositionTicks != null &&
                    StartPositionTicks.Equals(other.StartPositionTicks)
                ) && 
                (
                    SubtitleStreamIndex == other.SubtitleStreamIndex ||
                    SubtitleStreamIndex != null &&
                    SubtitleStreamIndex.Equals(other.SubtitleStreamIndex)
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
                    if (AudioStreamIndex != null)
                    hashCode = hashCode * 59 + AudioStreamIndex.GetHashCode();
                    if (ControllingUserId != null)
                    hashCode = hashCode * 59 + ControllingUserId.GetHashCode();
                    if (ItemIds != null)
                    hashCode = hashCode * 59 + ItemIds.GetHashCode();
                    if (MediaSourceId != null)
                    hashCode = hashCode * 59 + MediaSourceId.GetHashCode();
                    
                    hashCode = hashCode * 59 + PlayCommand.GetHashCode();
                    if (StartIndex != null)
                    hashCode = hashCode * 59 + StartIndex.GetHashCode();
                    if (StartPositionTicks != null)
                    hashCode = hashCode * 59 + StartPositionTicks.GetHashCode();
                    if (SubtitleStreamIndex != null)
                    hashCode = hashCode * 59 + SubtitleStreamIndex.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PlayRequest left, PlayRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PlayRequest left, PlayRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}