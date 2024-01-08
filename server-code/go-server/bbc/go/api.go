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
	"context"
	"net/http"
)



// BroadcastsAPIRouter defines the required methods for binding the api requests to a responses for the BroadcastsAPI
// The BroadcastsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a BroadcastsAPIServicer to perform the required actions, then write the service results to the http response.
type BroadcastsAPIRouter interface { 
	BroadcastsGet(http.ResponseWriter, *http.Request)
	BroadcastsLatestGet(http.ResponseWriter, *http.Request)
	GetBroadcastByPid(http.ResponseWriter, *http.Request)
}
// CategoriesAPIRouter defines the required methods for binding the api requests to a responses for the CategoriesAPI
// The CategoriesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a CategoriesAPIServicer to perform the required actions, then write the service results to the http response.
type CategoriesAPIRouter interface { 
	CategoriesGet(http.ResponseWriter, *http.Request)
	CategoriesIdGet(http.ResponseWriter, *http.Request)
}
// CollectionsAPIRouter defines the required methods for binding the api requests to a responses for the CollectionsAPI
// The CollectionsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a CollectionsAPIServicer to perform the required actions, then write the service results to the http response.
type CollectionsAPIRouter interface { 
	GetCollectionMembers(http.ResponseWriter, *http.Request)
}
// ExperienceAPIRouter defines the required methods for binding the api requests to a responses for the ExperienceAPI
// The ExperienceAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ExperienceAPIServicer to perform the required actions, then write the service results to the http response.
type ExperienceAPIRouter interface { 
	GetExperienceHomepage(http.ResponseWriter, *http.Request)
}
// MusicAPIRouter defines the required methods for binding the api requests to a responses for the MusicAPI
// The MusicAPIRouter implementation should parse necessary information from the http request,
// pass the data to a MusicAPIServicer to perform the required actions, then write the service results to the http response.
type MusicAPIRouter interface { 
	DeletePersonalisedMusicFavouritesByTypeById(http.ResponseWriter, *http.Request)
	DeletePersonalisedMusicFollowsByTypeById(http.ResponseWriter, *http.Request)
	GetMusicPopularArtistById(http.ResponseWriter, *http.Request)
	GetMusicPopularArtists(http.ResponseWriter, *http.Request)
	GetMusicPopularPlaylistById(http.ResponseWriter, *http.Request)
	GetMusicPopularPlaylists(http.ResponseWriter, *http.Request)
	GetMusicPopularTrackById(http.ResponseWriter, *http.Request)
	GetMusicPopularTracks(http.ResponseWriter, *http.Request)
	GetPersonalisedMusicFavourites(http.ResponseWriter, *http.Request)
	GetPersonalisedMusicFavouritesByType(http.ResponseWriter, *http.Request)
	GetPersonalisedMusicFavouritesByTypeById(http.ResponseWriter, *http.Request)
	GetPersonalisedMusicFollows(http.ResponseWriter, *http.Request)
	GetPersonalisedMusicFollowsByType(http.ResponseWriter, *http.Request)
	GetPersonalisedMusicFollowsByTypeById(http.ResponseWriter, *http.Request)
	PostPersonalisedMusicFavouritesBatch(http.ResponseWriter, *http.Request)
	PostPersonalisedMusicFavouritesByTypeById(http.ResponseWriter, *http.Request)
	PostPersonalisedMusicFollowsBatch(http.ResponseWriter, *http.Request)
	PostPersonalisedMusicFollowsByTypeById(http.ResponseWriter, *http.Request)
	PutPersonalisedMusicFavouritesBatch(http.ResponseWriter, *http.Request)
	PutPersonalisedMusicFavouritesByTypeById(http.ResponseWriter, *http.Request)
	PutPersonalisedMusicFollowsBatch(http.ResponseWriter, *http.Request)
	PutPersonalisedMusicFollowsByTypeById(http.ResponseWriter, *http.Request)
}
// MusicExportAPIRouter defines the required methods for binding the api requests to a responses for the MusicExportAPI
// The MusicExportAPIRouter implementation should parse necessary information from the http request,
// pass the data to a MusicExportAPIServicer to perform the required actions, then write the service results to the http response.
type MusicExportAPIRouter interface { 
	DeleteMusicPreferencesExport(http.ResponseWriter, *http.Request)
	DeleteMusicPreferencesExportVendor(http.ResponseWriter, *http.Request)
	GetMusicExport(http.ResponseWriter, *http.Request)
	GetMusicExportJobs(http.ResponseWriter, *http.Request)
	GetMusicExportTracks(http.ResponseWriter, *http.Request)
	GetMusicPreferencesExport(http.ResponseWriter, *http.Request)
	GetMusicPreferencesExportVendor(http.ResponseWriter, *http.Request)
	PostMusicExportJob(http.ResponseWriter, *http.Request)
	PostMusicPreferencesExport(http.ResponseWriter, *http.Request)
	PostMusicPreferencesExportVendor(http.ResponseWriter, *http.Request)
	PutMusicPreferencesExportVendor(http.ResponseWriter, *http.Request)
}
// NetworksAPIRouter defines the required methods for binding the api requests to a responses for the NetworksAPI
// The NetworksAPIRouter implementation should parse necessary information from the http request,
// pass the data to a NetworksAPIServicer to perform the required actions, then write the service results to the http response.
type NetworksAPIRouter interface { 
	GetRadioNetworks(http.ResponseWriter, *http.Request)
}
// PersonalisedCategoriesAPIRouter defines the required methods for binding the api requests to a responses for the PersonalisedCategoriesAPI
// The PersonalisedCategoriesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PersonalisedCategoriesAPIServicer to perform the required actions, then write the service results to the http response.
type PersonalisedCategoriesAPIRouter interface { 
	MyCategoriesFollowsDelete(http.ResponseWriter, *http.Request)
	MyCategoriesFollowsGet(http.ResponseWriter, *http.Request)
	MyCategoriesFollowsPost(http.ResponseWriter, *http.Request)
}
// PersonalisedNetworksAPIRouter defines the required methods for binding the api requests to a responses for the PersonalisedNetworksAPI
// The PersonalisedNetworksAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PersonalisedNetworksAPIServicer to perform the required actions, then write the service results to the http response.
type PersonalisedNetworksAPIRouter interface { 
	MyNetworksFollowsDelete(http.ResponseWriter, *http.Request)
	MyNetworksFollowsGet(http.ResponseWriter, *http.Request)
	MyNetworksFollowsPost(http.ResponseWriter, *http.Request)
}
// PersonalisedPlaysAPIRouter defines the required methods for binding the api requests to a responses for the PersonalisedPlaysAPI
// The PersonalisedPlaysAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PersonalisedPlaysAPIServicer to perform the required actions, then write the service results to the http response.
type PersonalisedPlaysAPIRouter interface { 
	MyPlaysPost(http.ResponseWriter, *http.Request)
}
// PlayspaceAPIRouter defines the required methods for binding the api requests to a responses for the PlayspaceAPI
// The PlayspaceAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PlayspaceAPIServicer to perform the required actions, then write the service results to the http response.
type PlayspaceAPIRouter interface { 
	GetContainer(http.ResponseWriter, *http.Request)
	SuggestContainer(http.ResponseWriter, *http.Request)
}
// PodcastsAPIRouter defines the required methods for binding the api requests to a responses for the PodcastsAPI
// The PodcastsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PodcastsAPIServicer to perform the required actions, then write the service results to the http response.
type PodcastsAPIRouter interface { 
	GetPodcastByPid(http.ResponseWriter, *http.Request)
	GetPodcastEpisodes(http.ResponseWriter, *http.Request)
	GetPodcasts(http.ResponseWriter, *http.Request)
	GetPodcastsFeatured(http.ResponseWriter, *http.Request)
}
// ProgrammesAPIRouter defines the required methods for binding the api requests to a responses for the ProgrammesAPI
// The ProgrammesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ProgrammesAPIServicer to perform the required actions, then write the service results to the http response.
type ProgrammesAPIRouter interface { 
	GetPopularEpisodesClips(http.ResponseWriter, *http.Request)
	GetRadioProgrammes(http.ResponseWriter, *http.Request)
	GetRadioProgrammesByPid(http.ResponseWriter, *http.Request)
	GetRecommendations(http.ResponseWriter, *http.Request)
}
// RadioAPIRouter defines the required methods for binding the api requests to a responses for the RadioAPI
// The RadioAPIRouter implementation should parse necessary information from the http request,
// pass the data to a RadioAPIServicer to perform the required actions, then write the service results to the http response.
type RadioAPIRouter interface { 
	DeletePersonalisedRadioByActivityTypeById(http.ResponseWriter, *http.Request)
	DeletePersonalisedRadioFollowsByTypeById(http.ResponseWriter, *http.Request)
	GetPersonalisedRadioByActivityTypeById(http.ResponseWriter, *http.Request)
	GetPersonalisedRadioFavourites(http.ResponseWriter, *http.Request)
	GetPersonalisedRadioFavouritesByType(http.ResponseWriter, *http.Request)
	GetPersonalisedRadioFollows(http.ResponseWriter, *http.Request)
	GetPersonalisedRadioFollowsByType(http.ResponseWriter, *http.Request)
	GetPersonalisedRadioFollowsByTypeById(http.ResponseWriter, *http.Request)
	GetPersonalisedRadioPlays(http.ResponseWriter, *http.Request)
	PostPersonalisedRadioBatch(http.ResponseWriter, *http.Request)
	PostPersonalisedRadioByActivityTypeById(http.ResponseWriter, *http.Request)
	PostPersonalisedRadioFollowsBatch(http.ResponseWriter, *http.Request)
	PostPersonalisedRadioFollowsByTypeById(http.ResponseWriter, *http.Request)
	PutPersonalisedRadioBatch(http.ResponseWriter, *http.Request)
	PutPersonalisedRadioByActivityTypeById(http.ResponseWriter, *http.Request)
	PutPersonalisedRadioFollowsBatch(http.ResponseWriter, *http.Request)
	PutPersonalisedRadioFollowsByTypeById(http.ResponseWriter, *http.Request)
}


