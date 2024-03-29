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

type PostPaymentsDomesticCreditTransfersPaymentStatusOkBodyPayments struct {

	// Rejection reson code
	StatusReasonCode string `json:"statusReasonCode,omitempty"`

	// Payment transaction status
	TransactionStatus string `json:"transactionStatus"`
}
