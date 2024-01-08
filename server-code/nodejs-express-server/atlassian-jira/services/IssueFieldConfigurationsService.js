/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Assign field configuration scheme to project
* Assigns a field configuration scheme to a project. If the field configuration scheme ID is `null`, the operation assigns the default field configuration scheme.  Field configuration schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* fieldConfigurationSchemeProjectAssociation FieldConfigurationSchemeProjectAssociation 
* returns oas_any_type_not_mapped
* */
const assignFieldConfigurationSchemeToProject = ({ fieldConfigurationSchemeProjectAssociation }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldConfigurationSchemeProjectAssociation,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create field configuration
* Creates a field configuration. The field configuration is created with the same field properties as the default configuration, with all the fields being optional.  This operation can only create configurations for use in company-managed (classic) projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* fieldConfigurationDetails FieldConfigurationDetails 
* returns FieldConfiguration
* */
const createFieldConfiguration = ({ fieldConfigurationDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldConfigurationDetails,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create field configuration scheme
* Creates a field configuration scheme.  This operation can only create field configuration schemes used in company-managed (classic) projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* updateFieldConfigurationSchemeDetails UpdateFieldConfigurationSchemeDetails The details of the field configuration scheme.
* returns FieldConfigurationScheme
* */
const createFieldConfigurationScheme = ({ updateFieldConfigurationSchemeDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        updateFieldConfigurationSchemeDetails,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete field configuration
* Deletes a field configuration.  This operation can only delete configurations used in company-managed (classic) projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the field configuration.
* returns oas_any_type_not_mapped
* */
const deleteFieldConfiguration = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete field configuration scheme
* Deletes a field configuration scheme.  This operation can only delete field configuration schemes used in company-managed (classic) projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the field configuration scheme.
* returns oas_any_type_not_mapped
* */
const deleteFieldConfigurationScheme = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get all field configuration schemes
* Returns a [paginated](#pagination) list of field configuration schemes.  Only field configuration schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* id Set The list of field configuration scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`. (optional)
* returns PageBeanFieldConfigurationScheme
* */
const getAllFieldConfigurationSchemes = ({ startAt, maxResults, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get all field configurations
* Returns a [paginated](#pagination) list of field configurations. The list can be for all field configurations or a subset determined by any combination of these criteria:   *  a list of field configuration item IDs.  *  whether the field configuration is a default.  *  whether the field configuration name or description contains a query string.  Only field configurations used in company-managed (classic) projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* id Set The list of field configuration IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`. (optional)
* isDefault Boolean If *true* returns default field configurations only. (optional)
* query String The query string used to match against field configuration names and descriptions. (optional)
* returns PageBeanFieldConfigurationDetails
* */
const getAllFieldConfigurations = ({ startAt, maxResults, id, isDefault, query }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        id,
        isDefault,
        query,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get field configuration items
* Returns a [paginated](#pagination) list of all fields for a configuration.  Only the fields from configurations used in company-managed (classic) projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the field configuration.
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* returns PageBeanFieldConfigurationItem
* */
const getFieldConfigurationItems = ({ id, startAt, maxResults }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        startAt,
        maxResults,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get field configuration issue type items
* Returns a [paginated](#pagination) list of field configuration issue type items.  Only items used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* fieldConfigurationSchemeId Set The list of field configuration scheme IDs. To include multiple field configuration schemes separate IDs with ampersand: `fieldConfigurationSchemeId=10000&fieldConfigurationSchemeId=10001`. (optional)
* returns PageBeanFieldConfigurationIssueTypeItem
* */
const getFieldConfigurationSchemeMappings = ({ startAt, maxResults, fieldConfigurationSchemeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        fieldConfigurationSchemeId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get field configuration schemes for projects
* Returns a [paginated](#pagination) list of field configuration schemes and, for each scheme, a list of the projects that use it.  The list is sorted by field configuration scheme ID. The first item contains the list of project IDs assigned to the default field configuration scheme.  Only field configuration schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* projectId Set The list of project IDs. To include multiple projects, separate IDs with ampersand: `projectId=10000&projectId=10001`.
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* returns PageBeanFieldConfigurationSchemeProjects
* */
const getFieldConfigurationSchemeProjectMapping = ({ projectId, startAt, maxResults }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectId,
        startAt,
        maxResults,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Remove issue types from field configuration scheme
* Removes issue types from the field configuration scheme.  This operation can only modify field configuration schemes used in company-managed (classic) projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the field configuration scheme.
* issueTypeIdsToRemove IssueTypeIdsToRemove The issue type IDs to remove.
* returns oas_any_type_not_mapped
* */
const removeIssueTypesFromGlobalFieldConfigurationScheme = ({ id, issueTypeIdsToRemove }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        issueTypeIdsToRemove,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Assign issue types to field configurations
* Assigns issue types to field configurations on field configuration scheme.  This operation can only modify field configuration schemes used in company-managed (classic) projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the field configuration scheme.
* associateFieldConfigurationsWithIssueTypesRequest AssociateFieldConfigurationsWithIssueTypesRequest 
* returns oas_any_type_not_mapped
* */
const setFieldConfigurationSchemeMapping = ({ id, associateFieldConfigurationsWithIssueTypesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        associateFieldConfigurationsWithIssueTypesRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update field configuration
* Updates a field configuration. The name and the description provided in the request override the existing values.  This operation can only update configurations used in company-managed (classic) projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the field configuration.
* fieldConfigurationDetails FieldConfigurationDetails 
* returns oas_any_type_not_mapped
* */
const updateFieldConfiguration = ({ id, fieldConfigurationDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldConfigurationDetails,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update field configuration items
* Updates fields in a field configuration. The properties of the field configuration fields provided override the existing values.  This operation can only update field configurations used in company-managed (classic) projects.  The operation can set the renderer for text fields to the default text renderer (`text-renderer`) or wiki style renderer (`wiki-renderer`). However, the renderer cannot be updated for fields using the autocomplete renderer (`autocomplete-renderer`).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the field configuration.
* fieldConfigurationItemsDetails FieldConfigurationItemsDetails 
* returns oas_any_type_not_mapped
* */
const updateFieldConfigurationItems = ({ id, fieldConfigurationItemsDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldConfigurationItemsDetails,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update field configuration scheme
* Updates a field configuration scheme.  This operation can only update field configuration schemes used in company-managed (classic) projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the field configuration scheme.
* updateFieldConfigurationSchemeDetails UpdateFieldConfigurationSchemeDetails The details of the field configuration scheme.
* returns oas_any_type_not_mapped
* */
const updateFieldConfigurationScheme = ({ id, updateFieldConfigurationSchemeDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        updateFieldConfigurationSchemeDetails,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  assignFieldConfigurationSchemeToProject,
  createFieldConfiguration,
  createFieldConfigurationScheme,
  deleteFieldConfiguration,
  deleteFieldConfigurationScheme,
  getAllFieldConfigurationSchemes,
  getAllFieldConfigurations,
  getFieldConfigurationItems,
  getFieldConfigurationSchemeMappings,
  getFieldConfigurationSchemeProjectMapping,
  removeIssueTypesFromGlobalFieldConfigurationScheme,
  setFieldConfigurationSchemeMapping,
  updateFieldConfiguration,
  updateFieldConfigurationItems,
  updateFieldConfigurationScheme,
};
