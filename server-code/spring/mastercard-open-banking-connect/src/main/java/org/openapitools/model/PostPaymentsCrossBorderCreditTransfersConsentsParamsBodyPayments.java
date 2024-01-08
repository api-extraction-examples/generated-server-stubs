package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments
 */

@JsonTypeName("postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments {

  private PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount;

  private PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress creditorAddress;

  private PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent creditorAgent;

  private String creditorName;

  private PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount debtorAccount;

  private PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress debtorAddress;

  private String debtorName;

  private String endToEndIdentification;

  private PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount;

  private String instructionIdentification;

  /**
   * Indicator of the urgency or order of importance
   */
  public enum InstructionPriorityEnum {
    NORMAL("Normal"),
    
    URGENT("Urgent");

    private String value;

    InstructionPriorityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstructionPriorityEnum fromValue(String value) {
      for (InstructionPriorityEnum b : InstructionPriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private InstructionPriorityEnum instructionPriority;

  /**
   * User community specific instrument.
   */
  public enum LocalInstrumentEnum {
    SWIFT("Swift");

    private String value;

    LocalInstrumentEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LocalInstrumentEnum fromValue(String value) {
      for (LocalInstrumentEnum b : LocalInstrumentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LocalInstrumentEnum localInstrument;

  private String remittanceInformationReference;

  private String remittanceInformationUnstructured;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate requestedExecutionDate;

  /**
   * Charge bearer
   */
  public enum TransferChargesEnum {
    SEN("SEN"),
    
    SHA("SHA"),
    
    BEN("BEN");

    private String value;

    TransferChargesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransferChargesEnum fromValue(String value) {
      for (TransferChargesEnum b : TransferChargesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TransferChargesEnum transferCharges;

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount, PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent creditorAgent, String creditorName, PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount debtorAccount, String endToEndIdentification, PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount, InstructionPriorityEnum instructionPriority, LocalInstrumentEnum localInstrument) {
    this.creditorAccount = creditorAccount;
    this.creditorAgent = creditorAgent;
    this.creditorName = creditorName;
    this.debtorAccount = debtorAccount;
    this.endToEndIdentification = endToEndIdentification;
    this.instructedAmount = instructedAmount;
    this.instructionPriority = instructionPriority;
    this.localInstrument = localInstrument;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments creditorAccount(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  */
  @NotNull @Valid 
  @Schema(name = "creditorAccount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creditorAccount")
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments creditorAddress(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress creditorAddress) {
    this.creditorAddress = creditorAddress;
    return this;
  }

  /**
   * Get creditorAddress
   * @return creditorAddress
  */
  @Valid 
  @Schema(name = "creditorAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditorAddress")
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress getCreditorAddress() {
    return creditorAddress;
  }

  public void setCreditorAddress(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress creditorAddress) {
    this.creditorAddress = creditorAddress;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments creditorAgent(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
  */
  @NotNull @Valid 
  @Schema(name = "creditorAgent", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creditorAgent")
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments creditorName(String creditorName) {
    this.creditorName = creditorName;
    return this;
  }

  /**
   * Bank name
   * @return creditorName
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "creditorName", example = "Wood bank", description = "Bank name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creditorName")
  public String getCreditorName() {
    return creditorName;
  }

  public void setCreditorName(String creditorName) {
    this.creditorName = creditorName;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments debtorAccount(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  */
  @NotNull @Valid 
  @Schema(name = "debtorAccount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("debtorAccount")
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments debtorAddress(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress debtorAddress) {
    this.debtorAddress = debtorAddress;
    return this;
  }

  /**
   * Get debtorAddress
   * @return debtorAddress
  */
  @Valid 
  @Schema(name = "debtorAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debtorAddress")
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress getDebtorAddress() {
    return debtorAddress;
  }

  public void setDebtorAddress(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress debtorAddress) {
    this.debtorAddress = debtorAddress;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments debtorName(String debtorName) {
    this.debtorName = debtorName;
    return this;
  }

  /**
   * Debtor legal name
   * @return debtorName
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "debtorName", example = "NordPole PLC", description = "Debtor legal name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debtorName")
  public String getDebtorName() {
    return debtorName;
  }

  public void setDebtorName(String debtorName) {
    this.debtorName = debtorName;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments endToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
    return this;
  }

  /**
   * Payment end to end identification
   * @return endToEndIdentification
  */
  @NotNull @Size(min = 1, max = 18) 
  @Schema(name = "endToEndIdentification", example = "Notification", description = "Payment end to end identification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endToEndIdentification")
  public String getEndToEndIdentification() {
    return endToEndIdentification;
  }

  public void setEndToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments instructedAmount(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  */
  @NotNull @Valid 
  @Schema(name = "instructedAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("instructedAmount")
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments instructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
    return this;
  }

  /**
   * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. If API profile of ASPSP is CMA9, then field is mandatory.
   * @return instructionIdentification
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "instructionIdentification", example = "", description = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. If API profile of ASPSP is CMA9, then field is mandatory.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instructionIdentification")
  public String getInstructionIdentification() {
    return instructionIdentification;
  }

  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments instructionPriority(InstructionPriorityEnum instructionPriority) {
    this.instructionPriority = instructionPriority;
    return this;
  }

  /**
   * Indicator of the urgency or order of importance
   * @return instructionPriority
  */
  @NotNull 
  @Schema(name = "instructionPriority", example = "Normal", description = "Indicator of the urgency or order of importance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("instructionPriority")
  public InstructionPriorityEnum getInstructionPriority() {
    return instructionPriority;
  }

  public void setInstructionPriority(InstructionPriorityEnum instructionPriority) {
    this.instructionPriority = instructionPriority;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments localInstrument(LocalInstrumentEnum localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

  /**
   * User community specific instrument.
   * @return localInstrument
  */
  @NotNull 
  @Schema(name = "localInstrument", example = "Swift", description = "User community specific instrument.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("localInstrument")
  public LocalInstrumentEnum getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(LocalInstrumentEnum localInstrument) {
    this.localInstrument = localInstrument;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments remittanceInformationReference(String remittanceInformationReference) {
    this.remittanceInformationReference = remittanceInformationReference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. (future use)
   * @return remittanceInformationReference
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "remittanceInformationReference", example = "UniqueRef1", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. (future use)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remittanceInformationReference")
  public String getRemittanceInformationReference() {
    return remittanceInformationReference;
  }

  public void setRemittanceInformationReference(String remittanceInformationReference) {
    this.remittanceInformationReference = remittanceInformationReference;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments remittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
    return this;
  }

  /**
   * Description of the payment
   * @return remittanceInformationUnstructured
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "remittanceInformationUnstructured", example = "Payment for fruits", description = "Description of the payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remittanceInformationUnstructured")
  public String getRemittanceInformationUnstructured() {
    return remittanceInformationUnstructured;
  }

  public void setRemittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments requestedExecutionDate(LocalDate requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
    return this;
  }

  /**
   * Scheduled Payment Date
   * @return requestedExecutionDate
  */
  @Valid 
  @Schema(name = "requestedExecutionDate", description = "Scheduled Payment Date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedExecutionDate")
  public LocalDate getRequestedExecutionDate() {
    return requestedExecutionDate;
  }

  public void setRequestedExecutionDate(LocalDate requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments transferCharges(TransferChargesEnum transferCharges) {
    this.transferCharges = transferCharges;
    return this;
  }

  /**
   * Charge bearer
   * @return transferCharges
  */
  
  @Schema(name = "transferCharges", description = "Charge bearer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transferCharges")
  public TransferChargesEnum getTransferCharges() {
    return transferCharges;
  }

  public void setTransferCharges(TransferChargesEnum transferCharges) {
    this.transferCharges = transferCharges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments = (PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments) o;
    return Objects.equals(this.creditorAccount, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.creditorAccount) &&
        Objects.equals(this.creditorAddress, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.creditorAddress) &&
        Objects.equals(this.creditorAgent, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.creditorAgent) &&
        Objects.equals(this.creditorName, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.creditorName) &&
        Objects.equals(this.debtorAccount, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.debtorAccount) &&
        Objects.equals(this.debtorAddress, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.debtorAddress) &&
        Objects.equals(this.debtorName, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.debtorName) &&
        Objects.equals(this.endToEndIdentification, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.endToEndIdentification) &&
        Objects.equals(this.instructedAmount, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.instructedAmount) &&
        Objects.equals(this.instructionIdentification, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.instructionIdentification) &&
        Objects.equals(this.instructionPriority, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.instructionPriority) &&
        Objects.equals(this.localInstrument, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.localInstrument) &&
        Objects.equals(this.remittanceInformationReference, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.remittanceInformationReference) &&
        Objects.equals(this.remittanceInformationUnstructured, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.remittanceInformationUnstructured) &&
        Objects.equals(this.requestedExecutionDate, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.requestedExecutionDate) &&
        Objects.equals(this.transferCharges, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.transferCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditorAccount, creditorAddress, creditorAgent, creditorName, debtorAccount, debtorAddress, debtorName, endToEndIdentification, instructedAmount, instructionIdentification, instructionPriority, localInstrument, remittanceInformationReference, remittanceInformationUnstructured, requestedExecutionDate, transferCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments {\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    debtorAddress: ").append(toIndentedString(debtorAddress)).append("\n");
    sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    remittanceInformationReference: ").append(toIndentedString(remittanceInformationReference)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
    sb.append("    requestedExecutionDate: ").append(toIndentedString(requestedExecutionDate)).append("\n");
    sb.append("    transferCharges: ").append(toIndentedString(transferCharges)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

