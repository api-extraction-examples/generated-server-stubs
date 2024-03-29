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

type WorkspaceMembershipsAPI struct {
}

// Get /api/1.0/workspace_memberships/:workspace_membership_gid
// Get a workspace membership 
func (api *WorkspaceMembershipsAPI) GetWorkspaceMembership(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/users/:user_gid/workspace_memberships
// Get workspace memberships for a user 
func (api *WorkspaceMembershipsAPI) GetWorkspaceMembershipsForUser(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/workspaces/:workspace_gid/workspace_memberships
// Get the workspace memberships for a workspace 
func (api *WorkspaceMembershipsAPI) GetWorkspaceMembershipsForWorkspace(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

