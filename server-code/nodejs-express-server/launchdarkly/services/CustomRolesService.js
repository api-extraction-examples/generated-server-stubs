/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a custom role by key.
*
* customRoleKey String The custom role key.
* no response value expected for this operation
* */
const deleteCustomRole = ({ customRoleKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        customRoleKey,
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
* Get one custom role by key.
*
* customRoleKey String The custom role key.
* returns CustomRole
* */
const getCustomRole = ({ customRoleKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        customRoleKey,
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
* Return a complete list of custom roles.
*
* returns CustomRoles
* */
const getCustomRoles = () => new Promise(
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
* Modify a custom role by key.
*
* customRoleKey String The custom role key.
* patchDelta List Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'
* returns CustomRole
* */
const patchCustomRole = ({ customRoleKey, patchDelta }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        customRoleKey,
        patchDelta,
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
* Create a new custom role.
*
* customRoleBody PostCustomRoleRequest New role or roles to create.
* returns CustomRole
* */
const postCustomRole = ({ customRoleBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        customRoleBody,
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
  deleteCustomRole,
  getCustomRole,
  getCustomRoles,
  patchCustomRole,
  postCustomRole,
};
