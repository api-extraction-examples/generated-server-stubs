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

type DomesticPaymentsAPI struct {
}

// Post /openbanking/sandbox/connect/api/payments/domestic-credit-transfers
// Redeem the payment 
func (api *DomesticPaymentsAPI) PaymentsDomesticCreditTransfersPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

