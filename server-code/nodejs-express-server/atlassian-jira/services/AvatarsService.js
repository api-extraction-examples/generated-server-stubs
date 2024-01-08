/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete avatar
* Deletes an avatar from a project or issue type.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* type String The avatar type.
* owningObjectId String The ID of the item the avatar is associated with.
* id Long The ID of the avatar.
* no response value expected for this operation
* */
const deleteAvatar = ({ type, owningObjectId, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        type,
        owningObjectId,
        id,
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
* Get system avatars by type
* Returns a list of system avatar details by owner type, where the owner types are issue type, project, or user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* type String The avatar type.
* returns SystemAvatars
* */
const getAllSystemAvatars = ({ type }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        type,
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
* Get avatar image by ID
* Returns a project or issue type avatar image by ID.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  For system avatars, none.  *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
*
* type String The icon type of the avatar.
* id Long The ID of the avatar.
* size String The size of the avatar image. If not provided the default size is returned. (optional)
* format String The format to return the avatar image in. If not provided the original content format is returned. (optional)
* no response value expected for this operation
* */
const getAvatarImageByID = ({ type, id, size, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        type,
        id,
        size,
        format,
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
* Get avatar image by owner
* Returns the avatar image for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  For system avatars, none.  *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
*
* type String The icon type of the avatar.
* entityId String The ID of the project or issue type the avatar belongs to.
* size String The size of the avatar image. If not provided the default size is returned. (optional)
* format String The format to return the avatar image in. If not provided the original content format is returned. (optional)
* no response value expected for this operation
* */
const getAvatarImageByOwner = ({ type, entityId, size, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        type,
        entityId,
        size,
        format,
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
* Get avatar image by type
* Returns the default project or issue type avatar image.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* type String The icon type of the avatar.
* size String The size of the avatar image. If not provided the default size is returned. (optional)
* format String The format to return the avatar image in. If not provided the original content format is returned. (optional)
* no response value expected for this operation
* */
const getAvatarImageByType = ({ type, size, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        type,
        size,
        format,
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
* Get avatars
* Returns the system and custom avatars for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  for custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  for custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.  *  for system avatars, none.
*
* type String The avatar type.
* entityId String The ID of the item the avatar is associated with.
* returns Avatars
* */
const getAvatars = ({ type, entityId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        type,
        entityId,
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
* Load avatar
* Loads a custom avatar for a project or issue type.  Specify the avatar's local file location in the body of the request. Also, include the following headers:   *  `X-Atlassian-Token: no-check` To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  `Content-Type: image/image type` Valid image types are JPEG, GIF, or PNG.  For example:   `curl --request POST `  `--user email@example.com:<api_token> `  `--header 'X-Atlassian-Token: no-check' `  `--header 'Content-Type: image/< image_type>' `  `--data-binary \"<@/path/to/file/with/your/avatar>\" `  `--url 'https://your-domain.atlassian.net/rest/api/3/universal_avatar/type/{type}/owner/{entityId}'`  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square's sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use:   *  [Update issue type](#api-rest-api-3-issuetype-id-put) to set it as the issue type's displayed avatar.  *  [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project's displayed avatar.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* type String The avatar type.
* entityId String The ID of the item the avatar is associated with.
* size Integer The length of each side of the crop region.
* body oas_any_type_not_mapped 
* x Integer The X coordinate of the top-left corner of the crop region. (optional)
* y Integer The Y coordinate of the top-left corner of the crop region. (optional)
* returns Avatar
* */
const storeAvatar = ({ type, entityId, size, body, x, y }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        type,
        entityId,
        size,
        body,
        x,
        y,
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
  deleteAvatar,
  getAllSystemAvatars,
  getAvatarImageByID,
  getAvatarImageByOwner,
  getAvatarImageByType,
  getAvatars,
  storeAvatar,
};
