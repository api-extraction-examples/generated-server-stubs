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

type PublicationsAPI struct {
}

// Get /api/v1/Bills/:billId/Stages/:stageId/Publications
// Return a list of Bill stage publications. 
func (api *PublicationsAPI) ApiV1BillsBillIdStagesStageIdPublicationsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/Bills/:billId/Publications
// Return a list of Bill publications. 
func (api *PublicationsAPI) GetBillPublication(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

