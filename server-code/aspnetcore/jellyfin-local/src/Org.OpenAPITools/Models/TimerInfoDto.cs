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
    public partial class TimerInfoDto : IEquatable<TimerInfoDto>
    {
        /// <summary>
        /// ChannelId of the recording.
        /// </summary>
        /// <value>ChannelId of the recording.</value>
        [DataMember(Name="ChannelId", EmitDefaultValue=false)]
        public Guid ChannelId { get; set; }

        /// <summary>
        /// ChannelName of the recording.
        /// </summary>
        /// <value>ChannelName of the recording.</value>
        [DataMember(Name="ChannelName", EmitDefaultValue=true)]
        public string ChannelName { get; set; }

        /// <summary>
        /// Gets or Sets ChannelPrimaryImageTag
        /// </summary>
        [DataMember(Name="ChannelPrimaryImageTag", EmitDefaultValue=true)]
        public string ChannelPrimaryImageTag { get; set; }

        /// <summary>
        /// The end date of the recording, in UTC.
        /// </summary>
        /// <value>The end date of the recording, in UTC.</value>
        [DataMember(Name="EndDate", EmitDefaultValue=false)]
        public DateTime EndDate { get; set; }

        /// <summary>
        /// Gets or sets the external channel identifier.
        /// </summary>
        /// <value>Gets or sets the external channel identifier.</value>
        [DataMember(Name="ExternalChannelId", EmitDefaultValue=true)]
        public string ExternalChannelId { get; set; }

        /// <summary>
        /// Gets or sets the external identifier.
        /// </summary>
        /// <value>Gets or sets the external identifier.</value>
        [DataMember(Name="ExternalId", EmitDefaultValue=true)]
        public string ExternalId { get; set; }

        /// <summary>
        /// Gets or sets the external program identifier.
        /// </summary>
        /// <value>Gets or sets the external program identifier.</value>
        [DataMember(Name="ExternalProgramId", EmitDefaultValue=true)]
        public string ExternalProgramId { get; set; }

        /// <summary>
        /// Gets or sets the external series timer identifier.
        /// </summary>
        /// <value>Gets or sets the external series timer identifier.</value>
        [DataMember(Name="ExternalSeriesTimerId", EmitDefaultValue=true)]
        public string ExternalSeriesTimerId { get; set; }

        /// <summary>
        /// Id of the recording.
        /// </summary>
        /// <value>Id of the recording.</value>
        [DataMember(Name="Id", EmitDefaultValue=true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether this instance is post padding required.
        /// </summary>
        /// <value>Gets or sets a value indicating whether this instance is post padding required.</value>
        [DataMember(Name="IsPostPaddingRequired", EmitDefaultValue=true)]
        public bool IsPostPaddingRequired { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether this instance is pre padding required.
        /// </summary>
        /// <value>Gets or sets a value indicating whether this instance is pre padding required.</value>
        [DataMember(Name="IsPrePaddingRequired", EmitDefaultValue=true)]
        public bool IsPrePaddingRequired { get; set; }

        /// <summary>
        /// Gets or Sets KeepUntil
        /// </summary>
        [DataMember(Name="KeepUntil", EmitDefaultValue=true)]
        public KeepUntil KeepUntil { get; set; }

        /// <summary>
        /// Name of the recording.
        /// </summary>
        /// <value>Name of the recording.</value>
        [DataMember(Name="Name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// Description of the recording.
        /// </summary>
        /// <value>Description of the recording.</value>
        [DataMember(Name="Overview", EmitDefaultValue=true)]
        public string Overview { get; set; }

        /// <summary>
        /// Gets or sets the parent backdrop image tags.
        /// </summary>
        /// <value>Gets or sets the parent backdrop image tags.</value>
        [DataMember(Name="ParentBackdropImageTags", EmitDefaultValue=true)]
        public List<string> ParentBackdropImageTags { get; set; }

        /// <summary>
        /// If the item does not have any backdrops, this will hold the Id of the Parent that has one.
        /// </summary>
        /// <value>If the item does not have any backdrops, this will hold the Id of the Parent that has one.</value>
        [DataMember(Name="ParentBackdropItemId", EmitDefaultValue=true)]
        public string ParentBackdropItemId { get; set; }

        /// <summary>
        /// Gets or sets the post padding seconds.
        /// </summary>
        /// <value>Gets or sets the post padding seconds.</value>
        [DataMember(Name="PostPaddingSeconds", EmitDefaultValue=true)]
        public int PostPaddingSeconds { get; set; }

        /// <summary>
        /// Gets or sets the pre padding seconds.
        /// </summary>
        /// <value>Gets or sets the pre padding seconds.</value>
        [DataMember(Name="PrePaddingSeconds", EmitDefaultValue=true)]
        public int PrePaddingSeconds { get; set; }

        /// <summary>
        /// Gets or sets the priority.
        /// </summary>
        /// <value>Gets or sets the priority.</value>
        [DataMember(Name="Priority", EmitDefaultValue=true)]
        public int Priority { get; set; }

        /// <summary>
        /// Gets or sets the program identifier.
        /// </summary>
        /// <value>Gets or sets the program identifier.</value>
        [DataMember(Name="ProgramId", EmitDefaultValue=true)]
        public string ProgramId { get; set; }

        /// <summary>
        /// Gets or Sets ProgramInfo
        /// </summary>
        [DataMember(Name="ProgramInfo", EmitDefaultValue=false)]
        public BaseItemDto ProgramInfo { get; set; }

        /// <summary>
        /// Gets or sets the run time ticks.
        /// </summary>
        /// <value>Gets or sets the run time ticks.</value>
        [DataMember(Name="RunTimeTicks", EmitDefaultValue=true)]
        public long? RunTimeTicks { get; set; }

        /// <summary>
        /// Gets or sets the series timer identifier.
        /// </summary>
        /// <value>Gets or sets the series timer identifier.</value>
        [DataMember(Name="SeriesTimerId", EmitDefaultValue=true)]
        public string SeriesTimerId { get; set; }

        /// <summary>
        /// Gets or sets the server identifier.
        /// </summary>
        /// <value>Gets or sets the server identifier.</value>
        [DataMember(Name="ServerId", EmitDefaultValue=true)]
        public string ServerId { get; set; }

        /// <summary>
        /// Gets or sets the name of the service.
        /// </summary>
        /// <value>Gets or sets the name of the service.</value>
        [DataMember(Name="ServiceName", EmitDefaultValue=true)]
        public string ServiceName { get; set; }

        /// <summary>
        /// The start date of the recording, in UTC.
        /// </summary>
        /// <value>The start date of the recording, in UTC.</value>
        [DataMember(Name="StartDate", EmitDefaultValue=false)]
        public DateTime StartDate { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="Status", EmitDefaultValue=true)]
        public RecordingStatus Status { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=true)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TimerInfoDto {\n");
            sb.Append("  ChannelId: ").Append(ChannelId).Append("\n");
            sb.Append("  ChannelName: ").Append(ChannelName).Append("\n");
            sb.Append("  ChannelPrimaryImageTag: ").Append(ChannelPrimaryImageTag).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  ExternalChannelId: ").Append(ExternalChannelId).Append("\n");
            sb.Append("  ExternalId: ").Append(ExternalId).Append("\n");
            sb.Append("  ExternalProgramId: ").Append(ExternalProgramId).Append("\n");
            sb.Append("  ExternalSeriesTimerId: ").Append(ExternalSeriesTimerId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsPostPaddingRequired: ").Append(IsPostPaddingRequired).Append("\n");
            sb.Append("  IsPrePaddingRequired: ").Append(IsPrePaddingRequired).Append("\n");
            sb.Append("  KeepUntil: ").Append(KeepUntil).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Overview: ").Append(Overview).Append("\n");
            sb.Append("  ParentBackdropImageTags: ").Append(ParentBackdropImageTags).Append("\n");
            sb.Append("  ParentBackdropItemId: ").Append(ParentBackdropItemId).Append("\n");
            sb.Append("  PostPaddingSeconds: ").Append(PostPaddingSeconds).Append("\n");
            sb.Append("  PrePaddingSeconds: ").Append(PrePaddingSeconds).Append("\n");
            sb.Append("  Priority: ").Append(Priority).Append("\n");
            sb.Append("  ProgramId: ").Append(ProgramId).Append("\n");
            sb.Append("  ProgramInfo: ").Append(ProgramInfo).Append("\n");
            sb.Append("  RunTimeTicks: ").Append(RunTimeTicks).Append("\n");
            sb.Append("  SeriesTimerId: ").Append(SeriesTimerId).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
            sb.Append("  ServiceName: ").Append(ServiceName).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TimerInfoDto)obj);
        }

        /// <summary>
        /// Returns true if TimerInfoDto instances are equal
        /// </summary>
        /// <param name="other">Instance of TimerInfoDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TimerInfoDto other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ChannelId == other.ChannelId ||
                    ChannelId != null &&
                    ChannelId.Equals(other.ChannelId)
                ) && 
                (
                    ChannelName == other.ChannelName ||
                    ChannelName != null &&
                    ChannelName.Equals(other.ChannelName)
                ) && 
                (
                    ChannelPrimaryImageTag == other.ChannelPrimaryImageTag ||
                    ChannelPrimaryImageTag != null &&
                    ChannelPrimaryImageTag.Equals(other.ChannelPrimaryImageTag)
                ) && 
                (
                    EndDate == other.EndDate ||
                    EndDate != null &&
                    EndDate.Equals(other.EndDate)
                ) && 
                (
                    ExternalChannelId == other.ExternalChannelId ||
                    ExternalChannelId != null &&
                    ExternalChannelId.Equals(other.ExternalChannelId)
                ) && 
                (
                    ExternalId == other.ExternalId ||
                    ExternalId != null &&
                    ExternalId.Equals(other.ExternalId)
                ) && 
                (
                    ExternalProgramId == other.ExternalProgramId ||
                    ExternalProgramId != null &&
                    ExternalProgramId.Equals(other.ExternalProgramId)
                ) && 
                (
                    ExternalSeriesTimerId == other.ExternalSeriesTimerId ||
                    ExternalSeriesTimerId != null &&
                    ExternalSeriesTimerId.Equals(other.ExternalSeriesTimerId)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    IsPostPaddingRequired == other.IsPostPaddingRequired ||
                    
                    IsPostPaddingRequired.Equals(other.IsPostPaddingRequired)
                ) && 
                (
                    IsPrePaddingRequired == other.IsPrePaddingRequired ||
                    
                    IsPrePaddingRequired.Equals(other.IsPrePaddingRequired)
                ) && 
                (
                    KeepUntil == other.KeepUntil ||
                    
                    KeepUntil.Equals(other.KeepUntil)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Overview == other.Overview ||
                    Overview != null &&
                    Overview.Equals(other.Overview)
                ) && 
                (
                    ParentBackdropImageTags == other.ParentBackdropImageTags ||
                    ParentBackdropImageTags != null &&
                    other.ParentBackdropImageTags != null &&
                    ParentBackdropImageTags.SequenceEqual(other.ParentBackdropImageTags)
                ) && 
                (
                    ParentBackdropItemId == other.ParentBackdropItemId ||
                    ParentBackdropItemId != null &&
                    ParentBackdropItemId.Equals(other.ParentBackdropItemId)
                ) && 
                (
                    PostPaddingSeconds == other.PostPaddingSeconds ||
                    
                    PostPaddingSeconds.Equals(other.PostPaddingSeconds)
                ) && 
                (
                    PrePaddingSeconds == other.PrePaddingSeconds ||
                    
                    PrePaddingSeconds.Equals(other.PrePaddingSeconds)
                ) && 
                (
                    Priority == other.Priority ||
                    
                    Priority.Equals(other.Priority)
                ) && 
                (
                    ProgramId == other.ProgramId ||
                    ProgramId != null &&
                    ProgramId.Equals(other.ProgramId)
                ) && 
                (
                    ProgramInfo == other.ProgramInfo ||
                    ProgramInfo != null &&
                    ProgramInfo.Equals(other.ProgramInfo)
                ) && 
                (
                    RunTimeTicks == other.RunTimeTicks ||
                    RunTimeTicks != null &&
                    RunTimeTicks.Equals(other.RunTimeTicks)
                ) && 
                (
                    SeriesTimerId == other.SeriesTimerId ||
                    SeriesTimerId != null &&
                    SeriesTimerId.Equals(other.SeriesTimerId)
                ) && 
                (
                    ServerId == other.ServerId ||
                    ServerId != null &&
                    ServerId.Equals(other.ServerId)
                ) && 
                (
                    ServiceName == other.ServiceName ||
                    ServiceName != null &&
                    ServiceName.Equals(other.ServiceName)
                ) && 
                (
                    StartDate == other.StartDate ||
                    StartDate != null &&
                    StartDate.Equals(other.StartDate)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
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
                    if (ChannelId != null)
                    hashCode = hashCode * 59 + ChannelId.GetHashCode();
                    if (ChannelName != null)
                    hashCode = hashCode * 59 + ChannelName.GetHashCode();
                    if (ChannelPrimaryImageTag != null)
                    hashCode = hashCode * 59 + ChannelPrimaryImageTag.GetHashCode();
                    if (EndDate != null)
                    hashCode = hashCode * 59 + EndDate.GetHashCode();
                    if (ExternalChannelId != null)
                    hashCode = hashCode * 59 + ExternalChannelId.GetHashCode();
                    if (ExternalId != null)
                    hashCode = hashCode * 59 + ExternalId.GetHashCode();
                    if (ExternalProgramId != null)
                    hashCode = hashCode * 59 + ExternalProgramId.GetHashCode();
                    if (ExternalSeriesTimerId != null)
                    hashCode = hashCode * 59 + ExternalSeriesTimerId.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsPostPaddingRequired.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsPrePaddingRequired.GetHashCode();
                    
                    hashCode = hashCode * 59 + KeepUntil.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Overview != null)
                    hashCode = hashCode * 59 + Overview.GetHashCode();
                    if (ParentBackdropImageTags != null)
                    hashCode = hashCode * 59 + ParentBackdropImageTags.GetHashCode();
                    if (ParentBackdropItemId != null)
                    hashCode = hashCode * 59 + ParentBackdropItemId.GetHashCode();
                    
                    hashCode = hashCode * 59 + PostPaddingSeconds.GetHashCode();
                    
                    hashCode = hashCode * 59 + PrePaddingSeconds.GetHashCode();
                    
                    hashCode = hashCode * 59 + Priority.GetHashCode();
                    if (ProgramId != null)
                    hashCode = hashCode * 59 + ProgramId.GetHashCode();
                    if (ProgramInfo != null)
                    hashCode = hashCode * 59 + ProgramInfo.GetHashCode();
                    if (RunTimeTicks != null)
                    hashCode = hashCode * 59 + RunTimeTicks.GetHashCode();
                    if (SeriesTimerId != null)
                    hashCode = hashCode * 59 + SeriesTimerId.GetHashCode();
                    if (ServerId != null)
                    hashCode = hashCode * 59 + ServerId.GetHashCode();
                    if (ServiceName != null)
                    hashCode = hashCode * 59 + ServiceName.GetHashCode();
                    if (StartDate != null)
                    hashCode = hashCode * 59 + StartDate.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TimerInfoDto left, TimerInfoDto right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TimerInfoDto left, TimerInfoDto right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}