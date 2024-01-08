import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.connect_modules import ConnectModules  # noqa: E501
from openapi_server.models.error_message import ErrorMessage  # noqa: E501
from openapi_server import util


def dynamic_modules_resource_get_modules_get():  # noqa: E501
    """Get modules

    Returns all modules registered dynamically by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request. # noqa: E501


    :rtype: Union[ConnectModules, Tuple[ConnectModules, int], Tuple[ConnectModules, int, Dict[str, str]]
    """
    return 'do some magic!'


def dynamic_modules_resource_register_modules_post(connect_modules):  # noqa: E501
    """Register modules

    Registers a list of modules.  **[Permissions](#permissions) required:** Only Connect apps can make this request. # noqa: E501

    :param connect_modules: 
    :type connect_modules: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        connect_modules = ConnectModules.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def dynamic_modules_resource_remove_modules_delete(module_key=None):  # noqa: E501
    """Remove modules

    Remove all or a list of modules registered by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request. # noqa: E501

    :param module_key: The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, &#x60;moduleKey&#x3D;dynamic-attachment-entity-property&amp;moduleKey&#x3D;dynamic-select-field&#x60;. Nonexistent keys are ignored.
    :type module_key: List[str]

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
