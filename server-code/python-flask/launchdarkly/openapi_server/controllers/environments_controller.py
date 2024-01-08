import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.environment import Environment  # noqa: E501
from openapi_server.models.environment_post import EnvironmentPost  # noqa: E501
from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server import util


def delete_environment(project_key, environment_key):  # noqa: E501
    """Delete an environment in a specific project.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_environment(project_key, environment_key):  # noqa: E501
    """Get an environment given a project and key.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str

    :rtype: Union[Environment, Tuple[Environment, int], Tuple[Environment, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_environment(project_key, environment_key, patch_delta):  # noqa: E501
    """Modify an environment by ID. If you try to patch the environment by setting both required and requiredApprovalTags, it will result in an error. Users can specify either required approvals for all flags in an environment or those with specific tags, but not both. Only customers on an Enterprise plan can require approval for flag updates with either mechanism.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param patch_delta: Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39;
    :type patch_delta: list | bytes

    :rtype: Union[Environment, Tuple[Environment, int], Tuple[Environment, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_delta = [PatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_environment(project_key, environment_body):  # noqa: E501
    """Create a new environment in a specified project with a given name, key, and swatch color.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_body: New environment.
    :type environment_body: dict | bytes

    :rtype: Union[Environment, Tuple[Environment, int], Tuple[Environment, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        environment_body = EnvironmentPost.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def reset_environment_mobile_key(project_key, environment_key, expiry=None):  # noqa: E501
    """Reset an environment&#39;s mobile key. The optional expiry for the old key is deprecated for this endpoint, so the old key will always expire immediately.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param expiry: The expiry parameter is deprecated for this endpoint, so the old mobile key will always expire immediately. This parameter will be removed in an upcoming major API client version.
    :type expiry: int

    :rtype: Union[Environment, Tuple[Environment, int], Tuple[Environment, int, Dict[str, str]]
    """
    return 'do some magic!'


def reset_environment_sdk_key(project_key, environment_key, expiry=None):  # noqa: E501
    """Reset an environment&#39;s SDK key with an optional expiry time for the old key.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param expiry: An expiration time for the old environment SDK key, expressed as a Unix epoch time in milliseconds. By default, the key will expire immediately.
    :type expiry: int

    :rtype: Union[Environment, Tuple[Environment, int], Tuple[Environment, int, Dict[str, str]]
    """
    return 'do some magic!'
