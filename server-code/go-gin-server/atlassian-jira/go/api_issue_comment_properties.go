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

type IssueCommentPropertiesAPI struct {
}

// Delete /rest/api/3/comment/:commentId/properties/:propertyKey
// Delete comment property 
func (api *IssueCommentPropertiesAPI) DeleteCommentProperty(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/comment/:commentId/properties/:propertyKey
// Get comment property 
func (api *IssueCommentPropertiesAPI) GetCommentProperty(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/comment/:commentId/properties
// Get comment property keys 
func (api *IssueCommentPropertiesAPI) GetCommentPropertyKeys(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/comment/:commentId/properties/:propertyKey
// Set comment property 
func (api *IssueCommentPropertiesAPI) SetCommentProperty(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

