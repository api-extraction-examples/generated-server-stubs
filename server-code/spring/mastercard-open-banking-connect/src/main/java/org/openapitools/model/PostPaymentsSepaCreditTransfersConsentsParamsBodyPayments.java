package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAccount;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAddress;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAddress;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsInstructedAmount;
import org.openapitools.model.RequestPisSepaSchedule;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments
 */

@JsonTypeName("postPaymentsSepaCreditTransfersConsentsParamsBodyPayments")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments {

  /**
   * Purpose of the payment
   */
  public enum CategoryPurposeEnum {
    CASH("CASH"),
    
    CORT("CORT"),
    
    DVPM("DVPM"),
    
    INTC("INTC"),
    
    TREA("TREA");

    private String value;

    CategoryPurposeEnum(String value) {
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
    public static CategoryPurposeEnum fromValue(String value) {
      for (CategoryPurposeEnum b : CategoryPurposeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CategoryPurposeEnum categoryPurpose;

  private PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount;

  private PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAddress creditorAddress;

  private PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent creditorAgent;

  private String creditorName;

  private PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount debtorAccount;

  private PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAddress debtorAddress;

  private PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent debtorAgent;

  private String debtorName;

  private String endToEndIdentification;

  private PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount;

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
    SEPA("SEPA");

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

  private String remittanceInformationStructured;

  private String remittanceInformationUnstructured;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate requestedExecutionDate;

  private RequestPisSepaSchedule schedule;

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount, PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAddress creditorAddress, PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent creditorAgent, String creditorName, String debtorName, String endToEndIdentification, PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount, InstructionPriorityEnum instructionPriority, LocalInstrumentEnum localInstrument) {
    this.creditorAccount = creditorAccount;
    this.creditorAddress = creditorAddress;
    this.creditorAgent = creditorAgent;
    this.creditorName = creditorName;
    this.debtorName = debtorName;
    this.endToEndIdentification = endToEndIdentification;
    this.instructedAmount = instructedAmount;
    this.instructionPriority = instructionPriority;
    this.localInstrument = localInstrument;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments categoryPurpose(CategoryPurposeEnum categoryPurpose) {
    this.categoryPurpose = categoryPurpose;
    return this;
  }

  /**
   * Purpose of the payment
   * @return categoryPurpose
  */
  
  @Schema(name = "categoryPurpose", example = "CASH", description = "Purpose of the payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryPurpose")
  public CategoryPurposeEnum getCategoryPurpose() {
    return categoryPurpose;
  }

  public void setCategoryPurpose(CategoryPurposeEnum categoryPurpose) {
    this.categoryPurpose = categoryPurpose;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments creditorAccount(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount) {
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
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAccount getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments creditorAddress(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAddress creditorAddress) {
    this.creditorAddress = creditorAddress;
    return this;
  }

  /**
   * Get creditorAddress
   * @return creditorAddress
  */
  @NotNull @Valid 
  @Schema(name = "creditorAddress", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creditorAddress")
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAddress getCreditorAddress() {
    return creditorAddress;
  }

  public void setCreditorAddress(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAddress creditorAddress) {
    this.creditorAddress = creditorAddress;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments creditorAgent(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent creditorAgent) {
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
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments creditorName(String creditorName) {
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

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments debtorAccount(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount debtorAccount) {
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
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments debtorAddress(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAddress debtorAddress) {
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
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAddress getDebtorAddress() {
    return debtorAddress;
  }

  public void setDebtorAddress(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAddress debtorAddress) {
    this.debtorAddress = debtorAddress;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments debtorAgent(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent debtorAgent) {
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
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments debtorName(String debtorName) {
    this.debtorName = debtorName;
    return this;
  }

  /**
   * Debtor legal name
   * @return debtorName
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "debtorName", example = "NordPole PLC", description = "Debtor legal name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("debtorName")
  public String getDebtorName() {
    return debtorName;
  }

  public void setDebtorName(String debtorName) {
    this.debtorName = debtorName;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments endToEndIdentification(String endToEndIdentification) {
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

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments instructedAmount(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount) {
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
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments instructionPriority(InstructionPriorityEnum instructionPriority) {
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

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments localInstrument(LocalInstrumentEnum localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

  /**
   * User community specific instrument.
   * @return localInstrument
  */
  @NotNull 
  @Schema(name = "localInstrument", example = "SEPA", description = "User community specific instrument.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("localInstrument")
  public LocalInstrumentEnum getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(LocalInstrumentEnum localInstrument) {
    this.localInstrument = localInstrument;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments remittanceInformationReference(String remittanceInformationReference) {
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

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments remittanceInformationStructured(String remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
    return this;
  }

  /**
   * Description of the payment
   * @return remittanceInformationStructured
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "remittanceInformationStructured", example = "Payment for fruits from card 543210000023456", description = "Description of the payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remittanceInformationStructured")
  public String getRemittanceInformationStructured() {
    return remittanceInformationStructured;
  }

  public void setRemittanceInformationStructured(String remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments remittanceInformationUnstructured(String remittanceInformationUnstructured) {
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

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments requestedExecutionDate(LocalDate requestedExecutionDate) {
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

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments schedule(RequestPisSepaSchedule schedule) {
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
  public RequestPisSepaSchedule getSchedule() {
    return schedule;
  }

  public void setSchedule(RequestPisSepaSchedule schedule) {
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
    PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments postPaymentsSepaCreditTransfersConsentsParamsBodyPayments = (PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments) o;
    return Objects.equals(this.categoryPurpose, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.categoryPurpose) &&
        Objects.equals(this.creditorAccount, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.creditorAccount) &&
        Objects.equals(this.creditorAddress, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.creditorAddress) &&
        Objects.equals(this.creditorAgent, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.creditorAgent) &&
        Objects.equals(this.creditorName, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.creditorName) &&
        Objects.equals(this.debtorAccount, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.debtorAccount) &&
        Objects.equals(this.debtorAddress, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.debtorAddress) &&
        Objects.equals(this.debtorAgent, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.debtorAgent) &&
        Objects.equals(this.debtorName, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.debtorName) &&
        Objects.equals(this.endToEndIdentification, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.endToEndIdentification) &&
        Objects.equals(this.instructedAmount, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.instructedAmount) &&
        Objects.equals(this.instructionPriority, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.instructionPriority) &&
        Objects.equals(this.localInstrument, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.localInstrument) &&
        Objects.equals(this.remittanceInformationReference, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.remittanceInformationReference) &&
        Objects.equals(this.remittanceInformationStructured, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.remittanceInformationStructured) &&
        Objects.equals(this.remittanceInformationUnstructured, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.remittanceInformationUnstructured) &&
        Objects.equals(this.requestedExecutionDate, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.requestedExecutionDate) &&
        Objects.equals(this.schedule, postPaymentsSepaCreditTransfersConsentsParamsBodyPayments.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryPurpose, creditorAccount, creditorAddress, creditorAgent, creditorName, debtorAccount, debtorAddress, debtorAgent, debtorName, endToEndIdentification, instructedAmount, instructionPriority, localInstrument, remittanceInformationReference, remittanceInformationStructured, remittanceInformationUnstructured, requestedExecutionDate, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments {\n");
    sb.append("    categoryPurpose: ").append(toIndentedString(categoryPurpose)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    debtorAddress: ").append(toIndentedString(debtorAddress)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    remittanceInformationReference: ").append(toIndentedString(remittanceInformationReference)).append("\n");
    sb.append("    remittanceInformationStructured: ").append(toIndentedString(remittanceInformationStructured)).append("\n");
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

