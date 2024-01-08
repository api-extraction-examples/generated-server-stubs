import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_project_request import PostProjectRequest  # noqa: E501
from openapi_server.models.project import Project  # noqa: E501
from openapi_server.models.projects import Projects  # noqa: E501
from openapi_server import util


def delete_project(project_key):  # noqa: E501
    """Delete a project by key. Caution-- deleting a project will delete all associated environments and feature flags. You cannot delete the last project in an account.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project(project_key):  # noqa: E501
    """Fetch a single project by key.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str

    :rtype: Union[Project, Tuple[Project, int], Tuple[Project, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_projects():  # noqa: E501
    """Returns a list of all projects in the account.

     # noqa: E501


    :rtype: Union[Projects, Tuple[Projects, int], Tuple[Projects, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_project(project_key, patch_delta):  # noqa: E501
    """Modify a project by ID.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param patch_delta: Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39;
    :type patch_delta: list | bytes

    :rtype: Union[Project, Tuple[Project, int], Tuple[Project, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_delta = [PatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_project(project_body):  # noqa: E501
    """Create a new project with the given key and name.

     # noqa: E501

    :param project_body: Project keys must be unique within an account.
    :type project_body: dict | bytes

    :rtype: Union[Project, Tuple[Project, int], Tuple[Project, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        project_body = PostProjectRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
