/*
 * Instagram API
 *
 * Description of Instagram RESTful API.  Current limitations:   * Instagram service does not support [cross origin headers](https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS)   for security reasons, therefore it is not possible to use Swagger UI and make API calls directly from browser.   * Modification API requests (`POST`, `DELETE`) require additional security [scopes](https://instagram.com/developer/authorization/)   that are available for Apps [created on or after Nov 17, 2015](http://instagram.com/developer/review/) and   started in [Sandbox Mode](http://instagram.com/developer/sandbox/).   * Consider the [Instagram limitations](https://instagram.com/developer/limits/) for API calls that depends on App Mode.  **Warning:** For Apps [created on or after Nov 17, 2015](http://instagram.com/developer/changelog/) API responses containing media objects no longer return the `data` field in `comments` and `likes` nodes.  Last update: 2015-11-28 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CaptionData struct {

	// Caption creation UNIX timestamp
	CreatedTime string `json:"created_time,omitempty"`

	From UserShortInfo `json:"from,omitempty"`

	// ID of this caption
	Id string `json:"id,omitempty"`

	// Caption text
	Text string `json:"text,omitempty"`
}

// AssertCaptionDataRequired checks if the required fields are not zero-ed
func AssertCaptionDataRequired(obj CaptionData) error {
	if err := AssertUserShortInfoRequired(obj.From); err != nil {
		return err
	}
	return nil
}

// AssertCaptionDataConstraints checks if the values respects the defined constraints
func AssertCaptionDataConstraints(obj CaptionData) error {
	return nil
}