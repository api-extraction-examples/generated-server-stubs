/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a role
* Delete a role.  *New in version 2.1.0* 
*
* roleUnderscorename String The role name
* no response value expected for this operation
* */
const delete_role = ({ roleUnderscorename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleUnderscorename,
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
* Get a role
* Get a role.  *New in version 2.1.0* 
*
* roleUnderscorename String The role name
* returns Role
* */
const get_role = ({ roleUnderscorename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleUnderscorename,
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
* List roles
* Get a list of roles.  *New in version 2.1.0* 
*
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* returns RoleCollection
* */
const get_roles = ({ limit, offset, orderUnderscoreby }) => new Promise(
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
* Update a role
* Update a role.  *New in version 2.1.0* 
*
* roleUnderscorename String The role name
* role Role 
* updateUnderscoremask List The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
* returns Role
* */
const patch_role = ({ roleUnderscorename, role, updateUnderscoremask }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        roleUnderscorename,
        role,
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
* Create a role
* Create a new role.  *New in version 2.1.0* 
*
* role Role 
* returns Role
* */
const post_role = ({ role }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        role,
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
  delete_role,
  get_role,
  get_roles,
  patch_role,
  post_role,
};
