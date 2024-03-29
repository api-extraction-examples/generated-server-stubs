/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * API version: 1.16.0
 * Contact: apisupport@mastercard.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments struct {

	CreditorAccount PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount `json:"creditorAccount"`

	CreditorAddress PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAddress `json:"creditorAddress,omitempty"`

	CreditorAgent PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent `json:"creditorAgent,omitempty"`

	// Bank name
	CreditorName string `json:"creditorName"`

	DebtorAccount PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount `json:"debtorAccount,omitempty"`

	DebtorAgent PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent `json:"debtorAgent,omitempty"`

	// Payment end to end identification
	EndToEndIdentification string `json:"endToEndIdentification"`

	InstructedAmount PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount `json:"instructedAmount"`

	// Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. If API profile of ASPSP is CMA9, then field is mandatory.
	InstructionIdentification string `json:"instructionIdentification,omitempty"`

	// Indicator of the urgency or order of importance
	InstructionPriority string `json:"instructionPriority,omitempty"`

	// User community specific instrument.
	LocalInstrument string `json:"localInstrument"`

	// Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. (future use)
	RemittanceInformationReference string `json:"remittanceInformationReference,omitempty"`

	// Description of the payment
	RemittanceInformationUnstructured string `json:"remittanceInformationUnstructured,omitempty"`

	// Scheduled Payment Date
	RequestedExecutionDate string `json:"requestedExecutionDate,omitempty"`

	Schedule RequestPisDomesticSchedule `json:"schedule,omitempty"`
}

// AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsRequired checks if the required fields are not zero-ed
func AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsRequired(obj PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments) error {
	elements := map[string]interface{}{
		"creditorAccount": obj.CreditorAccount,
		"creditorName": obj.CreditorName,
		"endToEndIdentification": obj.EndToEndIdentification,
		"instructedAmount": obj.InstructedAmount,
		"localInstrument": obj.LocalInstrument,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccountRequired(obj.CreditorAccount); err != nil {
		return err
	}
	if err := AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAddressRequired(obj.CreditorAddress); err != nil {
		return err
	}
	if err := AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgentRequired(obj.CreditorAgent); err != nil {
		return err
	}
	if err := AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccountRequired(obj.DebtorAccount); err != nil {
		return err
	}
	if err := AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgentRequired(obj.DebtorAgent); err != nil {
		return err
	}
	if err := AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmountRequired(obj.InstructedAmount); err != nil {
		return err
	}
	if err := AssertRequestPisDomesticScheduleRequired(obj.Schedule); err != nil {
		return err
	}
	return nil
}

// AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsConstraints checks if the values respects the defined constraints
func AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsConstraints(obj PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments) error {
	return nil
}
