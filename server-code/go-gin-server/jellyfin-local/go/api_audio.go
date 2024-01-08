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

type AudioAPI struct {
}

// Get /Audio/:itemId/stream
// Gets an audio stream. 
func (api *AudioAPI) GetAudioStream(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Audio/:itemId/stream.:container
// Gets an audio stream. 
func (api *AudioAPI) GetAudioStreamByContainer(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Head /Audio/:itemId/stream
// Gets an audio stream. 
func (api *AudioAPI) HeadAudioStream(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Head /Audio/:itemId/stream.:container
// Gets an audio stream. 
func (api *AudioAPI) HeadAudioStreamByContainer(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

