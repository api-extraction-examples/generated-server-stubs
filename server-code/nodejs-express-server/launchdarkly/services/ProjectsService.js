/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a project by key. Caution-- deleting a project will delete all associated environments and feature flags. You cannot delete the last project in an account.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* no response value expected for this operation
* */
const deleteProject = ({ projectKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Fetch a single project by key.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* returns Project
* */
const getProject = ({ projectKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Returns a list of all projects in the account.
*
* returns Projects
* */
const getProjects = () => new Promise(
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
* Modify a project by ID.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* patchDelta List Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'
* returns Project
* */
const patchProject = ({ projectKey, patchDelta }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
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
* Create a new project with the given key and name.
*
* projectBody PostProjectRequest Project keys must be unique within an account.
* returns Project
* */
const postProject = ({ projectBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectBody,
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
  deleteProject,
  getProject,
  getProjects,
  patchProject,
  postProject,
};
