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

type RelayProxyConfigurationsAPI struct {
}

// Delete /api/v2/account/relay-auto-configs/:id
// Delete a relay proxy configuration by ID. 
func (api *RelayProxyConfigurationsAPI) DeleteRelayProxyConfig(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v2/account/relay-auto-configs/:id
// Get a single relay proxy configuration by ID. 
func (api *RelayProxyConfigurationsAPI) GetRelayProxyConfig(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v2/account/relay-auto-configs
// Returns a list of relay proxy configurations in the account. 
func (api *RelayProxyConfigurationsAPI) GetRelayProxyConfigs(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Patch /api/v2/account/relay-auto-configs/:id
// Modify a relay proxy configuration by ID. 
func (api *RelayProxyConfigurationsAPI) PatchRelayProxyConfig(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v2/account/relay-auto-configs
// Create a new relay proxy config. 
func (api *RelayProxyConfigurationsAPI) PostRelayAutoConfig(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v2/account/relay-auto-configs/:id/reset
// Reset a relay proxy configuration's secret key with an optional expiry time for the old key. 
func (api *RelayProxyConfigurationsAPI) ResetRelayProxyConfig(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

