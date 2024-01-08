/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type RecommendationType string

// List of RecommendationType
const (
	SIMILAR_TO_RECENTLY_PLAYED RecommendationType = "SimilarToRecentlyPlayed"
	SIMILAR_TO_LIKED_ITEM RecommendationType = "SimilarToLikedItem"
	HAS_DIRECTOR_FROM_RECENTLY_PLAYED RecommendationType = "HasDirectorFromRecentlyPlayed"
	HAS_ACTOR_FROM_RECENTLY_PLAYED RecommendationType = "HasActorFromRecentlyPlayed"
	HAS_LIKED_DIRECTOR RecommendationType = "HasLikedDirector"
	HAS_LIKED_ACTOR RecommendationType = "HasLikedActor"
)
