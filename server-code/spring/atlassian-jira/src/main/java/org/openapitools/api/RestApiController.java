package org.openapitools.api;

import org.openapitools.model.ActorInputBean;
import org.openapitools.model.ActorsMap;
import org.openapitools.model.AddFieldBean;
import org.openapitools.model.AddGroupBean;
import org.openapitools.model.AddNotificationsDetails;
import org.openapitools.model.AddSecuritySchemeLevelsRequestBean;
import org.openapitools.model.AnnouncementBannerConfiguration;
import org.openapitools.model.AnnouncementBannerConfigurationUpdate;
import org.openapitools.model.ApplicationProperty;
import org.openapitools.model.ApplicationRole;
import org.openapitools.model.AssociateFieldConfigurationsWithIssueTypesRequest;
import org.openapitools.model.Attachment;
import org.openapitools.model.AttachmentArchiveImpl;
import org.openapitools.model.AttachmentArchiveMetadataReadable;
import org.openapitools.model.AttachmentMetadata;
import org.openapitools.model.AttachmentSettings;
import org.openapitools.model.AuditRecords;
import org.openapitools.model.AutoCompleteSuggestions;
import org.openapitools.model.AvailableDashboardGadgetsResponse;
import org.openapitools.model.Avatar;
import org.openapitools.model.Avatars;
import org.openapitools.model.BulkCustomFieldOptionCreateRequest;
import org.openapitools.model.BulkCustomFieldOptionUpdateRequest;
import org.openapitools.model.BulkIssueIsWatching;
import org.openapitools.model.BulkIssuePropertyUpdateRequest;
import org.openapitools.model.BulkPermissionGrants;
import org.openapitools.model.BulkPermissionsRequestBean;
import org.openapitools.model.ChangeFilterOwner;
import org.openapitools.model.ChangedWorklogs;
import org.openapitools.model.ColumnItem;
import org.openapitools.model.Comment;
import org.openapitools.model.ComponentIssuesCount;
import org.openapitools.model.ConnectCustomFieldValues;
import org.openapitools.model.ConnectModules;
import org.openapitools.model.ContainerForProjectFeatures;
import org.openapitools.model.ContainerForRegisteredWebhooks;
import org.openapitools.model.ContainerForWebhookIDs;
import org.openapitools.model.ContainerOfWorkflowSchemeAssociations;
import org.openapitools.model.ConvertedJQLQueries;
import org.openapitools.model.CreateCustomFieldContext;
import org.openapitools.model.CreateIssueSecuritySchemeDetails;
import org.openapitools.model.CreateNotificationSchemeDetails;
import org.openapitools.model.CreatePriorityDetails;
import org.openapitools.model.CreateProjectDetails;
import org.openapitools.model.CreateResolutionDetails;
import org.openapitools.model.CreateUiModificationDetails;
import org.openapitools.model.CreateUpdateRoleRequestBean;
import org.openapitools.model.CreateWorkflowDetails;
import org.openapitools.model.CreatedIssue;
import org.openapitools.model.CreatedIssues;
import org.openapitools.model.CustomFieldConfigurations;
import org.openapitools.model.CustomFieldContextDefaultValueUpdate;
import org.openapitools.model.CustomFieldContextUpdateDetails;
import org.openapitools.model.CustomFieldCreatedContextOptionsList;
import org.openapitools.model.CustomFieldDefinitionJsonBean;
import org.openapitools.model.CustomFieldOption;
import org.openapitools.model.CustomFieldUpdatedContextOptionsList;
import org.openapitools.model.CustomFieldValueUpdateDetails;
import org.openapitools.model.Dashboard;
import org.openapitools.model.DashboardDetails;
import org.openapitools.model.DashboardGadget;
import org.openapitools.model.DashboardGadgetResponse;
import org.openapitools.model.DashboardGadgetSettings;
import org.openapitools.model.DashboardGadgetUpdateRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.DefaultShareScope;
import org.openapitools.model.DefaultWorkflow;
import org.openapitools.model.DeleteAndReplaceVersionBean;
import org.openapitools.model.DeprecatedWorkflow;
import org.openapitools.model.EntityProperty;
import org.openapitools.model.EntityPropertyDetails;
import org.openapitools.model.ErrorCollection;
import org.openapitools.model.ErrorMessage;
import org.openapitools.model.FailedWebhooks;
import org.openapitools.model.FieldConfiguration;
import org.openapitools.model.FieldConfigurationDetails;
import org.openapitools.model.FieldConfigurationItemsDetails;
import org.openapitools.model.FieldConfigurationScheme;
import org.openapitools.model.FieldConfigurationSchemeProjectAssociation;
import org.openapitools.model.FieldDetails;
import org.openapitools.model.Filter;
import org.openapitools.model.FoundGroups;
import org.openapitools.model.FoundUsers;
import org.openapitools.model.FoundUsersAndGroups;
import org.openapitools.model.Group;
import org.openapitools.model.GroupName;
import org.openapitools.model.IdBean;
import org.openapitools.model.IssueBean;
import org.openapitools.model.IssueChangelogIds;
import org.openapitools.model.IssueCommentListRequestBean;
import org.openapitools.model.IssueCreateMetadata;
import org.openapitools.model.IssueEntityProperties;
import org.openapitools.model.IssueEvent;
import org.openapitools.model.IssueFieldOption;
import org.openapitools.model.IssueFieldOptionCreateBean;
import org.openapitools.model.IssueFilterForBulkPropertyDelete;
import org.openapitools.model.IssueLink;
import org.openapitools.model.IssueLinkType;
import org.openapitools.model.IssueLinkTypes;
import org.openapitools.model.IssueList;
import org.openapitools.model.IssueMatches;
import org.openapitools.model.IssuePickerSuggestions;
import org.openapitools.model.IssueTypeCreateBean;
import org.openapitools.model.IssueTypeDetails;
import org.openapitools.model.IssueTypeIds;
import org.openapitools.model.IssueTypeIdsToRemove;
import org.openapitools.model.IssueTypeSchemeDetails;
import org.openapitools.model.IssueTypeSchemeID;
import org.openapitools.model.IssueTypeSchemeProjectAssociation;
import org.openapitools.model.IssueTypeSchemeUpdateDetails;
import org.openapitools.model.IssueTypeScreenSchemeDetails;
import org.openapitools.model.IssueTypeScreenSchemeId;
import org.openapitools.model.IssueTypeScreenSchemeMappingDetails;
import org.openapitools.model.IssueTypeScreenSchemeProjectAssociation;
import org.openapitools.model.IssueTypeScreenSchemeUpdateDetails;
import org.openapitools.model.IssueTypeUpdateBean;
import org.openapitools.model.IssueTypeWithStatus;
import org.openapitools.model.IssueTypeWorkflowMapping;
import org.openapitools.model.IssueTypesWorkflowMapping;
import org.openapitools.model.IssueUpdateDetails;
import org.openapitools.model.IssueUpdateMetadata;
import org.openapitools.model.IssuesAndJQLQueries;
import org.openapitools.model.IssuesUpdateBean;
import org.openapitools.model.JQLPersonalDataMigrationRequest;
import org.openapitools.model.JQLReferenceData;
import org.openapitools.model.JiraExpressionEvalRequestBean;
import org.openapitools.model.JiraExpressionForAnalysis;
import org.openapitools.model.JiraExpressionResult;
import org.openapitools.model.JiraExpressionsAnalysis;
import org.openapitools.model.JiraStatus;
import org.openapitools.model.JqlFunctionPrecomputationUpdateRequestBean;
import org.openapitools.model.JqlQueriesToParse;
import org.openapitools.model.JqlQueriesToSanitize;
import org.openapitools.model.License;
import org.openapitools.model.LicenseMetric;
import org.openapitools.model.LinkIssueRequestJsonBean;
import org.openapitools.model.Locale;
import java.util.Map;
import org.openapitools.model.ModelConfiguration;
import org.openapitools.model.MoveFieldBean;
import org.openapitools.model.MultiIssueEntityProperties;
import org.openapitools.model.MultipleCustomFieldValuesUpdateDetails;
import org.openapitools.model.NewUserDetails;
import org.openapitools.model.Notification;
import org.openapitools.model.NotificationScheme;
import org.openapitools.model.NotificationSchemeId;
import java.time.OffsetDateTime;
import org.openapitools.model.OperationMessage;
import org.openapitools.model.OrderOfCustomFieldOptions;
import org.openapitools.model.OrderOfIssueTypes;
import org.openapitools.model.PageBeanChangelog;
import org.openapitools.model.PageBeanComment;
import org.openapitools.model.PageBeanComponentWithIssueCount;
import org.openapitools.model.PageBeanContext;
import org.openapitools.model.PageBeanContextForProjectAndIssueType;
import org.openapitools.model.PageBeanContextualConfiguration;
import org.openapitools.model.PageBeanCustomFieldContext;
import org.openapitools.model.PageBeanCustomFieldContextDefaultValue;
import org.openapitools.model.PageBeanCustomFieldContextOption;
import org.openapitools.model.PageBeanCustomFieldContextProjectMapping;
import org.openapitools.model.PageBeanDashboard;
import org.openapitools.model.PageBeanField;
import org.openapitools.model.PageBeanFieldConfigurationDetails;
import org.openapitools.model.PageBeanFieldConfigurationIssueTypeItem;
import org.openapitools.model.PageBeanFieldConfigurationItem;
import org.openapitools.model.PageBeanFieldConfigurationScheme;
import org.openapitools.model.PageBeanFieldConfigurationSchemeProjects;
import org.openapitools.model.PageBeanFilterDetails;
import org.openapitools.model.PageBeanGroupDetails;
import org.openapitools.model.PageBeanIssueFieldOption;
import org.openapitools.model.PageBeanIssueSecurityLevelMember;
import org.openapitools.model.PageBeanIssueSecuritySchemeToProjectMapping;
import org.openapitools.model.PageBeanIssueTypeScheme;
import org.openapitools.model.PageBeanIssueTypeSchemeMapping;
import org.openapitools.model.PageBeanIssueTypeSchemeProjects;
import org.openapitools.model.PageBeanIssueTypeScreenScheme;
import org.openapitools.model.PageBeanIssueTypeScreenSchemeItem;
import org.openapitools.model.PageBeanIssueTypeScreenSchemesProjects;
import org.openapitools.model.PageBeanIssueTypeToContextMapping;
import org.openapitools.model.PageBeanJqlFunctionPrecomputationBean;
import org.openapitools.model.PageBeanNotificationScheme;
import org.openapitools.model.PageBeanNotificationSchemeAndProjectMappingJsonBean;
import org.openapitools.model.PageBeanPriority;
import org.openapitools.model.PageBeanProject;
import org.openapitools.model.PageBeanProjectDetails;
import org.openapitools.model.PageBeanResolutionJsonBean;
import org.openapitools.model.PageBeanScreen;
import org.openapitools.model.PageBeanScreenScheme;
import org.openapitools.model.PageBeanScreenWithTab;
import org.openapitools.model.PageBeanSecurityLevel;
import org.openapitools.model.PageBeanSecurityLevelMember;
import org.openapitools.model.PageBeanSecuritySchemeWithProjects;
import org.openapitools.model.PageBeanString;
import org.openapitools.model.PageBeanUiModificationDetails;
import org.openapitools.model.PageBeanUser;
import org.openapitools.model.PageBeanUserDetails;
import org.openapitools.model.PageBeanUserKey;
import org.openapitools.model.PageBeanVersion;
import org.openapitools.model.PageBeanWebhook;
import org.openapitools.model.PageBeanWorkflow;
import org.openapitools.model.PageBeanWorkflowScheme;
import org.openapitools.model.PageBeanWorkflowTransitionRules;
import org.openapitools.model.PageOfChangelogs;
import org.openapitools.model.PageOfComments;
import org.openapitools.model.PageOfDashboards;
import org.openapitools.model.PageOfStatuses;
import org.openapitools.model.PageOfWorklogs;
import org.openapitools.model.ParsedJqlQueries;
import org.openapitools.model.PermissionGrant;
import org.openapitools.model.PermissionGrants;
import org.openapitools.model.PermissionScheme;
import org.openapitools.model.PermissionSchemes;
import org.openapitools.model.Permissions;
import org.openapitools.model.PermissionsKeysBean;
import org.openapitools.model.PermittedProjects;
import org.openapitools.model.Priority;
import org.openapitools.model.PriorityId;
import org.openapitools.model.Project;
import org.openapitools.model.ProjectAvatars;
import org.openapitools.model.ProjectCategory;
import org.openapitools.model.ProjectComponent;
import org.openapitools.model.ProjectEmailAddress;
import org.openapitools.model.ProjectFeatureState;
import org.openapitools.model.ProjectIdentifiers;
import org.openapitools.model.ProjectIds;
import org.openapitools.model.ProjectIssueSecurityLevels;
import org.openapitools.model.ProjectIssueTypeHierarchy;
import org.openapitools.model.ProjectIssueTypeMappings;
import org.openapitools.model.ProjectRole;
import org.openapitools.model.ProjectRoleActorsUpdateBean;
import org.openapitools.model.ProjectRoleDetails;
import org.openapitools.model.ProjectType;
import org.openapitools.model.PropertyKeys;
import org.openapitools.model.PublishDraftWorkflowScheme;
import org.openapitools.model.RemoteIssueLink;
import org.openapitools.model.RemoteIssueLinkIdentifies;
import org.openapitools.model.RemoteIssueLinkRequest;
import org.openapitools.model.ReorderIssuePriorities;
import org.openapitools.model.ReorderIssueResolutionsRequest;
import org.openapitools.model.Resolution;
import org.openapitools.model.ResolutionId;
import org.openapitools.model.SanitizedJqlQueries;
import org.openapitools.model.Screen;
import org.openapitools.model.ScreenDetails;
import org.openapitools.model.ScreenSchemeDetails;
import org.openapitools.model.ScreenSchemeId;
import org.openapitools.model.ScreenableField;
import org.openapitools.model.ScreenableTab;
import org.openapitools.model.SearchAutoCompleteFilter;
import org.openapitools.model.SearchRequestBean;
import org.openapitools.model.SearchResults;
import org.openapitools.model.SecurityLevel;
import org.openapitools.model.SecurityScheme;
import org.openapitools.model.SecuritySchemeId;
import org.openapitools.model.SecuritySchemeMembersRequest;
import org.openapitools.model.SecuritySchemes;
import org.openapitools.model.ServerInformation;
import java.util.Set;
import org.openapitools.model.SetDefaultLevelsRequest;
import org.openapitools.model.SetDefaultPriorityRequest;
import org.openapitools.model.SetDefaultResolutionRequest;
import org.openapitools.model.SharePermission;
import org.openapitools.model.SharePermissionInputBean;
import org.openapitools.model.SimpleApplicationPropertyBean;
import org.openapitools.model.StatusCategory;
import org.openapitools.model.StatusCreateRequest;
import org.openapitools.model.StatusDetails;
import org.openapitools.model.StatusUpdateRequest;
import org.openapitools.model.SystemAvatars;
import org.openapitools.model.TaskProgressBeanObject;
import org.openapitools.model.TaskProgressBeanRemoveOptionFromIssuesResult;
import org.openapitools.model.TimeTrackingConfiguration;
import org.openapitools.model.TimeTrackingProvider;
import org.openapitools.model.Transitions;
import java.net.URI;
import java.util.UUID;
import org.openapitools.model.UiModificationIdentifiers;
import org.openapitools.model.UnrestrictedUserEmail;
import org.openapitools.model.UpdateCustomFieldDetails;
import org.openapitools.model.UpdateDefaultScreenScheme;
import org.openapitools.model.UpdateFieldConfigurationSchemeDetails;
import org.openapitools.model.UpdateIssueSecurityLevelDetails;
import org.openapitools.model.UpdateIssueSecuritySchemeRequestBean;
import org.openapitools.model.UpdateNotificationSchemeDetails;
import org.openapitools.model.UpdatePriorityDetails;
import org.openapitools.model.UpdateProjectDetails;
import org.openapitools.model.UpdateResolutionDetails;
import org.openapitools.model.UpdateScreenDetails;
import org.openapitools.model.UpdateScreenSchemeDetails;
import org.openapitools.model.UpdateUiModificationDetails;
import org.openapitools.model.UpdateUserToGroupBean;
import org.openapitools.model.UpdatedProjectCategory;
import org.openapitools.model.User;
import org.openapitools.model.UserMigrationBean;
import org.openapitools.model.Version;
import org.openapitools.model.VersionIssueCounts;
import org.openapitools.model.VersionMoveBean;
import org.openapitools.model.VersionUnresolvedIssuesCount;
import org.openapitools.model.Votes;
import org.openapitools.model.Watchers;
import org.openapitools.model.WebhookRegistrationDetails;
import org.openapitools.model.WebhooksExpirationDate;
import org.openapitools.model.WorkflowIDs;
import org.openapitools.model.WorkflowRulesSearch;
import org.openapitools.model.WorkflowRulesSearchDetails;
import org.openapitools.model.WorkflowScheme;
import org.openapitools.model.WorkflowSchemeProjectAssociation;
import org.openapitools.model.WorkflowTransitionProperty;
import org.openapitools.model.WorkflowTransitionRulesUpdate;
import org.openapitools.model.WorkflowTransitionRulesUpdateErrors;
import org.openapitools.model.WorkflowsWithTransitionRulesDetails;
import org.openapitools.model.Worklog;
import org.openapitools.model.WorklogIdsRequestBean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.theJiraCloudPlatformREST.base-path:}")
public class RestApiController implements RestApi {

    private final NativeWebRequest request;

    @Autowired
    public RestApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}