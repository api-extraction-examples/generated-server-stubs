/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Temporarily activates quick connect for five minutes.
*
* no response value expected for this operation
* */
const activate = () => new Promise(
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
* Authorizes a pending quick connect request.
*
* code String Quick connect code to authorize.
* returns Boolean
* */
const authorize = ({ code }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        code,
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
* Enables or disables quick connect.
*
* status QuickConnectState New MediaBrowser.Model.QuickConnect.QuickConnectState. (optional)
* no response value expected for this operation
* */
const available = ({ status }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        status,
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
* Attempts to retrieve authentication information.
*
* secret String Secret previously returned from the Initiate endpoint.
* returns QuickConnectResult
* */
const connect = ({ secret }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        secret,
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
* Deauthorize all quick connect devices for the current user.
*
* returns Integer
* */
const deauthorize = () => new Promise(
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
* Gets the current quick connect state.
*
* returns QuickConnectState
* */
const getStatus = () => new Promise(
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
* Initiate a new quick connect request.
*
* returns QuickConnectResult
* */
const initiate = () => new Promise(
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

module.exports = {
  activate,
  authorize,
  available,
  connect,
  deauthorize,
  getStatus,
  initiate,
};
