package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAddress;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount;
import org.openapitools.model.RequestPisDomesticSchedule;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments
 */

@JsonTypeName("postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments {

  private PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount;

  private PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAddress creditorAddress;

  private PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent creditorAgent;

  private String creditorName;

  private PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount debtorAccount;

  private PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent debtorAgent;

  private String endToEndIdentification;

  private PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount;

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
    UK_FASTERPAYMENTS("UK.FasterPayments"),
    
    PL_ELIXIR("PL.Elixir");

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

  private RequestPisDomesticSchedule schedule;

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount, String creditorName, String endToEndIdentification, PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount, LocalInstrumentEnum localInstrument) {
    this.creditorAccount = creditorAccount;
    this.creditorName = creditorName;
    this.endToEndIdentification = endToEndIdentification;
    this.instructedAmount = instructedAmount;
    this.localInstrument = localInstrument;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments creditorAccount(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount) {
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
  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments creditorAddress(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAddress creditorAddress) {
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
  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAddress getCreditorAddress() {
    return creditorAddress;
  }

  public void setCreditorAddress(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAddress creditorAddress) {
    this.creditorAddress = creditorAddress;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments creditorAgent(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
  */
  @Valid 
  @Schema(name = "creditorAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditorAgent")
  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments creditorName(String creditorName) {
    this.creditorName = creditorName;
    return this;
  }

  /**
   * Bank name
   * @return creditorName
  */
  @NotNull @Size(min = 1, max = 70) 
  @Schema(name = "creditorName", example = "Wood bank", description = "Bank name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creditorName")
  public String getCreditorName() {
    return creditorName;
  }

  public void setCreditorName(String creditorName) {
    this.creditorName = creditorName;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments debtorAccount(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  */
  @Valid 
  @Schema(name = "debtorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debtorAccount")
  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments debtorAgent(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

  /**
   * Get debtorAgent
   * @return debtorAgent
  */
  @Valid 
  @Schema(name = "debtorAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debtorAgent")
  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments endToEndIdentification(String endToEndIdentification) {
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

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments instructedAmount(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount) {
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
  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments instructionIdentification(String instructionIdentification) {
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

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments instructionPriority(InstructionPriorityEnum instructionPriority) {
    this.instructionPriority = instructionPriority;
    return this;
  }

  /**
   * Indicator of the urgency or order of importance
   * @return instructionPriority
  */
  
  @Schema(name = "instructionPriority", example = "", description = "Indicator of the urgency or order of importance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instructionPriority")
  public InstructionPriorityEnum getInstructionPriority() {
    return instructionPriority;
  }

  public void setInstructionPriority(InstructionPriorityEnum instructionPriority) {
    this.instructionPriority = instructionPriority;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments localInstrument(LocalInstrumentEnum localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

  /**
   * User community specific instrument.
   * @return localInstrument
  */
  @NotNull 
  @Schema(name = "localInstrument", example = "UK.FasterPayments", description = "User community specific instrument.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("localInstrument")
  public LocalInstrumentEnum getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(LocalInstrumentEnum localInstrument) {
    this.localInstrument = localInstrument;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments remittanceInformationReference(String remittanceInformationReference) {
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

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments remittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
    return this;
  }

  /**
   * Description of the payment
   * @return remittanceInformationUnstructured
  */
  @Size(min = 1, max = 140) 
  @Schema(name = "remittanceInformationUnstructured", example = "Payment for fruits", description = "Description of the payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remittanceInformationUnstructured")
  public String getRemittanceInformationUnstructured() {
    return remittanceInformationUnstructured;
  }

  public void setRemittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments requestedExecutionDate(LocalDate requestedExecutionDate) {
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

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments schedule(RequestPisDomesticSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @Valid 
  @Schema(name = "schedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule")
  public RequestPisDomesticSchedule getSchedule() {
    return schedule;
  }

  public void setSchedule(RequestPisDomesticSchedule schedule) {
    this.schedule = schedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments = (PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments) o;
    return Objects.equals(this.creditorAccount, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.creditorAccount) &&
        Objects.equals(this.creditorAddress, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.creditorAddress) &&
        Objects.equals(this.creditorAgent, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.creditorAgent) &&
        Objects.equals(this.creditorName, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.creditorName) &&
        Objects.equals(this.debtorAccount, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.debtorAccount) &&
        Objects.equals(this.debtorAgent, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.debtorAgent) &&
        Objects.equals(this.endToEndIdentification, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.endToEndIdentification) &&
        Objects.equals(this.instructedAmount, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.instructedAmount) &&
        Objects.equals(this.instructionIdentification, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.instructionIdentification) &&
        Objects.equals(this.instructionPriority, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.instructionPriority) &&
        Objects.equals(this.localInstrument, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.localInstrument) &&
        Objects.equals(this.remittanceInformationReference, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.remittanceInformationReference) &&
        Objects.equals(this.remittanceInformationUnstructured, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.remittanceInformationUnstructured) &&
        Objects.equals(this.requestedExecutionDate, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.requestedExecutionDate) &&
        Objects.equals(this.schedule, postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditorAccount, creditorAddress, creditorAgent, creditorName, debtorAccount, debtorAgent, endToEndIdentification, instructedAmount, instructionIdentification, instructionPriority, localInstrument, remittanceInformationReference, remittanceInformationUnstructured, requestedExecutionDate, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments {\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    remittanceInformationReference: ").append(toIndentedString(remittanceInformationReference)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
    sb.append("    requestedExecutionDate: ").append(toIndentedString(requestedExecutionDate)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

