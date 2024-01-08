/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type IssueSecuritySchemesAPI struct {
}

// Put /rest/api/3/issuesecurityschemes/:schemeId/level
// Add issue security levels 
func (api *IssueSecuritySchemesAPI) AddSecurityLevel(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/issuesecurityschemes/:schemeId/level/:levelId/member
// Add issue security level members 
func (api *IssueSecuritySchemesAPI) AddSecurityLevelMembers(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /rest/api/3/issuesecurityschemes
// Create issue security scheme 
func (api *IssueSecuritySchemesAPI) CreateIssueSecurityScheme(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /rest/api/3/issuesecurityschemes/:schemeId
// Delete issue security scheme 
func (api *IssueSecuritySchemesAPI) DeleteSecurityScheme(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/issuesecurityschemes/:id
// Get issue security scheme 
func (api *IssueSecuritySchemesAPI) GetIssueSecurityScheme(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/issuesecurityschemes
// Get issue security schemes 
func (api *IssueSecuritySchemesAPI) GetIssueSecuritySchemes(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/issuesecurityschemes/level/member
// Get issue security level members 
func (api *IssueSecuritySchemesAPI) GetSecurityLevelMembers(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/issuesecurityschemes/level
// Get issue security levels 
func (api *IssueSecuritySchemesAPI) GetSecurityLevels(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /rest/api/3/issuesecurityschemes/:schemeId/level/:levelId
// Remove issue security level 
func (api *IssueSecuritySchemesAPI) RemoveLevel(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /rest/api/3/issuesecurityschemes/:schemeId/level/:levelId/member/:memberId
// Remove member from issue security level 
func (api *IssueSecuritySchemesAPI) RemoveMemberFromSecurityLevel(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/issuesecurityschemes/project
// Get projects using issue security schemes 
func (api *IssueSecuritySchemesAPI) SearchProjectsUsingSecuritySchemes(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/issuesecurityschemes/search
// Search issue security schemes 
func (api *IssueSecuritySchemesAPI) SearchSecuritySchemes(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/issuesecurityschemes/level/default
// Set default issue security levels 
func (api *IssueSecuritySchemesAPI) SetDefaultLevels(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/issuesecurityschemes/:id
// Update issue security scheme 
func (api *IssueSecuritySchemesAPI) UpdateIssueSecurityScheme(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/issuesecurityschemes/:schemeId/level/:levelId
// Update issue security level 
func (api *IssueSecuritySchemesAPI) UpdateSecurityLevel(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