// BroadcastsAPIServicer defines the api actions for the BroadcastsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type BroadcastsAPIServicer interface { 
	BroadcastsGet(context.Context, string, int32, int32, string, string, string) (ImplResponse, error)
	BroadcastsLatestGet(context.Context, string, int32, int32, string, string, string, string, string) (ImplResponse, error)
	GetBroadcastByPid(context.Context, string, string) (ImplResponse, error)
}


// CategoriesAPIServicer defines the api actions for the CategoriesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type CategoriesAPIServicer interface { 
	CategoriesGet(context.Context, string, string) (ImplResponse, error)
	CategoriesIdGet(context.Context, string, string) (ImplResponse, error)
}


// CollectionsAPIServicer defines the api actions for the CollectionsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type CollectionsAPIServicer interface { 
	GetCollectionMembers(context.Context, string, string, int32, int32) (ImplResponse, error)
}


// ExperienceAPIServicer defines the api actions for the ExperienceAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ExperienceAPIServicer interface { 
	GetExperienceHomepage(context.Context, string) (ImplResponse, error)
}


// MusicAPIServicer defines the api actions for the MusicAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type MusicAPIServicer interface { 
	DeletePersonalisedMusicFavouritesByTypeById(context.Context, string, string, string, string, string) (ImplResponse, error)
	DeletePersonalisedMusicFollowsByTypeById(context.Context, string, string, string, string, string, bool, string, bool) (ImplResponse, error)
	GetMusicPopularArtistById(context.Context, string, string, string, string, bool) (ImplResponse, error)
	GetMusicPopularArtists(context.Context, string, string, string, bool, int32, int32) (ImplResponse, error)
	GetMusicPopularPlaylistById(context.Context, string, string, string, string, bool) (ImplResponse, error)
	GetMusicPopularPlaylists(context.Context, string, string, string, bool, int32, int32) (ImplResponse, error)
	GetMusicPopularTrackById(context.Context, string, string, string, string, string, string, string, bool) (ImplResponse, error)
	GetMusicPopularTracks(context.Context, string, string, string, string, string, string, bool, int32, int32) (ImplResponse, error)
	GetPersonalisedMusicFavourites(context.Context, string, string, string, int32, int32, string, bool) (ImplResponse, error)
	GetPersonalisedMusicFavouritesByType(context.Context, string, string, string, string, string, int32, int32) (ImplResponse, error)
	GetPersonalisedMusicFavouritesByTypeById(context.Context, string, string, string, string, string) (ImplResponse, error)
	GetPersonalisedMusicFollows(context.Context, string, string, string, string, bool, string, bool, int32, int32) (ImplResponse, error)
	GetPersonalisedMusicFollowsByType(context.Context, string, string, string, string, string, bool, string, bool, int32, int32) (ImplResponse, error)
	GetPersonalisedMusicFollowsByTypeById(context.Context, string, string, string, string, string, bool, string, bool) (ImplResponse, error)
	PostPersonalisedMusicFavouritesBatch(context.Context, string, string, string, []PersonalisedMusicBatchRequest) (ImplResponse, error)
	PostPersonalisedMusicFavouritesByTypeById(context.Context, string, string, string, string, string, PersonalisedMusicRequest) (ImplResponse, error)
	PostPersonalisedMusicFollowsBatch(context.Context, string, string, string, []PersonalisedMusicBatchRequest, string, bool, string, bool) (ImplResponse, error)
	PostPersonalisedMusicFollowsByTypeById(context.Context, string, string, string, string, string, PersonalisedMusicRequest, bool, string, bool) (ImplResponse, error)
	PutPersonalisedMusicFavouritesBatch(context.Context, string, string, string, []PersonalisedMusicBatchRequest) (ImplResponse, error)
	PutPersonalisedMusicFavouritesByTypeById(context.Context, string, string, string, string, string, PersonalisedMusicRequest) (ImplResponse, error)
	PutPersonalisedMusicFollowsBatch(context.Context, string, string, string, []PersonalisedMusicBatchRequest, string, bool, string, bool) (ImplResponse, error)
	PutPersonalisedMusicFollowsByTypeById(context.Context, string, string, string, string, string, PersonalisedMusicRequest, bool, string, bool) (ImplResponse, error)
}


