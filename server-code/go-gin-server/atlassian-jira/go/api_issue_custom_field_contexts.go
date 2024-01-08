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

type IssueCustomFieldContextsAPI struct {
}

// Put /rest/api/3/field/:fieldId/context/:contextId/issuetype
// Add issue types to context 
func (api *IssueCustomFieldContextsAPI) AddIssueTypesToContext(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/field/:fieldId/context/:contextId/project
// Assign custom field context to projects 
func (api *IssueCustomFieldContextsAPI) AssignProjectsToCustomFieldContext(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /rest/api/3/field/:fieldId/context
// Create custom field context 
func (api *IssueCustomFieldContextsAPI) CreateCustomFieldContext(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /rest/api/3/field/:fieldId/context/:contextId
// Delete custom field context 
func (api *IssueCustomFieldContextsAPI) DeleteCustomFieldContext(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/field/:fieldId/context
// Get custom field contexts 
func (api *IssueCustomFieldContextsAPI) GetContextsForField(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /rest/api/3/field/:fieldId/context/mapping
// Get custom field contexts for projects and issue types 
func (api *IssueCustomFieldContextsAPI) GetCustomFieldContextsForProjectsAndIssueTypes(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/field/:fieldId/context/defaultValue
// Get custom field contexts default values 
func (api *IssueCustomFieldContextsAPI) GetDefaultValues(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/field/:fieldId/context/issuetypemapping
// Get issue types for custom field context 
func (api *IssueCustomFieldContextsAPI) GetIssueTypeMappingsForContexts(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /rest/api/3/field/:fieldId/context/projectmapping
// Get project mappings for custom field context 
func (api *IssueCustomFieldContextsAPI) GetProjectContextMapping(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /rest/api/3/field/:fieldId/context/:contextId/project/remove
// Remove custom field context from projects 
func (api *IssueCustomFieldContextsAPI) RemoveCustomFieldContextFromProjects(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /rest/api/3/field/:fieldId/context/:contextId/issuetype/remove
// Remove issue types from context 
func (api *IssueCustomFieldContextsAPI) RemoveIssueTypesFromContext(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/field/:fieldId/context/defaultValue
// Set custom field contexts default values 
func (api *IssueCustomFieldContextsAPI) SetDefaultValues(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /rest/api/3/field/:fieldId/context/:contextId
// Update custom field context 
func (api *IssueCustomFieldContextsAPI) UpdateCustomFieldContext(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

