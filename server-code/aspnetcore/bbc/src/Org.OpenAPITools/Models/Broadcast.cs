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
    public partial class Broadcast : IEquatable<Broadcast>
    {
        /// <summary>
        /// Gets or Sets Duration
        /// </summary>
        [Required]
        [DataMember(Name="duration", EmitDefaultValue=true)]
        public int Duration { get; set; }

        /// <summary>
        /// Gets or Sets End
        /// </summary>
        [Required]
        [DataMember(Name="end", EmitDefaultValue=false)]
        public string End { get; set; }

        /// <summary>
        /// Gets or Sets IsAudioDescribed
        /// </summary>
        [Required]
        [DataMember(Name="is_audio_described", EmitDefaultValue=true)]
        public bool IsAudioDescribed { get; set; }

        /// <summary>
        /// Gets or Sets IsBlanked
        /// </summary>
        [Required]
        [DataMember(Name="is_blanked", EmitDefaultValue=true)]
        public bool IsBlanked { get; set; }

        /// <summary>
        /// Gets or Sets IsCritical
        /// </summary>
        [Required]
        [DataMember(Name="is_critical", EmitDefaultValue=true)]
        public bool IsCritical { get; set; }

        /// <summary>
        /// Gets or Sets IsLive
        /// </summary>
        [Required]
        [DataMember(Name="is_live", EmitDefaultValue=true)]
        public bool IsLive { get; set; }

        /// <summary>
        /// Gets or Sets IsRepeat
        /// </summary>
        [Required]
        [DataMember(Name="is_repeat", EmitDefaultValue=true)]
        public bool IsRepeat { get; set; }

        /// <summary>
        /// Gets or Sets IsWebcast
        /// </summary>
        [Required]
        [DataMember(Name="is_webcast", EmitDefaultValue=true)]
        public bool IsWebcast { get; set; }

        /// <summary>
        /// Gets or Sets Pid
        /// </summary>
        [Required]
        [DataMember(Name="pid", EmitDefaultValue=false)]
        public string Pid { get; set; }

        /// <summary>
        /// Gets or Sets Programme
        /// </summary>
        [DataMember(Name="programme", EmitDefaultValue=false)]
        public ProgrammeSummary Programme { get; set; }

        /// <summary>
        /// Gets or Sets ServiceId
        /// </summary>
        [Required]
        [DataMember(Name="service_id", EmitDefaultValue=false)]
        public string ServiceId { get; set; }

        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [Required]
        [DataMember(Name="start", EmitDefaultValue=false)]
        public string Start { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets VersionPid
        /// </summary>
        [Required]
        [DataMember(Name="version_pid", EmitDefaultValue=false)]
        public string VersionPid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Broadcast {\n");
            sb.Append("  Duration: ").Append(Duration).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  IsAudioDescribed: ").Append(IsAudioDescribed).Append("\n");
            sb.Append("  IsBlanked: ").Append(IsBlanked).Append("\n");
            sb.Append("  IsCritical: ").Append(IsCritical).Append("\n");
            sb.Append("  IsLive: ").Append(IsLive).Append("\n");
            sb.Append("  IsRepeat: ").Append(IsRepeat).Append("\n");
            sb.Append("  IsWebcast: ").Append(IsWebcast).Append("\n");
            sb.Append("  Pid: ").Append(Pid).Append("\n");
            sb.Append("  Programme: ").Append(Programme).Append("\n");
            sb.Append("  ServiceId: ").Append(ServiceId).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  VersionPid: ").Append(VersionPid).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Broadcast)obj);
        }

        /// <summary>
        /// Returns true if Broadcast instances are equal
        /// </summary>
        /// <param name="other">Instance of Broadcast to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Broadcast other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Duration == other.Duration ||
                    
                    Duration.Equals(other.Duration)
                ) && 
                (
                    End == other.End ||
                    End != null &&
                    End.Equals(other.End)
                ) && 
                (
                    IsAudioDescribed == other.IsAudioDescribed ||
                    
                    IsAudioDescribed.Equals(other.IsAudioDescribed)
                ) && 
                (
                    IsBlanked == other.IsBlanked ||
                    
                    IsBlanked.Equals(other.IsBlanked)
                ) && 
                (
                    IsCritical == other.IsCritical ||
                    
                    IsCritical.Equals(other.IsCritical)
                ) && 
                (
                    IsLive == other.IsLive ||
                    
                    IsLive.Equals(other.IsLive)
                ) && 
                (
                    IsRepeat == other.IsRepeat ||
                    
                    IsRepeat.Equals(other.IsRepeat)
                ) && 
                (
                    IsWebcast == other.IsWebcast ||
                    
                    IsWebcast.Equals(other.IsWebcast)
                ) && 
                (
                    Pid == other.Pid ||
                    Pid != null &&
                    Pid.Equals(other.Pid)
                ) && 
                (
                    Programme == other.Programme ||
                    Programme != null &&
                    Programme.Equals(other.Programme)
                ) && 
                (
                    ServiceId == other.ServiceId ||
                    ServiceId != null &&
                    ServiceId.Equals(other.ServiceId)
                ) && 
                (
                    Start == other.Start ||
                    Start != null &&
                    Start.Equals(other.Start)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    VersionPid == other.VersionPid ||
                    VersionPid != null &&
                    VersionPid.Equals(other.VersionPid)
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
                    
                    hashCode = hashCode * 59 + Duration.GetHashCode();
                    if (End != null)
                    hashCode = hashCode * 59 + End.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsAudioDescribed.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsBlanked.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsCritical.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsLive.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsRepeat.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsWebcast.GetHashCode();
                    if (Pid != null)
                    hashCode = hashCode * 59 + Pid.GetHashCode();
                    if (Programme != null)
                    hashCode = hashCode * 59 + Programme.GetHashCode();
                    if (ServiceId != null)
                    hashCode = hashCode * 59 + ServiceId.GetHashCode();
                    if (Start != null)
                    hashCode = hashCode * 59 + Start.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (VersionPid != null)
                    hashCode = hashCode * 59 + VersionPid.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Broadcast left, Broadcast right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Broadcast left, Broadcast right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
