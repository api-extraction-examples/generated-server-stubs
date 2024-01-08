/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type SeriesSummary struct {

	Ancestors []AncestorSummary `json:"ancestors"`

	Images []Image `json:"images"`

	LatestAvailableEpisodes []EpisodeSummary `json:"latest_available_episodes"`

	NetworkSummary NetworkSummary `json:"network_summary"`

	Pid string `json:"pid"`

	ShortSynopsis string `json:"short_synopsis"`

	Titles ProgrammeTitles `json:"titles"`

	TotalAvailableEpisodes int32 `json:"total_available_episodes"`

	Type string `json:"type"`
}