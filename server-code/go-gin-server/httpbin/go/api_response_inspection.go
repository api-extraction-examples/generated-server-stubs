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

import (
	"github.com/gin-gonic/gin"
)

type ResponseInspectionAPI struct {
}

// Get /cache
// Returns a 304 if an If-Modified-Since header or If-None-Match is present. Returns the same as a GET otherwise. 
func (api *ResponseInspectionAPI) CacheGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /cache/:value
// Sets a Cache-Control header for n seconds. 
func (api *ResponseInspectionAPI) CacheValueGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /etag/:etag
// Assumes the resource has the given etag and responds to If-None-Match and If-Match headers appropriately. 
func (api *ResponseInspectionAPI) EtagEtagGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /response-headers
// Returns a set of response headers from the query string. 
func (api *ResponseInspectionAPI) ResponseHeadersGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /response-headers
// Returns a set of response headers from the query string. 
func (api *ResponseInspectionAPI) ResponseHeadersPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