// MusicExportAPIServicer defines the api actions for the MusicExportAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type MusicExportAPIServicer interface { 
	DeleteMusicPreferencesExport(context.Context, string, string, string) (ImplResponse, error)
	DeleteMusicPreferencesExportVendor(context.Context, string, string, string, string) (ImplResponse, error)
	GetMusicExport(context.Context, string, string, string, int32, int32) (ImplResponse, error)
	GetMusicExportJobs(context.Context, string, string, string, bool, string) (ImplResponse, error)
	GetMusicExportTracks(context.Context, string, string, string, bool, int32, int32, string, string) (ImplResponse, error)
	GetMusicPreferencesExport(context.Context, string, string, string) (ImplResponse, error)
	GetMusicPreferencesExportVendor(context.Context, string, string, string, string) (ImplResponse, error)
	PostMusicExportJob(context.Context, string, string, string, bool, []MusicExportJob, string) (ImplResponse, error)
	PostMusicPreferencesExport(context.Context, string, string, string, MusicExportPreferences) (ImplResponse, error)
	PostMusicPreferencesExportVendor(context.Context, string, string, string, string, MusicExportPreferences) (ImplResponse, error)
	PutMusicPreferencesExportVendor(context.Context, string, string, string, string, MusicExportPreferences) (ImplResponse, error)
}


