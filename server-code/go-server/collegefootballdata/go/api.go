/*
 * College Football Data API
 *
 * This is an API for accessing all sorts of college football data.  Please note that API keys should be supplied with \"Bearer \" prepended (e.g. \"Bearer your_key\"). API keys can be acquired from the CollegeFootballData.com website.
 *
 * API version: 4.4.12
 * Contact: admin@collegefootballdata.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
)



// BettingAPIRouter defines the required methods for binding the api requests to a responses for the BettingAPI
// The BettingAPIRouter implementation should parse necessary information from the http request,
// pass the data to a BettingAPIServicer to perform the required actions, then write the service results to the http response.
type BettingAPIRouter interface { 
	GetLines(http.ResponseWriter, *http.Request)
}
// CoachesAPIRouter defines the required methods for binding the api requests to a responses for the CoachesAPI
// The CoachesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a CoachesAPIServicer to perform the required actions, then write the service results to the http response.
type CoachesAPIRouter interface { 
	GetCoaches(http.ResponseWriter, *http.Request)
}
// ConferencesAPIRouter defines the required methods for binding the api requests to a responses for the ConferencesAPI
// The ConferencesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ConferencesAPIServicer to perform the required actions, then write the service results to the http response.
type ConferencesAPIRouter interface { 
	GetConferences(http.ResponseWriter, *http.Request)
}
// DraftAPIRouter defines the required methods for binding the api requests to a responses for the DraftAPI
// The DraftAPIRouter implementation should parse necessary information from the http request,
// pass the data to a DraftAPIServicer to perform the required actions, then write the service results to the http response.
type DraftAPIRouter interface { 
	GetDraftPicks(http.ResponseWriter, *http.Request)
	GetNFLPositions(http.ResponseWriter, *http.Request)
	GetNFLTeams(http.ResponseWriter, *http.Request)
}
// DrivesAPIRouter defines the required methods for binding the api requests to a responses for the DrivesAPI
// The DrivesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a DrivesAPIServicer to perform the required actions, then write the service results to the http response.
type DrivesAPIRouter interface { 
	GetDrives(http.ResponseWriter, *http.Request)
}
// GamesAPIRouter defines the required methods for binding the api requests to a responses for the GamesAPI
// The GamesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a GamesAPIServicer to perform the required actions, then write the service results to the http response.
type GamesAPIRouter interface { 
	GetAdvancedBoxScore(http.ResponseWriter, *http.Request)
	GetCalendar(http.ResponseWriter, *http.Request)
	GetGameMedia(http.ResponseWriter, *http.Request)
	GetGameWeather(http.ResponseWriter, *http.Request)
	GetGames(http.ResponseWriter, *http.Request)
	GetPlayerGameStats(http.ResponseWriter, *http.Request)
	GetScoreboard(http.ResponseWriter, *http.Request)
	GetTeamGameStats(http.ResponseWriter, *http.Request)
	GetTeamRecords(http.ResponseWriter, *http.Request)
}
// MetricsAPIRouter defines the required methods for binding the api requests to a responses for the MetricsAPI
// The MetricsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a MetricsAPIServicer to perform the required actions, then write the service results to the http response.
type MetricsAPIRouter interface { 
	GetGamePPA(http.ResponseWriter, *http.Request)
	GetPlayerGamePPA(http.ResponseWriter, *http.Request)
	GetPlayerSeasonPPA(http.ResponseWriter, *http.Request)
	GetPredictedPoints(http.ResponseWriter, *http.Request)
	GetPregameWinProbabilities(http.ResponseWriter, *http.Request)
	GetTeamPPA(http.ResponseWriter, *http.Request)
	GetWinProbabilityData(http.ResponseWriter, *http.Request)
}
// PlayersAPIRouter defines the required methods for binding the api requests to a responses for the PlayersAPI
// The PlayersAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PlayersAPIServicer to perform the required actions, then write the service results to the http response.
type PlayersAPIRouter interface { 
	GetPlayerSeasonStats(http.ResponseWriter, *http.Request)
	GetPlayerUsage(http.ResponseWriter, *http.Request)
	GetReturningProduction(http.ResponseWriter, *http.Request)
	GetTransferPortal(http.ResponseWriter, *http.Request)
	PlayerSearch(http.ResponseWriter, *http.Request)
}
// PlaysAPIRouter defines the required methods for binding the api requests to a responses for the PlaysAPI
// The PlaysAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PlaysAPIServicer to perform the required actions, then write the service results to the http response.
type PlaysAPIRouter interface { 
	GetLivePlays(http.ResponseWriter, *http.Request)
	GetPlayStatTypes(http.ResponseWriter, *http.Request)
	GetPlayStats(http.ResponseWriter, *http.Request)
	GetPlayTypes(http.ResponseWriter, *http.Request)
	GetPlays(http.ResponseWriter, *http.Request)
}
// RankingsAPIRouter defines the required methods for binding the api requests to a responses for the RankingsAPI
// The RankingsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a RankingsAPIServicer to perform the required actions, then write the service results to the http response.
type RankingsAPIRouter interface { 
	GetRankings(http.ResponseWriter, *http.Request)
}
// RatingsAPIRouter defines the required methods for binding the api requests to a responses for the RatingsAPI
// The RatingsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a RatingsAPIServicer to perform the required actions, then write the service results to the http response.
type RatingsAPIRouter interface { 
	GetConferenceSPRatings(http.ResponseWriter, *http.Request)
	GetEloRatings(http.ResponseWriter, *http.Request)
	GetSPRatings(http.ResponseWriter, *http.Request)
	GetSRSRatings(http.ResponseWriter, *http.Request)
}
// RecruitingAPIRouter defines the required methods for binding the api requests to a responses for the RecruitingAPI
// The RecruitingAPIRouter implementation should parse necessary information from the http request,
// pass the data to a RecruitingAPIServicer to perform the required actions, then write the service results to the http response.
type RecruitingAPIRouter interface { 
	GetRecruitingGroups(http.ResponseWriter, *http.Request)
	GetRecruitingPlayers(http.ResponseWriter, *http.Request)
	GetRecruitingTeams(http.ResponseWriter, *http.Request)
}
// StatsAPIRouter defines the required methods for binding the api requests to a responses for the StatsAPI
// The StatsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a StatsAPIServicer to perform the required actions, then write the service results to the http response.
type StatsAPIRouter interface { 
	GetAdvancedTeamGameStats(http.ResponseWriter, *http.Request)
	GetAdvancedTeamSeasonStats(http.ResponseWriter, *http.Request)
	GetStatCategories(http.ResponseWriter, *http.Request)
	GetTeamSeasonStats(http.ResponseWriter, *http.Request)
}
// TeamsAPIRouter defines the required methods for binding the api requests to a responses for the TeamsAPI
// The TeamsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a TeamsAPIServicer to perform the required actions, then write the service results to the http response.
type TeamsAPIRouter interface { 
	GetFbsTeams(http.ResponseWriter, *http.Request)
	GetRoster(http.ResponseWriter, *http.Request)
	GetTalent(http.ResponseWriter, *http.Request)
	GetTeamMatchup(http.ResponseWriter, *http.Request)
	GetTeams(http.ResponseWriter, *http.Request)
}
// VenuesAPIRouter defines the required methods for binding the api requests to a responses for the VenuesAPI
// The VenuesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a VenuesAPIServicer to perform the required actions, then write the service results to the http response.
type VenuesAPIRouter interface { 
	GetVenues(http.ResponseWriter, *http.Request)
}


// BettingAPIServicer defines the api actions for the BettingAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type BettingAPIServicer interface { 
	GetLines(context.Context, int32, int32, int32, string, string, string, string, string) (ImplResponse, error)
}


// CoachesAPIServicer defines the api actions for the CoachesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type CoachesAPIServicer interface { 
	GetCoaches(context.Context, string, string, string, int32, int32, int32) (ImplResponse, error)
}


// ConferencesAPIServicer defines the api actions for the ConferencesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ConferencesAPIServicer interface { 
	GetConferences(context.Context) (ImplResponse, error)
}


// DraftAPIServicer defines the api actions for the DraftAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type DraftAPIServicer interface { 
	GetDraftPicks(context.Context, int32, string, string, string, string) (ImplResponse, error)
	GetNFLPositions(context.Context) (ImplResponse, error)
	GetNFLTeams(context.Context) (ImplResponse, error)
}


// DrivesAPIServicer defines the api actions for the DrivesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type DrivesAPIServicer interface { 
	GetDrives(context.Context, int32, string, int32, string, string, string, string, string, string, string) (ImplResponse, error)
}


// GamesAPIServicer defines the api actions for the GamesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type GamesAPIServicer interface { 
	GetAdvancedBoxScore(context.Context, int32) (ImplResponse, error)
	GetCalendar(context.Context, int32) (ImplResponse, error)
	GetGameMedia(context.Context, int32, int32, string, string, string, string, string) (ImplResponse, error)
	GetGameWeather(context.Context, int32, int32, int32, string, string, string, string) (ImplResponse, error)
	GetGames(context.Context, int32, int32, string, string, string, string, string, string, int32) (ImplResponse, error)
	GetPlayerGameStats(context.Context, int32, int32, string, string, string, string, int32) (ImplResponse, error)
	GetScoreboard(context.Context, string, string) (ImplResponse, error)
	GetTeamGameStats(context.Context, int32, int32, string, string, string, int32, string) (ImplResponse, error)
	GetTeamRecords(context.Context, int32, string, string) (ImplResponse, error)
}


// MetricsAPIServicer defines the api actions for the MetricsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type MetricsAPIServicer interface { 
	GetGamePPA(context.Context, int32, int32, string, string, bool, string) (ImplResponse, error)
	GetPlayerGamePPA(context.Context, int32, int32, string, string, int32, string, bool, string) (ImplResponse, error)
	GetPlayerSeasonPPA(context.Context, int32, string, string, string, int32, string, bool) (ImplResponse, error)
	GetPredictedPoints(context.Context, int32, int32) (ImplResponse, error)
	GetPregameWinProbabilities(context.Context, int32, int32, string, string) (ImplResponse, error)
	GetTeamPPA(context.Context, int32, string, string, bool) (ImplResponse, error)
	GetWinProbabilityData(context.Context, int32) (ImplResponse, error)
}


// PlayersAPIServicer defines the api actions for the PlayersAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PlayersAPIServicer interface { 
	GetPlayerSeasonStats(context.Context, int32, string, string, int32, int32, string, string) (ImplResponse, error)
	GetPlayerUsage(context.Context, int32, string, string, string, int32, bool) (ImplResponse, error)
	GetReturningProduction(context.Context, int32, string, string) (ImplResponse, error)
	GetTransferPortal(context.Context, int32) (ImplResponse, error)
	PlayerSearch(context.Context, string, string, string, int32) (ImplResponse, error)
}


// PlaysAPIServicer defines the api actions for the PlaysAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PlaysAPIServicer interface { 
	GetLivePlays(context.Context, int32) (ImplResponse, error)
	GetPlayStatTypes(context.Context) (ImplResponse, error)
	GetPlayStats(context.Context, int32, int32, string, int32, int32, int32, string, string) (ImplResponse, error)
	GetPlayTypes(context.Context) (ImplResponse, error)
	GetPlays(context.Context, int32, int32, string, string, string, string, string, string, string, int32, string) (ImplResponse, error)
}


// RankingsAPIServicer defines the api actions for the RankingsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type RankingsAPIServicer interface { 
	GetRankings(context.Context, int32, int32, string) (ImplResponse, error)
}


// RatingsAPIServicer defines the api actions for the RatingsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type RatingsAPIServicer interface { 
	GetConferenceSPRatings(context.Context, int32, string) (ImplResponse, error)
	GetEloRatings(context.Context, int32, int32, string, string) (ImplResponse, error)
	GetSPRatings(context.Context, int32, string) (ImplResponse, error)
	GetSRSRatings(context.Context, int32, string, string) (ImplResponse, error)
}


// RecruitingAPIServicer defines the api actions for the RecruitingAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type RecruitingAPIServicer interface { 
	GetRecruitingGroups(context.Context, int32, int32, string, string) (ImplResponse, error)
	GetRecruitingPlayers(context.Context, int32, string, string, string, string) (ImplResponse, error)
	GetRecruitingTeams(context.Context, int32, string) (ImplResponse, error)
}


// StatsAPIServicer defines the api actions for the StatsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type StatsAPIServicer interface { 
	GetAdvancedTeamGameStats(context.Context, int32, int32, string, string, bool, string) (ImplResponse, error)
	GetAdvancedTeamSeasonStats(context.Context, int32, string, bool, int32, int32) (ImplResponse, error)
	GetStatCategories(context.Context) (ImplResponse, error)
	GetTeamSeasonStats(context.Context, int32, string, string, int32, int32) (ImplResponse, error)
}


// TeamsAPIServicer defines the api actions for the TeamsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type TeamsAPIServicer interface { 
	GetFbsTeams(context.Context, int32) (ImplResponse, error)
	GetRoster(context.Context, string, int32) (ImplResponse, error)
	GetTalent(context.Context, int32) (ImplResponse, error)
	GetTeamMatchup(context.Context, string, string, int32, int32) (ImplResponse, error)
	GetTeams(context.Context, string) (ImplResponse, error)
}


// VenuesAPIServicer defines the api actions for the VenuesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type VenuesAPIServicer interface { 
	GetVenues(context.Context) (ImplResponse, error)
}