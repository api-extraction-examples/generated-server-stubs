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

type ReturnPolicyAPI struct {
}

// Post /sell/account/v1/return_policy
func (api *ReturnPolicyAPI) CreateReturnPolicy(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /sell/account/v1/return_policy/:return_policy_id
func (api *ReturnPolicyAPI) DeleteReturnPolicy(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /sell/account/v1/return_policy
func (api *ReturnPolicyAPI) GetReturnPolicies(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /sell/account/v1/return_policy/:return_policy_id
func (api *ReturnPolicyAPI) GetReturnPolicy(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /sell/account/v1/return_policy/get_by_policy_name
func (api *ReturnPolicyAPI) GetReturnPolicyByName(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /sell/account/v1/return_policy/:return_policy_id
func (api *ReturnPolicyAPI) UpdateReturnPolicy(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

