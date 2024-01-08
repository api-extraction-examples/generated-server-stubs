/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Sends a notification to all admins.
*
* url String The URL of the notification. (optional)
* level NotificationLevel The level of the notification. (optional)
* name String The name of the notification. (optional)
* description String The description of the notification. (optional)
* no response value expected for this operation
* */
const createAdminNotification = ({ url, level, name, description }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        url,
        level,
        name,
        description,
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
* Gets notification services.
*
* returns List
* */
const getNotificationServices = () => new Promise(
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
* Gets notification types.
*
* returns List
* */
const getNotificationTypes = () => new Promise(
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
* Gets a user's notifications.
*
* userId String 
* returns NotificationResultDto
* */
const getNotifications = ({ userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
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
* Gets a user's notification summary.
*
* userId String 
* returns NotificationsSummaryDto
* */
const getNotificationsSummary = ({ userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
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
* Sets notifications as read.
*
* userId String 
* no response value expected for this operation
* */
const setRead = ({ userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
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
* Sets notifications as unread.
*
* userId String 
* no response value expected for this operation
* */
const setUnread = ({ userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
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
  createAdminNotification,
  getNotificationServices,
  getNotificationTypes,
  getNotifications,
  getNotificationsSummary,
  setRead,
  setUnread,
};
