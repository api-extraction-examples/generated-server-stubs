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

type LibraryStructureAPI struct {
}

// Post /Library/VirtualFolders/Paths
// Add a media path to a library. 
func (api *LibraryStructureAPI) AddMediaPath(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Library/VirtualFolders
// Adds a virtual folder. 
func (api *LibraryStructureAPI) AddVirtualFolder(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Library/VirtualFolders
// Gets all virtual folders. 
func (api *LibraryStructureAPI) GetVirtualFolders(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /Library/VirtualFolders/Paths
// Remove a media path. 
func (api *LibraryStructureAPI) RemoveMediaPath(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /Library/VirtualFolders
// Removes a virtual folder. 
func (api *LibraryStructureAPI) RemoveVirtualFolder(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Library/VirtualFolders/Name
// Renames a virtual folder. 
func (api *LibraryStructureAPI) RenameVirtualFolder(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Library/VirtualFolders/LibraryOptions
// Update library options. 
func (api *LibraryStructureAPI) UpdateLibraryOptions(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Library/VirtualFolders/Paths/Update
// Updates a media path. 
func (api *LibraryStructureAPI) UpdateMediaPath(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

