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
    public partial class PersonalisedRadioActivity : IEquatable<PersonalisedRadioActivity>
    {
        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [Required]
        [DataMember(Name="action", EmitDefaultValue=false)]
        public string Action { get; set; }

        /// <summary>
        /// Gets or Sets Activity
        /// </summary>
        [Required]
        [DataMember(Name="activity", EmitDefaultValue=false)]
        public string Activity { get; set; }

        /// <summary>
        /// Gets or Sets AddedAt
        /// </summary>
        [Required]
        [DataMember(Name="added_at", EmitDefaultValue=false)]
        public string AddedAt { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [Required]
        [DataMember(Name="data", EmitDefaultValue=false)]
        public ProgrammeSummary Data { get; set; }

        /// <summary>
        /// Gets or Sets Domain
        /// </summary>
        [Required]
        [DataMember(Name="domain", EmitDefaultValue=false)]
        public string Domain { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Metadata
        /// </summary>
        [Required]
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public MetaData Metadata { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets UasType
        /// </summary>
        [Required]
        [DataMember(Name="uas_type", EmitDefaultValue=false)]
        public string UasType { get; set; }

        /// <summary>
        /// Gets or Sets Urn
        /// </summary>
        [Required]
        [DataMember(Name="urn", EmitDefaultValue=false)]
        public string Urn { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PersonalisedRadioActivity {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Activity: ").Append(Activity).Append("\n");
            sb.Append("  AddedAt: ").Append(AddedAt).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Domain: ").Append(Domain).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  UasType: ").Append(UasType).Append("\n");
            sb.Append("  Urn: ").Append(Urn).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PersonalisedRadioActivity)obj);
        }

        /// <summary>
        /// Returns true if PersonalisedRadioActivity instances are equal
        /// </summary>
        /// <param name="other">Instance of PersonalisedRadioActivity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PersonalisedRadioActivity other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Action == other.Action ||
                    Action != null &&
                    Action.Equals(other.Action)
                ) && 
                (
                    Activity == other.Activity ||
                    Activity != null &&
                    Activity.Equals(other.Activity)
                ) && 
                (
                    AddedAt == other.AddedAt ||
                    AddedAt != null &&
                    AddedAt.Equals(other.AddedAt)
                ) && 
                (
                    Data == other.Data ||
                    Data != null &&
                    Data.Equals(other.Data)
                ) && 
                (
                    Domain == other.Domain ||
                    Domain != null &&
                    Domain.Equals(other.Domain)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Metadata == other.Metadata ||
                    Metadata != null &&
                    Metadata.Equals(other.Metadata)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    UasType == other.UasType ||
                    UasType != null &&
                    UasType.Equals(other.UasType)
                ) && 
                (
                    Urn == other.Urn ||
                    Urn != null &&
                    Urn.Equals(other.Urn)
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
                    if (Action != null)
                    hashCode = hashCode * 59 + Action.GetHashCode();
                    if (Activity != null)
                    hashCode = hashCode * 59 + Activity.GetHashCode();
                    if (AddedAt != null)
                    hashCode = hashCode * 59 + AddedAt.GetHashCode();
                    if (Data != null)
                    hashCode = hashCode * 59 + Data.GetHashCode();
                    if (Domain != null)
                    hashCode = hashCode * 59 + Domain.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Metadata != null)
                    hashCode = hashCode * 59 + Metadata.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (UasType != null)
                    hashCode = hashCode * 59 + UasType.GetHashCode();
                    if (Urn != null)
                    hashCode = hashCode * 59 + Urn.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PersonalisedRadioActivity left, PersonalisedRadioActivity right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PersonalisedRadioActivity left, PersonalisedRadioActivity right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
