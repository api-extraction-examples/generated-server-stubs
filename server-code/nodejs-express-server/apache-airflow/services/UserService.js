/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a user
* Delete a user with a specific username.  *New in version 2.2.0* 
*
* username String The username of the user.  *New in version 2.1.0* 
* no response value expected for this operation
* */
const delete_user = ({ username }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
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
* Get a user
* Get a user with a specific username.  *New in version 2.1.0* 
*
* username String The username of the user.  *New in version 2.1.0* 
* returns UserCollectionItem
* */
const get_user = ({ username }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
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
* List users
* Get a list of users.  *New in version 2.1.0* 
*
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* returns UserCollection
* */
const get_users = ({ limit, offset, orderUnderscoreby }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        orderUnderscoreby,
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
* Update a user
* Update fields for a user.  *New in version 2.2.0* 
*
* username String The username of the user.  *New in version 2.1.0* 
* user User 
* updateUnderscoremask List The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
* returns UserCollectionItem
* */
const patch_user = ({ username, user, updateUnderscoremask }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        user,
        updateUnderscoremask,
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
* Create a user
* Create a new user with unique username and email.  *New in version 2.2.0* 
*
* user User 
* returns User
* */
const post_user = ({ user }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        user,
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
  delete_user,
  get_user,
  get_users,
  patch_user,
  post_user,
};
