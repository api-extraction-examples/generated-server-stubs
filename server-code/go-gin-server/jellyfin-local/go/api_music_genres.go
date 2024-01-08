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

type MusicGenresAPI struct {
}

// Get /MusicGenres/:genreName
// Gets a music genre, by name. 
func (api *MusicGenresAPI) GetMusicGenre(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /MusicGenres
// Gets all music genres from a given item, folder, or the entire library. 
// Deprecated
func (api *MusicGenresAPI) GetMusicGenres(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
