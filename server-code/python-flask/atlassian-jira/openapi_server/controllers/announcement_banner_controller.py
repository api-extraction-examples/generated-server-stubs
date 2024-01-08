import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.announcement_banner_configuration import AnnouncementBannerConfiguration  # noqa: E501
from openapi_server.models.announcement_banner_configuration_update import AnnouncementBannerConfigurationUpdate  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server import util


def get_banner():  # noqa: E501
    """Get announcement banner configuration

    Returns the current announcement banner configuration.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501


    :rtype: Union[AnnouncementBannerConfiguration, Tuple[AnnouncementBannerConfiguration, int], Tuple[AnnouncementBannerConfiguration, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_banner(announcement_banner_configuration_update):  # noqa: E501
    """Update announcement banner configuration

    Updates the announcement banner configuration.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param announcement_banner_configuration_update: 
    :type announcement_banner_configuration_update: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        announcement_banner_configuration_update = AnnouncementBannerConfigurationUpdate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
