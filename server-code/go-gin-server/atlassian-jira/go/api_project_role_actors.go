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

type ProjectRoleActorsAPI struct {
}

// Post /rest/api/3/project/:projectIdOrKey/role/:id
// Add actors to project role 
func (api *ProjectRoleActorsAPI) AddActorUsers(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /rest/api/3/role/:id/actors
// Add default actors to project role 
func (api *ProjectRoleActorsAPI) AddProjectRoleActorsToRole(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /rest/api/3/project/:projectIdOrKey/role/:id
// Delete actors from project role 
func (api *ProjectRoleActorsAPI) DeleteActor(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /rest/api/3/role/:id/actors
// Delete default actors from project role 
func (api *ProjectRoleActorsAPI) DeleteProjectRoleActorsFromRole(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/role/:id/actors
// Get default actors for project role 
func (api *ProjectRoleActorsAPI) GetProjectRoleActorsForRole(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/project/:projectIdOrKey/role/:id
// Set actors for project role 
func (api *ProjectRoleActorsAPI) SetActors(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
