/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * API version: v1
 * Contact: softwareengineering@parliament.uk
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type BillsAPI struct {
}

// Get /api/v1/Bills/:billId/Stages
// Returns all Bill stages. 
func (api *BillsAPI) ApiV1BillsBillIdStagesGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/Bills/:billId
// Return a Bill. 
func (api *BillsAPI) GetBill(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/Bills/:billId/Stages/:billStageId
// Returns a Bill stage. 
func (api *BillsAPI) GetBillStageDetails(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/Bills
// Returns a list of Bills. 
func (api *BillsAPI) GetBills(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

