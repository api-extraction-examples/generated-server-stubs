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

type BuildBetaDetailsAPI struct {
}

// Get /v1/buildBetaDetails/:id/build
func (api *BuildBetaDetailsAPI) BuildBetaDetailsBuildGetToOneRelated(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/buildBetaDetails
func (api *BuildBetaDetailsAPI) BuildBetaDetailsGetCollection(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/buildBetaDetails/:id
func (api *BuildBetaDetailsAPI) BuildBetaDetailsGetInstance(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Patch /v1/buildBetaDetails/:id
func (api *BuildBetaDetailsAPI) BuildBetaDetailsUpdateInstance(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

