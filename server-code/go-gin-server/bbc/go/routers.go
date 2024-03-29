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
	"net/http"

	"github.com/gin-gonic/gin"
)

// Route is the information for every URI.
type Route struct {
	// Name is the name of this Route.
	Name		string
	// Method is the string for the HTTP method. ex) GET, POST etc..
	Method		string
	// Pattern is the pattern of the URI.
	Pattern	 	string
	// HandlerFunc is the handler function of this route.
	HandlerFunc	gin.HandlerFunc
}

// NewRouter returns a new router.
func NewRouter(handleFunctions ApiHandleFunctions) *gin.Engine {
	router := gin.Default()
	for _, route := range getRoutes(handleFunctions) {
		if route.HandlerFunc == nil {
			route.HandlerFunc = DefaultHandleFunc
		}
		switch route.Method {
		case http.MethodGet:
			router.GET(route.Pattern, route.HandlerFunc)
		case http.MethodPost:
			router.POST(route.Pattern, route.HandlerFunc)
		case http.MethodPut:
			router.PUT(route.Pattern, route.HandlerFunc)
		case http.MethodPatch:
			router.PATCH(route.Pattern, route.HandlerFunc)
		case http.MethodDelete:
			router.DELETE(route.Pattern, route.HandlerFunc)
		}
	}

	return router
}

// Default handler for not yet implemented routes
func DefaultHandleFunc(c *gin.Context) {
	c.String(http.StatusNotImplemented, "501 not implemented")
}

type ApiHandleFunctions struct {

	// Routes for the BroadcastsAPI part of the API
	BroadcastsAPI BroadcastsAPI
	// Routes for the CategoriesAPI part of the API
	CategoriesAPI CategoriesAPI
	// Routes for the CollectionsAPI part of the API
	CollectionsAPI CollectionsAPI
	// Routes for the ExperienceAPI part of the API
	ExperienceAPI ExperienceAPI
	// Routes for the MusicAPI part of the API
	MusicAPI MusicAPI
	// Routes for the MusicExportAPI part of the API
	MusicExportAPI MusicExportAPI
	// Routes for the NetworksAPI part of the API
	NetworksAPI NetworksAPI
	// Routes for the PersonalisedCategoriesAPI part of the API
	PersonalisedCategoriesAPI PersonalisedCategoriesAPI
	// Routes for the PersonalisedNetworksAPI part of the API
	PersonalisedNetworksAPI PersonalisedNetworksAPI
	// Routes for the PersonalisedPlaysAPI part of the API
	PersonalisedPlaysAPI PersonalisedPlaysAPI
	// Routes for the PlayspaceAPI part of the API
	PlayspaceAPI PlayspaceAPI
	// Routes for the PodcastsAPI part of the API
	PodcastsAPI PodcastsAPI
	// Routes for the ProgrammesAPI part of the API
	ProgrammesAPI ProgrammesAPI
	// Routes for the RadioAPI part of the API
	RadioAPI RadioAPI
}

