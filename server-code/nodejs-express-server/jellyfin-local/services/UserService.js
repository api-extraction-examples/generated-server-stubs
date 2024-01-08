/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Authenticates a user.
*
* userId UUID The user id.
* pw String The password as plain text.
* password String The password sha1-hash. (optional)
* returns AuthenticationResult
* */
const authenticateUser = ({ userId, pw, password }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        pw,
        password,
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
* Authenticates a user by name.
*
* authenticateUserByName AuthenticateUserByName The M:Jellyfin.Api.Controllers.UserController.AuthenticateUserByName(Jellyfin.Api.Models.UserDtos.AuthenticateUserByName) request.
* returns AuthenticationResult
* */
const authenticateUserByName = ({ authenticateUserByName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authenticateUserByName,
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
* Authenticates a user with quick connect.
*
* quickConnectDto QuickConnectDto The Jellyfin.Api.Models.UserDtos.QuickConnectDto request.
* returns AuthenticationResult
* */
const authenticateWithQuickConnect = ({ quickConnectDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        quickConnectDto,
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
* Creates a user.
*
* createUserByName CreateUserByName The create user by name request body.
* returns UserDto
* */
const createUserByName = ({ createUserByName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createUserByName,
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
* Deletes a user.
*
* userId UUID The user id.
* no response value expected for this operation
* */
const deleteUser = ({ userId }) => new Promise(
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
* Initiates the forgot password process for a local user.
*
* forgotPasswordDto ForgotPasswordDto The forgot password request containing the entered username.
* returns ForgotPasswordResult
* */
const forgotPassword = ({ forgotPasswordDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        forgotPasswordDto,
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
* Redeems a forgot password pin.
*
* body String The pin. (optional)
* returns PinRedeemResult
* */
const forgotPasswordPin = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        body,
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
* Gets the user based on auth token.
*
* returns UserDto
* */
const getCurrentUser = () => new Promise(
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
* Gets a list of publicly visible users for display on a login screen.
*
* returns List
* */
const getPublicUsers = () => new Promise(
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
* Gets a user by Id.
*
* userId UUID The user id.
* returns UserDto
* */
const getUserById = ({ userId }) => new Promise(
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
* Gets a list of users.
*
* isHidden Boolean Optional filter by IsHidden=true or false. (optional)
* isDisabled Boolean Optional filter by IsDisabled=true or false. (optional)
* returns List
* */
const getUsers = ({ isHidden, isDisabled }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        isHidden,
        isDisabled,
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
* Updates a user.
*
* userId UUID The user id.
* userDto UserDto The updated user model.
* no response value expected for this operation
* */
const updateUser = ({ userId, userDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        userDto,
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
* Updates a user configuration.
*
* userId UUID The user id.
* userConfiguration UserConfiguration The new user configuration.
* no response value expected for this operation
* */
const updateUserConfiguration = ({ userId, userConfiguration }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        userConfiguration,
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
* Updates a user's easy password.
*
* userId UUID The user id.
* updateUserEasyPassword UpdateUserEasyPassword The M:Jellyfin.Api.Controllers.UserController.UpdateUserEasyPassword(System.Guid,Jellyfin.Api.Models.UserDtos.UpdateUserEasyPassword) request.
* no response value expected for this operation
* */
const updateUserEasyPassword = ({ userId, updateUserEasyPassword }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        updateUserEasyPassword,
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
* Updates a user's password.
*
* userId UUID The user id.
* updateUserPassword UpdateUserPassword The M:Jellyfin.Api.Controllers.UserController.UpdateUserPassword(System.Guid,Jellyfin.Api.Models.UserDtos.UpdateUserPassword) request.
* no response value expected for this operation
* */
const updateUserPassword = ({ userId, updateUserPassword }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        updateUserPassword,
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
* Updates a user policy.
*
* userId UUID The user id.
* userPolicy UserPolicy The new user policy.
* no response value expected for this operation
* */
const updateUserPolicy = ({ userId, userPolicy }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        userPolicy,
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
  authenticateUser,
  authenticateUserByName,
  authenticateWithQuickConnect,
  createUserByName,
  deleteUser,
  forgotPassword,
  forgotPasswordPin,
  getCurrentUser,
  getPublicUsers,
  getUserById,
  getUsers,
  updateUser,
  updateUserConfiguration,
  updateUserEasyPassword,
  updateUserPassword,
  updateUserPolicy,
};
