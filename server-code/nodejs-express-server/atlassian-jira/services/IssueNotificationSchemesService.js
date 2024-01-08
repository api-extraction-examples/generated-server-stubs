/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add notifications to notification scheme
* Adds notifications to a notification scheme. You can add up to 1000 notifications per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id String The ID of the notification scheme.
* addNotificationsDetails AddNotificationsDetails 
* returns oas_any_type_not_mapped
* */
const addNotifications = ({ id, addNotificationsDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        addNotificationsDetails,
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
* Create notification scheme
* Creates a notification scheme with notifications. You can create up to 1000 notifications per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* createNotificationSchemeDetails CreateNotificationSchemeDetails 
* returns NotificationSchemeId
* */
const createNotificationScheme = ({ createNotificationSchemeDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createNotificationSchemeDetails,
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
* Delete notification scheme
* Deletes a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* notificationSchemeId String The ID of the notification scheme.
* returns oas_any_type_not_mapped
* */
const deleteNotificationScheme = ({ notificationSchemeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        notificationSchemeId,
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
* Get notification scheme
* Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with the notification scheme.
*
* id Long The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-3-notificationscheme-get) to get a list of notification scheme IDs.
* expand String Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information  *  `field` Returns information about any custom fields assigned to receive an event  *  `group` Returns information about any groups assigned to receive an event  *  `notificationSchemeEvents` Returns a list of event associations. This list is returned for all expandable information  *  `projectRole` Returns information about any project roles assigned to receive an event  *  `user` Returns information about any users assigned to receive an event (optional)
* returns NotificationScheme
* */
const getNotificationScheme = ({ id, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        expand,
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
* Get projects using notification schemes paginated
* Returns a [paginated](#pagination) mapping of project that have notification scheme assigned. You can provide either one or multiple notification scheme IDs or project IDs to filter by. If you don't provide any, this will return a list of all mappings. Note that only company-managed (classic) projects are supported. This is because team-managed projects don't have a concept of a default notification scheme. The mappings are ordered by projectId.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* startAt String The index of the first item to return in a page of results (page offset). (optional)
* maxResults String The maximum number of items to return per page. (optional)
* notificationSchemeId Set The list of notifications scheme IDs to be filtered out (optional)
* projectId Set The list of project IDs to be filtered out (optional)
* returns PageBeanNotificationSchemeAndProjectMappingJsonBean
* */
const getNotificationSchemeToProjectMappings = ({ startAt, maxResults, notificationSchemeId, projectId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        notificationSchemeId,
        projectId,
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
* Get notification schemes paginated
* Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by the display name.  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with a notification scheme for it to be returned.
*
* startAt String The index of the first item to return in a page of results (page offset). (optional)
* maxResults String The maximum number of items to return per page. (optional)
* id Set The list of notification schemes IDs to be filtered by (optional)
* projectId Set The list of projects IDs to be filtered by (optional)
* onlyDefault Boolean When set to true, returns only the default notification scheme. If you provide project IDs not associated with the default, returns an empty page. The default value is false. (optional)
* expand String Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information  *  `field` Returns information about any custom fields assigned to receive an event  *  `group` Returns information about any groups assigned to receive an event  *  `notificationSchemeEvents` Returns a list of event associations. This list is returned for all expandable information  *  `projectRole` Returns information about any project roles assigned to receive an event  *  `user` Returns information about any users assigned to receive an event (optional)
* returns PageBeanNotificationScheme
* */
const getNotificationSchemes = ({ startAt, maxResults, id, projectId, onlyDefault, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        id,
        projectId,
        onlyDefault,
        expand,
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
* Remove notification from notification scheme
* Removes a notification from a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* notificationSchemeId String The ID of the notification scheme.
* notificationId String The ID of the notification.
* returns oas_any_type_not_mapped
* */
const removeNotificationFromNotificationScheme = ({ notificationSchemeId, notificationId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        notificationSchemeId,
        notificationId,
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
* Update notification scheme
* Updates a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id String The ID of the notification scheme.
* updateNotificationSchemeDetails UpdateNotificationSchemeDetails 
* returns oas_any_type_not_mapped
* */
const updateNotificationScheme = ({ id, updateNotificationSchemeDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        updateNotificationSchemeDetails,
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
  addNotifications,
  createNotificationScheme,
  deleteNotificationScheme,
  getNotificationScheme,
  getNotificationSchemeToProjectMappings,
  getNotificationSchemes,
  removeNotificationFromNotificationScheme,
  updateNotificationScheme,
};
