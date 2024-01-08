/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get accessible project type by key
* Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* projectTypeKey String The key of the project type.
* returns ProjectType
* */
const getAccessibleProjectTypeByKey = ({ projectTypeKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectTypeKey,
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
* Get licensed project types
* Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) with a valid license.
*
* returns List
* */
const getAllAccessibleProjectTypes = () => new Promise(
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
* Get all project types
* Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* returns List
* */
const getAllProjectTypes = () => new Promise(
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
* Get project type by key
* Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* projectTypeKey String The key of the project type.
* returns ProjectType
* */
const getProjectTypeByKey = ({ projectTypeKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectTypeKey,
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
  getAccessibleProjectTypeByKey,
  getAllAccessibleProjectTypes,
  getAllProjectTypes,
  getProjectTypeByKey,
};
