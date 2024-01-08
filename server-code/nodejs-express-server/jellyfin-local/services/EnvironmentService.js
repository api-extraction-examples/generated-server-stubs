/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Default directory browser.
*
* returns DefaultDirectoryBrowserInfoDto
* */
const getDefaultDirectoryBrowser = () => new Promise(
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
* Gets the contents of a given directory in the file system.
*
* path String The path.
* includeFiles Boolean An optional filter to include or exclude files from the results. true/false. (optional)
* includeDirectories Boolean An optional filter to include or exclude folders from the results. true/false. (optional)
* returns List
* */
const getDirectoryContents = ({ path, includeFiles, includeDirectories }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        path,
        includeFiles,
        includeDirectories,
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
* Gets available drives from the server's file system.
*
* returns List
* */
const getDrives = () => new Promise(
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
* Gets network paths.
*
* returns List
* */
const getNetworkShares = () => new Promise(
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
* Gets the parent path of a given path.
*
* path String The path.
* returns String
* */
const getParentPath = ({ path }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        path,
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
* Validates path.
*
* validatePathDto ValidatePathDto Validate request object.
* no response value expected for this operation
* */
const validatePath = ({ validatePathDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        validatePathDto,
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
  getDefaultDirectoryBrowser,
  getDirectoryContents,
  getDrives,
  getNetworkShares,
  getParentPath,
  validatePath,
};
