/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package main

import (
	"log"
	"net/http"

	openapi "github.com/GIT_USER_ID/GIT_REPO_ID/go"
)

func main() {
	log.Printf("Server started")

	AnnouncementBannerAPIService := openapi.NewAnnouncementBannerAPIService()
	AnnouncementBannerAPIController := openapi.NewAnnouncementBannerAPIController(AnnouncementBannerAPIService)

	AppMigrationAPIService := openapi.NewAppMigrationAPIService()
	AppMigrationAPIController := openapi.NewAppMigrationAPIController(AppMigrationAPIService)

	AppPropertiesAPIService := openapi.NewAppPropertiesAPIService()
	AppPropertiesAPIController := openapi.NewAppPropertiesAPIController(AppPropertiesAPIService)

	ApplicationRolesAPIService := openapi.NewApplicationRolesAPIService()
	ApplicationRolesAPIController := openapi.NewApplicationRolesAPIController(ApplicationRolesAPIService)

	AuditRecordsAPIService := openapi.NewAuditRecordsAPIService()
	AuditRecordsAPIController := openapi.NewAuditRecordsAPIController(AuditRecordsAPIService)

	AvatarsAPIService := openapi.NewAvatarsAPIService()
	AvatarsAPIController := openapi.NewAvatarsAPIController(AvatarsAPIService)

	DashboardsAPIService := openapi.NewDashboardsAPIService()
	DashboardsAPIController := openapi.NewDashboardsAPIController(DashboardsAPIService)

	DynamicModulesAPIService := openapi.NewDynamicModulesAPIService()
	DynamicModulesAPIController := openapi.NewDynamicModulesAPIController(DynamicModulesAPIService)

	FilterSharingAPIService := openapi.NewFilterSharingAPIService()
	FilterSharingAPIController := openapi.NewFilterSharingAPIController(FilterSharingAPIService)

	FiltersAPIService := openapi.NewFiltersAPIService()
	FiltersAPIController := openapi.NewFiltersAPIController(FiltersAPIService)

	GroupAndUserPickerAPIService := openapi.NewGroupAndUserPickerAPIService()
	GroupAndUserPickerAPIController := openapi.NewGroupAndUserPickerAPIController(GroupAndUserPickerAPIService)

	GroupsAPIService := openapi.NewGroupsAPIService()
	GroupsAPIController := openapi.NewGroupsAPIController(GroupsAPIService)

	InstanceInformationAPIService := openapi.NewInstanceInformationAPIService()
	InstanceInformationAPIController := openapi.NewInstanceInformationAPIController(InstanceInformationAPIService)

	IssueAttachmentsAPIService := openapi.NewIssueAttachmentsAPIService()
	IssueAttachmentsAPIController := openapi.NewIssueAttachmentsAPIController(IssueAttachmentsAPIService)

	IssueCommentPropertiesAPIService := openapi.NewIssueCommentPropertiesAPIService()
	IssueCommentPropertiesAPIController := openapi.NewIssueCommentPropertiesAPIController(IssueCommentPropertiesAPIService)

	IssueCommentsAPIService := openapi.NewIssueCommentsAPIService()
	IssueCommentsAPIController := openapi.NewIssueCommentsAPIController(IssueCommentsAPIService)

	IssueCustomFieldConfigurationAppsAPIService := openapi.NewIssueCustomFieldConfigurationAppsAPIService()
	IssueCustomFieldConfigurationAppsAPIController := openapi.NewIssueCustomFieldConfigurationAppsAPIController(IssueCustomFieldConfigurationAppsAPIService)

	IssueCustomFieldContextsAPIService := openapi.NewIssueCustomFieldContextsAPIService()
	IssueCustomFieldContextsAPIController := openapi.NewIssueCustomFieldContextsAPIController(IssueCustomFieldContextsAPIService)

	IssueCustomFieldOptionsAPIService := openapi.NewIssueCustomFieldOptionsAPIService()
	IssueCustomFieldOptionsAPIController := openapi.NewIssueCustomFieldOptionsAPIController(IssueCustomFieldOptionsAPIService)

	IssueCustomFieldOptionsAppsAPIService := openapi.NewIssueCustomFieldOptionsAppsAPIService()
	IssueCustomFieldOptionsAppsAPIController := openapi.NewIssueCustomFieldOptionsAppsAPIController(IssueCustomFieldOptionsAppsAPIService)

	IssueCustomFieldValuesAppsAPIService := openapi.NewIssueCustomFieldValuesAppsAPIService()
	IssueCustomFieldValuesAppsAPIController := openapi.NewIssueCustomFieldValuesAppsAPIController(IssueCustomFieldValuesAppsAPIService)

	IssueFieldConfigurationsAPIService := openapi.NewIssueFieldConfigurationsAPIService()
	IssueFieldConfigurationsAPIController := openapi.NewIssueFieldConfigurationsAPIController(IssueFieldConfigurationsAPIService)

	IssueFieldsAPIService := openapi.NewIssueFieldsAPIService()
	IssueFieldsAPIController := openapi.NewIssueFieldsAPIController(IssueFieldsAPIService)

	IssueLinkTypesAPIService := openapi.NewIssueLinkTypesAPIService()
	IssueLinkTypesAPIController := openapi.NewIssueLinkTypesAPIController(IssueLinkTypesAPIService)

	IssueLinksAPIService := openapi.NewIssueLinksAPIService()
	IssueLinksAPIController := openapi.NewIssueLinksAPIController(IssueLinksAPIService)

	IssueNavigatorSettingsAPIService := openapi.NewIssueNavigatorSettingsAPIService()
	IssueNavigatorSettingsAPIController := openapi.NewIssueNavigatorSettingsAPIController(IssueNavigatorSettingsAPIService)

	IssueNotificationSchemesAPIService := openapi.NewIssueNotificationSchemesAPIService()
	IssueNotificationSchemesAPIController := openapi.NewIssueNotificationSchemesAPIController(IssueNotificationSchemesAPIService)

	IssuePrioritiesAPIService := openapi.NewIssuePrioritiesAPIService()
	IssuePrioritiesAPIController := openapi.NewIssuePrioritiesAPIController(IssuePrioritiesAPIService)

	IssuePropertiesAPIService := openapi.NewIssuePropertiesAPIService()
	IssuePropertiesAPIController := openapi.NewIssuePropertiesAPIController(IssuePropertiesAPIService)

	IssueRemoteLinksAPIService := openapi.NewIssueRemoteLinksAPIService()
	IssueRemoteLinksAPIController := openapi.NewIssueRemoteLinksAPIController(IssueRemoteLinksAPIService)

	IssueResolutionsAPIService := openapi.NewIssueResolutionsAPIService()
	IssueResolutionsAPIController := openapi.NewIssueResolutionsAPIController(IssueResolutionsAPIService)

	IssueSearchAPIService := openapi.NewIssueSearchAPIService()
	IssueSearchAPIController := openapi.NewIssueSearchAPIController(IssueSearchAPIService)

	IssueSecurityLevelAPIService := openapi.NewIssueSecurityLevelAPIService()
	IssueSecurityLevelAPIController := openapi.NewIssueSecurityLevelAPIController(IssueSecurityLevelAPIService)

	IssueSecuritySchemesAPIService := openapi.NewIssueSecuritySchemesAPIService()
	IssueSecuritySchemesAPIController := openapi.NewIssueSecuritySchemesAPIController(IssueSecuritySchemesAPIService)

	IssueTypePropertiesAPIService := openapi.NewIssueTypePropertiesAPIService()
	IssueTypePropertiesAPIController := openapi.NewIssueTypePropertiesAPIController(IssueTypePropertiesAPIService)

	IssueTypeSchemesAPIService := openapi.NewIssueTypeSchemesAPIService()
	IssueTypeSchemesAPIController := openapi.NewIssueTypeSchemesAPIController(IssueTypeSchemesAPIService)

	IssueTypeScreenSchemesAPIService := openapi.NewIssueTypeScreenSchemesAPIService()
	IssueTypeScreenSchemesAPIController := openapi.NewIssueTypeScreenSchemesAPIController(IssueTypeScreenSchemesAPIService)

	IssueTypesAPIService := openapi.NewIssueTypesAPIService()
	IssueTypesAPIController := openapi.NewIssueTypesAPIController(IssueTypesAPIService)

	IssueVotesAPIService := openapi.NewIssueVotesAPIService()
	IssueVotesAPIController := openapi.NewIssueVotesAPIController(IssueVotesAPIService)

	IssueWatchersAPIService := openapi.NewIssueWatchersAPIService()
	IssueWatchersAPIController := openapi.NewIssueWatchersAPIController(IssueWatchersAPIService)

	IssueWorklogPropertiesAPIService := openapi.NewIssueWorklogPropertiesAPIService()
	IssueWorklogPropertiesAPIController := openapi.NewIssueWorklogPropertiesAPIController(IssueWorklogPropertiesAPIService)

	IssueWorklogsAPIService := openapi.NewIssueWorklogsAPIService()
	IssueWorklogsAPIController := openapi.NewIssueWorklogsAPIController(IssueWorklogsAPIService)

	IssuesAPIService := openapi.NewIssuesAPIService()
	IssuesAPIController := openapi.NewIssuesAPIController(IssuesAPIService)

	JQLAPIService := openapi.NewJQLAPIService()
	JQLAPIController := openapi.NewJQLAPIController(JQLAPIService)

	JQLFunctionsAppsAPIService := openapi.NewJQLFunctionsAppsAPIService()
	JQLFunctionsAppsAPIController := openapi.NewJQLFunctionsAppsAPIController(JQLFunctionsAppsAPIService)

	JiraExpressionsAPIService := openapi.NewJiraExpressionsAPIService()
	JiraExpressionsAPIController := openapi.NewJiraExpressionsAPIController(JiraExpressionsAPIService)

	JiraSettingsAPIService := openapi.NewJiraSettingsAPIService()
	JiraSettingsAPIController := openapi.NewJiraSettingsAPIController(JiraSettingsAPIService)

	LabelsAPIService := openapi.NewLabelsAPIService()
	LabelsAPIController := openapi.NewLabelsAPIController(LabelsAPIService)

	LicenseMetricsAPIService := openapi.NewLicenseMetricsAPIService()
	LicenseMetricsAPIController := openapi.NewLicenseMetricsAPIController(LicenseMetricsAPIService)

	MyselfAPIService := openapi.NewMyselfAPIService()
	MyselfAPIController := openapi.NewMyselfAPIController(MyselfAPIService)

	PermissionSchemesAPIService := openapi.NewPermissionSchemesAPIService()
	PermissionSchemesAPIController := openapi.NewPermissionSchemesAPIController(PermissionSchemesAPIService)

	PermissionsAPIService := openapi.NewPermissionsAPIService()
	PermissionsAPIController := openapi.NewPermissionsAPIController(PermissionsAPIService)

	ProjectAvatarsAPIService := openapi.NewProjectAvatarsAPIService()
	ProjectAvatarsAPIController := openapi.NewProjectAvatarsAPIController(ProjectAvatarsAPIService)

	ProjectCategoriesAPIService := openapi.NewProjectCategoriesAPIService()
	ProjectCategoriesAPIController := openapi.NewProjectCategoriesAPIController(ProjectCategoriesAPIService)

	ProjectComponentsAPIService := openapi.NewProjectComponentsAPIService()
	ProjectComponentsAPIController := openapi.NewProjectComponentsAPIController(ProjectComponentsAPIService)

	ProjectEmailAPIService := openapi.NewProjectEmailAPIService()
	ProjectEmailAPIController := openapi.NewProjectEmailAPIController(ProjectEmailAPIService)

	ProjectFeaturesAPIService := openapi.NewProjectFeaturesAPIService()
	ProjectFeaturesAPIController := openapi.NewProjectFeaturesAPIController(ProjectFeaturesAPIService)

	ProjectKeyAndNameValidationAPIService := openapi.NewProjectKeyAndNameValidationAPIService()
	ProjectKeyAndNameValidationAPIController := openapi.NewProjectKeyAndNameValidationAPIController(ProjectKeyAndNameValidationAPIService)

	ProjectPermissionSchemesAPIService := openapi.NewProjectPermissionSchemesAPIService()
	ProjectPermissionSchemesAPIController := openapi.NewProjectPermissionSchemesAPIController(ProjectPermissionSchemesAPIService)

	ProjectPropertiesAPIService := openapi.NewProjectPropertiesAPIService()
	ProjectPropertiesAPIController := openapi.NewProjectPropertiesAPIController(ProjectPropertiesAPIService)

	ProjectRoleActorsAPIService := openapi.NewProjectRoleActorsAPIService()
	ProjectRoleActorsAPIController := openapi.NewProjectRoleActorsAPIController(ProjectRoleActorsAPIService)

	ProjectRolesAPIService := openapi.NewProjectRolesAPIService()
	ProjectRolesAPIController := openapi.NewProjectRolesAPIController(ProjectRolesAPIService)

	ProjectTypesAPIService := openapi.NewProjectTypesAPIService()
	ProjectTypesAPIController := openapi.NewProjectTypesAPIController(ProjectTypesAPIService)

	ProjectVersionsAPIService := openapi.NewProjectVersionsAPIService()
	ProjectVersionsAPIController := openapi.NewProjectVersionsAPIController(ProjectVersionsAPIService)

	ProjectsAPIService := openapi.NewProjectsAPIService()
	ProjectsAPIController := openapi.NewProjectsAPIController(ProjectsAPIService)

	ScreenSchemesAPIService := openapi.NewScreenSchemesAPIService()
	ScreenSchemesAPIController := openapi.NewScreenSchemesAPIController(ScreenSchemesAPIService)

	ScreenTabFieldsAPIService := openapi.NewScreenTabFieldsAPIService()
	ScreenTabFieldsAPIController := openapi.NewScreenTabFieldsAPIController(ScreenTabFieldsAPIService)

	ScreenTabsAPIService := openapi.NewScreenTabsAPIService()
	ScreenTabsAPIController := openapi.NewScreenTabsAPIController(ScreenTabsAPIService)

	ScreensAPIService := openapi.NewScreensAPIService()
	ScreensAPIController := openapi.NewScreensAPIController(ScreensAPIService)

	ServerInfoAPIService := openapi.NewServerInfoAPIService()
	ServerInfoAPIController := openapi.NewServerInfoAPIController(ServerInfoAPIService)

	StatusAPIService := openapi.NewStatusAPIService()
	StatusAPIController := openapi.NewStatusAPIController(StatusAPIService)

	TasksAPIService := openapi.NewTasksAPIService()
	TasksAPIController := openapi.NewTasksAPIController(TasksAPIService)

	TimeTrackingAPIService := openapi.NewTimeTrackingAPIService()
	TimeTrackingAPIController := openapi.NewTimeTrackingAPIController(TimeTrackingAPIService)

	UIModificationsAppsAPIService := openapi.NewUIModificationsAppsAPIService()
	UIModificationsAppsAPIController := openapi.NewUIModificationsAppsAPIController(UIModificationsAppsAPIService)

	UserPropertiesAPIService := openapi.NewUserPropertiesAPIService()
	UserPropertiesAPIController := openapi.NewUserPropertiesAPIController(UserPropertiesAPIService)

	UserSearchAPIService := openapi.NewUserSearchAPIService()
	UserSearchAPIController := openapi.NewUserSearchAPIController(UserSearchAPIService)

	UsersAPIService := openapi.NewUsersAPIService()
	UsersAPIController := openapi.NewUsersAPIController(UsersAPIService)

	WebhooksAPIService := openapi.NewWebhooksAPIService()
	WebhooksAPIController := openapi.NewWebhooksAPIController(WebhooksAPIService)

	WorkflowSchemeDraftsAPIService := openapi.NewWorkflowSchemeDraftsAPIService()
	WorkflowSchemeDraftsAPIController := openapi.NewWorkflowSchemeDraftsAPIController(WorkflowSchemeDraftsAPIService)

	WorkflowSchemeProjectAssociationsAPIService := openapi.NewWorkflowSchemeProjectAssociationsAPIService()
	WorkflowSchemeProjectAssociationsAPIController := openapi.NewWorkflowSchemeProjectAssociationsAPIController(WorkflowSchemeProjectAssociationsAPIService)

	WorkflowSchemesAPIService := openapi.NewWorkflowSchemesAPIService()
	WorkflowSchemesAPIController := openapi.NewWorkflowSchemesAPIController(WorkflowSchemesAPIService)

	WorkflowStatusCategoriesAPIService := openapi.NewWorkflowStatusCategoriesAPIService()
	WorkflowStatusCategoriesAPIController := openapi.NewWorkflowStatusCategoriesAPIController(WorkflowStatusCategoriesAPIService)

	WorkflowStatusesAPIService := openapi.NewWorkflowStatusesAPIService()
	WorkflowStatusesAPIController := openapi.NewWorkflowStatusesAPIController(WorkflowStatusesAPIService)

	WorkflowTransitionPropertiesAPIService := openapi.NewWorkflowTransitionPropertiesAPIService()
	WorkflowTransitionPropertiesAPIController := openapi.NewWorkflowTransitionPropertiesAPIController(WorkflowTransitionPropertiesAPIService)

	WorkflowTransitionRulesAPIService := openapi.NewWorkflowTransitionRulesAPIService()
	WorkflowTransitionRulesAPIController := openapi.NewWorkflowTransitionRulesAPIController(WorkflowTransitionRulesAPIService)

	WorkflowsAPIService := openapi.NewWorkflowsAPIService()
	WorkflowsAPIController := openapi.NewWorkflowsAPIController(WorkflowsAPIService)

	router := openapi.NewRouter(AnnouncementBannerAPIController, AppMigrationAPIController, AppPropertiesAPIController, ApplicationRolesAPIController, AuditRecordsAPIController, AvatarsAPIController, DashboardsAPIController, DynamicModulesAPIController, FilterSharingAPIController, FiltersAPIController, GroupAndUserPickerAPIController, GroupsAPIController, InstanceInformationAPIController, IssueAttachmentsAPIController, IssueCommentPropertiesAPIController, IssueCommentsAPIController, IssueCustomFieldConfigurationAppsAPIController, IssueCustomFieldContextsAPIController, IssueCustomFieldOptionsAPIController, IssueCustomFieldOptionsAppsAPIController, IssueCustomFieldValuesAppsAPIController, IssueFieldConfigurationsAPIController, IssueFieldsAPIController, IssueLinkTypesAPIController, IssueLinksAPIController, IssueNavigatorSettingsAPIController, IssueNotificationSchemesAPIController, IssuePrioritiesAPIController, IssuePropertiesAPIController, IssueRemoteLinksAPIController, IssueResolutionsAPIController, IssueSearchAPIController, IssueSecurityLevelAPIController, IssueSecuritySchemesAPIController, IssueTypePropertiesAPIController, IssueTypeSchemesAPIController, IssueTypeScreenSchemesAPIController, IssueTypesAPIController, IssueVotesAPIController, IssueWatchersAPIController, IssueWorklogPropertiesAPIController, IssueWorklogsAPIController, IssuesAPIController, JQLAPIController, JQLFunctionsAppsAPIController, JiraExpressionsAPIController, JiraSettingsAPIController, LabelsAPIController, LicenseMetricsAPIController, MyselfAPIController, PermissionSchemesAPIController, PermissionsAPIController, ProjectAvatarsAPIController, ProjectCategoriesAPIController, ProjectComponentsAPIController, ProjectEmailAPIController, ProjectFeaturesAPIController, ProjectKeyAndNameValidationAPIController, ProjectPermissionSchemesAPIController, ProjectPropertiesAPIController, ProjectRoleActorsAPIController, ProjectRolesAPIController, ProjectTypesAPIController, ProjectVersionsAPIController, ProjectsAPIController, ScreenSchemesAPIController, ScreenTabFieldsAPIController, ScreenTabsAPIController, ScreensAPIController, ServerInfoAPIController, StatusAPIController, TasksAPIController, TimeTrackingAPIController, UIModificationsAppsAPIController, UserPropertiesAPIController, UserSearchAPIController, UsersAPIController, WebhooksAPIController, WorkflowSchemeDraftsAPIController, WorkflowSchemeProjectAssociationsAPIController, WorkflowSchemesAPIController, WorkflowStatusCategoriesAPIController, WorkflowStatusesAPIController, WorkflowTransitionPropertiesAPIController, WorkflowTransitionRulesAPIController, WorkflowsAPIController)

	log.Fatal(http.ListenAndServe(":8080", router))
}
