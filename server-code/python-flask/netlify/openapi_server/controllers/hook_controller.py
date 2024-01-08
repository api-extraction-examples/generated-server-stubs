import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.hook import Hook  # noqa: E501
from openapi_server import util


def create_hook_by_site_id(site_id, hook):  # noqa: E501
    """create_hook_by_site_id

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param hook: 
    :type hook: dict | bytes

    :rtype: Union[Hook, Tuple[Hook, int], Tuple[Hook, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        hook = Hook.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_hook(hook_id):  # noqa: E501
    """delete_hook

     # noqa: E501

    :param hook_id: 
    :type hook_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def enable_hook(hook_id):  # noqa: E501
    """enable_hook

     # noqa: E501

    :param hook_id: 
    :type hook_id: str

    :rtype: Union[Hook, Tuple[Hook, int], Tuple[Hook, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_hook(hook_id):  # noqa: E501
    """get_hook

     # noqa: E501

    :param hook_id: 
    :type hook_id: str

    :rtype: Union[Hook, Tuple[Hook, int], Tuple[Hook, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_hooks_by_site_id(site_id):  # noqa: E501
    """list_hooks_by_site_id

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[List[Hook], Tuple[List[Hook], int], Tuple[List[Hook], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_hook(hook_id, hook):  # noqa: E501
    """update_hook

     # noqa: E501

    :param hook_id: 
    :type hook_id: str
    :param hook: 
    :type hook: dict | bytes

    :rtype: Union[Hook, Tuple[Hook, int], Tuple[Hook, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        hook = Hook.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
