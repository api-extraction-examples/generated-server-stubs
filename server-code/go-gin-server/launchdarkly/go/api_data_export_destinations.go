/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type DataExportDestinationsAPI struct {
}

// Delete /api/v2/destinations/:projectKey/:environmentKey/:destinationId
// Get a single data export destination by ID 
func (api *DataExportDestinationsAPI) DeleteDestination(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v2/destinations/:projectKey/:environmentKey/:destinationId
// Get a single data export destination by ID 
func (api *DataExportDestinationsAPI) GetDestination(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v2/destinations
// Returns a list of all data export destinations. 
func (api *DataExportDestinationsAPI) GetDestinations(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Patch /api/v2/destinations/:projectKey/:environmentKey/:destinationId
// Perform a partial update to a data export destination. 
func (api *DataExportDestinationsAPI) PatchDestination(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v2/destinations/:projectKey/:environmentKey
// Create a new data export destination 
func (api *DataExportDestinationsAPI) PostDestination(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

