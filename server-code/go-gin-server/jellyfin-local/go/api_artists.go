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

type ArtistsAPI struct {
}

// Get /Artists/AlbumArtists
// Gets all album artists from a given item, folder, or the entire library. 
func (api *ArtistsAPI) GetAlbumArtists(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Artists/:name
// Gets an artist by name. 
func (api *ArtistsAPI) GetArtistByName(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Artists
// Gets all artists from a given item, folder, or the entire library. 
func (api *ArtistsAPI) GetArtists(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

