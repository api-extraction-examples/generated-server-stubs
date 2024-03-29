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

type ProjectTemplatesAPI struct {
}

// Get /api/1.0/project_templates/:project_template_gid
// Get a project template 
func (api *ProjectTemplatesAPI) GetProjectTemplate(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/project_templates
// Get multiple project templates 
func (api *ProjectTemplatesAPI) GetProjectTemplates(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/teams/:team_gid/project_templates
// Get a team's project templates 
func (api *ProjectTemplatesAPI) GetProjectTemplatesForTeam(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/project_templates/:project_template_gid/instantiateProject
// Instantiate a project from a project template 
func (api *ProjectTemplatesAPI) InstantiateProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

