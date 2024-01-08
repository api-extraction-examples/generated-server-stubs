/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Load project avatar
* Loads an avatar for a project.  Specify the avatar's local file location in the body of the request. Also, include the following headers:   *  `X-Atlassian-Token: no-check` To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  `Content-Type: image/image type` Valid image types are JPEG, GIF, or PNG.  For example:   `curl --request POST `  `--user email@example.com:<api_token> `  `--header 'X-Atlassian-Token: no-check' `  `--header 'Content-Type: image/< image_type>' `  `--data-binary \"<@/path/to/file/with/your/avatar>\" `  `--url 'https://your-domain.atlassian.net/rest/api/3/project/{projectIdOrKey}/avatar2'`  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square's sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project's displayed avatar.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
*
* projectIdOrKey String The ID or (case-sensitive) key of the project.
* body oas_any_type_not_mapped 
* x Integer The X coordinate of the top-left corner of the crop region. (optional)
* y Integer The Y coordinate of the top-left corner of the crop region. (optional)
* size Integer The length of each side of the crop region. (optional)
* returns Avatar
* */
const createProjectAvatar = ({ projectIdOrKey, body, x, y, size }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
        body,
        x,
        y,
        size,
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
* Delete project avatar
* Deletes a custom avatar from a project. Note that system avatars cannot be deleted.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
*
* projectIdOrKey String The project ID or (case-sensitive) key.
* id Long The ID of the avatar.
* no response value expected for this operation
* */
const deleteProjectAvatar = ({ projectIdOrKey, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
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
* Get all project avatars
* Returns all project avatars, grouped by system and custom avatars.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
*
* projectIdOrKey String The ID or (case-sensitive) key of the project.
* returns ProjectAvatars
* */
const getAllProjectAvatars = ({ projectIdOrKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
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
* Set project avatar
* Sets the avatar displayed for a project.  Use [Load project avatar](#api-rest-api-3-project-projectIdOrKey-avatar2-post) to store avatars against the project, before using this operation to set the displayed avatar.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
*
* projectIdOrKey String The ID or (case-sensitive) key of the project.
* avatar Avatar 
* returns oas_any_type_not_mapped
* */
const updateProjectAvatar = ({ projectIdOrKey, avatar }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
        avatar,
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
  createProjectAvatar,
  deleteProjectAvatar,
  getAllProjectAvatars,
  updateProjectAvatar,
};
