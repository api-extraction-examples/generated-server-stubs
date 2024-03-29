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

type SectionsAPI struct {
}

// Post /api/1.0/sections/:section_gid/addTask
// Add task to section 
func (api *SectionsAPI) AddTaskForSection(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/projects/:project_gid/sections
// Create a section in a project 
func (api *SectionsAPI) CreateSectionForProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/1.0/sections/:section_gid
// Delete a section 
func (api *SectionsAPI) DeleteSection(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/sections/:section_gid
// Get a section 
func (api *SectionsAPI) GetSection(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/projects/:project_gid/sections
// Get sections in a project 
func (api *SectionsAPI) GetSectionsForProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/projects/:project_gid/sections/insert
// Move or Insert sections 
func (api *SectionsAPI) InsertSectionForProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /api/1.0/sections/:section_gid
// Update a section 
func (api *SectionsAPI) UpdateSection(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

