/*
 * 1Password Connect
 *
 * REST API interface for 1Password Connect.
 *
 * API version: 1.5.7
 * Contact: support@1password.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type VaultsAPI struct {
}

// Get /vaults/:vaultUuid
// Get Vault details and metadata 
func (api *VaultsAPI) GetVaultById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /vaults
// Get all Vaults 
func (api *VaultsAPI) GetVaults(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
