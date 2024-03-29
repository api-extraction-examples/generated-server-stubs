/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type DistributionsAPI struct {
}

// Put /distributions/bulk_replace
// Bulk replace all distributions. 
func (api *DistributionsAPI) DistributionsBulkReplacePut(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /distributions/:distribution_id
// Delete a distribution. 
func (api *DistributionsAPI) DistributionsDistributionIdDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /distributions/:distribution_id
// Show a distribution. 
func (api *DistributionsAPI) DistributionsDistributionIdGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /distributions/:distribution_id
// Update a distribution. 
func (api *DistributionsAPI) DistributionsDistributionIdPut(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /distributions
// List all distributions. 
func (api *DistributionsAPI) DistributionsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /distributions/include_remotes
// List all distributions including remote. 
func (api *DistributionsAPI) DistributionsIncludeRemotesGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /distributions
// Create a distribution. 
func (api *DistributionsAPI) DistributionsPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

