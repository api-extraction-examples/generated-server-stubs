/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type SalesTaxAPI struct {
}

// Put /sell/account/v1/sales_tax/:countryCode/:jurisdictionId
func (api *SalesTaxAPI) CreateOrReplaceSalesTax(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /sell/account/v1/sales_tax/:countryCode/:jurisdictionId
func (api *SalesTaxAPI) DeleteSalesTax(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /sell/account/v1/sales_tax/:countryCode/:jurisdictionId
func (api *SalesTaxAPI) GetSalesTax(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /sell/account/v1/sales_tax
func (api *SalesTaxAPI) GetSalesTaxes(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
