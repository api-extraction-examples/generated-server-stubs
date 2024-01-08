/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* buildBetaNotificationCreateRequest BuildBetaNotificationCreateRequest BuildBetaNotification representation
* returns BuildBetaNotificationResponse
* */
const buildBetaNotificationsCreate_instance = ({ buildBetaNotificationCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        buildBetaNotificationCreateRequest,
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
  buildBetaNotificationsCreate_instance,
};
