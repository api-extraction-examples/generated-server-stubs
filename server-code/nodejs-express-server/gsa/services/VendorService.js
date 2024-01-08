/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This endpoint returns a single vendor by their 9 digit DUNS number
* <p>This endpoint returns a single vendor by their 9 digit DUNS number. DUNS numbers can be looked up in the <a href=\"https://www.sam.gov\">System for Award Management</a> by vendor name.</p>
*
* duns String a nine digit DUNS number that uniquely identifies the vendor (required)
* returns Object
* */
const get_Vendor_GET = ({ duns }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        duns,
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
  get_Vendor_GET,
};
