import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.configuration_page_info import ConfigurationPageInfo  # noqa: E501
from openapi_server.models.configuration_page_type import ConfigurationPageType  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def get_configuration_pages(enable_in_main_menu=None, page_type=None):  # noqa: E501
    """Gets the configuration pages.

     # noqa: E501

    :param enable_in_main_menu: Whether to enable in the main menu.
    :type enable_in_main_menu: bool
    :param page_type: The Jellyfin.Api.Models.ConfigurationPageInfo.
    :type page_type: dict | bytes

    :rtype: Union[List[ConfigurationPageInfo], Tuple[List[ConfigurationPageInfo], int], Tuple[List[ConfigurationPageInfo], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        page_type =  ConfigurationPageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_dashboard_configuration_page(name=None):  # noqa: E501
    """Gets a dashboard configuration page.

     # noqa: E501

    :param name: The name of the page.
    :type name: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'