func getRoutes(handleFunctions ApiHandleFunctions) []Route {
	return []Route{ 
		{
			"BroadcastsGet",
			http.MethodGet,
			"/broadcasts",
			handleFunctions.BroadcastsAPI.BroadcastsGet,
		},
		{
			"BroadcastsLatestGet",
			http.MethodGet,
			"/broadcasts/latest",
			handleFunctions.BroadcastsAPI.BroadcastsLatestGet,
		},
		{
			"GetBroadcastByPid",
			http.MethodGet,
			"/broadcasts/:pid",
			handleFunctions.BroadcastsAPI.GetBroadcastByPid,
		},
		{
			"CategoriesGet",
			http.MethodGet,
			"/categories",
			handleFunctions.CategoriesAPI.CategoriesGet,
		},
		{
			"CategoriesIdGet",
			http.MethodGet,
			"/categories/:id",
			handleFunctions.CategoriesAPI.CategoriesIdGet,
		},
		{
			"GetCollectionMembers",
			http.MethodGet,
			"/collections/:pid/members",
			handleFunctions.CollectionsAPI.GetCollectionMembers,
		},
		{
			"GetExperienceHomepage",
			http.MethodGet,
			"/experience/homepage",
			handleFunctions.ExperienceAPI.GetExperienceHomepage,
		},
		{
			"DeletePersonalisedMusicFavouritesByTypeById",
			http.MethodDelete,
			"/my/music/favourites/:type/:id",
			handleFunctions.MusicAPI.DeletePersonalisedMusicFavouritesByTypeById,
		},
		{
			"DeletePersonalisedMusicFollowsByTypeById",
			http.MethodDelete,
			"/my/music/follows/:type/:id",
			handleFunctions.MusicAPI.DeletePersonalisedMusicFollowsByTypeById,
		},
		{
			"GetMusicPopularArtistById",
			http.MethodGet,
			"/music/popular/artists/:id",
			handleFunctions.MusicAPI.GetMusicPopularArtistById,
		},
		{
			"GetMusicPopularArtists",
			http.MethodGet,
			"/music/popular/artists",
			handleFunctions.MusicAPI.GetMusicPopularArtists,
		},
		{
			"GetMusicPopularPlaylistById",
			http.MethodGet,
			"/music/popular/playlists/:id",
			handleFunctions.MusicAPI.GetMusicPopularPlaylistById,
		},
		{
			"GetMusicPopularPlaylists",
			http.MethodGet,
			"/music/popular/playlists",
			handleFunctions.MusicAPI.GetMusicPopularPlaylists,
		},
		{
			"GetMusicPopularTrackById",
			http.MethodGet,
			"/music/popular/tracks/:id",
			handleFunctions.MusicAPI.GetMusicPopularTrackById,
		},
		{
			"GetMusicPopularTracks",
			http.MethodGet,
			"/music/popular/tracks",
			handleFunctions.MusicAPI.GetMusicPopularTracks,
		},
		{
			"GetPersonalisedMusicFavourites",
			http.MethodGet,
			"/my/music/favourites",
			handleFunctions.MusicAPI.GetPersonalisedMusicFavourites,
		},
		{
			"GetPersonalisedMusicFavouritesByType",
			http.MethodGet,
			"/my/music/favourites/:type",
			handleFunctions.MusicAPI.GetPersonalisedMusicFavouritesByType,
		},
		{
			"GetPersonalisedMusicFavouritesByTypeById",
			http.MethodGet,
			"/my/music/favourites/:type/:id",
			handleFunctions.MusicAPI.GetPersonalisedMusicFavouritesByTypeById,
		},
		{
			"GetPersonalisedMusicFollows",
			http.MethodGet,
			"/my/music/follows",
			handleFunctions.MusicAPI.GetPersonalisedMusicFollows,
		},
		{
			"GetPersonalisedMusicFollowsByType",
			http.MethodGet,
			"/my/music/follows/:type",
			handleFunctions.MusicAPI.GetPersonalisedMusicFollowsByType,
		},
		{
			"GetPersonalisedMusicFollowsByTypeById",
			http.MethodGet,
			"/my/music/follows/:type/:id",
			handleFunctions.MusicAPI.GetPersonalisedMusicFollowsByTypeById,
		},
		{
			"PostPersonalisedMusicFavouritesBatch",
			http.MethodPost,
			"/my/music/favourites",
			handleFunctions.MusicAPI.PostPersonalisedMusicFavouritesBatch,
		},
		{
			"PostPersonalisedMusicFavouritesByTypeById",
			http.MethodPost,
			"/my/music/favourites/:type/:id",
			handleFunctions.MusicAPI.PostPersonalisedMusicFavouritesByTypeById,
		},
		{
			"PostPersonalisedMusicFollowsBatch",
			http.MethodPost,
			"/my/music/follows",
			handleFunctions.MusicAPI.PostPersonalisedMusicFollowsBatch,
		},
		{
			"PostPersonalisedMusicFollowsByTypeById",
			http.MethodPost,
			"/my/music/follows/:type/:id",
			handleFunctions.MusicAPI.PostPersonalisedMusicFollowsByTypeById,
		},
		{
			"PutPersonalisedMusicFavouritesBatch",
			http.MethodPut,
			"/my/music/favourites",
			handleFunctions.MusicAPI.PutPersonalisedMusicFavouritesBatch,
		},
		{
			"PutPersonalisedMusicFavouritesByTypeById",
			http.MethodPut,
			"/my/music/favourites/:type/:id",
			handleFunctions.MusicAPI.PutPersonalisedMusicFavouritesByTypeById,
		},
		{
			"PutPersonalisedMusicFollowsBatch",
			http.MethodPut,
			"/my/music/follows",
			handleFunctions.MusicAPI.PutPersonalisedMusicFollowsBatch,
		},
		{
			"PutPersonalisedMusicFollowsByTypeById",
			http.MethodPut,
			"/my/music/follows/:type/:id",
			handleFunctions.MusicAPI.PutPersonalisedMusicFollowsByTypeById,
		},
		{
			"DeleteMusicPreferencesExport",
			http.MethodDelete,
			"/my/music/preferences/export",
			handleFunctions.MusicExportAPI.DeleteMusicPreferencesExport,
		},
		{
			"DeleteMusicPreferencesExportVendor",
			http.MethodDelete,
			"/my/music/preferences/export/:vendor",
			handleFunctions.MusicExportAPI.DeleteMusicPreferencesExportVendor,
		},
		{
			"GetMusicExport",
			http.MethodGet,
			"/my/music/export",
			handleFunctions.MusicExportAPI.GetMusicExport,
		},
		{
			"GetMusicExportJobs",
			http.MethodGet,
			"/my/music/exports/jobs",
			handleFunctions.MusicExportAPI.GetMusicExportJobs,
		},
		{
			"GetMusicExportTracks",
			http.MethodGet,
			"/my/music/exports/tracks",
			handleFunctions.MusicExportAPI.GetMusicExportTracks,
		},
		{
			"GetMusicPreferencesExport",
			http.MethodGet,
			"/my/music/preferences/export",
			handleFunctions.MusicExportAPI.GetMusicPreferencesExport,
		},
		{
			"GetMusicPreferencesExportVendor",
			http.MethodGet,
			"/my/music/preferences/export/:vendor",
			handleFunctions.MusicExportAPI.GetMusicPreferencesExportVendor,
		},
		{
			"PostMusicExportJob",
			http.MethodPost,
			"/my/music/exports/jobs",
			handleFunctions.MusicExportAPI.PostMusicExportJob,
		},
		{
			"PostMusicPreferencesExport",
			http.MethodPost,
			"/my/music/preferences/export",
			handleFunctions.MusicExportAPI.PostMusicPreferencesExport,
		},
		{
			"PostMusicPreferencesExportVendor",
			http.MethodPost,
			"/my/music/preferences/export/:vendor",
			handleFunctions.MusicExportAPI.PostMusicPreferencesExportVendor,
		},
		{
			"PutMusicPreferencesExportVendor",
			http.MethodPut,
			"/my/music/preferences/export/:vendor",
			handleFunctions.MusicExportAPI.PutMusicPreferencesExportVendor,
		},
		{
			"GetRadioNetworks",
			http.MethodGet,
			"/radio/networks.json",
			handleFunctions.NetworksAPI.GetRadioNetworks,
		},
		{
			"MyCategoriesFollowsDelete",
			http.MethodDelete,
			"/my/categories/follows",
			handleFunctions.PersonalisedCategoriesAPI.MyCategoriesFollowsDelete,
		},
		{
			"MyCategoriesFollowsGet",
			http.MethodGet,
			"/my/categories/follows",
			handleFunctions.PersonalisedCategoriesAPI.MyCategoriesFollowsGet,
		},
		{
			"MyCategoriesFollowsPost",
			http.MethodPost,
			"/my/categories/follows",
			handleFunctions.PersonalisedCategoriesAPI.MyCategoriesFollowsPost,
		},
		{
			"MyNetworksFollowsDelete",
			http.MethodDelete,
			"/my/networks/follows",
			handleFunctions.PersonalisedNetworksAPI.MyNetworksFollowsDelete,
		},
		{
			"MyNetworksFollowsGet",
			http.MethodGet,
			"/my/networks/follows",
			handleFunctions.PersonalisedNetworksAPI.MyNetworksFollowsGet,
		},
		{
			"MyNetworksFollowsPost",
			http.MethodPost,
			"/my/networks/follows",
			handleFunctions.PersonalisedNetworksAPI.MyNetworksFollowsPost,
		},
		{
			"MyPlaysPost",
			http.MethodPost,
			"/my/plays",
			handleFunctions.PersonalisedPlaysAPI.MyPlaysPost,
		},
		{
			"GetContainer",
			http.MethodGet,
			"/my/playspace/containers/:id",
			handleFunctions.PlayspaceAPI.GetContainer,
		},
		{
			"SuggestContainer",
			http.MethodGet,
			"/my/playspace/containers/suggested",
			handleFunctions.PlayspaceAPI.SuggestContainer,
		},
		{
			"GetPodcastByPid",
			http.MethodGet,
			"/podcasts/:pid",
			handleFunctions.PodcastsAPI.GetPodcastByPid,
		},
		{
			"GetPodcastEpisodes",
			http.MethodGet,
			"/podcasts/:pid/episodes",
			handleFunctions.PodcastsAPI.GetPodcastEpisodes,
		},
		{
			"GetPodcasts",
			http.MethodGet,
			"/podcasts",
			handleFunctions.PodcastsAPI.GetPodcasts,
		},
		{
			"GetPodcastsFeatured",
			http.MethodGet,
			"/podcasts/featured",
			handleFunctions.PodcastsAPI.GetPodcastsFeatured,
		},
		{
			"GetPopularEpisodesClips",
			http.MethodGet,
			"/radio/popular",
			handleFunctions.ProgrammesAPI.GetPopularEpisodesClips,
		},
		{
			"GetRadioProgrammes",
			http.MethodGet,
			"/radio/programmes",
			handleFunctions.ProgrammesAPI.GetRadioProgrammes,
		},
		{
			"GetRadioProgrammesByPid",
			http.MethodGet,
			"/radio/programmes/:pid",
			handleFunctions.ProgrammesAPI.GetRadioProgrammesByPid,
		},
		{
			"GetRecommendations",
			http.MethodGet,
			"/my/programmes/recommendations",
			handleFunctions.ProgrammesAPI.GetRecommendations,
		},
		{
			"DeletePersonalisedRadioByActivityTypeById",
			http.MethodDelete,
			"/my/radio/favourites/:type/:pid",
			handleFunctions.RadioAPI.DeletePersonalisedRadioByActivityTypeById,
		},
		{
			"DeletePersonalisedRadioFollowsByTypeById",
			http.MethodDelete,
			"/my/radio/follows/:type/:pid",
			handleFunctions.RadioAPI.DeletePersonalisedRadioFollowsByTypeById,
		},
		{
			"GetPersonalisedRadioByActivityTypeById",
			http.MethodGet,
			"/my/radio/favourites/:type/:pid",
			handleFunctions.RadioAPI.GetPersonalisedRadioByActivityTypeById,
		},
		{
			"GetPersonalisedRadioFavourites",
			http.MethodGet,
			"/my/radio/favourites",
			handleFunctions.RadioAPI.GetPersonalisedRadioFavourites,
		},
		{
			"GetPersonalisedRadioFavouritesByType",
			http.MethodGet,
			"/my/radio/favourites/:type",
			handleFunctions.RadioAPI.GetPersonalisedRadioFavouritesByType,
		},
		{
			"GetPersonalisedRadioFollows",
			http.MethodGet,
			"/my/radio/follows",
			handleFunctions.RadioAPI.GetPersonalisedRadioFollows,
		},
		{
			"GetPersonalisedRadioFollowsByType",
			http.MethodGet,
			"/my/radio/follows/:type",
			handleFunctions.RadioAPI.GetPersonalisedRadioFollowsByType,
		},
		{
			"GetPersonalisedRadioFollowsByTypeById",
			http.MethodGet,
			"/my/radio/follows/:type/:pid",
			handleFunctions.RadioAPI.GetPersonalisedRadioFollowsByTypeById,
		},
		{
			"GetPersonalisedRadioPlays",
			http.MethodGet,
			"/my/radio/plays",
			handleFunctions.RadioAPI.GetPersonalisedRadioPlays,
		},
		{
			"PostPersonalisedRadioBatch",
			http.MethodPost,
			"/my/radio/favourites",
			handleFunctions.RadioAPI.PostPersonalisedRadioBatch,
		},
		{
			"PostPersonalisedRadioByActivityTypeById",
			http.MethodPost,
			"/my/radio/favourites/:type/:pid",
			handleFunctions.RadioAPI.PostPersonalisedRadioByActivityTypeById,
		},
		{
			"PostPersonalisedRadioFollowsBatch",
			http.MethodPost,
			"/my/radio/follows",
			handleFunctions.RadioAPI.PostPersonalisedRadioFollowsBatch,
		},
		{
			"PostPersonalisedRadioFollowsByTypeById",
			http.MethodPost,
			"/my/radio/follows/:type/:pid",
			handleFunctions.RadioAPI.PostPersonalisedRadioFollowsByTypeById,
		},
		{
			"PutPersonalisedRadioBatch",
			http.MethodPut,
			"/my/radio/favourites",
			handleFunctions.RadioAPI.PutPersonalisedRadioBatch,
		},
		{
			"PutPersonalisedRadioByActivityTypeById",
			http.MethodPut,
			"/my/radio/favourites/:type/:pid",
			handleFunctions.RadioAPI.PutPersonalisedRadioByActivityTypeById,
		},
		{
			"PutPersonalisedRadioFollowsBatch",
			http.MethodPut,
			"/my/radio/follows",
			handleFunctions.RadioAPI.PutPersonalisedRadioFollowsBatch,
		},
		{
			"PutPersonalisedRadioFollowsByTypeById",
			http.MethodPut,
			"/my/radio/follows/:type/:pid",
			handleFunctions.RadioAPI.PutPersonalisedRadioFollowsByTypeById,
		},
	}
}
