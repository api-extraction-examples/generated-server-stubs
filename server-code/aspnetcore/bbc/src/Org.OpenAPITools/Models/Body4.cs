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
    public partial class Body4 : IEquatable<Body4>
    {

        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ActionEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ActionEnum
        {
            
            /// <summary>
            /// Enum StartedEnum for started
            /// </summary>
            [EnumMember(Value = "started")]
            StartedEnum = 1,
            
            /// <summary>
            /// Enum EndedEnum for ended
            /// </summary>
            [EnumMember(Value = "ended")]
            EndedEnum = 2,
            
            /// <summary>
            /// Enum PausedEnum for paused
            /// </summary>
            [EnumMember(Value = "paused")]
            PausedEnum = 3,
            
            /// <summary>
            /// Enum HeartbeatEnum for heartbeat
            /// </summary>
            [EnumMember(Value = "heartbeat")]
            HeartbeatEnum = 4
        }

        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [Required]
        [DataMember(Name="action", EmitDefaultValue=true)]
        public ActionEnum Action { get; set; }

        /// <summary>
        /// Gets or Sets ElapsedTime
        /// </summary>
        [Required]
        [DataMember(Name="elapsed_time", EmitDefaultValue=true)]
        public int ElapsedTime { get; set; }

        /// <summary>
        /// Gets or Sets Pid
        /// </summary>
        [Required]
        [DataMember(Name="pid", EmitDefaultValue=false)]
        public string Pid { get; set; }


        /// <summary>
        /// Gets or Sets ResourceType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ResourceTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ResourceTypeEnum
        {
            
            /// <summary>
            /// Enum EpisodeEnum for episode
            /// </summary>
            [EnumMember(Value = "episode")]
            EpisodeEnum = 1,
            
            /// <summary>
            /// Enum ClipEnum for clip
            /// </summary>
            [EnumMember(Value = "clip")]
            ClipEnum = 2
        }

        /// <summary>
        /// Gets or Sets ResourceType
        /// </summary>
        [Required]
        [DataMember(Name="resource_type", EmitDefaultValue=true)]
        public ResourceTypeEnum ResourceType { get; set; }

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
            sb.Append("class Body4 {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  ElapsedTime: ").Append(ElapsedTime).Append("\n");
            sb.Append("  Pid: ").Append(Pid).Append("\n");
            sb.Append("  ResourceType: ").Append(ResourceType).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Body4)obj);
        }

        /// <summary>
        /// Returns true if Body4 instances are equal
        /// </summary>
        /// <param name="other">Instance of Body4 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Body4 other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Action == other.Action ||
                    
                    Action.Equals(other.Action)
                ) && 
                (
                    ElapsedTime == other.ElapsedTime ||
                    
                    ElapsedTime.Equals(other.ElapsedTime)
                ) && 
                (
                    Pid == other.Pid ||
                    Pid != null &&
                    Pid.Equals(other.Pid)
                ) && 
                (
                    ResourceType == other.ResourceType ||
                    
                    ResourceType.Equals(other.ResourceType)
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
                    
                    hashCode = hashCode * 59 + Action.GetHashCode();
                    
                    hashCode = hashCode * 59 + ElapsedTime.GetHashCode();
                    if (Pid != null)
                    hashCode = hashCode * 59 + Pid.GetHashCode();
                    
                    hashCode = hashCode * 59 + ResourceType.GetHashCode();
                    if (VersionPid != null)
                    hashCode = hashCode * 59 + VersionPid.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Body4 left, Body4 right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Body4 left, Body4 right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
