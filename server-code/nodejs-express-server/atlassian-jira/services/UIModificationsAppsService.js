/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create UI modification
* Creates a UI modification. UI modification can only be created by Forge apps.  Each app can define up to 100 UI modifications. Each UI modification can define up to 1000 contexts.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
*
* createUiModificationDetails CreateUiModificationDetails Details of the UI modification.
* returns UiModificationIdentifiers
* */
const createUiModification = ({ createUiModificationDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createUiModificationDetails,
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
* Delete UI modification
* Deletes a UI modification. All the contexts that belong to the UI modification are deleted too. UI modification can only be deleted by Forge apps.  **[Permissions](#permissions) required:** None.
*
* uiModificationId String The ID of the UI modification.
* returns oas_any_type_not_mapped
* */
const deleteUiModification = ({ uiModificationId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        uiModificationId,
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
* Get UI modifications
* Gets UI modifications. UI modifications can only be retrieved by Forge apps.  **[Permissions](#permissions) required:** None.
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* expand String Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `data` Returns UI modification data.  *  `contexts` Returns UI modification contexts. (optional)
* returns PageBeanUiModificationDetails
* */
const getUiModifications = ({ startAt, maxResults, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Update UI modification
* Updates a UI modification. UI modification can only be updated by Forge apps.  Each UI modification can define up to 1000 contexts.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
*
* uiModificationId String The ID of the UI modification.
* updateUiModificationDetails UpdateUiModificationDetails Details of the UI modification.
* returns oas_any_type_not_mapped
* */
const updateUiModification = ({ uiModificationId, updateUiModificationDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        uiModificationId,
        updateUiModificationDetails,
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
  createUiModification,
  deleteUiModification,
  getUiModifications,
  updateUiModification,
};
