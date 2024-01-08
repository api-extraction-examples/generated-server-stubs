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
    /// Open live stream dto.
    /// </summary>
    [DataContract]
    public partial class OpenLiveStreamDto : IEquatable<OpenLiveStreamDto>
    {
        /// <summary>
        /// Gets or sets the audio stream index.
        /// </summary>
        /// <value>Gets or sets the audio stream index.</value>
        [DataMember(Name="AudioStreamIndex", EmitDefaultValue=true)]
        public int? AudioStreamIndex { get; set; }

        /// <summary>
        /// Gets or Sets DeviceProfile
        /// </summary>
        [DataMember(Name="DeviceProfile", EmitDefaultValue=false)]
        public DeviceProfile DeviceProfile { get; set; }

        /// <summary>
        /// Gets or sets the device play protocols.
        /// </summary>
        /// <value>Gets or sets the device play protocols.</value>
        [DataMember(Name="DirectPlayProtocols", EmitDefaultValue=true)]
        public List<MediaProtocol> DirectPlayProtocols { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether to enable direct play.
        /// </summary>
        /// <value>Gets or sets a value indicating whether to enable direct play.</value>
        [DataMember(Name="EnableDirectPlay", EmitDefaultValue=true)]
        public bool? EnableDirectPlay { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether to enale direct stream.
        /// </summary>
        /// <value>Gets or sets a value indicating whether to enale direct stream.</value>
        [DataMember(Name="EnableDirectStream", EmitDefaultValue=true)]
        public bool? EnableDirectStream { get; set; }

        /// <summary>
        /// Gets or sets the item id.
        /// </summary>
        /// <value>Gets or sets the item id.</value>
        [DataMember(Name="ItemId", EmitDefaultValue=true)]
        public Guid? ItemId { get; set; }

        /// <summary>
        /// Gets or sets the max audio channels.
        /// </summary>
        /// <value>Gets or sets the max audio channels.</value>
        [DataMember(Name="MaxAudioChannels", EmitDefaultValue=true)]
        public int? MaxAudioChannels { get; set; }

        /// <summary>
        /// Gets or sets the max streaming bitrate.
        /// </summary>
        /// <value>Gets or sets the max streaming bitrate.</value>
        [DataMember(Name="MaxStreamingBitrate", EmitDefaultValue=true)]
        public int? MaxStreamingBitrate { get; set; }

        /// <summary>
        /// Gets or sets the open token.
        /// </summary>
        /// <value>Gets or sets the open token.</value>
        [DataMember(Name="OpenToken", EmitDefaultValue=true)]
        public string OpenToken { get; set; }

        /// <summary>
        /// Gets or sets the play session id.
        /// </summary>
        /// <value>Gets or sets the play session id.</value>
        [DataMember(Name="PlaySessionId", EmitDefaultValue=true)]
        public string PlaySessionId { get; set; }

        /// <summary>
        /// Gets or sets the start time in ticks.
        /// </summary>
        /// <value>Gets or sets the start time in ticks.</value>
        [DataMember(Name="StartTimeTicks", EmitDefaultValue=true)]
        public long? StartTimeTicks { get; set; }

        /// <summary>
        /// Gets or sets the subtitle stream index.
        /// </summary>
        /// <value>Gets or sets the subtitle stream index.</value>
        [DataMember(Name="SubtitleStreamIndex", EmitDefaultValue=true)]
        public int? SubtitleStreamIndex { get; set; }

        /// <summary>
        /// Gets or sets the user id.
        /// </summary>
        /// <value>Gets or sets the user id.</value>
        [DataMember(Name="UserId", EmitDefaultValue=true)]
        public Guid? UserId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OpenLiveStreamDto {\n");
            sb.Append("  AudioStreamIndex: ").Append(AudioStreamIndex).Append("\n");
            sb.Append("  DeviceProfile: ").Append(DeviceProfile).Append("\n");
            sb.Append("  DirectPlayProtocols: ").Append(DirectPlayProtocols).Append("\n");
            sb.Append("  EnableDirectPlay: ").Append(EnableDirectPlay).Append("\n");
            sb.Append("  EnableDirectStream: ").Append(EnableDirectStream).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  MaxAudioChannels: ").Append(MaxAudioChannels).Append("\n");
            sb.Append("  MaxStreamingBitrate: ").Append(MaxStreamingBitrate).Append("\n");
            sb.Append("  OpenToken: ").Append(OpenToken).Append("\n");
            sb.Append("  PlaySessionId: ").Append(PlaySessionId).Append("\n");
            sb.Append("  StartTimeTicks: ").Append(StartTimeTicks).Append("\n");
            sb.Append("  SubtitleStreamIndex: ").Append(SubtitleStreamIndex).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((OpenLiveStreamDto)obj);
        }

        /// <summary>
        /// Returns true if OpenLiveStreamDto instances are equal
        /// </summary>
        /// <param name="other">Instance of OpenLiveStreamDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenLiveStreamDto other)
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
                    DeviceProfile == other.DeviceProfile ||
                    DeviceProfile != null &&
                    DeviceProfile.Equals(other.DeviceProfile)
                ) && 
                (
                    DirectPlayProtocols == other.DirectPlayProtocols ||
                    DirectPlayProtocols != null &&
                    other.DirectPlayProtocols != null &&
                    DirectPlayProtocols.SequenceEqual(other.DirectPlayProtocols)
                ) && 
                (
                    EnableDirectPlay == other.EnableDirectPlay ||
                    EnableDirectPlay != null &&
                    EnableDirectPlay.Equals(other.EnableDirectPlay)
                ) && 
                (
                    EnableDirectStream == other.EnableDirectStream ||
                    EnableDirectStream != null &&
                    EnableDirectStream.Equals(other.EnableDirectStream)
                ) && 
                (
                    ItemId == other.ItemId ||
                    ItemId != null &&
                    ItemId.Equals(other.ItemId)
                ) && 
                (
                    MaxAudioChannels == other.MaxAudioChannels ||
                    MaxAudioChannels != null &&
                    MaxAudioChannels.Equals(other.MaxAudioChannels)
                ) && 
                (
                    MaxStreamingBitrate == other.MaxStreamingBitrate ||
                    MaxStreamingBitrate != null &&
                    MaxStreamingBitrate.Equals(other.MaxStreamingBitrate)
                ) && 
                (
                    OpenToken == other.OpenToken ||
                    OpenToken != null &&
                    OpenToken.Equals(other.OpenToken)
                ) && 
                (
                    PlaySessionId == other.PlaySessionId ||
                    PlaySessionId != null &&
                    PlaySessionId.Equals(other.PlaySessionId)
                ) && 
                (
                    StartTimeTicks == other.StartTimeTicks ||
                    StartTimeTicks != null &&
                    StartTimeTicks.Equals(other.StartTimeTicks)
                ) && 
                (
                    SubtitleStreamIndex == other.SubtitleStreamIndex ||
                    SubtitleStreamIndex != null &&
                    SubtitleStreamIndex.Equals(other.SubtitleStreamIndex)
                ) && 
                (
                    UserId == other.UserId ||
                    UserId != null &&
                    UserId.Equals(other.UserId)
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
                    if (DeviceProfile != null)
                    hashCode = hashCode * 59 + DeviceProfile.GetHashCode();
                    if (DirectPlayProtocols != null)
                    hashCode = hashCode * 59 + DirectPlayProtocols.GetHashCode();
                    if (EnableDirectPlay != null)
                    hashCode = hashCode * 59 + EnableDirectPlay.GetHashCode();
                    if (EnableDirectStream != null)
                    hashCode = hashCode * 59 + EnableDirectStream.GetHashCode();
                    if (ItemId != null)
                    hashCode = hashCode * 59 + ItemId.GetHashCode();
                    if (MaxAudioChannels != null)
                    hashCode = hashCode * 59 + MaxAudioChannels.GetHashCode();
                    if (MaxStreamingBitrate != null)
                    hashCode = hashCode * 59 + MaxStreamingBitrate.GetHashCode();
                    if (OpenToken != null)
                    hashCode = hashCode * 59 + OpenToken.GetHashCode();
                    if (PlaySessionId != null)
                    hashCode = hashCode * 59 + PlaySessionId.GetHashCode();
                    if (StartTimeTicks != null)
                    hashCode = hashCode * 59 + StartTimeTicks.GetHashCode();
                    if (SubtitleStreamIndex != null)
                    hashCode = hashCode * 59 + SubtitleStreamIndex.GetHashCode();
                    if (UserId != null)
                    hashCode = hashCode * 59 + UserId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OpenLiveStreamDto left, OpenLiveStreamDto right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OpenLiveStreamDto left, OpenLiveStreamDto right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}