// NetworksAPIServicer defines the api actions for the NetworksAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type NetworksAPIServicer interface { 
	GetRadioNetworks(context.Context, string, bool, bool) (ImplResponse, error)
}


// PersonalisedCategoriesAPIServicer defines the api actions for the PersonalisedCategoriesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PersonalisedCategoriesAPIServicer interface { 
	MyCategoriesFollowsDelete(context.Context, string, string, Body1) (ImplResponse, error)
	MyCategoriesFollowsGet(context.Context, string, string, int32, int32) (ImplResponse, error)
	MyCategoriesFollowsPost(context.Context, string, string, Body) (ImplResponse, error)
}


// PersonalisedNetworksAPIServicer defines the api actions for the PersonalisedNetworksAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PersonalisedNetworksAPIServicer interface { 
	MyNetworksFollowsDelete(context.Context, string, string, Body3, int32, int32) (ImplResponse, error)
	MyNetworksFollowsGet(context.Context, string, string, int32, int32) (ImplResponse, error)
	MyNetworksFollowsPost(context.Context, string, string, Body2, int32, int32) (ImplResponse, error)
}


// PersonalisedPlaysAPIServicer defines the api actions for the PersonalisedPlaysAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PersonalisedPlaysAPIServicer interface { 
	MyPlaysPost(context.Context, string, string, Body4) (ImplResponse, error)
}


