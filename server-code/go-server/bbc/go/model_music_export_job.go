/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type MusicExportJob struct {

	CreatedAt string `json:"created_at"`

	Id string `json:"id"`

	JobId string `json:"job_id"`

	Status string `json:"status"`

	Vendor string `json:"vendor"`
}

// AssertMusicExportJobRequired checks if the required fields are not zero-ed
func AssertMusicExportJobRequired(obj MusicExportJob) error {
	elements := map[string]interface{}{
		"created_at": obj.CreatedAt,
		"id": obj.Id,
		"job_id": obj.JobId,
		"status": obj.Status,
		"vendor": obj.Vendor,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertMusicExportJobConstraints checks if the values respects the defined constraints
func AssertMusicExportJobConstraints(obj MusicExportJob) error {
	return nil
}
