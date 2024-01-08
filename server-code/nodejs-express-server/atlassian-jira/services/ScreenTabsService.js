/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create screen tab
* Creates a tab for a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenId Long The ID of the screen.
* screenableTab ScreenableTab 
* returns ScreenableTab
* */
const addScreenTab = ({ screenId, screenableTab }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
        screenableTab,
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
* Delete screen tab
* Deletes a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenId Long The ID of the screen.
* tabId Long The ID of the screen tab.
* no response value expected for this operation
* */
const deleteScreenTab = ({ screenId, tabId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
        tabId,
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
* Get all screen tabs
* Returns the list of tabs for a screen.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
*
* screenId Long The ID of the screen.
* projectKey String The key of the project. (optional)
* returns List
* */
const getAllScreenTabs = ({ screenId, projectKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
        projectKey,
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
* Move screen tab
* Moves a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenId Long The ID of the screen.
* tabId Long The ID of the screen tab.
* pos Integer The position of tab. The base index is 0.
* returns oas_any_type_not_mapped
* */
const moveScreenTab = ({ screenId, tabId, pos }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
        tabId,
        pos,
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
* Update screen tab
* Updates the name of a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenId Long The ID of the screen.
* tabId Long The ID of the screen tab.
* screenableTab ScreenableTab 
* returns ScreenableTab
* */
const renameScreenTab = ({ screenId, tabId, screenableTab }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
        tabId,
        screenableTab,
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
  addScreenTab,
  deleteScreenTab,
  getAllScreenTabs,
  moveScreenTab,
  renameScreenTab,
};
