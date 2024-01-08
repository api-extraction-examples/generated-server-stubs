/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Programme struct {

	Images []Image `json:"images"`

	LatestAvailableEpisodes []EpisodeSummary `json:"latest_available_episodes,omitempty"`

	NetworkSummary NetworkSummary `json:"network_summary"`

	Pid string `json:"pid"`

	ShortSynopsis string `json:"short_synopsis"`

	Titles ProgrammeTitles `json:"titles"`

	TotalAvailableEpisodes int32 `json:"total_available_episodes,omitempty"`

	Type string `json:"type"`
}

// AssertProgrammeRequired checks if the required fields are not zero-ed
func AssertProgrammeRequired(obj Programme) error {
	elements := map[string]interface{}{
		"images": obj.Images,
		"network_summary": obj.NetworkSummary,
		"pid": obj.Pid,
		"short_synopsis": obj.ShortSynopsis,
		"titles": obj.Titles,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Images {
		if err := AssertImageRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.LatestAvailableEpisodes {
		if err := AssertEpisodeSummaryRequired(el); err != nil {
			return err
		}
	}
	if err := AssertNetworkSummaryRequired(obj.NetworkSummary); err != nil {
		return err
	}
	if err := AssertProgrammeTitlesRequired(obj.Titles); err != nil {
		return err
	}
	return nil
}

// AssertProgrammeConstraints checks if the values respects the defined constraints
func AssertProgrammeConstraints(obj Programme) error {
	return nil
}