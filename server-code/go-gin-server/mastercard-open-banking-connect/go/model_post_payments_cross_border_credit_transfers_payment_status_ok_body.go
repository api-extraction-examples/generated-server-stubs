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

type PostPaymentsCrossBorderCreditTransfersPaymentStatusOkBody struct {

	OriginalRequestInfo PostPaymentsCrossBorderCreditTransfersPaymentStatusOkBodyOriginalRequestInfo `json:"originalRequestInfo"`

	Payments PostPaymentsCrossBorderCreditTransfersPaymentStatusOkBodyPayments `json:"payments,omitempty"`
}