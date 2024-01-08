import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.build_hook import BuildHook  # noqa: E501
from openapi_server.models.build_hook_setup import BuildHookSetup  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def create_site_build_hook(site_id, build_hook):  # noqa: E501
    """create_site_build_hook

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param build_hook: 
    :type build_hook: dict | bytes

    :rtype: Union[BuildHook, Tuple[BuildHook, int], Tuple[BuildHook, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        build_hook = BuildHookSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_site_build_hook(site_id, id):  # noqa: E501
    """delete_site_build_hook

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param id: 
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_site_build_hook(site_id, id):  # noqa: E501
    """get_site_build_hook

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param id: 
    :type id: str

    :rtype: Union[BuildHook, Tuple[BuildHook, int], Tuple[BuildHook, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_site_build_hooks(site_id):  # noqa: E501
    """list_site_build_hooks

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[List[BuildHook], Tuple[List[BuildHook], int], Tuple[List[BuildHook], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_site_build_hook(site_id, id, build_hook):  # noqa: E501
    """update_site_build_hook

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param id: 
    :type id: str
    :param build_hook: 
    :type build_hook: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        build_hook = BuildHookSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
