/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Cancels a package installation.
*
* packageId UUID Installation Id.
* no response value expected for this operation
* */
const cancelPackageInstallation = ({ packageId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        packageId,
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
* Gets a package by name or assembly GUID.
*
* name String The name of the package.
* assemblyGuid UUID The GUID of the associated assembly. (optional)
* returns PackageInfo
* */
const getPackageInfo = ({ name, assemblyGuid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        assemblyGuid,
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
* Gets available packages.
*
* returns List
* */
const getPackages = () => new Promise(
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
* Gets all package repositories.
*
* returns List
* */
const getRepositories = () => new Promise(
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
* Installs a package.
*
* name String Package name.
* assemblyGuid UUID GUID of the associated assembly. (optional)
* version String Optional version. Defaults to latest version. (optional)
* repositoryUrl String Optional. Specify the repository to install from. (optional)
* no response value expected for this operation
* */
const installPackage = ({ name, assemblyGuid, version, repositoryUrl }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        assemblyGuid,
        version,
        repositoryUrl,
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
* Sets the enabled and existing package repositories.
*
* repositoryInfo List The list of package repositories. (optional)
* no response value expected for this operation
* */
const setRepositories = ({ repositoryInfo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        repositoryInfo,
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
  cancelPackageInstallation,
  getPackageInfo,
  getPackages,
  getRepositories,
  installPackage,
  setRepositories,
};
