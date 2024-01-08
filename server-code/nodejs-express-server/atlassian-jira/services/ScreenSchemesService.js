/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create screen scheme
* Creates a screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenSchemeDetails ScreenSchemeDetails 
* returns ScreenSchemeId
* */
const createScreenScheme = ({ screenSchemeDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenSchemeDetails,
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
* Delete screen scheme
* Deletes a screen scheme. A screen scheme cannot be deleted if it is used in an issue type screen scheme.  Only screens schemes used in classic projects can be deleted.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenSchemeId String The ID of the screen scheme.
* no response value expected for this operation
* */
const deleteScreenScheme = ({ screenSchemeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenSchemeId,
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
* Get screen schemes
* Returns a [paginated](#pagination) list of screen schemes.  Only screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* id Set The list of screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`. (optional)
* expand String Use [expand](#expansion) include additional information in the response. This parameter accepts `issueTypeScreenSchemes` that, for each screen schemes, returns information about the issue type screen scheme the screen scheme is assigned to. (optional)
* queryString String String used to perform a case-insensitive partial match with screen scheme name. (optional)
* orderBy String [Order](#ordering) the results by a field:   *  `id` Sorts by screen scheme ID.  *  `name` Sorts by screen scheme name. (optional)
* returns PageBeanScreenScheme
* */
const getScreenSchemes = ({ startAt, maxResults, id, expand, queryString, orderBy }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        id,
        expand,
        queryString,
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
* Update screen scheme
* Updates a screen scheme. Only screen schemes used in classic projects can be updated.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* screenSchemeId String The ID of the screen scheme.
* updateScreenSchemeDetails UpdateScreenSchemeDetails The screen scheme update details.
* returns oas_any_type_not_mapped
* */
const updateScreenScheme = ({ screenSchemeId, updateScreenSchemeDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        screenSchemeId,
        updateScreenSchemeDetails,
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
  createScreenScheme,
  deleteScreenScheme,
  getScreenSchemes,
  updateScreenScheme,
};
