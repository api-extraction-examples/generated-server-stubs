/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets branding css.
*
* returns String
* */
const getBrandingCss = () => new Promise(
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
* Gets branding css.
*
* returns String
* */
const getBrandingCss_2 = () => new Promise(
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
* Gets branding configuration.
*
* returns BrandingOptions
* */
const getBrandingOptions = () => new Promise(
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
  getBrandingCss,
  getBrandingCss_2,
  getBrandingOptions,
};
