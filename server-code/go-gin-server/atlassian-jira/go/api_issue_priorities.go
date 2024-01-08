/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type IssuePrioritiesAPI struct {
}

// Post /rest/api/3/priority
// Create priority 
func (api *IssuePrioritiesAPI) CreatePriority(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /rest/api/3/priority/:id
// Delete priority 
func (api *IssuePrioritiesAPI) DeletePriority(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/priority
// Get priorities 
// Deprecated
func (api *IssuePrioritiesAPI) GetPriorities(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/priority/:id
// Get priority 
func (api *IssuePrioritiesAPI) GetPriority(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/priority/move
// Move priorities 
func (api *IssuePrioritiesAPI) MovePriorities(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/priority/search
// Search priorities 
func (api *IssuePrioritiesAPI) SearchPriorities(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/priority/default
// Set default priority 
func (api *IssuePrioritiesAPI) SetDefaultPriority(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/priority/:id
// Update priority 
func (api *IssuePrioritiesAPI) UpdatePriority(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
