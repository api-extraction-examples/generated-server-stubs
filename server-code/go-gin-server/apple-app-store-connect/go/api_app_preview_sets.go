/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type AppPreviewSetsAPI struct {
}

// Get /v1/appPreviewSets/:id/appPreviews
func (api *AppPreviewSetsAPI) AppPreviewSetsAppPreviewsGetToManyRelated(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/appPreviewSets/:id/relationships/appPreviews
func (api *AppPreviewSetsAPI) AppPreviewSetsAppPreviewsGetToManyRelationship(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Patch /v1/appPreviewSets/:id/relationships/appPreviews
func (api *AppPreviewSetsAPI) AppPreviewSetsAppPreviewsReplaceToManyRelationship(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/appPreviewSets
func (api *AppPreviewSetsAPI) AppPreviewSetsCreateInstance(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /v1/appPreviewSets/:id
func (api *AppPreviewSetsAPI) AppPreviewSetsDeleteInstance(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/appPreviewSets/:id
func (api *AppPreviewSetsAPI) AppPreviewSetsGetInstance(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

