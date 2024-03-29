/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type ProjectsAPI struct {
}

// Post /api/1.0/projects/:project_gid/addCustomFieldSetting
// Add a custom field to a project 
func (api *ProjectsAPI) AddCustomFieldSettingForProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/projects/:project_gid/addFollowers
// Add followers to a project 
func (api *ProjectsAPI) AddFollowersForProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/projects/:project_gid/addMembers
// Add users to a project 
func (api *ProjectsAPI) AddMembersForProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/projects
// Create a project 
func (api *ProjectsAPI) CreateProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/teams/:team_gid/projects
// Create a project in a team 
func (api *ProjectsAPI) CreateProjectForTeam(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/workspaces/:workspace_gid/projects
// Create a project in a workspace 
func (api *ProjectsAPI) CreateProjectForWorkspace(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/1.0/projects/:project_gid
// Delete a project 
func (api *ProjectsAPI) DeleteProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/projects/:project_gid/duplicate
// Duplicate a project 
func (api *ProjectsAPI) DuplicateProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/projects/:project_gid
// Get a project 
func (api *ProjectsAPI) GetProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/projects
// Get multiple projects 
func (api *ProjectsAPI) GetProjects(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/tasks/:task_gid/projects
// Get projects a task is in 
func (api *ProjectsAPI) GetProjectsForTask(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/teams/:team_gid/projects
// Get a team's projects 
func (api *ProjectsAPI) GetProjectsForTeam(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/workspaces/:workspace_gid/projects
// Get all projects in a workspace 
func (api *ProjectsAPI) GetProjectsForWorkspace(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/1.0/projects/:project_gid/task_counts
// Get task count of a project 
func (api *ProjectsAPI) GetTaskCountsForProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/projects/:project_gid/saveAsTemplate
// Create a project template from a project 
func (api *ProjectsAPI) ProjectSaveAsTemplate(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/projects/:project_gid/removeCustomFieldSetting
// Remove a custom field from a project 
func (api *ProjectsAPI) RemoveCustomFieldSettingForProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/projects/:project_gid/removeFollowers
// Remove followers from a project 
func (api *ProjectsAPI) RemoveFollowersForProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/1.0/projects/:project_gid/removeMembers
// Remove users from a project 
func (api *ProjectsAPI) RemoveMembersForProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /api/1.0/projects/:project_gid
// Update a project 
func (api *ProjectsAPI) UpdateProject(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

