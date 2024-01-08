/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create custom field options (context)
* Creates options and, where the custom select field is of the type Select List (cascading), cascading options for a custom select field. The options are added to a context of the field.  The maximum number of options that can be created per request is 1000 and each field can have a maximum of 10000 options.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* fieldId String The ID of the custom field.
* contextId Long The ID of the context.
* bulkCustomFieldOptionCreateRequest BulkCustomFieldOptionCreateRequest 
* returns CustomFieldCreatedContextOptionsList
* */
const createCustomFieldOption = ({ fieldId, contextId, bulkCustomFieldOptionCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldId,
        contextId,
        bulkCustomFieldOptionCreateRequest,
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
* Delete custom field options (context)
* Deletes a custom field option.  Options with cascading options cannot be deleted without deleting the cascading options first.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* fieldId String The ID of the custom field.
* contextId Long The ID of the context from which an option should be deleted.
* optionId Long The ID of the option to delete.
* no response value expected for this operation
* */
const deleteCustomFieldOption = ({ fieldId, contextId, optionId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldId,
        contextId,
        optionId,
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
* Get custom field option
* Returns a custom field option. For example, an option in a select list.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The custom field option is returned as follows:   *  if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the custom field is used in, and the field is visible in at least one layout the user has permission to view.
*
* id String The ID of the custom field option.
* returns CustomFieldOption
* */
const getCustomFieldOption = ({ id }) => new Promise(
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
* Get custom field options (context)
* Returns a [paginated](#pagination) list of all custom field option for a context. Options are returned first then cascading options, in the order they display in Jira.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* fieldId String The ID of the custom field.
* contextId Long The ID of the context.
* optionId Long The ID of the option. (optional)
* onlyOptions Boolean Whether only options are returned. (optional)
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* returns PageBeanCustomFieldContextOption
* */
const getOptionsForContext = ({ fieldId, contextId, optionId, onlyOptions, startAt, maxResults }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldId,
        contextId,
        optionId,
        onlyOptions,
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
* Reorder custom field options (context)
* Changes the order of custom field options or cascading options in a context.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* fieldId String The ID of the custom field.
* contextId Long The ID of the context.
* orderOfCustomFieldOptions OrderOfCustomFieldOptions 
* returns oas_any_type_not_mapped
* */
const reorderCustomFieldOptions = ({ fieldId, contextId, orderOfCustomFieldOptions }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldId,
        contextId,
        orderOfCustomFieldOptions,
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
* Update custom field options (context)
* Updates the options of a custom field.  If any of the options are not found, no options are updated. Options where the values in the request match the current values aren't updated and aren't reported in the response.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* fieldId String The ID of the custom field.
* contextId Long The ID of the context.
* bulkCustomFieldOptionUpdateRequest BulkCustomFieldOptionUpdateRequest 
* returns CustomFieldUpdatedContextOptionsList
* */
const updateCustomFieldOption = ({ fieldId, contextId, bulkCustomFieldOptionUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldId,
        contextId,
        bulkCustomFieldOptionUpdateRequest,
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
  createCustomFieldOption,
  deleteCustomFieldOption,
  getCustomFieldOption,
  getOptionsForContext,
  reorderCustomFieldOptions,
  updateCustomFieldOption,
};
