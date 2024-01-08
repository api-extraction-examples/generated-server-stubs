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

type ItemsAPI struct {
}

// Get /Items
// Gets items based on a query. 
func (api *ItemsAPI) GetItems(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Users/:userId/Items
// Gets items based on a query. 
func (api *ItemsAPI) GetItemsByUserId(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Users/:userId/Items/Resume
// Gets items based on a query. 
func (api *ItemsAPI) GetResumeItems(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
