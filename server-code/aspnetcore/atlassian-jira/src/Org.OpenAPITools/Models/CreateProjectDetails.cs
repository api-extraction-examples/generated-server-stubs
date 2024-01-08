/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// Details about the project.
    /// </summary>
    [DataContract]
    public partial class CreateProjectDetails : IEquatable<CreateProjectDetails>
    {

        /// <summary>
        /// The default assignee when creating issues for this project.
        /// </summary>
        /// <value>The default assignee when creating issues for this project.</value>
        [TypeConverter(typeof(CustomEnumConverter<AssigneeTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AssigneeTypeEnum
        {
            
            /// <summary>
            /// Enum PROJECTLEADEnum for PROJECT_LEAD
            /// </summary>
            [EnumMember(Value = "PROJECT_LEAD")]
            PROJECTLEADEnum = 1,
            
            /// <summary>
            /// Enum UNASSIGNEDEnum for UNASSIGNED
            /// </summary>
            [EnumMember(Value = "UNASSIGNED")]
            UNASSIGNEDEnum = 2
        }

        /// <summary>
        /// The default assignee when creating issues for this project.
        /// </summary>
        /// <value>The default assignee when creating issues for this project.</value>
        [DataMember(Name="assigneeType", EmitDefaultValue=true)]
        public AssigneeTypeEnum AssigneeType { get; set; }

        /// <summary>
        /// An integer value for the project&#39;s avatar.
        /// </summary>
        /// <value>An integer value for the project&#39;s avatar.</value>
        [DataMember(Name="avatarId", EmitDefaultValue=true)]
        public long AvatarId { get; set; }

        /// <summary>
        /// The ID of the project&#39;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation.
        /// </summary>
        /// <value>The ID of the project&#39;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation.</value>
        [DataMember(Name="categoryId", EmitDefaultValue=true)]
        public long CategoryId { get; set; }

        /// <summary>
        /// A brief description of the project.
        /// </summary>
        /// <value>A brief description of the project.</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// The ID of the field configuration scheme for the project. Use the [Get all field configuration schemes](#api-rest-api-3-fieldconfigurationscheme-get) operation to get a list of field configuration scheme IDs. If you specify the field configuration scheme you cannot specify the project template key.
        /// </summary>
        /// <value>The ID of the field configuration scheme for the project. Use the [Get all field configuration schemes](#api-rest-api-3-fieldconfigurationscheme-get) operation to get a list of field configuration scheme IDs. If you specify the field configuration scheme you cannot specify the project template key.</value>
        [DataMember(Name="fieldConfigurationScheme", EmitDefaultValue=true)]
        public long FieldConfigurationScheme { get; set; }

        /// <summary>
        /// The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.
        /// </summary>
        /// <value>The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.</value>
        [DataMember(Name="issueSecurityScheme", EmitDefaultValue=true)]
        public long IssueSecurityScheme { get; set; }

        /// <summary>
        /// The ID of the issue type scheme for the project. Use the [Get all issue type schemes](#api-rest-api-3-issuetypescheme-get) operation to get a list of issue type scheme IDs. If you specify the issue type scheme you cannot specify the project template key.
        /// </summary>
        /// <value>The ID of the issue type scheme for the project. Use the [Get all issue type schemes](#api-rest-api-3-issuetypescheme-get) operation to get a list of issue type scheme IDs. If you specify the issue type scheme you cannot specify the project template key.</value>
        [DataMember(Name="issueTypeScheme", EmitDefaultValue=true)]
        public long IssueTypeScheme { get; set; }

        /// <summary>
        /// The ID of the issue type screen scheme for the project. Use the [Get all issue type screen schemes](#api-rest-api-3-issuetypescreenscheme-get) operation to get a list of issue type screen scheme IDs. If you specify the issue type screen scheme you cannot specify the project template key.
        /// </summary>
        /// <value>The ID of the issue type screen scheme for the project. Use the [Get all issue type screen schemes](#api-rest-api-3-issuetypescreenscheme-get) operation to get a list of issue type screen scheme IDs. If you specify the issue type screen scheme you cannot specify the project template key.</value>
        [DataMember(Name="issueTypeScreenScheme", EmitDefaultValue=true)]
        public long IssueTypeScreenScheme { get; set; }

        /// <summary>
        /// Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
        /// </summary>
        /// <value>Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.</value>
        [Required]
        [DataMember(Name="key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// This parameter is deprecated because of privacy changes. Use &#x60;leadAccountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Cannot be provided with &#x60;leadAccountId&#x60;.
        /// </summary>
        /// <value>This parameter is deprecated because of privacy changes. Use &#x60;leadAccountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Cannot be provided with &#x60;leadAccountId&#x60;.</value>
        [DataMember(Name="lead", EmitDefaultValue=false)]
        public string Lead { get; set; }

        /// <summary>
        /// The account ID of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Cannot be provided with &#x60;lead&#x60;.
        /// </summary>
        /// <value>The account ID of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Cannot be provided with &#x60;lead&#x60;.</value>
        [MaxLength(128)]
        [DataMember(Name="leadAccountId", EmitDefaultValue=false)]
        public string LeadAccountId { get; set; }

        /// <summary>
        /// The name of the project.
        /// </summary>
        /// <value>The name of the project.</value>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.
        /// </summary>
        /// <value>The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.</value>
        [DataMember(Name="notificationScheme", EmitDefaultValue=true)]
        public long NotificationScheme { get; set; }

        /// <summary>
        /// The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.
        /// </summary>
        /// <value>The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.</value>
        [DataMember(Name="permissionScheme", EmitDefaultValue=true)]
        public long PermissionScheme { get; set; }


        /// <summary>
        /// A predefined configuration for a project. The type of the `projectTemplateKey` must match with the type of the `projectTypeKey`.
        /// </summary>
        /// <value>A predefined configuration for a project. The type of the `projectTemplateKey` must match with the type of the `projectTypeKey`.</value>
        [TypeConverter(typeof(CustomEnumConverter<ProjectTemplateKeyEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ProjectTemplateKeyEnum
        {
            
            /// <summary>
            /// Enum PyxisGreenhopperJiraghSimplifiedAgilityKanbanEnum for com.pyxis.greenhopper.jira:gh-simplified-agility-kanban
            /// </summary>
            [EnumMember(Value = "com.pyxis.greenhopper.jira:gh-simplified-agility-kanban")]
            PyxisGreenhopperJiraghSimplifiedAgilityKanbanEnum = 1,
            
            /// <summary>
            /// Enum PyxisGreenhopperJiraghSimplifiedAgilityScrumEnum for com.pyxis.greenhopper.jira:gh-simplified-agility-scrum
            /// </summary>
            [EnumMember(Value = "com.pyxis.greenhopper.jira:gh-simplified-agility-scrum")]
            PyxisGreenhopperJiraghSimplifiedAgilityScrumEnum = 2,
            
            /// <summary>
            /// Enum PyxisGreenhopperJiraghSimplifiedBasicEnum for com.pyxis.greenhopper.jira:gh-simplified-basic
            /// </summary>
            [EnumMember(Value = "com.pyxis.greenhopper.jira:gh-simplified-basic")]
            PyxisGreenhopperJiraghSimplifiedBasicEnum = 3,
            
            /// <summary>
            /// Enum PyxisGreenhopperJiraghSimplifiedKanbanClassicEnum for com.pyxis.greenhopper.jira:gh-simplified-kanban-classic
            /// </summary>
            [EnumMember(Value = "com.pyxis.greenhopper.jira:gh-simplified-kanban-classic")]
            PyxisGreenhopperJiraghSimplifiedKanbanClassicEnum = 4,
            
            /// <summary>
            /// Enum PyxisGreenhopperJiraghSimplifiedScrumClassicEnum for com.pyxis.greenhopper.jira:gh-simplified-scrum-classic
            /// </summary>
            [EnumMember(Value = "com.pyxis.greenhopper.jira:gh-simplified-scrum-classic")]
            PyxisGreenhopperJiraghSimplifiedScrumClassicEnum = 5,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedItServiceManagementEnum for com.atlassian.servicedesk:simplified-it-service-management
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-it-service-management")]
            AtlassianServicedesksimplifiedItServiceManagementEnum = 6,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedGeneralServiceDeskEnum for com.atlassian.servicedesk:simplified-general-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-general-service-desk")]
            AtlassianServicedesksimplifiedGeneralServiceDeskEnum = 7,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedGeneralServiceDeskItEnum for com.atlassian.servicedesk:simplified-general-service-desk-it
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-general-service-desk-it")]
            AtlassianServicedesksimplifiedGeneralServiceDeskItEnum = 8,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedGeneralServiceDeskBusinessEnum for com.atlassian.servicedesk:simplified-general-service-desk-business
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-general-service-desk-business")]
            AtlassianServicedesksimplifiedGeneralServiceDeskBusinessEnum = 9,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedInternalServiceDeskEnum for com.atlassian.servicedesk:simplified-internal-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-internal-service-desk")]
            AtlassianServicedesksimplifiedInternalServiceDeskEnum = 10,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedExternalServiceDeskEnum for com.atlassian.servicedesk:simplified-external-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-external-service-desk")]
            AtlassianServicedesksimplifiedExternalServiceDeskEnum = 11,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedHrServiceDeskEnum for com.atlassian.servicedesk:simplified-hr-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-hr-service-desk")]
            AtlassianServicedesksimplifiedHrServiceDeskEnum = 12,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedFacilitiesServiceDeskEnum for com.atlassian.servicedesk:simplified-facilities-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-facilities-service-desk")]
            AtlassianServicedesksimplifiedFacilitiesServiceDeskEnum = 13,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedLegalServiceDeskEnum for com.atlassian.servicedesk:simplified-legal-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-legal-service-desk")]
            AtlassianServicedesksimplifiedLegalServiceDeskEnum = 14,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedMarketingServiceDeskEnum for com.atlassian.servicedesk:simplified-marketing-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-marketing-service-desk")]
            AtlassianServicedesksimplifiedMarketingServiceDeskEnum = 15,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedFinanceServiceDeskEnum for com.atlassian.servicedesk:simplified-finance-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-finance-service-desk")]
            AtlassianServicedesksimplifiedFinanceServiceDeskEnum = 16,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedAnalyticsServiceDeskEnum for com.atlassian.servicedesk:simplified-analytics-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-analytics-service-desk")]
            AtlassianServicedesksimplifiedAnalyticsServiceDeskEnum = 17,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedDesignServiceDeskEnum for com.atlassian.servicedesk:simplified-design-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-design-service-desk")]
            AtlassianServicedesksimplifiedDesignServiceDeskEnum = 18,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedSalesServiceDeskEnum for com.atlassian.servicedesk:simplified-sales-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-sales-service-desk")]
            AtlassianServicedesksimplifiedSalesServiceDeskEnum = 19,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedHalpServiceDeskEnum for com.atlassian.servicedesk:simplified-halp-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-halp-service-desk")]
            AtlassianServicedesksimplifiedHalpServiceDeskEnum = 20,
            
            /// <summary>
            /// Enum AtlassianServicedesksimplifiedCustomProjectServiceDeskEnum for com.atlassian.servicedesk:simplified-custom-project-service-desk
            /// </summary>
            [EnumMember(Value = "com.atlassian.servicedesk:simplified-custom-project-service-desk")]
            AtlassianServicedesksimplifiedCustomProjectServiceDeskEnum = 21,
            
            /// <summary>
            /// Enum AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedContentManagementEnum for com.atlassian.jira-core-project-templates:jira-core-simplified-content-management
            /// </summary>
            [EnumMember(Value = "com.atlassian.jira-core-project-templates:jira-core-simplified-content-management")]
            AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedContentManagementEnum = 22,
            
            /// <summary>
            /// Enum AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedDocumentApprovalEnum for com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval
            /// </summary>
            [EnumMember(Value = "com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval")]
            AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedDocumentApprovalEnum = 23,
            
            /// <summary>
            /// Enum AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedLeadTrackingEnum for com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking
            /// </summary>
            [EnumMember(Value = "com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking")]
            AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedLeadTrackingEnum = 24,
            
            /// <summary>
            /// Enum AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedProcessControlEnum for com.atlassian.jira-core-project-templates:jira-core-simplified-process-control
            /// </summary>
            [EnumMember(Value = "com.atlassian.jira-core-project-templates:jira-core-simplified-process-control")]
            AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedProcessControlEnum = 25,
            
            /// <summary>
            /// Enum AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedProcurementEnum for com.atlassian.jira-core-project-templates:jira-core-simplified-procurement
            /// </summary>
            [EnumMember(Value = "com.atlassian.jira-core-project-templates:jira-core-simplified-procurement")]
            AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedProcurementEnum = 26,
            
            /// <summary>
            /// Enum AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedProjectManagementEnum for com.atlassian.jira-core-project-templates:jira-core-simplified-project-management
            /// </summary>
            [EnumMember(Value = "com.atlassian.jira-core-project-templates:jira-core-simplified-project-management")]
            AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedProjectManagementEnum = 27,
            
            /// <summary>
            /// Enum AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedRecruitmentEnum for com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment
            /// </summary>
            [EnumMember(Value = "com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment")]
            AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedRecruitmentEnum = 28,
            
            /// <summary>
            /// Enum AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedTaskEnum for com.atlassian.jira-core-project-templates:jira-core-simplified-task-
            /// </summary>
            [EnumMember(Value = "com.atlassian.jira-core-project-templates:jira-core-simplified-task-")]
            AtlassianJiraCoreProjectTemplatesjiraCoreSimplifiedTaskEnum = 29
        }

        /// <summary>
        /// A predefined configuration for a project. The type of the &#x60;projectTemplateKey&#x60; must match with the type of the &#x60;projectTypeKey&#x60;.
        /// </summary>
        /// <value>A predefined configuration for a project. The type of the &#x60;projectTemplateKey&#x60; must match with the type of the &#x60;projectTypeKey&#x60;.</value>
        [DataMember(Name="projectTemplateKey", EmitDefaultValue=true)]
        public ProjectTemplateKeyEnum ProjectTemplateKey { get; set; }


        /// <summary>
        /// The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don't specify the project template you have to specify the project type.
        /// </summary>
        /// <value>The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don't specify the project template you have to specify the project type.</value>
        [TypeConverter(typeof(CustomEnumConverter<ProjectTypeKeyEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ProjectTypeKeyEnum
        {
            
            /// <summary>
            /// Enum SoftwareEnum for software
            /// </summary>
            [EnumMember(Value = "software")]
            SoftwareEnum = 1,
            
            /// <summary>
            /// Enum ServiceDeskEnum for service_desk
            /// </summary>
            [EnumMember(Value = "service_desk")]
            ServiceDeskEnum = 2,
            
            /// <summary>
            /// Enum BusinessEnum for business
            /// </summary>
            [EnumMember(Value = "business")]
            BusinessEnum = 3
        }

        /// <summary>
        /// The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don&#39;t specify the project template you have to specify the project type.
        /// </summary>
        /// <value>The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don&#39;t specify the project template you have to specify the project type.</value>
        [DataMember(Name="projectTypeKey", EmitDefaultValue=true)]
        public ProjectTypeKeyEnum ProjectTypeKey { get; set; }

        /// <summary>
        /// A link to information about this project, such as project documentation
        /// </summary>
        /// <value>A link to information about this project, such as project documentation</value>
        [DataMember(Name="url", EmitDefaultValue=false)]
        public string Url { get; set; }

        /// <summary>
        /// The ID of the workflow scheme for the project. Use the [Get all workflow schemes](#api-rest-api-3-workflowscheme-get) operation to get a list of workflow scheme IDs. If you specify the workflow scheme you cannot specify the project template key.
        /// </summary>
        /// <value>The ID of the workflow scheme for the project. Use the [Get all workflow schemes](#api-rest-api-3-workflowscheme-get) operation to get a list of workflow scheme IDs. If you specify the workflow scheme you cannot specify the project template key.</value>
        [DataMember(Name="workflowScheme", EmitDefaultValue=true)]
        public long WorkflowScheme { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateProjectDetails {\n");
            sb.Append("  AssigneeType: ").Append(AssigneeType).Append("\n");
            sb.Append("  AvatarId: ").Append(AvatarId).Append("\n");
            sb.Append("  CategoryId: ").Append(CategoryId).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  FieldConfigurationScheme: ").Append(FieldConfigurationScheme).Append("\n");
            sb.Append("  IssueSecurityScheme: ").Append(IssueSecurityScheme).Append("\n");
            sb.Append("  IssueTypeScheme: ").Append(IssueTypeScheme).Append("\n");
            sb.Append("  IssueTypeScreenScheme: ").Append(IssueTypeScreenScheme).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Lead: ").Append(Lead).Append("\n");
            sb.Append("  LeadAccountId: ").Append(LeadAccountId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  NotificationScheme: ").Append(NotificationScheme).Append("\n");
            sb.Append("  PermissionScheme: ").Append(PermissionScheme).Append("\n");
            sb.Append("  ProjectTemplateKey: ").Append(ProjectTemplateKey).Append("\n");
            sb.Append("  ProjectTypeKey: ").Append(ProjectTypeKey).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  WorkflowScheme: ").Append(WorkflowScheme).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((CreateProjectDetails)obj);
        }

        /// <summary>
        /// Returns true if CreateProjectDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateProjectDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateProjectDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AssigneeType == other.AssigneeType ||
                    
                    AssigneeType.Equals(other.AssigneeType)
                ) && 
                (
                    AvatarId == other.AvatarId ||
                    
                    AvatarId.Equals(other.AvatarId)
                ) && 
                (
                    CategoryId == other.CategoryId ||
                    
                    CategoryId.Equals(other.CategoryId)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    FieldConfigurationScheme == other.FieldConfigurationScheme ||
                    
                    FieldConfigurationScheme.Equals(other.FieldConfigurationScheme)
                ) && 
                (
                    IssueSecurityScheme == other.IssueSecurityScheme ||
                    
                    IssueSecurityScheme.Equals(other.IssueSecurityScheme)
                ) && 
                (
                    IssueTypeScheme == other.IssueTypeScheme ||
                    
                    IssueTypeScheme.Equals(other.IssueTypeScheme)
                ) && 
                (
                    IssueTypeScreenScheme == other.IssueTypeScreenScheme ||
                    
                    IssueTypeScreenScheme.Equals(other.IssueTypeScreenScheme)
                ) && 
                (
                    Key == other.Key ||
                    Key != null &&
                    Key.Equals(other.Key)
                ) && 
                (
                    Lead == other.Lead ||
                    Lead != null &&
                    Lead.Equals(other.Lead)
                ) && 
                (
                    LeadAccountId == other.LeadAccountId ||
                    LeadAccountId != null &&
                    LeadAccountId.Equals(other.LeadAccountId)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    NotificationScheme == other.NotificationScheme ||
                    
                    NotificationScheme.Equals(other.NotificationScheme)
                ) && 
                (
                    PermissionScheme == other.PermissionScheme ||
                    
                    PermissionScheme.Equals(other.PermissionScheme)
                ) && 
                (
                    ProjectTemplateKey == other.ProjectTemplateKey ||
                    
                    ProjectTemplateKey.Equals(other.ProjectTemplateKey)
                ) && 
                (
                    ProjectTypeKey == other.ProjectTypeKey ||
                    
                    ProjectTypeKey.Equals(other.ProjectTypeKey)
                ) && 
                (
                    Url == other.Url ||
                    Url != null &&
                    Url.Equals(other.Url)
                ) && 
                (
                    WorkflowScheme == other.WorkflowScheme ||
                    
                    WorkflowScheme.Equals(other.WorkflowScheme)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    
                    hashCode = hashCode * 59 + AssigneeType.GetHashCode();
                    
                    hashCode = hashCode * 59 + AvatarId.GetHashCode();
                    
                    hashCode = hashCode * 59 + CategoryId.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    
                    hashCode = hashCode * 59 + FieldConfigurationScheme.GetHashCode();
                    
                    hashCode = hashCode * 59 + IssueSecurityScheme.GetHashCode();
                    
                    hashCode = hashCode * 59 + IssueTypeScheme.GetHashCode();
                    
                    hashCode = hashCode * 59 + IssueTypeScreenScheme.GetHashCode();
                    if (Key != null)
                    hashCode = hashCode * 59 + Key.GetHashCode();
                    if (Lead != null)
                    hashCode = hashCode * 59 + Lead.GetHashCode();
                    if (LeadAccountId != null)
                    hashCode = hashCode * 59 + LeadAccountId.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + NotificationScheme.GetHashCode();
                    
                    hashCode = hashCode * 59 + PermissionScheme.GetHashCode();
                    
                    hashCode = hashCode * 59 + ProjectTemplateKey.GetHashCode();
                    
                    hashCode = hashCode * 59 + ProjectTypeKey.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                    
                    hashCode = hashCode * 59 + WorkflowScheme.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateProjectDetails left, CreateProjectDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateProjectDetails left, CreateProjectDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
