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

type AttachmentsAPI struct {
}

// Post /api/1.0/attachments
// Upload an attachment 
func (api *AttachmentsAPI) CreateAttachmentForObject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/1.0/attachments/:attachment_gid
// Delete an attachment 
func (api *AttachmentsAPI) DeleteAttachment(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/attachments/:attachment_gid
// Get an attachment 
func (api *AttachmentsAPI) GetAttachment(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/attachments
// Get attachments from an object 
func (api *AttachmentsAPI) GetAttachmentsForObject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

