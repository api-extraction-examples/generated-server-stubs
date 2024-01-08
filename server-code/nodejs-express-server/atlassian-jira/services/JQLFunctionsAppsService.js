/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get precomputations (apps)
* Returns the list of a function's precomputations along with information about when they were created, updated, and last used. Each precomputation has a `value` \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.
*
* functionKey List The function key in format:   *  Forge: `ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]`.  *  Connect: `[App key]__[Module key]`. (optional)
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* orderBy String Not supported yet. (optional)
* filter String Not supported yet. (optional)
* returns PageBeanJqlFunctionPrecomputationBean
* */
const getPrecomputations = ({ functionKey, startAt, maxResults, orderBy, filter }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        functionKey,
        startAt,
        maxResults,
        orderBy,
        filter,
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
* Update precomputations (apps)
* Update the precomputation value of a function created by a Forge/Connect app.  **[Permissions](#permissions) required:** An API for apps to update their own precomputations.
*
* jqlFunctionPrecomputationUpdateRequestBean JqlFunctionPrecomputationUpdateRequestBean 
* returns oas_any_type_not_mapped
* */
const updatePrecomputations = ({ jqlFunctionPrecomputationUpdateRequestBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        jqlFunctionPrecomputationUpdateRequestBean,
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
  getPrecomputations,
  updatePrecomputations,
};
