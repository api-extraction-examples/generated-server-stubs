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

type BundleIdsAPI struct {
}

// Get /v1/bundleIds/:id/app
func (api *BundleIdsAPI) BundleIdsAppGetToOneRelated(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/bundleIds/:id/bundleIdCapabilities
func (api *BundleIdsAPI) BundleIdsBundleIdCapabilitiesGetToManyRelated(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/bundleIds
func (api *BundleIdsAPI) BundleIdsCreateInstance(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /v1/bundleIds/:id
func (api *BundleIdsAPI) BundleIdsDeleteInstance(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/bundleIds
func (api *BundleIdsAPI) BundleIdsGetCollection(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/bundleIds/:id
func (api *BundleIdsAPI) BundleIdsGetInstance(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/bundleIds/:id/profiles
func (api *BundleIdsAPI) BundleIdsProfilesGetToManyRelated(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Patch /v1/bundleIds/:id
func (api *BundleIdsAPI) BundleIdsUpdateInstance(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
