/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add gadget to dashboard
* Adds a gadget to a dashboard.  **[Permissions](#permissions) required:** None.
*
* dashboardId Long The ID of the dashboard.
* dashboardGadgetSettings DashboardGadgetSettings 
* returns DashboardGadget
* */
const addGadget = ({ dashboardId, dashboardGadgetSettings }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dashboardId,
        dashboardGadgetSettings,
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
* Copy dashboard
* Copies a dashboard. Any values provided in the `dashboard` parameter replace those in the copied dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be copied must be owned by or shared with the user.
*
* id String 
* dashboardDetails DashboardDetails Dashboard details.
* returns Dashboard
* */
const copyDashboard = ({ id, dashboardDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        dashboardDetails,
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
* Create dashboard
* Creates a dashboard.  **[Permissions](#permissions) required:** None.
*
* dashboardDetails DashboardDetails Dashboard details.
* returns Dashboard
* */
const createDashboard = ({ dashboardDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dashboardDetails,
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
* Delete dashboard
* Deletes a dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be deleted must be owned by the user.
*
* id String The ID of the dashboard.
* no response value expected for this operation
* */
const deleteDashboard = ({ id }) => new Promise(
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
* Delete dashboard item property
* Deletes a dashboard item property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.
*
* dashboardId String The ID of the dashboard.
* itemId String The ID of the dashboard item.
* propertyKey String The key of the dashboard item property.
* no response value expected for this operation
* */
const deleteDashboardItemProperty = ({ dashboardId, itemId, propertyKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dashboardId,
        itemId,
        propertyKey,
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
* Get available gadgets
* Gets a list of all available gadgets that can be added to all dashboards.  **[Permissions](#permissions) required:** None.
*
* returns AvailableDashboardGadgetsResponse
* */
const getAllAvailableDashboardGadgets = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get all dashboards
* Returns a list of dashboards owned by or shared with the user. The list may be filtered to include only favorite or owned dashboards.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* filter String The filter applied to the list of dashboards. Valid values are:   *  `favourite` Returns dashboards the user has marked as favorite.  *  `my` Returns dashboards owned by the user. (optional)
* startAt Integer The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* returns PageOfDashboards
* */
const getAllDashboards = ({ filter, startAt, maxResults }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filter,
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
* Get gadgets
* Returns a list of dashboard gadgets on a dashboard.  This operation returns:   *  Gadgets from a list of IDs, when `id` is set.  *  Gadgets with a module key, when `moduleKey` is set.  *  Gadgets from a list of URIs, when `uri` is set.  *  All gadgets, when no other parameters are set.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* dashboardId Long The ID of the dashboard.
* moduleKey List The list of gadgets module keys. To include multiple module keys, separate module keys with ampersand: `moduleKey=key:one&moduleKey=key:two`. (optional)
* uri List The list of gadgets URIs. To include multiple URIs, separate URIs with ampersand: `uri=/rest/example/uri/1&uri=/rest/example/uri/2`. (optional)
* gadgetId List The list of gadgets IDs. To include multiple IDs, separate IDs with ampersand: `gadgetId=10000&gadgetId=10001`. (optional)
* returns DashboardGadgetResponse
* */
const getAllGadgets = ({ dashboardId, moduleKey, uri, gadgetId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dashboardId,
        moduleKey,
        uri,
        gadgetId,
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
* Get dashboard
* Returns a dashboard.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.  However, to get a dashboard, the dashboard must be shared with the user or the user must own it. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.
*
* id String The ID of the dashboard.
* returns Dashboard
* */
const getDashboard = ({ id }) => new Promise(
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
* Get dashboard item property
* Returns the key and value of a dashboard item property.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item's content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira’s anonymous access is permitted.
*
* dashboardId String The ID of the dashboard.
* itemId String The ID of the dashboard item.
* propertyKey String The key of the dashboard item property.
* returns EntityProperty
* */
const getDashboardItemProperty = ({ dashboardId, itemId, propertyKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dashboardId,
        itemId,
        propertyKey,
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
* Get dashboard item property keys
* Returns the keys of all properties for a dashboard item.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira’s anonymous access is permitted.
*
* dashboardId String The ID of the dashboard.
* itemId String The ID of the dashboard item.
* returns PropertyKeys
* */
const getDashboardItemPropertyKeys = ({ dashboardId, itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dashboardId,
        itemId,
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
* Search for dashboards
* Returns a [paginated](#pagination) list of dashboards. This operation is similar to [Get dashboards](#api-rest-api-3-dashboard-get) except that the results can be refined to include dashboards that have specific attributes. For example, dashboards with a particular name. When multiple attributes are specified only filters matching all attributes are returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The following dashboards that match the query parameters are returned:   *  Dashboards owned by the user. Not returned for anonymous users.  *  Dashboards shared with a group that the user is a member of. Not returned for anonymous users.  *  Dashboards shared with a private project that the user can browse. Not returned for anonymous users.  *  Dashboards shared with a public project.  *  Dashboards shared with the public.
*
* dashboardName String String used to perform a case-insensitive partial match with `name`. (optional)
* accountId String User account ID used to return dashboards with the matching `owner.accountId`. This parameter cannot be used with the `owner` parameter. (optional)
* owner String This parameter is deprecated because of privacy changes. Use `accountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching `owner.name`. This parameter cannot be used with the `accountId` parameter. (optional)
* groupname String As a group's name can change, use of `groupId` is recommended. Group name used to return dashboards that are shared with a group that matches `sharePermissions.group.name`. This parameter cannot be used with the `groupId` parameter. (optional)
* groupId String Group ID used to return dashboards that are shared with a group that matches `sharePermissions.group.groupId`. This parameter cannot be used with the `groupname` parameter. (optional)
* projectId Long Project ID used to returns dashboards that are shared with a project that matches `sharePermissions.project.id`. (optional)
* orderBy String [Order](#ordering) the results by a field:   *  `description` Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  `favourite_count` Sorts by dashboard popularity.  *  `id` Sorts by dashboard ID.  *  `is_favourite` Sorts by whether the dashboard is marked as a favorite.  *  `name` Sorts by dashboard name.  *  `owner` Sorts by dashboard owner name. (optional)
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* status String The status to filter by. It may be active, archived or deleted. (optional)
* expand String Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  `description` Returns the description of the dashboard.  *  `owner` Returns the owner of the dashboard.  *  `viewUrl` Returns the URL that is used to view the dashboard.  *  `favourite` Returns `isFavourite`, an indicator of whether the user has set the dashboard as a favorite.  *  `favouritedCount` Returns `popularity`, a count of how many users have set this dashboard as a favorite.  *  `sharePermissions` Returns details of the share permissions defined for the dashboard.  *  `editPermissions` Returns details of the edit permissions defined for the dashboard.  *  `isWritable` Returns whether the current user has permission to edit the dashboard. (optional)
* returns PageBeanDashboard
* */
const getDashboardsPaginated = ({ dashboardName, accountId, owner, groupname, groupId, projectId, orderBy, startAt, maxResults, status, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dashboardName,
        accountId,
        owner,
        groupname,
        groupId,
        projectId,
        orderBy,
        startAt,
        maxResults,
        status,
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
* Remove gadget from dashboard
* Removes a dashboard gadget from a dashboard.  When a gadget is removed from a dashboard, other gadgets in the same column are moved up to fill the emptied position.  **[Permissions](#permissions) required:** None.
*
* dashboardId Long The ID of the dashboard.
* gadgetId Long The ID of the gadget.
* returns oas_any_type_not_mapped
* */
const removeGadget = ({ dashboardId, gadgetId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dashboardId,
        gadgetId,
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
* Set dashboard item property
* Sets the value of a dashboard item property. Use this resource in apps to store custom data against a dashboard item.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item's content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.
*
* dashboardId String The ID of the dashboard.
* itemId String The ID of the dashboard item.
* propertyKey String The key of the dashboard item property. The maximum length is 255 characters. For dashboard items with a spec URI and no complete module key, if the provided propertyKey is equal to \"config\", the request body's JSON must be an object with all keys and values as strings.
* body oas_any_type_not_mapped 
* returns oas_any_type_not_mapped
* */
const setDashboardItemProperty = ({ dashboardId, itemId, propertyKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dashboardId,
        itemId,
        propertyKey,
        body,
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
* Update dashboard
* Updates a dashboard, replacing all the dashboard details with those provided.  **[Permissions](#permissions) required:** None  The dashboard to be updated must be owned by the user.
*
* id String The ID of the dashboard to update.
* dashboardDetails DashboardDetails Replacement dashboard details.
* returns Dashboard
* */
const updateDashboard = ({ id, dashboardDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        dashboardDetails,
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
* Update gadget on dashboard
* Changes the title, position, and color of the gadget on a dashboard.  **[Permissions](#permissions) required:** None.
*
* dashboardId Long The ID of the dashboard.
* gadgetId Long The ID of the gadget.
* dashboardGadgetUpdateRequest DashboardGadgetUpdateRequest 
* returns oas_any_type_not_mapped
* */
const updateGadget = ({ dashboardId, gadgetId, dashboardGadgetUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dashboardId,
        gadgetId,
        dashboardGadgetUpdateRequest,
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
  addGadget,
  copyDashboard,
  createDashboard,
  deleteDashboard,
  deleteDashboardItemProperty,
  getAllAvailableDashboardGadgets,
  getAllDashboards,
  getAllGadgets,
  getDashboard,
  getDashboardItemProperty,
  getDashboardItemPropertyKeys,
  getDashboardsPaginated,
  removeGadget,
  setDashboardItemProperty,
  updateDashboard,
  updateGadget,
};
