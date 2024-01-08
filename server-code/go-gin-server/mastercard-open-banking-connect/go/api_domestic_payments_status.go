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

import (
	"github.com/gin-gonic/gin"
)

type DomesticPaymentsStatusAPI struct {
}

// Post /openbanking/sandbox/connect/api/payments/domestic-credit-transfers/payment-status
// Get payment status 
func (api *DomesticPaymentsStatusAPI) PaymentsDomesticCreditTransfersPaymentStatusPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
