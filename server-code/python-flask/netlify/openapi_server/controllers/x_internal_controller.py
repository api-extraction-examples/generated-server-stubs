import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.plugin import Plugin  # noqa: E501
from openapi_server.models.plugin_params import PluginParams  # noqa: E501
from openapi_server.models.plugin_run import PluginRun  # noqa: E501
from openapi_server.models.plugin_run_data import PluginRunData  # noqa: E501
from openapi_server import util


def create_plugin_run(deploy_id, plugin_run=None):  # noqa: E501
    """create_plugin_run

    This is an internal-only endpoint. # noqa: E501

    :param deploy_id: 
    :type deploy_id: str
    :param plugin_run: 
    :type plugin_run: dict | bytes

    :rtype: Union[PluginRun, Tuple[PluginRun, int], Tuple[PluginRun, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        plugin_run = PluginRunData.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_latest_plugin_runs(site_id, packages, state=None):  # noqa: E501
    """get_latest_plugin_runs

    This is an internal-only endpoint. # noqa: E501

    :param site_id: 
    :type site_id: str
    :param packages: 
    :type packages: List[str]
    :param state: 
    :type state: str

    :rtype: Union[List[PluginRun], Tuple[List[PluginRun], int], Tuple[List[PluginRun], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_plugin(site_id, package, plugin_params=None):  # noqa: E501
    """update_plugin

    This is an internal-only endpoint. # noqa: E501

    :param site_id: 
    :type site_id: str
    :param package: 
    :type package: str
    :param plugin_params: 
    :type plugin_params: dict | bytes

    :rtype: Union[Plugin, Tuple[Plugin, int], Tuple[Plugin, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        plugin_params = PluginParams.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
