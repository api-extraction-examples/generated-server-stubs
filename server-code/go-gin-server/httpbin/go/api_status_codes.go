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

type StatusCodesAPI struct {
}

// Delete /status/:codes
// Return status code or random status code if more than one are given 
func (api *StatusCodesAPI) StatusCodesDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /status/:codes
// Return status code or random status code if more than one are given 
func (api *StatusCodesAPI) StatusCodesGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Patch /status/:codes
// Return status code or random status code if more than one are given 
func (api *StatusCodesAPI) StatusCodesPatch(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /status/:codes
// Return status code or random status code if more than one are given 
func (api *StatusCodesAPI) StatusCodesPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /status/:codes
// Return status code or random status code if more than one are given 
func (api *StatusCodesAPI) StatusCodesPut(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Trace /status/:codes
// Return status code or random status code if more than one are given 
func (api *StatusCodesAPI) StatusCodesTrace(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
