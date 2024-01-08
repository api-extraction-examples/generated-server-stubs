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

type AppMigrationAPI struct {
}

// Put /rest/atlassian-connect/1/migration/field
// Bulk update custom field value 
func (api *AppMigrationAPI) AppIssueFieldValueUpdateResourceUpdateIssueFieldsPut(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/atlassian-connect/1/migration/properties/:entityType
// Bulk update entity properties 
func (api *AppMigrationAPI) MigrationResourceUpdateEntityPropertiesValuePut(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /rest/atlassian-connect/1/migration/workflow/rule/search
// Get workflow transition rule configurations 
func (api *AppMigrationAPI) MigrationResourceWorkflowRuleSearchPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
