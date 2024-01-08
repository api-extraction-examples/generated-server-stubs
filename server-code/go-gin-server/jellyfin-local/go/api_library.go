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

type LibraryAPI struct {
}

// Delete /Items/:itemId
// Deletes an item from the library and filesystem. 
func (api *LibraryAPI) DeleteItem(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /Items
// Deletes items from the library and filesystem. 
func (api *LibraryAPI) DeleteItems(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Items/:itemId/Ancestors
// Gets all parents of an item. 
func (api *LibraryAPI) GetAncestors(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Items/:itemId/CriticReviews
// Gets critic review for an item. 
// Deprecated
func (api *LibraryAPI) GetCriticReviews(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Items/:itemId/Download
// Downloads item media. 
func (api *LibraryAPI) GetDownload(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Items/:itemId/File
// Get the original file of an item. 
func (api *LibraryAPI) GetFile(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Items/Counts
// Get item counts. 
func (api *LibraryAPI) GetItemCounts(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Libraries/AvailableOptions
// Gets the library options info. 
func (api *LibraryAPI) GetLibraryOptionsInfo(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Library/MediaFolders
// Gets all user media folders. 
func (api *LibraryAPI) GetMediaFolders(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Library/PhysicalPaths
// Gets a list of physical paths from virtual folders. 
func (api *LibraryAPI) GetPhysicalPaths(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Albums/:itemId/Similar
// Gets similar items. 
func (api *LibraryAPI) GetSimilarAlbums(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Artists/:itemId/Similar
// Gets similar items. 
func (api *LibraryAPI) GetSimilarArtists(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Items/:itemId/Similar
// Gets similar items. 
func (api *LibraryAPI) GetSimilarItems(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Movies/:itemId/Similar
// Gets similar items. 
func (api *LibraryAPI) GetSimilarMovies(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Shows/:itemId/Similar
// Gets similar items. 
func (api *LibraryAPI) GetSimilarShows(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Trailers/:itemId/Similar
// Gets similar items. 
func (api *LibraryAPI) GetSimilarTrailers(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Items/:itemId/ThemeMedia
// Get theme songs and videos for an item. 
func (api *LibraryAPI) GetThemeMedia(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Items/:itemId/ThemeSongs
// Get theme songs for an item. 
func (api *LibraryAPI) GetThemeSongs(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Items/:itemId/ThemeVideos
// Get theme videos for an item. 
func (api *LibraryAPI) GetThemeVideos(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Library/Movies/Added
// Reports that new movies have been added by an external source. 
func (api *LibraryAPI) PostAddedMovies(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Library/Series/Added
// Reports that new episodes of a series have been added by an external source. 
func (api *LibraryAPI) PostAddedSeries(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Library/Media/Updated
// Reports that new movies have been added by an external source. 
func (api *LibraryAPI) PostUpdatedMedia(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Library/Movies/Updated
// Reports that new movies have been added by an external source. 
func (api *LibraryAPI) PostUpdatedMovies(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /Library/Series/Updated
// Reports that new episodes of a series have been added by an external source. 
func (api *LibraryAPI) PostUpdatedSeries(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /Library/Refresh
// Starts a library scan. 
func (api *LibraryAPI) RefreshLibrary(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
