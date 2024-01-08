/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets Dlna media receiver registrar xml.
*
* serverId String Server UUID.
* returns File
* */
const getConnectionManager = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Gets Dlna media receiver registrar xml.
*
* serverId String Server UUID.
* returns File
* */
const getConnectionManager_2 = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Gets Dlna media receiver registrar xml.
*
* serverId String Server UUID.
* returns File
* */
const getConnectionManager_3 = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Gets Dlna content directory xml.
*
* serverId String Server UUID.
* returns File
* */
const getContentDirectory = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Gets Dlna content directory xml.
*
* serverId String Server UUID.
* returns File
* */
const getContentDirectory_2 = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Gets Dlna content directory xml.
*
* serverId String Server UUID.
* returns File
* */
const getContentDirectory_3 = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Get Description Xml.
*
* serverId String Server UUID.
* returns File
* */
const getDescriptionXml = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Get Description Xml.
*
* serverId String Server UUID.
* returns File
* */
const getDescriptionXml_2 = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Gets a server icon.
*
* fileName String The icon filename.
* returns File
* */
const getIcon = ({ fileName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fileName,
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
* Gets a server icon.
*
* serverId String Server UUID.
* fileName String The icon filename.
* returns File
* */
const getIconId = ({ serverId, fileName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
        fileName,
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
* Gets Dlna media receiver registrar xml.
*
* serverId String Server UUID.
* returns File
* */
const getMediaReceiverRegistrar = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Gets Dlna media receiver registrar xml.
*
* serverId String Server UUID.
* returns File
* */
const getMediaReceiverRegistrar_2 = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Gets Dlna media receiver registrar xml.
*
* serverId String Server UUID.
* returns File
* */
const getMediaReceiverRegistrar_3 = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Process a connection manager control request.
*
* serverId String Server UUID.
* returns File
* */
const processConnectionManagerControlRequest = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Process a content directory control request.
*
* serverId String Server UUID.
* returns File
* */
const processContentDirectoryControlRequest = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
* Process a media receiver registrar control request.
*
* serverId String Server UUID.
* returns File
* */
const processMediaReceiverRegistrarControlRequest = ({ serverId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverId,
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
  getConnectionManager,
  getConnectionManager_2,
  getConnectionManager_3,
  getContentDirectory,
  getContentDirectory_2,
  getContentDirectory_3,
  getDescriptionXml,
  getDescriptionXml_2,
  getIcon,
  getIconId,
  getMediaReceiverRegistrar,
  getMediaReceiverRegistrar_2,
  getMediaReceiverRegistrar_3,
  processConnectionManagerControlRequest,
  processContentDirectoryControlRequest,
  processMediaReceiverRegistrarControlRequest,
};
