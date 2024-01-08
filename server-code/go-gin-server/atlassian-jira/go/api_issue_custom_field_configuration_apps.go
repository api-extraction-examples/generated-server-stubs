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

type IssueCustomFieldConfigurationAppsAPI struct {
}

// Get /rest/api/3/app/field/:fieldIdOrKey/context/configuration
// Get custom field configurations 
func (api *IssueCustomFieldConfigurationAppsAPI) GetCustomFieldConfiguration(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/app/field/:fieldIdOrKey/context/configuration
// Update custom field configurations 
func (api *IssueCustomFieldConfigurationAppsAPI) UpdateCustomFieldConfiguration(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
