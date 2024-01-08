/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add field to default screen
* Adds a field to the default tab of the default screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* fieldId String The ID of the field.
* returns oas_any_type_not_mapped
* */
const addFieldToDefaultScreen = ({ fieldId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldId,
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
* Create screen
* Creates a screen with a default field tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenDetails ScreenDetails 
* returns Screen
* */
const createScreen = ({ screenDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenDetails,
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
* Delete screen
* Deletes a screen. A screen cannot be deleted if it is used in a screen scheme, workflow, or workflow draft.  Only screens used in classic projects can be deleted.
*
* screenId Long The ID of the screen.
* no response value expected for this operation
* */
const deleteScreen = ({ screenId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
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
* Get available screen fields
* Returns the fields that can be added to a tab on a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenId Long The ID of the screen.
* returns List
* */
const getAvailableScreenFields = ({ screenId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
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
* Get screens
* Returns a [paginated](#pagination) list of all screens or those specified by one or more screen IDs.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* id Set The list of screen IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`. (optional)
* queryString String String used to perform a case-insensitive partial match with screen name. (optional)
* scope Set The scope filter string. To filter by multiple scope, provide an ampersand-separated list. For example, `scope=GLOBAL&scope=PROJECT`. (optional)
* orderBy String [Order](#ordering) the results by a field:   *  `id` Sorts by screen ID.  *  `name` Sorts by screen name. (optional)
* returns PageBeanScreen
* */
const getScreens = ({ startAt, maxResults, id, queryString, scope, orderBy }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        id,
        queryString,
        scope,
        orderBy,
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
* Get screens for a field
* Returns a [paginated](#pagination) list of the screens a field is used in.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* fieldId String The ID of the field to return screens for.
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* expand String Use [expand](#expansion) to include additional information about screens in the response. This parameter accepts `tab` which returns details about the screen tabs the field is used in. (optional)
* returns PageBeanScreenWithTab
* */
const getScreensForField = ({ fieldId, startAt, maxResults, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldId,
        startAt,
        maxResults,
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
* Update screen
* Updates a screen. Only screens used in classic projects can be updated.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenId Long The ID of the screen.
* updateScreenDetails UpdateScreenDetails 
* returns Screen
* */
const updateScreen = ({ screenId, updateScreenDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
        updateScreenDetails,
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
  addFieldToDefaultScreen,
  createScreen,
  deleteScreen,
  getAvailableScreenFields,
  getScreens,
  getScreensForField,
  updateScreen,
};
