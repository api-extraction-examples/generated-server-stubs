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

type FilterAPI struct {
}

// Get /Items/Filters2
// Gets query filters. 
func (api *FilterAPI) GetQueryFilters(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Items/Filters
// Gets legacy query filters. 
func (api *FilterAPI) GetQueryFiltersLegacy(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

