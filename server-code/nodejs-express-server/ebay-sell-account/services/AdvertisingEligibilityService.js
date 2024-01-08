/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This method allows developers to check the seller eligibility status for eBay advertising programs.
*
* xEBAYCMARKETPLACEID String The unique identifier of the eBay marketplace for which the seller eligibility status shall be checked.<br /><br /><span class=\"tablenote\"><b>Note:</b> This value is case-sensitive.</span>
* programUnderscoretypes String A comma-separated list of eBay advertising programs.<br /><br /><span class=\"tablenote\"><b>Tip:</b> See the <a href=\"/api-docs/sell/account/types/plser:AdvertisingProgramEnum\"> AdvertisingProgramEnum</a> type for possible values.</span><br /><br />If no programs are specified, the results will be returned for all programs. (optional)
* returns SellerEligibilityMultiProgramResponse
* */
const getAdvertisingEligibility = ({ xEBAYCMARKETPLACEID, programUnderscoretypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xEBAYCMARKETPLACEID,
        programUnderscoretypes,
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
  getAdvertisingEligibility,
};
