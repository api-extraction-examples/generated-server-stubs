/*
 * Instagram API
 *
 * Description of Instagram RESTful API.  Current limitations:   * Instagram service does not support [cross origin headers](https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS)   for security reasons, therefore it is not possible to use Swagger UI and make API calls directly from browser.   * Modification API requests (`POST`, `DELETE`) require additional security [scopes](https://instagram.com/developer/authorization/)   that are available for Apps [created on or after Nov 17, 2015](http://instagram.com/developer/review/) and   started in [Sandbox Mode](http://instagram.com/developer/sandbox/).   * Consider the [Instagram limitations](https://instagram.com/developer/limits/) for API calls that depends on App Mode.  **Warning:** For Apps [created on or after Nov 17, 2015](http://instagram.com/developer/changelog/) API responses containing media objects no longer return the `data` field in `comments` and `likes` nodes.  Last update: 2015-11-28 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CursorPaginationInfo struct {

	// The cursor ID of the next page
	NextCursor string `json:"next_cursor,omitempty"`

	// URL to retrieve next page of entries
	NextUrl string `json:"next_url,omitempty"`
}

// AssertCursorPaginationInfoRequired checks if the required fields are not zero-ed
func AssertCursorPaginationInfoRequired(obj CursorPaginationInfo) error {
	return nil
}

// AssertCursorPaginationInfoConstraints checks if the values respects the defined constraints
func AssertCursorPaginationInfoConstraints(obj CursorPaginationInfo) error {
	return nil
}
