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

type TagsAPI struct {
}

// Post /api/1.0/tags
// Create a tag 
func (api *TagsAPI) CreateTag(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/workspaces/:workspace_gid/tags
// Create a tag in a workspace 
func (api *TagsAPI) CreateTagForWorkspace(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/1.0/tags/:tag_gid
// Delete a tag 
func (api *TagsAPI) DeleteTag(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/tags/:tag_gid
// Get a tag 
func (api *TagsAPI) GetTag(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/tags
// Get multiple tags 
func (api *TagsAPI) GetTags(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/tasks/:task_gid/tags
// Get a task's tags 
func (api *TagsAPI) GetTagsForTask(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/workspaces/:workspace_gid/tags
// Get tags in a workspace 
func (api *TagsAPI) GetTagsForWorkspace(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /api/1.0/tags/:tag_gid
// Update a tag 
func (api *TagsAPI) UpdateTag(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

