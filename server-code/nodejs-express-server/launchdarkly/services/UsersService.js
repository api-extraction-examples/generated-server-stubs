/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a user by ID.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userKey String The user's key.
* no response value expected for this operation
* */
const deleteUser = ({ projectKey, environmentKey, userKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userKey,
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
* Search users in LaunchDarkly based on their last active date, or a search query. It should not be used to enumerate all users in LaunchDarkly-- use the List users API resource.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* q String Search query. (optional)
* limit Integer Pagination limit. (optional)
* offset Integer Specifies the first item to return in the collection. (optional)
* after Long A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have occurred after this timestamp. (optional)
* returns Users
* */
const getSearchUsers = ({ projectKey, environmentKey, q, limit, offset, after }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        q,
        limit,
        offset,
        after,
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
* Get a user by key.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userKey String The user's key.
* returns UserRecord
* */
const getUser = ({ projectKey, environmentKey, userKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userKey,
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
* List all users in the environment. Includes the total count of users. In each page, there will be up to 'limit' users returned (default 20). This is useful for exporting all users in the system for further analysis. Paginated collections will include a next link containing a URL with the next set of elements in the collection.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* limit Integer Pagination limit. (optional)
* h String This parameter is required when following \"next\" links. (optional)
* scrollId String This parameter is required when following \"next\" links. (optional)
* returns Users
* */
const getUsers = ({ projectKey, environmentKey, limit, h, scrollId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        limit,
        h,
        scrollId,
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
  deleteUser,
  getSearchUsers,
  getUser,
  getUsers,
};
