/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type ScheduledTasksAPI struct {
}

// Get /ScheduledTasks/:taskId
// Get task by id. 
func (api *ScheduledTasksAPI) GetTask(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /ScheduledTasks
// Get tasks. 
func (api *ScheduledTasksAPI) GetTasks(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /ScheduledTasks/Running/:taskId
// Start specified task. 
func (api *ScheduledTasksAPI) StartTask(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /ScheduledTasks/Running/:taskId
// Stop specified task. 
func (api *ScheduledTasksAPI) StopTask(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /ScheduledTasks/:taskId/Triggers
// Update specified task triggers. 
func (api *ScheduledTasksAPI) UpdateTask(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

