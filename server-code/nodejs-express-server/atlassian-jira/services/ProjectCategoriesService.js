/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create project category
* Creates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* projectCategory ProjectCategory 
* returns ProjectCategory
* */
const createProjectCategory = ({ projectCategory }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectCategory,
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
* Get all project categories
* Returns all project categories.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* returns List
* */
const getAllProjectCategories = () => new Promise(
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
* Get project category by ID
* Returns a project category.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* id Long The ID of the project category.
* returns ProjectCategory
* */
const getProjectCategoryById = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
/**
* Delete project category
* Deletes a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long ID of the project category to delete.
* no response value expected for this operation
* */
const removeProjectCategory = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
/**
* Update project category
* Updates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long 
* projectCategory ProjectCategory 
* returns UpdatedProjectCategory
* */
const updateProjectCategory = ({ id, projectCategory }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        projectCategory,
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
  createProjectCategory,
  getAllProjectCategories,
  getProjectCategoryById,
  removeProjectCategory,
  updateProjectCategory,
};
