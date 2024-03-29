/*
 * COVID-19 data API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.2.6
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type TotalsAPI struct {
}

// Get /report/totals
// getDailyReportTotals 
func (api *TotalsAPI) GetDailyReportTotals(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /totals
// getLatestTotals 
func (api *TotalsAPI) GetLatestTotals(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

