/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * API version: 1.0.0
 * Contact: api-support@lyft.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type PublicAPI struct {
}

// Get /v1/cost
// Cost estimates 
func (api *PublicAPI) GetCost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/drivers
// Available drivers nearby 
func (api *PublicAPI) GetDrivers(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/eta
// Pickup ETAs 
func (api *PublicAPI) GetETA(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/ridetypes
// Types of rides 
func (api *PublicAPI) GetRideTypes(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

