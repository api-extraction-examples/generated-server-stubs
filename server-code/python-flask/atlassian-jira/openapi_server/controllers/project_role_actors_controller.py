import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.actor_input_bean import ActorInputBean  # noqa: E501
from openapi_server.models.actors_map import ActorsMap  # noqa: E501
from openapi_server.models.project_role import ProjectRole  # noqa: E501
from openapi_server.models.project_role_actors_update_bean import ProjectRoleActorsUpdateBean  # noqa: E501
from openapi_server import util


def add_actor_users(project_id_or_key, id, actors_map):  # noqa: E501
    """Add actors to project role

    Adds actors to a project role for the project.  To replace all actors for the project, use [Set actors for project role](#api-rest-api-3-project-projectIdOrKey-role-id-put).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param project_id_or_key: The project ID or project key (case sensitive).
    :type project_id_or_key: str
    :param id: The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
    :type id: int
    :param actors_map: The groups or users to associate with the project role for this project. Provide the user account ID, group name, or group ID. As a group&#39;s name can change, use of group ID is recommended.
    :type actors_map: dict | bytes

    :rtype: Union[ProjectRole, Tuple[ProjectRole, int], Tuple[ProjectRole, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        actors_map = ActorsMap.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_project_role_actors_to_role(id, actor_input_bean):  # noqa: E501
    """Add default actors to project role

    Adds [default actors](#api-rest-api-3-resolution-get) to a role. You may add groups or users, but you cannot add groups and users in the same request.  Changing a project role&#39;s default actors does not affect project role members for projects already created.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
    :type id: int
    :param actor_input_bean: 
    :type actor_input_bean: dict | bytes

    :rtype: Union[ProjectRole, Tuple[ProjectRole, int], Tuple[ProjectRole, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        actor_input_bean = ActorInputBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_actor(project_id_or_key, id, user=None, group=None, group_id=None):  # noqa: E501
    """Delete actors from project role

    Deletes actors from a project role for the project.  To remove default actors from the project role, use [Delete default actors from project role](#api-rest-api-3-role-id-actors-delete).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param project_id_or_key: The project ID or project key (case sensitive).
    :type project_id_or_key: str
    :param id: The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
    :type id: int
    :param user: The user account ID of the user to remove from the project role.
    :type user: str
    :param group: The name of the group to remove from the project role. This parameter cannot be used with the &#x60;groupId&#x60; parameter. As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended.
    :type group: str
    :param group_id: The ID of the group to remove from the project role. This parameter cannot be used with the &#x60;group&#x60; parameter.
    :type group_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_project_role_actors_from_role(id, user=None, group_id=None, group=None):  # noqa: E501
    """Delete default actors from project role

    Deletes the [default actors](#api-rest-api-3-resolution-get) from a project role. You may delete a group or user, but you cannot delete a group and a user in the same request.  Changing a project role&#39;s default actors does not affect project role members for projects already created.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
    :type id: int
    :param user: The user account ID of the user to remove as a default actor.
    :type user: str
    :param group_id: The group ID of the group to be removed as a default actor. This parameter cannot be used with the &#x60;group&#x60; parameter.
    :type group_id: str
    :param group: The group name of the group to be removed as a default actor.This parameter cannot be used with the &#x60;groupId&#x60; parameter. As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended.
    :type group: str

    :rtype: Union[ProjectRole, Tuple[ProjectRole, int], Tuple[ProjectRole, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_role_actors_for_role(id):  # noqa: E501
    """Get default actors for project role

    Returns the [default actors](#api-rest-api-3-resolution-get) for the project role.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
    :type id: int

    :rtype: Union[ProjectRole, Tuple[ProjectRole, int], Tuple[ProjectRole, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_actors(project_id_or_key, id, project_role_actors_update_bean):  # noqa: E501
    """Set actors for project role

    Sets the actors for a project role for a project, replacing all existing actors.  To add actors to the project without overwriting the existing list, use [Add actors to project role](#api-rest-api-3-project-projectIdOrKey-role-id-post).  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param project_id_or_key: The project ID or project key (case sensitive).
    :type project_id_or_key: str
    :param id: The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
    :type id: int
    :param project_role_actors_update_bean: The groups or users to associate with the project role for this project. Provide the user account ID, group name, or group ID. As a group&#39;s name can change, use of group ID is recommended.
    :type project_role_actors_update_bean: dict | bytes

    :rtype: Union[ProjectRole, Tuple[ProjectRole, int], Tuple[ProjectRole, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        project_role_actors_update_bean = ProjectRoleActorsUpdateBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
