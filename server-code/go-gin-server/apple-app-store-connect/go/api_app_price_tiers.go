/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type AppPriceTiersAPI struct {
}

// Get /v1/appPriceTiers
func (api *AppPriceTiersAPI) AppPriceTiersGetCollection(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/appPriceTiers/:id
func (api *AppPriceTiersAPI) AppPriceTiersGetInstance(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/appPriceTiers/:id/pricePoints
func (api *AppPriceTiersAPI) AppPriceTiersPricePointsGetToManyRelated(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

