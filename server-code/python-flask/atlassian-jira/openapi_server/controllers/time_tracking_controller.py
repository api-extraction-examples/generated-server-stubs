import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.time_tracking_configuration import TimeTrackingConfiguration  # noqa: E501
from openapi_server.models.time_tracking_provider import TimeTrackingProvider  # noqa: E501
from openapi_server import util


def get_available_time_tracking_implementations():  # noqa: E501
    """Get all time tracking providers

    Returns all time tracking providers. By default, Jira only has one time tracking provider: *JIRA provided time tracking*. However, you can install other time tracking providers via apps from the Atlassian Marketplace. For more information on time tracking providers, see the documentation for the [ Time Tracking Provider](https://developer.atlassian.com/cloud/jira/platform/modules/time-tracking-provider/) module.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501


    :rtype: Union[List[TimeTrackingProvider], Tuple[List[TimeTrackingProvider], int], Tuple[List[TimeTrackingProvider], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_selected_time_tracking_implementation():  # noqa: E501
    """Get selected time tracking provider

    Returns the time tracking provider that is currently selected. Note that if time tracking is disabled, then a successful but empty response is returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501


    :rtype: Union[TimeTrackingProvider, Tuple[TimeTrackingProvider, int], Tuple[TimeTrackingProvider, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_shared_time_tracking_configuration():  # noqa: E501
    """Get time tracking settings

    Returns the time tracking settings. This includes settings such as the time format, default time unit, and others. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501


    :rtype: Union[TimeTrackingConfiguration, Tuple[TimeTrackingConfiguration, int], Tuple[TimeTrackingConfiguration, int, Dict[str, str]]
    """
    return 'do some magic!'


def select_time_tracking_implementation(time_tracking_provider):  # noqa: E501
    """Select time tracking provider

    Selects a time tracking provider.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param time_tracking_provider: 
    :type time_tracking_provider: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        time_tracking_provider = TimeTrackingProvider.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_shared_time_tracking_configuration(time_tracking_configuration):  # noqa: E501
    """Set time tracking settings

    Sets the time tracking settings.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param time_tracking_configuration: 
    :type time_tracking_configuration: dict | bytes

    :rtype: Union[TimeTrackingConfiguration, Tuple[TimeTrackingConfiguration, int], Tuple[TimeTrackingConfiguration, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        time_tracking_configuration = TimeTrackingConfiguration.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
