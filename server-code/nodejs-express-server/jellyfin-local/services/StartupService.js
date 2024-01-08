/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Completes the startup wizard.
*
* no response value expected for this operation
* */
const completeWizard = () => new Promise(
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
* Gets the first user.
*
* returns StartupUserDto
* */
const getFirstUser = () => new Promise(
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
* Gets the first user.
*
* returns StartupUserDto
* */
const getFirstUser_2 = () => new Promise(
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
* Gets the initial startup wizard configuration.
*
* returns StartupConfigurationDto
* */
const getStartupConfiguration = () => new Promise(
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
* Sets remote access and UPnP.
*
* startupRemoteAccessDto StartupRemoteAccessDto The startup remote access dto.
* no response value expected for this operation
* */
const setRemoteAccess = ({ startupRemoteAccessDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startupRemoteAccessDto,
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
* Sets the initial startup wizard configuration.
*
* startupConfigurationDto StartupConfigurationDto The updated startup configuration.
* no response value expected for this operation
* */
const updateInitialConfiguration = ({ startupConfigurationDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startupConfigurationDto,
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
* Sets the user name and password.
*
* startupUserDto StartupUserDto The DTO containing username and password. (optional)
* no response value expected for this operation
* */
const updateStartupUser = ({ startupUserDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startupUserDto,
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
  completeWizard,
  getFirstUser,
  getFirstUser_2,
  getStartupConfiguration,
  setRemoteAccess,
  updateInitialConfiguration,
  updateStartupUser,
};
