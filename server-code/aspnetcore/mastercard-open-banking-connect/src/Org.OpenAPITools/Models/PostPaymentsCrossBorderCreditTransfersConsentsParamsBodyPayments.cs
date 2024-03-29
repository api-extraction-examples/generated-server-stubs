/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * The version of the OpenAPI document: 1.16.0
 * Contact: apisupport@mastercard.com
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
    public partial class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments : IEquatable<PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments>
    {
        /// <summary>
        /// Gets or Sets CreditorAccount
        /// </summary>
        [Required]
        [DataMember(Name="creditorAccount", EmitDefaultValue=false)]
        public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount CreditorAccount { get; set; }

        /// <summary>
        /// Gets or Sets CreditorAddress
        /// </summary>
        [DataMember(Name="creditorAddress", EmitDefaultValue=false)]
        public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress CreditorAddress { get; set; }

        /// <summary>
        /// Gets or Sets CreditorAgent
        /// </summary>
        [Required]
        [DataMember(Name="creditorAgent", EmitDefaultValue=false)]
        public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent CreditorAgent { get; set; }

        /// <summary>
        /// Bank name
        /// </summary>
        /// <value>Bank name</value>
        /// <example>Wood bank</example>
        [Required]
        [StringLength(256, MinimumLength=1)]
        [DataMember(Name="creditorName", EmitDefaultValue=false)]
        public string CreditorName { get; set; }

        /// <summary>
        /// Gets or Sets DebtorAccount
        /// </summary>
        [Required]
        [DataMember(Name="debtorAccount", EmitDefaultValue=false)]
        public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount DebtorAccount { get; set; }

        /// <summary>
        /// Gets or Sets DebtorAddress
        /// </summary>
        [DataMember(Name="debtorAddress", EmitDefaultValue=false)]
        public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress DebtorAddress { get; set; }

        /// <summary>
        /// Debtor legal name
        /// </summary>
        /// <value>Debtor legal name</value>
        /// <example>NordPole PLC</example>
        [StringLength(256, MinimumLength=1)]
        [DataMember(Name="debtorName", EmitDefaultValue=false)]
        public string DebtorName { get; set; }

        /// <summary>
        /// Payment end to end identification
        /// </summary>
        /// <value>Payment end to end identification</value>
        /// <example>Notification</example>
        [Required]
        [StringLength(18, MinimumLength=1)]
        [DataMember(Name="endToEndIdentification", EmitDefaultValue=false)]
        public string EndToEndIdentification { get; set; }

        /// <summary>
        /// Gets or Sets InstructedAmount
        /// </summary>
        [Required]
        [DataMember(Name="instructedAmount", EmitDefaultValue=false)]
        public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount InstructedAmount { get; set; }

        /// <summary>
        /// Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. If API profile of ASPSP is CMA9, then field is mandatory.
        /// </summary>
        /// <value>Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. If API profile of ASPSP is CMA9, then field is mandatory.</value>
        [StringLength(256, MinimumLength=1)]
        [DataMember(Name="instructionIdentification", EmitDefaultValue=false)]
        public string InstructionIdentification { get; set; }


        /// <summary>
        /// Indicator of the urgency or order of importance
        /// </summary>
        /// <value>Indicator of the urgency or order of importance</value>
        [TypeConverter(typeof(CustomEnumConverter<InstructionPriorityEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum InstructionPriorityEnum
        {
            
            /// <summary>
            /// Enum NormalEnum for Normal
            /// </summary>
            [EnumMember(Value = "Normal")]
            NormalEnum = 1,
            
            /// <summary>
            /// Enum UrgentEnum for Urgent
            /// </summary>
            [EnumMember(Value = "Urgent")]
            UrgentEnum = 2
        }

        /// <summary>
        /// Indicator of the urgency or order of importance
        /// </summary>
        /// <value>Indicator of the urgency or order of importance</value>
        /// <example>Normal</example>
        [Required]
        [DataMember(Name="instructionPriority", EmitDefaultValue=true)]
        public InstructionPriorityEnum InstructionPriority { get; set; }


        /// <summary>
        /// User community specific instrument.
        /// </summary>
        /// <value>User community specific instrument.</value>
        [TypeConverter(typeof(CustomEnumConverter<LocalInstrumentEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum LocalInstrumentEnum
        {
            
            /// <summary>
            /// Enum SwiftEnum for Swift
            /// </summary>
            [EnumMember(Value = "Swift")]
            SwiftEnum = 1
        }

        /// <summary>
        /// User community specific instrument.
        /// </summary>
        /// <value>User community specific instrument.</value>
        /// <example>Swift</example>
        [Required]
        [DataMember(Name="localInstrument", EmitDefaultValue=true)]
        public LocalInstrumentEnum LocalInstrument { get; set; }

        /// <summary>
        /// Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. (future use)
        /// </summary>
        /// <value>Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. (future use)</value>
        /// <example>UniqueRef1</example>
        [StringLength(256, MinimumLength=1)]
        [DataMember(Name="remittanceInformationReference", EmitDefaultValue=false)]
        public string RemittanceInformationReference { get; set; }

        /// <summary>
        /// Description of the payment
        /// </summary>
        /// <value>Description of the payment</value>
        /// <example>Payment for fruits</example>
        [StringLength(256, MinimumLength=1)]
        [DataMember(Name="remittanceInformationUnstructured", EmitDefaultValue=false)]
        public string RemittanceInformationUnstructured { get; set; }

        /// <summary>
        /// Scheduled Payment Date
        /// </summary>
        /// <value>Scheduled Payment Date</value>
        [DataMember(Name="requestedExecutionDate", EmitDefaultValue=false)]
        public DateTime RequestedExecutionDate { get; set; }


        /// <summary>
        /// Charge bearer
        /// </summary>
        /// <value>Charge bearer</value>
        [TypeConverter(typeof(CustomEnumConverter<TransferChargesEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TransferChargesEnum
        {
            
            /// <summary>
            /// Enum SENEnum for SEN
            /// </summary>
            [EnumMember(Value = "SEN")]
            SENEnum = 1,
            
            /// <summary>
            /// Enum SHAEnum for SHA
            /// </summary>
            [EnumMember(Value = "SHA")]
            SHAEnum = 2,
            
            /// <summary>
            /// Enum BENEnum for BEN
            /// </summary>
            [EnumMember(Value = "BEN")]
            BENEnum = 3
        }

        /// <summary>
        /// Charge bearer
        /// </summary>
        /// <value>Charge bearer</value>
        [DataMember(Name="transferCharges", EmitDefaultValue=true)]
        public TransferChargesEnum TransferCharges { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments {\n");
            sb.Append("  CreditorAccount: ").Append(CreditorAccount).Append("\n");
            sb.Append("  CreditorAddress: ").Append(CreditorAddress).Append("\n");
            sb.Append("  CreditorAgent: ").Append(CreditorAgent).Append("\n");
            sb.Append("  CreditorName: ").Append(CreditorName).Append("\n");
            sb.Append("  DebtorAccount: ").Append(DebtorAccount).Append("\n");
            sb.Append("  DebtorAddress: ").Append(DebtorAddress).Append("\n");
            sb.Append("  DebtorName: ").Append(DebtorName).Append("\n");
            sb.Append("  EndToEndIdentification: ").Append(EndToEndIdentification).Append("\n");
            sb.Append("  InstructedAmount: ").Append(InstructedAmount).Append("\n");
            sb.Append("  InstructionIdentification: ").Append(InstructionIdentification).Append("\n");
            sb.Append("  InstructionPriority: ").Append(InstructionPriority).Append("\n");
            sb.Append("  LocalInstrument: ").Append(LocalInstrument).Append("\n");
            sb.Append("  RemittanceInformationReference: ").Append(RemittanceInformationReference).Append("\n");
            sb.Append("  RemittanceInformationUnstructured: ").Append(RemittanceInformationUnstructured).Append("\n");
            sb.Append("  RequestedExecutionDate: ").Append(RequestedExecutionDate).Append("\n");
            sb.Append("  TransferCharges: ").Append(TransferCharges).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments)obj);
        }

        /// <summary>
        /// Returns true if PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments instances are equal
        /// </summary>
        /// <param name="other">Instance of PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CreditorAccount == other.CreditorAccount ||
                    CreditorAccount != null &&
                    CreditorAccount.Equals(other.CreditorAccount)
                ) && 
                (
                    CreditorAddress == other.CreditorAddress ||
                    CreditorAddress != null &&
                    CreditorAddress.Equals(other.CreditorAddress)
                ) && 
                (
                    CreditorAgent == other.CreditorAgent ||
                    CreditorAgent != null &&
                    CreditorAgent.Equals(other.CreditorAgent)
                ) && 
                (
                    CreditorName == other.CreditorName ||
                    CreditorName != null &&
                    CreditorName.Equals(other.CreditorName)
                ) && 
                (
                    DebtorAccount == other.DebtorAccount ||
                    DebtorAccount != null &&
                    DebtorAccount.Equals(other.DebtorAccount)
                ) && 
                (
                    DebtorAddress == other.DebtorAddress ||
                    DebtorAddress != null &&
                    DebtorAddress.Equals(other.DebtorAddress)
                ) && 
                (
                    DebtorName == other.DebtorName ||
                    DebtorName != null &&
                    DebtorName.Equals(other.DebtorName)
                ) && 
                (
                    EndToEndIdentification == other.EndToEndIdentification ||
                    EndToEndIdentification != null &&
                    EndToEndIdentification.Equals(other.EndToEndIdentification)
                ) && 
                (
                    InstructedAmount == other.InstructedAmount ||
                    InstructedAmount != null &&
                    InstructedAmount.Equals(other.InstructedAmount)
                ) && 
                (
                    InstructionIdentification == other.InstructionIdentification ||
                    InstructionIdentification != null &&
                    InstructionIdentification.Equals(other.InstructionIdentification)
                ) && 
                (
                    InstructionPriority == other.InstructionPriority ||
                    
                    InstructionPriority.Equals(other.InstructionPriority)
                ) && 
                (
                    LocalInstrument == other.LocalInstrument ||
                    
                    LocalInstrument.Equals(other.LocalInstrument)
                ) && 
                (
                    RemittanceInformationReference == other.RemittanceInformationReference ||
                    RemittanceInformationReference != null &&
                    RemittanceInformationReference.Equals(other.RemittanceInformationReference)
                ) && 
                (
                    RemittanceInformationUnstructured == other.RemittanceInformationUnstructured ||
                    RemittanceInformationUnstructured != null &&
                    RemittanceInformationUnstructured.Equals(other.RemittanceInformationUnstructured)
                ) && 
                (
                    RequestedExecutionDate == other.RequestedExecutionDate ||
                    RequestedExecutionDate != null &&
                    RequestedExecutionDate.Equals(other.RequestedExecutionDate)
                ) && 
                (
                    TransferCharges == other.TransferCharges ||
                    
                    TransferCharges.Equals(other.TransferCharges)
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
                    if (CreditorAccount != null)
                    hashCode = hashCode * 59 + CreditorAccount.GetHashCode();
                    if (CreditorAddress != null)
                    hashCode = hashCode * 59 + CreditorAddress.GetHashCode();
                    if (CreditorAgent != null)
                    hashCode = hashCode * 59 + CreditorAgent.GetHashCode();
                    if (CreditorName != null)
                    hashCode = hashCode * 59 + CreditorName.GetHashCode();
                    if (DebtorAccount != null)
                    hashCode = hashCode * 59 + DebtorAccount.GetHashCode();
                    if (DebtorAddress != null)
                    hashCode = hashCode * 59 + DebtorAddress.GetHashCode();
                    if (DebtorName != null)
                    hashCode = hashCode * 59 + DebtorName.GetHashCode();
                    if (EndToEndIdentification != null)
                    hashCode = hashCode * 59 + EndToEndIdentification.GetHashCode();
                    if (InstructedAmount != null)
                    hashCode = hashCode * 59 + InstructedAmount.GetHashCode();
                    if (InstructionIdentification != null)
                    hashCode = hashCode * 59 + InstructionIdentification.GetHashCode();
                    
                    hashCode = hashCode * 59 + InstructionPriority.GetHashCode();
                    
                    hashCode = hashCode * 59 + LocalInstrument.GetHashCode();
                    if (RemittanceInformationReference != null)
                    hashCode = hashCode * 59 + RemittanceInformationReference.GetHashCode();
                    if (RemittanceInformationUnstructured != null)
                    hashCode = hashCode * 59 + RemittanceInformationUnstructured.GetHashCode();
                    if (RequestedExecutionDate != null)
                    hashCode = hashCode * 59 + RequestedExecutionDate.GetHashCode();
                    
                    hashCode = hashCode * 59 + TransferCharges.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments left, PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments left, PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
