/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type CustomFieldSettingsAPI struct {
}

// Get /api/1.0/portfolios/:portfolio_gid/custom_field_settings
// Get a portfolio's custom fields 
func (api *CustomFieldSettingsAPI) GetCustomFieldSettingsForPortfolio(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/projects/:project_gid/custom_field_settings
// Get a project's custom fields 
func (api *CustomFieldSettingsAPI) GetCustomFieldSettingsForProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

