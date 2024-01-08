import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.plugin_info import PluginInfo  # noqa: E501
from openapi_server.models.plugin_security_info import PluginSecurityInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.version import Version  # noqa: E501
from openapi_server import util


def disable_plugin(plugin_id, version):  # noqa: E501
    """Disable a plugin.

     # noqa: E501

    :param plugin_id: Plugin id.
    :type plugin_id: str
    :type plugin_id: str
    :param version: Plugin version.
    :type version: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        version =  Version.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def enable_plugin(plugin_id, version):  # noqa: E501
    """Enables a disabled plugin.

     # noqa: E501

    :param plugin_id: Plugin id.
    :type plugin_id: str
    :type plugin_id: str
    :param version: Plugin version.
    :type version: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        version =  Version.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_plugin_configuration(plugin_id):  # noqa: E501
    """Gets plugin configuration.

     # noqa: E501

    :param plugin_id: Plugin id.
    :type plugin_id: str
    :type plugin_id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_plugin_image(plugin_id, version):  # noqa: E501
    """Gets a plugin&#39;s image.

     # noqa: E501

    :param plugin_id: Plugin id.
    :type plugin_id: str
    :type plugin_id: str
    :param version: Plugin version.
    :type version: dict | bytes

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        version =  Version.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_plugin_manifest(plugin_id):  # noqa: E501
    """Gets a plugin&#39;s manifest.

     # noqa: E501

    :param plugin_id: Plugin id.
    :type plugin_id: str
    :type plugin_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_plugins():  # noqa: E501
    """Gets a list of currently installed plugins.

     # noqa: E501


    :rtype: Union[List[PluginInfo], Tuple[List[PluginInfo], int], Tuple[List[PluginInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def uninstall_plugin(plugin_id):  # noqa: E501
    """Uninstalls a plugin.

     # noqa: E501

    :param plugin_id: Plugin id.
    :type plugin_id: str
    :type plugin_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def uninstall_plugin_by_version(plugin_id, version):  # noqa: E501
    """Uninstalls a plugin by version.

     # noqa: E501

    :param plugin_id: Plugin id.
    :type plugin_id: str
    :type plugin_id: str
    :param version: Plugin version.
    :type version: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        version =  Version.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_plugin_configuration(plugin_id):  # noqa: E501
    """Updates plugin configuration.

    Accepts plugin configuration as JSON body. # noqa: E501

    :param plugin_id: Plugin id.
    :type plugin_id: str
    :type plugin_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_plugin_security_info(plugin_security_info):  # noqa: E501
    """Updates plugin security info.

     # noqa: E501

    :param plugin_security_info: Plugin security info.
    :type plugin_security_info: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        plugin_security_info = PluginSecurityInfo.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