// PlayspaceAPIServicer defines the api actions for the PlayspaceAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PlayspaceAPIServicer interface { 
	GetContainer(context.Context, string, string, string) (ImplResponse, error)
	SuggestContainer(context.Context, string, string, string, string) (ImplResponse, error)
}


// PodcastsAPIServicer defines the api actions for the PodcastsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PodcastsAPIServicer interface { 
	GetPodcastByPid(context.Context, string, string, int32, int32) (ImplResponse, error)
	GetPodcastEpisodes(context.Context, string, string, int32, int32) (ImplResponse, error)
	GetPodcasts(context.Context, string, int32, int32, string, string, string, string, string, string) (ImplResponse, error)
	GetPodcastsFeatured(context.Context, string) (ImplResponse, error)
}


// ProgrammesAPIServicer defines the api actions for the ProgrammesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ProgrammesAPIServicer interface { 
	GetPopularEpisodesClips(context.Context, string, string, string, string, string, string, string, string, string, string, []map[string]interface{}, string) (ImplResponse, error)
	GetRadioProgrammes(context.Context, string, string, string, string, string, string, string, string) (ImplResponse, error)
	GetRadioProgrammesByPid(context.Context, string, string) (ImplResponse, error)
	GetRecommendations(context.Context, string, string, string, int32, int32) (ImplResponse, error)
}


// RadioAPIServicer defines the api actions for the RadioAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type RadioAPIServicer interface { 
	DeletePersonalisedRadioByActivityTypeById(context.Context, string, string, string, string, string) (ImplResponse, error)
	DeletePersonalisedRadioFollowsByTypeById(context.Context, string, string, string, string, string) (ImplResponse, error)
	GetPersonalisedRadioByActivityTypeById(context.Context, string, string, string, string, string, bool) (ImplResponse, error)
	GetPersonalisedRadioFavourites(context.Context, string, string, string, int32, int32, string, bool) (ImplResponse, error)
	GetPersonalisedRadioFavouritesByType(context.Context, string, string, string, string, string, bool, int32, int32) (ImplResponse, error)
	GetPersonalisedRadioFollows(context.Context, string, string, string, int32, int32, string, bool) (ImplResponse, error)
	GetPersonalisedRadioFollowsByType(context.Context, string, string, string, string, string, int32, int32, bool) (ImplResponse, error)
	GetPersonalisedRadioFollowsByTypeById(context.Context, string, string, string, string, string) (ImplResponse, error)
	GetPersonalisedRadioPlays(context.Context, string, string, string, int32, int32, string, bool) (ImplResponse, error)
	PostPersonalisedRadioBatch(context.Context, string, string, string, []PersonalisedRadioBatchRequest) (ImplResponse, error)
	PostPersonalisedRadioByActivityTypeById(context.Context, string, string, string, string, string, PersonalisedRadioRequest) (ImplResponse, error)
	PostPersonalisedRadioFollowsBatch(context.Context, string, string, string, []PersonalisedRadioBatchRequest) (ImplResponse, error)
	PostPersonalisedRadioFollowsByTypeById(context.Context, string, string, string, string, string, PersonalisedRadioRequest) (ImplResponse, error)
	PutPersonalisedRadioBatch(context.Context, string, string, string, []PersonalisedRadioBatchRequest) (ImplResponse, error)
	PutPersonalisedRadioByActivityTypeById(context.Context, string, string, string, string, string, PersonalisedRadioRequest) (ImplResponse, error)
	PutPersonalisedRadioFollowsBatch(context.Context, string, string, string, []PersonalisedRadioBatchRequest) (ImplResponse, error)
	PutPersonalisedRadioFollowsByTypeById(context.Context, string, string, string, string, string, PersonalisedRadioRequest) (ImplResponse, error)
}
