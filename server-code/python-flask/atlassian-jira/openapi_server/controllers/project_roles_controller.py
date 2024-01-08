import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_update_role_request_bean import CreateUpdateRoleRequestBean  # noqa: E501
from openapi_server.models.project_role import ProjectRole  # noqa: E501
from openapi_server.models.project_role_details import ProjectRoleDetails  # noqa: E501
from openapi_server import util


def create_project_role(create_update_role_request_bean):  # noqa: E501
    """Create project role

    Creates a new project role with no [default actors](#api-rest-api-3-resolution-get). You can use the [Add default actors to project role](#api-rest-api-3-role-id-actors-post) operation to add default actors to the project role after creating it.  *Note that although a new project role is available to all projects upon creation, any default actors that are associated with the project role are not added to projects that existed prior to the role being created.*&lt;  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param create_update_role_request_bean: 
    :type create_update_role_request_bean: dict | bytes

    :rtype: Union[ProjectRole, Tuple[ProjectRole, int], Tuple[ProjectRole, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_update_role_request_bean = CreateUpdateRoleRequestBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_project_role(id, swap=None):  # noqa: E501
    """Delete project role

    Deletes a project role. You must specify a replacement project role if you wish to delete a project role that is in use.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the project role to delete. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
    :type id: int
    :param swap: The ID of the project role that will replace the one being deleted.
    :type swap: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def fully_update_project_role(id, create_update_role_request_bean):  # noqa: E501
    """Fully update project role

    Updates the project role&#39;s name and description. You must include both a name and a description in the request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
    :type id: int
    :param create_update_role_request_bean: 
    :type create_update_role_request_bean: dict | bytes

    :rtype: Union[ProjectRole, Tuple[ProjectRole, int], Tuple[ProjectRole, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_update_role_request_bean = CreateUpdateRoleRequestBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_all_project_roles():  # noqa: E501
    """Get all project roles

    Gets a list of all project roles, complete with project role details and default actors.  ### About project roles ###  [Project roles](https://confluence.atlassian.com/x/3odKLg) are a flexible way to to associate users and groups with projects. In Jira Cloud, the list of project roles is shared globally with all projects, but each project can have a different set of actors associated with it (unlike groups, which have the same membership throughout all Jira applications).  Project roles are used in [permission schemes](#api-rest-api-3-permissionscheme-get), [email notification schemes](#api-rest-api-3-notificationscheme-get), [issue security levels](#api-rest-api-3-issuesecurityschemes-get), [comment visibility](#api-rest-api-3-comment-list-post), and workflow conditions.  #### Members and actors ####  In the Jira REST API, a member of a project role is called an *actor*. An *actor* is a group or user associated with a project role.  Actors may be set as [default members](https://confluence.atlassian.com/x/3odKLg#Managingprojectroles-Specifying&#39;defaultmembers&#39;foraprojectrole) of the project role or set at the project level:   *  Default actors: Users and groups that are assigned to the project role for all newly created projects. The default actors can be removed at the project level later if desired.  *  Actors: Users and groups that are associated with a project role for a project, which may differ from the default actors. This enables you to assign a user to different roles in different projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501


    :rtype: Union[List[ProjectRole], Tuple[List[ProjectRole], int], Tuple[List[ProjectRole], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_role(project_id_or_key, id, exclude_inactive_users=None):  # noqa: E501
    """Get project role for project

    Returns a project role&#39;s details and actors associated with the project. The list of actors is sorted by display name.  To check whether a user belongs to a role based on their group memberships, use [Get user](#api-rest-api-3-user-get) with the &#x60;groups&#x60; expand parameter selected. Then check whether the user keys and groups match with the actors returned for the project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param project_id_or_key: The project ID or project key (case sensitive).
    :type project_id_or_key: str
    :param id: The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
    :type id: int
    :param exclude_inactive_users: Exclude inactive users.
    :type exclude_inactive_users: bool

    :rtype: Union[ProjectRole, Tuple[ProjectRole, int], Tuple[ProjectRole, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_role_by_id(id):  # noqa: E501
    """Get project role by ID

    Gets the project role details and the default actors associated with the role. The list of default actors is sorted by display name.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
    :type id: int

    :rtype: Union[ProjectRole, Tuple[ProjectRole, int], Tuple[ProjectRole, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_role_details(project_id_or_key, current_member=None, exclude_connect_addons=None):  # noqa: E501
    """Get project role details

    Returns all [project roles](https://confluence.atlassian.com/x/3odKLg) and the details for each role. Note that the list of project roles is common to all projects.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project. # noqa: E501

    :param project_id_or_key: The project ID or project key (case sensitive).
    :type project_id_or_key: str
    :param current_member: Whether the roles should be filtered to include only those the user is assigned to.
    :type current_member: bool
    :param exclude_connect_addons: 
    :type exclude_connect_addons: bool

    :rtype: Union[List[ProjectRoleDetails], Tuple[List[ProjectRoleDetails], int], Tuple[List[ProjectRoleDetails], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_roles(project_id_or_key):  # noqa: E501
    """Get project roles for project

    Returns a list of [project roles](https://confluence.atlassian.com/x/3odKLg) for the project returning the name and self URL for each role.  Note that all project roles are shared with all projects in Jira Cloud. See [Get all project roles](#api-rest-api-3-role-get) for more information.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for any project on the site or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param project_id_or_key: The project ID or project key (case sensitive).
    :type project_id_or_key: str

    :rtype: Union[Dict[str, str], Tuple[Dict[str, str], int], Tuple[Dict[str, str], int, Dict[str, str]]
    """
    return 'do some magic!'


def partial_update_project_role(id, create_update_role_request_bean):  # noqa: E501
    """Partial update project role

    Updates either the project role&#39;s name or its description.  You cannot update both the name and description at the same time using this operation. If you send a request with a name and a description only the name is updated.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
    :type id: int
    :param create_update_role_request_bean: 
    :type create_update_role_request_bean: dict | bytes

    :rtype: Union[ProjectRole, Tuple[ProjectRole, int], Tuple[ProjectRole, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_update_role_request_bean = CreateUpdateRoleRequestBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'