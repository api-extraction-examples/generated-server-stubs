/*
 * httpbin.org
 *
 * A simple HTTP Request & Response Service.<br/> <br/> <b>Run locally: </b> <code>$ docker run -p 80:80 kennethreitz/httpbin</code>
 *
 * API version: 0.9.2
 * Contact: me@kennethreitz.org
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// ImplResponse defines an implementation response with error code and the associated body
type ImplResponse struct {
	Code int
	Body interface{}
}
