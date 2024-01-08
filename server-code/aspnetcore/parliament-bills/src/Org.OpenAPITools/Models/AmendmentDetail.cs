/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * The version of the OpenAPI document: v1
 * Contact: softwareengineering@parliament.uk
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
    public partial class AmendmentDetail : IEquatable<AmendmentDetail>
    {
        /// <summary>
        /// Gets or Sets AmendmentId
        /// </summary>
        [DataMember(Name="amendmentId", EmitDefaultValue=true)]
        public int AmendmentId { get; set; }

        /// <summary>
        /// Gets or Sets AmendmentLines
        /// </summary>
        [DataMember(Name="amendmentLines", EmitDefaultValue=true)]
        public List<AmendmentLine> AmendmentLines { get; set; }

        /// <summary>
        /// Gets or Sets AmendmentNote
        /// </summary>
        [DataMember(Name="amendmentNote", EmitDefaultValue=true)]
        public string AmendmentNote { get; set; }

        /// <summary>
        /// Gets or Sets AmendmentPosition
        /// </summary>
        [DataMember(Name="amendmentPosition", EmitDefaultValue=true)]
        public string AmendmentPosition { get; set; }

        /// <summary>
        /// Gets or Sets AmendmentType
        /// </summary>
        [DataMember(Name="amendmentType", EmitDefaultValue=true)]
        public AmendmentType AmendmentType { get; set; }

        /// <summary>
        /// Gets or Sets BillId
        /// </summary>
        [DataMember(Name="billId", EmitDefaultValue=true)]
        public int BillId { get; set; }

        /// <summary>
        /// Gets or Sets BillStageId
        /// </summary>
        [DataMember(Name="billStageId", EmitDefaultValue=true)]
        public int BillStageId { get; set; }

        /// <summary>
        /// Gets or Sets Clause
        /// </summary>
        [DataMember(Name="clause", EmitDefaultValue=true)]
        public int? Clause { get; set; }

        /// <summary>
        /// Gets or Sets Decision
        /// </summary>
        [DataMember(Name="decision", EmitDefaultValue=true)]
        public AmendmentDecision Decision { get; set; }

        /// <summary>
        /// Gets or Sets ExplanatoryText
        /// </summary>
        [DataMember(Name="explanatoryText", EmitDefaultValue=true)]
        public string ExplanatoryText { get; set; }

        /// <summary>
        /// Gets or Sets ExplanatoryTextPrefix
        /// </summary>
        [DataMember(Name="explanatoryTextPrefix", EmitDefaultValue=true)]
        public string ExplanatoryTextPrefix { get; set; }

        /// <summary>
        /// Gets or Sets LineNumber
        /// </summary>
        [DataMember(Name="lineNumber", EmitDefaultValue=true)]
        public int? LineNumber { get; set; }

        /// <summary>
        /// Gets or Sets MarshalledListText
        /// </summary>
        [DataMember(Name="marshalledListText", EmitDefaultValue=true)]
        public string MarshalledListText { get; set; }

        /// <summary>
        /// Gets or Sets PageNumber
        /// </summary>
        [DataMember(Name="pageNumber", EmitDefaultValue=true)]
        public int? PageNumber { get; set; }

        /// <summary>
        /// Gets or Sets Schedule
        /// </summary>
        [DataMember(Name="schedule", EmitDefaultValue=true)]
        public int? Schedule { get; set; }

        /// <summary>
        /// Gets or Sets Sponsors
        /// </summary>
        [DataMember(Name="sponsors", EmitDefaultValue=true)]
        public List<AmendmentMember> Sponsors { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AmendmentDetail {\n");
            sb.Append("  AmendmentId: ").Append(AmendmentId).Append("\n");
            sb.Append("  AmendmentLines: ").Append(AmendmentLines).Append("\n");
            sb.Append("  AmendmentNote: ").Append(AmendmentNote).Append("\n");
            sb.Append("  AmendmentPosition: ").Append(AmendmentPosition).Append("\n");
            sb.Append("  AmendmentType: ").Append(AmendmentType).Append("\n");
            sb.Append("  BillId: ").Append(BillId).Append("\n");
            sb.Append("  BillStageId: ").Append(BillStageId).Append("\n");
            sb.Append("  Clause: ").Append(Clause).Append("\n");
            sb.Append("  Decision: ").Append(Decision).Append("\n");
            sb.Append("  ExplanatoryText: ").Append(ExplanatoryText).Append("\n");
            sb.Append("  ExplanatoryTextPrefix: ").Append(ExplanatoryTextPrefix).Append("\n");
            sb.Append("  LineNumber: ").Append(LineNumber).Append("\n");
            sb.Append("  MarshalledListText: ").Append(MarshalledListText).Append("\n");
            sb.Append("  PageNumber: ").Append(PageNumber).Append("\n");
            sb.Append("  Schedule: ").Append(Schedule).Append("\n");
            sb.Append("  Sponsors: ").Append(Sponsors).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AmendmentDetail)obj);
        }

        /// <summary>
        /// Returns true if AmendmentDetail instances are equal
        /// </summary>
        /// <param name="other">Instance of AmendmentDetail to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AmendmentDetail other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AmendmentId == other.AmendmentId ||
                    
                    AmendmentId.Equals(other.AmendmentId)
                ) && 
                (
                    AmendmentLines == other.AmendmentLines ||
                    AmendmentLines != null &&
                    other.AmendmentLines != null &&
                    AmendmentLines.SequenceEqual(other.AmendmentLines)
                ) && 
                (
                    AmendmentNote == other.AmendmentNote ||
                    AmendmentNote != null &&
                    AmendmentNote.Equals(other.AmendmentNote)
                ) && 
                (
                    AmendmentPosition == other.AmendmentPosition ||
                    AmendmentPosition != null &&
                    AmendmentPosition.Equals(other.AmendmentPosition)
                ) && 
                (
                    AmendmentType == other.AmendmentType ||
                    
                    AmendmentType.Equals(other.AmendmentType)
                ) && 
                (
                    BillId == other.BillId ||
                    
                    BillId.Equals(other.BillId)
                ) && 
                (
                    BillStageId == other.BillStageId ||
                    
                    BillStageId.Equals(other.BillStageId)
                ) && 
                (
                    Clause == other.Clause ||
                    Clause != null &&
                    Clause.Equals(other.Clause)
                ) && 
                (
                    Decision == other.Decision ||
                    
                    Decision.Equals(other.Decision)
                ) && 
                (
                    ExplanatoryText == other.ExplanatoryText ||
                    ExplanatoryText != null &&
                    ExplanatoryText.Equals(other.ExplanatoryText)
                ) && 
                (
                    ExplanatoryTextPrefix == other.ExplanatoryTextPrefix ||
                    ExplanatoryTextPrefix != null &&
                    ExplanatoryTextPrefix.Equals(other.ExplanatoryTextPrefix)
                ) && 
                (
                    LineNumber == other.LineNumber ||
                    LineNumber != null &&
                    LineNumber.Equals(other.LineNumber)
                ) && 
                (
                    MarshalledListText == other.MarshalledListText ||
                    MarshalledListText != null &&
                    MarshalledListText.Equals(other.MarshalledListText)
                ) && 
                (
                    PageNumber == other.PageNumber ||
                    PageNumber != null &&
                    PageNumber.Equals(other.PageNumber)
                ) && 
                (
                    Schedule == other.Schedule ||
                    Schedule != null &&
                    Schedule.Equals(other.Schedule)
                ) && 
                (
                    Sponsors == other.Sponsors ||
                    Sponsors != null &&
                    other.Sponsors != null &&
                    Sponsors.SequenceEqual(other.Sponsors)
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
                    
                    hashCode = hashCode * 59 + AmendmentId.GetHashCode();
                    if (AmendmentLines != null)
                    hashCode = hashCode * 59 + AmendmentLines.GetHashCode();
                    if (AmendmentNote != null)
                    hashCode = hashCode * 59 + AmendmentNote.GetHashCode();
                    if (AmendmentPosition != null)
                    hashCode = hashCode * 59 + AmendmentPosition.GetHashCode();
                    
                    hashCode = hashCode * 59 + AmendmentType.GetHashCode();
                    
                    hashCode = hashCode * 59 + BillId.GetHashCode();
                    
                    hashCode = hashCode * 59 + BillStageId.GetHashCode();
                    if (Clause != null)
                    hashCode = hashCode * 59 + Clause.GetHashCode();
                    
                    hashCode = hashCode * 59 + Decision.GetHashCode();
                    if (ExplanatoryText != null)
                    hashCode = hashCode * 59 + ExplanatoryText.GetHashCode();
                    if (ExplanatoryTextPrefix != null)
                    hashCode = hashCode * 59 + ExplanatoryTextPrefix.GetHashCode();
                    if (LineNumber != null)
                    hashCode = hashCode * 59 + LineNumber.GetHashCode();
                    if (MarshalledListText != null)
                    hashCode = hashCode * 59 + MarshalledListText.GetHashCode();
                    if (PageNumber != null)
                    hashCode = hashCode * 59 + PageNumber.GetHashCode();
                    if (Schedule != null)
                    hashCode = hashCode * 59 + Schedule.GetHashCode();
                    if (Sponsors != null)
                    hashCode = hashCode * 59 + Sponsors.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AmendmentDetail left, AmendmentDetail right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AmendmentDetail left, AmendmentDetail right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}