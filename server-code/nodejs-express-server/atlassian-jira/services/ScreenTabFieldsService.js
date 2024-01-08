/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add screen tab field
* Adds a field to a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenId Long The ID of the screen.
* tabId Long The ID of the screen tab.
* addFieldBean AddFieldBean 
* returns ScreenableField
* */
const addScreenTabField = ({ screenId, tabId, addFieldBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
        tabId,
        addFieldBean,
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
* Get all screen tab fields
* Returns all fields for a screen tab.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
*
* screenId Long The ID of the screen.
* tabId Long The ID of the screen tab.
* projectKey String The key of the project. (optional)
* returns List
* */
const getAllScreenTabFields = ({ screenId, tabId, projectKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
        tabId,
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
* Move screen tab field
* Moves a screen tab field.  If `after` and `position` are provided in the request, `position` is ignored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenId Long The ID of the screen.
* tabId Long The ID of the screen tab.
* id String The ID of the field.
* moveFieldBean MoveFieldBean 
* returns oas_any_type_not_mapped
* */
const moveScreenTabField = ({ screenId, tabId, id, moveFieldBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
        tabId,
        id,
        moveFieldBean,
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
* Remove screen tab field
* Removes a field from a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenId Long The ID of the screen.
* tabId Long The ID of the screen tab.
* id String The ID of the field.
* no response value expected for this operation
* */
const removeScreenTabField = ({ screenId, tabId, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenId,
        tabId,
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

module.exports = {
  addScreenTabField,
  getAllScreenTabFields,
  moveScreenTabField,
  removeScreenTabField,
};
