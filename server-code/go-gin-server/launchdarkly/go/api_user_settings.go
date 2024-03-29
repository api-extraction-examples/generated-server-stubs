/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type UserSettingsAPI struct {
}

// Get /api/v2/users/:projectKey/:userKey/expiring-user-targets/:environmentKey
// Get expiring dates on flags for user 
func (api *UserSettingsAPI) GetExpiringUserTargetsForUser(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v2/users/:projectKey/:environmentKey/:userKey/flags/:featureFlagKey
// Fetch a single flag setting for a user by key. 
func (api *UserSettingsAPI) GetUserFlagSetting(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v2/users/:projectKey/:environmentKey/:userKey/flags
// Fetch a single flag setting for a user by key. 
func (api *UserSettingsAPI) GetUserFlagSettings(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Patch /api/v2/users/:projectKey/:userKey/expiring-user-targets/:environmentKey
// Update, add, or delete expiring user targets for a single user on all flags 
func (api *UserSettingsAPI) PatchExpiringUserTargetsForFlags(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /api/v2/users/:projectKey/:environmentKey/:userKey/flags/:featureFlagKey
// Specifically enable or disable a feature flag for a user based on their key. 
func (api *UserSettingsAPI) PutFlagSetting(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

