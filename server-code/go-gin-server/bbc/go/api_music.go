/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type MusicAPI struct {
}

// Delete /my/music/favourites/:type/:id
// Favourite Track or Clip 
func (api *MusicAPI) DeletePersonalisedMusicFavouritesByTypeById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /my/music/follows/:type/:id
// Followed Network, Category, Artist, Playlist and Genre 
func (api *MusicAPI) DeletePersonalisedMusicFollowsByTypeById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /music/popular/artists/:id
// Single Artist Popularity 
func (api *MusicAPI) GetMusicPopularArtistById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /music/popular/artists
// Popular Artists 
func (api *MusicAPI) GetMusicPopularArtists(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /music/popular/playlists/:id
// Single Playlist Popularity 
func (api *MusicAPI) GetMusicPopularPlaylistById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /music/popular/playlists
// Popular Playlists 
func (api *MusicAPI) GetMusicPopularPlaylists(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /music/popular/tracks/:id
// Single Track Popularity 
func (api *MusicAPI) GetMusicPopularTrackById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /music/popular/tracks
// Popular Tracks 
func (api *MusicAPI) GetMusicPopularTracks(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /my/music/favourites
// Favourite Tracks or Clips 
func (api *MusicAPI) GetPersonalisedMusicFavourites(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /my/music/favourites/:type
// Favourite Tracks or Clips by Type 
func (api *MusicAPI) GetPersonalisedMusicFavouritesByType(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /my/music/favourites/:type/:id
// Favourite Track or Clip 
func (api *MusicAPI) GetPersonalisedMusicFavouritesByTypeById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /my/music/follows
// Followed Networks, Categories, Artists, Playlists and Genres 
func (api *MusicAPI) GetPersonalisedMusicFollows(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /my/music/follows/:type
// Followed Networks, Categories, Artists, Playlists and Genres by Type 
func (api *MusicAPI) GetPersonalisedMusicFollowsByType(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /my/music/follows/:type/:id
// Followed Network, Category, Artist, Playlist and Genre 
func (api *MusicAPI) GetPersonalisedMusicFollowsByTypeById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /my/music/favourites
// Favourite Tracks or Clips 
func (api *MusicAPI) PostPersonalisedMusicFavouritesBatch(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /my/music/favourites/:type/:id
// Favourite Track or Clip 
func (api *MusicAPI) PostPersonalisedMusicFavouritesByTypeById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /my/music/follows
// Followed Networks, Categories, Artists, Playlists and Genres 
func (api *MusicAPI) PostPersonalisedMusicFollowsBatch(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /my/music/follows/:type/:id
// Followed Network, Category, Artist, Playlist and Genre 
func (api *MusicAPI) PostPersonalisedMusicFollowsByTypeById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /my/music/favourites
// Favourite Tracks or Clips 
func (api *MusicAPI) PutPersonalisedMusicFavouritesBatch(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /my/music/favourites/:type/:id
// Favourite Track or Clip 
func (api *MusicAPI) PutPersonalisedMusicFavouritesByTypeById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /my/music/follows
// Followed Networks, Categories, Artists, Playlists and Genres 
func (api *MusicAPI) PutPersonalisedMusicFollowsBatch(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /my/music/follows/:type/:id
// Followed Network, Category, Artist, Playlist and Genre 
func (api *MusicAPI) PutPersonalisedMusicFollowsByTypeById(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

