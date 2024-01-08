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
    /// Class SessionInfo.
    /// </summary>
    [DataContract]
    public partial class SessionInfo : IEquatable<SessionInfo>
    {
        /// <summary>
        /// Gets or Sets AdditionalUsers
        /// </summary>
        [DataMember(Name="AdditionalUsers", EmitDefaultValue=true)]
        public List<SessionUserInfo> AdditionalUsers { get; set; }

        /// <summary>
        /// Gets or sets the application version.
        /// </summary>
        /// <value>Gets or sets the application version.</value>
        [DataMember(Name="ApplicationVersion", EmitDefaultValue=true)]
        public string ApplicationVersion { get; set; }

        /// <summary>
        /// Gets or Sets Capabilities
        /// </summary>
        [DataMember(Name="Capabilities", EmitDefaultValue=false)]
        public ClientCapabilities Capabilities { get; set; }

        /// <summary>
        /// Gets or sets the type of the client.
        /// </summary>
        /// <value>Gets or sets the type of the client.</value>
        [DataMember(Name="Client", EmitDefaultValue=true)]
        public string VarClient { get; set; }

        /// <summary>
        /// Gets or sets the device id.
        /// </summary>
        /// <value>Gets or sets the device id.</value>
        [DataMember(Name="DeviceId", EmitDefaultValue=true)]
        public string DeviceId { get; set; }

        /// <summary>
        /// Gets or sets the name of the device.
        /// </summary>
        /// <value>Gets or sets the name of the device.</value>
        [DataMember(Name="DeviceName", EmitDefaultValue=true)]
        public string DeviceName { get; set; }

        /// <summary>
        /// Gets or sets the type of the device.
        /// </summary>
        /// <value>Gets or sets the type of the device.</value>
        [DataMember(Name="DeviceType", EmitDefaultValue=true)]
        public string DeviceType { get; set; }

        /// <summary>
        /// Gets or Sets FullNowPlayingItem
        /// </summary>
        [DataMember(Name="FullNowPlayingItem", EmitDefaultValue=false)]
        public BaseItem FullNowPlayingItem { get; set; }

        /// <summary>
        /// Gets or Sets HasCustomDeviceName
        /// </summary>
        [DataMember(Name="HasCustomDeviceName", EmitDefaultValue=true)]
        public bool HasCustomDeviceName { get; set; }

        /// <summary>
        /// Gets or sets the id.
        /// </summary>
        /// <value>Gets or sets the id.</value>
        [DataMember(Name="Id", EmitDefaultValue=true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets a value indicating whether this instance is active.
        /// </summary>
        /// <value>Gets a value indicating whether this instance is active.</value>
        [DataMember(Name="IsActive", EmitDefaultValue=true)]
        public bool IsActive { get; set; }

        /// <summary>
        /// Gets or sets the last activity date.
        /// </summary>
        /// <value>Gets or sets the last activity date.</value>
        [DataMember(Name="LastActivityDate", EmitDefaultValue=false)]
        public DateTime LastActivityDate { get; set; }

        /// <summary>
        /// Gets or sets the last playback check in.
        /// </summary>
        /// <value>Gets or sets the last playback check in.</value>
        [DataMember(Name="LastPlaybackCheckIn", EmitDefaultValue=false)]
        public DateTime LastPlaybackCheckIn { get; set; }

        /// <summary>
        /// Gets or Sets NowPlayingItem
        /// </summary>
        [DataMember(Name="NowPlayingItem", EmitDefaultValue=false)]
        public BaseItemDto NowPlayingItem { get; set; }

        /// <summary>
        /// Gets or Sets NowPlayingQueue
        /// </summary>
        [DataMember(Name="NowPlayingQueue", EmitDefaultValue=true)]
        public List<QueueItem> NowPlayingQueue { get; set; }

        /// <summary>
        /// Gets or Sets NowViewingItem
        /// </summary>
        [DataMember(Name="NowViewingItem", EmitDefaultValue=false)]
        public BaseItemDto NowViewingItem { get; set; }

        /// <summary>
        /// Gets or Sets PlayState
        /// </summary>
        [DataMember(Name="PlayState", EmitDefaultValue=false)]
        public PlayerStateInfo PlayState { get; set; }

        /// <summary>
        /// Gets or sets the playable media types.
        /// </summary>
        /// <value>Gets or sets the playable media types.</value>
        [DataMember(Name="PlayableMediaTypes", EmitDefaultValue=true)]
        public List<string> PlayableMediaTypes { get; set; }

        /// <summary>
        /// Gets or Sets PlaylistItemId
        /// </summary>
        [DataMember(Name="PlaylistItemId", EmitDefaultValue=true)]
        public string PlaylistItemId { get; set; }

        /// <summary>
        /// Gets or sets the remote end point.
        /// </summary>
        /// <value>Gets or sets the remote end point.</value>
        [DataMember(Name="RemoteEndPoint", EmitDefaultValue=true)]
        public string RemoteEndPoint { get; set; }

        /// <summary>
        /// Gets or Sets ServerId
        /// </summary>
        [DataMember(Name="ServerId", EmitDefaultValue=true)]
        public string ServerId { get; set; }

        /// <summary>
        /// Gets or sets the supported commands.
        /// </summary>
        /// <value>Gets or sets the supported commands.</value>
        [DataMember(Name="SupportedCommands", EmitDefaultValue=true)]
        public List<GeneralCommandType> SupportedCommands { get; set; }

        /// <summary>
        /// Gets or Sets SupportsMediaControl
        /// </summary>
        [DataMember(Name="SupportsMediaControl", EmitDefaultValue=true)]
        public bool SupportsMediaControl { get; set; }

        /// <summary>
        /// Gets or Sets SupportsRemoteControl
        /// </summary>
        [DataMember(Name="SupportsRemoteControl", EmitDefaultValue=true)]
        public bool SupportsRemoteControl { get; set; }

        /// <summary>
        /// Gets or Sets TranscodingInfo
        /// </summary>
        [DataMember(Name="TranscodingInfo", EmitDefaultValue=false)]
        public TranscodingInfo TranscodingInfo { get; set; }

        /// <summary>
        /// Gets or sets the user id.
        /// </summary>
        /// <value>Gets or sets the user id.</value>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public Guid UserId { get; set; }

        /// <summary>
        /// Gets or sets the username.
        /// </summary>
        /// <value>Gets or sets the username.</value>
        [DataMember(Name="UserName", EmitDefaultValue=true)]
        public string UserName { get; set; }

        /// <summary>
        /// Gets or Sets UserPrimaryImageTag
        /// </summary>
        [DataMember(Name="UserPrimaryImageTag", EmitDefaultValue=true)]
        public string UserPrimaryImageTag { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SessionInfo {\n");
            sb.Append("  AdditionalUsers: ").Append(AdditionalUsers).Append("\n");
            sb.Append("  ApplicationVersion: ").Append(ApplicationVersion).Append("\n");
            sb.Append("  Capabilities: ").Append(Capabilities).Append("\n");
            sb.Append("  VarClient: ").Append(VarClient).Append("\n");
            sb.Append("  DeviceId: ").Append(DeviceId).Append("\n");
            sb.Append("  DeviceName: ").Append(DeviceName).Append("\n");
            sb.Append("  DeviceType: ").Append(DeviceType).Append("\n");
            sb.Append("  FullNowPlayingItem: ").Append(FullNowPlayingItem).Append("\n");
            sb.Append("  HasCustomDeviceName: ").Append(HasCustomDeviceName).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  LastActivityDate: ").Append(LastActivityDate).Append("\n");
            sb.Append("  LastPlaybackCheckIn: ").Append(LastPlaybackCheckIn).Append("\n");
            sb.Append("  NowPlayingItem: ").Append(NowPlayingItem).Append("\n");
            sb.Append("  NowPlayingQueue: ").Append(NowPlayingQueue).Append("\n");
            sb.Append("  NowViewingItem: ").Append(NowViewingItem).Append("\n");
            sb.Append("  PlayState: ").Append(PlayState).Append("\n");
            sb.Append("  PlayableMediaTypes: ").Append(PlayableMediaTypes).Append("\n");
            sb.Append("  PlaylistItemId: ").Append(PlaylistItemId).Append("\n");
            sb.Append("  RemoteEndPoint: ").Append(RemoteEndPoint).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
            sb.Append("  SupportedCommands: ").Append(SupportedCommands).Append("\n");
            sb.Append("  SupportsMediaControl: ").Append(SupportsMediaControl).Append("\n");
            sb.Append("  SupportsRemoteControl: ").Append(SupportsRemoteControl).Append("\n");
            sb.Append("  TranscodingInfo: ").Append(TranscodingInfo).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  UserName: ").Append(UserName).Append("\n");
            sb.Append("  UserPrimaryImageTag: ").Append(UserPrimaryImageTag).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SessionInfo)obj);
        }

        /// <summary>
        /// Returns true if SessionInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of SessionInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SessionInfo other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AdditionalUsers == other.AdditionalUsers ||
                    AdditionalUsers != null &&
                    other.AdditionalUsers != null &&
                    AdditionalUsers.SequenceEqual(other.AdditionalUsers)
                ) && 
                (
                    ApplicationVersion == other.ApplicationVersion ||
                    ApplicationVersion != null &&
                    ApplicationVersion.Equals(other.ApplicationVersion)
                ) && 
                (
                    Capabilities == other.Capabilities ||
                    Capabilities != null &&
                    Capabilities.Equals(other.Capabilities)
                ) && 
                (
                    VarClient == other.VarClient ||
                    VarClient != null &&
                    VarClient.Equals(other.VarClient)
                ) && 
                (
                    DeviceId == other.DeviceId ||
                    DeviceId != null &&
                    DeviceId.Equals(other.DeviceId)
                ) && 
                (
                    DeviceName == other.DeviceName ||
                    DeviceName != null &&
                    DeviceName.Equals(other.DeviceName)
                ) && 
                (
                    DeviceType == other.DeviceType ||
                    DeviceType != null &&
                    DeviceType.Equals(other.DeviceType)
                ) && 
                (
                    FullNowPlayingItem == other.FullNowPlayingItem ||
                    FullNowPlayingItem != null &&
                    FullNowPlayingItem.Equals(other.FullNowPlayingItem)
                ) && 
                (
                    HasCustomDeviceName == other.HasCustomDeviceName ||
                    
                    HasCustomDeviceName.Equals(other.HasCustomDeviceName)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    IsActive == other.IsActive ||
                    
                    IsActive.Equals(other.IsActive)
                ) && 
                (
                    LastActivityDate == other.LastActivityDate ||
                    LastActivityDate != null &&
                    LastActivityDate.Equals(other.LastActivityDate)
                ) && 
                (
                    LastPlaybackCheckIn == other.LastPlaybackCheckIn ||
                    LastPlaybackCheckIn != null &&
                    LastPlaybackCheckIn.Equals(other.LastPlaybackCheckIn)
                ) && 
                (
                    NowPlayingItem == other.NowPlayingItem ||
                    NowPlayingItem != null &&
                    NowPlayingItem.Equals(other.NowPlayingItem)
                ) && 
                (
                    NowPlayingQueue == other.NowPlayingQueue ||
                    NowPlayingQueue != null &&
                    other.NowPlayingQueue != null &&
                    NowPlayingQueue.SequenceEqual(other.NowPlayingQueue)
                ) && 
                (
                    NowViewingItem == other.NowViewingItem ||
                    NowViewingItem != null &&
                    NowViewingItem.Equals(other.NowViewingItem)
                ) && 
                (
                    PlayState == other.PlayState ||
                    PlayState != null &&
                    PlayState.Equals(other.PlayState)
                ) && 
                (
                    PlayableMediaTypes == other.PlayableMediaTypes ||
                    PlayableMediaTypes != null &&
                    other.PlayableMediaTypes != null &&
                    PlayableMediaTypes.SequenceEqual(other.PlayableMediaTypes)
                ) && 
                (
                    PlaylistItemId == other.PlaylistItemId ||
                    PlaylistItemId != null &&
                    PlaylistItemId.Equals(other.PlaylistItemId)
                ) && 
                (
                    RemoteEndPoint == other.RemoteEndPoint ||
                    RemoteEndPoint != null &&
                    RemoteEndPoint.Equals(other.RemoteEndPoint)
                ) && 
                (
                    ServerId == other.ServerId ||
                    ServerId != null &&
                    ServerId.Equals(other.ServerId)
                ) && 
                (
                    SupportedCommands == other.SupportedCommands ||
                    SupportedCommands != null &&
                    other.SupportedCommands != null &&
                    SupportedCommands.SequenceEqual(other.SupportedCommands)
                ) && 
                (
                    SupportsMediaControl == other.SupportsMediaControl ||
                    
                    SupportsMediaControl.Equals(other.SupportsMediaControl)
                ) && 
                (
                    SupportsRemoteControl == other.SupportsRemoteControl ||
                    
                    SupportsRemoteControl.Equals(other.SupportsRemoteControl)
                ) && 
                (
                    TranscodingInfo == other.TranscodingInfo ||
                    TranscodingInfo != null &&
                    TranscodingInfo.Equals(other.TranscodingInfo)
                ) && 
                (
                    UserId == other.UserId ||
                    UserId != null &&
                    UserId.Equals(other.UserId)
                ) && 
                (
                    UserName == other.UserName ||
                    UserName != null &&
                    UserName.Equals(other.UserName)
                ) && 
                (
                    UserPrimaryImageTag == other.UserPrimaryImageTag ||
                    UserPrimaryImageTag != null &&
                    UserPrimaryImageTag.Equals(other.UserPrimaryImageTag)
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
                    if (AdditionalUsers != null)
                    hashCode = hashCode * 59 + AdditionalUsers.GetHashCode();
                    if (ApplicationVersion != null)
                    hashCode = hashCode * 59 + ApplicationVersion.GetHashCode();
                    if (Capabilities != null)
                    hashCode = hashCode * 59 + Capabilities.GetHashCode();
                    if (VarClient != null)
                    hashCode = hashCode * 59 + VarClient.GetHashCode();
                    if (DeviceId != null)
                    hashCode = hashCode * 59 + DeviceId.GetHashCode();
                    if (DeviceName != null)
                    hashCode = hashCode * 59 + DeviceName.GetHashCode();
                    if (DeviceType != null)
                    hashCode = hashCode * 59 + DeviceType.GetHashCode();
                    if (FullNowPlayingItem != null)
                    hashCode = hashCode * 59 + FullNowPlayingItem.GetHashCode();
                    
                    hashCode = hashCode * 59 + HasCustomDeviceName.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsActive.GetHashCode();
                    if (LastActivityDate != null)
                    hashCode = hashCode * 59 + LastActivityDate.GetHashCode();
                    if (LastPlaybackCheckIn != null)
                    hashCode = hashCode * 59 + LastPlaybackCheckIn.GetHashCode();
                    if (NowPlayingItem != null)
                    hashCode = hashCode * 59 + NowPlayingItem.GetHashCode();
                    if (NowPlayingQueue != null)
                    hashCode = hashCode * 59 + NowPlayingQueue.GetHashCode();
                    if (NowViewingItem != null)
                    hashCode = hashCode * 59 + NowViewingItem.GetHashCode();
                    if (PlayState != null)
                    hashCode = hashCode * 59 + PlayState.GetHashCode();
                    if (PlayableMediaTypes != null)
                    hashCode = hashCode * 59 + PlayableMediaTypes.GetHashCode();
                    if (PlaylistItemId != null)
                    hashCode = hashCode * 59 + PlaylistItemId.GetHashCode();
                    if (RemoteEndPoint != null)
                    hashCode = hashCode * 59 + RemoteEndPoint.GetHashCode();
                    if (ServerId != null)
                    hashCode = hashCode * 59 + ServerId.GetHashCode();
                    if (SupportedCommands != null)
                    hashCode = hashCode * 59 + SupportedCommands.GetHashCode();
                    
                    hashCode = hashCode * 59 + SupportsMediaControl.GetHashCode();
                    
                    hashCode = hashCode * 59 + SupportsRemoteControl.GetHashCode();
                    if (TranscodingInfo != null)
                    hashCode = hashCode * 59 + TranscodingInfo.GetHashCode();
                    if (UserId != null)
                    hashCode = hashCode * 59 + UserId.GetHashCode();
                    if (UserName != null)
                    hashCode = hashCode * 59 + UserName.GetHashCode();
                    if (UserPrimaryImageTag != null)
                    hashCode = hashCode * 59 + UserPrimaryImageTag.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SessionInfo left, SessionInfo right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SessionInfo left, SessionInfo right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}