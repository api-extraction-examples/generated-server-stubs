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
    /// 
    /// </summary>
    [DataContract]
    public partial class PlayerStateInfo : IEquatable<PlayerStateInfo>
    {
        /// <summary>
        /// Gets or sets the index of the now playing audio stream.
        /// </summary>
        /// <value>Gets or sets the index of the now playing audio stream.</value>
        [DataMember(Name="AudioStreamIndex", EmitDefaultValue=true)]
        public int? AudioStreamIndex { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether this instance can seek.
        /// </summary>
        /// <value>Gets or sets a value indicating whether this instance can seek.</value>
        [DataMember(Name="CanSeek", EmitDefaultValue=true)]
        public bool CanSeek { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether this instance is muted.
        /// </summary>
        /// <value>Gets or sets a value indicating whether this instance is muted.</value>
        [DataMember(Name="IsMuted", EmitDefaultValue=true)]
        public bool IsMuted { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether this instance is paused.
        /// </summary>
        /// <value>Gets or sets a value indicating whether this instance is paused.</value>
        [DataMember(Name="IsPaused", EmitDefaultValue=true)]
        public bool IsPaused { get; set; }

        /// <summary>
        /// Gets or sets the now playing media version identifier.
        /// </summary>
        /// <value>Gets or sets the now playing media version identifier.</value>
        [DataMember(Name="MediaSourceId", EmitDefaultValue=true)]
        public string MediaSourceId { get; set; }

        /// <summary>
        /// Gets or Sets PlayMethod
        /// </summary>
        [DataMember(Name="PlayMethod", EmitDefaultValue=true)]
        public PlayMethod PlayMethod { get; set; }

        /// <summary>
        /// Gets or sets the now playing position ticks.
        /// </summary>
        /// <value>Gets or sets the now playing position ticks.</value>
        [DataMember(Name="PositionTicks", EmitDefaultValue=true)]
        public long? PositionTicks { get; set; }

        /// <summary>
        /// Gets or Sets RepeatMode
        /// </summary>
        [DataMember(Name="RepeatMode", EmitDefaultValue=true)]
        public RepeatMode RepeatMode { get; set; }

        /// <summary>
        /// Gets or sets the index of the now playing subtitle stream.
        /// </summary>
        /// <value>Gets or sets the index of the now playing subtitle stream.</value>
        [DataMember(Name="SubtitleStreamIndex", EmitDefaultValue=true)]
        public int? SubtitleStreamIndex { get; set; }

        /// <summary>
        /// Gets or sets the volume level.
        /// </summary>
        /// <value>Gets or sets the volume level.</value>
        [DataMember(Name="VolumeLevel", EmitDefaultValue=true)]
        public int? VolumeLevel { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PlayerStateInfo {\n");
            sb.Append("  AudioStreamIndex: ").Append(AudioStreamIndex).Append("\n");
            sb.Append("  CanSeek: ").Append(CanSeek).Append("\n");
            sb.Append("  IsMuted: ").Append(IsMuted).Append("\n");
            sb.Append("  IsPaused: ").Append(IsPaused).Append("\n");
            sb.Append("  MediaSourceId: ").Append(MediaSourceId).Append("\n");
            sb.Append("  PlayMethod: ").Append(PlayMethod).Append("\n");
            sb.Append("  PositionTicks: ").Append(PositionTicks).Append("\n");
            sb.Append("  RepeatMode: ").Append(RepeatMode).Append("\n");
            sb.Append("  SubtitleStreamIndex: ").Append(SubtitleStreamIndex).Append("\n");
            sb.Append("  VolumeLevel: ").Append(VolumeLevel).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PlayerStateInfo)obj);
        }

        /// <summary>
        /// Returns true if PlayerStateInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of PlayerStateInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlayerStateInfo other)
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
                    CanSeek == other.CanSeek ||
                    
                    CanSeek.Equals(other.CanSeek)
                ) && 
                (
                    IsMuted == other.IsMuted ||
                    
                    IsMuted.Equals(other.IsMuted)
                ) && 
                (
                    IsPaused == other.IsPaused ||
                    
                    IsPaused.Equals(other.IsPaused)
                ) && 
                (
                    MediaSourceId == other.MediaSourceId ||
                    MediaSourceId != null &&
                    MediaSourceId.Equals(other.MediaSourceId)
                ) && 
                (
                    PlayMethod == other.PlayMethod ||
                    
                    PlayMethod.Equals(other.PlayMethod)
                ) && 
                (
                    PositionTicks == other.PositionTicks ||
                    PositionTicks != null &&
                    PositionTicks.Equals(other.PositionTicks)
                ) && 
                (
                    RepeatMode == other.RepeatMode ||
                    
                    RepeatMode.Equals(other.RepeatMode)
                ) && 
                (
                    SubtitleStreamIndex == other.SubtitleStreamIndex ||
                    SubtitleStreamIndex != null &&
                    SubtitleStreamIndex.Equals(other.SubtitleStreamIndex)
                ) && 
                (
                    VolumeLevel == other.VolumeLevel ||
                    VolumeLevel != null &&
                    VolumeLevel.Equals(other.VolumeLevel)
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
                    
                    hashCode = hashCode * 59 + CanSeek.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsMuted.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsPaused.GetHashCode();
                    if (MediaSourceId != null)
                    hashCode = hashCode * 59 + MediaSourceId.GetHashCode();
                    
                    hashCode = hashCode * 59 + PlayMethod.GetHashCode();
                    if (PositionTicks != null)
                    hashCode = hashCode * 59 + PositionTicks.GetHashCode();
                    
                    hashCode = hashCode * 59 + RepeatMode.GetHashCode();
                    if (SubtitleStreamIndex != null)
                    hashCode = hashCode * 59 + SubtitleStreamIndex.GetHashCode();
                    if (VolumeLevel != null)
                    hashCode = hashCode * 59 + VolumeLevel.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PlayerStateInfo left, PlayerStateInfo right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PlayerStateInfo left, PlayerStateInfo right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}