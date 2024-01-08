/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * API version: 1.0
 * Contact: nishu@mediumapi.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type MiscAPI struct {
}

// Get /latestposts/:topic_slug
// Get Latest Posts 
func (api *MiscAPI) LatestpostsTopicSlugGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /related_tags/:tag
// Get Related Tags 
func (api *MiscAPI) RelatedTagsTagGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /top_writer/:topic_slug
// Get Top Writers 
func (api *MiscAPI) TopWriterTopicSlugGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /topfeeds/:tag/:mode
// Get Topfeeds 
func (api *MiscAPI) TopfeedsTagModeGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
