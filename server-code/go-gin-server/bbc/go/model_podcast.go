/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type Podcast struct {

	CategorySummaries []CategorySummary `json:"category_summaries"`

	DaysAvailable int32 `json:"days_available"`

	EntityType string `json:"entity_type"`

	FirstPublishedDate string `json:"first_published_date"`

	Frequency string `json:"frequency"`

	Images []Image `json:"images"`

	LatestAvailableEpisodes []PodcastEpisodeSummary `json:"latest_available_episodes"`

	NetworkSummary NetworkSummary `json:"network_summary"`

	Pid string `json:"pid"`

	RssUrl string `json:"rss_url"`

	Synopses PodcastSynopses `json:"synopses"`

	Territory string `json:"territory"`

	Titles ProgrammeTitles `json:"titles"`

	TotalAvailableEpisodes int32 `json:"total_available_episodes"`

	Type string `json:"type"`

	UpdatedAt string `json:"updated_at"`
}
