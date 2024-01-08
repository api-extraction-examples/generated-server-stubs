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
    public partial class ResponseProfile : IEquatable<ResponseProfile>
    {
        /// <summary>
        /// Gets or Sets AudioCodec
        /// </summary>
        [DataMember(Name="AudioCodec", EmitDefaultValue=true)]
        public string AudioCodec { get; set; }

        /// <summary>
        /// Gets or Sets Conditions
        /// </summary>
        [DataMember(Name="Conditions", EmitDefaultValue=true)]
        public List<ProfileCondition> Conditions { get; set; }

        /// <summary>
        /// Gets or Sets Container
        /// </summary>
        [DataMember(Name="Container", EmitDefaultValue=true)]
        public string Container { get; set; }

        /// <summary>
        /// Gets or Sets MimeType
        /// </summary>
        [DataMember(Name="MimeType", EmitDefaultValue=true)]
        public string MimeType { get; set; }

        /// <summary>
        /// Gets or Sets OrgPn
        /// </summary>
        [DataMember(Name="OrgPn", EmitDefaultValue=true)]
        public string OrgPn { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=true)]
        public DlnaProfileType Type { get; set; }

        /// <summary>
        /// Gets or Sets VideoCodec
        /// </summary>
        [DataMember(Name="VideoCodec", EmitDefaultValue=true)]
        public string VideoCodec { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ResponseProfile {\n");
            sb.Append("  AudioCodec: ").Append(AudioCodec).Append("\n");
            sb.Append("  Conditions: ").Append(Conditions).Append("\n");
            sb.Append("  Container: ").Append(Container).Append("\n");
            sb.Append("  MimeType: ").Append(MimeType).Append("\n");
            sb.Append("  OrgPn: ").Append(OrgPn).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  VideoCodec: ").Append(VideoCodec).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ResponseProfile)obj);
        }

        /// <summary>
        /// Returns true if ResponseProfile instances are equal
        /// </summary>
        /// <param name="other">Instance of ResponseProfile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ResponseProfile other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AudioCodec == other.AudioCodec ||
                    AudioCodec != null &&
                    AudioCodec.Equals(other.AudioCodec)
                ) && 
                (
                    Conditions == other.Conditions ||
                    Conditions != null &&
                    other.Conditions != null &&
                    Conditions.SequenceEqual(other.Conditions)
                ) && 
                (
                    Container == other.Container ||
                    Container != null &&
                    Container.Equals(other.Container)
                ) && 
                (
                    MimeType == other.MimeType ||
                    MimeType != null &&
                    MimeType.Equals(other.MimeType)
                ) && 
                (
                    OrgPn == other.OrgPn ||
                    OrgPn != null &&
                    OrgPn.Equals(other.OrgPn)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    VideoCodec == other.VideoCodec ||
                    VideoCodec != null &&
                    VideoCodec.Equals(other.VideoCodec)
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
                    if (AudioCodec != null)
                    hashCode = hashCode * 59 + AudioCodec.GetHashCode();
                    if (Conditions != null)
                    hashCode = hashCode * 59 + Conditions.GetHashCode();
                    if (Container != null)
                    hashCode = hashCode * 59 + Container.GetHashCode();
                    if (MimeType != null)
                    hashCode = hashCode * 59 + MimeType.GetHashCode();
                    if (OrgPn != null)
                    hashCode = hashCode * 59 + OrgPn.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (VideoCodec != null)
                    hashCode = hashCode * 59 + VideoCodec.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ResponseProfile left, ResponseProfile right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ResponseProfile left, ResponseProfile right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}