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

type FilesAPI struct {
}

// Get /vaults/:vaultUuid/items/:itemUuid/files/:fileUuid/content
// Get the content of a File 
func (api *FilesAPI) DownloadFileByID(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /vaults/:vaultUuid/items/:itemUuid/files/:fileUuid
// Get the details of a File 
func (api *FilesAPI) GetDetailsOfFileById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /vaults/:vaultUuid/items/:itemUuid/files
// Get all the files inside an Item 
func (api *FilesAPI) GetItemFiles(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
