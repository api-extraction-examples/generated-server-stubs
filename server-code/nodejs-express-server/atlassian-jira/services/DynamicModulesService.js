/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get modules
* Returns all modules registered dynamically by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
*
* returns ConnectModules
* */
const dynamicModulesResource.getModules_get = () => new Promise(
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
* Register modules
* Registers a list of modules.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
*
* connectModules ConnectModules 
* no response value expected for this operation
* */
const dynamicModulesResource.registerModules_post = ({ connectModules }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        connectModules,
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
* Remove modules
* Remove all or a list of modules registered by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
*
* moduleKey List The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, `moduleKey=dynamic-attachment-entity-property&moduleKey=dynamic-select-field`. Nonexistent keys are ignored. (optional)
* no response value expected for this operation
* */
const dynamicModulesResource.removeModules_delete = ({ moduleKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        moduleKey,
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
  dynamicModulesResource.getModules_get,
  dynamicModulesResource.registerModules_post,
  dynamicModulesResource.removeModules_delete,
};
