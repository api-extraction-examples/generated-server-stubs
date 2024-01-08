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

type ProjectKeyAndNameValidationAPI struct {
}

// Get /rest/api/3/projectvalidate/validProjectKey
// Get valid project key 
func (api *ProjectKeyAndNameValidationAPI) GetValidProjectKey(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/projectvalidate/validProjectName
// Get valid project name 
func (api *ProjectKeyAndNameValidationAPI) GetValidProjectName(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/projectvalidate/key
// Validate project key 
func (api *ProjectKeyAndNameValidationAPI) ValidateProjectKey(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

