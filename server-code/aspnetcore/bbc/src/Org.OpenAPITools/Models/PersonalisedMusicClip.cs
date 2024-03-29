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
    public partial class PersonalisedMusicClip : IEquatable<PersonalisedMusicClip>
    {
        /// <summary>
        /// Gets or Sets Contributors
        /// </summary>
        [DataMember(Name="contributors", EmitDefaultValue=false)]
        public List<string> Contributors { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name="endDate", EmitDefaultValue=false)]
        public string EndDate { get; set; }

        /// <summary>
        /// Gets or Sets EntityType
        /// </summary>
        [DataMember(Name="entityType", EmitDefaultValue=false)]
        public string EntityType { get; set; }

        /// <summary>
        /// Gets or Sets ImageUrl
        /// </summary>
        [DataMember(Name="imageUrl", EmitDefaultValue=false)]
        public string ImageUrl { get; set; }

        /// <summary>
        /// Gets or Sets MasterbrandMid
        /// </summary>
        [DataMember(Name="masterbrandMid", EmitDefaultValue=false)]
        public string MasterbrandMid { get; set; }

        /// <summary>
        /// Gets or Sets MediaType
        /// </summary>
        [DataMember(Name="mediaType", EmitDefaultValue=false)]
        public string MediaType { get; set; }

        /// <summary>
        /// Gets or Sets ParentProgramme
        /// </summary>
        [DataMember(Name="parentProgramme", EmitDefaultValue=false)]
        public PersonalisedMusicClipParentProgramme ParentProgramme { get; set; }

        /// <summary>
        /// Gets or Sets Pid
        /// </summary>
        [DataMember(Name="pid", EmitDefaultValue=false)]
        public string Pid { get; set; }

        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name="startDate", EmitDefaultValue=false)]
        public string StartDate { get; set; }

        /// <summary>
        /// Gets or Sets Synopsis
        /// </summary>
        [DataMember(Name="synopsis", EmitDefaultValue=false)]
        public string Synopsis { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets VarVersion
        /// </summary>
        [DataMember(Name="version", EmitDefaultValue=false)]
        public PersonalisedMusicVersion VarVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PersonalisedMusicClip {\n");
            sb.Append("  Contributors: ").Append(Contributors).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  EntityType: ").Append(EntityType).Append("\n");
            sb.Append("  ImageUrl: ").Append(ImageUrl).Append("\n");
            sb.Append("  MasterbrandMid: ").Append(MasterbrandMid).Append("\n");
            sb.Append("  MediaType: ").Append(MediaType).Append("\n");
            sb.Append("  ParentProgramme: ").Append(ParentProgramme).Append("\n");
            sb.Append("  Pid: ").Append(Pid).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  Synopsis: ").Append(Synopsis).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PersonalisedMusicClip)obj);
        }

        /// <summary>
        /// Returns true if PersonalisedMusicClip instances are equal
        /// </summary>
        /// <param name="other">Instance of PersonalisedMusicClip to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PersonalisedMusicClip other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Contributors == other.Contributors ||
                    Contributors != null &&
                    other.Contributors != null &&
                    Contributors.SequenceEqual(other.Contributors)
                ) && 
                (
                    EndDate == other.EndDate ||
                    EndDate != null &&
                    EndDate.Equals(other.EndDate)
                ) && 
                (
                    EntityType == other.EntityType ||
                    EntityType != null &&
                    EntityType.Equals(other.EntityType)
                ) && 
                (
                    ImageUrl == other.ImageUrl ||
                    ImageUrl != null &&
                    ImageUrl.Equals(other.ImageUrl)
                ) && 
                (
                    MasterbrandMid == other.MasterbrandMid ||
                    MasterbrandMid != null &&
                    MasterbrandMid.Equals(other.MasterbrandMid)
                ) && 
                (
                    MediaType == other.MediaType ||
                    MediaType != null &&
                    MediaType.Equals(other.MediaType)
                ) && 
                (
                    ParentProgramme == other.ParentProgramme ||
                    ParentProgramme != null &&
                    ParentProgramme.Equals(other.ParentProgramme)
                ) && 
                (
                    Pid == other.Pid ||
                    Pid != null &&
                    Pid.Equals(other.Pid)
                ) && 
                (
                    StartDate == other.StartDate ||
                    StartDate != null &&
                    StartDate.Equals(other.StartDate)
                ) && 
                (
                    Synopsis == other.Synopsis ||
                    Synopsis != null &&
                    Synopsis.Equals(other.Synopsis)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
                ) && 
                (
                    VarVersion == other.VarVersion ||
                    VarVersion != null &&
                    VarVersion.Equals(other.VarVersion)
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
                    if (Contributors != null)
                    hashCode = hashCode * 59 + Contributors.GetHashCode();
                    if (EndDate != null)
                    hashCode = hashCode * 59 + EndDate.GetHashCode();
                    if (EntityType != null)
                    hashCode = hashCode * 59 + EntityType.GetHashCode();
                    if (ImageUrl != null)
                    hashCode = hashCode * 59 + ImageUrl.GetHashCode();
                    if (MasterbrandMid != null)
                    hashCode = hashCode * 59 + MasterbrandMid.GetHashCode();
                    if (MediaType != null)
                    hashCode = hashCode * 59 + MediaType.GetHashCode();
                    if (ParentProgramme != null)
                    hashCode = hashCode * 59 + ParentProgramme.GetHashCode();
                    if (Pid != null)
                    hashCode = hashCode * 59 + Pid.GetHashCode();
                    if (StartDate != null)
                    hashCode = hashCode * 59 + StartDate.GetHashCode();
                    if (Synopsis != null)
                    hashCode = hashCode * 59 + Synopsis.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                    if (VarVersion != null)
                    hashCode = hashCode * 59 + VarVersion.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PersonalisedMusicClip left, PersonalisedMusicClip right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PersonalisedMusicClip left, PersonalisedMusicClip right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
