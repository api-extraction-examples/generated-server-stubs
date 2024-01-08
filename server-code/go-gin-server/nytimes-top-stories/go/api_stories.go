/*
 * Top Stories
 *
 * The Top Stories API provides lists of articles and associated images by section.
 *
 * API version: 2.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type StoriesAPI struct {
}

// Get /svc/topstories/v2/:section.:format
// Top Stories 
func (api *StoriesAPI) SectionFormatGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

