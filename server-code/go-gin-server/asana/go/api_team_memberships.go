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

type TeamMembershipsAPI struct {
}

// Get /api/1.0/team_memberships/:team_membership_gid
// Get a team membership 
func (api *TeamMembershipsAPI) GetTeamMembership(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/team_memberships
// Get team memberships 
func (api *TeamMembershipsAPI) GetTeamMemberships(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/teams/:team_gid/team_memberships
// Get memberships from a team 
func (api *TeamMembershipsAPI) GetTeamMembershipsForTeam(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/users/:user_gid/team_memberships
// Get memberships from a user 
func (api *TeamMembershipsAPI) GetTeamMembershipsForUser(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
