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

type PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent struct {

	// Agent identification
	Identification string `json:"identification"`

	// Scheme for the agent/bank identification
	SchemeName string `json:"schemeName"`
}
