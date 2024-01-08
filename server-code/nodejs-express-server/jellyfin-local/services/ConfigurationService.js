/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets application configuration.
*
* returns ServerConfiguration
* */
const getConfiguration = () => new Promise(
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
* Gets a default MetadataOptions object.
*
* returns MetadataOptions
* */
const getDefaultMetadataOptions = () => new Promise(
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
* Gets a named configuration.
*
* key String Configuration key.
* returns File
* */
const getNamedConfiguration = ({ key }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        key,
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
* Updates application configuration.
*
* serverConfiguration ServerConfiguration Configuration.
* no response value expected for this operation
* */
const updateConfiguration = ({ serverConfiguration }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serverConfiguration,
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
* Updates the path to the media encoder.
*
* mediaEncoderPathDto MediaEncoderPathDto Media encoder path form body.
* no response value expected for this operation
* */
const updateMediaEncoderPath = ({ mediaEncoderPathDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mediaEncoderPathDto,
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
* Updates named configuration.
*
* key String Configuration key.
* no response value expected for this operation
* */
const updateNamedConfiguration = ({ key }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        key,
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
  getConfiguration,
  getDefaultMetadataOptions,
  getNamedConfiguration,
  updateConfiguration,
  updateMediaEncoderPath,
  updateNamedConfiguration,
};
