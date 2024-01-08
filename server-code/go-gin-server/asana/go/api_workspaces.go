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

type WorkspacesAPI struct {
}

// Post /api/1.0/workspaces/:workspace_gid/addUser
// Add a user to a workspace or organization 
func (api *WorkspacesAPI) AddUserForWorkspace(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/workspaces/:workspace_gid
// Get a workspace 
func (api *WorkspacesAPI) GetWorkspace(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/workspaces
// Get multiple workspaces 
func (api *WorkspacesAPI) GetWorkspaces(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/workspaces/:workspace_gid/removeUser
// Remove a user from a workspace or organization 
func (api *WorkspacesAPI) RemoveUserForWorkspace(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /api/1.0/workspaces/:workspace_gid
// Update a workspace 
func (api *WorkspacesAPI) UpdateWorkspace(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
