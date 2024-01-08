/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type ApiKeyAPI struct {
}

// Post /Auth/Keys
// Create a new api key. 
func (api *ApiKeyAPI) CreateKey(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Auth/Keys
// Get all keys. 
func (api *ApiKeyAPI) GetKeys(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /Auth/Keys/:key
// Remove an api key. 
func (api *ApiKeyAPI) RevokeKey(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
