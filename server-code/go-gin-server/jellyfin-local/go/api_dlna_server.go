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

type DlnaServerAPI struct {
}

// Get /Dlna/:serverId/ConnectionManager
// Gets Dlna media receiver registrar xml. 
func (api *DlnaServerAPI) GetConnectionManager(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/:serverId/ConnectionManager/ConnectionManager
// Gets Dlna media receiver registrar xml. 
func (api *DlnaServerAPI) GetConnectionManager2(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/:serverId/ConnectionManager/ConnectionManager.xml
// Gets Dlna media receiver registrar xml. 
func (api *DlnaServerAPI) GetConnectionManager3(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/:serverId/ContentDirectory
// Gets Dlna content directory xml. 
func (api *DlnaServerAPI) GetContentDirectory(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/:serverId/ContentDirectory/ContentDirectory
// Gets Dlna content directory xml. 
func (api *DlnaServerAPI) GetContentDirectory2(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/:serverId/ContentDirectory/ContentDirectory.xml
// Gets Dlna content directory xml. 
func (api *DlnaServerAPI) GetContentDirectory3(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/:serverId/description
// Get Description Xml. 
func (api *DlnaServerAPI) GetDescriptionXml(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/:serverId/description.xml
// Get Description Xml. 
func (api *DlnaServerAPI) GetDescriptionXml2(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/icons/:fileName
// Gets a server icon. 
func (api *DlnaServerAPI) GetIcon(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/:serverId/icons/:fileName
// Gets a server icon. 
func (api *DlnaServerAPI) GetIconId(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/:serverId/MediaReceiverRegistrar
// Gets Dlna media receiver registrar xml. 
func (api *DlnaServerAPI) GetMediaReceiverRegistrar(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/:serverId/MediaReceiverRegistrar/MediaReceiverRegistrar
// Gets Dlna media receiver registrar xml. 
func (api *DlnaServerAPI) GetMediaReceiverRegistrar2(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Dlna/:serverId/MediaReceiverRegistrar/MediaReceiverRegistrar.xml
// Gets Dlna media receiver registrar xml. 
func (api *DlnaServerAPI) GetMediaReceiverRegistrar3(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Dlna/:serverId/ConnectionManager/Control
// Process a connection manager control request. 
func (api *DlnaServerAPI) ProcessConnectionManagerControlRequest(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Dlna/:serverId/ContentDirectory/Control
// Process a content directory control request. 
func (api *DlnaServerAPI) ProcessContentDirectoryControlRequest(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Dlna/:serverId/MediaReceiverRegistrar/Control
// Process a media receiver registrar control request. 
func (api *DlnaServerAPI) ProcessMediaReceiverRegistrarControlRequest(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
